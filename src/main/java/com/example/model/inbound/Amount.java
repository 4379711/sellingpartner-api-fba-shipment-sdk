package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class Amount {
    @SerializedName("CurrencyCode")
    private CurrencyCode currencyCode = null;

    @SerializedName("Value")
    private Double value = null;

    public Amount currencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Get currencyCode
     *
     * @return currencyCode
     **/
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Amount value(Double value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     **/
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Amount amount = (Amount) o;
        return Objects.equals(this.currencyCode, amount.currencyCode) &&
                Objects.equals(this.value, amount.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Amount {\n");

        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
