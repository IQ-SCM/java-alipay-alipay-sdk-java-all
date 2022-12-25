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
 * DeliveryConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliveryConfig {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_BOOTH_CODE = "booth_code";
  @SerializedName(SERIALIZED_NAME_BOOTH_CODE)
  private String boothCode;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public DeliveryConfig() { 
  }

  public DeliveryConfig activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 活动id。 通过商家券相关接口创建的活动。
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "活动id。 通过商家券相关接口创建的活动。")

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public DeliveryConfig boothCode(String boothCode) {
    
    this.boothCode = boothCode;
    return this;
  }

   /**
   * 展位码:boothCode表达的是具体渠道所属的展位码。例如：支付结果页PAYMENT_RESULT
   * @return boothCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "展位码:boothCode表达的是具体渠道所属的展位码。例如：支付结果页PAYMENT_RESULT")

  public String getBoothCode() {
    return boothCode;
  }


  public void setBoothCode(String boothCode) {
    this.boothCode = boothCode;
  }


  public DeliveryConfig channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * 可投放的渠道标识. 说明： 针对不同的boot_code，channel值各不相同.接口使用者可以认为channel是不同booth_code展位下的渠道的唯一标识。 例如： booth_code为PAYMENT_RESULT。 channel为某个商户的pid。
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "可投放的渠道标识. 说明： 针对不同的boot_code，channel值各不相同.接口使用者可以认为channel是不同booth_code展位下的渠道的唯一标识。 例如： booth_code为PAYMENT_RESULT。 channel为某个商户的pid。")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryConfig deliveryConfig = (DeliveryConfig) o;
    return Objects.equals(this.activityId, deliveryConfig.activityId) &&
        Objects.equals(this.boothCode, deliveryConfig.boothCode) &&
        Objects.equals(this.channel, deliveryConfig.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, boothCode, channel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryConfig {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    boothCode: ").append(toIndentedString(boothCode)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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
    openapiFields.add("activity_id");
    openapiFields.add("booth_code");
    openapiFields.add("channel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliveryConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeliveryConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryConfig is not found in the empty JSON string", DeliveryConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeliveryConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeliveryConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("activity_id") != null && !jsonObj.get("activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_id").toString()));
      }
      if (jsonObj.get("booth_code") != null && !jsonObj.get("booth_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `booth_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("booth_code").toString()));
      }
      if (jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryConfig>() {
           @Override
           public void write(JsonWriter out, DeliveryConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliveryConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryConfig
  * @throws IOException if the JSON string is invalid with respect to DeliveryConfig
  */
  public static DeliveryConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryConfig.class);
  }

 /**
  * Convert an instance of DeliveryConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

