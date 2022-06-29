package com.example.model.feed;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class CreateFeedDocumentSpecification {
    @SerializedName("contentType")
    private String contentType = null;

    public CreateFeedDocumentSpecification contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * The content type of the feed.
     *
     * @return contentType
     **/
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFeedDocumentSpecification createFeedDocumentSpecification = (CreateFeedDocumentSpecification) o;
        return Objects.equals(this.contentType, createFeedDocumentSpecification.contentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFeedDocumentSpecification {\n");

        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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
