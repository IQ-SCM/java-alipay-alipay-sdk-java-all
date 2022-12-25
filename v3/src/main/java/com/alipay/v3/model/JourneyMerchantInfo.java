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
import com.alipay.v3.model.OrderExtInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * JourneyMerchantInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JourneyMerchantInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private List<OrderExtInfo> extInfo = null;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORT_NAME = "short_name";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public JourneyMerchantInfo() { 
  }

  public JourneyMerchantInfo extInfo(List<OrderExtInfo> extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

  public JourneyMerchantInfo addExtInfoItem(OrderExtInfo extInfoItem) {
    if (this.extInfo == null) {
      this.extInfo = new ArrayList<>();
    }
    this.extInfo.add(extInfoItem);
    return this;
  }

   /**
   * 扩展信息
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展信息")

  public List<OrderExtInfo> getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(List<OrderExtInfo> extInfo) {
    this.extInfo = extInfo;
  }


  public JourneyMerchantInfo logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * 商户logo链接
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "logo.jpg", value = "商户logo链接")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public JourneyMerchantInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 商家名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "中国航空公司", value = "商家名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public JourneyMerchantInfo shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * 商家简称
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "中国航空", value = "商家简称")

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyMerchantInfo journeyMerchantInfo = (JourneyMerchantInfo) o;
    return Objects.equals(this.extInfo, journeyMerchantInfo.extInfo) &&
        Objects.equals(this.logo, journeyMerchantInfo.logo) &&
        Objects.equals(this.name, journeyMerchantInfo.name) &&
        Objects.equals(this.shortName, journeyMerchantInfo.shortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extInfo, logo, name, shortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyMerchantInfo {\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
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
    openapiFields.add("ext_info");
    openapiFields.add("logo");
    openapiFields.add("name");
    openapiFields.add("short_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JourneyMerchantInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JourneyMerchantInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JourneyMerchantInfo is not found in the empty JSON string", JourneyMerchantInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JourneyMerchantInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JourneyMerchantInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayextInfo = jsonObj.getAsJsonArray("ext_info");
      if (jsonArrayextInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ext_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be an array in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
        }

        // validate the optional field `ext_info` (array)
        for (int i = 0; i < jsonArrayextInfo.size(); i++) {
          OrderExtInfo.validateJsonObject(jsonArrayextInfo.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("short_name") != null && !jsonObj.get("short_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `short_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("short_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JourneyMerchantInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JourneyMerchantInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JourneyMerchantInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JourneyMerchantInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<JourneyMerchantInfo>() {
           @Override
           public void write(JsonWriter out, JourneyMerchantInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JourneyMerchantInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JourneyMerchantInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JourneyMerchantInfo
  * @throws IOException if the JSON string is invalid with respect to JourneyMerchantInfo
  */
  public static JourneyMerchantInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JourneyMerchantInfo.class);
  }

 /**
  * Convert an instance of JourneyMerchantInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

