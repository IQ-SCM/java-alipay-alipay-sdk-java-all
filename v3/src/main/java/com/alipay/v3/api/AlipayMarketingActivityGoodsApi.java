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


import com.alipay.v3.model.AlipayMarketingActivityGoodsBatchqueryDefaultResponse;
import com.alipay.v3.model.AlipayMarketingActivityGoodsBatchqueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayMarketingActivityGoodsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayMarketingActivityGoodsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayMarketingActivityGoodsApi(ApiClient apiClient) {
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
     * Build call for batchquery
     * @param activityId 活动id (required)
     * @param merchantId 商户PID,默认为当前接口调用商户  限制:  接口调用者必须有商户代运营权限。   代运营授权流程https://opendocs.alipay.com/mini/01hm6i#%E4%BB%A3%E8%BF%90%E8%90%A5%E6%8E%88%E6%9D%83 (optional)
     * @param goodsUseType 活动单品类型。 枚举值: AVAILABLE 可用商品 UNAVAILABLE 不可用商品 (optional)
     * @param pageNum 分页查询页码。 限制: 必须为大于0的整数 (optional)
     * @param pageSize 分页查询单页数据条数。 限制: 1.必须为大于0的整数 2.每页最大值为20 (optional)
     * @param productVersion 版本号  枚举值: 2.0.0 (optional)
     * @param merchantAccessMode 商户接入模式  枚举值 SELF_MODE 商户自接入模式 AGENCY_MODE 服务商代接入模式 (optional)
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
    public okhttp3.Call batchqueryCall(String activityId, String merchantId, String goodsUseType, Integer pageNum, Integer pageSize, String productVersion, String merchantAccessMode, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/marketing/activity/{activity_id}/goods/batchquery"
            .replaceAll("\\{" + "activity_id" + "\\}", localVarApiClient.escapeString(activityId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (merchantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("merchant_id", merchantId));
        }

        if (goodsUseType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("goods_use_type", goodsUseType));
        }

        if (pageNum != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_num", pageNum));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (productVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("product_version", productVersion));
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
    private okhttp3.Call batchqueryValidateBeforeCall(String activityId, String merchantId, String goodsUseType, Integer pageNum, Integer pageSize, String productVersion, String merchantAccessMode, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        
        // verify the required parameter 'activityId' is set
        if (activityId == null) {
            throw new ApiException("Missing the required parameter 'activityId' when calling batchquery(Async)");
        }
        

        okhttp3.Call localVarCall = batchqueryCall(activityId, merchantId, goodsUseType, pageNum, pageSize, productVersion, merchantAccessMode, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询活动适用商品
     * 通过此接口可查询活动的可用或不可用商品,判断是否在该商品可用，来决定是否展示。
     * @param activityId 活动id (required)
     * @param merchantId 商户PID,默认为当前接口调用商户  限制:  接口调用者必须有商户代运营权限。   代运营授权流程https://opendocs.alipay.com/mini/01hm6i#%E4%BB%A3%E8%BF%90%E8%90%A5%E6%8E%88%E6%9D%83 (optional)
     * @param goodsUseType 活动单品类型。 枚举值: AVAILABLE 可用商品 UNAVAILABLE 不可用商品 (optional)
     * @param pageNum 分页查询页码。 限制: 必须为大于0的整数 (optional)
     * @param pageSize 分页查询单页数据条数。 限制: 1.必须为大于0的整数 2.每页最大值为20 (optional)
     * @param productVersion 版本号  枚举值: 2.0.0 (optional)
     * @param merchantAccessMode 商户接入模式  枚举值 SELF_MODE 商户自接入模式 AGENCY_MODE 服务商代接入模式 (optional)
     * @return AlipayMarketingActivityGoodsBatchqueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingActivityGoodsBatchqueryResponseModel batchquery(String activityId, String merchantId, String goodsUseType, Integer pageNum, Integer pageSize, String productVersion, String merchantAccessMode) throws ApiException {
        ApiResponse<AlipayMarketingActivityGoodsBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(activityId, merchantId, goodsUseType, pageNum, pageSize, productVersion, merchantAccessMode, null);
        return localVarResp.getData();
    }

    public AlipayMarketingActivityGoodsBatchqueryResponseModel batchquery(String activityId, String merchantId, String goodsUseType, Integer pageNum, Integer pageSize, String productVersion, String merchantAccessMode, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingActivityGoodsBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(activityId, merchantId, goodsUseType, pageNum, pageSize, productVersion, merchantAccessMode, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询活动适用商品
     * 通过此接口可查询活动的可用或不可用商品,判断是否在该商品可用，来决定是否展示。
     * @param activityId 活动id (required)
     * @param merchantId 商户PID,默认为当前接口调用商户  限制:  接口调用者必须有商户代运营权限。   代运营授权流程https://opendocs.alipay.com/mini/01hm6i#%E4%BB%A3%E8%BF%90%E8%90%A5%E6%8E%88%E6%9D%83 (optional)
     * @param goodsUseType 活动单品类型。 枚举值: AVAILABLE 可用商品 UNAVAILABLE 不可用商品 (optional)
     * @param pageNum 分页查询页码。 限制: 必须为大于0的整数 (optional)
     * @param pageSize 分页查询单页数据条数。 限制: 1.必须为大于0的整数 2.每页最大值为20 (optional)
     * @param productVersion 版本号  枚举值: 2.0.0 (optional)
     * @param merchantAccessMode 商户接入模式  枚举值 SELF_MODE 商户自接入模式 AGENCY_MODE 服务商代接入模式 (optional)
     * @return ApiResponse&lt;AlipayMarketingActivityGoodsBatchqueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingActivityGoodsBatchqueryResponseModel> batchqueryWithHttpInfo(String activityId, String merchantId, String goodsUseType, Integer pageNum, Integer pageSize, String productVersion, String merchantAccessMode, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(activityId, merchantId, goodsUseType, pageNum, pageSize, productVersion, merchantAccessMode, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingActivityGoodsBatchqueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingActivityGoodsBatchqueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询活动适用商品 (asynchronously)
     * 通过此接口可查询活动的可用或不可用商品,判断是否在该商品可用，来决定是否展示。
     * @param activityId 活动id (required)
     * @param merchantId 商户PID,默认为当前接口调用商户  限制:  接口调用者必须有商户代运营权限。   代运营授权流程https://opendocs.alipay.com/mini/01hm6i#%E4%BB%A3%E8%BF%90%E8%90%A5%E6%8E%88%E6%9D%83 (optional)
     * @param goodsUseType 活动单品类型。 枚举值: AVAILABLE 可用商品 UNAVAILABLE 不可用商品 (optional)
     * @param pageNum 分页查询页码。 限制: 必须为大于0的整数 (optional)
     * @param pageSize 分页查询单页数据条数。 限制: 1.必须为大于0的整数 2.每页最大值为20 (optional)
     * @param productVersion 版本号  枚举值: 2.0.0 (optional)
     * @param merchantAccessMode 商户接入模式  枚举值 SELF_MODE 商户自接入模式 AGENCY_MODE 服务商代接入模式 (optional)
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
    public okhttp3.Call batchqueryAsync(String activityId, String merchantId, String goodsUseType, Integer pageNum, Integer pageSize, String productVersion, String merchantAccessMode, final ApiCallback<AlipayMarketingActivityGoodsBatchqueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(activityId, merchantId, goodsUseType, pageNum, pageSize, productVersion, merchantAccessMode, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityGoodsBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call batchqueryAsync(String activityId, String merchantId, String goodsUseType, Integer pageNum, Integer pageSize, String productVersion, String merchantAccessMode, final ApiCallback<AlipayMarketingActivityGoodsBatchqueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(activityId, merchantId, goodsUseType, pageNum, pageSize, productVersion, merchantAccessMode, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityGoodsBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}