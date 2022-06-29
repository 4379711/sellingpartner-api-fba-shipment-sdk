package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class Pallet {
    @SerializedName("Dimensions")
    private Dimensions dimensions = null;

    @SerializedName("Weight")
    private Weight weight = null;

    @SerializedName("IsStacked")
    private Boolean isStacked = null;

    public Pallet dimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get dimensions
     *
     * @return dimensions
     **/
    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Pallet weight(Weight weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get weight
     *
     * @return weight
     **/
    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public Pallet isStacked(Boolean isStacked) {
        this.isStacked = isStacked;
        return this;
    }

    /**
     * Indicates whether pallets will be stacked when carrier arrives for pick-up.
     *
     * @return isStacked
     **/
    public Boolean isIsStacked() {
        return isStacked;
    }

    public void setIsStacked(Boolean isStacked) {
        this.isStacked = isStacked;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pallet pallet = (Pallet) o;
        return Objects.equals(this.dimensions, pallet.dimensions) &&
                Objects.equals(this.weight, pallet.weight) &&
                Objects.equals(this.isStacked, pallet.isStacked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensions, weight, isStacked);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pallet {\n");

        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    isStacked: ").append(toIndentedString(isStacked)).append("\n");
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
