package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class TransportDetailInput {
    @SerializedName("PartneredSmallParcelData")
    private PartneredSmallParcelDataInput partneredSmallParcelData = null;

    @SerializedName("NonPartneredSmallParcelData")
    private NonPartneredSmallParcelDataInput nonPartneredSmallParcelData = null;

    @SerializedName("PartneredLtlData")
    private PartneredLtlDataInput partneredLtlData = null;

    @SerializedName("NonPartneredLtlData")
    private NonPartneredLtlDataInput nonPartneredLtlData = null;

    public TransportDetailInput partneredSmallParcelData(PartneredSmallParcelDataInput partneredSmallParcelData) {
        this.partneredSmallParcelData = partneredSmallParcelData;
        return this;
    }

    /**
     * Get partneredSmallParcelData
     *
     * @return partneredSmallParcelData
     **/
    public PartneredSmallParcelDataInput getPartneredSmallParcelData() {
        return partneredSmallParcelData;
    }

    public void setPartneredSmallParcelData(PartneredSmallParcelDataInput partneredSmallParcelData) {
        this.partneredSmallParcelData = partneredSmallParcelData;
    }

    public TransportDetailInput nonPartneredSmallParcelData(NonPartneredSmallParcelDataInput nonPartneredSmallParcelData) {
        this.nonPartneredSmallParcelData = nonPartneredSmallParcelData;
        return this;
    }

    /**
     * Get nonPartneredSmallParcelData
     *
     * @return nonPartneredSmallParcelData
     **/
    public NonPartneredSmallParcelDataInput getNonPartneredSmallParcelData() {
        return nonPartneredSmallParcelData;
    }

    public void setNonPartneredSmallParcelData(NonPartneredSmallParcelDataInput nonPartneredSmallParcelData) {
        this.nonPartneredSmallParcelData = nonPartneredSmallParcelData;
    }

    public TransportDetailInput partneredLtlData(PartneredLtlDataInput partneredLtlData) {
        this.partneredLtlData = partneredLtlData;
        return this;
    }

    /**
     * Get partneredLtlData
     *
     * @return partneredLtlData
     **/
    public PartneredLtlDataInput getPartneredLtlData() {
        return partneredLtlData;
    }

    public void setPartneredLtlData(PartneredLtlDataInput partneredLtlData) {
        this.partneredLtlData = partneredLtlData;
    }

    public TransportDetailInput nonPartneredLtlData(NonPartneredLtlDataInput nonPartneredLtlData) {
        this.nonPartneredLtlData = nonPartneredLtlData;
        return this;
    }

    /**
     * Get nonPartneredLtlData
     *
     * @return nonPartneredLtlData
     **/
    public NonPartneredLtlDataInput getNonPartneredLtlData() {
        return nonPartneredLtlData;
    }

    public void setNonPartneredLtlData(NonPartneredLtlDataInput nonPartneredLtlData) {
        this.nonPartneredLtlData = nonPartneredLtlData;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransportDetailInput transportDetailInput = (TransportDetailInput) o;
        return Objects.equals(this.partneredSmallParcelData, transportDetailInput.partneredSmallParcelData) &&
                Objects.equals(this.nonPartneredSmallParcelData, transportDetailInput.nonPartneredSmallParcelData) &&
                Objects.equals(this.partneredLtlData, transportDetailInput.partneredLtlData) &&
                Objects.equals(this.nonPartneredLtlData, transportDetailInput.nonPartneredLtlData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partneredSmallParcelData, nonPartneredSmallParcelData, partneredLtlData, nonPartneredLtlData);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransportDetailInput {\n");

        sb.append("    partneredSmallParcelData: ").append(toIndentedString(partneredSmallParcelData)).append("\n");
        sb.append("    nonPartneredSmallParcelData: ").append(toIndentedString(nonPartneredSmallParcelData)).append("\n");
        sb.append("    partneredLtlData: ").append(toIndentedString(partneredLtlData)).append("\n");
        sb.append("    nonPartneredLtlData: ").append(toIndentedString(nonPartneredLtlData)).append("\n");
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
