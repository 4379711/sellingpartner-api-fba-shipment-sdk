package com.example.model.feed;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class CreateFeedResponse {
    @SerializedName("feedId")
    private String feedId = null;

    public CreateFeedResponse feedId(String feedId) {
        this.feedId = feedId;
        return this;
    }

    /**
     * The identifier for the feed. This identifier is unique only in combination with a seller ID.
     *
     * @return feedId
     **/
    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFeedResponse createFeedResponse = (CreateFeedResponse) o;
        return Objects.equals(this.feedId, createFeedResponse.feedId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFeedResponse {\n");

        sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
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
