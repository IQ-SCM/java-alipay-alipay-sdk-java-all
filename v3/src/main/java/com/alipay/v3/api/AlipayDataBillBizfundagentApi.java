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


import com.alipay.v3.model.AlipayDataBillBizfundagentQueryDefaultResponse;
import com.alipay.v3.model.AlipayDataBillBizfundagentQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayDataBillBizfundagentApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayDataBillBizfundagentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayDataBillBizfundagentApi(ApiClient apiClient) {
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
     * @param startTime 账单查询时间范围 -- 起始时间 (optional)
     * @param endTime 账单查询时间范围 -- 结束范围。时间范围最大不超过31天。 (optional)
     * @param pageNo 页码，从1开始 (optional)
     * @param pageSize 分页大小1000-2000，默认2000 (optional)
     * @param agreementNo ISV与商户授权协议号 (optional)
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
    public okhttp3.Call queryCall(String startTime, String endTime, String pageNo, String pageSize, String agreementNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/data/bill/bizfundagent/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (pageNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_no", pageNo));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (agreementNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_no", agreementNo));
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
    private okhttp3.Call queryValidateBeforeCall(String startTime, String endTime, String pageNo, String pageSize, String agreementNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(startTime, endTime, pageNo, pageSize, agreementNo, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * ISV代理商户资金业务账单查询
     * 用于ISV代理商户查询商户的资金业务账单
     * @param startTime 账单查询时间范围 -- 起始时间 (optional)
     * @param endTime 账单查询时间范围 -- 结束范围。时间范围最大不超过31天。 (optional)
     * @param pageNo 页码，从1开始 (optional)
     * @param pageSize 分页大小1000-2000，默认2000 (optional)
     * @param agreementNo ISV与商户授权协议号 (optional)
     * @return AlipayDataBillBizfundagentQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayDataBillBizfundagentQueryResponseModel query(String startTime, String endTime, String pageNo, String pageSize, String agreementNo) throws ApiException {
        ApiResponse<AlipayDataBillBizfundagentQueryResponseModel> localVarResp = queryWithHttpInfo(startTime, endTime, pageNo, pageSize, agreementNo, null);
        return localVarResp.getData();
    }

    public AlipayDataBillBizfundagentQueryResponseModel query(String startTime, String endTime, String pageNo, String pageSize, String agreementNo, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayDataBillBizfundagentQueryResponseModel> localVarResp = queryWithHttpInfo(startTime, endTime, pageNo, pageSize, agreementNo, customizedParams);
        return localVarResp.getData();
    }

    /**
     * ISV代理商户资金业务账单查询
     * 用于ISV代理商户查询商户的资金业务账单
     * @param startTime 账单查询时间范围 -- 起始时间 (optional)
     * @param endTime 账单查询时间范围 -- 结束范围。时间范围最大不超过31天。 (optional)
     * @param pageNo 页码，从1开始 (optional)
     * @param pageSize 分页大小1000-2000，默认2000 (optional)
     * @param agreementNo ISV与商户授权协议号 (optional)
     * @return ApiResponse&lt;AlipayDataBillBizfundagentQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayDataBillBizfundagentQueryResponseModel> queryWithHttpInfo(String startTime, String endTime, String pageNo, String pageSize, String agreementNo, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(startTime, endTime, pageNo, pageSize, agreementNo, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayDataBillBizfundagentQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayDataBillBizfundagentQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * ISV代理商户资金业务账单查询 (asynchronously)
     * 用于ISV代理商户查询商户的资金业务账单
     * @param startTime 账单查询时间范围 -- 起始时间 (optional)
     * @param endTime 账单查询时间范围 -- 结束范围。时间范围最大不超过31天。 (optional)
     * @param pageNo 页码，从1开始 (optional)
     * @param pageSize 分页大小1000-2000，默认2000 (optional)
     * @param agreementNo ISV与商户授权协议号 (optional)
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
    public okhttp3.Call queryAsync(String startTime, String endTime, String pageNo, String pageSize, String agreementNo, final ApiCallback<AlipayDataBillBizfundagentQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(startTime, endTime, pageNo, pageSize, agreementNo, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayDataBillBizfundagentQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String startTime, String endTime, String pageNo, String pageSize, String agreementNo, final ApiCallback<AlipayDataBillBizfundagentQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(startTime, endTime, pageNo, pageSize, agreementNo, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayDataBillBizfundagentQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
