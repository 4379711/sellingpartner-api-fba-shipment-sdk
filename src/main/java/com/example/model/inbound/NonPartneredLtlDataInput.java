package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class NonPartneredLtlDataInput {
    @SerializedName("CarrierName")
    private String carrierName = null;

    @SerializedName("ProNumber")
    private String proNumber = null;

    public NonPartneredLtlDataInput carrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * The carrier that you are using for the inbound shipment.
     *
     * @return carrierName
     **/
    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public NonPartneredLtlDataInput proNumber(String proNumber) {
        this.proNumber = proNumber;
        return this;
    }

    /**
     * Get proNumber
     *
     * @return proNumber
     **/
    public String getProNumber() {
        return proNumber;
    }

    public void setProNumber(String proNumber) {
        this.proNumber = proNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NonPartneredLtlDataInput nonPartneredLtlDataInput = (NonPartneredLtlDataInput) o;
        return Objects.equals(this.carrierName, nonPartneredLtlDataInput.carrierName) &&
                Objects.equals(this.proNumber, nonPartneredLtlDataInput.proNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrierName, proNumber);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NonPartneredLtlDataInput {\n");

        sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
        sb.append("    proNumber: ").append(toIndentedString(proNumber)).append("\n");
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
