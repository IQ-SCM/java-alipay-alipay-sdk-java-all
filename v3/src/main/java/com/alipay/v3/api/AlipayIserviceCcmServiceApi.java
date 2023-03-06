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


import com.alipay.v3.model.AlipayIserviceCcmServiceBuyDefaultResponse;
import com.alipay.v3.model.AlipayIserviceCcmServiceBuyModel;
import com.alipay.v3.model.AlipayIserviceCcmServiceBuyResponseModel;
import com.alipay.v3.model.AlipayIserviceCcmServiceCloseDefaultResponse;
import com.alipay.v3.model.AlipayIserviceCcmServiceCloseModel;
import com.alipay.v3.model.AlipayIserviceCcmServiceInitializeDefaultResponse;
import com.alipay.v3.model.AlipayIserviceCcmServiceInitializeModel;
import com.alipay.v3.model.AlipayIserviceCcmServiceInitializeResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayIserviceCcmServiceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayIserviceCcmServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayIserviceCcmServiceApi(ApiClient apiClient) {
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
     * Build call for buy
     * @param alipayIserviceCcmServiceBuyModel  (optional)
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
    public okhttp3.Call buyCall(AlipayIserviceCcmServiceBuyModel alipayIserviceCcmServiceBuyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayIserviceCcmServiceBuyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/iservice/ccm/service/buy";

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
    private okhttp3.Call buyValidateBeforeCall(AlipayIserviceCcmServiceBuyModel alipayIserviceCcmServiceBuyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = buyCall(alipayIserviceCcmServiceBuyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 租户开通isv服务接口
     * 租户购买了isv服务后，通知ccm开通服务
     * @param alipayIserviceCcmServiceBuyModel  (optional)
     * @return AlipayIserviceCcmServiceBuyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayIserviceCcmServiceBuyResponseModel buy(AlipayIserviceCcmServiceBuyModel alipayIserviceCcmServiceBuyModel) throws ApiException {
        ApiResponse<AlipayIserviceCcmServiceBuyResponseModel> localVarResp = buyWithHttpInfo(alipayIserviceCcmServiceBuyModel, null);
        return localVarResp.getData();
    }

    public AlipayIserviceCcmServiceBuyResponseModel buy(AlipayIserviceCcmServiceBuyModel alipayIserviceCcmServiceBuyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayIserviceCcmServiceBuyResponseModel> localVarResp = buyWithHttpInfo(alipayIserviceCcmServiceBuyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 租户开通isv服务接口
     * 租户购买了isv服务后，通知ccm开通服务
     * @param alipayIserviceCcmServiceBuyModel  (optional)
     * @return ApiResponse&lt;AlipayIserviceCcmServiceBuyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayIserviceCcmServiceBuyResponseModel> buyWithHttpInfo(AlipayIserviceCcmServiceBuyModel alipayIserviceCcmServiceBuyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = buyValidateBeforeCall(alipayIserviceCcmServiceBuyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayIserviceCcmServiceBuyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayIserviceCcmServiceBuyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 租户开通isv服务接口 (asynchronously)
     * 租户购买了isv服务后，通知ccm开通服务
     * @param alipayIserviceCcmServiceBuyModel  (optional)
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
    public okhttp3.Call buyAsync(AlipayIserviceCcmServiceBuyModel alipayIserviceCcmServiceBuyModel, final ApiCallback<AlipayIserviceCcmServiceBuyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = buyValidateBeforeCall(alipayIserviceCcmServiceBuyModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayIserviceCcmServiceBuyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call buyAsync(AlipayIserviceCcmServiceBuyModel alipayIserviceCcmServiceBuyModel, final ApiCallback<AlipayIserviceCcmServiceBuyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = buyValidateBeforeCall(alipayIserviceCcmServiceBuyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayIserviceCcmServiceBuyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for close
     * @param alipayIserviceCcmServiceCloseModel  (optional)
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
    public okhttp3.Call closeCall(AlipayIserviceCcmServiceCloseModel alipayIserviceCcmServiceCloseModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayIserviceCcmServiceCloseModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/iservice/ccm/service/close";

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
    private okhttp3.Call closeValidateBeforeCall(AlipayIserviceCcmServiceCloseModel alipayIserviceCcmServiceCloseModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = closeCall(alipayIserviceCcmServiceCloseModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 关闭租户开通的isv服务接口
     * 租户购买的ISV服务到期后，isv通知ccm关闭服务
     * @param alipayIserviceCcmServiceCloseModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object close(AlipayIserviceCcmServiceCloseModel alipayIserviceCcmServiceCloseModel) throws ApiException {
        ApiResponse<Object> localVarResp = closeWithHttpInfo(alipayIserviceCcmServiceCloseModel, null);
        return localVarResp.getData();
    }

    public Object close(AlipayIserviceCcmServiceCloseModel alipayIserviceCcmServiceCloseModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = closeWithHttpInfo(alipayIserviceCcmServiceCloseModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 关闭租户开通的isv服务接口
     * 租户购买的ISV服务到期后，isv通知ccm关闭服务
     * @param alipayIserviceCcmServiceCloseModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> closeWithHttpInfo(AlipayIserviceCcmServiceCloseModel alipayIserviceCcmServiceCloseModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = closeValidateBeforeCall(alipayIserviceCcmServiceCloseModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayIserviceCcmServiceCloseDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 关闭租户开通的isv服务接口 (asynchronously)
     * 租户购买的ISV服务到期后，isv通知ccm关闭服务
     * @param alipayIserviceCcmServiceCloseModel  (optional)
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
    public okhttp3.Call closeAsync(AlipayIserviceCcmServiceCloseModel alipayIserviceCcmServiceCloseModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = closeValidateBeforeCall(alipayIserviceCcmServiceCloseModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call closeAsync(AlipayIserviceCcmServiceCloseModel alipayIserviceCcmServiceCloseModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = closeValidateBeforeCall(alipayIserviceCcmServiceCloseModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for initialize
     * @param alipayIserviceCcmServiceInitializeModel  (optional)
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
    public okhttp3.Call initializeCall(AlipayIserviceCcmServiceInitializeModel alipayIserviceCcmServiceInitializeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayIserviceCcmServiceInitializeModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/iservice/ccm/service/initialize";

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
    private okhttp3.Call initializeValidateBeforeCall(AlipayIserviceCcmServiceInitializeModel alipayIserviceCcmServiceInitializeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = initializeCall(alipayIserviceCcmServiceInitializeModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * isv服务初始化接口
     * ISV调用此接口对接入CCM的服务代码、名称、描述等信息做初始化
     * @param alipayIserviceCcmServiceInitializeModel  (optional)
     * @return AlipayIserviceCcmServiceInitializeResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayIserviceCcmServiceInitializeResponseModel initialize(AlipayIserviceCcmServiceInitializeModel alipayIserviceCcmServiceInitializeModel) throws ApiException {
        ApiResponse<AlipayIserviceCcmServiceInitializeResponseModel> localVarResp = initializeWithHttpInfo(alipayIserviceCcmServiceInitializeModel, null);
        return localVarResp.getData();
    }

    public AlipayIserviceCcmServiceInitializeResponseModel initialize(AlipayIserviceCcmServiceInitializeModel alipayIserviceCcmServiceInitializeModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayIserviceCcmServiceInitializeResponseModel> localVarResp = initializeWithHttpInfo(alipayIserviceCcmServiceInitializeModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * isv服务初始化接口
     * ISV调用此接口对接入CCM的服务代码、名称、描述等信息做初始化
     * @param alipayIserviceCcmServiceInitializeModel  (optional)
     * @return ApiResponse&lt;AlipayIserviceCcmServiceInitializeResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayIserviceCcmServiceInitializeResponseModel> initializeWithHttpInfo(AlipayIserviceCcmServiceInitializeModel alipayIserviceCcmServiceInitializeModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = initializeValidateBeforeCall(alipayIserviceCcmServiceInitializeModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayIserviceCcmServiceInitializeResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayIserviceCcmServiceInitializeDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * isv服务初始化接口 (asynchronously)
     * ISV调用此接口对接入CCM的服务代码、名称、描述等信息做初始化
     * @param alipayIserviceCcmServiceInitializeModel  (optional)
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
    public okhttp3.Call initializeAsync(AlipayIserviceCcmServiceInitializeModel alipayIserviceCcmServiceInitializeModel, final ApiCallback<AlipayIserviceCcmServiceInitializeResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = initializeValidateBeforeCall(alipayIserviceCcmServiceInitializeModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayIserviceCcmServiceInitializeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call initializeAsync(AlipayIserviceCcmServiceInitializeModel alipayIserviceCcmServiceInitializeModel, final ApiCallback<AlipayIserviceCcmServiceInitializeResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = initializeValidateBeforeCall(alipayIserviceCcmServiceInitializeModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayIserviceCcmServiceInitializeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}