package com.example.model.inbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(ShipmentStatus.Adapter.class)
public enum ShipmentStatus {
    WORKING("WORKING"),
    SHIPPED("SHIPPED"),
    RECEIVING("RECEIVING"),
    CANCELLED("CANCELLED"),
    DELETED("DELETED"),
    CLOSED("CLOSED"),
    ERROR("ERROR"),
    IN_TRANSIT("IN_TRANSIT"),
    DELIVERED("DELIVERED"),
    CHECKED_IN("CHECKED_IN");

    private final String value;

    ShipmentStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ShipmentStatus fromValue(String text) {
        for (ShipmentStatus b : ShipmentStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<ShipmentStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final ShipmentStatus enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ShipmentStatus read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return ShipmentStatus.fromValue(String.valueOf(value));
        }
    }
}
