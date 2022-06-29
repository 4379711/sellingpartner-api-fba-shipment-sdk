package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class VoidTransportResponse {
    @SerializedName("payload")
    private CommonTransportResult payload = null;

    @SerializedName("errors")
    private ErrorList errors = null;

    public VoidTransportResponse payload(CommonTransportResult payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Get payload
     *
     * @return payload
     **/
    public CommonTransportResult getPayload() {
        return payload;
    }

    public void setPayload(CommonTransportResult payload) {
        this.payload = payload;
    }

    public VoidTransportResponse errors(ErrorList errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get errors
     *
     * @return errors
     **/
    public ErrorList getErrors() {
        return errors;
    }

    public void setErrors(ErrorList errors) {
        this.errors = errors;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VoidTransportResponse voidTransportResponse = (VoidTransportResponse) o;
        return Objects.equals(this.payload, voidTransportResponse.payload) &&
                Objects.equals(this.errors, voidTransportResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, errors);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VoidTransportResponse {\n");

        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
