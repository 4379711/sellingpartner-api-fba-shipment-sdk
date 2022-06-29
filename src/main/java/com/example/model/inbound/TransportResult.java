package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class TransportResult {
    @SerializedName("TransportStatus")
    private TransportStatus transportStatus = null;

    @SerializedName("ErrorCode")
    private String errorCode = null;

    @SerializedName("ErrorDescription")
    private String errorDescription = null;

    public TransportResult transportStatus(TransportStatus transportStatus) {
        this.transportStatus = transportStatus;
        return this;
    }

    /**
     * Get transportStatus
     *
     * @return transportStatus
     **/
    public TransportStatus getTransportStatus() {
        return transportStatus;
    }

    public void setTransportStatus(TransportStatus transportStatus) {
        this.transportStatus = transportStatus;
    }

    public TransportResult errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * An error code that identifies the type of error that occured.
     *
     * @return errorCode
     **/
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public TransportResult errorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }

    /**
     * A message that describes the error condition.
     *
     * @return errorDescription
     **/
    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransportResult transportResult = (TransportResult) o;
        return Objects.equals(this.transportStatus, transportResult.transportStatus) &&
                Objects.equals(this.errorCode, transportResult.errorCode) &&
                Objects.equals(this.errorDescription, transportResult.errorDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportStatus, errorCode, errorDescription);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransportResult {\n");

        sb.append("    transportStatus: ").append(toIndentedString(transportStatus)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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
