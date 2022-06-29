package com.example.model.inbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(BarcodeInstruction.Adapter.class)
public enum BarcodeInstruction {
    REQUIRESFNSKULABEL("RequiresFNSKULabel"),
    CANUSEORIGINALBARCODE("CanUseOriginalBarcode"),
    MUSTPROVIDESELLERSKU("MustProvideSellerSKU");

    private final String value;

    BarcodeInstruction(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BarcodeInstruction fromValue(String text) {
        for (BarcodeInstruction b : BarcodeInstruction.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<BarcodeInstruction> {
        @Override
        public void write(final JsonWriter jsonWriter, final BarcodeInstruction enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BarcodeInstruction read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return BarcodeInstruction.fromValue(String.valueOf(value));
        }
    }
}
