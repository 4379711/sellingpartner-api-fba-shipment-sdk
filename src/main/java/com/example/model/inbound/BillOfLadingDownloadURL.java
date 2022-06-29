package com.example.model.inbound;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class BillOfLadingDownloadURL {
    @SerializedName("DownloadURL")
    private String downloadURL = null;

    public BillOfLadingDownloadURL downloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
        return this;
    }

    /**
     * URL to download the bill of lading for the package. Note: The URL will only be valid for 15 seconds
     *
     * @return downloadURL
     **/
    public String getDownloadURL() {
        return downloadURL;
    }

    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillOfLadingDownloadURL billOfLadingDownloadURL = (BillOfLadingDownloadURL) o;
        return Objects.equals(this.downloadURL, billOfLadingDownloadURL.downloadURL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downloadURL);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillOfLadingDownloadURL {\n");

        sb.append("    downloadURL: ").append(toIndentedString(downloadURL)).append("\n");
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
