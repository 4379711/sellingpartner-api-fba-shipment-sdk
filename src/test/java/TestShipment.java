
import com.example.api.feed.FeedsApi;
import com.example.api.inbound.FbaInboundApi;
import com.example.client.ApiException;
import com.example.documents.FileHelper;
import com.example.enums.MarketPlaces;
import com.example.model.feed.*;
import com.example.model.inbound.*;
import org.threeten.bp.LocalDate;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author yaLong
 */
public class TestShipment {

    static {
        DefaultApiClient.setApiClient();
    }

    //feed上传文件模板地址
    //https://sellercentral.amazon.com/help/hub/reference/G1641

    private final FbaInboundApi inboundApi = new FbaInboundApi();
    private final FeedsApi feedsApi = new FeedsApi();

    private final String asin1 = "B09xxx";
    private final String sku1 = "main6.1-case";
    private final String fnsku1 = "X0HQFVP";
    private final Integer sku1Quantity = 48888;

    private final String asin2 = "B07xxx";
    private final String sku2 = "En-Mxx";
    private final String fnsku2 = "X002xxx";
    private final Integer sku2Quantity = 20;

    private final String shipmentName = "测试发货-20220629";
    /**
     * 地址,必须全局用同一个
     */
    private final Address address;


    {
        address = new Address();
        address.setName("my address");
        address.setAddressLine1("556 E ORANGE SHPW RD");
        address.setCity("SAN BERNARDINO");
        address.setStateOrProvinceCode("CA");
        address.setCountryCode("US");
        address.setPostalCode("92408");

    }

    private CreateInboundShipmentPlanResponse createInboundShipmentPlan() throws ApiException {
        PrepDetails prepDetails = new PrepDetails();
        prepDetails.setPrepInstruction(PrepInstruction.LABELING);
        prepDetails.setPrepOwner(PrepOwner.SELLER);
        PrepDetailsList prepDetailsList = new PrepDetailsList();
        prepDetailsList.add(prepDetails);

        InboundShipmentPlanRequestItemList shipmentPlanRequestItemList = new InboundShipmentPlanRequestItemList();
        // 发货计划信息
        InboundShipmentPlanRequestItem item1 = new InboundShipmentPlanRequestItem();
        item1.setCondition(Condition.NEWITEM);
        item1.setQuantity(sku1Quantity);
        item1.setSellerSKU(sku1);
        item1.setASIN(asin1);
        item1.setPrepDetailsList(prepDetailsList);
        //单独包装必须指定每箱数量,每箱数量*箱子数=总发货量; 混装写1就行了
        item1.setQuantityInCase(1);

//        InboundShipmentPlanRequestItem item2 = new InboundShipmentPlanRequestItem();
//        item2.setCondition(Condition.NEWITEM);
//        item2.setQuantity(sku2Quantity);
//        item2.setSellerSKU(sku2);
//        item2.setASIN(asin2);
//        item2.setPrepDetailsList(prepDetailsList);
//        item2.setQuantityInCase(1);

        shipmentPlanRequestItemList.add(item1);
//        shipmentPlanRequestItemList.add(item2);

        CreateInboundShipmentPlanRequest createInboundShipmentPlanRequest = new CreateInboundShipmentPlanRequest();
        createInboundShipmentPlanRequest.setShipFromAddress(address);
        createInboundShipmentPlanRequest.setInboundShipmentPlanRequestItems(shipmentPlanRequestItemList);
        createInboundShipmentPlanRequest.setLabelPrepPreference(LabelPrepPreference.SELLER_LABEL);

        return inboundApi.createInboundShipmentPlan(createInboundShipmentPlanRequest);

    }

    private InboundShipmentResponse createShipment(String shipmentId, String centerId) throws ApiException {
        InboundShipmentRequest inboundShipmentRequest = this.buildInboundShipmentRequest(shipmentId, ShipmentStatus.WORKING, centerId);
        return inboundApi.createInboundShipment(inboundShipmentRequest, shipmentId);
    }

