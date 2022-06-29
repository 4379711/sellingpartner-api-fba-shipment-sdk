package com.example.model.inbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(LabelPrepPreference.Adapter.class)
public enum LabelPrepPreference {
    SELLER_LABEL("SELLER_LABEL"),
    AMAZON_LABEL_ONLY("AMAZON_LABEL_ONLY"),
    AMAZON_LABEL_PREFERRED("AMAZON_LABEL_PREFERRED");

    private final String value;

    LabelPrepPreference(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LabelPrepPreference fromValue(String text) {
        for (LabelPrepPreference b : LabelPrepPreference.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<LabelPrepPreference> {
        @Override
        public void write(final JsonWriter jsonWriter, final LabelPrepPreference enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public LabelPrepPreference read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return LabelPrepPreference.fromValue(String.valueOf(value));
        }
    }
}
