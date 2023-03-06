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
 * MiniVersionBaseInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MiniVersionBaseInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APP_VERSION = "app_version";
  @SerializedName(SERIALIZED_NAME_APP_VERSION)
  private String appVersion;

  public static final String SERIALIZED_NAME_BUILD_SOURCE = "build_source";
  @SerializedName(SERIALIZED_NAME_BUILD_SOURCE)
  private String buildSource;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundle_id";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_DEV_ID = "dev_id";
  @SerializedName(SERIALIZED_NAME_DEV_ID)
  private String devId;

  public static final String SERIALIZED_NAME_GRAY_STRATEGY = "gray_strategy";
  @SerializedName(SERIALIZED_NAME_GRAY_STRATEGY)
  private String grayStrategy;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public MiniVersionBaseInfo() { 
  }

  public MiniVersionBaseInfo appVersion(String appVersion) {
    
    this.appVersion = appVersion;
    return this;
  }

   /**
   * 版本号
   * @return appVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0.0", value = "版本号")

  public String getAppVersion() {
    return appVersion;
  }


  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  public MiniVersionBaseInfo buildSource(String buildSource) {
    
    this.buildSource = buildSource;
    return this;
  }

   /**
   * 小程序所属来源
   * @return buildSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "小程序所属来源")

  public String getBuildSource() {
    return buildSource;
  }


  public void setBuildSource(String buildSource) {
    this.buildSource = buildSource;
  }


  public MiniVersionBaseInfo bundleId(String bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * com.alipay.alipaywallet:支付宝，com.amap.app:高德
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "com.alipay.alipaywallet", value = "com.alipay.alipaywallet:支付宝，com.amap.app:高德")

  public String getBundleId() {
    return bundleId;
  }


  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public MiniVersionBaseInfo devId(String devId) {
    
    this.devId = devId;
    return this;
  }

   /**
   * 小程序开发者ID
   * @return devId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088********", value = "小程序开发者ID")

  public String getDevId() {
    return devId;
  }


  public void setDevId(String devId) {
    this.devId = devId;
  }


  public MiniVersionBaseInfo grayStrategy(String grayStrategy) {
    
    this.grayStrategy = grayStrategy;
    return this;
  }

   /**
   * 小程序灰度值
   * @return grayStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "p10", value = "小程序灰度值")

  public String getGrayStrategy() {
    return grayStrategy;
  }


  public void setGrayStrategy(String grayStrategy) {
    this.grayStrategy = grayStrategy;
  }


  public MiniVersionBaseInfo miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序应用ID
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019********", value = "小程序应用ID")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public MiniVersionBaseInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 小程序状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INIT", value = "小程序状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MiniVersionBaseInfo miniVersionBaseInfo = (MiniVersionBaseInfo) o;
    return Objects.equals(this.appVersion, miniVersionBaseInfo.appVersion) &&
        Objects.equals(this.buildSource, miniVersionBaseInfo.buildSource) &&
        Objects.equals(this.bundleId, miniVersionBaseInfo.bundleId) &&
        Objects.equals(this.devId, miniVersionBaseInfo.devId) &&
        Objects.equals(this.grayStrategy, miniVersionBaseInfo.grayStrategy) &&
        Objects.equals(this.miniAppId, miniVersionBaseInfo.miniAppId) &&
        Objects.equals(this.status, miniVersionBaseInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appVersion, buildSource, bundleId, devId, grayStrategy, miniAppId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiniVersionBaseInfo {\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    buildSource: ").append(toIndentedString(buildSource)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    devId: ").append(toIndentedString(devId)).append("\n");
    sb.append("    grayStrategy: ").append(toIndentedString(grayStrategy)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("app_version");
    openapiFields.add("build_source");
    openapiFields.add("bundle_id");
    openapiFields.add("dev_id");
    openapiFields.add("gray_strategy");
    openapiFields.add("mini_app_id");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MiniVersionBaseInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MiniVersionBaseInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MiniVersionBaseInfo is not found in the empty JSON string", MiniVersionBaseInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MiniVersionBaseInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MiniVersionBaseInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_version") != null && !jsonObj.get("app_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_version").toString()));
      }
      if (jsonObj.get("build_source") != null && !jsonObj.get("build_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build_source").toString()));
      }
      if (jsonObj.get("bundle_id") != null && !jsonObj.get("bundle_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundle_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundle_id").toString()));
      }
      if (jsonObj.get("dev_id") != null && !jsonObj.get("dev_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dev_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dev_id").toString()));
      }
      if (jsonObj.get("gray_strategy") != null && !jsonObj.get("gray_strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gray_strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gray_strategy").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MiniVersionBaseInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MiniVersionBaseInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MiniVersionBaseInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MiniVersionBaseInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MiniVersionBaseInfo>() {
           @Override
           public void write(JsonWriter out, MiniVersionBaseInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MiniVersionBaseInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MiniVersionBaseInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MiniVersionBaseInfo
  * @throws IOException if the JSON string is invalid with respect to MiniVersionBaseInfo
  */
  public static MiniVersionBaseInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MiniVersionBaseInfo.class);
  }

 /**
  * Convert an instance of MiniVersionBaseInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
