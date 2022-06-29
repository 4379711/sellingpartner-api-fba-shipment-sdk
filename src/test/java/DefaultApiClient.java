import com.example.client.ApiClient;
import com.example.client.Configuration;
import com.example.enums.Endpoints;
import com.example.singer.*;

import java.util.UUID;

/**
 * @author YaLong
 */
public class DefaultApiClient {

    public static void setApiClient() {
        LWAAuthorizationCredentials lwaAuthorizationCredentials = LWAAuthorizationCredentials.builder()
                .clientId("amzn1.application-oa2-client.xxx")
                .clientSecret("xxx")
                .refreshToken("xxx")
                .endpoint(Endpoints.NA.getAwsEndpoint())
                //.scopes()
                .build();
        LWAAccessTokenCacheImpl lwaAccessTokenCache = new LWAAccessTokenCacheImpl();
        LWAAuthorizationSigner lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials, lwaAccessTokenCache);

        AWSAuthenticationCredentials awsAuthenticationCredentials = AWSAuthenticationCredentials.builder()
                .accessKeyId("xxx")
                .secretKey("xxx")
                .region(Endpoints.NA.getAwsRegion())
                .build();

        AWSAuthenticationCredentialsProvider credentialsProvider = AWSAuthenticationCredentialsProvider.builder()
                .roleArn("arn:aws:iam::624717143949:role/xxx")
                .roleSessionName(UUID.randomUUID().toString())
                .build();

        AWSSigV4Signer awsSigV4Signer = new AWSSigV4Signer(awsAuthenticationCredentials, credentialsProvider);
        ApiClient defaultApiClient = Configuration.getDefaultApiClient();
        defaultApiClient.setAWSSigV4Signer(awsSigV4Signer);
        defaultApiClient.setLWAAuthorizationSigner(lwaAuthorizationSigner);
        defaultApiClient.setBasePath(Endpoints.NA.getSpEndpoint());
    }
}
