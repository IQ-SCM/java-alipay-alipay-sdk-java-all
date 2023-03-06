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
 * FundExtInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FundExtInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FUND_IDENTITY = "fund_identity";
  @SerializedName(SERIALIZED_NAME_FUND_IDENTITY)
  private String fundIdentity;

  public static final String SERIALIZED_NAME_FUND_IDENTITY_TYPE = "fund_identity_type";
  @SerializedName(SERIALIZED_NAME_FUND_IDENTITY_TYPE)
  private String fundIdentityType;

  public FundExtInfo() { 
  }

  public FundExtInfo fundIdentity(String fundIdentity) {
    
    this.fundIdentity = fundIdentity;
    return this;
  }

   /**
   * 出资主体账号，fund_identity_type是ALIPAY_USER_ID填支付宝会员ID（2088开头）； 是ALIPAY_LOGON_ID 填支付宝登录号
   * @return fundIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "出资主体账号，fund_identity_type是ALIPAY_USER_ID填支付宝会员ID（2088开头）； 是ALIPAY_LOGON_ID 填支付宝登录号")

  public String getFundIdentity() {
    return fundIdentity;
  }


  public void setFundIdentity(String fundIdentity) {
    this.fundIdentity = fundIdentity;
  }


  public FundExtInfo fundIdentityType(String fundIdentityType) {
    
    this.fundIdentityType = fundIdentityType;
    return this;
  }

   /**
   * 出资主体账号类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID 2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式
   * @return fundIdentityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "出资主体账号类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID 2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式")

  public String getFundIdentityType() {
    return fundIdentityType;
  }


  public void setFundIdentityType(String fundIdentityType) {
    this.fundIdentityType = fundIdentityType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundExtInfo fundExtInfo = (FundExtInfo) o;
    return Objects.equals(this.fundIdentity, fundExtInfo.fundIdentity) &&
        Objects.equals(this.fundIdentityType, fundExtInfo.fundIdentityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundIdentity, fundIdentityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundExtInfo {\n");
    sb.append("    fundIdentity: ").append(toIndentedString(fundIdentity)).append("\n");
    sb.append("    fundIdentityType: ").append(toIndentedString(fundIdentityType)).append("\n");
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
    openapiFields.add("fund_identity");
    openapiFields.add("fund_identity_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FundExtInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FundExtInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FundExtInfo is not found in the empty JSON string", FundExtInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FundExtInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FundExtInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("fund_identity") != null && !jsonObj.get("fund_identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fund_identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fund_identity").toString()));
      }
      if (jsonObj.get("fund_identity_type") != null && !jsonObj.get("fund_identity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fund_identity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fund_identity_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FundExtInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FundExtInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FundExtInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FundExtInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<FundExtInfo>() {
           @Override
           public void write(JsonWriter out, FundExtInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FundExtInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FundExtInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FundExtInfo
  * @throws IOException if the JSON string is invalid with respect to FundExtInfo
  */
  public static FundExtInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FundExtInfo.class);
  }

 /**
  * Convert an instance of FundExtInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
