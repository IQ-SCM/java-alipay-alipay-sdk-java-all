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


import com.alipay.v3.model.AlipayEbppInvoiceEinvpackageQueryDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceEinvpackageQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEbppInvoiceEinvpackageApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEbppInvoiceEinvpackageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEbppInvoiceEinvpackageApi(ApiClient apiClient) {
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
     * @param encryptedUid 加密过的uid。获取详情参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/017fwh\&quot;&gt;\&quot;推\&quot;模式发票报销&lt;/a&gt;。 (optional)
     * @param packageId 发票包id。获取详情参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/017fwh\&quot;&gt;\&quot;推\&quot;模式发票报销&lt;/a&gt;。 (optional)
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
    public okhttp3.Call queryCall(String encryptedUid, String packageId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/ebpp/invoice/einvpackage/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (encryptedUid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("encrypted_uid", encryptedUid));
        }

        if (packageId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("package_id", packageId));
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
    private okhttp3.Call queryValidateBeforeCall(String encryptedUid, String packageId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(encryptedUid, packageId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询用户发票包的明细信息
     * 第三方报销软件根据支付宝提供的用户的发票包id，查询对应的发票包的电子发票，ocr纸票和消费记录明细信息
     * @param encryptedUid 加密过的uid。获取详情参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/017fwh\&quot;&gt;\&quot;推\&quot;模式发票报销&lt;/a&gt;。 (optional)
     * @param packageId 发票包id。获取详情参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/017fwh\&quot;&gt;\&quot;推\&quot;模式发票报销&lt;/a&gt;。 (optional)
     * @return AlipayEbppInvoiceEinvpackageQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceEinvpackageQueryResponseModel query(String encryptedUid, String packageId) throws ApiException {
        ApiResponse<AlipayEbppInvoiceEinvpackageQueryResponseModel> localVarResp = queryWithHttpInfo(encryptedUid, packageId, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceEinvpackageQueryResponseModel query(String encryptedUid, String packageId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceEinvpackageQueryResponseModel> localVarResp = queryWithHttpInfo(encryptedUid, packageId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询用户发票包的明细信息
     * 第三方报销软件根据支付宝提供的用户的发票包id，查询对应的发票包的电子发票，ocr纸票和消费记录明细信息
     * @param encryptedUid 加密过的uid。获取详情参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/017fwh\&quot;&gt;\&quot;推\&quot;模式发票报销&lt;/a&gt;。 (optional)
     * @param packageId 发票包id。获取详情参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/017fwh\&quot;&gt;\&quot;推\&quot;模式发票报销&lt;/a&gt;。 (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceEinvpackageQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceEinvpackageQueryResponseModel> queryWithHttpInfo(String encryptedUid, String packageId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(encryptedUid, packageId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceEinvpackageQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceEinvpackageQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询用户发票包的明细信息 (asynchronously)
     * 第三方报销软件根据支付宝提供的用户的发票包id，查询对应的发票包的电子发票，ocr纸票和消费记录明细信息
     * @param encryptedUid 加密过的uid。获取详情参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/017fwh\&quot;&gt;\&quot;推\&quot;模式发票报销&lt;/a&gt;。 (optional)
     * @param packageId 发票包id。获取详情参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/017fwh\&quot;&gt;\&quot;推\&quot;模式发票报销&lt;/a&gt;。 (optional)
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
    public okhttp3.Call queryAsync(String encryptedUid, String packageId, final ApiCallback<AlipayEbppInvoiceEinvpackageQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(encryptedUid, packageId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceEinvpackageQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String encryptedUid, String packageId, final ApiCallback<AlipayEbppInvoiceEinvpackageQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(encryptedUid, packageId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceEinvpackageQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}