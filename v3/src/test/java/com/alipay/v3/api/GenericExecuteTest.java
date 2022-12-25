/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
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
import com.alipay.v3.ApiResponse;
import com.alipay.v3.util.GenericExecuteApi;
import com.alipay.v3.util.model.AlipayConfig;
import com.alipay.v3.Configuration;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alipay.v3.util.model.CustomizedParams;
import com.alipay.v3.util.model.OpenApiGenericRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * API tests for AlipayOpenFileApi
 */
@Disabled
public class GenericExecuteTest {

    private final GenericExecuteApi api = new GenericExecuteApi();

    @BeforeEach
    public void setUp() throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        //初始化alipay参数（全局设置一次）
        AlipayConfig config = new AlipayConfig();
        config.setAppId("2021003126677278");
        config.setPrivateKey("");
        config.setAlipayPublicKey("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlr+2Mir816Ye8ybsC8QgIigrG2oqVTwYeCjiJQPGP0x7iRVVwQuuM54rO+OyyfJcvI5UWFtfcpy+si+3JyaInKP69DA0AS4XkVPV/81xcIHMZP/CJAYOtLFLhhyEwp1CMoN45BtJes5lG65UXz/7QzVjcF+6AC+qVKx66HKSsT9b5HyWRxfDkOYixy1gZt39w+sgxaAPVt6pf7UZHX+ENE/gYpTCHHflVPzPfl8TIXTZmEMGqjBLY8GFXVJkvATX3h12VX3AwUlIndY4gJND9l1isFV9BfpmZYyv864z14UH6Kq9u8WVWdF5bsJevo4oU0Q0UB8EmyOdlxBPTDiOzwIDAQAB");
    //        config.setAppCertPath("src/test/resources/fixture/appCertPublicKey_2021003126695331.crt");
    //        config.setAlipayPublicCertPath("src/test/resources/fixture/alipayCertPublicKey_RSA2.crt");
    //        config.setRootCertPath("src/test/resources/fixture/alipayRootCert.crt");
        config.setEncryptKey("wEA0iV4eLSTV+o5/T9RKjg==");

        defaultClient.setAlipayConfig(config);
    }

    @Test
    public void testPageExecuteAndSdkExecute() throws ApiException {
        CustomizedParams params = new CustomizedParams();
//        params.setBodyContent("{" +
//                "    \"body\":\"对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。\"," +
//                "    \"subject\":\"大乐透\"," +
//                "    \"out_trade_no\":\"70501111111S001111119\"," +
//                "    \"timeout_express\":\"90m\"," +
//                "    \"total_amount\":9.00," +
//                "    \"product_code\":\"QUICK_WAP_WAY\"" +
//                "  }");
        Map<String, Object> bizParams = new HashMap<>();
//        bizParams.put("biz_content","{" +
//                "    \"body\":\"对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。\"," +
//                "    \"subject\":\"大乐透\"," +
//                "    \"out_trade_no\":\"70501111111S001111119\"," +
//                "    \"timeout_express\":\"90m\"," +
//                "    \"total_amount\":9.00," +
//                "    \"product_code\":\"QUICK_WAP_WAY\"" +
//                "  }");

        Map<String, Object> otherParams = new HashMap<>();
        otherParams.put("body","对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。");
        otherParams.put("subject","大乐透");
        otherParams.put("out_trade_no","70501111111S001111119");
        otherParams.put("timeout_express","90m");
        otherParams.put("total_amount",9.00);
        List<String> list = new ArrayList<>();
        list.add("QUICK_WAP_WAY");
        otherParams.put("product_code",list);
        bizParams.put("biz_content", otherParams);
//        AlipayMarketingActivityOrdervoucherAppendModel model = new AlipayMarketingActivityOrdervoucherAppendModel();
//        model.setProductVersion("大乐透");
//        model.setOutBizNo("70501111111S001111119");
//        model.setVoucherQuantity(new BigDecimal(15));
//        bizParams.put("biz_content",model);

        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("ws_server_url","open.alipay.com");
        queryParams.put("notify_url","https://www.aaa.com");
        queryParams.put("return_url","https://www.bbb.com");
        params.setQueryParams(queryParams);

        String response = api.pageExecute("alipay.trade.wap.pay", "POST", bizParams, "11223344", "232422", params);
        System.out.println(response);

        String response2 = api.pageExecute("alipay.trade.wap.pay", "get", bizParams, "11223344", "232422", params);
        System.out.println(response2);

        String response3 = api.sdkExecute("alipay.trade.wap.pay", bizParams, "11223344", "232422", params);
        System.out.println(response3);
    }

    @Test
    public void testExecute() throws ApiException {
        OpenApiGenericRequest request = new OpenApiGenericRequest();
        request.setAppAuthToken("app_auth_token");

        Map<String, Object> pathParams = new HashMap<>();
        pathParams.put("activity_id", "2016042700826004508401111111");
        pathParams.put("voucher_code", "ABE44");
        request.setPathParams(pathParams);

        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("return_url", "www.baidu.com");
        request.setQueryParams(queryParams);

        Map<String, Object> bizParams = new HashMap<>();
        bizParams.put("merchant_access_mode", "AGENCY_MODE");
        bizParams.put("biz_dt", "2017-01-01 00:00:01");
        bizParams.put("out_biz_no", "1002600620019090123143254436");
        bizParams.put("total_fee", "999.99");
        request.setBizParams(bizParams);

        ApiResponse<Object> response = api.execute("/v3/alipay/marketing/activity/{activity_id}/voucher/{voucher_code}/refund", "POST", request);
        System.out.println(response.getData());
    }

    @Test
    public void testExecuteFile() throws ApiException {
        GenericExecuteApi api = new GenericExecuteApi();
        OpenApiGenericRequest request = new OpenApiGenericRequest();
        request.setAppAuthToken("app_auth_token");

        Map<String, File> fileParams = new HashMap<>();
        fileParams.put("app_logo", new File("src/test/resources/fixture/图片1.png"));
        request.setFileParams(fileParams);

        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("return_url", "www.baidu.com");
        request.setQueryParams(queryParams);

        Map<String, Object> bizParams = new HashMap<>();
        bizParams.put("app_category_ids", "11_12;12_13");
        bizParams.put("app_english_name", "demoexample");
        bizParams.put("app_name", "杭州支小宝潮流女装店");
        bizParams.put("service_email", "example@mail.com");
        request.setBizParams(bizParams);

        ApiResponse<Object> response = api.execute("/v3/alipay/open/mini/baseinfo/modify", "POST", request);
        System.out.println(response.getData());
    }

}
