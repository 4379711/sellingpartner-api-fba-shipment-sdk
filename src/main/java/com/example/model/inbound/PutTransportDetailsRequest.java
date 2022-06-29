package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class PutTransportDetailsRequest {
    @SerializedName("IsPartnered")
    private Boolean isPartnered = null;

    @SerializedName("ShipmentType")
    private ShipmentType shipmentType = null;

    @SerializedName("TransportDetails")
    private TransportDetailInput transportDetails = null;

    public PutTransportDetailsRequest isPartnered(Boolean isPartnered) {
        this.isPartnered = isPartnered;
        return this;
    }

    /**
     * Indicates whether a putTransportDetails request is for an Amazon-partnered carrier.
     *
     * @return isPartnered
     **/
    public Boolean isIsPartnered() {
        return isPartnered;
    }

    public void setIsPartnered(Boolean isPartnered) {
        this.isPartnered = isPartnered;
    }

    public PutTransportDetailsRequest shipmentType(ShipmentType shipmentType) {
        this.shipmentType = shipmentType;
        return this;
    }

    /**
     * Get shipmentType
     *
     * @return shipmentType
     **/
    public ShipmentType getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(ShipmentType shipmentType) {
        this.shipmentType = shipmentType;
    }

    public PutTransportDetailsRequest transportDetails(TransportDetailInput transportDetails) {
        this.transportDetails = transportDetails;
        return this;
    }

    /**
     * Get transportDetails
     *
     * @return transportDetails
     **/
    public TransportDetailInput getTransportDetails() {
        return transportDetails;
    }

    public void setTransportDetails(TransportDetailInput transportDetails) {
        this.transportDetails = transportDetails;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutTransportDetailsRequest putTransportDetailsRequest = (PutTransportDetailsRequest) o;
        return Objects.equals(this.isPartnered, putTransportDetailsRequest.isPartnered) &&
                Objects.equals(this.shipmentType, putTransportDetailsRequest.shipmentType) &&
                Objects.equals(this.transportDetails, putTransportDetailsRequest.transportDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPartnered, shipmentType, transportDetails);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutTransportDetailsRequest {\n");

        sb.append("    isPartnered: ").append(toIndentedString(isPartnered)).append("\n");
        sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
        sb.append("    transportDetails: ").append(toIndentedString(transportDetails)).append("\n");
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
