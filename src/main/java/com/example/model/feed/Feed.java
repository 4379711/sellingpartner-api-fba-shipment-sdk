package com.example.model.feed;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.threeten.bp.OffsetDateTime;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Feed {
    @SerializedName("feedId")
    private String feedId = null;

    @SerializedName("feedType")
    private String feedType = null;

    @SerializedName("marketplaceIds")
    private List<String> marketplaceIds = null;

    @SerializedName("createdTime")
    private OffsetDateTime createdTime = null;

    @JsonAdapter(ProcessingStatusEnum.Adapter.class)
    public enum ProcessingStatusEnum {
        CANCELLED("CANCELLED"),
        DONE("DONE"),
        FATAL("FATAL"),
        IN_PROGRESS("IN_PROGRESS"),
        IN_QUEUE("IN_QUEUE");

        private final String value;

        ProcessingStatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ProcessingStatusEnum fromValue(String text) {
            for (ProcessingStatusEnum b : ProcessingStatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ProcessingStatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ProcessingStatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ProcessingStatusEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return ProcessingStatusEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("processingStatus")
    private ProcessingStatusEnum processingStatus = null;

    @SerializedName("processingStartTime")
    private OffsetDateTime processingStartTime = null;

    @SerializedName("processingEndTime")
    private OffsetDateTime processingEndTime = null;

    @SerializedName("resultFeedDocumentId")
    private String resultFeedDocumentId = null;

    public Feed feedId(String feedId) {
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

    public Feed feedType(String feedType) {
        this.feedType = feedType;
        return this;
    }

    /**
     * The feed type.
     *
     * @return feedType
     **/
    public String getFeedType() {
        return feedType;
    }

    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    public Feed marketplaceIds(List<String> marketplaceIds) {
        this.marketplaceIds = marketplaceIds;
        return this;
    }

    public Feed addMarketplaceIdsItem(String marketplaceIdsItem) {
        if (this.marketplaceIds == null) {
            this.marketplaceIds = new ArrayList<String>();
        }
        this.marketplaceIds.add(marketplaceIdsItem);
        return this;
    }

    /**
     * A list of identifiers for the marketplaces that the feed is applied to.
     *
     * @return marketplaceIds
     **/
    public List<String> getMarketplaceIds() {
        return marketplaceIds;
    }

    public void setMarketplaceIds(List<String> marketplaceIds) {
        this.marketplaceIds = marketplaceIds;
    }

    public Feed createdTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * The date and time when the feed was created, in ISO 8601 date time format.
     *
     * @return createdTime
     **/
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public Feed processingStatus(ProcessingStatusEnum processingStatus) {
        this.processingStatus = processingStatus;
        return this;
    }

    /**
     * The processing status of the feed.
     *
     * @return processingStatus
     **/
    public ProcessingStatusEnum getProcessingStatus() {
        return processingStatus;
    }

    public void setProcessingStatus(ProcessingStatusEnum processingStatus) {
        this.processingStatus = processingStatus;
    }

    public Feed processingStartTime(OffsetDateTime processingStartTime) {
        this.processingStartTime = processingStartTime;
        return this;
    }

    /**
     * The date and time when feed processing started, in ISO 8601 date time format.
     *
     * @return processingStartTime
     **/
    public OffsetDateTime getProcessingStartTime() {
        return processingStartTime;
    }

    public void setProcessingStartTime(OffsetDateTime processingStartTime) {
        this.processingStartTime = processingStartTime;
    }

    public Feed processingEndTime(OffsetDateTime processingEndTime) {
        this.processingEndTime = processingEndTime;
        return this;
    }

    /**
     * The date and time when feed processing completed, in ISO 8601 date time format.
     *
     * @return processingEndTime
     **/
    public OffsetDateTime getProcessingEndTime() {
        return processingEndTime;
    }

    public void setProcessingEndTime(OffsetDateTime processingEndTime) {
        this.processingEndTime = processingEndTime;
    }

    public Feed resultFeedDocumentId(String resultFeedDocumentId) {
        this.resultFeedDocumentId = resultFeedDocumentId;
        return this;
    }

    /**
     * The identifier for the feed document. This identifier is unique only in combination with a seller ID.
     *
     * @return resultFeedDocumentId
     **/
    public String getResultFeedDocumentId() {
        return resultFeedDocumentId;
    }

    public void setResultFeedDocumentId(String resultFeedDocumentId) {
        this.resultFeedDocumentId = resultFeedDocumentId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Feed feed = (Feed) o;
        return Objects.equals(this.feedId, feed.feedId) &&
                Objects.equals(this.feedType, feed.feedType) &&
                Objects.equals(this.marketplaceIds, feed.marketplaceIds) &&
                Objects.equals(this.createdTime, feed.createdTime) &&
                Objects.equals(this.processingStatus, feed.processingStatus) &&
                Objects.equals(this.processingStartTime, feed.processingStartTime) &&
                Objects.equals(this.processingEndTime, feed.processingEndTime) &&
                Objects.equals(this.resultFeedDocumentId, feed.resultFeedDocumentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedId, feedType, marketplaceIds, createdTime, processingStatus, processingStartTime, processingEndTime, resultFeedDocumentId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Feed {\n");

        sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
        sb.append("    feedType: ").append(toIndentedString(feedType)).append("\n");
        sb.append("    marketplaceIds: ").append(toIndentedString(marketplaceIds)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
        sb.append("    processingStartTime: ").append(toIndentedString(processingStartTime)).append("\n");
        sb.append("    processingEndTime: ").append(toIndentedString(processingEndTime)).append("\n");
        sb.append("    resultFeedDocumentId: ").append(toIndentedString(resultFeedDocumentId)).append("\n");
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
