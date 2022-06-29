package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;


public class PartneredEstimate {
    @SerializedName("Amount")
    private Amount amount = null;

    @SerializedName("ConfirmDeadline")
    private OffsetDateTime confirmDeadline = null;

    @SerializedName("VoidDeadline")
    private OffsetDateTime voidDeadline = null;

    public PartneredEstimate amount(Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public PartneredEstimate confirmDeadline(OffsetDateTime confirmDeadline) {
        this.confirmDeadline = confirmDeadline;
        return this;
    }

    /**
     * Get confirmDeadline
     *
     * @return confirmDeadline
     **/
    public OffsetDateTime getConfirmDeadline() {
        return confirmDeadline;
    }

    public void setConfirmDeadline(OffsetDateTime confirmDeadline) {
        this.confirmDeadline = confirmDeadline;
    }

    public PartneredEstimate voidDeadline(OffsetDateTime voidDeadline) {
        this.voidDeadline = voidDeadline;
        return this;
    }

    /**
     * Get voidDeadline
     *
     * @return voidDeadline
     **/
    public OffsetDateTime getVoidDeadline() {
        return voidDeadline;
    }

    public void setVoidDeadline(OffsetDateTime voidDeadline) {
        this.voidDeadline = voidDeadline;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PartneredEstimate partneredEstimate = (PartneredEstimate) o;
        return Objects.equals(this.amount, partneredEstimate.amount) &&
                Objects.equals(this.confirmDeadline, partneredEstimate.confirmDeadline) &&
                Objects.equals(this.voidDeadline, partneredEstimate.voidDeadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, confirmDeadline, voidDeadline);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartneredEstimate {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    confirmDeadline: ").append(toIndentedString(confirmDeadline)).append("\n");
        sb.append("    voidDeadline: ").append(toIndentedString(voidDeadline)).append("\n");
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
