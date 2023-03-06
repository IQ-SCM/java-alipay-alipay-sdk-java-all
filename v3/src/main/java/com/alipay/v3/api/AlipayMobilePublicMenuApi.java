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


import com.alipay.v3.model.AlipayMobilePublicMenuAddDefaultResponse;
import com.alipay.v3.model.AlipayMobilePublicMenuAddModel;
import com.alipay.v3.model.AlipayMobilePublicMenuAddResponseModel;
import com.alipay.v3.model.AlipayMobilePublicMenuGetDefaultResponse;
import com.alipay.v3.model.AlipayMobilePublicMenuGetResponseModel;
import com.alipay.v3.model.AlipayMobilePublicMenuUpdateDefaultResponse;
import com.alipay.v3.model.AlipayMobilePublicMenuUpdateModel;
import com.alipay.v3.model.AlipayMobilePublicMenuUpdateResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayMobilePublicMenuApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayMobilePublicMenuApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayMobilePublicMenuApi(ApiClient apiClient) {
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
     * Build call for add
     * @param alipayMobilePublicMenuAddModel  (optional)
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
    public okhttp3.Call addCall(AlipayMobilePublicMenuAddModel alipayMobilePublicMenuAddModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMobilePublicMenuAddModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/mobile/public/menu/add";

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
    private okhttp3.Call addValidateBeforeCall(AlipayMobilePublicMenuAddModel alipayMobilePublicMenuAddModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = addCall(alipayMobilePublicMenuAddModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 创建菜单
     * 通过POST一个特定的结构体，实现支付宝钱包客户端的服务窗创建自定义菜单。本接口只可以调用一次，菜单已存在无需再次创建，今后只需要调用更新接口。
     * @param alipayMobilePublicMenuAddModel  (optional)
     * @return AlipayMobilePublicMenuAddResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMobilePublicMenuAddResponseModel add(AlipayMobilePublicMenuAddModel alipayMobilePublicMenuAddModel) throws ApiException {
        ApiResponse<AlipayMobilePublicMenuAddResponseModel> localVarResp = addWithHttpInfo(alipayMobilePublicMenuAddModel, null);
        return localVarResp.getData();
    }

    public AlipayMobilePublicMenuAddResponseModel add(AlipayMobilePublicMenuAddModel alipayMobilePublicMenuAddModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMobilePublicMenuAddResponseModel> localVarResp = addWithHttpInfo(alipayMobilePublicMenuAddModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 创建菜单
     * 通过POST一个特定的结构体，实现支付宝钱包客户端的服务窗创建自定义菜单。本接口只可以调用一次，菜单已存在无需再次创建，今后只需要调用更新接口。
     * @param alipayMobilePublicMenuAddModel  (optional)
     * @return ApiResponse&lt;AlipayMobilePublicMenuAddResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMobilePublicMenuAddResponseModel> addWithHttpInfo(AlipayMobilePublicMenuAddModel alipayMobilePublicMenuAddModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = addValidateBeforeCall(alipayMobilePublicMenuAddModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMobilePublicMenuAddResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMobilePublicMenuAddDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 创建菜单 (asynchronously)
     * 通过POST一个特定的结构体，实现支付宝钱包客户端的服务窗创建自定义菜单。本接口只可以调用一次，菜单已存在无需再次创建，今后只需要调用更新接口。
     * @param alipayMobilePublicMenuAddModel  (optional)
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
    public okhttp3.Call addAsync(AlipayMobilePublicMenuAddModel alipayMobilePublicMenuAddModel, final ApiCallback<AlipayMobilePublicMenuAddResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = addValidateBeforeCall(alipayMobilePublicMenuAddModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMobilePublicMenuAddResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call addAsync(AlipayMobilePublicMenuAddModel alipayMobilePublicMenuAddModel, final ApiCallback<AlipayMobilePublicMenuAddResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = addValidateBeforeCall(alipayMobilePublicMenuAddModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMobilePublicMenuAddResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for get
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
    public okhttp3.Call getCall(final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/mobile/public/menu/get";

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
    private okhttp3.Call getValidateBeforeCall(final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = getCall(_callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询菜单
     * 查询当前使用的自定义菜单
     * @return AlipayMobilePublicMenuGetResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMobilePublicMenuGetResponseModel get() throws ApiException {
        ApiResponse<AlipayMobilePublicMenuGetResponseModel> localVarResp = getWithHttpInfo(null);
        return localVarResp.getData();
    }

    public AlipayMobilePublicMenuGetResponseModel get(CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMobilePublicMenuGetResponseModel> localVarResp = getWithHttpInfo(customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询菜单
     * 查询当前使用的自定义菜单
     * @return ApiResponse&lt;AlipayMobilePublicMenuGetResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMobilePublicMenuGetResponseModel> getWithHttpInfo(CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = getValidateBeforeCall(null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMobilePublicMenuGetResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMobilePublicMenuGetDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询菜单 (asynchronously)
     * 查询当前使用的自定义菜单
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
    public okhttp3.Call getAsync(final ApiCallback<AlipayMobilePublicMenuGetResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = getValidateBeforeCall(_callback, null);
        Type localVarReturnType = new TypeToken<AlipayMobilePublicMenuGetResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call getAsync(final ApiCallback<AlipayMobilePublicMenuGetResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = getValidateBeforeCall(_callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMobilePublicMenuGetResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for update
     * @param alipayMobilePublicMenuUpdateModel  (optional)
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
    public okhttp3.Call updateCall(AlipayMobilePublicMenuUpdateModel alipayMobilePublicMenuUpdateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMobilePublicMenuUpdateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/mobile/public/menu/update";

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
    private okhttp3.Call updateValidateBeforeCall(AlipayMobilePublicMenuUpdateModel alipayMobilePublicMenuUpdateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = updateCall(alipayMobilePublicMenuUpdateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 更新菜单
     * 通过POST一个特定结构体，实现支付宝钱包客户端的公众账号更新自定义菜单。每一次的更新是针对全部自定义菜单的更新。
     * @param alipayMobilePublicMenuUpdateModel  (optional)
     * @return AlipayMobilePublicMenuUpdateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMobilePublicMenuUpdateResponseModel update(AlipayMobilePublicMenuUpdateModel alipayMobilePublicMenuUpdateModel) throws ApiException {
        ApiResponse<AlipayMobilePublicMenuUpdateResponseModel> localVarResp = updateWithHttpInfo(alipayMobilePublicMenuUpdateModel, null);
        return localVarResp.getData();
    }

    public AlipayMobilePublicMenuUpdateResponseModel update(AlipayMobilePublicMenuUpdateModel alipayMobilePublicMenuUpdateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMobilePublicMenuUpdateResponseModel> localVarResp = updateWithHttpInfo(alipayMobilePublicMenuUpdateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 更新菜单
     * 通过POST一个特定结构体，实现支付宝钱包客户端的公众账号更新自定义菜单。每一次的更新是针对全部自定义菜单的更新。
     * @param alipayMobilePublicMenuUpdateModel  (optional)
     * @return ApiResponse&lt;AlipayMobilePublicMenuUpdateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMobilePublicMenuUpdateResponseModel> updateWithHttpInfo(AlipayMobilePublicMenuUpdateModel alipayMobilePublicMenuUpdateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = updateValidateBeforeCall(alipayMobilePublicMenuUpdateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMobilePublicMenuUpdateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMobilePublicMenuUpdateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 更新菜单 (asynchronously)
     * 通过POST一个特定结构体，实现支付宝钱包客户端的公众账号更新自定义菜单。每一次的更新是针对全部自定义菜单的更新。
     * @param alipayMobilePublicMenuUpdateModel  (optional)
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
    public okhttp3.Call updateAsync(AlipayMobilePublicMenuUpdateModel alipayMobilePublicMenuUpdateModel, final ApiCallback<AlipayMobilePublicMenuUpdateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateValidateBeforeCall(alipayMobilePublicMenuUpdateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMobilePublicMenuUpdateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call updateAsync(AlipayMobilePublicMenuUpdateModel alipayMobilePublicMenuUpdateModel, final ApiCallback<AlipayMobilePublicMenuUpdateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = updateValidateBeforeCall(alipayMobilePublicMenuUpdateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMobilePublicMenuUpdateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}