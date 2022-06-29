package com.example.model.inbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(InboundGuidance.Adapter.class)
public enum InboundGuidance {
    INBOUNDNOTRECOMMENDED("InboundNotRecommended"),
    INBOUNDOK("InboundOK");

    private final String value;

    InboundGuidance(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static InboundGuidance fromValue(String text) {
        for (InboundGuidance b : InboundGuidance.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<InboundGuidance> {
        @Override
        public void write(final JsonWriter jsonWriter, final InboundGuidance enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public InboundGuidance read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return InboundGuidance.fromValue(String.valueOf(value));
        }
    }
}
