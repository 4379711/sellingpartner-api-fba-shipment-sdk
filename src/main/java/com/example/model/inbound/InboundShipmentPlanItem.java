package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class InboundShipmentPlanItem {
    @SerializedName("SellerSKU")
    private String sellerSKU = null;

    @SerializedName("FulfillmentNetworkSKU")
    private String fulfillmentNetworkSKU = null;

    @SerializedName("Quantity")
    private Integer quantity = null;

    @SerializedName("PrepDetailsList")
    private PrepDetailsList prepDetailsList = null;

    public InboundShipmentPlanItem sellerSKU(String sellerSKU) {
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

    public InboundShipmentPlanItem fulfillmentNetworkSKU(String fulfillmentNetworkSKU) {
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

    public InboundShipmentPlanItem quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get quantity
     *
     * @return quantity
     **/
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public InboundShipmentPlanItem prepDetailsList(PrepDetailsList prepDetailsList) {
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
        InboundShipmentPlanItem inboundShipmentPlanItem = (InboundShipmentPlanItem) o;
        return Objects.equals(this.sellerSKU, inboundShipmentPlanItem.sellerSKU) &&
                Objects.equals(this.fulfillmentNetworkSKU, inboundShipmentPlanItem.fulfillmentNetworkSKU) &&
                Objects.equals(this.quantity, inboundShipmentPlanItem.quantity) &&
                Objects.equals(this.prepDetailsList, inboundShipmentPlanItem.prepDetailsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerSKU, fulfillmentNetworkSKU, quantity, prepDetailsList);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InboundShipmentPlanItem {\n");

        sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
        sb.append("    fulfillmentNetworkSKU: ").append(toIndentedString(fulfillmentNetworkSKU)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
