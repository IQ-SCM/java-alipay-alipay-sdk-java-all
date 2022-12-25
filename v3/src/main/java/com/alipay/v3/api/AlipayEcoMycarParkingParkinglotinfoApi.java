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


import com.alipay.v3.model.AlipayEcoMycarParkingParkinglotinfoCreateDefaultResponse;
import com.alipay.v3.model.AlipayEcoMycarParkingParkinglotinfoCreateModel;
import com.alipay.v3.model.AlipayEcoMycarParkingParkinglotinfoCreateResponseModel;
import com.alipay.v3.model.AlipayEcoMycarParkingParkinglotinfoQueryDefaultResponse;
import com.alipay.v3.model.AlipayEcoMycarParkingParkinglotinfoQueryResponseModel;
import com.alipay.v3.model.AlipayEcoMycarParkingParkinglotinfoUpdateDefaultResponse;
import com.alipay.v3.model.AlipayEcoMycarParkingParkinglotinfoUpdateModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEcoMycarParkingParkinglotinfoApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEcoMycarParkingParkinglotinfoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEcoMycarParkingParkinglotinfoApi(ApiClient apiClient) {
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
     * @param alipayEcoMycarParkingParkinglotinfoCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayEcoMycarParkingParkinglotinfoCreateModel alipayEcoMycarParkingParkinglotinfoCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEcoMycarParkingParkinglotinfoCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/eco/mycar/parking/parkinglotinfo/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayEcoMycarParkingParkinglotinfoCreateModel alipayEcoMycarParkingParkinglotinfoCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayEcoMycarParkingParkinglotinfoCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 录入停车场信息
     * 录入停车场信息，内容信息通过该接口提交到支付宝，支付宝会生成支付宝这边停车场ID反馈给开发者，用户后续更新和上送车辆信息。
     * @param alipayEcoMycarParkingParkinglotinfoCreateModel  (optional)
     * @return AlipayEcoMycarParkingParkinglotinfoCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEcoMycarParkingParkinglotinfoCreateResponseModel create(AlipayEcoMycarParkingParkinglotinfoCreateModel alipayEcoMycarParkingParkinglotinfoCreateModel) throws ApiException {
        ApiResponse<AlipayEcoMycarParkingParkinglotinfoCreateResponseModel> localVarResp = createWithHttpInfo(alipayEcoMycarParkingParkinglotinfoCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayEcoMycarParkingParkinglotinfoCreateResponseModel create(AlipayEcoMycarParkingParkinglotinfoCreateModel alipayEcoMycarParkingParkinglotinfoCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEcoMycarParkingParkinglotinfoCreateResponseModel> localVarResp = createWithHttpInfo(alipayEcoMycarParkingParkinglotinfoCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 录入停车场信息
     * 录入停车场信息，内容信息通过该接口提交到支付宝，支付宝会生成支付宝这边停车场ID反馈给开发者，用户后续更新和上送车辆信息。
     * @param alipayEcoMycarParkingParkinglotinfoCreateModel  (optional)
     * @return ApiResponse&lt;AlipayEcoMycarParkingParkinglotinfoCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEcoMycarParkingParkinglotinfoCreateResponseModel> createWithHttpInfo(AlipayEcoMycarParkingParkinglotinfoCreateModel alipayEcoMycarParkingParkinglotinfoCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEcoMycarParkingParkinglotinfoCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEcoMycarParkingParkinglotinfoCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEcoMycarParkingParkinglotinfoCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 录入停车场信息 (asynchronously)
     * 录入停车场信息，内容信息通过该接口提交到支付宝，支付宝会生成支付宝这边停车场ID反馈给开发者，用户后续更新和上送车辆信息。
     * @param alipayEcoMycarParkingParkinglotinfoCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayEcoMycarParkingParkinglotinfoCreateModel alipayEcoMycarParkingParkinglotinfoCreateModel, final ApiCallback<AlipayEcoMycarParkingParkinglotinfoCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEcoMycarParkingParkinglotinfoCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEcoMycarParkingParkinglotinfoCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call createAsync(AlipayEcoMycarParkingParkinglotinfoCreateModel alipayEcoMycarParkingParkinglotinfoCreateModel, final ApiCallback<AlipayEcoMycarParkingParkinglotinfoCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEcoMycarParkingParkinglotinfoCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEcoMycarParkingParkinglotinfoCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param parkingId 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个ISV或商户范围内唯一。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\&quot;&gt;alipay.eco.mycar.parking.parkinglotinfo.create&lt;/a&gt;(录入停车场信息)接口获取。 注意：parking_id和out_parking_id不能同时为空。 (optional)
     * @param outParkingId ISV停车场ID，由ISV定义的停车场标识，同一个ISV或商户范围内唯一。需与 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\&quot;&gt;alipay.eco.mycar.parking.parkinglotinfo.create&lt;/a&gt;(录入停车场信息)接口传入值一致。 注意：parking_id和out_parking_id不能同时为空。 (optional)
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
    public okhttp3.Call queryCall(String parkingId, String outParkingId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/eco/mycar/parking/parkinglotinfo/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (parkingId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("parking_id", parkingId));
        }

        if (outParkingId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("out_parking_id", outParkingId));
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
    private okhttp3.Call queryValidateBeforeCall(String parkingId, String outParkingId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(parkingId, outParkingId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 停车场信息查询
     * 停车场信息查询，通过停车场id或者ISV停车场ID查询停车场信息。只能查询正在调用接口商户自己创建的停车场，限制在归属PID层面上。
     * @param parkingId 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个ISV或商户范围内唯一。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\&quot;&gt;alipay.eco.mycar.parking.parkinglotinfo.create&lt;/a&gt;(录入停车场信息)接口获取。 注意：parking_id和out_parking_id不能同时为空。 (optional)
     * @param outParkingId ISV停车场ID，由ISV定义的停车场标识，同一个ISV或商户范围内唯一。需与 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\&quot;&gt;alipay.eco.mycar.parking.parkinglotinfo.create&lt;/a&gt;(录入停车场信息)接口传入值一致。 注意：parking_id和out_parking_id不能同时为空。 (optional)
     * @return AlipayEcoMycarParkingParkinglotinfoQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel query(String parkingId, String outParkingId) throws ApiException {
        ApiResponse<AlipayEcoMycarParkingParkinglotinfoQueryResponseModel> localVarResp = queryWithHttpInfo(parkingId, outParkingId, null);
        return localVarResp.getData();
    }

    public AlipayEcoMycarParkingParkinglotinfoQueryResponseModel query(String parkingId, String outParkingId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEcoMycarParkingParkinglotinfoQueryResponseModel> localVarResp = queryWithHttpInfo(parkingId, outParkingId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 停车场信息查询
     * 停车场信息查询，通过停车场id或者ISV停车场ID查询停车场信息。只能查询正在调用接口商户自己创建的停车场，限制在归属PID层面上。
     * @param parkingId 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个ISV或商户范围内唯一。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\&quot;&gt;alipay.eco.mycar.parking.parkinglotinfo.create&lt;/a&gt;(录入停车场信息)接口获取。 注意：parking_id和out_parking_id不能同时为空。 (optional)
     * @param outParkingId ISV停车场ID，由ISV定义的停车场标识，同一个ISV或商户范围内唯一。需与 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\&quot;&gt;alipay.eco.mycar.parking.parkinglotinfo.create&lt;/a&gt;(录入停车场信息)接口传入值一致。 注意：parking_id和out_parking_id不能同时为空。 (optional)
     * @return ApiResponse&lt;AlipayEcoMycarParkingParkinglotinfoQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEcoMycarParkingParkinglotinfoQueryResponseModel> queryWithHttpInfo(String parkingId, String outParkingId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(parkingId, outParkingId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEcoMycarParkingParkinglotinfoQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEcoMycarParkingParkinglotinfoQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 停车场信息查询 (asynchronously)
     * 停车场信息查询，通过停车场id或者ISV停车场ID查询停车场信息。只能查询正在调用接口商户自己创建的停车场，限制在归属PID层面上。
     * @param parkingId 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个ISV或商户范围内唯一。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\&quot;&gt;alipay.eco.mycar.parking.parkinglotinfo.create&lt;/a&gt;(录入停车场信息)接口获取。 注意：parking_id和out_parking_id不能同时为空。 (optional)
     * @param outParkingId ISV停车场ID，由ISV定义的停车场标识，同一个ISV或商户范围内唯一。需与 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\&quot;&gt;alipay.eco.mycar.parking.parkinglotinfo.create&lt;/a&gt;(录入停车场信息)接口传入值一致。 注意：parking_id和out_parking_id不能同时为空。 (optional)
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
    public okhttp3.Call queryAsync(String parkingId, String outParkingId, final ApiCallback<AlipayEcoMycarParkingParkinglotinfoQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(parkingId, outParkingId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEcoMycarParkingParkinglotinfoQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String parkingId, String outParkingId, final ApiCallback<AlipayEcoMycarParkingParkinglotinfoQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(parkingId, outParkingId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEcoMycarParkingParkinglotinfoQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for update
     * @param alipayEcoMycarParkingParkinglotinfoUpdateModel  (optional)
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
    public okhttp3.Call updateCall(AlipayEcoMycarParkingParkinglotinfoUpdateModel alipayEcoMycarParkingParkinglotinfoUpdateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEcoMycarParkingParkinglotinfoUpdateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/eco/mycar/parking/parkinglotinfo/update";

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
    private okhttp3.Call updateValidateBeforeCall(AlipayEcoMycarParkingParkinglotinfoUpdateModel alipayEcoMycarParkingParkinglotinfoUpdateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = updateCall(alipayEcoMycarParkingParkinglotinfoUpdateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 修改停车场信息
     * 录入停车场信息，内容信息通过该接口提交到支付宝，支付宝会生成支付宝这边停车场ID反馈给开发者，用于后续更新和上送车辆信息，停车场名称不允许修改。
     * @param alipayEcoMycarParkingParkinglotinfoUpdateModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object update(AlipayEcoMycarParkingParkinglotinfoUpdateModel alipayEcoMycarParkingParkinglotinfoUpdateModel) throws ApiException {
        ApiResponse<Object> localVarResp = updateWithHttpInfo(alipayEcoMycarParkingParkinglotinfoUpdateModel, null);
        return localVarResp.getData();
    }

    public Object update(AlipayEcoMycarParkingParkinglotinfoUpdateModel alipayEcoMycarParkingParkinglotinfoUpdateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = updateWithHttpInfo(alipayEcoMycarParkingParkinglotinfoUpdateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 修改停车场信息
     * 录入停车场信息，内容信息通过该接口提交到支付宝，支付宝会生成支付宝这边停车场ID反馈给开发者，用于后续更新和上送车辆信息，停车场名称不允许修改。
     * @param alipayEcoMycarParkingParkinglotinfoUpdateModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> updateWithHttpInfo(AlipayEcoMycarParkingParkinglotinfoUpdateModel alipayEcoMycarParkingParkinglotinfoUpdateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = updateValidateBeforeCall(alipayEcoMycarParkingParkinglotinfoUpdateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEcoMycarParkingParkinglotinfoUpdateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 修改停车场信息 (asynchronously)
     * 录入停车场信息，内容信息通过该接口提交到支付宝，支付宝会生成支付宝这边停车场ID反馈给开发者，用于后续更新和上送车辆信息，停车场名称不允许修改。
     * @param alipayEcoMycarParkingParkinglotinfoUpdateModel  (optional)
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
    public okhttp3.Call updateAsync(AlipayEcoMycarParkingParkinglotinfoUpdateModel alipayEcoMycarParkingParkinglotinfoUpdateModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateValidateBeforeCall(alipayEcoMycarParkingParkinglotinfoUpdateModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call updateAsync(AlipayEcoMycarParkingParkinglotinfoUpdateModel alipayEcoMycarParkingParkinglotinfoUpdateModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = updateValidateBeforeCall(alipayEcoMycarParkingParkinglotinfoUpdateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
