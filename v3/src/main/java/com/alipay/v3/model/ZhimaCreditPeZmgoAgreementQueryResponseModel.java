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
 * ZhimaCreditPeZmgoAgreementQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCreditPeZmgoAgreementQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_AGREEMENT_NAME = "agreement_name";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NAME)
  private String agreementName;

  public static final String SERIALIZED_NAME_AGREEMENT_STATUS = "agreement_status";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_STATUS)
  private String agreementStatus;

  public static final String SERIALIZED_NAME_ALIPAY_USER_ID = "alipay_user_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_USER_ID)
  private String alipayUserId;

  public static final String SERIALIZED_NAME_BIZ_TYPE = "biz_type";
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private String bizType;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_SIGN_TIME = "sign_time";
  @SerializedName(SERIALIZED_NAME_SIGN_TIME)
  private String signTime;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public ZhimaCreditPeZmgoAgreementQueryResponseModel() { 
  }

  public ZhimaCreditPeZmgoAgreementQueryResponseModel agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员协议号。
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20185513447859192007", value = "支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员协议号。")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public ZhimaCreditPeZmgoAgreementQueryResponseModel agreementName(String agreementName) {
    
    this.agreementName = agreementName;
    return this;
  }

   /**
   * 协议名称
   * @return agreementName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "花呗先享会员", value = "协议名称")

  public String getAgreementName() {
    return agreementName;
  }


  public void setAgreementName(String agreementName) {
    this.agreementName = agreementName;
  }


  public ZhimaCreditPeZmgoAgreementQueryResponseModel agreementStatus(String agreementStatus) {
    
    this.agreementStatus = agreementStatus;
    return this;
  }

   /**
   * 协议状态。Y表示状态有效，P表示状态失效中，N表示状态已失效
   * @return agreementStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "协议状态。Y表示状态有效，P表示状态失效中，N表示状态已失效")

  public String getAgreementStatus() {
    return agreementStatus;
  }


  public void setAgreementStatus(String agreementStatus) {
    this.agreementStatus = agreementStatus;
  }


  public ZhimaCreditPeZmgoAgreementQueryResponseModel alipayUserId(String alipayUserId) {
    
    this.alipayUserId = alipayUserId;
    return this;
  }

   /**
   * 支付宝用户userId
   * @return alipayUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088302424419340", value = "支付宝用户userId")

  public String getAlipayUserId() {
    return alipayUserId;
  }


  public void setAlipayUserId(String alipayUserId) {
    this.alipayUserId = alipayUserId;
  }


  public ZhimaCreditPeZmgoAgreementQueryResponseModel bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * 代表签约芝麻GO所属业务类型
   * @return bizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "zm_zmgo", value = "代表签约芝麻GO所属业务类型")

  public String getBizType() {
    return bizType;
  }


  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public ZhimaCreditPeZmgoAgreementQueryResponseModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 支付宝用户userId
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝用户userId")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public ZhimaCreditPeZmgoAgreementQueryResponseModel signTime(String signTime) {
    
    this.signTime = signTime;
    return this;
  }

   /**
   * 该条芝麻GO协议签约时间
   * @return signTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-09-27 00:00:00", value = "该条芝麻GO协议签约时间")

  public String getSignTime() {
    return signTime;
  }


  public void setSignTime(String signTime) {
    this.signTime = signTime;
  }


  public ZhimaCreditPeZmgoAgreementQueryResponseModel startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 该芝麻GO协议开始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-09-27 00:00:00", value = "该芝麻GO协议开始时间")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaCreditPeZmgoAgreementQueryResponseModel zhimaCreditPeZmgoAgreementQueryResponseModel = (ZhimaCreditPeZmgoAgreementQueryResponseModel) o;
    return Objects.equals(this.agreementId, zhimaCreditPeZmgoAgreementQueryResponseModel.agreementId) &&
        Objects.equals(this.agreementName, zhimaCreditPeZmgoAgreementQueryResponseModel.agreementName) &&
        Objects.equals(this.agreementStatus, zhimaCreditPeZmgoAgreementQueryResponseModel.agreementStatus) &&
        Objects.equals(this.alipayUserId, zhimaCreditPeZmgoAgreementQueryResponseModel.alipayUserId) &&
        Objects.equals(this.bizType, zhimaCreditPeZmgoAgreementQueryResponseModel.bizType) &&
        Objects.equals(this.openId, zhimaCreditPeZmgoAgreementQueryResponseModel.openId) &&
        Objects.equals(this.signTime, zhimaCreditPeZmgoAgreementQueryResponseModel.signTime) &&
        Objects.equals(this.startTime, zhimaCreditPeZmgoAgreementQueryResponseModel.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId, agreementName, agreementStatus, alipayUserId, bizType, openId, signTime, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCreditPeZmgoAgreementQueryResponseModel {\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    agreementName: ").append(toIndentedString(agreementName)).append("\n");
    sb.append("    agreementStatus: ").append(toIndentedString(agreementStatus)).append("\n");
    sb.append("    alipayUserId: ").append(toIndentedString(alipayUserId)).append("\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    signTime: ").append(toIndentedString(signTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("agreement_id");
    openapiFields.add("agreement_name");
    openapiFields.add("agreement_status");
    openapiFields.add("alipay_user_id");
    openapiFields.add("biz_type");
    openapiFields.add("open_id");
    openapiFields.add("sign_time");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCreditPeZmgoAgreementQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCreditPeZmgoAgreementQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCreditPeZmgoAgreementQueryResponseModel is not found in the empty JSON string", ZhimaCreditPeZmgoAgreementQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaCreditPeZmgoAgreementQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaCreditPeZmgoAgreementQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_id") != null && !jsonObj.get("agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_id").toString()));
      }
      if (jsonObj.get("agreement_name") != null && !jsonObj.get("agreement_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_name").toString()));
      }
      if (jsonObj.get("agreement_status") != null && !jsonObj.get("agreement_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_status").toString()));
      }
      if (jsonObj.get("alipay_user_id") != null && !jsonObj.get("alipay_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_user_id").toString()));
      }
      if (jsonObj.get("biz_type") != null && !jsonObj.get("biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_type").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("sign_time") != null && !jsonObj.get("sign_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_time").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCreditPeZmgoAgreementQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCreditPeZmgoAgreementQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCreditPeZmgoAgreementQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCreditPeZmgoAgreementQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCreditPeZmgoAgreementQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCreditPeZmgoAgreementQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaCreditPeZmgoAgreementQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaCreditPeZmgoAgreementQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCreditPeZmgoAgreementQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCreditPeZmgoAgreementQueryResponseModel
  */
  public static ZhimaCreditPeZmgoAgreementQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCreditPeZmgoAgreementQueryResponseModel.class);
  }

 /**
  * Convert an instance of ZhimaCreditPeZmgoAgreementQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
