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


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alipay.v3.JSON;

/**
 * CustomsDeclareRecordInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomsDeclareRecordInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ALIPAY_DECLARE_NO = "alipay_declare_no";
  @SerializedName(SERIALIZED_NAME_ALIPAY_DECLARE_NO)
  private String alipayDeclareNo;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CUSTOMS_PLACE = "customs_place";
  @SerializedName(SERIALIZED_NAME_CUSTOMS_PLACE)
  private String customsPlace;

  public static final String SERIALIZED_NAME_CUSTOMS_RESULT_CODE = "customs_result_code";
  @SerializedName(SERIALIZED_NAME_CUSTOMS_RESULT_CODE)
  private String customsResultCode;

  public static final String SERIALIZED_NAME_CUSTOMS_RESULT_INFO = "customs_result_info";
  @SerializedName(SERIALIZED_NAME_CUSTOMS_RESULT_INFO)
  private String customsResultInfo;

  public static final String SERIALIZED_NAME_CUSTOMS_RESULT_RETURN_TIME = "customs_result_return_time";
  @SerializedName(SERIALIZED_NAME_CUSTOMS_RESULT_RETURN_TIME)
  private String customsResultReturnTime;

  public static final String SERIALIZED_NAME_IS_SPLIT = "is_split";
  @SerializedName(SERIALIZED_NAME_IS_SPLIT)
  private String isSplit;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_TIME = "last_modified_time";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_TIME)
  private String lastModifiedTime;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_MERCHANT_CUSTOMS_CODE = "merchant_customs_code";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CUSTOMS_CODE)
  private String merchantCustomsCode;

  public static final String SERIALIZED_NAME_MERCHANT_CUSTOMS_NAME = "merchant_customs_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CUSTOMS_NAME)
  private String merchantCustomsName;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUB_OUT_BIZ_NO = "sub_out_biz_no";
  @SerializedName(SERIALIZED_NAME_SUB_OUT_BIZ_NO)
  private String subOutBizNo;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public CustomsDeclareRecordInfo() { 
  }

  public CustomsDeclareRecordInfo alipayDeclareNo(String alipayDeclareNo) {
    
    this.alipayDeclareNo = alipayDeclareNo;
    return this;
  }

   /**
   * 支付宝报关流水号。
   * @return alipayDeclareNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013112611001004680073956707", value = "支付宝报关流水号。")

  public String getAlipayDeclareNo() {
    return alipayDeclareNo;
  }


  public void setAlipayDeclareNo(String alipayDeclareNo) {
    this.alipayDeclareNo = alipayDeclareNo;
  }


  public CustomsDeclareRecordInfo amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 报关金额，单位为人民币“元”，精确到小数点后2位。
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20.00", value = "报关金额，单位为人民币“元”，精确到小数点后2位。")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public CustomsDeclareRecordInfo customsPlace(String customsPlace) {
    
    this.customsPlace = customsPlace;
    return this;
  }

   /**
   * 此记录所报关的海关编号，参见“ &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/pre-open/01x3kh#%E6%B5%B7%E5%85%B3%E7%BC%96%E5%8F%B7\&quot;&gt;海关编号&lt;/a&gt;”。
   * @return customsPlace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "zongshu", value = "此记录所报关的海关编号，参见“ <a href=\"https://opendocs.alipay.com/pre-open/01x3kh#%E6%B5%B7%E5%85%B3%E7%BC%96%E5%8F%B7\">海关编号</a>”。")

  public String getCustomsPlace() {
    return customsPlace;
  }


  public void setCustomsPlace(String customsPlace) {
    this.customsPlace = customsPlace;
  }


  public CustomsDeclareRecordInfo customsResultCode(String customsResultCode) {
    
    this.customsResultCode = customsResultCode;
    return this;
  }

   /**
   * 发起报关后，海关返回回执中的结果码。目前只有总署的报关，并且总署回执接收成功的请求才会返回此参数  2：电子口岸申报中  3：发送海关成功  4：发送海关失败  100：海关退单  399：海关审结  小于0的数字：表示处理异常回执     注意：  支付宝原样返回海关返回的数据，参数值以海关的定义为准。
   * @return customsResultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "发起报关后，海关返回回执中的结果码。目前只有总署的报关，并且总署回执接收成功的请求才会返回此参数  2：电子口岸申报中  3：发送海关成功  4：发送海关失败  100：海关退单  399：海关审结  小于0的数字：表示处理异常回执     注意：  支付宝原样返回海关返回的数据，参数值以海关的定义为准。")

  public String getCustomsResultCode() {
    return customsResultCode;
  }


  public void setCustomsResultCode(String customsResultCode) {
    this.customsResultCode = customsResultCode;
  }


  public CustomsDeclareRecordInfo customsResultInfo(String customsResultInfo) {
    
    this.customsResultInfo = customsResultInfo;
    return this;
  }

   /**
   * 发起报关后，海关返回回执中的结果描述信息。目前只有总署报关，并且总署成功返回回执的时候会有此值
   * @return customsResultInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "新增申报成功[B0B2F23E-2CF6-434D-9F24-8931B835A056]", value = "发起报关后，海关返回回执中的结果描述信息。目前只有总署报关，并且总署成功返回回执的时候会有此值")

  public String getCustomsResultInfo() {
    return customsResultInfo;
  }


  public void setCustomsResultInfo(String customsResultInfo) {
    this.customsResultInfo = customsResultInfo;
  }


  public CustomsDeclareRecordInfo customsResultReturnTime(String customsResultReturnTime) {
    
    this.customsResultReturnTime = customsResultReturnTime;
    return this;
  }

   /**
   * 发起报关后，海关返回回执的时间，格式为：yyyyMMddHHmmss。目前只有总署报关，并且总署成功返回回执的时候才会有此参数。
   * @return customsResultReturnTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20160414142358", value = "发起报关后，海关返回回执的时间，格式为：yyyyMMddHHmmss。目前只有总署报关，并且总署成功返回回执的时候才会有此参数。")

  public String getCustomsResultReturnTime() {
    return customsResultReturnTime;
  }


  public void setCustomsResultReturnTime(String customsResultReturnTime) {
    this.customsResultReturnTime = customsResultReturnTime;
  }


  public CustomsDeclareRecordInfo isSplit(String isSplit) {
    
    this.isSplit = isSplit;
    return this;
  }

   /**
   * T: 拆单；F：非拆单。当请求没有拆单或者请求传入的is_split&#x3D;F时，不会返回此参数。
   * @return isSplit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T", value = "T: 拆单；F：非拆单。当请求没有拆单或者请求传入的is_split=F时，不会返回此参数。")

  public String getIsSplit() {
    return isSplit;
  }


  public void setIsSplit(String isSplit) {
    this.isSplit = isSplit;
  }


  public CustomsDeclareRecordInfo lastModifiedTime(String lastModifiedTime) {
    
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

   /**
   * 报关记录状态最后更新时间
   * @return lastModifiedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-12-04 11:00:00", value = "报关记录状态最后更新时间")

  public String getLastModifiedTime() {
    return lastModifiedTime;
  }


  public void setLastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }


  public CustomsDeclareRecordInfo memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 备注说明
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "海关返回参数非法", value = "备注说明")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public CustomsDeclareRecordInfo merchantCustomsCode(String merchantCustomsCode) {
    
    this.merchantCustomsCode = merchantCustomsCode;
    return this;
  }

   /**
   * 商户在海关备案的编号。
   * @return merchantCustomsCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALI001", value = "商户在海关备案的编号。")

  public String getMerchantCustomsCode() {
    return merchantCustomsCode;
  }


  public void setMerchantCustomsCode(String merchantCustomsCode) {
    this.merchantCustomsCode = merchantCustomsCode;
  }


  public CustomsDeclareRecordInfo merchantCustomsName(String merchantCustomsName) {
    
    this.merchantCustomsName = merchantCustomsName;
    return this;
  }

   /**
   * 商户海关备案名称
   * @return merchantCustomsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XX中国信息技术有限公司", value = "商户海关备案名称")

  public String getMerchantCustomsName() {
    return merchantCustomsName;
  }


  public void setMerchantCustomsName(String merchantCustomsName) {
    this.merchantCustomsName = merchantCustomsName;
  }


  public CustomsDeclareRecordInfo outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 报关请求号。商户端报关请求号，对应入参中的某条报关请求号。
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201506010001", value = "报关请求号。商户端报关请求号，对应入参中的某条报关请求号。")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public CustomsDeclareRecordInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 该报关单当前的状态：  - ws等待发送海关  - sending已提交发送海关  - succ 海关返回受理成功
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "succ", value = "该报关单当前的状态：  - ws等待发送海关  - sending已提交发送海关  - succ 海关返回受理成功")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public CustomsDeclareRecordInfo subOutBizNo(String subOutBizNo) {
    
    this.subOutBizNo = subOutBizNo;
    return this;
  }

   /**
   * 拆单子订单号。如果报关请求没有请求拆单则不会返回此参数。
   * @return subOutBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201506010001", value = "拆单子订单号。如果报关请求没有请求拆单则不会返回此参数。")

  public String getSubOutBizNo() {
    return subOutBizNo;
  }


  public void setSubOutBizNo(String subOutBizNo) {
    this.subOutBizNo = subOutBizNo;
  }


  public CustomsDeclareRecordInfo tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝推送到海关的支付单据号。针对拆单的报关，这个单据号不等于支付宝原始交易号。
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013111511001004390000105126", value = "支付宝推送到海关的支付单据号。针对拆单的报关，这个单据号不等于支付宝原始交易号。")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomsDeclareRecordInfo customsDeclareRecordInfo = (CustomsDeclareRecordInfo) o;
    return Objects.equals(this.alipayDeclareNo, customsDeclareRecordInfo.alipayDeclareNo) &&
        Objects.equals(this.amount, customsDeclareRecordInfo.amount) &&
        Objects.equals(this.customsPlace, customsDeclareRecordInfo.customsPlace) &&
        Objects.equals(this.customsResultCode, customsDeclareRecordInfo.customsResultCode) &&
        Objects.equals(this.customsResultInfo, customsDeclareRecordInfo.customsResultInfo) &&
        Objects.equals(this.customsResultReturnTime, customsDeclareRecordInfo.customsResultReturnTime) &&
        Objects.equals(this.isSplit, customsDeclareRecordInfo.isSplit) &&
        Objects.equals(this.lastModifiedTime, customsDeclareRecordInfo.lastModifiedTime) &&
        Objects.equals(this.memo, customsDeclareRecordInfo.memo) &&
        Objects.equals(this.merchantCustomsCode, customsDeclareRecordInfo.merchantCustomsCode) &&
        Objects.equals(this.merchantCustomsName, customsDeclareRecordInfo.merchantCustomsName) &&
        Objects.equals(this.outRequestNo, customsDeclareRecordInfo.outRequestNo) &&
        Objects.equals(this.status, customsDeclareRecordInfo.status) &&
        Objects.equals(this.subOutBizNo, customsDeclareRecordInfo.subOutBizNo) &&
        Objects.equals(this.tradeNo, customsDeclareRecordInfo.tradeNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alipayDeclareNo, amount, customsPlace, customsResultCode, customsResultInfo, customsResultReturnTime, isSplit, lastModifiedTime, memo, merchantCustomsCode, merchantCustomsName, outRequestNo, status, subOutBizNo, tradeNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomsDeclareRecordInfo {\n");
    sb.append("    alipayDeclareNo: ").append(toIndentedString(alipayDeclareNo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    customsPlace: ").append(toIndentedString(customsPlace)).append("\n");
    sb.append("    customsResultCode: ").append(toIndentedString(customsResultCode)).append("\n");
    sb.append("    customsResultInfo: ").append(toIndentedString(customsResultInfo)).append("\n");
    sb.append("    customsResultReturnTime: ").append(toIndentedString(customsResultReturnTime)).append("\n");
    sb.append("    isSplit: ").append(toIndentedString(isSplit)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    merchantCustomsCode: ").append(toIndentedString(merchantCustomsCode)).append("\n");
    sb.append("    merchantCustomsName: ").append(toIndentedString(merchantCustomsName)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subOutBizNo: ").append(toIndentedString(subOutBizNo)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("alipay_declare_no");
    openapiFields.add("amount");
    openapiFields.add("customs_place");
    openapiFields.add("customs_result_code");
    openapiFields.add("customs_result_info");
    openapiFields.add("customs_result_return_time");
    openapiFields.add("is_split");
    openapiFields.add("last_modified_time");
    openapiFields.add("memo");
    openapiFields.add("merchant_customs_code");
    openapiFields.add("merchant_customs_name");
    openapiFields.add("out_request_no");
    openapiFields.add("status");
    openapiFields.add("sub_out_biz_no");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomsDeclareRecordInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomsDeclareRecordInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomsDeclareRecordInfo is not found in the empty JSON string", CustomsDeclareRecordInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomsDeclareRecordInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomsDeclareRecordInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("alipay_declare_no") != null && !jsonObj.get("alipay_declare_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_declare_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_declare_no").toString()));
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("customs_place") != null && !jsonObj.get("customs_place").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customs_place` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customs_place").toString()));
      }
      if (jsonObj.get("customs_result_code") != null && !jsonObj.get("customs_result_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customs_result_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customs_result_code").toString()));
      }
      if (jsonObj.get("customs_result_info") != null && !jsonObj.get("customs_result_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customs_result_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customs_result_info").toString()));
      }
      if (jsonObj.get("customs_result_return_time") != null && !jsonObj.get("customs_result_return_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customs_result_return_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customs_result_return_time").toString()));
      }
      if (jsonObj.get("is_split") != null && !jsonObj.get("is_split").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_split` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_split").toString()));
      }
      if (jsonObj.get("last_modified_time") != null && !jsonObj.get("last_modified_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_modified_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_modified_time").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("merchant_customs_code") != null && !jsonObj.get("merchant_customs_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_customs_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_customs_code").toString()));
      }
      if (jsonObj.get("merchant_customs_name") != null && !jsonObj.get("merchant_customs_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_customs_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_customs_name").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("sub_out_biz_no") != null && !jsonObj.get("sub_out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_out_biz_no").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomsDeclareRecordInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomsDeclareRecordInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomsDeclareRecordInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomsDeclareRecordInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomsDeclareRecordInfo>() {
           @Override
           public void write(JsonWriter out, CustomsDeclareRecordInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomsDeclareRecordInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomsDeclareRecordInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomsDeclareRecordInfo
  * @throws IOException if the JSON string is invalid with respect to CustomsDeclareRecordInfo
  */
  public static CustomsDeclareRecordInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomsDeclareRecordInfo.class);
  }

 /**
  * Convert an instance of CustomsDeclareRecordInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
