package com.example.enums;

/**
 * @author YaLong
 */
public enum MarketPlaces {

    /**
     * 西班牙
     */
    ES("A1RKKUPIHCS9HS"),
    /**
     * 德国
     */
    DE("A1PA6795UKMFR9"),
    /**
     * 英国
     */
    UK("A1F83G8C2ARO7P"),
    /**
     * 法国
     */
    FR("A13V1IB3VIYZZH"),
    /**
     * 意大利
     */
    IT("APJ6JRA9NG5V4"),

    /**
     * 阿拉伯联合酋长国
     */
    AE("A2VIGQ35RCS4UG"),
    /**
     * 埃及
     */
    EG("ARBP9OOSHTCHU"),
    /**
     * 印度
     */
    IN("A21TJRUUN4KGV"),
    /**
     * 荷兰
     */
    NL("A1805IZSGTT6HS"),
    /**
     * 沙特阿拉伯
     */
    SA("A17E79C6D8DWNP"),
    /**
     * 瑞典
     */
    SE("A2NODRKZP88ZB9"),
    /**
     * 土耳其
     */
    TR("A33AVAJ2PDY3EV"),
    /**
     * 波兰
     */
    PL("A1C3SOZRARQ6R3"),

    //**********************远东地区四个***************************
    /**
     * 澳大利亚
     */
    AU("A39IBJ37TRP1C6"),
    /**
     * 日本
     */
    JP("A1VC38T7YXB528"),
    /**
     * 新加坡
     */
    SG("A19VAU5U5O7RUS"),

    //**********************北美地区四个***************************
    /**
     * 美国
     */
    US("ATVPDKIKX0DER"),
    /**
     * 巴西
     */
    BR("A2Q3Y263D00KWC"),
    /**
     * 加拿大
     */
    CA("A2EUQ1WTGCTBG2"),
    /**
     * 墨西哥
     */
    MX("A1AM78C64UM0Y8");


    private final String marketPlaceId;


    MarketPlaces(String marketPlaceId) {
        this.marketPlaceId = marketPlaceId;


    }


    public String getMarketPlaceId() {
        return marketPlaceId;
    }

}
