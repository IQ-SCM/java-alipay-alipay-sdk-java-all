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
import com.alipay.v3.model.DeliveryConfig;
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
 * ErrorDeliveryConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ErrorDeliveryConfig {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DELIVERY_CONFIG = "delivery_config";
  @SerializedName(SERIALIZED_NAME_DELIVERY_CONFIG)
  private DeliveryConfig deliveryConfig;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MSG = "error_msg";
  @SerializedName(SERIALIZED_NAME_ERROR_MSG)
  private String errorMsg;

  public ErrorDeliveryConfig() { 
  }

  public ErrorDeliveryConfig deliveryConfig(DeliveryConfig deliveryConfig) {
    
    this.deliveryConfig = deliveryConfig;
    return this;
  }

   /**
   * Get deliveryConfig
   * @return deliveryConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryConfig getDeliveryConfig() {
    return deliveryConfig;
  }


  public void setDeliveryConfig(DeliveryConfig deliveryConfig) {
    this.deliveryConfig = deliveryConfig;
  }


  public ErrorDeliveryConfig errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 错误码。针对单个投放，具体的错误原因。  枚举值： UNKNOWN_EXCEPTION: 未知异常，可重试。 ACTIVITY_STATUS_NOT_ACTIVE:  活动状态未激活，不可重试。 ACTIVITY_OVERDUE:活动已过期，不可重试。 DELIVERY_VALIDATE_ERROR:投放校验不通过，不可重试。 DELIVERY_OPERATE_ERROR: 投放操作失败，不可重试。 BOOTH_CHANNEL_NOT_EXIST:渠道不存在，不可重试。
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "错误码。针对单个投放，具体的错误原因。  枚举值： UNKNOWN_EXCEPTION: 未知异常，可重试。 ACTIVITY_STATUS_NOT_ACTIVE:  活动状态未激活，不可重试。 ACTIVITY_OVERDUE:活动已过期，不可重试。 DELIVERY_VALIDATE_ERROR:投放校验不通过，不可重试。 DELIVERY_OPERATE_ERROR: 投放操作失败，不可重试。 BOOTH_CHANNEL_NOT_EXIST:渠道不存在，不可重试。")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public ErrorDeliveryConfig errorMsg(String errorMsg) {
    
    this.errorMsg = errorMsg;
    return this;
  }

   /**
   * 详细的投放错误信息。用于判断具体的错误信息。
   * @return errorMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "详细的投放错误信息。用于判断具体的错误信息。")

  public String getErrorMsg() {
    return errorMsg;
  }


  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDeliveryConfig errorDeliveryConfig = (ErrorDeliveryConfig) o;
    return Objects.equals(this.deliveryConfig, errorDeliveryConfig.deliveryConfig) &&
        Objects.equals(this.errorCode, errorDeliveryConfig.errorCode) &&
        Objects.equals(this.errorMsg, errorDeliveryConfig.errorMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryConfig, errorCode, errorMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDeliveryConfig {\n");
    sb.append("    deliveryConfig: ").append(toIndentedString(deliveryConfig)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
    openapiFields.add("delivery_config");
    openapiFields.add("error_code");
    openapiFields.add("error_msg");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ErrorDeliveryConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ErrorDeliveryConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ErrorDeliveryConfig is not found in the empty JSON string", ErrorDeliveryConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ErrorDeliveryConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ErrorDeliveryConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `delivery_config`
      if (jsonObj.getAsJsonObject("delivery_config") != null) {
        DeliveryConfig.validateJsonObject(jsonObj.getAsJsonObject("delivery_config"));
      }
      if (jsonObj.get("error_code") != null && !jsonObj.get("error_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_code").toString()));
      }
      if (jsonObj.get("error_msg") != null && !jsonObj.get("error_msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_msg").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ErrorDeliveryConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ErrorDeliveryConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ErrorDeliveryConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ErrorDeliveryConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ErrorDeliveryConfig>() {
           @Override
           public void write(JsonWriter out, ErrorDeliveryConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ErrorDeliveryConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ErrorDeliveryConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ErrorDeliveryConfig
  * @throws IOException if the JSON string is invalid with respect to ErrorDeliveryConfig
  */
  public static ErrorDeliveryConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ErrorDeliveryConfig.class);
  }

 /**
  * Convert an instance of ErrorDeliveryConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

