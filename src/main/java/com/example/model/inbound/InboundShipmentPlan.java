package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class InboundShipmentPlan {
    @SerializedName("ShipmentId")
    private String shipmentId = null;

    @SerializedName("DestinationFulfillmentCenterId")
    private String destinationFulfillmentCenterId = null;

    @SerializedName("ShipToAddress")
    private Address shipToAddress = null;

    @SerializedName("LabelPrepType")
    private LabelPrepType labelPrepType = null;

    @SerializedName("Items")
    private InboundShipmentPlanItemList items = null;

    @SerializedName("EstimatedBoxContentsFee")
    private BoxContentsFeeDetails estimatedBoxContentsFee = null;

    public InboundShipmentPlan shipmentId(String shipmentId) {
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

    public InboundShipmentPlan destinationFulfillmentCenterId(String destinationFulfillmentCenterId) {
        this.destinationFulfillmentCenterId = destinationFulfillmentCenterId;
        return this;
    }

    /**
     * An Amazon fulfillment center identifier created by Amazon.
     *
     * @return destinationFulfillmentCenterId
     **/
    public String getDestinationFulfillmentCenterId() {
        return destinationFulfillmentCenterId;
    }

    public void setDestinationFulfillmentCenterId(String destinationFulfillmentCenterId) {
        this.destinationFulfillmentCenterId = destinationFulfillmentCenterId;
    }

    public InboundShipmentPlan shipToAddress(Address shipToAddress) {
        this.shipToAddress = shipToAddress;
        return this;
    }

    /**
     * Get shipToAddress
     *
     * @return shipToAddress
     **/
    public Address getShipToAddress() {
        return shipToAddress;
    }

    public void setShipToAddress(Address shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    public InboundShipmentPlan labelPrepType(LabelPrepType labelPrepType) {
        this.labelPrepType = labelPrepType;
        return this;
    }

    /**
     * Get labelPrepType
     *
     * @return labelPrepType
     **/
    public LabelPrepType getLabelPrepType() {
        return labelPrepType;
    }

    public void setLabelPrepType(LabelPrepType labelPrepType) {
        this.labelPrepType = labelPrepType;
    }

    public InboundShipmentPlan items(InboundShipmentPlanItemList items) {
        this.items = items;
        return this;
    }

    /**
     * Get items
     *
     * @return items
     **/
    public InboundShipmentPlanItemList getItems() {
        return items;
    }

    public void setItems(InboundShipmentPlanItemList items) {
        this.items = items;
    }

    public InboundShipmentPlan estimatedBoxContentsFee(BoxContentsFeeDetails estimatedBoxContentsFee) {
        this.estimatedBoxContentsFee = estimatedBoxContentsFee;
        return this;
    }

    /**
     * Get estimatedBoxContentsFee
     *
     * @return estimatedBoxContentsFee
     **/
    public BoxContentsFeeDetails getEstimatedBoxContentsFee() {
        return estimatedBoxContentsFee;
    }

    public void setEstimatedBoxContentsFee(BoxContentsFeeDetails estimatedBoxContentsFee) {
        this.estimatedBoxContentsFee = estimatedBoxContentsFee;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InboundShipmentPlan inboundShipmentPlan = (InboundShipmentPlan) o;
        return Objects.equals(this.shipmentId, inboundShipmentPlan.shipmentId) &&
                Objects.equals(this.destinationFulfillmentCenterId, inboundShipmentPlan.destinationFulfillmentCenterId) &&
                Objects.equals(this.shipToAddress, inboundShipmentPlan.shipToAddress) &&
                Objects.equals(this.labelPrepType, inboundShipmentPlan.labelPrepType) &&
                Objects.equals(this.items, inboundShipmentPlan.items) &&
                Objects.equals(this.estimatedBoxContentsFee, inboundShipmentPlan.estimatedBoxContentsFee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipmentId, destinationFulfillmentCenterId, shipToAddress, labelPrepType, items, estimatedBoxContentsFee);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InboundShipmentPlan {\n");

        sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
        sb.append("    destinationFulfillmentCenterId: ").append(toIndentedString(destinationFulfillmentCenterId)).append("\n");
        sb.append("    shipToAddress: ").append(toIndentedString(shipToAddress)).append("\n");
        sb.append("    labelPrepType: ").append(toIndentedString(labelPrepType)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    estimatedBoxContentsFee: ").append(toIndentedString(estimatedBoxContentsFee)).append("\n");
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
