package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class AmazonPrepFeesDetails {
    @SerializedName("PrepInstruction")
    private PrepInstruction prepInstruction = null;

    @SerializedName("FeePerUnit")
    private Amount feePerUnit = null;

    public AmazonPrepFeesDetails prepInstruction(PrepInstruction prepInstruction) {
        this.prepInstruction = prepInstruction;
        return this;
    }

    /**
     * Get prepInstruction
     *
     * @return prepInstruction
     **/
    public PrepInstruction getPrepInstruction() {
        return prepInstruction;
    }

    public void setPrepInstruction(PrepInstruction prepInstruction) {
        this.prepInstruction = prepInstruction;
    }

    public AmazonPrepFeesDetails feePerUnit(Amount feePerUnit) {
        this.feePerUnit = feePerUnit;
        return this;
    }

    /**
     * Get feePerUnit
     *
     * @return feePerUnit
     **/
    public Amount getFeePerUnit() {
        return feePerUnit;
    }

    public void setFeePerUnit(Amount feePerUnit) {
        this.feePerUnit = feePerUnit;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AmazonPrepFeesDetails amazonPrepFeesDetails = (AmazonPrepFeesDetails) o;
        return Objects.equals(this.prepInstruction, amazonPrepFeesDetails.prepInstruction) &&
                Objects.equals(this.feePerUnit, amazonPrepFeesDetails.feePerUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prepInstruction, feePerUnit);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AmazonPrepFeesDetails {\n");

        sb.append("    prepInstruction: ").append(toIndentedString(prepInstruction)).append("\n");
        sb.append("    feePerUnit: ").append(toIndentedString(feePerUnit)).append("\n");
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
