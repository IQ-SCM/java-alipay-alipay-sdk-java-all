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


import com.alipay.v3.model.AlipayEcoSignFlowCancelDefaultResponse;
import com.alipay.v3.model.AlipayEcoSignFlowCancelModel;
import com.alipay.v3.model.AlipayEcoSignFlowCreateDefaultResponse;
import com.alipay.v3.model.AlipayEcoSignFlowCreateModel;
import com.alipay.v3.model.AlipayEcoSignFlowCreateResponseModel;
import com.alipay.v3.model.AlipayEcoSignFlowFinishDefaultResponse;
import com.alipay.v3.model.AlipayEcoSignFlowFinishModel;
import com.alipay.v3.model.AlipayEcoSignFlowQueryDefaultResponse;
import com.alipay.v3.model.AlipayEcoSignFlowQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEcoSignFlowApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEcoSignFlowApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEcoSignFlowApi(ApiClient apiClient) {
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
     * Build call for cancel
     * @param targetAppId 目标isv应用ID (optional)
     * @param alipayEcoSignFlowCancelModel  (optional)
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
    public okhttp3.Call cancelCall(String targetAppId, AlipayEcoSignFlowCancelModel alipayEcoSignFlowCancelModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEcoSignFlowCancelModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/eco/sign/flow/cancel";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (targetAppId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target_app_id", targetAppId));
        }

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
    private okhttp3.Call cancelValidateBeforeCall(String targetAppId, AlipayEcoSignFlowCancelModel alipayEcoSignFlowCancelModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = cancelCall(targetAppId, alipayEcoSignFlowCancelModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 签署流程撤销（E签宝）
     * 签署流程撤销（E签宝）
     * @param targetAppId 目标isv应用ID (optional)
     * @param alipayEcoSignFlowCancelModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object cancel(String targetAppId, AlipayEcoSignFlowCancelModel alipayEcoSignFlowCancelModel) throws ApiException {
        ApiResponse<Object> localVarResp = cancelWithHttpInfo(targetAppId, alipayEcoSignFlowCancelModel, null);
        return localVarResp.getData();
    }

    public Object cancel(String targetAppId, AlipayEcoSignFlowCancelModel alipayEcoSignFlowCancelModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = cancelWithHttpInfo(targetAppId, alipayEcoSignFlowCancelModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 签署流程撤销（E签宝）
     * 签署流程撤销（E签宝）
     * @param targetAppId 目标isv应用ID (optional)
     * @param alipayEcoSignFlowCancelModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> cancelWithHttpInfo(String targetAppId, AlipayEcoSignFlowCancelModel alipayEcoSignFlowCancelModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = cancelValidateBeforeCall(targetAppId, alipayEcoSignFlowCancelModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEcoSignFlowCancelDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 签署流程撤销（E签宝） (asynchronously)
     * 签署流程撤销（E签宝）
     * @param targetAppId 目标isv应用ID (optional)
     * @param alipayEcoSignFlowCancelModel  (optional)
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
    public okhttp3.Call cancelAsync(String targetAppId, AlipayEcoSignFlowCancelModel alipayEcoSignFlowCancelModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelValidateBeforeCall(targetAppId, alipayEcoSignFlowCancelModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call cancelAsync(String targetAppId, AlipayEcoSignFlowCancelModel alipayEcoSignFlowCancelModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = cancelValidateBeforeCall(targetAppId, alipayEcoSignFlowCancelModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for create
     * @param targetAppId 目标isv应用ID (optional)
     * @param alipayEcoSignFlowCreateModel  (optional)
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
    public okhttp3.Call createCall(String targetAppId, AlipayEcoSignFlowCreateModel alipayEcoSignFlowCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEcoSignFlowCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/eco/sign/flow/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (targetAppId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target_app_id", targetAppId));
        }

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
    private okhttp3.Call createValidateBeforeCall(String targetAppId, AlipayEcoSignFlowCreateModel alipayEcoSignFlowCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(targetAppId, alipayEcoSignFlowCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 创建流程（E签宝）
     * 创建流程（E签宝）。
     * @param targetAppId 目标isv应用ID (optional)
     * @param alipayEcoSignFlowCreateModel  (optional)
     * @return AlipayEcoSignFlowCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEcoSignFlowCreateResponseModel create(String targetAppId, AlipayEcoSignFlowCreateModel alipayEcoSignFlowCreateModel) throws ApiException {
        ApiResponse<AlipayEcoSignFlowCreateResponseModel> localVarResp = createWithHttpInfo(targetAppId, alipayEcoSignFlowCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayEcoSignFlowCreateResponseModel create(String targetAppId, AlipayEcoSignFlowCreateModel alipayEcoSignFlowCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEcoSignFlowCreateResponseModel> localVarResp = createWithHttpInfo(targetAppId, alipayEcoSignFlowCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 创建流程（E签宝）
     * 创建流程（E签宝）。
     * @param targetAppId 目标isv应用ID (optional)
     * @param alipayEcoSignFlowCreateModel  (optional)
     * @return ApiResponse&lt;AlipayEcoSignFlowCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEcoSignFlowCreateResponseModel> createWithHttpInfo(String targetAppId, AlipayEcoSignFlowCreateModel alipayEcoSignFlowCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(targetAppId, alipayEcoSignFlowCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEcoSignFlowCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEcoSignFlowCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 创建流程（E签宝） (asynchronously)
     * 创建流程（E签宝）。
     * @param targetAppId 目标isv应用ID (optional)
     * @param alipayEcoSignFlowCreateModel  (optional)
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
    public okhttp3.Call createAsync(String targetAppId, AlipayEcoSignFlowCreateModel alipayEcoSignFlowCreateModel, final ApiCallback<AlipayEcoSignFlowCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(targetAppId, alipayEcoSignFlowCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEcoSignFlowCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call createAsync(String targetAppId, AlipayEcoSignFlowCreateModel alipayEcoSignFlowCreateModel, final ApiCallback<AlipayEcoSignFlowCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(targetAppId, alipayEcoSignFlowCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEcoSignFlowCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for finish
     * @param targetAppId 目标isv应用ID (optional)
     * @param alipayEcoSignFlowFinishModel  (optional)
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
    public okhttp3.Call finishCall(String targetAppId, AlipayEcoSignFlowFinishModel alipayEcoSignFlowFinishModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEcoSignFlowFinishModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/eco/sign/flow/finish";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (targetAppId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target_app_id", targetAppId));
        }

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
    private okhttp3.Call finishValidateBeforeCall(String targetAppId, AlipayEcoSignFlowFinishModel alipayEcoSignFlowFinishModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = finishCall(targetAppId, alipayEcoSignFlowFinishModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 签署流程归档
     * 手动归档签署流程，归档后所有资源不可修改，归档前签署流程中的所有签署人必须都签署完成。如果创建流程时，设置了自动归档，则无需调用本接口，签署完成后系统会自动调用。
     * @param targetAppId 目标isv应用ID (optional)
     * @param alipayEcoSignFlowFinishModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object finish(String targetAppId, AlipayEcoSignFlowFinishModel alipayEcoSignFlowFinishModel) throws ApiException {
        ApiResponse<Object> localVarResp = finishWithHttpInfo(targetAppId, alipayEcoSignFlowFinishModel, null);
        return localVarResp.getData();
    }

    public Object finish(String targetAppId, AlipayEcoSignFlowFinishModel alipayEcoSignFlowFinishModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = finishWithHttpInfo(targetAppId, alipayEcoSignFlowFinishModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 签署流程归档
     * 手动归档签署流程，归档后所有资源不可修改，归档前签署流程中的所有签署人必须都签署完成。如果创建流程时，设置了自动归档，则无需调用本接口，签署完成后系统会自动调用。
     * @param targetAppId 目标isv应用ID (optional)
     * @param alipayEcoSignFlowFinishModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> finishWithHttpInfo(String targetAppId, AlipayEcoSignFlowFinishModel alipayEcoSignFlowFinishModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = finishValidateBeforeCall(targetAppId, alipayEcoSignFlowFinishModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEcoSignFlowFinishDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 签署流程归档 (asynchronously)
     * 手动归档签署流程，归档后所有资源不可修改，归档前签署流程中的所有签署人必须都签署完成。如果创建流程时，设置了自动归档，则无需调用本接口，签署完成后系统会自动调用。
     * @param targetAppId 目标isv应用ID (optional)
     * @param alipayEcoSignFlowFinishModel  (optional)
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
    public okhttp3.Call finishAsync(String targetAppId, AlipayEcoSignFlowFinishModel alipayEcoSignFlowFinishModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = finishValidateBeforeCall(targetAppId, alipayEcoSignFlowFinishModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call finishAsync(String targetAppId, AlipayEcoSignFlowFinishModel alipayEcoSignFlowFinishModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = finishValidateBeforeCall(targetAppId, alipayEcoSignFlowFinishModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param targetAppId 目标isv应用ID (optional)
     * @param flowId 流程id，通过 &lt;a href &#x3D;\&quot;https://opendocs.alipay.com/apis/api_50/alipay.eco.contract.signflows.create\&quot;&gt;创建电子合同签署流程&lt;/a&gt;(alipay.eco.contract.signflows.create)接口获取。 (optional)
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
    public okhttp3.Call queryCall(String targetAppId, String flowId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/eco/sign/flow/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (targetAppId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target_app_id", targetAppId));
        }

        if (flowId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("flow_id", flowId));
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
    private okhttp3.Call queryValidateBeforeCall(String targetAppId, String flowId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(targetAppId, flowId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 签署流程查询（E签宝）
     * 签署流程查询（E签宝）。可通过此接口查询流程、签署人的签署状态。
     * @param targetAppId 目标isv应用ID (optional)
     * @param flowId 流程id，通过 &lt;a href &#x3D;\&quot;https://opendocs.alipay.com/apis/api_50/alipay.eco.contract.signflows.create\&quot;&gt;创建电子合同签署流程&lt;/a&gt;(alipay.eco.contract.signflows.create)接口获取。 (optional)
     * @return AlipayEcoSignFlowQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEcoSignFlowQueryResponseModel query(String targetAppId, String flowId) throws ApiException {
        ApiResponse<AlipayEcoSignFlowQueryResponseModel> localVarResp = queryWithHttpInfo(targetAppId, flowId, null);
        return localVarResp.getData();
    }

    public AlipayEcoSignFlowQueryResponseModel query(String targetAppId, String flowId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEcoSignFlowQueryResponseModel> localVarResp = queryWithHttpInfo(targetAppId, flowId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 签署流程查询（E签宝）
     * 签署流程查询（E签宝）。可通过此接口查询流程、签署人的签署状态。
     * @param targetAppId 目标isv应用ID (optional)
     * @param flowId 流程id，通过 &lt;a href &#x3D;\&quot;https://opendocs.alipay.com/apis/api_50/alipay.eco.contract.signflows.create\&quot;&gt;创建电子合同签署流程&lt;/a&gt;(alipay.eco.contract.signflows.create)接口获取。 (optional)
     * @return ApiResponse&lt;AlipayEcoSignFlowQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEcoSignFlowQueryResponseModel> queryWithHttpInfo(String targetAppId, String flowId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(targetAppId, flowId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEcoSignFlowQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEcoSignFlowQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 签署流程查询（E签宝） (asynchronously)
     * 签署流程查询（E签宝）。可通过此接口查询流程、签署人的签署状态。
     * @param targetAppId 目标isv应用ID (optional)
     * @param flowId 流程id，通过 &lt;a href &#x3D;\&quot;https://opendocs.alipay.com/apis/api_50/alipay.eco.contract.signflows.create\&quot;&gt;创建电子合同签署流程&lt;/a&gt;(alipay.eco.contract.signflows.create)接口获取。 (optional)
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
    public okhttp3.Call queryAsync(String targetAppId, String flowId, final ApiCallback<AlipayEcoSignFlowQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(targetAppId, flowId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEcoSignFlowQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String targetAppId, String flowId, final ApiCallback<AlipayEcoSignFlowQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(targetAppId, flowId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEcoSignFlowQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}