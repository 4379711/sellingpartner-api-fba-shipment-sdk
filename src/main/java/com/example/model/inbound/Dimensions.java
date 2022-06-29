package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class Dimensions {
    @SerializedName("Length")
    private Double length = null;

    @SerializedName("Width")
    private Double width = null;

    @SerializedName("Height")
    private Double height = null;

    @SerializedName("Unit")
    private UnitOfMeasurement unit = null;

    public Dimensions length(Double length) {
        this.length = length;
        return this;
    }

    /**
     * Get length
     *
     * @return length
     **/
    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Dimensions width(Double width) {
        this.width = width;
        return this;
    }

    /**
     * Get width
     *
     * @return width
     **/
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Dimensions height(Double height) {
        this.height = height;
        return this;
    }

    /**
     * Get height
     *
     * @return height
     **/
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Dimensions unit(UnitOfMeasurement unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get unit
     *
     * @return unit
     **/
    public UnitOfMeasurement getUnit() {
        return unit;
    }

    public void setUnit(UnitOfMeasurement unit) {
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
        Dimensions dimensions = (Dimensions) o;
        return Objects.equals(this.length, dimensions.length) &&
                Objects.equals(this.width, dimensions.width) &&
                Objects.equals(this.height, dimensions.height) &&
                Objects.equals(this.unit, dimensions.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, height, unit);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dimensions {\n");

        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
