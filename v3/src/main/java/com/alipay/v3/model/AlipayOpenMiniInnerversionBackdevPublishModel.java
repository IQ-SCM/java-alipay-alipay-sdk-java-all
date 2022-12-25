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
 * AlipayOpenMiniInnerversionBackdevPublishModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerversionBackdevPublishModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APP_ORIGIN = "app_origin";
  @SerializedName(SERIALIZED_NAME_APP_ORIGIN)
  private String appOrigin;

  public static final String SERIALIZED_NAME_APP_VERSION = "app_version";
  @SerializedName(SERIALIZED_NAME_APP_VERSION)
  private String appVersion;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundle_id";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public AlipayOpenMiniInnerversionBackdevPublishModel() { 
  }

  public AlipayOpenMiniInnerversionBackdevPublishModel appOrigin(String appOrigin) {
    
    this.appOrigin = appOrigin;
    return this;
  }

   /**
   * 业务来源
   * @return appOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AAA", value = "业务来源")

  public String getAppOrigin() {
    return appOrigin;
  }


  public void setAppOrigin(String appOrigin) {
    this.appOrigin = appOrigin;
  }


  public AlipayOpenMiniInnerversionBackdevPublishModel appVersion(String appVersion) {
    
    this.appVersion = appVersion;
    return this;
  }

   /**
   * 小程序版本
   * @return appVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0.1", value = "小程序版本")

  public String getAppVersion() {
    return appVersion;
  }


  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  public AlipayOpenMiniInnerversionBackdevPublishModel bundleId(String bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * 端信息
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支付宝：com.alipay.alipaywallet 高德：com.amap.app", value = "端信息")

  public String getBundleId() {
    return bundleId;
  }


  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public AlipayOpenMiniInnerversionBackdevPublishModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序ID，仅特殊场景使用，普通业务方无需关注该参数
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019****", value = "小程序ID，仅特殊场景使用，普通业务方无需关注该参数")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenMiniInnerversionBackdevPublishModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 小程序所属PID
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088****", value = "小程序所属PID")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniInnerversionBackdevPublishModel alipayOpenMiniInnerversionBackdevPublishModel = (AlipayOpenMiniInnerversionBackdevPublishModel) o;
    return Objects.equals(this.appOrigin, alipayOpenMiniInnerversionBackdevPublishModel.appOrigin) &&
        Objects.equals(this.appVersion, alipayOpenMiniInnerversionBackdevPublishModel.appVersion) &&
        Objects.equals(this.bundleId, alipayOpenMiniInnerversionBackdevPublishModel.bundleId) &&
        Objects.equals(this.miniAppId, alipayOpenMiniInnerversionBackdevPublishModel.miniAppId) &&
        Objects.equals(this.pid, alipayOpenMiniInnerversionBackdevPublishModel.pid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appOrigin, appVersion, bundleId, miniAppId, pid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerversionBackdevPublishModel {\n");
    sb.append("    appOrigin: ").append(toIndentedString(appOrigin)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
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
    openapiFields.add("app_origin");
    openapiFields.add("app_version");
    openapiFields.add("bundle_id");
    openapiFields.add("mini_app_id");
    openapiFields.add("pid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerversionBackdevPublishModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerversionBackdevPublishModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerversionBackdevPublishModel is not found in the empty JSON string", AlipayOpenMiniInnerversionBackdevPublishModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniInnerversionBackdevPublishModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniInnerversionBackdevPublishModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_origin") != null && !jsonObj.get("app_origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_origin").toString()));
      }
      if (jsonObj.get("app_version") != null && !jsonObj.get("app_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_version").toString()));
      }
      if (jsonObj.get("bundle_id") != null && !jsonObj.get("bundle_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundle_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundle_id").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerversionBackdevPublishModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerversionBackdevPublishModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerversionBackdevPublishModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerversionBackdevPublishModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerversionBackdevPublishModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerversionBackdevPublishModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniInnerversionBackdevPublishModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniInnerversionBackdevPublishModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerversionBackdevPublishModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerversionBackdevPublishModel
  */
  public static AlipayOpenMiniInnerversionBackdevPublishModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerversionBackdevPublishModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerversionBackdevPublishModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

