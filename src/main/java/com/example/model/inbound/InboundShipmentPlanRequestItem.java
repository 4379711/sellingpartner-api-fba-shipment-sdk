package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class InboundShipmentPlanRequestItem {
    @SerializedName("SellerSKU")
    private String sellerSKU = null;

    @SerializedName("ASIN")
    private String ASIN = null;

    @SerializedName("Condition")
    private Condition condition = null;

    @SerializedName("Quantity")
    private Integer quantity = null;

    @SerializedName("QuantityInCase")
    private Integer quantityInCase = null;

    @SerializedName("PrepDetailsList")
    private PrepDetailsList prepDetailsList = null;

    public InboundShipmentPlanRequestItem sellerSKU(String sellerSKU) {
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

    public InboundShipmentPlanRequestItem ASIN(String ASIN) {
        this.ASIN = ASIN;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) of the item.
     *
     * @return ASIN
     **/
    public String getASIN() {
        return ASIN;
    }

    public void setASIN(String ASIN) {
        this.ASIN = ASIN;
    }

    public InboundShipmentPlanRequestItem condition(Condition condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get condition
     *
     * @return condition
     **/
    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public InboundShipmentPlanRequestItem quantity(Integer quantity) {
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

    public InboundShipmentPlanRequestItem quantityInCase(Integer quantityInCase) {
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

    public InboundShipmentPlanRequestItem prepDetailsList(PrepDetailsList prepDetailsList) {
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
        InboundShipmentPlanRequestItem inboundShipmentPlanRequestItem = (InboundShipmentPlanRequestItem) o;
        return Objects.equals(this.sellerSKU, inboundShipmentPlanRequestItem.sellerSKU) &&
                Objects.equals(this.ASIN, inboundShipmentPlanRequestItem.ASIN) &&
                Objects.equals(this.condition, inboundShipmentPlanRequestItem.condition) &&
                Objects.equals(this.quantity, inboundShipmentPlanRequestItem.quantity) &&
                Objects.equals(this.quantityInCase, inboundShipmentPlanRequestItem.quantityInCase) &&
                Objects.equals(this.prepDetailsList, inboundShipmentPlanRequestItem.prepDetailsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerSKU, ASIN, condition, quantity, quantityInCase, prepDetailsList);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InboundShipmentPlanRequestItem {\n");

        sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
        sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    quantityInCase: ").append(toIndentedString(quantityInCase)).append("\n");
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
