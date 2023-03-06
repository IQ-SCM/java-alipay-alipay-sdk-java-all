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


import com.alipay.v3.model.AlipayIserviceCcmRolePageQueryDefaultResponse;
import com.alipay.v3.model.AlipayIserviceCcmRolePageQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayIserviceCcmRolePageApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayIserviceCcmRolePageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayIserviceCcmRolePageApi(ApiClient apiClient) {
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
     * @param name 角色名称 (optional)
     * @param pageNum 查询结果的页码，起始值为 1，默认值为 1 (optional)
     * @param pageSize 分页查询时设置的每页记录数，最大值 100 行，默认为 10 (optional)
     * @param ccsInstanceId 部门id（即租户实例ID、数据权限ID） (optional)
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
    public okhttp3.Call queryCall(String name, Integer pageNum, Integer pageSize, String ccsInstanceId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/iservice/ccm/role/page/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (pageNum != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_num", pageNum));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (ccsInstanceId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ccs_instance_id", ccsInstanceId));
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
    private okhttp3.Call queryValidateBeforeCall(String name, Integer pageNum, Integer pageSize, String ccsInstanceId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(name, pageNum, pageSize, ccsInstanceId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 分页查询角色
     * 分页查询角色
     * @param name 角色名称 (optional)
     * @param pageNum 查询结果的页码，起始值为 1，默认值为 1 (optional)
     * @param pageSize 分页查询时设置的每页记录数，最大值 100 行，默认为 10 (optional)
     * @param ccsInstanceId 部门id（即租户实例ID、数据权限ID） (optional)
     * @return AlipayIserviceCcmRolePageQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayIserviceCcmRolePageQueryResponseModel query(String name, Integer pageNum, Integer pageSize, String ccsInstanceId) throws ApiException {
        ApiResponse<AlipayIserviceCcmRolePageQueryResponseModel> localVarResp = queryWithHttpInfo(name, pageNum, pageSize, ccsInstanceId, null);
        return localVarResp.getData();
    }

    public AlipayIserviceCcmRolePageQueryResponseModel query(String name, Integer pageNum, Integer pageSize, String ccsInstanceId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayIserviceCcmRolePageQueryResponseModel> localVarResp = queryWithHttpInfo(name, pageNum, pageSize, ccsInstanceId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 分页查询角色
     * 分页查询角色
     * @param name 角色名称 (optional)
     * @param pageNum 查询结果的页码，起始值为 1，默认值为 1 (optional)
     * @param pageSize 分页查询时设置的每页记录数，最大值 100 行，默认为 10 (optional)
     * @param ccsInstanceId 部门id（即租户实例ID、数据权限ID） (optional)
     * @return ApiResponse&lt;AlipayIserviceCcmRolePageQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayIserviceCcmRolePageQueryResponseModel> queryWithHttpInfo(String name, Integer pageNum, Integer pageSize, String ccsInstanceId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(name, pageNum, pageSize, ccsInstanceId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayIserviceCcmRolePageQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayIserviceCcmRolePageQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 分页查询角色 (asynchronously)
     * 分页查询角色
     * @param name 角色名称 (optional)
     * @param pageNum 查询结果的页码，起始值为 1，默认值为 1 (optional)
     * @param pageSize 分页查询时设置的每页记录数，最大值 100 行，默认为 10 (optional)
     * @param ccsInstanceId 部门id（即租户实例ID、数据权限ID） (optional)
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
    public okhttp3.Call queryAsync(String name, Integer pageNum, Integer pageSize, String ccsInstanceId, final ApiCallback<AlipayIserviceCcmRolePageQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(name, pageNum, pageSize, ccsInstanceId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayIserviceCcmRolePageQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String name, Integer pageNum, Integer pageSize, String ccsInstanceId, final ApiCallback<AlipayIserviceCcmRolePageQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(name, pageNum, pageSize, ccsInstanceId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayIserviceCcmRolePageQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}