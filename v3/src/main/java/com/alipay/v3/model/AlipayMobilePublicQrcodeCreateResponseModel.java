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
 * AlipayMobilePublicQrcodeCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMobilePublicQrcodeCreateResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_CODE_IMG = "code_img";
  @SerializedName(SERIALIZED_NAME_CODE_IMG)
  private String codeImg;

  public static final String SERIALIZED_NAME_EXPIRE_SECOND = "expire_second";
  @SerializedName(SERIALIZED_NAME_EXPIRE_SECOND)
  private Integer expireSecond;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg;

  public AlipayMobilePublicQrcodeCreateResponseModel() { 
  }

  public AlipayMobilePublicQrcodeCreateResponseModel code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * 返回结果码，如200，标识成功
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "返回结果码，如200，标识成功")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public AlipayMobilePublicQrcodeCreateResponseModel codeImg(String codeImg) {
    
    this.codeImg = codeImg;
    return this;
  }

   /**
   * 图片地址
   * @return codeImg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "图片地址", value = "图片地址")

  public String getCodeImg() {
    return codeImg;
  }


  public void setCodeImg(String codeImg) {
    this.codeImg = codeImg;
  }


  public AlipayMobilePublicQrcodeCreateResponseModel expireSecond(Integer expireSecond) {
    
    this.expireSecond = expireSecond;
    return this;
  }

   /**
   * 码过期时间，单位：秒
   * @return expireSecond
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1800", value = "码过期时间，单位：秒")

  public Integer getExpireSecond() {
    return expireSecond;
  }


  public void setExpireSecond(Integer expireSecond) {
    this.expireSecond = expireSecond;
  }


  public AlipayMobilePublicQrcodeCreateResponseModel msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * 结果吗描述信息
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "成功", value = "结果吗描述信息")

  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMobilePublicQrcodeCreateResponseModel alipayMobilePublicQrcodeCreateResponseModel = (AlipayMobilePublicQrcodeCreateResponseModel) o;
    return Objects.equals(this.code, alipayMobilePublicQrcodeCreateResponseModel.code) &&
        Objects.equals(this.codeImg, alipayMobilePublicQrcodeCreateResponseModel.codeImg) &&
        Objects.equals(this.expireSecond, alipayMobilePublicQrcodeCreateResponseModel.expireSecond) &&
        Objects.equals(this.msg, alipayMobilePublicQrcodeCreateResponseModel.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, codeImg, expireSecond, msg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMobilePublicQrcodeCreateResponseModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeImg: ").append(toIndentedString(codeImg)).append("\n");
    sb.append("    expireSecond: ").append(toIndentedString(expireSecond)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("code_img");
    openapiFields.add("expire_second");
    openapiFields.add("msg");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMobilePublicQrcodeCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMobilePublicQrcodeCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMobilePublicQrcodeCreateResponseModel is not found in the empty JSON string", AlipayMobilePublicQrcodeCreateResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMobilePublicQrcodeCreateResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMobilePublicQrcodeCreateResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("code_img") != null && !jsonObj.get("code_img").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code_img` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code_img").toString()));
      }
      if (jsonObj.get("msg") != null && !jsonObj.get("msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMobilePublicQrcodeCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMobilePublicQrcodeCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMobilePublicQrcodeCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMobilePublicQrcodeCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMobilePublicQrcodeCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMobilePublicQrcodeCreateResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMobilePublicQrcodeCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMobilePublicQrcodeCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMobilePublicQrcodeCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMobilePublicQrcodeCreateResponseModel
  */
  public static AlipayMobilePublicQrcodeCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMobilePublicQrcodeCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMobilePublicQrcodeCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

