package com.example.model.inbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(TransportStatus.Adapter.class)
public enum TransportStatus {
    WORKING("WORKING"),
    ESTIMATING("ESTIMATING"),
    ESTIMATED("ESTIMATED"),
    ERROR_ON_ESTIMATING("ERROR_ON_ESTIMATING"),
    CONFIRMING("CONFIRMING"),
    CONFIRMED("CONFIRMED"),
    ERROR_ON_CONFIRMING("ERROR_ON_CONFIRMING"),
    VOIDING("VOIDING"),
    VOIDED("VOIDED"),
    ERROR_IN_VOIDING("ERROR_IN_VOIDING"),
    ERROR("ERROR");

    private final String value;

    TransportStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TransportStatus fromValue(String text) {
        for (TransportStatus b : TransportStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<TransportStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final TransportStatus enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public TransportStatus read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return TransportStatus.fromValue(String.valueOf(value));
        }
    }
}
