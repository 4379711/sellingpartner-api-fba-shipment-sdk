package com.example.model.inbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(PackageStatus.Adapter.class)
public enum PackageStatus {
    SHIPPED("SHIPPED"),
    IN_TRANSIT("IN_TRANSIT"),
    DELIVERED("DELIVERED"),
    CHECKED_IN("CHECKED_IN"),
    RECEIVING("RECEIVING"),
    CLOSED("CLOSED"),
    DELETED("DELETED");

    private final String value;

    PackageStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PackageStatus fromValue(String text) {
        for (PackageStatus b : PackageStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<PackageStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final PackageStatus enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PackageStatus read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return PackageStatus.fromValue(String.valueOf(value));
        }
    }
}
