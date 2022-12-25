/*
 * 测试标题
 * 测试描述
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.api;

import com.alipay.v3.ApiException;
import com.alipay.v3.ApiClient;
import com.alipay.v3.model.*;
import com.alipay.v3.util.model.AlipayConfig;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.model.CustomizedParams;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * API tests for OrdervoucherApi
 */
@Disabled
public class OrdervoucherApiTest {

    private final AlipayMarketingActivityOrdervoucherApi api = new AlipayMarketingActivityOrdervoucherApi();

    @BeforeEach
    public void setUp() throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://openapi.alipay.com");
        //初始化alipay参数（全局设置一次）
        AlipayConfig config = new AlipayConfig();
        config.setAppId("2014060600164699");
        config.setPrivateKey("");
        config.setAlipayPublicKey("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnaESDeU3bC5Vz03iwa8SlSVFoXkzf5ilLvTvS4j/GlcZwI/p/J7D32i6/1d/8ZZSxbb2fmVbScVP8CSZKRV7s+acumKlJHf5WV0nYgRJqjImI58AwsE37jYBjgKjVGyV9XOCMkS5vlKv4GSqITmHkIxT1fFhNvwrB1LUyaZfqOcE5ZiP/VOwAZFJsxh7+CGL+eNw6iSRH4OSSQq5M97uJPfzHrIMn7pG6J6Icsoi3aRX1HqxA9X+01D4OeDJhcTXTwVJxzGHunjKuU5+BKYNNGuY/WBr1BWF4gfvsIDJoGP1uhwHh5mKYM9t9CCh+9wRbERGRhvBGsg/gdVsdJlfFQIDAQAB");
//        config.setEncryptKey("zjUbGxz46RVpuXxbfItfUg==");
//        config.setAppId("2021003126695331");
//        config.setPrivateKey("");
//        config.setAppCertPath("src/test/resources/fixture/appCertPublicKey_2021003126695331.crt");
//        config.setAlipayPublicCertPath("src/test/resources/fixture/alipayCertPublicKey_RSA2.crt");
//        config.setRootCertPath("src/test/resources/fixture/alipayRootCert.crt");
//        config.setEncryptKey("RrAdgyCsnkoE1a9A8cW72w==");

        defaultClient.setAlipayConfig(config);
    }

    /**
     * 修改商家券活动发券数量上限
     *
     * 商家调用该接口修改商家券活动预算上限，以此来追加商家券活动预算。 修改商家券活动预算上限同步返回追加请求受理结果，后续通过alipay.marketing.activity.message.appended消息接口异步发送发券数量上限修改成功事件消息。 code_mode&#x3D;MERCHANT_UPLOAD场景下，必须先导入券码后，方可追加商家券预算。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void alipayMarketingActivityOrdervoucherAppendTest() throws ApiException {
        CustomizedParams params = new CustomizedParams();
        params.setAppAuthToken("app_auth_token");
        
        String activityId = "2016042700826004508401111111";

        AlipayMarketingActivityOrdervoucherAppendModel alipayMarketingActivityOrdervoucherAppendModel = new AlipayMarketingActivityOrdervoucherAppendModel();
        try {
            alipayMarketingActivityOrdervoucherAppendModel.setVoucherQuantity(15);
            Object response = api.append(activityId, alipayMarketingActivityOrdervoucherAppendModel, params);
        } catch (ApiException e) {
            AlipayMarketingActivityOrdervoucherAppendDefaultResponse errorObject = (AlipayMarketingActivityOrdervoucherAppendDefaultResponse) e.getErrorObject();
            if (errorObject != null && errorObject.getActualInstance() instanceof CommonErrorType) {
                CommonErrorType actualInstance = errorObject.getCommonErrorType();
                System.out.println("CommonErrorType:" + actualInstance.getCode());
            } else if (errorObject != null && errorObject.getActualInstance() instanceof AlipayMarketingActivityOrdervoucherAppendErrorResponseModel) {
                AlipayMarketingActivityOrdervoucherAppendErrorResponseModel actualInstance = errorObject.getAlipayMarketingActivityOrdervoucherAppendErrorResponseModel();
                System.out.println("AlipayMarketingActivityOrdervoucherAppendErrorResponseModel:" + actualInstance.getCode());
            } else {
                System.out.println("ApiException:" + e.getCode());
            }
        }
    }

}
