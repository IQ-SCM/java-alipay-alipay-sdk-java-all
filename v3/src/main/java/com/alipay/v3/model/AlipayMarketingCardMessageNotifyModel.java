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
 * AlipayMarketingCardMessageNotifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCardMessageNotifyModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NOTIFY_INFO = "notify_info";
  @SerializedName(SERIALIZED_NAME_NOTIFY_INFO)
  private String notifyInfo;

  public static final String SERIALIZED_NAME_NOTIFY_NO = "notify_no";
  @SerializedName(SERIALIZED_NAME_NOTIFY_NO)
  private String notifyNo;

  public static final String SERIALIZED_NAME_NOTIFY_TYPE = "notify_type";
  @SerializedName(SERIALIZED_NAME_NOTIFY_TYPE)
  private String notifyType;

  public static final String SERIALIZED_NAME_OCCUR_TIME = "occur_time";
  @SerializedName(SERIALIZED_NAME_OCCUR_TIME)
  private String occurTime;

  public static final String SERIALIZED_NAME_TARGET_CARD_NO = "target_card_no";
  @SerializedName(SERIALIZED_NAME_TARGET_CARD_NO)
  private String targetCardNo;

  public static final String SERIALIZED_NAME_TARGET_CARD_NO_TYPE = "target_card_no_type";
  @SerializedName(SERIALIZED_NAME_TARGET_CARD_NO_TYPE)
  private String targetCardNoType;

  public AlipayMarketingCardMessageNotifyModel() { 
  }

  public AlipayMarketingCardMessageNotifyModel notifyInfo(String notifyInfo) {
    
    this.notifyInfo = notifyInfo;
    return this;
  }

   /**
   * 消息通知详情，包含消息通知需要的信息，map 格式存储。 积分过期提醒： &lt;br&gt;expired_point 过期积分值 &lt;br&gt;expired_time 过期时间
   * @return notifyInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"expired_point\":\"121\"}", value = "消息通知详情，包含消息通知需要的信息，map 格式存储。 积分过期提醒： <br>expired_point 过期积分值 <br>expired_time 过期时间")

  public String getNotifyInfo() {
    return notifyInfo;
  }


  public void setNotifyInfo(String notifyInfo) {
    this.notifyInfo = notifyInfo;
  }


  public AlipayMarketingCardMessageNotifyModel notifyNo(String notifyNo) {
    
    this.notifyNo = notifyNo;
    return this;
  }

   /**
   * 消息通知幂等标识，业务流水号
   * @return notifyNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000000000001", value = "消息通知幂等标识，业务流水号")

  public String getNotifyNo() {
    return notifyNo;
  }


  public void setNotifyNo(String notifyNo) {
    this.notifyNo = notifyNo;
  }


  public AlipayMarketingCardMessageNotifyModel notifyType(String notifyType) {
    
    this.notifyType = notifyType;
    return this;
  }

   /**
   * 消息通知类型, &lt;br&gt;POINT_REMIND 积分过期提醒
   * @return notifyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "POINT_REMIND", value = "消息通知类型, <br>POINT_REMIND 积分过期提醒")

  public String getNotifyType() {
    return notifyType;
  }


  public void setNotifyType(String notifyType) {
    this.notifyType = notifyType;
  }


  public AlipayMarketingCardMessageNotifyModel occurTime(String occurTime) {
    
    this.occurTime = occurTime;
    return this;
  }

   /**
   * 标识业务发生时间，时间格式为\&quot;yyyy-MM-dd HH:mm:ss\&quot;。
   * @return occurTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-12-27 12:12:12", value = "标识业务发生时间，时间格式为\"yyyy-MM-dd HH:mm:ss\"。")

  public String getOccurTime() {
    return occurTime;
  }


  public void setOccurTime(String occurTime) {
    this.occurTime = occurTime;
  }


  public AlipayMarketingCardMessageNotifyModel targetCardNo(String targetCardNo) {
    
    this.targetCardNo = targetCardNo;
    return this;
  }

   /**
   * 支付宝业务卡号，即通过 alipay.marketing.card.open 接口开卡后获取的 card_info.biz_card_no 值。
   * @return targetCardNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "000001", value = "支付宝业务卡号，即通过 alipay.marketing.card.open 接口开卡后获取的 card_info.biz_card_no 值。")

  public String getTargetCardNo() {
    return targetCardNo;
  }


  public void setTargetCardNo(String targetCardNo) {
    this.targetCardNo = targetCardNo;
  }


  public AlipayMarketingCardMessageNotifyModel targetCardNoType(String targetCardNoType) {
    
    this.targetCardNoType = targetCardNoType;
    return this;
  }

   /**
   * 卡号ID类型。支持： BIZ_CARD：支付宝业务卡号（商户会员卡场景使用）。
   * @return targetCardNoType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BIZ_CARD", value = "卡号ID类型。支持： BIZ_CARD：支付宝业务卡号（商户会员卡场景使用）。")

  public String getTargetCardNoType() {
    return targetCardNoType;
  }


  public void setTargetCardNoType(String targetCardNoType) {
    this.targetCardNoType = targetCardNoType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingCardMessageNotifyModel alipayMarketingCardMessageNotifyModel = (AlipayMarketingCardMessageNotifyModel) o;
    return Objects.equals(this.notifyInfo, alipayMarketingCardMessageNotifyModel.notifyInfo) &&
        Objects.equals(this.notifyNo, alipayMarketingCardMessageNotifyModel.notifyNo) &&
        Objects.equals(this.notifyType, alipayMarketingCardMessageNotifyModel.notifyType) &&
        Objects.equals(this.occurTime, alipayMarketingCardMessageNotifyModel.occurTime) &&
        Objects.equals(this.targetCardNo, alipayMarketingCardMessageNotifyModel.targetCardNo) &&
        Objects.equals(this.targetCardNoType, alipayMarketingCardMessageNotifyModel.targetCardNoType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifyInfo, notifyNo, notifyType, occurTime, targetCardNo, targetCardNoType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCardMessageNotifyModel {\n");
    sb.append("    notifyInfo: ").append(toIndentedString(notifyInfo)).append("\n");
    sb.append("    notifyNo: ").append(toIndentedString(notifyNo)).append("\n");
    sb.append("    notifyType: ").append(toIndentedString(notifyType)).append("\n");
    sb.append("    occurTime: ").append(toIndentedString(occurTime)).append("\n");
    sb.append("    targetCardNo: ").append(toIndentedString(targetCardNo)).append("\n");
    sb.append("    targetCardNoType: ").append(toIndentedString(targetCardNoType)).append("\n");
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
    openapiFields.add("notify_info");
    openapiFields.add("notify_no");
    openapiFields.add("notify_type");
    openapiFields.add("occur_time");
    openapiFields.add("target_card_no");
    openapiFields.add("target_card_no_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCardMessageNotifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCardMessageNotifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCardMessageNotifyModel is not found in the empty JSON string", AlipayMarketingCardMessageNotifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingCardMessageNotifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingCardMessageNotifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("notify_info") != null && !jsonObj.get("notify_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_info").toString()));
      }
      if (jsonObj.get("notify_no") != null && !jsonObj.get("notify_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_no").toString()));
      }
      if (jsonObj.get("notify_type") != null && !jsonObj.get("notify_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_type").toString()));
      }
      if (jsonObj.get("occur_time") != null && !jsonObj.get("occur_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `occur_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("occur_time").toString()));
      }
      if (jsonObj.get("target_card_no") != null && !jsonObj.get("target_card_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_card_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_card_no").toString()));
      }
      if (jsonObj.get("target_card_no_type") != null && !jsonObj.get("target_card_no_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_card_no_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_card_no_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCardMessageNotifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCardMessageNotifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCardMessageNotifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCardMessageNotifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCardMessageNotifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCardMessageNotifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingCardMessageNotifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingCardMessageNotifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCardMessageNotifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCardMessageNotifyModel
  */
  public static AlipayMarketingCardMessageNotifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCardMessageNotifyModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCardMessageNotifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
