package com.example.model.inbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(BoxContentsSource.Adapter.class)
public enum BoxContentsSource {
    NONE("NONE"),
    FEED("FEED"),
    _2D_BARCODE("2D_BARCODE"),
    INTERACTIVE("INTERACTIVE");

    private final String value;

    BoxContentsSource(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BoxContentsSource fromValue(String text) {
        for (BoxContentsSource b : BoxContentsSource.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<BoxContentsSource> {
        @Override
        public void write(final JsonWriter jsonWriter, final BoxContentsSource enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BoxContentsSource read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return BoxContentsSource.fromValue(String.valueOf(value));
        }
    }
}
