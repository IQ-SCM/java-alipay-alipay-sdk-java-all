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
 * AlipayOpenPublicPayeeBindCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicPayeeBindCreateModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LOGIN_ID = "login_id";
  @SerializedName(SERIALIZED_NAME_LOGIN_ID)
  private String loginId;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public AlipayOpenPublicPayeeBindCreateModel() { 
  }

  public AlipayOpenPublicPayeeBindCreateModel loginId(String loginId) {
    
    this.loginId = loginId;
    return this;
  }

   /**
   * 收款账号，需要绑定的收款支付宝账号，请勿与 pid 同时传入。
   * @return loginId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13429393030", value = "收款账号，需要绑定的收款支付宝账号，请勿与 pid 同时传入。")

  public String getLoginId() {
    return loginId;
  }


  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }


  public AlipayOpenPublicPayeeBindCreateModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 支付宝用户id，2088开头的16位长度字符串，请勿与 login_id 同时传入。
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088344343289143", value = "支付宝用户id，2088开头的16位长度字符串，请勿与 login_id 同时传入。")

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
    AlipayOpenPublicPayeeBindCreateModel alipayOpenPublicPayeeBindCreateModel = (AlipayOpenPublicPayeeBindCreateModel) o;
    return Objects.equals(this.loginId, alipayOpenPublicPayeeBindCreateModel.loginId) &&
        Objects.equals(this.pid, alipayOpenPublicPayeeBindCreateModel.pid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginId, pid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicPayeeBindCreateModel {\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
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
    openapiFields.add("login_id");
    openapiFields.add("pid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicPayeeBindCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicPayeeBindCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicPayeeBindCreateModel is not found in the empty JSON string", AlipayOpenPublicPayeeBindCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicPayeeBindCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicPayeeBindCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("login_id") != null && !jsonObj.get("login_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login_id").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicPayeeBindCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicPayeeBindCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicPayeeBindCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicPayeeBindCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicPayeeBindCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicPayeeBindCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicPayeeBindCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicPayeeBindCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicPayeeBindCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicPayeeBindCreateModel
  */
  public static AlipayOpenPublicPayeeBindCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicPayeeBindCreateModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicPayeeBindCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

