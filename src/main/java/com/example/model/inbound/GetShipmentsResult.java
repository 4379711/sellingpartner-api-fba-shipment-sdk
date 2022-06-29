package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class GetShipmentsResult {
    @SerializedName("ShipmentData")
    private InboundShipmentList shipmentData = null;

    @SerializedName("NextToken")
    private String nextToken = null;

    public GetShipmentsResult shipmentData(InboundShipmentList shipmentData) {
        this.shipmentData = shipmentData;
        return this;
    }

    /**
     * Get shipmentData
     *
     * @return shipmentData
     **/
    public InboundShipmentList getShipmentData() {
        return shipmentData;
    }

    public void setShipmentData(InboundShipmentList shipmentData) {
        this.shipmentData = shipmentData;
    }

    public GetShipmentsResult nextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * When present and not empty, pass this string token in the next request to return the next response page.
     *
     * @return nextToken
     **/
    public String getNextToken() {
        return nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetShipmentsResult getShipmentsResult = (GetShipmentsResult) o;
        return Objects.equals(this.shipmentData, getShipmentsResult.shipmentData) &&
                Objects.equals(this.nextToken, getShipmentsResult.nextToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipmentData, nextToken);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetShipmentsResult {\n");

        sb.append("    shipmentData: ").append(toIndentedString(shipmentData)).append("\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
