/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2022-12-30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.api;

import com.alipay.v3.ApiCallback;
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.ApiResponse;
import com.alipay.v3.Configuration;
import com.alipay.v3.Pair;
import com.alipay.v3.ProgressRequestBody;
import com.alipay.v3.ProgressResponseBody;
import com.alipay.v3.util.AlipayLogger;
import com.alipay.v3.util.model.CustomizedParams;

import com.google.common.base.Strings;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.alipay.v3.model.ZhimaCustomerJobworthInfoQueryDefaultResponse;
import com.alipay.v3.model.ZhimaCustomerJobworthInfoQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ZhimaCustomerJobworthInfoApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ZhimaCustomerJobworthInfoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZhimaCustomerJobworthInfoApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for query
     * @param userName 姓名 (optional)
     * @param connKey 外部订单号，zhima.credit.payafteruse.creditagreement.sign的入参 out_agreement_no智能简历场景支持只传该值 (optional)
     * @param certNo 证件号 ，根据cert_type类型设置对应证件号码，选择身份证校验时必传 (optional)
     * @param userId 蚂蚁统一会员ID ，为2088开头的唯一标识 选择支付宝uid检验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先 (optional)
     * @param openId 蚂蚁统一会员ID ，为2088开头的唯一标识 选择支付宝uid检验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先 (optional)
     * @param backUrl 若用户没有开通工作证或者芝麻，成功开通后回跳的链接 ，支持http或schema地址 (optional)
     * @param certType 证件类型 ，枚举值： 0:身份证1:护照2:台湾同胞回乡证3:港澳居民往来内地通行证4:台湾居民通行证5:港澳居民通行证 选择身份证校验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先 (optional)
     * @param kaVisitorId 商户内部的唯一id如果是需要返回h5页面必填 (optional)
     * @param visitorType 访问类型 C &#x3D; company  or P &#x3D; person 如果是需要返回h5页面必填 (optional)
     * @param visitorName 商户侧配置访客名称 如果是需要返回h5页面必填 (optional)
     * @param companyCertificate 公司社会统一代码h5页面访客展示使用 (optional)
     * @param visitorUrl 上传图片接口返回的id (optional)
     * @param hasButton 在h5页面是否展示底部跳转按钮 (optional)
     * @param hasNumber true or false 是否展示 (optional)
     * @param hasQrCode 是否展示二维码 (optional)
     * @param hasHtml 是否需要返回h5页面 (optional)
     * @param jobId 对外使用的jobid (optional)
     * @param industryId 行业描述ID (optional)
     * @param cloudResumeScene 子场景 (optional)
     * @param _callback Callback for upload/download progress
     * @param customizedParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call queryCall(String userName, String connKey, String certNo, String userId, String openId, String backUrl, String certType, String kaVisitorId, String visitorType, String visitorName, String companyCertificate, String visitorUrl, Boolean hasButton, Boolean hasNumber, Boolean hasQrCode, Boolean hasHtml, String jobId, String industryId, String cloudResumeScene, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/zhima/customer/jobworth/info/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (userName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_name", userName));
        }

        if (connKey != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("conn_key", connKey));
        }

        if (certNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cert_no", certNo));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_id", userId));
        }

        if (openId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("open_id", openId));
        }

        if (backUrl != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("back_url", backUrl));
        }

        if (certType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cert_type", certType));
        }

        if (kaVisitorId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ka_visitor_id", kaVisitorId));
        }

        if (visitorType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("visitor_type", visitorType));
        }

        if (visitorName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("visitor_name", visitorName));
        }

        if (companyCertificate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("company_certificate", companyCertificate));
        }

        if (visitorUrl != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("visitor_url", visitorUrl));
        }

        if (hasButton != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("has_button", hasButton));
        }

        if (hasNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("has_number", hasNumber));
        }

        if (hasQrCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("has_qr_code", hasQrCode));
        }

        if (hasHtml != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("has_html", hasHtml));
        }

        if (jobId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("job_id", jobId));
        }

        if (industryId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("industry_id", industryId));
        }

        if (cloudResumeScene != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cloud_resume_scene", cloudResumeScene));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (customizedParams != null) {
            //额外query参数
            if (customizedParams.getQueryParams() != null && customizedParams.getQueryParams().size() > 0) {
                for (Map.Entry<String, String> entry : customizedParams.getQueryParams().entrySet()) {
                    localVarQueryParams.addAll(localVarApiClient.parameterToPair(entry.getKey(), entry.getValue()));
                }
            }

            if (!Strings.isNullOrEmpty(customizedParams.getAppAuthToken())) {
                localVarHeaderParams.put("alipay-app-auth-token", customizedParams.getAppAuthToken());
            }

            //额外非全局header参数
            if (customizedParams.getHeaderParams() != null && customizedParams.getHeaderParams().size() > 0) {
                localVarHeaderParams.putAll(customizedParams.getHeaderParams());
            }
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call queryValidateBeforeCall(String userName, String connKey, String certNo, String userId, String openId, String backUrl, String certType, String kaVisitorId, String visitorType, String visitorName, String companyCertificate, String visitorUrl, Boolean hasButton, Boolean hasNumber, Boolean hasQrCode, Boolean hasHtml, String jobId, String industryId, String cloudResumeScene, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(userName, connKey, certNo, userId, openId, backUrl, certType, kaVisitorId, visitorType, visitorName, companyCertificate, visitorUrl, hasButton, hasNumber, hasQrCode, hasHtml, jobId, industryId, cloudResumeScene, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 职得工作证信息查询
     * 查询用户职得工作证信息 查询方式3选1，都设置时uid优先 1、支付宝uid查询：user_id 2、身份证+姓名查询：cert_type+cert_no 3、智能简历场景：conn_key
     * @param userName 姓名 (optional)
     * @param connKey 外部订单号，zhima.credit.payafteruse.creditagreement.sign的入参 out_agreement_no智能简历场景支持只传该值 (optional)
     * @param certNo 证件号 ，根据cert_type类型设置对应证件号码，选择身份证校验时必传 (optional)
     * @param userId 蚂蚁统一会员ID ，为2088开头的唯一标识 选择支付宝uid检验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先 (optional)
     * @param openId 蚂蚁统一会员ID ，为2088开头的唯一标识 选择支付宝uid检验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先 (optional)
     * @param backUrl 若用户没有开通工作证或者芝麻，成功开通后回跳的链接 ，支持http或schema地址 (optional)
     * @param certType 证件类型 ，枚举值： 0:身份证1:护照2:台湾同胞回乡证3:港澳居民往来内地通行证4:台湾居民通行证5:港澳居民通行证 选择身份证校验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先 (optional)
     * @param kaVisitorId 商户内部的唯一id如果是需要返回h5页面必填 (optional)
     * @param visitorType 访问类型 C &#x3D; company  or P &#x3D; person 如果是需要返回h5页面必填 (optional)
     * @param visitorName 商户侧配置访客名称 如果是需要返回h5页面必填 (optional)
     * @param companyCertificate 公司社会统一代码h5页面访客展示使用 (optional)
     * @param visitorUrl 上传图片接口返回的id (optional)
     * @param hasButton 在h5页面是否展示底部跳转按钮 (optional)
     * @param hasNumber true or false 是否展示 (optional)
     * @param hasQrCode 是否展示二维码 (optional)
     * @param hasHtml 是否需要返回h5页面 (optional)
     * @param jobId 对外使用的jobid (optional)
     * @param industryId 行业描述ID (optional)
     * @param cloudResumeScene 子场景 (optional)
     * @return ZhimaCustomerJobworthInfoQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ZhimaCustomerJobworthInfoQueryResponseModel query(String userName, String connKey, String certNo, String userId, String openId, String backUrl, String certType, String kaVisitorId, String visitorType, String visitorName, String companyCertificate, String visitorUrl, Boolean hasButton, Boolean hasNumber, Boolean hasQrCode, Boolean hasHtml, String jobId, String industryId, String cloudResumeScene) throws ApiException {
        ApiResponse<ZhimaCustomerJobworthInfoQueryResponseModel> localVarResp = queryWithHttpInfo(userName, connKey, certNo, userId, openId, backUrl, certType, kaVisitorId, visitorType, visitorName, companyCertificate, visitorUrl, hasButton, hasNumber, hasQrCode, hasHtml, jobId, industryId, cloudResumeScene, null);
        return localVarResp.getData();
    }

    public ZhimaCustomerJobworthInfoQueryResponseModel query(String userName, String connKey, String certNo, String userId, String openId, String backUrl, String certType, String kaVisitorId, String visitorType, String visitorName, String companyCertificate, String visitorUrl, Boolean hasButton, Boolean hasNumber, Boolean hasQrCode, Boolean hasHtml, String jobId, String industryId, String cloudResumeScene, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<ZhimaCustomerJobworthInfoQueryResponseModel> localVarResp = queryWithHttpInfo(userName, connKey, certNo, userId, openId, backUrl, certType, kaVisitorId, visitorType, visitorName, companyCertificate, visitorUrl, hasButton, hasNumber, hasQrCode, hasHtml, jobId, industryId, cloudResumeScene, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 职得工作证信息查询
     * 查询用户职得工作证信息 查询方式3选1，都设置时uid优先 1、支付宝uid查询：user_id 2、身份证+姓名查询：cert_type+cert_no 3、智能简历场景：conn_key
     * @param userName 姓名 (optional)
     * @param connKey 外部订单号，zhima.credit.payafteruse.creditagreement.sign的入参 out_agreement_no智能简历场景支持只传该值 (optional)
     * @param certNo 证件号 ，根据cert_type类型设置对应证件号码，选择身份证校验时必传 (optional)
     * @param userId 蚂蚁统一会员ID ，为2088开头的唯一标识 选择支付宝uid检验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先 (optional)
     * @param openId 蚂蚁统一会员ID ，为2088开头的唯一标识 选择支付宝uid检验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先 (optional)
     * @param backUrl 若用户没有开通工作证或者芝麻，成功开通后回跳的链接 ，支持http或schema地址 (optional)
     * @param certType 证件类型 ，枚举值： 0:身份证1:护照2:台湾同胞回乡证3:港澳居民往来内地通行证4:台湾居民通行证5:港澳居民通行证 选择身份证校验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先 (optional)
     * @param kaVisitorId 商户内部的唯一id如果是需要返回h5页面必填 (optional)
     * @param visitorType 访问类型 C &#x3D; company  or P &#x3D; person 如果是需要返回h5页面必填 (optional)
     * @param visitorName 商户侧配置访客名称 如果是需要返回h5页面必填 (optional)
     * @param companyCertificate 公司社会统一代码h5页面访客展示使用 (optional)
     * @param visitorUrl 上传图片接口返回的id (optional)
     * @param hasButton 在h5页面是否展示底部跳转按钮 (optional)
     * @param hasNumber true or false 是否展示 (optional)
     * @param hasQrCode 是否展示二维码 (optional)
     * @param hasHtml 是否需要返回h5页面 (optional)
     * @param jobId 对外使用的jobid (optional)
     * @param industryId 行业描述ID (optional)
     * @param cloudResumeScene 子场景 (optional)
     * @return ApiResponse&lt;ZhimaCustomerJobworthInfoQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ZhimaCustomerJobworthInfoQueryResponseModel> queryWithHttpInfo(String userName, String connKey, String certNo, String userId, String openId, String backUrl, String certType, String kaVisitorId, String visitorType, String visitorName, String companyCertificate, String visitorUrl, Boolean hasButton, Boolean hasNumber, Boolean hasQrCode, Boolean hasHtml, String jobId, String industryId, String cloudResumeScene, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(userName, connKey, certNo, userId, openId, backUrl, certType, kaVisitorId, visitorType, visitorName, companyCertificate, visitorUrl, hasButton, hasNumber, hasQrCode, hasHtml, jobId, industryId, cloudResumeScene, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<ZhimaCustomerJobworthInfoQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<ZhimaCustomerJobworthInfoQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 职得工作证信息查询 (asynchronously)
     * 查询用户职得工作证信息 查询方式3选1，都设置时uid优先 1、支付宝uid查询：user_id 2、身份证+姓名查询：cert_type+cert_no 3、智能简历场景：conn_key
     * @param userName 姓名 (optional)
     * @param connKey 外部订单号，zhima.credit.payafteruse.creditagreement.sign的入参 out_agreement_no智能简历场景支持只传该值 (optional)
     * @param certNo 证件号 ，根据cert_type类型设置对应证件号码，选择身份证校验时必传 (optional)
     * @param userId 蚂蚁统一会员ID ，为2088开头的唯一标识 选择支付宝uid检验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先 (optional)
     * @param openId 蚂蚁统一会员ID ，为2088开头的唯一标识 选择支付宝uid检验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先 (optional)
     * @param backUrl 若用户没有开通工作证或者芝麻，成功开通后回跳的链接 ，支持http或schema地址 (optional)
     * @param certType 证件类型 ，枚举值： 0:身份证1:护照2:台湾同胞回乡证3:港澳居民往来内地通行证4:台湾居民通行证5:港澳居民通行证 选择身份证校验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先 (optional)
     * @param kaVisitorId 商户内部的唯一id如果是需要返回h5页面必填 (optional)
     * @param visitorType 访问类型 C &#x3D; company  or P &#x3D; person 如果是需要返回h5页面必填 (optional)
     * @param visitorName 商户侧配置访客名称 如果是需要返回h5页面必填 (optional)
     * @param companyCertificate 公司社会统一代码h5页面访客展示使用 (optional)
     * @param visitorUrl 上传图片接口返回的id (optional)
     * @param hasButton 在h5页面是否展示底部跳转按钮 (optional)
     * @param hasNumber true or false 是否展示 (optional)
     * @param hasQrCode 是否展示二维码 (optional)
     * @param hasHtml 是否需要返回h5页面 (optional)
     * @param jobId 对外使用的jobid (optional)
     * @param industryId 行业描述ID (optional)
     * @param cloudResumeScene 子场景 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call queryAsync(String userName, String connKey, String certNo, String userId, String openId, String backUrl, String certType, String kaVisitorId, String visitorType, String visitorName, String companyCertificate, String visitorUrl, Boolean hasButton, Boolean hasNumber, Boolean hasQrCode, Boolean hasHtml, String jobId, String industryId, String cloudResumeScene, final ApiCallback<ZhimaCustomerJobworthInfoQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(userName, connKey, certNo, userId, openId, backUrl, certType, kaVisitorId, visitorType, visitorName, companyCertificate, visitorUrl, hasButton, hasNumber, hasQrCode, hasHtml, jobId, industryId, cloudResumeScene, _callback, null);
        Type localVarReturnType = new TypeToken<ZhimaCustomerJobworthInfoQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String userName, String connKey, String certNo, String userId, String openId, String backUrl, String certType, String kaVisitorId, String visitorType, String visitorName, String companyCertificate, String visitorUrl, Boolean hasButton, Boolean hasNumber, Boolean hasQrCode, Boolean hasHtml, String jobId, String industryId, String cloudResumeScene, final ApiCallback<ZhimaCustomerJobworthInfoQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(userName, connKey, certNo, userId, openId, backUrl, certType, kaVisitorId, visitorType, visitorName, companyCertificate, visitorUrl, hasButton, hasNumber, hasQrCode, hasHtml, jobId, industryId, cloudResumeScene, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<ZhimaCustomerJobworthInfoQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}