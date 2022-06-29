package com.example.enums;

/**
 * @author YaLong
 */
public enum Endpoints {
    /**
     * 北美地区
     */
    NA("https://sellingpartnerapi-na.amazon.com", "https://api.amazon.com/auth/o2/token", "us-east-1"),
    /**
     * 欧洲地区
     */
    EU("https://sellingpartnerapi-eu.amazon.com", "https://api.amazon.co.uk/auth/o2/token", "eu-west-1"),
    /**
     * 远东地区
     */
    FE("https://sellingpartnerapi-fe.amazon.com", " https://api.amazon.co.jp/auth/o2/token", "us-west-2");

    private final String spEndpoint;
    private final String awsEndpoint;
    private final String awsRegion;

    Endpoints(String spEndpoint, String awsEndpoint, String awsRegion) {
        this.spEndpoint = spEndpoint;
        this.awsEndpoint = awsEndpoint;
        this.awsRegion = awsRegion;

    }

    public String getAwsEndpoint() {
        return awsEndpoint;
    }

    public String getSpEndpoint() {
        return spEndpoint;
    }

    public String getAwsRegion() {
        return awsRegion;
    }
}