    private InboundShipmentResponse updateInboundShipment(String shipmentId, ShipmentStatus status, String centerId) throws ApiException {
        InboundShipmentRequest inboundShipmentRequest = this.buildInboundShipmentRequest(shipmentId, status, centerId);
        return inboundApi.updateInboundShipment(inboundShipmentRequest, shipmentId);
    }


    private InboundShipmentRequest buildInboundShipmentRequest(String shipmentId, ShipmentStatus status, String centerId) {
        // 头部信息
        InboundShipmentHeader inboundShipmentHeader = new InboundShipmentHeader();
        inboundShipmentHeader.setShipmentName(shipmentName);
        inboundShipmentHeader.setShipFromAddress(address);
        inboundShipmentHeader.setDestinationFulfillmentCenterId(centerId);
        inboundShipmentHeader.setShipmentStatus(status);
        inboundShipmentHeader.setLabelPrepPreference(LabelPrepPreference.SELLER_LABEL);
        inboundShipmentHeader.setIntendedBoxContentsSource(IntendedBoxContentsSource.FEED);
        //是否是单独包装,一般选混装
        inboundShipmentHeader.setAreCasesRequired(false);

        // 发货详情
        InboundShipmentItem item1 = new InboundShipmentItem();
        item1.setSellerSKU(sku1);
        item1.setQuantityShipped(sku1Quantity);
        item1.setShipmentId(shipmentId);
        item1.setFulfillmentNetworkSKU(fnsku1);
        //设置三天后交给承运人
        item1.setReleaseDate(LocalDate.now().plusDays(3));
        //item1.setQuantityInCase(1);

//        InboundShipmentItem item2 = new InboundShipmentItem();
//        item2.setSellerSKU(sku2);
//        item2.setQuantityShipped(sku2Quantity);
//        item2.setShipmentId(shipmentId);
//        item2.setFulfillmentNetworkSKU(fnsku2);
//        item2.setReleaseDate(LocalDate.of(2022, 3, 12));
        //item1.setQuantityInCase(2);

        InboundShipmentItemList inboundShipmentItems = new InboundShipmentItemList();
        inboundShipmentItems.add(item1);
//        inboundShipmentItems.add(item2);

        InboundShipmentRequest inboundShipmentRequest = new InboundShipmentRequest();
        inboundShipmentRequest.setInboundShipmentHeader(inboundShipmentHeader);
        inboundShipmentRequest.setMarketplaceId(MarketPlaces.US.getMarketPlaceId());
        inboundShipmentRequest.setInboundShipmentItems(inboundShipmentItems);

        return inboundShipmentRequest;
    }

    private PutTransportDetailsResponse putTransportDetails(String shipmentId, String trackingId) throws ApiException {
        //亚马逊默认纸箱数量为1,所以这个list只能放一个元素
        return this.putTransportDetailsN(shipmentId, trackingId, 1);
    }

    private PutTransportDetailsResponse putTransportDetailsN(String shipmentId, String trackingId, int cartonNumber) throws ApiException {
        PutTransportDetailsRequest putTransportDetailsRequest = new PutTransportDetailsRequest();
        putTransportDetailsRequest.setIsPartnered(false);
        putTransportDetailsRequest.setShipmentType(ShipmentType.SP);
        TransportDetailInput transportDetailInput = new TransportDetailInput();
        NonPartneredSmallParcelDataInput nonPartneredSmallParcelDataInput = new NonPartneredSmallParcelDataInput();
        nonPartneredSmallParcelDataInput.setCarrierName("other");
        //实际纸箱是多少个,这个list放多少个元素
        NonPartneredSmallParcelPackageInputList list = new NonPartneredSmallParcelPackageInputList();
        NonPartneredSmallParcelPackageInput packageInput = new NonPartneredSmallParcelPackageInput();
        //理论上要每个箱子一个追踪单号,多个箱子可以是同一个追踪单号
        packageInput.setTrackingId(trackingId);
        for (int i = 0; i < cartonNumber; i++) {
            list.add(packageInput);
        }
        nonPartneredSmallParcelDataInput.setPackageList(list);
        transportDetailInput.setNonPartneredSmallParcelData(nonPartneredSmallParcelDataInput);
        putTransportDetailsRequest.setTransportDetails(transportDetailInput);
        return inboundApi.putTransportDetails(putTransportDetailsRequest, shipmentId);
    }

