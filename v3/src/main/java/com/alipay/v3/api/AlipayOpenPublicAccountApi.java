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


import com.alipay.v3.model.AlipayOpenPublicAccountCreateDefaultResponse;
import com.alipay.v3.model.AlipayOpenPublicAccountCreateModel;
import com.alipay.v3.model.AlipayOpenPublicAccountCreateResponseModel;
import com.alipay.v3.model.AlipayOpenPublicAccountDeleteDefaultResponse;
import com.alipay.v3.model.AlipayOpenPublicAccountQueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenPublicAccountQueryResponseModel;
import com.alipay.v3.model.AlipayOpenPublicAccountResetDefaultResponse;
import com.alipay.v3.model.AlipayOpenPublicAccountResetModel;
import com.alipay.v3.model.AlipayOpenPublicAccountResetResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenPublicAccountApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenPublicAccountApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenPublicAccountApi(ApiClient apiClient) {
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
     * Build call for create
     * @param alipayOpenPublicAccountCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayOpenPublicAccountCreateModel alipayOpenPublicAccountCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenPublicAccountCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/public/account/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayOpenPublicAccountCreateModel alipayOpenPublicAccountCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayOpenPublicAccountCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 添加绑定商户会员号
     * 当用户成为商户的关注用户后，可以在商户的服务窗中点击“添加绑定商户会员号”功能，支付宝系统收到操作请求后将该动作通知给商户（使用用户发送信息到商户接口，其中eventType（事件类型）为click，actionParam（按钮标识）为authentication），商户根据此通知调用商户回复消息接口（其中须包含Url链接地址），支付宝收到商户的回复消息中的链接地址后，自动跳转至商户平台的上商户会员绑定界面中，让用户完成账户绑定。 当用户有效完成账户绑定后，商户调用本接口，把绑定结果数据通知给支付宝。
     * @param alipayOpenPublicAccountCreateModel  (optional)
     * @return AlipayOpenPublicAccountCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenPublicAccountCreateResponseModel create(AlipayOpenPublicAccountCreateModel alipayOpenPublicAccountCreateModel) throws ApiException {
        ApiResponse<AlipayOpenPublicAccountCreateResponseModel> localVarResp = createWithHttpInfo(alipayOpenPublicAccountCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenPublicAccountCreateResponseModel create(AlipayOpenPublicAccountCreateModel alipayOpenPublicAccountCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenPublicAccountCreateResponseModel> localVarResp = createWithHttpInfo(alipayOpenPublicAccountCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 添加绑定商户会员号
     * 当用户成为商户的关注用户后，可以在商户的服务窗中点击“添加绑定商户会员号”功能，支付宝系统收到操作请求后将该动作通知给商户（使用用户发送信息到商户接口，其中eventType（事件类型）为click，actionParam（按钮标识）为authentication），商户根据此通知调用商户回复消息接口（其中须包含Url链接地址），支付宝收到商户的回复消息中的链接地址后，自动跳转至商户平台的上商户会员绑定界面中，让用户完成账户绑定。 当用户有效完成账户绑定后，商户调用本接口，把绑定结果数据通知给支付宝。
     * @param alipayOpenPublicAccountCreateModel  (optional)
     * @return ApiResponse&lt;AlipayOpenPublicAccountCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenPublicAccountCreateResponseModel> createWithHttpInfo(AlipayOpenPublicAccountCreateModel alipayOpenPublicAccountCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenPublicAccountCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenPublicAccountCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenPublicAccountCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 添加绑定商户会员号 (asynchronously)
     * 当用户成为商户的关注用户后，可以在商户的服务窗中点击“添加绑定商户会员号”功能，支付宝系统收到操作请求后将该动作通知给商户（使用用户发送信息到商户接口，其中eventType（事件类型）为click，actionParam（按钮标识）为authentication），商户根据此通知调用商户回复消息接口（其中须包含Url链接地址），支付宝收到商户的回复消息中的链接地址后，自动跳转至商户平台的上商户会员绑定界面中，让用户完成账户绑定。 当用户有效完成账户绑定后，商户调用本接口，把绑定结果数据通知给支付宝。
     * @param alipayOpenPublicAccountCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayOpenPublicAccountCreateModel alipayOpenPublicAccountCreateModel, final ApiCallback<AlipayOpenPublicAccountCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenPublicAccountCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenPublicAccountCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call createAsync(AlipayOpenPublicAccountCreateModel alipayOpenPublicAccountCreateModel, final ApiCallback<AlipayOpenPublicAccountCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenPublicAccountCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenPublicAccountCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for delete
     * @param agreementId 协议号，商户会员在支付宝服务窗账号中的唯一标识，与bind_account_no不能同时为空 (optional)
     * @param bindAccountNo 绑定帐号，建议在开发者的系统中保持唯一性，与agreement_id不能同时为空 (optional)
     * @param fromUserId 绑定用户的支付宝userid，2088开头16位长度的字符串，与agreementId不能同时为空 (optional)
     * @param openId 支付宝用户的唯一标识 (optional)
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
    public okhttp3.Call deleteCall(String agreementId, String bindAccountNo, String fromUserId, String openId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/public/account/delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (agreementId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_id", agreementId));
        }

        if (bindAccountNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("bind_account_no", bindAccountNo));
        }

        if (fromUserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from_user_id", fromUserId));
        }

        if (openId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("open_id", openId));
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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteValidateBeforeCall(String agreementId, String bindAccountNo, String fromUserId, String openId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = deleteCall(agreementId, bindAccountNo, fromUserId, openId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 解除绑定商户会员号
     * 在支付宝服务窗中目前一共有三种解除绑定商户会员号的场景，具体如下：  用户取消关注服务窗  用户在服务窗内手动执行解除绑定操作  开发者调用解除绑定商户会员号接口解除绑定
     * @param agreementId 协议号，商户会员在支付宝服务窗账号中的唯一标识，与bind_account_no不能同时为空 (optional)
     * @param bindAccountNo 绑定帐号，建议在开发者的系统中保持唯一性，与agreement_id不能同时为空 (optional)
     * @param fromUserId 绑定用户的支付宝userid，2088开头16位长度的字符串，与agreementId不能同时为空 (optional)
     * @param openId 支付宝用户的唯一标识 (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object delete(String agreementId, String bindAccountNo, String fromUserId, String openId) throws ApiException {
        ApiResponse<Object> localVarResp = deleteWithHttpInfo(agreementId, bindAccountNo, fromUserId, openId, null);
        return localVarResp.getData();
    }

    public Object delete(String agreementId, String bindAccountNo, String fromUserId, String openId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = deleteWithHttpInfo(agreementId, bindAccountNo, fromUserId, openId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 解除绑定商户会员号
     * 在支付宝服务窗中目前一共有三种解除绑定商户会员号的场景，具体如下：  用户取消关注服务窗  用户在服务窗内手动执行解除绑定操作  开发者调用解除绑定商户会员号接口解除绑定
     * @param agreementId 协议号，商户会员在支付宝服务窗账号中的唯一标识，与bind_account_no不能同时为空 (optional)
     * @param bindAccountNo 绑定帐号，建议在开发者的系统中保持唯一性，与agreement_id不能同时为空 (optional)
     * @param fromUserId 绑定用户的支付宝userid，2088开头16位长度的字符串，与agreementId不能同时为空 (optional)
     * @param openId 支付宝用户的唯一标识 (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> deleteWithHttpInfo(String agreementId, String bindAccountNo, String fromUserId, String openId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(agreementId, bindAccountNo, fromUserId, openId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenPublicAccountDeleteDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 解除绑定商户会员号 (asynchronously)
     * 在支付宝服务窗中目前一共有三种解除绑定商户会员号的场景，具体如下：  用户取消关注服务窗  用户在服务窗内手动执行解除绑定操作  开发者调用解除绑定商户会员号接口解除绑定
     * @param agreementId 协议号，商户会员在支付宝服务窗账号中的唯一标识，与bind_account_no不能同时为空 (optional)
     * @param bindAccountNo 绑定帐号，建议在开发者的系统中保持唯一性，与agreement_id不能同时为空 (optional)
     * @param fromUserId 绑定用户的支付宝userid，2088开头16位长度的字符串，与agreementId不能同时为空 (optional)
     * @param openId 支付宝用户的唯一标识 (optional)
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
    public okhttp3.Call deleteAsync(String agreementId, String bindAccountNo, String fromUserId, String openId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(agreementId, bindAccountNo, fromUserId, openId, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call deleteAsync(String agreementId, String bindAccountNo, String fromUserId, String openId, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(agreementId, bindAccountNo, fromUserId, openId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param userId 用户的支付宝用户号，2088开头。 (optional)
     * @param openId 支付宝用户的唯一标识 (optional)
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
    public okhttp3.Call queryCall(String userId, String openId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/public/account/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_id", userId));
        }

        if (openId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("open_id", openId));
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
    private okhttp3.Call queryValidateBeforeCall(String userId, String openId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(userId, openId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询绑定商户会员号
     * 当用户成为商户的关注用户之后，则商户可以通过本接口查询关注者的绑定账户，以便补全异常情况下的单边账户数据。
     * @param userId 用户的支付宝用户号，2088开头。 (optional)
     * @param openId 支付宝用户的唯一标识 (optional)
     * @return AlipayOpenPublicAccountQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenPublicAccountQueryResponseModel query(String userId, String openId) throws ApiException {
        ApiResponse<AlipayOpenPublicAccountQueryResponseModel> localVarResp = queryWithHttpInfo(userId, openId, null);
        return localVarResp.getData();
    }

    public AlipayOpenPublicAccountQueryResponseModel query(String userId, String openId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenPublicAccountQueryResponseModel> localVarResp = queryWithHttpInfo(userId, openId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询绑定商户会员号
     * 当用户成为商户的关注用户之后，则商户可以通过本接口查询关注者的绑定账户，以便补全异常情况下的单边账户数据。
     * @param userId 用户的支付宝用户号，2088开头。 (optional)
     * @param openId 支付宝用户的唯一标识 (optional)
     * @return ApiResponse&lt;AlipayOpenPublicAccountQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenPublicAccountQueryResponseModel> queryWithHttpInfo(String userId, String openId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(userId, openId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenPublicAccountQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenPublicAccountQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询绑定商户会员号 (asynchronously)
     * 当用户成为商户的关注用户之后，则商户可以通过本接口查询关注者的绑定账户，以便补全异常情况下的单边账户数据。
     * @param userId 用户的支付宝用户号，2088开头。 (optional)
     * @param openId 支付宝用户的唯一标识 (optional)
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
    public okhttp3.Call queryAsync(String userId, String openId, final ApiCallback<AlipayOpenPublicAccountQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(userId, openId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenPublicAccountQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String userId, String openId, final ApiCallback<AlipayOpenPublicAccountQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(userId, openId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenPublicAccountQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for reset
     * @param alipayOpenPublicAccountResetModel  (optional)
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
    public okhttp3.Call resetCall(AlipayOpenPublicAccountResetModel alipayOpenPublicAccountResetModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenPublicAccountResetModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/public/account/reset";

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
    private okhttp3.Call resetValidateBeforeCall(AlipayOpenPublicAccountResetModel alipayOpenPublicAccountResetModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = resetCall(alipayOpenPublicAccountResetModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 重新设置绑定商家会员号
     * 如果商户想要重置已经添加的外部账户，可以通过该接口完成。重置后，原有的外部户将删除，新的外部户添加进去。
     * @param alipayOpenPublicAccountResetModel  (optional)
     * @return AlipayOpenPublicAccountResetResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenPublicAccountResetResponseModel reset(AlipayOpenPublicAccountResetModel alipayOpenPublicAccountResetModel) throws ApiException {
        ApiResponse<AlipayOpenPublicAccountResetResponseModel> localVarResp = resetWithHttpInfo(alipayOpenPublicAccountResetModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenPublicAccountResetResponseModel reset(AlipayOpenPublicAccountResetModel alipayOpenPublicAccountResetModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenPublicAccountResetResponseModel> localVarResp = resetWithHttpInfo(alipayOpenPublicAccountResetModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 重新设置绑定商家会员号
     * 如果商户想要重置已经添加的外部账户，可以通过该接口完成。重置后，原有的外部户将删除，新的外部户添加进去。
     * @param alipayOpenPublicAccountResetModel  (optional)
     * @return ApiResponse&lt;AlipayOpenPublicAccountResetResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenPublicAccountResetResponseModel> resetWithHttpInfo(AlipayOpenPublicAccountResetModel alipayOpenPublicAccountResetModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = resetValidateBeforeCall(alipayOpenPublicAccountResetModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenPublicAccountResetResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenPublicAccountResetDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 重新设置绑定商家会员号 (asynchronously)
     * 如果商户想要重置已经添加的外部账户，可以通过该接口完成。重置后，原有的外部户将删除，新的外部户添加进去。
     * @param alipayOpenPublicAccountResetModel  (optional)
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
    public okhttp3.Call resetAsync(AlipayOpenPublicAccountResetModel alipayOpenPublicAccountResetModel, final ApiCallback<AlipayOpenPublicAccountResetResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = resetValidateBeforeCall(alipayOpenPublicAccountResetModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenPublicAccountResetResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call resetAsync(AlipayOpenPublicAccountResetModel alipayOpenPublicAccountResetModel, final ApiCallback<AlipayOpenPublicAccountResetResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = resetValidateBeforeCall(alipayOpenPublicAccountResetModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenPublicAccountResetResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
