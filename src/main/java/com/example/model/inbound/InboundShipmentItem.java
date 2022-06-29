package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;
import org.threeten.bp.LocalDate;

import java.util.Objects;


public class InboundShipmentItem {
    @SerializedName("ShipmentId")
    private String shipmentId = null;

    @SerializedName("SellerSKU")
    private String sellerSKU = null;

    @SerializedName("FulfillmentNetworkSKU")
    private String fulfillmentNetworkSKU = null;

    @SerializedName("QuantityShipped")
    private Integer quantityShipped = null;

    @SerializedName("QuantityReceived")
    private Integer quantityReceived = null;

    @SerializedName("QuantityInCase")
    private Integer quantityInCase = null;

    @SerializedName("ReleaseDate")
    private LocalDate releaseDate = null;

    @SerializedName("PrepDetailsList")
    private PrepDetailsList prepDetailsList = null;

    public InboundShipmentItem shipmentId(String shipmentId) {
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

    public InboundShipmentItem sellerSKU(String sellerSKU) {
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

    public InboundShipmentItem fulfillmentNetworkSKU(String fulfillmentNetworkSKU) {
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
        return this;
    }

    /**
     * Amazon&#x27;s fulfillment network SKU of the item.
     *
     * @return fulfillmentNetworkSKU
     **/
    public String getFulfillmentNetworkSKU() {
        return fulfillmentNetworkSKU;
    }

    public void setFulfillmentNetworkSKU(String fulfillmentNetworkSKU) {
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
    }

    public InboundShipmentItem quantityShipped(Integer quantityShipped) {
        this.quantityShipped = quantityShipped;
        return this;
    }

    /**
     * Get quantityShipped
     *
     * @return quantityShipped
     **/
    public Integer getQuantityShipped() {
        return quantityShipped;
    }

    public void setQuantityShipped(Integer quantityShipped) {
        this.quantityShipped = quantityShipped;
    }

    public InboundShipmentItem quantityReceived(Integer quantityReceived) {
        this.quantityReceived = quantityReceived;
        return this;
    }

    /**
     * Get quantityReceived
     *
     * @return quantityReceived
     **/
    public Integer getQuantityReceived() {
        return quantityReceived;
    }

    public void setQuantityReceived(Integer quantityReceived) {
        this.quantityReceived = quantityReceived;
    }

    public InboundShipmentItem quantityInCase(Integer quantityInCase) {
        this.quantityInCase = quantityInCase;
        return this;
    }

    /**
     * Get quantityInCase
     *
     * @return quantityInCase
     **/
    public Integer getQuantityInCase() {
        return quantityInCase;
    }

    public void setQuantityInCase(Integer quantityInCase) {
        this.quantityInCase = quantityInCase;
    }

    public InboundShipmentItem releaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * Get releaseDate
     *
     * @return releaseDate
     **/
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public InboundShipmentItem prepDetailsList(PrepDetailsList prepDetailsList) {
        this.prepDetailsList = prepDetailsList;
        return this;
    }

    /**
     * Get prepDetailsList
     *
     * @return prepDetailsList
     **/
    public PrepDetailsList getPrepDetailsList() {
        return prepDetailsList;
    }

    public void setPrepDetailsList(PrepDetailsList prepDetailsList) {
        this.prepDetailsList = prepDetailsList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InboundShipmentItem inboundShipmentItem = (InboundShipmentItem) o;
        return Objects.equals(this.shipmentId, inboundShipmentItem.shipmentId) &&
                Objects.equals(this.sellerSKU, inboundShipmentItem.sellerSKU) &&
                Objects.equals(this.fulfillmentNetworkSKU, inboundShipmentItem.fulfillmentNetworkSKU) &&
                Objects.equals(this.quantityShipped, inboundShipmentItem.quantityShipped) &&
                Objects.equals(this.quantityReceived, inboundShipmentItem.quantityReceived) &&
                Objects.equals(this.quantityInCase, inboundShipmentItem.quantityInCase) &&
                Objects.equals(this.releaseDate, inboundShipmentItem.releaseDate) &&
                Objects.equals(this.prepDetailsList, inboundShipmentItem.prepDetailsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipmentId, sellerSKU, fulfillmentNetworkSKU, quantityShipped, quantityReceived, quantityInCase, releaseDate, prepDetailsList);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InboundShipmentItem {\n");

        sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
        sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
        sb.append("    fulfillmentNetworkSKU: ").append(toIndentedString(fulfillmentNetworkSKU)).append("\n");
        sb.append("    quantityShipped: ").append(toIndentedString(quantityShipped)).append("\n");
        sb.append("    quantityReceived: ").append(toIndentedString(quantityReceived)).append("\n");
        sb.append("    quantityInCase: ").append(toIndentedString(quantityInCase)).append("\n");
        sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
        sb.append("    prepDetailsList: ").append(toIndentedString(prepDetailsList)).append("\n");
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
