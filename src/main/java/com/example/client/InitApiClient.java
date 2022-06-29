package com.example.client;

import com.example.singer.*;
import lombok.Data;

import java.util.Arrays;
import java.util.UUID;


/**
 * @author yalong
 */
@Data
public class InitApiClient<T> {
    private AWSAuthenticationCredentials awsAuthenticationCredentials;
    private AWSAuthenticationCredentialsProvider awsAuthenticationCredentialsProvider;
    private LWAAuthorizationCredentials lwaAuthorizationCredentials;

    public InitApiClient(String clientId,
                         String clientSecret,
                         String refreshToken,
                         String accessKeyId,
                         String secretKey,
                         String roleArn,
                         String region,
                         String endPoint
    ) {
        this.endPoint = endPoint;
        this.awsAuthenticationCredentials = AWSAuthenticationCredentials.builder()
                .accessKeyId(accessKeyId)
                .secretKey(secretKey)
                .region(region)
                .build();
        this.awsAuthenticationCredentialsProvider = AWSAuthenticationCredentialsProvider.builder()
                .roleArn(roleArn)
                .roleSessionName(UUID.randomUUID().toString())
                .build();

        String lwaEndPoint = "https://api.amazon.com/auth/o2/token";
        this.lwaAuthorizationCredentials = LWAAuthorizationCredentials.builder()
                .clientId(clientId)
                .clientSecret(clientSecret)
                .refreshToken(refreshToken)
                .endpoint(lwaEndPoint)
                .build();


    }

    /**
     * 申请app后LWA中的clientId
     */
    private String clientId;
    /**
     * 申请app后LWA中的clientSecret
     */

    private String clientSecret;
    /**
     * 店铺授权时产生的refreshToken或者app自授权生成的
     */

    private String refreshToken;
    /**
     * IAM user的accessKeyId
     */
    private String accessKeyId;
    /**
     * IAM user的secretKey
     */
    private String secretKey;

    /**
     * IAM role，特别注意：最好用IAM role当做IAM ARN去申请app,而不要用user
     * 而且IAM user需要添加内联策略STS关联上IAM role，具体操作看：https://www.spapi.org.cn/cn/model2/_2_console.html
     */
    private String roleArn;
    /**
     * 这里按照amazon对不同region的分区填写，例子是北美地区的
     */
    private String region;

    /**
     * 访问哪个区域
     */
    private String endPoint;

    public T build(Class<T> clazz) throws AuthBuilderException {
        try {
            ApiClient apiClient = new ApiClient()
                    .setAWSSigV4Signer(new AWSSigV4Signer(awsAuthenticationCredentials, awsAuthenticationCredentialsProvider))
                    .setLWAAuthorizationSigner(new LWAAuthorizationSigner(lwaAuthorizationCredentials))
                    .setBasePath(endPoint);
            return clazz.getDeclaredConstructor(ApiClient.class).newInstance(apiClient);

        } catch (Exception e) {
            throw new AuthBuilderException("构建认证信息错误:\n" + Arrays.toString(e.getStackTrace()) + "\n\n");
        }
    }
}
