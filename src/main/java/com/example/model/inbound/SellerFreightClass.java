package com.example.model.inbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(SellerFreightClass.Adapter.class)
public enum SellerFreightClass {
    _50("50"),
    _55("55"),
    _60("60"),
    _65("65"),
    _70("70"),
    _77_5("77.5"),
    _85("85"),
    _92_5("92.5"),
    _100("100"),
    _110("110"),
    _125("125"),
    _150("150"),
    _175("175"),
    _200("200"),
    _250("250"),
    _300("300"),
    _400("400"),
    _500("500");

    private final String value;

    SellerFreightClass(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SellerFreightClass fromValue(String text) {
        for (SellerFreightClass b : SellerFreightClass.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<SellerFreightClass> {
        @Override
        public void write(final JsonWriter jsonWriter, final SellerFreightClass enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SellerFreightClass read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return SellerFreightClass.fromValue(String.valueOf(value));
        }
    }
}
