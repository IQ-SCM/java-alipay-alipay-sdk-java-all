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
 * IsvSpiDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IsvSpiDefinition {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BIZ_CODE = "biz_code";
  @SerializedName(SERIALIZED_NAME_BIZ_CODE)
  private String bizCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_SPI_ENDPOINT = "spi_endpoint";
  @SerializedName(SERIALIZED_NAME_SPI_ENDPOINT)
  private String spiEndpoint;

  public static final String SERIALIZED_NAME_SPI_EXT_PROPERTY = "spi_ext_property";
  @SerializedName(SERIALIZED_NAME_SPI_EXT_PROPERTY)
  private String spiExtProperty;

  public static final String SERIALIZED_NAME_SPI_KEY = "spi_key";
  @SerializedName(SERIALIZED_NAME_SPI_KEY)
  private String spiKey;

  public static final String SERIALIZED_NAME_SPI_NAME = "spi_name";
  @SerializedName(SERIALIZED_NAME_SPI_NAME)
  private String spiName;

  public IsvSpiDefinition() { 
  }

  public IsvSpiDefinition bizCode(String bizCode) {
    
    this.bizCode = bizCode;
    return this;
  }

   /**
   * ISV自定义的标识功能的业务代码，不可重复
   * @return bizCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "hotline", value = "ISV自定义的标识功能的业务代码，不可重复")

  public String getBizCode() {
    return bizCode;
  }


  public void setBizCode(String bizCode) {
    this.bizCode = bizCode;
  }


  public IsvSpiDefinition description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * spi功能描述
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "spi功能描述", value = "spi功能描述")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public IsvSpiDefinition icon(String icon) {
    
    this.icon = icon;
    return this;
  }

   /**
   * 功能图标文件url
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://127.0.0.1/", value = "功能图标文件url")

  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    this.icon = icon;
  }


  public IsvSpiDefinition spiEndpoint(String spiEndpoint) {
    
    this.spiEndpoint = spiEndpoint;
    return this;
  }

   /**
   * spi接口服务地址
   * @return spiEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://127.0.0.1/", value = "spi接口服务地址")

  public String getSpiEndpoint() {
    return spiEndpoint;
  }


  public void setSpiEndpoint(String spiEndpoint) {
    this.spiEndpoint = spiEndpoint;
  }


  public IsvSpiDefinition spiExtProperty(String spiExtProperty) {
    
    this.spiExtProperty = spiExtProperty;
    return this;
  }

   /**
   * spi接口扩展参数，json格式字符串
   * @return spiExtProperty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key\":\"value\"}", value = "spi接口扩展参数，json格式字符串")

  public String getSpiExtProperty() {
    return spiExtProperty;
  }


  public void setSpiExtProperty(String spiExtProperty) {
    this.spiExtProperty = spiExtProperty;
  }


  public IsvSpiDefinition spiKey(String spiKey) {
    
    this.spiKey = spiKey;
    return this;
  }

   /**
   * CCM预先定义的spi key，与插件位置有关
   * @return spiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "spi_alipay_iservice_ccm_menu", value = "CCM预先定义的spi key，与插件位置有关")

  public String getSpiKey() {
    return spiKey;
  }


  public void setSpiKey(String spiKey) {
    this.spiKey = spiKey;
  }


  public IsvSpiDefinition spiName(String spiName) {
    
    this.spiName = spiName;
    return this;
  }

   /**
   * SPI 名称
   * @return spiName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "热线工作台", value = "SPI 名称")

  public String getSpiName() {
    return spiName;
  }


  public void setSpiName(String spiName) {
    this.spiName = spiName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IsvSpiDefinition isvSpiDefinition = (IsvSpiDefinition) o;
    return Objects.equals(this.bizCode, isvSpiDefinition.bizCode) &&
        Objects.equals(this.description, isvSpiDefinition.description) &&
        Objects.equals(this.icon, isvSpiDefinition.icon) &&
        Objects.equals(this.spiEndpoint, isvSpiDefinition.spiEndpoint) &&
        Objects.equals(this.spiExtProperty, isvSpiDefinition.spiExtProperty) &&
        Objects.equals(this.spiKey, isvSpiDefinition.spiKey) &&
        Objects.equals(this.spiName, isvSpiDefinition.spiName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizCode, description, icon, spiEndpoint, spiExtProperty, spiKey, spiName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsvSpiDefinition {\n");
    sb.append("    bizCode: ").append(toIndentedString(bizCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    spiEndpoint: ").append(toIndentedString(spiEndpoint)).append("\n");
    sb.append("    spiExtProperty: ").append(toIndentedString(spiExtProperty)).append("\n");
    sb.append("    spiKey: ").append(toIndentedString(spiKey)).append("\n");
    sb.append("    spiName: ").append(toIndentedString(spiName)).append("\n");
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
    openapiFields.add("biz_code");
    openapiFields.add("description");
    openapiFields.add("icon");
    openapiFields.add("spi_endpoint");
    openapiFields.add("spi_ext_property");
    openapiFields.add("spi_key");
    openapiFields.add("spi_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IsvSpiDefinition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IsvSpiDefinition.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IsvSpiDefinition is not found in the empty JSON string", IsvSpiDefinition.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IsvSpiDefinition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IsvSpiDefinition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_code") != null && !jsonObj.get("biz_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_code").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if (jsonObj.get("spi_endpoint") != null && !jsonObj.get("spi_endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spi_endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spi_endpoint").toString()));
      }
      if (jsonObj.get("spi_ext_property") != null && !jsonObj.get("spi_ext_property").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spi_ext_property` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spi_ext_property").toString()));
      }
      if (jsonObj.get("spi_key") != null && !jsonObj.get("spi_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spi_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spi_key").toString()));
      }
      if (jsonObj.get("spi_name") != null && !jsonObj.get("spi_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spi_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spi_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IsvSpiDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IsvSpiDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IsvSpiDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IsvSpiDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<IsvSpiDefinition>() {
           @Override
           public void write(JsonWriter out, IsvSpiDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IsvSpiDefinition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IsvSpiDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IsvSpiDefinition
  * @throws IOException if the JSON string is invalid with respect to IsvSpiDefinition
  */
  public static IsvSpiDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IsvSpiDefinition.class);
  }

 /**
  * Convert an instance of IsvSpiDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

