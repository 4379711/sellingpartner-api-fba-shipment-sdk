package com.example.model.feed;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class CreateFeedDocumentResponse {
    @SerializedName("feedDocumentId")
    private String feedDocumentId = null;

    @SerializedName("url")
    private String url = null;

    public CreateFeedDocumentResponse feedDocumentId(String feedDocumentId) {
        this.feedDocumentId = feedDocumentId;
        return this;
    }

    /**
     * The identifier of the feed document.
     *
     * @return feedDocumentId
     **/
    public String getFeedDocumentId() {
        return feedDocumentId;
    }

    public void setFeedDocumentId(String feedDocumentId) {
        this.feedDocumentId = feedDocumentId;
    }

    public CreateFeedDocumentResponse url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The presigned URL for uploading the feed contents. This URL expires after 5 minutes.
     *
     * @return url
     **/
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFeedDocumentResponse createFeedDocumentResponse = (CreateFeedDocumentResponse) o;
        return Objects.equals(this.feedDocumentId, createFeedDocumentResponse.feedDocumentId) &&
                Objects.equals(this.url, createFeedDocumentResponse.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedDocumentId, url);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFeedDocumentResponse {\n");

        sb.append("    feedDocumentId: ").append(toIndentedString(feedDocumentId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
