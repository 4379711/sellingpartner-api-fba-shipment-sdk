package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class NonPartneredSmallParcelPackageInput {
    @SerializedName("TrackingId")
    private String trackingId = null;

    public NonPartneredSmallParcelPackageInput trackingId(String trackingId) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NonPartneredSmallParcelPackageInput nonPartneredSmallParcelPackageInput = (NonPartneredSmallParcelPackageInput) o;
        return Objects.equals(this.trackingId, nonPartneredSmallParcelPackageInput.trackingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackingId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NonPartneredSmallParcelPackageInput {\n");

        sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
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
