package com.example.model.inbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(ShipmentType.Adapter.class)
public enum ShipmentType {
    SP("SP"),
    LTL("LTL");

    private final String value;

    ShipmentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ShipmentType fromValue(String text) {
        for (ShipmentType b : ShipmentType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<ShipmentType> {
        @Override
        public void write(final JsonWriter jsonWriter, final ShipmentType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ShipmentType read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return ShipmentType.fromValue(String.valueOf(value));
        }
    }
}
