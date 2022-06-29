package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class PartneredSmallParcelDataOutput {
    @SerializedName("PackageList")
    private PartneredSmallParcelPackageOutputList packageList = null;

    @SerializedName("PartneredEstimate")
    private PartneredEstimate partneredEstimate = null;

    public PartneredSmallParcelDataOutput packageList(PartneredSmallParcelPackageOutputList packageList) {
        this.packageList = packageList;
        return this;
    }

    /**
     * Get packageList
     *
     * @return packageList
     **/
    public PartneredSmallParcelPackageOutputList getPackageList() {
        return packageList;
    }

    public void setPackageList(PartneredSmallParcelPackageOutputList packageList) {
        this.packageList = packageList;
    }

    public PartneredSmallParcelDataOutput partneredEstimate(PartneredEstimate partneredEstimate) {
        this.partneredEstimate = partneredEstimate;
        return this;
    }

    /**
     * Get partneredEstimate
     *
     * @return partneredEstimate
     **/
    public PartneredEstimate getPartneredEstimate() {
        return partneredEstimate;
    }

    public void setPartneredEstimate(PartneredEstimate partneredEstimate) {
        this.partneredEstimate = partneredEstimate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PartneredSmallParcelDataOutput partneredSmallParcelDataOutput = (PartneredSmallParcelDataOutput) o;
        return Objects.equals(this.packageList, partneredSmallParcelDataOutput.packageList) &&
                Objects.equals(this.partneredEstimate, partneredSmallParcelDataOutput.partneredEstimate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageList, partneredEstimate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartneredSmallParcelDataOutput {\n");

        sb.append("    packageList: ").append(toIndentedString(packageList)).append("\n");
        sb.append("    partneredEstimate: ").append(toIndentedString(partneredEstimate)).append("\n");
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
