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
 * AlipayOpenMiniExperienceQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniExperienceQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EXP_QR_CODE_URL = "exp_qr_code_url";
  @SerializedName(SERIALIZED_NAME_EXP_QR_CODE_URL)
  private String expQrCodeUrl;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AlipayOpenMiniExperienceQueryResponseModel() { 
  }

  public AlipayOpenMiniExperienceQueryResponseModel expQrCodeUrl(String expQrCodeUrl) {
    
    this.expQrCodeUrl = expQrCodeUrl;
    return this;
  }

   /**
   * 小程序体验版二维码地址
   * @return expQrCodeUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://mobilecodec.alipay.com/show.htm?code=s4x06980mfxeaok1f3zvq8d", value = "小程序体验版二维码地址")

  public String getExpQrCodeUrl() {
    return expQrCodeUrl;
  }


  public void setExpQrCodeUrl(String expQrCodeUrl) {
    this.expQrCodeUrl = expQrCodeUrl;
  }


  public AlipayOpenMiniExperienceQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 体验版打包状态。状态枚举如下： expVersionPackged：体验版打包成功； expVersionPackaging：体验版打包中； notExpVersion：非体验版。
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "notExpVersion", value = "体验版打包状态。状态枚举如下： expVersionPackged：体验版打包成功； expVersionPackaging：体验版打包中； notExpVersion：非体验版。")

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
    AlipayOpenMiniExperienceQueryResponseModel alipayOpenMiniExperienceQueryResponseModel = (AlipayOpenMiniExperienceQueryResponseModel) o;
    return Objects.equals(this.expQrCodeUrl, alipayOpenMiniExperienceQueryResponseModel.expQrCodeUrl) &&
        Objects.equals(this.status, alipayOpenMiniExperienceQueryResponseModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expQrCodeUrl, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniExperienceQueryResponseModel {\n");
    sb.append("    expQrCodeUrl: ").append(toIndentedString(expQrCodeUrl)).append("\n");
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
    openapiFields.add("exp_qr_code_url");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniExperienceQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniExperienceQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniExperienceQueryResponseModel is not found in the empty JSON string", AlipayOpenMiniExperienceQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniExperienceQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniExperienceQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("exp_qr_code_url") != null && !jsonObj.get("exp_qr_code_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exp_qr_code_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exp_qr_code_url").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniExperienceQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniExperienceQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniExperienceQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniExperienceQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniExperienceQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniExperienceQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniExperienceQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniExperienceQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniExperienceQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniExperienceQueryResponseModel
  */
  public static AlipayOpenMiniExperienceQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniExperienceQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniExperienceQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
