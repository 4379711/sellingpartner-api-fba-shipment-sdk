package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class Weight {
    @SerializedName("Value")
    private Double value = null;

    @SerializedName("Unit")
    private UnitOfWeight unit = null;

    public Weight value(Double value) {
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

    public Weight unit(UnitOfWeight unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get unit
     *
     * @return unit
     **/
    public UnitOfWeight getUnit() {
        return unit;
    }

    public void setUnit(UnitOfWeight unit) {
        this.unit = unit;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Weight weight = (Weight) o;
        return Objects.equals(this.value, weight.value) &&
                Objects.equals(this.unit, weight.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Weight {\n");

        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
