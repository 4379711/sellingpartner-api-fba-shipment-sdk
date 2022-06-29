package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class GetTransportDetailsResult {
    @SerializedName("TransportContent")
    private TransportContent transportContent = null;

    public GetTransportDetailsResult transportContent(TransportContent transportContent) {
        this.transportContent = transportContent;
        return this;
    }

    /**
     * Get transportContent
     *
     * @return transportContent
     **/
    public TransportContent getTransportContent() {
        return transportContent;
    }

    public void setTransportContent(TransportContent transportContent) {
        this.transportContent = transportContent;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetTransportDetailsResult getTransportDetailsResult = (GetTransportDetailsResult) o;
        return Objects.equals(this.transportContent, getTransportDetailsResult.transportContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportContent);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetTransportDetailsResult {\n");

        sb.append("    transportContent: ").append(toIndentedString(transportContent)).append("\n");
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
