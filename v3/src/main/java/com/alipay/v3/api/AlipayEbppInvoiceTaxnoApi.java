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


import com.alipay.v3.model.AlipayEbppInvoiceTaxnoBatchqueryDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceTaxnoBatchqueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEbppInvoiceTaxnoApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEbppInvoiceTaxnoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEbppInvoiceTaxnoApi(ApiClient apiClient) {
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
     * Build call for batchquery
     * @param authToken 用户授权令牌 (optional)
     * @param taxNo 企业税号 (optional)
     * @param invoiceKindList 查询票种列表。枚举值如下： *PLAIN：增值税电子普通发票； *SPECIAL：增值税专用发票； *PLAIN_INVOICE：增值税普通发票； *PAPER_INVOICE：增值税普通发票（卷式）； *SALSE_INVOICE：机动车销售统一发票。 (optional)
     * @param scene 发票要素获取应用场景。&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/10691/bv8s88\&quot;&gt;\&quot;拉\&quot;模式报销&lt;/a&gt; 固定为 INVOICE_EXPENSE 表示发票报销。 (optional)
     * @param startInvoiceDate 查询起始时间，精确到天（按开票日期查询） start_invoice_date和end_invoice_date传值要求 1.同时为空时，返回最近半年200条数据 2.必须同时为空 或 同时不为空 3.结束日期不能大于当前日期 4.开始时间和结束时间跨度不能超过6个月 (optional)
     * @param endInvoiceDate 查询结束时间，精确到天（按开票日期查询） start_invoice_date和end_invoice_date传值要求 1.同时为空时，返回最近半年200条数据 2.必须同时为空 或 同时不为空 3.结束日期不能大于当前日期 4.开始时间和结束时间跨度不能超过6个月 (optional)
     * @param limitSize 查询结果上限笔数，最大值20 (optional)
     * @param enableTradeOut 默认值为false。true为输出交易信息，false为不输出交易信息。 (optional)
     * @param pageNum 当前页码，为空时默认第一页 (optional)
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
    public okhttp3.Call batchqueryCall(String authToken, String taxNo, List<String> invoiceKindList, String scene, String startInvoiceDate, String endInvoiceDate, Integer limitSize, String enableTradeOut, Integer pageNum, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/ebpp/invoice/taxno/batchquery";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("auth_token", authToken));
        }

        if (taxNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tax_no", taxNo));
        }

        if (invoiceKindList != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "invoice_kind_list", invoiceKindList));
        }

        if (scene != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("scene", scene));
        }

        if (startInvoiceDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_invoice_date", startInvoiceDate));
        }

        if (endInvoiceDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_invoice_date", endInvoiceDate));
        }

        if (limitSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit_size", limitSize));
        }

        if (enableTradeOut != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("enable_trade_out", enableTradeOut));
        }

        if (pageNum != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_num", pageNum));
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
    private okhttp3.Call batchqueryValidateBeforeCall(String authToken, String taxNo, List<String> invoiceKindList, String scene, String startInvoiceDate, String endInvoiceDate, Integer limitSize, String enableTradeOut, Integer pageNum, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = batchqueryCall(authToken, taxNo, invoiceKindList, scene, startInvoiceDate, endInvoiceDate, limitSize, enableTradeOut, pageNum, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 获取指定企业的发票要素列表
     * 根据购买方税号获取用户的发票关键要素列表，该接口目前适用于发票报销场景
     * @param authToken 用户授权令牌 (optional)
     * @param taxNo 企业税号 (optional)
     * @param invoiceKindList 查询票种列表。枚举值如下： *PLAIN：增值税电子普通发票； *SPECIAL：增值税专用发票； *PLAIN_INVOICE：增值税普通发票； *PAPER_INVOICE：增值税普通发票（卷式）； *SALSE_INVOICE：机动车销售统一发票。 (optional)
     * @param scene 发票要素获取应用场景。&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/10691/bv8s88\&quot;&gt;\&quot;拉\&quot;模式报销&lt;/a&gt; 固定为 INVOICE_EXPENSE 表示发票报销。 (optional)
     * @param startInvoiceDate 查询起始时间，精确到天（按开票日期查询） start_invoice_date和end_invoice_date传值要求 1.同时为空时，返回最近半年200条数据 2.必须同时为空 或 同时不为空 3.结束日期不能大于当前日期 4.开始时间和结束时间跨度不能超过6个月 (optional)
     * @param endInvoiceDate 查询结束时间，精确到天（按开票日期查询） start_invoice_date和end_invoice_date传值要求 1.同时为空时，返回最近半年200条数据 2.必须同时为空 或 同时不为空 3.结束日期不能大于当前日期 4.开始时间和结束时间跨度不能超过6个月 (optional)
     * @param limitSize 查询结果上限笔数，最大值20 (optional)
     * @param enableTradeOut 默认值为false。true为输出交易信息，false为不输出交易信息。 (optional)
     * @param pageNum 当前页码，为空时默认第一页 (optional)
     * @return AlipayEbppInvoiceTaxnoBatchqueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceTaxnoBatchqueryResponseModel batchquery(String authToken, String taxNo, List<String> invoiceKindList, String scene, String startInvoiceDate, String endInvoiceDate, Integer limitSize, String enableTradeOut, Integer pageNum) throws ApiException {
        ApiResponse<AlipayEbppInvoiceTaxnoBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(authToken, taxNo, invoiceKindList, scene, startInvoiceDate, endInvoiceDate, limitSize, enableTradeOut, pageNum, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceTaxnoBatchqueryResponseModel batchquery(String authToken, String taxNo, List<String> invoiceKindList, String scene, String startInvoiceDate, String endInvoiceDate, Integer limitSize, String enableTradeOut, Integer pageNum, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceTaxnoBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(authToken, taxNo, invoiceKindList, scene, startInvoiceDate, endInvoiceDate, limitSize, enableTradeOut, pageNum, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 获取指定企业的发票要素列表
     * 根据购买方税号获取用户的发票关键要素列表，该接口目前适用于发票报销场景
     * @param authToken 用户授权令牌 (optional)
     * @param taxNo 企业税号 (optional)
     * @param invoiceKindList 查询票种列表。枚举值如下： *PLAIN：增值税电子普通发票； *SPECIAL：增值税专用发票； *PLAIN_INVOICE：增值税普通发票； *PAPER_INVOICE：增值税普通发票（卷式）； *SALSE_INVOICE：机动车销售统一发票。 (optional)
     * @param scene 发票要素获取应用场景。&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/10691/bv8s88\&quot;&gt;\&quot;拉\&quot;模式报销&lt;/a&gt; 固定为 INVOICE_EXPENSE 表示发票报销。 (optional)
     * @param startInvoiceDate 查询起始时间，精确到天（按开票日期查询） start_invoice_date和end_invoice_date传值要求 1.同时为空时，返回最近半年200条数据 2.必须同时为空 或 同时不为空 3.结束日期不能大于当前日期 4.开始时间和结束时间跨度不能超过6个月 (optional)
     * @param endInvoiceDate 查询结束时间，精确到天（按开票日期查询） start_invoice_date和end_invoice_date传值要求 1.同时为空时，返回最近半年200条数据 2.必须同时为空 或 同时不为空 3.结束日期不能大于当前日期 4.开始时间和结束时间跨度不能超过6个月 (optional)
     * @param limitSize 查询结果上限笔数，最大值20 (optional)
     * @param enableTradeOut 默认值为false。true为输出交易信息，false为不输出交易信息。 (optional)
     * @param pageNum 当前页码，为空时默认第一页 (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceTaxnoBatchqueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceTaxnoBatchqueryResponseModel> batchqueryWithHttpInfo(String authToken, String taxNo, List<String> invoiceKindList, String scene, String startInvoiceDate, String endInvoiceDate, Integer limitSize, String enableTradeOut, Integer pageNum, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(authToken, taxNo, invoiceKindList, scene, startInvoiceDate, endInvoiceDate, limitSize, enableTradeOut, pageNum, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceTaxnoBatchqueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceTaxnoBatchqueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 获取指定企业的发票要素列表 (asynchronously)
     * 根据购买方税号获取用户的发票关键要素列表，该接口目前适用于发票报销场景
     * @param authToken 用户授权令牌 (optional)
     * @param taxNo 企业税号 (optional)
     * @param invoiceKindList 查询票种列表。枚举值如下： *PLAIN：增值税电子普通发票； *SPECIAL：增值税专用发票； *PLAIN_INVOICE：增值税普通发票； *PAPER_INVOICE：增值税普通发票（卷式）； *SALSE_INVOICE：机动车销售统一发票。 (optional)
     * @param scene 发票要素获取应用场景。&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/10691/bv8s88\&quot;&gt;\&quot;拉\&quot;模式报销&lt;/a&gt; 固定为 INVOICE_EXPENSE 表示发票报销。 (optional)
     * @param startInvoiceDate 查询起始时间，精确到天（按开票日期查询） start_invoice_date和end_invoice_date传值要求 1.同时为空时，返回最近半年200条数据 2.必须同时为空 或 同时不为空 3.结束日期不能大于当前日期 4.开始时间和结束时间跨度不能超过6个月 (optional)
     * @param endInvoiceDate 查询结束时间，精确到天（按开票日期查询） start_invoice_date和end_invoice_date传值要求 1.同时为空时，返回最近半年200条数据 2.必须同时为空 或 同时不为空 3.结束日期不能大于当前日期 4.开始时间和结束时间跨度不能超过6个月 (optional)
     * @param limitSize 查询结果上限笔数，最大值20 (optional)
     * @param enableTradeOut 默认值为false。true为输出交易信息，false为不输出交易信息。 (optional)
     * @param pageNum 当前页码，为空时默认第一页 (optional)
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
    public okhttp3.Call batchqueryAsync(String authToken, String taxNo, List<String> invoiceKindList, String scene, String startInvoiceDate, String endInvoiceDate, Integer limitSize, String enableTradeOut, Integer pageNum, final ApiCallback<AlipayEbppInvoiceTaxnoBatchqueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(authToken, taxNo, invoiceKindList, scene, startInvoiceDate, endInvoiceDate, limitSize, enableTradeOut, pageNum, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceTaxnoBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call batchqueryAsync(String authToken, String taxNo, List<String> invoiceKindList, String scene, String startInvoiceDate, String endInvoiceDate, Integer limitSize, String enableTradeOut, Integer pageNum, final ApiCallback<AlipayEbppInvoiceTaxnoBatchqueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(authToken, taxNo, invoiceKindList, scene, startInvoiceDate, endInvoiceDate, limitSize, enableTradeOut, pageNum, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceTaxnoBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
