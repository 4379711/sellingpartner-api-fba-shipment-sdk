package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class PartneredSmallParcelPackageInput {
    @SerializedName("Dimensions")
    private Dimensions dimensions = null;

    @SerializedName("Weight")
    private Weight weight = null;

    public PartneredSmallParcelPackageInput dimensions(Dimensions dimensions) {
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

    public PartneredSmallParcelPackageInput weight(Weight weight) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PartneredSmallParcelPackageInput partneredSmallParcelPackageInput = (PartneredSmallParcelPackageInput) o;
        return Objects.equals(this.dimensions, partneredSmallParcelPackageInput.dimensions) &&
                Objects.equals(this.weight, partneredSmallParcelPackageInput.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensions, weight);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartneredSmallParcelPackageInput {\n");

        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
