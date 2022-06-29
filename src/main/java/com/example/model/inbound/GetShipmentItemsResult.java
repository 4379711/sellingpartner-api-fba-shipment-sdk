package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class GetShipmentItemsResult {
    @SerializedName("ItemData")
    private InboundShipmentItemList itemData = null;

    @SerializedName("NextToken")
    private String nextToken = null;

    public GetShipmentItemsResult itemData(InboundShipmentItemList itemData) {
        this.itemData = itemData;
        return this;
    }

    /**
     * Get itemData
     *
     * @return itemData
     **/
    public InboundShipmentItemList getItemData() {
        return itemData;
    }

    public void setItemData(InboundShipmentItemList itemData) {
        this.itemData = itemData;
    }

    public GetShipmentItemsResult nextToken(String nextToken) {
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
        GetShipmentItemsResult getShipmentItemsResult = (GetShipmentItemsResult) o;
        return Objects.equals(this.itemData, getShipmentItemsResult.itemData) &&
                Objects.equals(this.nextToken, getShipmentItemsResult.nextToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemData, nextToken);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetShipmentItemsResult {\n");

        sb.append("    itemData: ").append(toIndentedString(itemData)).append("\n");
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
