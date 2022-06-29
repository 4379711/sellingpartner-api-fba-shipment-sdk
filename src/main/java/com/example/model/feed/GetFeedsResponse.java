package com.example.model.feed;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class GetFeedsResponse {
    @SerializedName("feeds")
    private FeedList feeds = null;

    @SerializedName("nextToken")
    private String nextToken = null;

    public GetFeedsResponse feeds(FeedList feeds) {
        this.feeds = feeds;
        return this;
    }

    /**
     * Get feeds
     *
     * @return feeds
     **/
    public FeedList getFeeds() {
        return feeds;
    }

    public void setFeeds(FeedList feeds) {
        this.feeds = feeds;
    }

    public GetFeedsResponse nextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returned when the number of results exceeds pageSize. To get the next page of results, call the getFeeds operation with this token as the only parameter.
     *
     * @return nextToken
     **/
    public String getNextToken() {
        return nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetFeedsResponse getFeedsResponse = (GetFeedsResponse) o;
        return Objects.equals(this.feeds, getFeedsResponse.feeds) &&
                Objects.equals(this.nextToken, getFeedsResponse.nextToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeds, nextToken);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFeedsResponse {\n");

        sb.append("    feeds: ").append(toIndentedString(feeds)).append("\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
