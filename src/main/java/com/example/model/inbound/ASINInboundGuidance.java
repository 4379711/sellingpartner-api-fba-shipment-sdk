package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class ASINInboundGuidance {
    @SerializedName("ASIN")
    private String ASIN = null;

    @SerializedName("InboundGuidance")
    private InboundGuidance inboundGuidance = null;

    @SerializedName("GuidanceReasonList")
    private GuidanceReasonList guidanceReasonList = null;

    public ASINInboundGuidance ASIN(String ASIN) {
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

    public ASINInboundGuidance inboundGuidance(InboundGuidance inboundGuidance) {
        this.inboundGuidance = inboundGuidance;
        return this;
    }

    /**
     * Get inboundGuidance
     *
     * @return inboundGuidance
     **/
    public InboundGuidance getInboundGuidance() {
        return inboundGuidance;
    }

    public void setInboundGuidance(InboundGuidance inboundGuidance) {
        this.inboundGuidance = inboundGuidance;
    }

    public ASINInboundGuidance guidanceReasonList(GuidanceReasonList guidanceReasonList) {
        this.guidanceReasonList = guidanceReasonList;
        return this;
    }

    /**
     * Get guidanceReasonList
     *
     * @return guidanceReasonList
     **/
    public GuidanceReasonList getGuidanceReasonList() {
        return guidanceReasonList;
    }

    public void setGuidanceReasonList(GuidanceReasonList guidanceReasonList) {
        this.guidanceReasonList = guidanceReasonList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ASINInboundGuidance asINInboundGuidance = (ASINInboundGuidance) o;
        return Objects.equals(this.ASIN, asINInboundGuidance.ASIN) &&
                Objects.equals(this.inboundGuidance, asINInboundGuidance.inboundGuidance) &&
                Objects.equals(this.guidanceReasonList, asINInboundGuidance.guidanceReasonList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ASIN, inboundGuidance, guidanceReasonList);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ASINInboundGuidance {\n");

        sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
        sb.append("    inboundGuidance: ").append(toIndentedString(inboundGuidance)).append("\n");
        sb.append("    guidanceReasonList: ").append(toIndentedString(guidanceReasonList)).append("\n");
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
