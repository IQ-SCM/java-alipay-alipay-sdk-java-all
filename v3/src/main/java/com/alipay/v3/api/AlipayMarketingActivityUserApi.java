/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2022-12-23
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


import com.alipay.v3.model.AlipayMarketingActivityUserBatchqueryvoucherDefaultResponse;
import com.alipay.v3.model.AlipayMarketingActivityUserBatchqueryvoucherResponseModel;
import com.alipay.v3.model.AlipayMarketingActivityUserQueryvoucherDefaultResponse;
import com.alipay.v3.model.AlipayMarketingActivityUserQueryvoucherResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayMarketingActivityUserApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayMarketingActivityUserApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayMarketingActivityUserApi(ApiClient apiClient) {
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
     * Build call for batchqueryvoucher
     * @param activityId 活动 id (required)
     * @param authToken 用户授权令牌 (optional)
     * @param userId 支付宝用户 id (optional)
     * @param openId 支付宝用户openId (optional)
     * @param belongMerchantId 券归属商户 (optional)
     * @param senderMerchantId 券发放商户 (optional)
     * @param voucherStatus 券状态，其中已过期状态可查询6个月内的数据 (optional)
     * @param pageNum 分页查询页码 (optional)
     * @param merchantAccessMode 商户接入模式 (optional)
     * @param pageSize 分页查询单页数据条数 (optional)
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
    public okhttp3.Call batchqueryvoucherCall(String activityId, String authToken, String userId, String openId, String belongMerchantId, String senderMerchantId, String voucherStatus, Integer pageNum, String merchantAccessMode, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/marketing/activity/{activity_id}/user/batchqueryvoucher"
            .replaceAll("\\{" + "activity_id" + "\\}", localVarApiClient.escapeString(activityId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("auth_token", authToken));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_id", userId));
        }

        if (openId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("open_id", openId));
        }

        if (belongMerchantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("belong_merchant_id", belongMerchantId));
        }

        if (senderMerchantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sender_merchant_id", senderMerchantId));
        }

        if (voucherStatus != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("voucher_status", voucherStatus));
        }

        if (pageNum != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_num", pageNum));
        }

        if (merchantAccessMode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("merchant_access_mode", merchantAccessMode));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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
    private okhttp3.Call batchqueryvoucherValidateBeforeCall(String activityId, String authToken, String userId, String openId, String belongMerchantId, String senderMerchantId, String voucherStatus, Integer pageNum, String merchantAccessMode, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        
        // verify the required parameter 'activityId' is set
        if (activityId == null) {
            throw new ApiException("Missing the required parameter 'activityId' when calling batchqueryvoucher(Async)");
        }
        

        okhttp3.Call localVarCall = batchqueryvoucherCall(activityId, authToken, userId, openId, belongMerchantId, senderMerchantId, voucherStatus, pageNum, merchantAccessMode, pageSize, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 条件查询用户券
     * 可通过该接口查询用户在某商户可用的全部券，可用于商户的小程序/H5中，用户\&quot;我的优惠券\&quot;或\&quot;提交订单页\&quot;展示优惠信息。只能查询商户配的券，无法查询平台优惠券。
     * @param activityId 活动 id (required)
     * @param authToken 用户授权令牌 (optional)
     * @param userId 支付宝用户 id (optional)
     * @param openId 支付宝用户openId (optional)
     * @param belongMerchantId 券归属商户 (optional)
     * @param senderMerchantId 券发放商户 (optional)
     * @param voucherStatus 券状态，其中已过期状态可查询6个月内的数据 (optional)
     * @param pageNum 分页查询页码 (optional)
     * @param merchantAccessMode 商户接入模式 (optional)
     * @param pageSize 分页查询单页数据条数 (optional)
     * @return AlipayMarketingActivityUserBatchqueryvoucherResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingActivityUserBatchqueryvoucherResponseModel batchqueryvoucher(String activityId, String authToken, String userId, String openId, String belongMerchantId, String senderMerchantId, String voucherStatus, Integer pageNum, String merchantAccessMode, Integer pageSize) throws ApiException {
        ApiResponse<AlipayMarketingActivityUserBatchqueryvoucherResponseModel> localVarResp = batchqueryvoucherWithHttpInfo(activityId, authToken, userId, openId, belongMerchantId, senderMerchantId, voucherStatus, pageNum, merchantAccessMode, pageSize, null);
        return localVarResp.getData();
    }

    public AlipayMarketingActivityUserBatchqueryvoucherResponseModel batchqueryvoucher(String activityId, String authToken, String userId, String openId, String belongMerchantId, String senderMerchantId, String voucherStatus, Integer pageNum, String merchantAccessMode, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingActivityUserBatchqueryvoucherResponseModel> localVarResp = batchqueryvoucherWithHttpInfo(activityId, authToken, userId, openId, belongMerchantId, senderMerchantId, voucherStatus, pageNum, merchantAccessMode, pageSize, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 条件查询用户券
     * 可通过该接口查询用户在某商户可用的全部券，可用于商户的小程序/H5中，用户\&quot;我的优惠券\&quot;或\&quot;提交订单页\&quot;展示优惠信息。只能查询商户配的券，无法查询平台优惠券。
     * @param activityId 活动 id (required)
     * @param authToken 用户授权令牌 (optional)
     * @param userId 支付宝用户 id (optional)
     * @param openId 支付宝用户openId (optional)
     * @param belongMerchantId 券归属商户 (optional)
     * @param senderMerchantId 券发放商户 (optional)
     * @param voucherStatus 券状态，其中已过期状态可查询6个月内的数据 (optional)
     * @param pageNum 分页查询页码 (optional)
     * @param merchantAccessMode 商户接入模式 (optional)
     * @param pageSize 分页查询单页数据条数 (optional)
     * @return ApiResponse&lt;AlipayMarketingActivityUserBatchqueryvoucherResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingActivityUserBatchqueryvoucherResponseModel> batchqueryvoucherWithHttpInfo(String activityId, String authToken, String userId, String openId, String belongMerchantId, String senderMerchantId, String voucherStatus, Integer pageNum, String merchantAccessMode, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryvoucherValidateBeforeCall(activityId, authToken, userId, openId, belongMerchantId, senderMerchantId, voucherStatus, pageNum, merchantAccessMode, pageSize, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingActivityUserBatchqueryvoucherResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingActivityUserBatchqueryvoucherDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 条件查询用户券 (asynchronously)
     * 可通过该接口查询用户在某商户可用的全部券，可用于商户的小程序/H5中，用户\&quot;我的优惠券\&quot;或\&quot;提交订单页\&quot;展示优惠信息。只能查询商户配的券，无法查询平台优惠券。
     * @param activityId 活动 id (required)
     * @param authToken 用户授权令牌 (optional)
     * @param userId 支付宝用户 id (optional)
     * @param openId 支付宝用户openId (optional)
     * @param belongMerchantId 券归属商户 (optional)
     * @param senderMerchantId 券发放商户 (optional)
     * @param voucherStatus 券状态，其中已过期状态可查询6个月内的数据 (optional)
     * @param pageNum 分页查询页码 (optional)
     * @param merchantAccessMode 商户接入模式 (optional)
     * @param pageSize 分页查询单页数据条数 (optional)
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
    public okhttp3.Call batchqueryvoucherAsync(String activityId, String authToken, String userId, String openId, String belongMerchantId, String senderMerchantId, String voucherStatus, Integer pageNum, String merchantAccessMode, Integer pageSize, final ApiCallback<AlipayMarketingActivityUserBatchqueryvoucherResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryvoucherValidateBeforeCall(activityId, authToken, userId, openId, belongMerchantId, senderMerchantId, voucherStatus, pageNum, merchantAccessMode, pageSize, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityUserBatchqueryvoucherResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call batchqueryvoucherAsync(String activityId, String authToken, String userId, String openId, String belongMerchantId, String senderMerchantId, String voucherStatus, Integer pageNum, String merchantAccessMode, Integer pageSize, final ApiCallback<AlipayMarketingActivityUserBatchqueryvoucherResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryvoucherValidateBeforeCall(activityId, authToken, userId, openId, belongMerchantId, senderMerchantId, voucherStatus, pageNum, merchantAccessMode, pageSize, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityUserBatchqueryvoucherResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for queryvoucher
     * @param activityId 活动 id。 (required)
     * @param merchantId 商户 PID，默认为当前接口调用商户。 (optional)
     * @param userId 支付宝用户id (optional)
     * @param openId 支付宝用户openId (optional)
     * @param voucherId 用户券 id。支付宝为用户优惠券唯一分配的 id。 (optional)
     * @param voucherCode 用户领取的商家券券码。 (optional)
     * @param merchantAccessMode 商户接入模式。 (optional)
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
    public okhttp3.Call queryvoucherCall(String activityId, String merchantId, String userId, String openId, String voucherId, String voucherCode, String merchantAccessMode, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/marketing/activity/{activity_id}/user/queryvoucher"
            .replaceAll("\\{" + "activity_id" + "\\}", localVarApiClient.escapeString(activityId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (merchantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("merchant_id", merchantId));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_id", userId));
        }

        if (openId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("open_id", openId));
        }

        if (voucherId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("voucher_id", voucherId));
        }

        if (voucherCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("voucher_code", voucherCode));
        }

        if (merchantAccessMode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("merchant_access_mode", merchantAccessMode));
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
    private okhttp3.Call queryvoucherValidateBeforeCall(String activityId, String merchantId, String userId, String openId, String voucherId, String voucherCode, String merchantAccessMode, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        
        // verify the required parameter 'activityId' is set
        if (activityId == null) {
            throw new ApiException("Missing the required parameter 'activityId' when calling queryvoucher(Async)");
        }
        

        okhttp3.Call localVarCall = queryvoucherCall(activityId, merchantId, userId, openId, voucherId, voucherCode, merchantAccessMode, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询用户券详情
     * 通过此接口可以查询用户券信息，包括用户券的基础信息、状态。
     * @param activityId 活动 id。 (required)
     * @param merchantId 商户 PID，默认为当前接口调用商户。 (optional)
     * @param userId 支付宝用户id (optional)
     * @param openId 支付宝用户openId (optional)
     * @param voucherId 用户券 id。支付宝为用户优惠券唯一分配的 id。 (optional)
     * @param voucherCode 用户领取的商家券券码。 (optional)
     * @param merchantAccessMode 商户接入模式。 (optional)
     * @return AlipayMarketingActivityUserQueryvoucherResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingActivityUserQueryvoucherResponseModel queryvoucher(String activityId, String merchantId, String userId, String openId, String voucherId, String voucherCode, String merchantAccessMode) throws ApiException {
        ApiResponse<AlipayMarketingActivityUserQueryvoucherResponseModel> localVarResp = queryvoucherWithHttpInfo(activityId, merchantId, userId, openId, voucherId, voucherCode, merchantAccessMode, null);
        return localVarResp.getData();
    }

    public AlipayMarketingActivityUserQueryvoucherResponseModel queryvoucher(String activityId, String merchantId, String userId, String openId, String voucherId, String voucherCode, String merchantAccessMode, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingActivityUserQueryvoucherResponseModel> localVarResp = queryvoucherWithHttpInfo(activityId, merchantId, userId, openId, voucherId, voucherCode, merchantAccessMode, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询用户券详情
     * 通过此接口可以查询用户券信息，包括用户券的基础信息、状态。
     * @param activityId 活动 id。 (required)
     * @param merchantId 商户 PID，默认为当前接口调用商户。 (optional)
     * @param userId 支付宝用户id (optional)
     * @param openId 支付宝用户openId (optional)
     * @param voucherId 用户券 id。支付宝为用户优惠券唯一分配的 id。 (optional)
     * @param voucherCode 用户领取的商家券券码。 (optional)
     * @param merchantAccessMode 商户接入模式。 (optional)
     * @return ApiResponse&lt;AlipayMarketingActivityUserQueryvoucherResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingActivityUserQueryvoucherResponseModel> queryvoucherWithHttpInfo(String activityId, String merchantId, String userId, String openId, String voucherId, String voucherCode, String merchantAccessMode, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryvoucherValidateBeforeCall(activityId, merchantId, userId, openId, voucherId, voucherCode, merchantAccessMode, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingActivityUserQueryvoucherResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingActivityUserQueryvoucherDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询用户券详情 (asynchronously)
     * 通过此接口可以查询用户券信息，包括用户券的基础信息、状态。
     * @param activityId 活动 id。 (required)
     * @param merchantId 商户 PID，默认为当前接口调用商户。 (optional)
     * @param userId 支付宝用户id (optional)
     * @param openId 支付宝用户openId (optional)
     * @param voucherId 用户券 id。支付宝为用户优惠券唯一分配的 id。 (optional)
     * @param voucherCode 用户领取的商家券券码。 (optional)
     * @param merchantAccessMode 商户接入模式。 (optional)
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
    public okhttp3.Call queryvoucherAsync(String activityId, String merchantId, String userId, String openId, String voucherId, String voucherCode, String merchantAccessMode, final ApiCallback<AlipayMarketingActivityUserQueryvoucherResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryvoucherValidateBeforeCall(activityId, merchantId, userId, openId, voucherId, voucherCode, merchantAccessMode, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityUserQueryvoucherResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryvoucherAsync(String activityId, String merchantId, String userId, String openId, String voucherId, String voucherCode, String merchantAccessMode, final ApiCallback<AlipayMarketingActivityUserQueryvoucherResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryvoucherValidateBeforeCall(activityId, merchantId, userId, openId, voucherId, voucherCode, merchantAccessMode, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityUserQueryvoucherResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
