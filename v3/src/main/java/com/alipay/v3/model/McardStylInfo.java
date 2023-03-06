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
 * McardStylInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class McardStylInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BACKGROUND_ID = "background_id";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_ID)
  private String backgroundId;

  public static final String SERIALIZED_NAME_BG_COLOR = "bg_color";
  @SerializedName(SERIALIZED_NAME_BG_COLOR)
  private String bgColor;

  public static final String SERIALIZED_NAME_LOGO_ID = "logo_id";
  @SerializedName(SERIALIZED_NAME_LOGO_ID)
  private String logoId;

  public McardStylInfo() { 
  }

  public McardStylInfo backgroundId(String backgroundId) {
    
    this.backgroundId = backgroundId;
    return this;
  }

   /**
   * 背景图片Id，通过接口（alipay.offline.material.image.upload）上传图片    图片说明：2M以内，格式：bmp、png、jpeg、jpg、gif；  尺寸不小于1020*643px；  图片不得有圆角，不得拉伸变形
   * @return backgroundId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1T8Pp00AT7eo9NoAJkMR3AAAACMAAQEC", value = "背景图片Id，通过接口（alipay.offline.material.image.upload）上传图片    图片说明：2M以内，格式：bmp、png、jpeg、jpg、gif；  尺寸不小于1020*643px；  图片不得有圆角，不得拉伸变形")

  public String getBackgroundId() {
    return backgroundId;
  }


  public void setBackgroundId(String backgroundId) {
    this.backgroundId = backgroundId;
  }


  public McardStylInfo bgColor(String bgColor) {
    
    this.bgColor = bgColor;
    return this;
  }

   /**
   * 背景色
   * @return bgColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rgb(55,112,179)", value = "背景色")

  public String getBgColor() {
    return bgColor;
  }


  public void setBgColor(String bgColor) {
    this.bgColor = bgColor;
  }


  public McardStylInfo logoId(String logoId) {
    
    this.logoId = logoId;
    return this;
  }

   /**
   * logo的图片ID，通过接口（alipay.offline.material.image.upload）上传图片    图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；  尺寸不小于500*500px的正方形；  请优先使用商家LOGO；
   * @return logoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1T8Pp00AT7eo9NoAJkMR3AAAACMAAQEC", value = "logo的图片ID，通过接口（alipay.offline.material.image.upload）上传图片    图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；  尺寸不小于500*500px的正方形；  请优先使用商家LOGO；")

  public String getLogoId() {
    return logoId;
  }


  public void setLogoId(String logoId) {
    this.logoId = logoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    McardStylInfo mcardStylInfo = (McardStylInfo) o;
    return Objects.equals(this.backgroundId, mcardStylInfo.backgroundId) &&
        Objects.equals(this.bgColor, mcardStylInfo.bgColor) &&
        Objects.equals(this.logoId, mcardStylInfo.logoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundId, bgColor, logoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class McardStylInfo {\n");
    sb.append("    backgroundId: ").append(toIndentedString(backgroundId)).append("\n");
    sb.append("    bgColor: ").append(toIndentedString(bgColor)).append("\n");
    sb.append("    logoId: ").append(toIndentedString(logoId)).append("\n");
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
    openapiFields.add("background_id");
    openapiFields.add("bg_color");
    openapiFields.add("logo_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to McardStylInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (McardStylInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in McardStylInfo is not found in the empty JSON string", McardStylInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!McardStylInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `McardStylInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("background_id") != null && !jsonObj.get("background_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `background_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("background_id").toString()));
      }
      if (jsonObj.get("bg_color") != null && !jsonObj.get("bg_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bg_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bg_color").toString()));
      }
      if (jsonObj.get("logo_id") != null && !jsonObj.get("logo_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!McardStylInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'McardStylInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<McardStylInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(McardStylInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<McardStylInfo>() {
           @Override
           public void write(JsonWriter out, McardStylInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public McardStylInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of McardStylInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of McardStylInfo
  * @throws IOException if the JSON string is invalid with respect to McardStylInfo
  */
  public static McardStylInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, McardStylInfo.class);
  }

 /**
  * Convert an instance of McardStylInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
