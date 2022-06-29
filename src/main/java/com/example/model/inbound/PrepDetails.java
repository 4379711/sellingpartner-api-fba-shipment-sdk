package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class PrepDetails {
    @SerializedName("PrepInstruction")
    private PrepInstruction prepInstruction = null;

    @SerializedName("PrepOwner")
    private PrepOwner prepOwner = null;

    public PrepDetails prepInstruction(PrepInstruction prepInstruction) {
        this.prepInstruction = prepInstruction;
        return this;
    }

    /**
     * Get prepInstruction
     *
     * @return prepInstruction
     **/
    public PrepInstruction getPrepInstruction() {
        return prepInstruction;
    }

    public void setPrepInstruction(PrepInstruction prepInstruction) {
        this.prepInstruction = prepInstruction;
    }

    public PrepDetails prepOwner(PrepOwner prepOwner) {
        this.prepOwner = prepOwner;
        return this;
    }

    /**
     * Get prepOwner
     *
     * @return prepOwner
     **/
    public PrepOwner getPrepOwner() {
        return prepOwner;
    }

    public void setPrepOwner(PrepOwner prepOwner) {
        this.prepOwner = prepOwner;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrepDetails prepDetails = (PrepDetails) o;
        return Objects.equals(this.prepInstruction, prepDetails.prepInstruction) &&
                Objects.equals(this.prepOwner, prepDetails.prepOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prepInstruction, prepOwner);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrepDetails {\n");

        sb.append("    prepInstruction: ").append(toIndentedString(prepInstruction)).append("\n");
        sb.append("    prepOwner: ").append(toIndentedString(prepOwner)).append("\n");
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
