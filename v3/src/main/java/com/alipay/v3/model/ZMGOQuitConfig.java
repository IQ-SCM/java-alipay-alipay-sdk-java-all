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
 * ZMGOQuitConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZMGOQuitConfig {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_QUIT_DESC = "quit_desc";
  @SerializedName(SERIALIZED_NAME_QUIT_DESC)
  private String quitDesc;

  public static final String SERIALIZED_NAME_QUIT_JUMP_URL = "quit_jump_url";
  @SerializedName(SERIALIZED_NAME_QUIT_JUMP_URL)
  private String quitJumpUrl;

  public static final String SERIALIZED_NAME_QUIT_TYPE = "quit_type";
  @SerializedName(SERIALIZED_NAME_QUIT_TYPE)
  private String quitType;

  public ZMGOQuitConfig() { 
  }

  public ZMGOQuitConfig quitDesc(String quitDesc) {
    
    this.quitDesc = quitDesc;
    return this;
  }

   /**
   * 退出提示
   * @return quitDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "退出提示")

  public String getQuitDesc() {
    return quitDesc;
  }


  public void setQuitDesc(String quitDesc) {
    this.quitDesc = quitDesc;
  }


  public ZMGOQuitConfig quitJumpUrl(String quitJumpUrl) {
    
    this.quitJumpUrl = quitJumpUrl;
    return this;
  }

   /**
   * 退出跳转商家页地址，当quit_type取值为：QUIT_MERCHANT_JUMP，必传
   * @return quitJumpUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "退出跳转商家页地址，当quit_type取值为：QUIT_MERCHANT_JUMP，必传")

  public String getQuitJumpUrl() {
    return quitJumpUrl;
  }


  public void setQuitJumpUrl(String quitJumpUrl) {
    this.quitJumpUrl = quitJumpUrl;
  }


  public ZMGOQuitConfig quitType(String quitType) {
    
    this.quitType = quitType;
    return this;
  }

   /**
   * 退出芝麻GO方式，取值：   （1）QUIT_COMMON(\&quot;QUIT_COMMON\&quot;, \&quot;标准退出\&quot;), （2）QUIT_MERCHANT_JUMP(\&quot;QUIT_MERCHANT_JUMP\&quot;, \&quot;商家页退出\&quot;), （3）QUIT_ONLY_TIPS(\&quot;QUIT_ONLY_TIPS\&quot;, \&quot;仅退出提示\&quot;)
   * @return quitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "退出芝麻GO方式，取值：   （1）QUIT_COMMON(\"QUIT_COMMON\", \"标准退出\"), （2）QUIT_MERCHANT_JUMP(\"QUIT_MERCHANT_JUMP\", \"商家页退出\"), （3）QUIT_ONLY_TIPS(\"QUIT_ONLY_TIPS\", \"仅退出提示\")")

  public String getQuitType() {
    return quitType;
  }


  public void setQuitType(String quitType) {
    this.quitType = quitType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZMGOQuitConfig zmGOQuitConfig = (ZMGOQuitConfig) o;
    return Objects.equals(this.quitDesc, zmGOQuitConfig.quitDesc) &&
        Objects.equals(this.quitJumpUrl, zmGOQuitConfig.quitJumpUrl) &&
        Objects.equals(this.quitType, zmGOQuitConfig.quitType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quitDesc, quitJumpUrl, quitType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZMGOQuitConfig {\n");
    sb.append("    quitDesc: ").append(toIndentedString(quitDesc)).append("\n");
    sb.append("    quitJumpUrl: ").append(toIndentedString(quitJumpUrl)).append("\n");
    sb.append("    quitType: ").append(toIndentedString(quitType)).append("\n");
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
    openapiFields.add("quit_desc");
    openapiFields.add("quit_jump_url");
    openapiFields.add("quit_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZMGOQuitConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZMGOQuitConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZMGOQuitConfig is not found in the empty JSON string", ZMGOQuitConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZMGOQuitConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZMGOQuitConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("quit_desc") != null && !jsonObj.get("quit_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quit_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quit_desc").toString()));
      }
      if (jsonObj.get("quit_jump_url") != null && !jsonObj.get("quit_jump_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quit_jump_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quit_jump_url").toString()));
      }
      if (jsonObj.get("quit_type") != null && !jsonObj.get("quit_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quit_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quit_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZMGOQuitConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZMGOQuitConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZMGOQuitConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZMGOQuitConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ZMGOQuitConfig>() {
           @Override
           public void write(JsonWriter out, ZMGOQuitConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZMGOQuitConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZMGOQuitConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZMGOQuitConfig
  * @throws IOException if the JSON string is invalid with respect to ZMGOQuitConfig
  */
  public static ZMGOQuitConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZMGOQuitConfig.class);
  }

 /**
  * Convert an instance of ZMGOQuitConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

