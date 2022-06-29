package com.example.singer;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LWARefreshTokenRequestMeta {
    @SerializedName("grant_type")
    @Builder.Default
    private String grantType = "authorization_code";

    @SerializedName("code")
    private String code;

    @SerializedName("client_id")
    private String clientId;

    @SerializedName("client_secret")
    private String clientSecret;

    /**
     * 这个好像可以不写
     */
    @SerializedName("redirect_uri")
    private String redirect_uri;

}
