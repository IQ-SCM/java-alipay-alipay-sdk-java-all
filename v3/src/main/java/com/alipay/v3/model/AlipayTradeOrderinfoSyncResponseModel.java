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
 * AlipayTradeOrderinfoSyncResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeOrderinfoSyncResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BUYER_OPEN_ID = "buyer_open_id";
  @SerializedName(SERIALIZED_NAME_BUYER_OPEN_ID)
  private String buyerOpenId;

  public static final String SERIALIZED_NAME_BUYER_USER_ID = "buyer_user_id";
  @SerializedName(SERIALIZED_NAME_BUYER_USER_ID)
  private String buyerUserId;

  public static final String SERIALIZED_NAME_OUT_TRADE_NO = "out_trade_no";
  @SerializedName(SERIALIZED_NAME_OUT_TRADE_NO)
  private String outTradeNo;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayTradeOrderinfoSyncResponseModel() { 
  }

  public AlipayTradeOrderinfoSyncResponseModel buyerOpenId(String buyerOpenId) {
    
    this.buyerOpenId = buyerOpenId;
    return this;
  }

   /**
   * 买家支付宝用户唯一标识
   * @return buyerOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "买家支付宝用户唯一标识")

  public String getBuyerOpenId() {
    return buyerOpenId;
  }


  public void setBuyerOpenId(String buyerOpenId) {
    this.buyerOpenId = buyerOpenId;
  }


  public AlipayTradeOrderinfoSyncResponseModel buyerUserId(String buyerUserId) {
    
    this.buyerUserId = buyerUserId;
    return this;
  }

   /**
   * 买家在支付宝的用户id
   * @return buyerUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101117955611", value = "买家在支付宝的用户id")

  public String getBuyerUserId() {
    return buyerUserId;
  }


  public void setBuyerUserId(String buyerUserId) {
    this.buyerUserId = buyerUserId;
  }


  public AlipayTradeOrderinfoSyncResponseModel outTradeNo(String outTradeNo) {
    
    this.outTradeNo = outTradeNo;
    return this;
  }

   /**
   * 商户订单号
   * @return outTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20180610010101001", value = "商户订单号")

  public String getOutTradeNo() {
    return outTradeNo;
  }


  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public AlipayTradeOrderinfoSyncResponseModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20180610121001004680073956707", value = "支付宝交易号")

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
    AlipayTradeOrderinfoSyncResponseModel alipayTradeOrderinfoSyncResponseModel = (AlipayTradeOrderinfoSyncResponseModel) o;
    return Objects.equals(this.buyerOpenId, alipayTradeOrderinfoSyncResponseModel.buyerOpenId) &&
        Objects.equals(this.buyerUserId, alipayTradeOrderinfoSyncResponseModel.buyerUserId) &&
        Objects.equals(this.outTradeNo, alipayTradeOrderinfoSyncResponseModel.outTradeNo) &&
        Objects.equals(this.tradeNo, alipayTradeOrderinfoSyncResponseModel.tradeNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerOpenId, buyerUserId, outTradeNo, tradeNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeOrderinfoSyncResponseModel {\n");
    sb.append("    buyerOpenId: ").append(toIndentedString(buyerOpenId)).append("\n");
    sb.append("    buyerUserId: ").append(toIndentedString(buyerUserId)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
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
    openapiFields.add("buyer_open_id");
    openapiFields.add("buyer_user_id");
    openapiFields.add("out_trade_no");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeOrderinfoSyncResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeOrderinfoSyncResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeOrderinfoSyncResponseModel is not found in the empty JSON string", AlipayTradeOrderinfoSyncResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradeOrderinfoSyncResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradeOrderinfoSyncResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("buyer_open_id") != null && !jsonObj.get("buyer_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyer_open_id").toString()));
      }
      if (jsonObj.get("buyer_user_id") != null && !jsonObj.get("buyer_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyer_user_id").toString()));
      }
      if (jsonObj.get("out_trade_no") != null && !jsonObj.get("out_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_trade_no").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeOrderinfoSyncResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeOrderinfoSyncResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeOrderinfoSyncResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeOrderinfoSyncResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeOrderinfoSyncResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeOrderinfoSyncResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradeOrderinfoSyncResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradeOrderinfoSyncResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeOrderinfoSyncResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeOrderinfoSyncResponseModel
  */
  public static AlipayTradeOrderinfoSyncResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeOrderinfoSyncResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradeOrderinfoSyncResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

