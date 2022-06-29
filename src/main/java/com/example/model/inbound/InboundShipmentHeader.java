package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class InboundShipmentHeader {
    @SerializedName("ShipmentName")
    private String shipmentName = null;

    @SerializedName("ShipFromAddress")
    private Address shipFromAddress = null;

    @SerializedName("DestinationFulfillmentCenterId")
    private String destinationFulfillmentCenterId = null;

    @SerializedName("AreCasesRequired")
    private Boolean areCasesRequired = null;

    @SerializedName("ShipmentStatus")
    private ShipmentStatus shipmentStatus = null;

    @SerializedName("LabelPrepPreference")
    private LabelPrepPreference labelPrepPreference = null;

    @SerializedName("IntendedBoxContentsSource")
    private IntendedBoxContentsSource intendedBoxContentsSource = null;

    public InboundShipmentHeader shipmentName(String shipmentName) {
        this.shipmentName = shipmentName;
        return this;
    }

    /**
     * The name for the shipment. Use a naming convention that helps distinguish between shipments over time, such as the date the shipment was created.
     *
     * @return shipmentName
     **/
    public String getShipmentName() {
        return shipmentName;
    }

    public void setShipmentName(String shipmentName) {
        this.shipmentName = shipmentName;
    }

    public InboundShipmentHeader shipFromAddress(Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
        return this;
    }

    /**
     * Get shipFromAddress
     *
     * @return shipFromAddress
     **/
    public Address getShipFromAddress() {
        return shipFromAddress;
    }

    public void setShipFromAddress(Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
    }

    public InboundShipmentHeader destinationFulfillmentCenterId(String destinationFulfillmentCenterId) {
        this.destinationFulfillmentCenterId = destinationFulfillmentCenterId;
        return this;
    }

    /**
     * The identifier for the fulfillment center to which the shipment will be shipped. Get this value from the InboundShipmentPlan object in the response returned by the createInboundShipmentPlan operation.
     *
     * @return destinationFulfillmentCenterId
     **/
    public String getDestinationFulfillmentCenterId() {
        return destinationFulfillmentCenterId;
    }

    public void setDestinationFulfillmentCenterId(String destinationFulfillmentCenterId) {
        this.destinationFulfillmentCenterId = destinationFulfillmentCenterId;
    }

    public InboundShipmentHeader areCasesRequired(Boolean areCasesRequired) {
        this.areCasesRequired = areCasesRequired;
        return this;
    }

    /**
     * Indicates whether or not an inbound shipment contains case-packed boxes. Note: A shipment must contain either all case-packed boxes or all individually packed boxes.  Possible values:  true - All boxes in the shipment must be case packed.  false - All boxes in the shipment must be individually packed.  Note: If AreCasesRequired &#x3D; true for an inbound shipment, then the value of QuantityInCase must be greater than zero for every item in the shipment. Otherwise the service returns an error.
     *
     * @return areCasesRequired
     **/
    public Boolean isAreCasesRequired() {
        return areCasesRequired;
    }

    public void setAreCasesRequired(Boolean areCasesRequired) {
        this.areCasesRequired = areCasesRequired;
    }

    public InboundShipmentHeader shipmentStatus(ShipmentStatus shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
        return this;
    }

    /**
     * Get shipmentStatus
     *
     * @return shipmentStatus
     **/
    public ShipmentStatus getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(ShipmentStatus shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public InboundShipmentHeader labelPrepPreference(LabelPrepPreference labelPrepPreference) {
        this.labelPrepPreference = labelPrepPreference;
        return this;
    }

    /**
     * Get labelPrepPreference
     *
     * @return labelPrepPreference
     **/
    public LabelPrepPreference getLabelPrepPreference() {
        return labelPrepPreference;
    }

    public void setLabelPrepPreference(LabelPrepPreference labelPrepPreference) {
        this.labelPrepPreference = labelPrepPreference;
    }

    public InboundShipmentHeader intendedBoxContentsSource(IntendedBoxContentsSource intendedBoxContentsSource) {
        this.intendedBoxContentsSource = intendedBoxContentsSource;
        return this;
    }

    /**
     * Get intendedBoxContentsSource
     *
     * @return intendedBoxContentsSource
     **/
    public IntendedBoxContentsSource getIntendedBoxContentsSource() {
        return intendedBoxContentsSource;
    }

    public void setIntendedBoxContentsSource(IntendedBoxContentsSource intendedBoxContentsSource) {
        this.intendedBoxContentsSource = intendedBoxContentsSource;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InboundShipmentHeader inboundShipmentHeader = (InboundShipmentHeader) o;
        return Objects.equals(this.shipmentName, inboundShipmentHeader.shipmentName) &&
                Objects.equals(this.shipFromAddress, inboundShipmentHeader.shipFromAddress) &&
                Objects.equals(this.destinationFulfillmentCenterId, inboundShipmentHeader.destinationFulfillmentCenterId) &&
                Objects.equals(this.areCasesRequired, inboundShipmentHeader.areCasesRequired) &&
                Objects.equals(this.shipmentStatus, inboundShipmentHeader.shipmentStatus) &&
                Objects.equals(this.labelPrepPreference, inboundShipmentHeader.labelPrepPreference) &&
                Objects.equals(this.intendedBoxContentsSource, inboundShipmentHeader.intendedBoxContentsSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipmentName, shipFromAddress, destinationFulfillmentCenterId, areCasesRequired, shipmentStatus, labelPrepPreference, intendedBoxContentsSource);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InboundShipmentHeader {\n");

        sb.append("    shipmentName: ").append(toIndentedString(shipmentName)).append("\n");
        sb.append("    shipFromAddress: ").append(toIndentedString(shipFromAddress)).append("\n");
        sb.append("    destinationFulfillmentCenterId: ").append(toIndentedString(destinationFulfillmentCenterId)).append("\n");
        sb.append("    areCasesRequired: ").append(toIndentedString(areCasesRequired)).append("\n");
        sb.append("    shipmentStatus: ").append(toIndentedString(shipmentStatus)).append("\n");
        sb.append("    labelPrepPreference: ").append(toIndentedString(labelPrepPreference)).append("\n");
        sb.append("    intendedBoxContentsSource: ").append(toIndentedString(intendedBoxContentsSource)).append("\n");
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
