package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class PartneredSmallParcelDataInput {
    @SerializedName("PackageList")
    private PartneredSmallParcelPackageInputList packageList = null;

    @SerializedName("CarrierName")
    private String carrierName = null;

    public PartneredSmallParcelDataInput packageList(PartneredSmallParcelPackageInputList packageList) {
        this.packageList = packageList;
        return this;
    }

    /**
     * Get packageList
     *
     * @return packageList
     **/
    public PartneredSmallParcelPackageInputList getPackageList() {
        return packageList;
    }

    public void setPackageList(PartneredSmallParcelPackageInputList packageList) {
        this.packageList = packageList;
    }

    public PartneredSmallParcelDataInput carrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * The Amazon-partnered carrier to use for the inbound shipment.
     *
     * @return carrierName
     **/
    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PartneredSmallParcelDataInput partneredSmallParcelDataInput = (PartneredSmallParcelDataInput) o;
        return Objects.equals(this.packageList, partneredSmallParcelDataInput.packageList) &&
                Objects.equals(this.carrierName, partneredSmallParcelDataInput.carrierName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageList, carrierName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartneredSmallParcelDataInput {\n");

        sb.append("    packageList: ").append(toIndentedString(packageList)).append("\n");
        sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
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
