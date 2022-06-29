package com.example.model.inbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(GuidanceReason.Adapter.class)
public enum GuidanceReason {
    SLOWMOVINGASIN("SlowMovingASIN"),
    NOAPPLICABLEGUIDANCE("NoApplicableGuidance");

    private final String value;

    GuidanceReason(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GuidanceReason fromValue(String text) {
        for (GuidanceReason b : GuidanceReason.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<GuidanceReason> {
        @Override
        public void write(final JsonWriter jsonWriter, final GuidanceReason enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public GuidanceReason read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return GuidanceReason.fromValue(String.valueOf(value));
        }
    }
}
