package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class NonPartneredSmallParcelDataOutput {
    @SerializedName("PackageList")
    private NonPartneredSmallParcelPackageOutputList packageList = null;

    public NonPartneredSmallParcelDataOutput packageList(NonPartneredSmallParcelPackageOutputList packageList) {
        this.packageList = packageList;
        return this;
    }

    /**
     * Get packageList
     *
     * @return packageList
     **/
    public NonPartneredSmallParcelPackageOutputList getPackageList() {
        return packageList;
    }

    public void setPackageList(NonPartneredSmallParcelPackageOutputList packageList) {
        this.packageList = packageList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NonPartneredSmallParcelDataOutput nonPartneredSmallParcelDataOutput = (NonPartneredSmallParcelDataOutput) o;
        return Objects.equals(this.packageList, nonPartneredSmallParcelDataOutput.packageList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageList);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NonPartneredSmallParcelDataOutput {\n");

        sb.append("    packageList: ").append(toIndentedString(packageList)).append("\n");
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
