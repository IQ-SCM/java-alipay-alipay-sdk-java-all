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


import com.alipay.v3.model.AlipayUserCertifyOpenInitializeDefaultResponse;
import com.alipay.v3.model.AlipayUserCertifyOpenInitializeModel;
import com.alipay.v3.model.AlipayUserCertifyOpenInitializeResponseModel;
import com.alipay.v3.model.AlipayUserCertifyOpenQueryDefaultResponse;
import com.alipay.v3.model.AlipayUserCertifyOpenQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayUserCertifyOpenApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayUserCertifyOpenApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayUserCertifyOpenApi(ApiClient apiClient) {
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
     * Build call for initialize
     * @param alipayUserCertifyOpenInitializeModel  (optional)
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
    public okhttp3.Call initializeCall(AlipayUserCertifyOpenInitializeModel alipayUserCertifyOpenInitializeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayUserCertifyOpenInitializeModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/user/certify/open/initialize";

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
    private okhttp3.Call initializeValidateBeforeCall(AlipayUserCertifyOpenInitializeModel alipayUserCertifyOpenInitializeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = initializeCall(alipayUserCertifyOpenInitializeModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 身份认证初始化服务
     * 支付宝开放认证初始化服务，用于创建开放认证流程。注意：港澳台同胞身份验证服务仅支持在支付宝客户端内使用，外部 APP 使用该项服务需唤起支付宝客户端。
     * @param alipayUserCertifyOpenInitializeModel  (optional)
     * @return AlipayUserCertifyOpenInitializeResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayUserCertifyOpenInitializeResponseModel initialize(AlipayUserCertifyOpenInitializeModel alipayUserCertifyOpenInitializeModel) throws ApiException {
        ApiResponse<AlipayUserCertifyOpenInitializeResponseModel> localVarResp = initializeWithHttpInfo(alipayUserCertifyOpenInitializeModel, null);
        return localVarResp.getData();
    }

    public AlipayUserCertifyOpenInitializeResponseModel initialize(AlipayUserCertifyOpenInitializeModel alipayUserCertifyOpenInitializeModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayUserCertifyOpenInitializeResponseModel> localVarResp = initializeWithHttpInfo(alipayUserCertifyOpenInitializeModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 身份认证初始化服务
     * 支付宝开放认证初始化服务，用于创建开放认证流程。注意：港澳台同胞身份验证服务仅支持在支付宝客户端内使用，外部 APP 使用该项服务需唤起支付宝客户端。
     * @param alipayUserCertifyOpenInitializeModel  (optional)
     * @return ApiResponse&lt;AlipayUserCertifyOpenInitializeResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayUserCertifyOpenInitializeResponseModel> initializeWithHttpInfo(AlipayUserCertifyOpenInitializeModel alipayUserCertifyOpenInitializeModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = initializeValidateBeforeCall(alipayUserCertifyOpenInitializeModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayUserCertifyOpenInitializeResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayUserCertifyOpenInitializeDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 身份认证初始化服务 (asynchronously)
     * 支付宝开放认证初始化服务，用于创建开放认证流程。注意：港澳台同胞身份验证服务仅支持在支付宝客户端内使用，外部 APP 使用该项服务需唤起支付宝客户端。
     * @param alipayUserCertifyOpenInitializeModel  (optional)
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
    public okhttp3.Call initializeAsync(AlipayUserCertifyOpenInitializeModel alipayUserCertifyOpenInitializeModel, final ApiCallback<AlipayUserCertifyOpenInitializeResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = initializeValidateBeforeCall(alipayUserCertifyOpenInitializeModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayUserCertifyOpenInitializeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call initializeAsync(AlipayUserCertifyOpenInitializeModel alipayUserCertifyOpenInitializeModel, final ApiCallback<AlipayUserCertifyOpenInitializeResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = initializeValidateBeforeCall(alipayUserCertifyOpenInitializeModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayUserCertifyOpenInitializeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param certifyId 本次申请操作的唯一标识，通过alipay.user.certify.open.initialize(身份认证初始化服务)接口同步响应获取。 (optional)
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
    public okhttp3.Call queryCall(String certifyId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/user/certify/open/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (certifyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("certify_id", certifyId));
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
    private okhttp3.Call queryValidateBeforeCall(String certifyId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(certifyId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 身份认证记录查询
     * 商户在开放认证完成后，调用本接口查询认证状态和相关数据
     * @param certifyId 本次申请操作的唯一标识，通过alipay.user.certify.open.initialize(身份认证初始化服务)接口同步响应获取。 (optional)
     * @return AlipayUserCertifyOpenQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayUserCertifyOpenQueryResponseModel query(String certifyId) throws ApiException {
        ApiResponse<AlipayUserCertifyOpenQueryResponseModel> localVarResp = queryWithHttpInfo(certifyId, null);
        return localVarResp.getData();
    }

    public AlipayUserCertifyOpenQueryResponseModel query(String certifyId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayUserCertifyOpenQueryResponseModel> localVarResp = queryWithHttpInfo(certifyId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 身份认证记录查询
     * 商户在开放认证完成后，调用本接口查询认证状态和相关数据
     * @param certifyId 本次申请操作的唯一标识，通过alipay.user.certify.open.initialize(身份认证初始化服务)接口同步响应获取。 (optional)
     * @return ApiResponse&lt;AlipayUserCertifyOpenQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayUserCertifyOpenQueryResponseModel> queryWithHttpInfo(String certifyId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(certifyId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayUserCertifyOpenQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayUserCertifyOpenQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 身份认证记录查询 (asynchronously)
     * 商户在开放认证完成后，调用本接口查询认证状态和相关数据
     * @param certifyId 本次申请操作的唯一标识，通过alipay.user.certify.open.initialize(身份认证初始化服务)接口同步响应获取。 (optional)
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
    public okhttp3.Call queryAsync(String certifyId, final ApiCallback<AlipayUserCertifyOpenQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(certifyId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayUserCertifyOpenQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String certifyId, final ApiCallback<AlipayUserCertifyOpenQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(certifyId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayUserCertifyOpenQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
