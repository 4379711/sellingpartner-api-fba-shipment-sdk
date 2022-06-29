package com.example.model.feed;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Objects;


public class FeedDocument {
    @SerializedName("feedDocumentId")
    private String feedDocumentId = null;

    @SerializedName("url")
    private String url = null;

    @JsonAdapter(CompressionAlgorithmEnum.Adapter.class)
    public enum CompressionAlgorithmEnum {
        GZIP("GZIP");

        private final String value;

        CompressionAlgorithmEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CompressionAlgorithmEnum fromValue(String text) {
            for (CompressionAlgorithmEnum b : CompressionAlgorithmEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<CompressionAlgorithmEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CompressionAlgorithmEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CompressionAlgorithmEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return CompressionAlgorithmEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("compressionAlgorithm")
    private CompressionAlgorithmEnum compressionAlgorithm = null;

    public FeedDocument feedDocumentId(String feedDocumentId) {
        this.feedDocumentId = feedDocumentId;
        return this;
    }

    /**
     * The identifier for the feed document. This identifier is unique only in combination with a seller ID.
     *
     * @return feedDocumentId
     **/
    public String getFeedDocumentId() {
        return feedDocumentId;
    }

    public void setFeedDocumentId(String feedDocumentId) {
        this.feedDocumentId = feedDocumentId;
    }

    public FeedDocument url(String url) {
        this.url = url;
        return this;
    }

    /**
     * A presigned URL for the feed document. This URL expires after 5 minutes.
     *
     * @return url
     **/
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public FeedDocument compressionAlgorithm(CompressionAlgorithmEnum compressionAlgorithm) {
        this.compressionAlgorithm = compressionAlgorithm;
        return this;
    }

    /**
     * If present, the feed document contents are compressed using the indicated algorithm.
     *
     * @return compressionAlgorithm
     **/
    public CompressionAlgorithmEnum getCompressionAlgorithm() {
        return compressionAlgorithm;
    }

    public void setCompressionAlgorithm(CompressionAlgorithmEnum compressionAlgorithm) {
        this.compressionAlgorithm = compressionAlgorithm;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeedDocument feedDocument = (FeedDocument) o;
        return Objects.equals(this.feedDocumentId, feedDocument.feedDocumentId) &&
                Objects.equals(this.url, feedDocument.url) &&
                Objects.equals(this.compressionAlgorithm, feedDocument.compressionAlgorithm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedDocumentId, url, compressionAlgorithm);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedDocument {\n");

        sb.append("    feedDocumentId: ").append(toIndentedString(feedDocumentId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    compressionAlgorithm: ").append(toIndentedString(compressionAlgorithm)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
