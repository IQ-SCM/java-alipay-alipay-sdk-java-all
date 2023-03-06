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
 * AlipayTradeCancelResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeCancelResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_GMT_REFUND_PAY = "gmt_refund_pay";
  @SerializedName(SERIALIZED_NAME_GMT_REFUND_PAY)
  private String gmtRefundPay;

  public static final String SERIALIZED_NAME_OUT_TRADE_NO = "out_trade_no";
  @SerializedName(SERIALIZED_NAME_OUT_TRADE_NO)
  private String outTradeNo;

  public static final String SERIALIZED_NAME_REFUND_SETTLEMENT_ID = "refund_settlement_id";
  @SerializedName(SERIALIZED_NAME_REFUND_SETTLEMENT_ID)
  private String refundSettlementId;

  public static final String SERIALIZED_NAME_RETRY_FLAG = "retry_flag";
  @SerializedName(SERIALIZED_NAME_RETRY_FLAG)
  private String retryFlag;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayTradeCancelResponseModel() { 
  }

  public AlipayTradeCancelResponseModel action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * 本次撤销触发的交易动作,接口调用成功且交易存在时返回。可能的返回值： close：交易未支付，触发关闭交易动作，无退款； refund：交易已支付，触发交易退款动作； 未返回：未查询到交易，或接口调用失败；
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "close", value = "本次撤销触发的交易动作,接口调用成功且交易存在时返回。可能的返回值： close：交易未支付，触发关闭交易动作，无退款； refund：交易已支付，触发交易退款动作； 未返回：未查询到交易，或接口调用失败；")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public AlipayTradeCancelResponseModel gmtRefundPay(String gmtRefundPay) {
    
    this.gmtRefundPay = gmtRefundPay;
    return this;
  }

   /**
   * 当撤销产生了退款时，返回退款时间；  只在银行间联交易场景下返回该信息；
   * @return gmtRefundPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-11-27 15:45:57", value = "当撤销产生了退款时，返回退款时间；  只在银行间联交易场景下返回该信息；")

  public String getGmtRefundPay() {
    return gmtRefundPay;
  }


  public void setGmtRefundPay(String gmtRefundPay) {
    this.gmtRefundPay = gmtRefundPay;
  }


  public AlipayTradeCancelResponseModel outTradeNo(String outTradeNo) {
    
    this.outTradeNo = outTradeNo;
    return this;
  }

   /**
   * 商户订单号
   * @return outTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6823789339978248", value = "商户订单号")

  public String getOutTradeNo() {
    return outTradeNo;
  }


  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public AlipayTradeCancelResponseModel refundSettlementId(String refundSettlementId) {
    
    this.refundSettlementId = refundSettlementId;
    return this;
  }

   /**
   * 当撤销产生了退款时，返回的退款清算编号，用于清算对账使用；  只在银行间联交易场景下返回该信息；
   * @return refundSettlementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018101610032004620239146945", value = "当撤销产生了退款时，返回的退款清算编号，用于清算对账使用；  只在银行间联交易场景下返回该信息；")

  public String getRefundSettlementId() {
    return refundSettlementId;
  }


  public void setRefundSettlementId(String refundSettlementId) {
    this.refundSettlementId = refundSettlementId;
  }


  public AlipayTradeCancelResponseModel retryFlag(String retryFlag) {
    
    this.retryFlag = retryFlag;
    return this;
  }

   /**
   * 是否需要重试
   * @return retryFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "N", value = "是否需要重试")

  public String getRetryFlag() {
    return retryFlag;
  }


  public void setRetryFlag(String retryFlag) {
    this.retryFlag = retryFlag;
  }


  public AlipayTradeCancelResponseModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号; 当发生交易关闭或交易退款时返回；
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013112011001004330000121536", value = "支付宝交易号; 当发生交易关闭或交易退款时返回；")

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
    AlipayTradeCancelResponseModel alipayTradeCancelResponseModel = (AlipayTradeCancelResponseModel) o;
    return Objects.equals(this.action, alipayTradeCancelResponseModel.action) &&
        Objects.equals(this.gmtRefundPay, alipayTradeCancelResponseModel.gmtRefundPay) &&
        Objects.equals(this.outTradeNo, alipayTradeCancelResponseModel.outTradeNo) &&
        Objects.equals(this.refundSettlementId, alipayTradeCancelResponseModel.refundSettlementId) &&
        Objects.equals(this.retryFlag, alipayTradeCancelResponseModel.retryFlag) &&
        Objects.equals(this.tradeNo, alipayTradeCancelResponseModel.tradeNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, gmtRefundPay, outTradeNo, refundSettlementId, retryFlag, tradeNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeCancelResponseModel {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    gmtRefundPay: ").append(toIndentedString(gmtRefundPay)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    refundSettlementId: ").append(toIndentedString(refundSettlementId)).append("\n");
    sb.append("    retryFlag: ").append(toIndentedString(retryFlag)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("gmt_refund_pay");
    openapiFields.add("out_trade_no");
    openapiFields.add("refund_settlement_id");
    openapiFields.add("retry_flag");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeCancelResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeCancelResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeCancelResponseModel is not found in the empty JSON string", AlipayTradeCancelResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradeCancelResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradeCancelResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if (jsonObj.get("gmt_refund_pay") != null && !jsonObj.get("gmt_refund_pay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_refund_pay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_refund_pay").toString()));
      }
      if (jsonObj.get("out_trade_no") != null && !jsonObj.get("out_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_trade_no").toString()));
      }
      if (jsonObj.get("refund_settlement_id") != null && !jsonObj.get("refund_settlement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_settlement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_settlement_id").toString()));
      }
      if (jsonObj.get("retry_flag") != null && !jsonObj.get("retry_flag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retry_flag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retry_flag").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeCancelResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeCancelResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeCancelResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeCancelResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeCancelResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeCancelResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradeCancelResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradeCancelResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeCancelResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeCancelResponseModel
  */
  public static AlipayTradeCancelResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeCancelResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradeCancelResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
