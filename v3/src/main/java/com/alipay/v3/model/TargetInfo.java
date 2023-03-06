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
 * TargetInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TargetInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private String targetType;

  public TargetInfo() { 
  }

  public TargetInfo targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * 应用id，例如小程序id
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018001307627807", value = "应用id，例如小程序id")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public TargetInfo targetType(String targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * 应用类型 小程序传入：APPID 生活号传入：PUBLICID
   * @return targetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APPID", value = "应用类型 小程序传入：APPID 生活号传入：PUBLICID")

  public String getTargetType() {
    return targetType;
  }


  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetInfo targetInfo = (TargetInfo) o;
    return Objects.equals(this.targetId, targetInfo.targetId) &&
        Objects.equals(this.targetType, targetInfo.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, targetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetInfo {\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
    openapiFields.add("target_id");
    openapiFields.add("target_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TargetInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TargetInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TargetInfo is not found in the empty JSON string", TargetInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TargetInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TargetInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("target_id") != null && !jsonObj.get("target_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_id").toString()));
      }
      if (jsonObj.get("target_type") != null && !jsonObj.get("target_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TargetInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TargetInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TargetInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TargetInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TargetInfo>() {
           @Override
           public void write(JsonWriter out, TargetInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TargetInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TargetInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TargetInfo
  * @throws IOException if the JSON string is invalid with respect to TargetInfo
  */
  public static TargetInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetInfo.class);
  }

 /**
  * Convert an instance of TargetInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
