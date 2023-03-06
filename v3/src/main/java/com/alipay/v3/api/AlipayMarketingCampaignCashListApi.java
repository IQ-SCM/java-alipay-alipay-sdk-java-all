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


import com.alipay.v3.model.AlipayMarketingCampaignCashListQueryDefaultResponse;
import com.alipay.v3.model.AlipayMarketingCampaignCashListQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayMarketingCampaignCashListApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayMarketingCampaignCashListApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayMarketingCampaignCashListApi(ApiClient apiClient) {
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
     * @param campStatus 要查询的活动状态,不填默认为 ALL 返回所有类型。枚举支持: *ALL：所有类型的活动。 *CREATED：已创建未打款。 *PAID：已打款。 *READY：活动已开始。 *PAUSE：活动已暂停。 *CLOSED：活动已结束。 *SETTLE：活动已清算。 (optional)
     * @param pageSize 分页查询时每页返回的列表大小，每页数据最大为 50。 (optional)
     * @param pageIndex 分页查询时的页码，从1开始 (optional)
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
    public okhttp3.Call queryCall(String campStatus, String pageSize, String pageIndex, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/marketing/campaign/cash/list/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (campStatus != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("camp_status", campStatus));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (pageIndex != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_index", pageIndex));
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
    private okhttp3.Call queryValidateBeforeCall(String campStatus, String pageSize, String pageIndex, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(campStatus, pageSize, pageIndex, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 现金活动列表查询
     * 商户通过开放平台查询自己创建的现金活动列表
     * @param campStatus 要查询的活动状态,不填默认为 ALL 返回所有类型。枚举支持: *ALL：所有类型的活动。 *CREATED：已创建未打款。 *PAID：已打款。 *READY：活动已开始。 *PAUSE：活动已暂停。 *CLOSED：活动已结束。 *SETTLE：活动已清算。 (optional)
     * @param pageSize 分页查询时每页返回的列表大小，每页数据最大为 50。 (optional)
     * @param pageIndex 分页查询时的页码，从1开始 (optional)
     * @return AlipayMarketingCampaignCashListQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingCampaignCashListQueryResponseModel query(String campStatus, String pageSize, String pageIndex) throws ApiException {
        ApiResponse<AlipayMarketingCampaignCashListQueryResponseModel> localVarResp = queryWithHttpInfo(campStatus, pageSize, pageIndex, null);
        return localVarResp.getData();
    }

    public AlipayMarketingCampaignCashListQueryResponseModel query(String campStatus, String pageSize, String pageIndex, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingCampaignCashListQueryResponseModel> localVarResp = queryWithHttpInfo(campStatus, pageSize, pageIndex, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 现金活动列表查询
     * 商户通过开放平台查询自己创建的现金活动列表
     * @param campStatus 要查询的活动状态,不填默认为 ALL 返回所有类型。枚举支持: *ALL：所有类型的活动。 *CREATED：已创建未打款。 *PAID：已打款。 *READY：活动已开始。 *PAUSE：活动已暂停。 *CLOSED：活动已结束。 *SETTLE：活动已清算。 (optional)
     * @param pageSize 分页查询时每页返回的列表大小，每页数据最大为 50。 (optional)
     * @param pageIndex 分页查询时的页码，从1开始 (optional)
     * @return ApiResponse&lt;AlipayMarketingCampaignCashListQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingCampaignCashListQueryResponseModel> queryWithHttpInfo(String campStatus, String pageSize, String pageIndex, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(campStatus, pageSize, pageIndex, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingCampaignCashListQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingCampaignCashListQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 现金活动列表查询 (asynchronously)
     * 商户通过开放平台查询自己创建的现金活动列表
     * @param campStatus 要查询的活动状态,不填默认为 ALL 返回所有类型。枚举支持: *ALL：所有类型的活动。 *CREATED：已创建未打款。 *PAID：已打款。 *READY：活动已开始。 *PAUSE：活动已暂停。 *CLOSED：活动已结束。 *SETTLE：活动已清算。 (optional)
     * @param pageSize 分页查询时每页返回的列表大小，每页数据最大为 50。 (optional)
     * @param pageIndex 分页查询时的页码，从1开始 (optional)
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
    public okhttp3.Call queryAsync(String campStatus, String pageSize, String pageIndex, final ApiCallback<AlipayMarketingCampaignCashListQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(campStatus, pageSize, pageIndex, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingCampaignCashListQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String campStatus, String pageSize, String pageIndex, final ApiCallback<AlipayMarketingCampaignCashListQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(campStatus, pageSize, pageIndex, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingCampaignCashListQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}