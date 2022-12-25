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
 * AlipayCommerceTransportParkingPaymentinfoSyncResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceTransportParkingPaymentinfoSyncResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BIZ_CODE = "biz_code";
  @SerializedName(SERIALIZED_NAME_BIZ_CODE)
  private String bizCode;

  public static final String SERIALIZED_NAME_BIZ_MSG = "biz_msg";
  @SerializedName(SERIALIZED_NAME_BIZ_MSG)
  private String bizMsg;

  public AlipayCommerceTransportParkingPaymentinfoSyncResponseModel() { 
  }

  public AlipayCommerceTransportParkingPaymentinfoSyncResponseModel bizCode(String bizCode) {
    
    this.bizCode = bizCode;
    return this;
  }

   /**
   * 具体错误码
   * @return bizCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INVALID_PARAMETER", value = "具体错误码")

  public String getBizCode() {
    return bizCode;
  }


  public void setBizCode(String bizCode) {
    this.bizCode = bizCode;
  }


  public AlipayCommerceTransportParkingPaymentinfoSyncResponseModel bizMsg(String bizMsg) {
    
    this.bizMsg = bizMsg;
    return this;
  }

   /**
   * 具体错误原因
   * @return bizMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "车牌不合法", value = "具体错误原因")

  public String getBizMsg() {
    return bizMsg;
  }


  public void setBizMsg(String bizMsg) {
    this.bizMsg = bizMsg;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceTransportParkingPaymentinfoSyncResponseModel alipayCommerceTransportParkingPaymentinfoSyncResponseModel = (AlipayCommerceTransportParkingPaymentinfoSyncResponseModel) o;
    return Objects.equals(this.bizCode, alipayCommerceTransportParkingPaymentinfoSyncResponseModel.bizCode) &&
        Objects.equals(this.bizMsg, alipayCommerceTransportParkingPaymentinfoSyncResponseModel.bizMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizCode, bizMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceTransportParkingPaymentinfoSyncResponseModel {\n");
    sb.append("    bizCode: ").append(toIndentedString(bizCode)).append("\n");
    sb.append("    bizMsg: ").append(toIndentedString(bizMsg)).append("\n");
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
    openapiFields.add("biz_code");
    openapiFields.add("biz_msg");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceTransportParkingPaymentinfoSyncResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceTransportParkingPaymentinfoSyncResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceTransportParkingPaymentinfoSyncResponseModel is not found in the empty JSON string", AlipayCommerceTransportParkingPaymentinfoSyncResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceTransportParkingPaymentinfoSyncResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceTransportParkingPaymentinfoSyncResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_code") != null && !jsonObj.get("biz_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_code").toString()));
      }
      if (jsonObj.get("biz_msg") != null && !jsonObj.get("biz_msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_msg").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceTransportParkingPaymentinfoSyncResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceTransportParkingPaymentinfoSyncResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceTransportParkingPaymentinfoSyncResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceTransportParkingPaymentinfoSyncResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceTransportParkingPaymentinfoSyncResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceTransportParkingPaymentinfoSyncResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceTransportParkingPaymentinfoSyncResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceTransportParkingPaymentinfoSyncResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceTransportParkingPaymentinfoSyncResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceTransportParkingPaymentinfoSyncResponseModel
  */
  public static AlipayCommerceTransportParkingPaymentinfoSyncResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceTransportParkingPaymentinfoSyncResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceTransportParkingPaymentinfoSyncResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

