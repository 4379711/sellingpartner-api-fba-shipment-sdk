package com.example.documents;

import com.squareup.okhttp.*;

import java.io.*;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;

/**
 * @author YaLong
 */
public class FileHelper {
    public static void upload(byte[] source, String url, String contentType) {
        OkHttpClient client = new OkHttpClient();
        try {
            Request request = new Request.Builder()
                    .url(url)
                    .put(RequestBody.create(MediaType.parse(contentType), source))
                    .build();
            Response response = client.newCall(request).execute();
            System.out.println("上传结果:" + response.message());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void download(String url, String compressionAlgorithm) throws IOException, IllegalArgumentException {
        OkHttpClient httpclient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        Response response = httpclient.newCall(request).execute();
        if (!response.isSuccessful()) {
            System.out.println(
                    String.format("Call to download content was unsuccessful with response code: %d and message: %s",
                            response.code(), response.message()));
            return;
        }

        try (ResponseBody responseBody = response.body()) {
            MediaType mediaType = MediaType.parse(response.header("Content-Type"));
            Charset charset = mediaType.charset();
            if (charset == null) {
                throw new IllegalArgumentException(String.format(
                        "Could not parse character set from '%s'", mediaType));
            }

            Closeable closeThis = null;
            try {
                InputStream inputStream = responseBody.byteStream();
                closeThis = inputStream;

                if ("GZIP".equals(compressionAlgorithm)) {
                    inputStream = new GZIPInputStream(inputStream);
                    closeThis = inputStream;
                }

                // This example assumes that the download content has a charset in the content-type header, e.g.
                // text/plain; charset=UTF-8
                if ("text".equals(mediaType.type()) && "plain".equals(mediaType.subtype())) {
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
                    closeThis = inputStreamReader;

                    BufferedReader reader = new BufferedReader(inputStreamReader);
                    closeThis = reader;

                    String line;
                    do {
                        line = reader.readLine();
                        // Process line by line.
                    } while (line != null);
                } else {
                    //Handle content with binary data/other media types here.
                }
            } finally {
                if (closeThis != null) {
                    closeThis.close();
                }
            }
        }
    }
}
