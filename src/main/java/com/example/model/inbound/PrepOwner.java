package com.example.model.inbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(PrepOwner.Adapter.class)
public enum PrepOwner {
    AMAZON("AMAZON"),
    SELLER("SELLER");

    private final String value;

    PrepOwner(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PrepOwner fromValue(String text) {
        for (PrepOwner b : PrepOwner.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<PrepOwner> {
        @Override
        public void write(final JsonWriter jsonWriter, final PrepOwner enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PrepOwner read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return PrepOwner.fromValue(String.valueOf(value));
        }
    }
}