    private void uploadSize() throws ApiException {
        String contentType = "application/vnd.ms-excel";
        CreateFeedDocumentSpecification createFeedDocumentSpecification = new CreateFeedDocumentSpecification();
        createFeedDocumentSpecification.setContentType(contentType);
        CreateFeedDocumentResponse createFeedDocumentResponse = feedsApi.createFeedDocument(createFeedDocumentSpecification);
        String feedDocumentId = createFeedDocumentResponse.getFeedDocumentId();
        String url = createFeedDocumentResponse.getUrl();

        String filePath = "src/main/resources/test.xlsx";

        byte[] source = null;
        try {
            source = Files.readAllBytes(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (source == null) {
            System.out.println("文件读取错误");
            return;
        }
        FileHelper.upload(source, url, contentType);
        CreateFeedSpecification createFeedSpecification = new CreateFeedSpecification();
        createFeedSpecification.setFeedType("POST_FLAT_FILE_FROM_EXCEL_FBA_CREATE_CARTON_INFO");
        createFeedSpecification.setMarketplaceIds(Collections.singletonList(MarketPlaces.US.getMarketPlaceId()));
        createFeedSpecification.setInputFeedDocumentId(feedDocumentId);
        //createFeedSpecification.setFeedOptions();
        CreateFeedResponse createFeedResponse = feedsApi.createFeed(createFeedSpecification);
        String feedId = createFeedResponse.getFeedId();
        System.out.println("feedId:" + feedId);
        Feed feed;
        while (true) {
            feed = feedsApi.getFeed(feedId);
            System.out.println(feed);
            if (feed.getProcessingStatus() != Feed.ProcessingStatusEnum.DONE) {
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException ignored) {
                }
            } else {
                break;
            }
        }
        String resultFeedDocumentId = feed.getResultFeedDocumentId();
        System.out.println("resultFeedDocumentId:" + resultFeedDocumentId);
        FeedDocument feedDocument = feedsApi.getFeedDocument(resultFeedDocumentId);
        System.out.println(feedDocument);


    }

    private void uploadCarton() throws ApiException {
        String contentType = String.format("text/xml; charset=%s", StandardCharsets.UTF_8);
        CreateFeedDocumentSpecification createFeedDocumentSpecification = new CreateFeedDocumentSpecification();
        createFeedDocumentSpecification.setContentType(contentType);
        CreateFeedDocumentResponse createFeedDocumentResponse = feedsApi.createFeedDocument(createFeedDocumentSpecification);
        String feedDocumentId = createFeedDocumentResponse.getFeedDocumentId();
        String url = createFeedDocumentResponse.getUrl();

        String filePath = "src/main/resources/carton.xml";

        byte[] source = null;
        try {
            source = Files.readAllBytes(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (source == null) {
            System.out.println("文件读取错误");
            return;
        }
        FileHelper.upload(source, url, contentType);
        CreateFeedSpecification createFeedSpecification = new CreateFeedSpecification();
        createFeedSpecification.setFeedType("POST_FBA_INBOUND_CARTON_CONTENTS");
        createFeedSpecification.setMarketplaceIds(Collections.singletonList(MarketPlaces.US.getMarketPlaceId()));
        createFeedSpecification.setInputFeedDocumentId(feedDocumentId);
        //createFeedSpecification.setFeedOptions();
        CreateFeedResponse createFeedResponse = feedsApi.createFeed(createFeedSpecification);
        String feedId = createFeedResponse.getFeedId();
        System.out.println("feedId:" + feedId);
        Feed feed;
        while (true) {
            feed = feedsApi.getFeed(feedId);
            System.out.println(feed);
            if (feed.getProcessingStatus() != Feed.ProcessingStatusEnum.DONE) {
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException ignored) {
                }
            } else {
                break;
            }
        }
        String resultFeedDocumentId = feed.getResultFeedDocumentId();
        System.out.println("resultFeedDocumentId:" + resultFeedDocumentId);
        FeedDocument feedDocument = feedsApi.getFeedDocument(resultFeedDocumentId);
        System.out.println(feedDocument);

    }

    private GetLabelsResponse getLabels(String shipmentId, Integer pageSize) throws ApiException {
        //一页纸打印几个
        String pageType = "PackageLabel_Plain_Paper";
        String labelType = "BARCODE_2D";
        Integer numberOfPackages = null;
        List<String> packageLabelsToPrint = null;
        Integer numberOfPallets = null;
        Integer pageStartIndex = 0;
        return inboundApi.getLabels(shipmentId, pageType, labelType, numberOfPackages, packageLabelsToPrint, numberOfPallets, pageSize, pageStartIndex);
    }

    /**
     * 亚马逊货件上传
     */
    public void uploadShipment() {
        try {
            // 1. 创建货件计划：createInboundShipmentPlan
//            CreateInboundShipmentPlanResponse inboundShipmentPlan = createInboundShipmentPlan();
//            System.out.println(inboundShipmentPlan);
//            InboundShipmentPlanList inboundShipmentPlans = inboundShipmentPlan.getPayload().getInboundShipmentPlans();
//            String shipmentId = inboundShipmentPlans.get(0).getShipmentId();
//            String centerId = inboundShipmentPlans.get(0).getDestinationFulfillmentCenterId();

            // 从创建计划的响应中得到的信息
            String shipmentId = "FBA16QDMKLKY";
            String centerId = "LGB8";
//            //
            // 2. 确认创建货件：createInboundShipment
//            InboundShipmentResponse inboundShipmentResponse = createShipment(shipmentId, centerId);
//            System.out.println(inboundShipmentResponse);

            // 3. 修改货件的运输信息：putTransportDetails
            //运单号不能为空,这里传个空格
//            String trackingId = " ";
//            PutTransportDetailsResponse putTransportDetailsResponse = putTransportDetails(shipmentId, trackingId);
//            System.out.println(putTransportDetailsResponse);

            // 4. 上传箱子尺寸信息：POST_FLAT_FILE_FROM_EXCEL_FBA_CREATE_CARTON_INFO  type:application/vnd.ms-excel
//            uploadSize();

            // 5. 上传亚马逊纸箱内容：POST_FBA_INBOUND_CARTON_CONTENTS
//            uploadCarton();

            // 6. 打印标签：getLabels
//            Integer pageSize = 3;
//            GetLabelsResponse labels = getLabels(shipmentId,pageSize);
//            System.out.println(labels.getPayload());

            // 7. 更改为发货(更改运单号会自动变为发货状态,这里还需要设置吗?)：updateInboundShipment
//            InboundShipmentResponse inboundShipmentResponse = updateInboundShipment(shipmentId, ShipmentStatus.SHIPPED, centerId);
//            System.out.println(inboundShipmentResponse);

            // 8. 更改每个箱子的运单号：putTransportDetails
//            String trackingId = "1Z82Y0V20449283817";
//            PutTransportDetailsResponse putTransportDetailsResponse = putTransportDetailsN(shipmentId, trackingId,3);
//            System.out.println(putTransportDetailsResponse);

            //9.重新上传excel尺寸重量
            uploadSize();

            //10.查询信息
//            GetShipmentItemsResponse response = inboundApi.getShipmentItemsByShipmentId(shipmentId, MarketPlaces.US.getMarketPlaceId());
            GetTransportDetailsResponse response = inboundApi.getTransportDetails(shipmentId);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }

    }

    public static void main(String[] args) {
        TestShipment testShipment = new TestShipment();
        testShipment.uploadShipment();

    }

}
