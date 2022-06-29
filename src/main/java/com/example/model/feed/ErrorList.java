package com.example.model.feed;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class ErrorList {
    @SerializedName("errors")
    private List<java.lang.Error> errors = new ArrayList<java.lang.Error>();

    public ErrorList errors(List<java.lang.Error> errors) {
        this.errors = errors;
        return this;
    }

    public ErrorList addErrorsItem(java.lang.Error errorsItem) {
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Get errors
     *
     * @return errors
     **/
    public List<java.lang.Error> getErrors() {
        return errors;
    }

    public void setErrors(List<java.lang.Error> errors) {
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
        ErrorList errorList = (ErrorList) o;
        return Objects.equals(this.errors, errorList.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorList {\n");

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
