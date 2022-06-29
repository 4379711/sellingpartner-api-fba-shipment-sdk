package com.example.model.inbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(CurrencyCode.Adapter.class)
public enum CurrencyCode {
    USD("USD"),
    GBP("GBP");

    private final String value;

    CurrencyCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CurrencyCode fromValue(String text) {
        for (CurrencyCode b : CurrencyCode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<CurrencyCode> {
        @Override
        public void write(final JsonWriter jsonWriter, final CurrencyCode enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public CurrencyCode read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return CurrencyCode.fromValue(String.valueOf(value));
        }
    }
}
