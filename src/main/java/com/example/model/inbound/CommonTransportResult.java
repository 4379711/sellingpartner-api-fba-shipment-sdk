package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class CommonTransportResult {
    @SerializedName("TransportResult")
    private TransportResult transportResult = null;

    public CommonTransportResult transportResult(TransportResult transportResult) {
        this.transportResult = transportResult;
        return this;
    }

    /**
     * Get transportResult
     *
     * @return transportResult
     **/
    public TransportResult getTransportResult() {
        return transportResult;
    }

    public void setTransportResult(TransportResult transportResult) {
        this.transportResult = transportResult;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommonTransportResult commonTransportResult = (CommonTransportResult) o;
        return Objects.equals(this.transportResult, commonTransportResult.transportResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportResult);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonTransportResult {\n");

        sb.append("    transportResult: ").append(toIndentedString(transportResult)).append("\n");
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
