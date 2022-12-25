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


import com.alipay.v3.model.AlipayEbppInvoiceAuthSignDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceAuthSignModel;
import com.alipay.v3.model.AlipayEbppInvoiceAuthUnsignDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceAuthUnsignModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEbppInvoiceAuthApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEbppInvoiceAuthApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEbppInvoiceAuthApi(ApiClient apiClient) {
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
     * Build call for sign
     * @param alipayEbppInvoiceAuthSignModel  (optional)
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
    public okhttp3.Call signCall(AlipayEbppInvoiceAuthSignModel alipayEbppInvoiceAuthSignModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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

        Object localVarPostBody = (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent()))
                ? customizedParams.getBodyContent() : alipayEbppInvoiceAuthSignModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/invoice/auth/sign";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call signValidateBeforeCall(AlipayEbppInvoiceAuthSignModel alipayEbppInvoiceAuthSignModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = signCall(alipayEbppInvoiceAuthSignModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 发票授权关系签约
     * 用户在ISV端签约了发票相关的授权关系之后，ISV使用该接口将授权关系同步到发票管家。
     * @param alipayEbppInvoiceAuthSignModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object sign(AlipayEbppInvoiceAuthSignModel alipayEbppInvoiceAuthSignModel) throws ApiException {
        ApiResponse<Object> localVarResp = signWithHttpInfo(alipayEbppInvoiceAuthSignModel, null);
        return localVarResp.getData();
    }

    public Object sign(AlipayEbppInvoiceAuthSignModel alipayEbppInvoiceAuthSignModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = signWithHttpInfo(alipayEbppInvoiceAuthSignModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 发票授权关系签约
     * 用户在ISV端签约了发票相关的授权关系之后，ISV使用该接口将授权关系同步到发票管家。
     * @param alipayEbppInvoiceAuthSignModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> signWithHttpInfo(AlipayEbppInvoiceAuthSignModel alipayEbppInvoiceAuthSignModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = signValidateBeforeCall(alipayEbppInvoiceAuthSignModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceAuthSignDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 发票授权关系签约 (asynchronously)
     * 用户在ISV端签约了发票相关的授权关系之后，ISV使用该接口将授权关系同步到发票管家。
     * @param alipayEbppInvoiceAuthSignModel  (optional)
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
    public okhttp3.Call signAsync(AlipayEbppInvoiceAuthSignModel alipayEbppInvoiceAuthSignModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = signValidateBeforeCall(alipayEbppInvoiceAuthSignModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call signAsync(AlipayEbppInvoiceAuthSignModel alipayEbppInvoiceAuthSignModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = signValidateBeforeCall(alipayEbppInvoiceAuthSignModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unsign
     * @param alipayEbppInvoiceAuthUnsignModel  (optional)
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
    public okhttp3.Call unsignCall(AlipayEbppInvoiceAuthUnsignModel alipayEbppInvoiceAuthUnsignModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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

        Object localVarPostBody = (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent()))
                ? customizedParams.getBodyContent() : alipayEbppInvoiceAuthUnsignModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/invoice/auth/unsign";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call unsignValidateBeforeCall(AlipayEbppInvoiceAuthUnsignModel alipayEbppInvoiceAuthUnsignModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = unsignCall(alipayEbppInvoiceAuthUnsignModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 发票授权关系解约
     * 用户在ISV端解约了发票相关的授权关系之后，ISV使用该接口将授权关系在发票管家端解约。
     * @param alipayEbppInvoiceAuthUnsignModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object unsign(AlipayEbppInvoiceAuthUnsignModel alipayEbppInvoiceAuthUnsignModel) throws ApiException {
        ApiResponse<Object> localVarResp = unsignWithHttpInfo(alipayEbppInvoiceAuthUnsignModel, null);
        return localVarResp.getData();
    }

    public Object unsign(AlipayEbppInvoiceAuthUnsignModel alipayEbppInvoiceAuthUnsignModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = unsignWithHttpInfo(alipayEbppInvoiceAuthUnsignModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 发票授权关系解约
     * 用户在ISV端解约了发票相关的授权关系之后，ISV使用该接口将授权关系在发票管家端解约。
     * @param alipayEbppInvoiceAuthUnsignModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> unsignWithHttpInfo(AlipayEbppInvoiceAuthUnsignModel alipayEbppInvoiceAuthUnsignModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = unsignValidateBeforeCall(alipayEbppInvoiceAuthUnsignModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceAuthUnsignDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 发票授权关系解约 (asynchronously)
     * 用户在ISV端解约了发票相关的授权关系之后，ISV使用该接口将授权关系在发票管家端解约。
     * @param alipayEbppInvoiceAuthUnsignModel  (optional)
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
    public okhttp3.Call unsignAsync(AlipayEbppInvoiceAuthUnsignModel alipayEbppInvoiceAuthUnsignModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = unsignValidateBeforeCall(alipayEbppInvoiceAuthUnsignModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call unsignAsync(AlipayEbppInvoiceAuthUnsignModel alipayEbppInvoiceAuthUnsignModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = unsignValidateBeforeCall(alipayEbppInvoiceAuthUnsignModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
