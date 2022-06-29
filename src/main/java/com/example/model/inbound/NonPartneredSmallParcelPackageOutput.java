package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class NonPartneredSmallParcelPackageOutput {
    @SerializedName("CarrierName")
    private String carrierName = null;

    @SerializedName("TrackingId")
    private String trackingId = null;

    @SerializedName("PackageStatus")
    private PackageStatus packageStatus = null;

    public NonPartneredSmallParcelPackageOutput carrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * The carrier that you are using for the inbound shipment.
     *
     * @return carrierName
     **/
    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public NonPartneredSmallParcelPackageOutput trackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    /**
     * Get trackingId
     *
     * @return trackingId
     **/
    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public NonPartneredSmallParcelPackageOutput packageStatus(PackageStatus packageStatus) {
        this.packageStatus = packageStatus;
        return this;
    }

    /**
     * Get packageStatus
     *
     * @return packageStatus
     **/
    public PackageStatus getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(PackageStatus packageStatus) {
        this.packageStatus = packageStatus;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NonPartneredSmallParcelPackageOutput nonPartneredSmallParcelPackageOutput = (NonPartneredSmallParcelPackageOutput) o;
        return Objects.equals(this.carrierName, nonPartneredSmallParcelPackageOutput.carrierName) &&
                Objects.equals(this.trackingId, nonPartneredSmallParcelPackageOutput.trackingId) &&
                Objects.equals(this.packageStatus, nonPartneredSmallParcelPackageOutput.packageStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrierName, trackingId, packageStatus);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NonPartneredSmallParcelPackageOutput {\n");

        sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
        sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
        sb.append("    packageStatus: ").append(toIndentedString(packageStatus)).append("\n");
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
