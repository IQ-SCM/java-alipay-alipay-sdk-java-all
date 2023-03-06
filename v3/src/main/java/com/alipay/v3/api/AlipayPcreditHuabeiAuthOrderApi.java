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


import com.alipay.v3.model.AlipayPcreditHuabeiAuthOrderQueryDefaultResponse;
import com.alipay.v3.model.AlipayPcreditHuabeiAuthOrderQueryResponseModel;
import com.alipay.v3.model.AlipayPcreditHuabeiAuthOrderUnfreezeDefaultResponse;
import com.alipay.v3.model.AlipayPcreditHuabeiAuthOrderUnfreezeModel;
import com.alipay.v3.model.AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayPcreditHuabeiAuthOrderApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayPcreditHuabeiAuthOrderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayPcreditHuabeiAuthOrderApi(ApiClient apiClient) {
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
     * @param authOptId 支付宝侧花呗冻结、解冻操作单据id。在原先的冻结或者解冻接口调用中同步返回给商户，或者通过商户通知返回给商户。按订单号查询时，此字段不可为空。 (optional)
     * @param alipayUserId 买家在支付宝的用户id。通过userid+请求流水号组合查询时，此字段不可为空。 (optional)
     * @param openId 买家在支付宝的用户id (optional)
     * @param outRequestNo 商户原先调用冻结、解冻接口传入的请求流水号。按照流水号查询订单时，此字段不能为空。 (optional)
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
    public okhttp3.Call queryCall(String authOptId, String alipayUserId, String openId, String outRequestNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/pcredit/huabei/auth/order/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authOptId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("auth_opt_id", authOptId));
        }

        if (alipayUserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("alipay_user_id", alipayUserId));
        }

        if (openId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("open_id", openId));
        }

        if (outRequestNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("out_request_no", outRequestNo));
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
    private okhttp3.Call queryValidateBeforeCall(String authOptId, String alipayUserId, String openId, String outRequestNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(authOptId, alipayUserId, openId, outRequestNo, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 花呗先享订单查询接口
     * 查询花呗先享冻结、解冻订单内容及状态。有3种查询方式。推荐商户优先使用auth_opt_id查询；其次是按照(alipay_user_id,out_request_no)组合方式查询；最后是单独通过out_request_no方式查询。  注意：最后一种方式，仅支持2019年2月15日开始的订单。
     * @param authOptId 支付宝侧花呗冻结、解冻操作单据id。在原先的冻结或者解冻接口调用中同步返回给商户，或者通过商户通知返回给商户。按订单号查询时，此字段不可为空。 (optional)
     * @param alipayUserId 买家在支付宝的用户id。通过userid+请求流水号组合查询时，此字段不可为空。 (optional)
     * @param openId 买家在支付宝的用户id (optional)
     * @param outRequestNo 商户原先调用冻结、解冻接口传入的请求流水号。按照流水号查询订单时，此字段不能为空。 (optional)
     * @return AlipayPcreditHuabeiAuthOrderQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayPcreditHuabeiAuthOrderQueryResponseModel query(String authOptId, String alipayUserId, String openId, String outRequestNo) throws ApiException {
        ApiResponse<AlipayPcreditHuabeiAuthOrderQueryResponseModel> localVarResp = queryWithHttpInfo(authOptId, alipayUserId, openId, outRequestNo, null);
        return localVarResp.getData();
    }

    public AlipayPcreditHuabeiAuthOrderQueryResponseModel query(String authOptId, String alipayUserId, String openId, String outRequestNo, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayPcreditHuabeiAuthOrderQueryResponseModel> localVarResp = queryWithHttpInfo(authOptId, alipayUserId, openId, outRequestNo, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 花呗先享订单查询接口
     * 查询花呗先享冻结、解冻订单内容及状态。有3种查询方式。推荐商户优先使用auth_opt_id查询；其次是按照(alipay_user_id,out_request_no)组合方式查询；最后是单独通过out_request_no方式查询。  注意：最后一种方式，仅支持2019年2月15日开始的订单。
     * @param authOptId 支付宝侧花呗冻结、解冻操作单据id。在原先的冻结或者解冻接口调用中同步返回给商户，或者通过商户通知返回给商户。按订单号查询时，此字段不可为空。 (optional)
     * @param alipayUserId 买家在支付宝的用户id。通过userid+请求流水号组合查询时，此字段不可为空。 (optional)
     * @param openId 买家在支付宝的用户id (optional)
     * @param outRequestNo 商户原先调用冻结、解冻接口传入的请求流水号。按照流水号查询订单时，此字段不能为空。 (optional)
     * @return ApiResponse&lt;AlipayPcreditHuabeiAuthOrderQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayPcreditHuabeiAuthOrderQueryResponseModel> queryWithHttpInfo(String authOptId, String alipayUserId, String openId, String outRequestNo, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(authOptId, alipayUserId, openId, outRequestNo, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayPcreditHuabeiAuthOrderQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayPcreditHuabeiAuthOrderQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 花呗先享订单查询接口 (asynchronously)
     * 查询花呗先享冻结、解冻订单内容及状态。有3种查询方式。推荐商户优先使用auth_opt_id查询；其次是按照(alipay_user_id,out_request_no)组合方式查询；最后是单独通过out_request_no方式查询。  注意：最后一种方式，仅支持2019年2月15日开始的订单。
     * @param authOptId 支付宝侧花呗冻结、解冻操作单据id。在原先的冻结或者解冻接口调用中同步返回给商户，或者通过商户通知返回给商户。按订单号查询时，此字段不可为空。 (optional)
     * @param alipayUserId 买家在支付宝的用户id。通过userid+请求流水号组合查询时，此字段不可为空。 (optional)
     * @param openId 买家在支付宝的用户id (optional)
     * @param outRequestNo 商户原先调用冻结、解冻接口传入的请求流水号。按照流水号查询订单时，此字段不能为空。 (optional)
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
    public okhttp3.Call queryAsync(String authOptId, String alipayUserId, String openId, String outRequestNo, final ApiCallback<AlipayPcreditHuabeiAuthOrderQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(authOptId, alipayUserId, openId, outRequestNo, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayPcreditHuabeiAuthOrderQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String authOptId, String alipayUserId, String openId, String outRequestNo, final ApiCallback<AlipayPcreditHuabeiAuthOrderQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(authOptId, alipayUserId, openId, outRequestNo, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayPcreditHuabeiAuthOrderQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unfreeze
     * @param alipayPcreditHuabeiAuthOrderUnfreezeModel  (optional)
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
    public okhttp3.Call unfreezeCall(AlipayPcreditHuabeiAuthOrderUnfreezeModel alipayPcreditHuabeiAuthOrderUnfreezeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayPcreditHuabeiAuthOrderUnfreezeModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/pcredit/huabei/auth/order/unfreeze";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call unfreezeValidateBeforeCall(AlipayPcreditHuabeiAuthOrderUnfreezeModel alipayPcreditHuabeiAuthOrderUnfreezeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = unfreezeCall(alipayPcreditHuabeiAuthOrderUnfreezeModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 花呗先享解冻或解约接口
     * 用户已经开通花呗先享协议后，商户通过此接口解冻用户资金池金额，也可以解冻并解约。  如果是解约操作，则要求传入的解冻金额必须等于用户资金池余额。  注意：商户在发起解约前，请务必保证已经结算过用户会员费，一旦解约后，无法发起结算用户会员费操作。
     * @param alipayPcreditHuabeiAuthOrderUnfreezeModel  (optional)
     * @return AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel unfreeze(AlipayPcreditHuabeiAuthOrderUnfreezeModel alipayPcreditHuabeiAuthOrderUnfreezeModel) throws ApiException {
        ApiResponse<AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel> localVarResp = unfreezeWithHttpInfo(alipayPcreditHuabeiAuthOrderUnfreezeModel, null);
        return localVarResp.getData();
    }

    public AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel unfreeze(AlipayPcreditHuabeiAuthOrderUnfreezeModel alipayPcreditHuabeiAuthOrderUnfreezeModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel> localVarResp = unfreezeWithHttpInfo(alipayPcreditHuabeiAuthOrderUnfreezeModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 花呗先享解冻或解约接口
     * 用户已经开通花呗先享协议后，商户通过此接口解冻用户资金池金额，也可以解冻并解约。  如果是解约操作，则要求传入的解冻金额必须等于用户资金池余额。  注意：商户在发起解约前，请务必保证已经结算过用户会员费，一旦解约后，无法发起结算用户会员费操作。
     * @param alipayPcreditHuabeiAuthOrderUnfreezeModel  (optional)
     * @return ApiResponse&lt;AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel> unfreezeWithHttpInfo(AlipayPcreditHuabeiAuthOrderUnfreezeModel alipayPcreditHuabeiAuthOrderUnfreezeModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = unfreezeValidateBeforeCall(alipayPcreditHuabeiAuthOrderUnfreezeModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayPcreditHuabeiAuthOrderUnfreezeDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 花呗先享解冻或解约接口 (asynchronously)
     * 用户已经开通花呗先享协议后，商户通过此接口解冻用户资金池金额，也可以解冻并解约。  如果是解约操作，则要求传入的解冻金额必须等于用户资金池余额。  注意：商户在发起解约前，请务必保证已经结算过用户会员费，一旦解约后，无法发起结算用户会员费操作。
     * @param alipayPcreditHuabeiAuthOrderUnfreezeModel  (optional)
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
    public okhttp3.Call unfreezeAsync(AlipayPcreditHuabeiAuthOrderUnfreezeModel alipayPcreditHuabeiAuthOrderUnfreezeModel, final ApiCallback<AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = unfreezeValidateBeforeCall(alipayPcreditHuabeiAuthOrderUnfreezeModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call unfreezeAsync(AlipayPcreditHuabeiAuthOrderUnfreezeModel alipayPcreditHuabeiAuthOrderUnfreezeModel, final ApiCallback<AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = unfreezeValidateBeforeCall(alipayPcreditHuabeiAuthOrderUnfreezeModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}