package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;
import org.threeten.bp.LocalDate;

import java.util.Objects;


public class PartneredLtlDataInput {
    @SerializedName("Contact")
    private Contact contact = null;

    @SerializedName("BoxCount")
    private Long boxCount = null;

    @SerializedName("SellerFreightClass")
    private SellerFreightClass sellerFreightClass = null;

    @SerializedName("FreightReadyDate")
    private LocalDate freightReadyDate = null;

    @SerializedName("PalletList")
    private PalletList palletList = null;

    @SerializedName("TotalWeight")
    private Weight totalWeight = null;

    @SerializedName("SellerDeclaredValue")
    private Amount sellerDeclaredValue = null;

    public PartneredLtlDataInput contact(Contact contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Get contact
     *
     * @return contact
     **/
    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public PartneredLtlDataInput boxCount(Long boxCount) {
        this.boxCount = boxCount;
        return this;
    }

    /**
     * Get boxCount
     *
     * @return boxCount
     **/
    public Long getBoxCount() {
        return boxCount;
    }

    public void setBoxCount(Long boxCount) {
        this.boxCount = boxCount;
    }

    public PartneredLtlDataInput sellerFreightClass(SellerFreightClass sellerFreightClass) {
        this.sellerFreightClass = sellerFreightClass;
        return this;
    }

    /**
     * Get sellerFreightClass
     *
     * @return sellerFreightClass
     **/
    public SellerFreightClass getSellerFreightClass() {
        return sellerFreightClass;
    }

    public void setSellerFreightClass(SellerFreightClass sellerFreightClass) {
        this.sellerFreightClass = sellerFreightClass;
    }

    public PartneredLtlDataInput freightReadyDate(LocalDate freightReadyDate) {
        this.freightReadyDate = freightReadyDate;
        return this;
    }

    /**
     * Get freightReadyDate
     *
     * @return freightReadyDate
     **/
    public LocalDate getFreightReadyDate() {
        return freightReadyDate;
    }

    public void setFreightReadyDate(LocalDate freightReadyDate) {
        this.freightReadyDate = freightReadyDate;
    }

    public PartneredLtlDataInput palletList(PalletList palletList) {
        this.palletList = palletList;
        return this;
    }

    /**
     * Get palletList
     *
     * @return palletList
     **/
    public PalletList getPalletList() {
        return palletList;
    }

    public void setPalletList(PalletList palletList) {
        this.palletList = palletList;
    }

    public PartneredLtlDataInput totalWeight(Weight totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }

    /**
     * Get totalWeight
     *
     * @return totalWeight
     **/
    public Weight getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Weight totalWeight) {
        this.totalWeight = totalWeight;
    }

    public PartneredLtlDataInput sellerDeclaredValue(Amount sellerDeclaredValue) {
        this.sellerDeclaredValue = sellerDeclaredValue;
        return this;
    }

    /**
     * Get sellerDeclaredValue
     *
     * @return sellerDeclaredValue
     **/
    public Amount getSellerDeclaredValue() {
        return sellerDeclaredValue;
    }

    public void setSellerDeclaredValue(Amount sellerDeclaredValue) {
        this.sellerDeclaredValue = sellerDeclaredValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PartneredLtlDataInput partneredLtlDataInput = (PartneredLtlDataInput) o;
        return Objects.equals(this.contact, partneredLtlDataInput.contact) &&
                Objects.equals(this.boxCount, partneredLtlDataInput.boxCount) &&
                Objects.equals(this.sellerFreightClass, partneredLtlDataInput.sellerFreightClass) &&
                Objects.equals(this.freightReadyDate, partneredLtlDataInput.freightReadyDate) &&
                Objects.equals(this.palletList, partneredLtlDataInput.palletList) &&
                Objects.equals(this.totalWeight, partneredLtlDataInput.totalWeight) &&
                Objects.equals(this.sellerDeclaredValue, partneredLtlDataInput.sellerDeclaredValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contact, boxCount, sellerFreightClass, freightReadyDate, palletList, totalWeight, sellerDeclaredValue);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartneredLtlDataInput {\n");

        sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
        sb.append("    boxCount: ").append(toIndentedString(boxCount)).append("\n");
        sb.append("    sellerFreightClass: ").append(toIndentedString(sellerFreightClass)).append("\n");
        sb.append("    freightReadyDate: ").append(toIndentedString(freightReadyDate)).append("\n");
        sb.append("    palletList: ").append(toIndentedString(palletList)).append("\n");
        sb.append("    totalWeight: ").append(toIndentedString(totalWeight)).append("\n");
        sb.append("    sellerDeclaredValue: ").append(toIndentedString(sellerDeclaredValue)).append("\n");
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
