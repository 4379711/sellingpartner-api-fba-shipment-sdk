package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class InvalidSKU {
    @SerializedName("SellerSKU")
    private String sellerSKU = null;

    @SerializedName("ErrorReason")
    private ErrorReason errorReason = null;

    public InvalidSKU sellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * The seller SKU of the item.
     *
     * @return sellerSKU
     **/
    public String getSellerSKU() {
        return sellerSKU;
    }

    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    public InvalidSKU errorReason(ErrorReason errorReason) {
        this.errorReason = errorReason;
        return this;
    }

    /**
     * Get errorReason
     *
     * @return errorReason
     **/
    public ErrorReason getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(ErrorReason errorReason) {
        this.errorReason = errorReason;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvalidSKU invalidSKU = (InvalidSKU) o;
        return Objects.equals(this.sellerSKU, invalidSKU.sellerSKU) &&
                Objects.equals(this.errorReason, invalidSKU.errorReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerSKU, errorReason);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvalidSKU {\n");

        sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
        sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
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
