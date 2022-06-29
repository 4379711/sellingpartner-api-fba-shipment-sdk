package com.example.model.inbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(IntendedBoxContentsSource.Adapter.class)
public enum IntendedBoxContentsSource {
    NONE("NONE"),
    FEED("FEED"),
    _2D_BARCODE("2D_BARCODE");

    private final String value;

    IntendedBoxContentsSource(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IntendedBoxContentsSource fromValue(String text) {
        for (IntendedBoxContentsSource b : IntendedBoxContentsSource.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<IntendedBoxContentsSource> {
        @Override
        public void write(final JsonWriter jsonWriter, final IntendedBoxContentsSource enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public IntendedBoxContentsSource read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return IntendedBoxContentsSource.fromValue(String.valueOf(value));
        }
    }
}
