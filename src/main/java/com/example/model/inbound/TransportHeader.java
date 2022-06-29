package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class TransportHeader {
    @SerializedName("SellerId")
    private String sellerId = null;

    @SerializedName("ShipmentId")
    private String shipmentId = null;

    @SerializedName("IsPartnered")
    private Boolean isPartnered = null;

    @SerializedName("ShipmentType")
    private ShipmentType shipmentType = null;

    public TransportHeader sellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * The Amazon seller identifier.
     *
     * @return sellerId
     **/
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public TransportHeader shipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * A shipment identifier originally returned by the createInboundShipmentPlan operation.
     *
     * @return shipmentId
     **/
    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public TransportHeader isPartnered(Boolean isPartnered) {
        this.isPartnered = isPartnered;
        return this;
    }

    /**
     * Indicates whether a putTransportDetails request is for a partnered carrier.  Possible values:  * true – Request is for an Amazon-partnered carrier.  * false – Request is for a non-Amazon-partnered carrier.
     *
     * @return isPartnered
     **/
    public Boolean isIsPartnered() {
        return isPartnered;
    }

    public void setIsPartnered(Boolean isPartnered) {
        this.isPartnered = isPartnered;
    }

    public TransportHeader shipmentType(ShipmentType shipmentType) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransportHeader transportHeader = (TransportHeader) o;
        return Objects.equals(this.sellerId, transportHeader.sellerId) &&
                Objects.equals(this.shipmentId, transportHeader.shipmentId) &&
                Objects.equals(this.isPartnered, transportHeader.isPartnered) &&
                Objects.equals(this.shipmentType, transportHeader.shipmentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerId, shipmentId, isPartnered, shipmentType);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransportHeader {\n");

        sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
        sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
        sb.append("    isPartnered: ").append(toIndentedString(isPartnered)).append("\n");
        sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
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
