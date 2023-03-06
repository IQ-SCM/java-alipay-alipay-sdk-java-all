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
import com.alipay.v3.model.DeliveryMaterial;
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
 * DeliveryBaseInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliveryBaseInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DELIVERY_BEGIN_TIME = "delivery_begin_time";
  @SerializedName(SERIALIZED_NAME_DELIVERY_BEGIN_TIME)
  private String deliveryBeginTime;

  public static final String SERIALIZED_NAME_DELIVERY_END_TIME = "delivery_end_time";
  @SerializedName(SERIALIZED_NAME_DELIVERY_END_TIME)
  private String deliveryEndTime;

  public static final String SERIALIZED_NAME_DELIVERY_MATERIAL = "delivery_material";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MATERIAL)
  private DeliveryMaterial deliveryMaterial;

  public static final String SERIALIZED_NAME_DELIVERY_NAME = "delivery_name";
  @SerializedName(SERIALIZED_NAME_DELIVERY_NAME)
  private String deliveryName;

  public DeliveryBaseInfo() { 
  }

  public DeliveryBaseInfo deliveryBeginTime(String deliveryBeginTime) {
    
    this.deliveryBeginTime = deliveryBeginTime;
    return this;
  }

   /**
   * 投放计划开始时间。 格式为：yyyy-MM-dd HH:mm:ss。
   * @return deliveryBeginTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "投放计划开始时间。 格式为：yyyy-MM-dd HH:mm:ss。")

  public String getDeliveryBeginTime() {
    return deliveryBeginTime;
  }


  public void setDeliveryBeginTime(String deliveryBeginTime) {
    this.deliveryBeginTime = deliveryBeginTime;
  }


  public DeliveryBaseInfo deliveryEndTime(String deliveryEndTime) {
    
    this.deliveryEndTime = deliveryEndTime;
    return this;
  }

   /**
   * 投放计划结束时间。 格式为：yyyy-MM-dd HH:mm:ss。
   * @return deliveryEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "投放计划结束时间。 格式为：yyyy-MM-dd HH:mm:ss。")

  public String getDeliveryEndTime() {
    return deliveryEndTime;
  }


  public void setDeliveryEndTime(String deliveryEndTime) {
    this.deliveryEndTime = deliveryEndTime;
  }


  public DeliveryBaseInfo deliveryMaterial(DeliveryMaterial deliveryMaterial) {
    
    this.deliveryMaterial = deliveryMaterial;
    return this;
  }

   /**
   * Get deliveryMaterial
   * @return deliveryMaterial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryMaterial getDeliveryMaterial() {
    return deliveryMaterial;
  }


  public void setDeliveryMaterial(DeliveryMaterial deliveryMaterial) {
    this.deliveryMaterial = deliveryMaterial;
  }


  public DeliveryBaseInfo deliveryName(String deliveryName) {
    
    this.deliveryName = deliveryName;
    return this;
  }

   /**
   * 投放计划名称。 投放计划名称不会对用户进行表达，只用于商户管理使用。长度需要大于等于3，小于20。
   * @return deliveryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "投放计划名称。 投放计划名称不会对用户进行表达，只用于商户管理使用。长度需要大于等于3，小于20。")

  public String getDeliveryName() {
    return deliveryName;
  }


  public void setDeliveryName(String deliveryName) {
    this.deliveryName = deliveryName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryBaseInfo deliveryBaseInfo = (DeliveryBaseInfo) o;
    return Objects.equals(this.deliveryBeginTime, deliveryBaseInfo.deliveryBeginTime) &&
        Objects.equals(this.deliveryEndTime, deliveryBaseInfo.deliveryEndTime) &&
        Objects.equals(this.deliveryMaterial, deliveryBaseInfo.deliveryMaterial) &&
        Objects.equals(this.deliveryName, deliveryBaseInfo.deliveryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryBeginTime, deliveryEndTime, deliveryMaterial, deliveryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryBaseInfo {\n");
    sb.append("    deliveryBeginTime: ").append(toIndentedString(deliveryBeginTime)).append("\n");
    sb.append("    deliveryEndTime: ").append(toIndentedString(deliveryEndTime)).append("\n");
    sb.append("    deliveryMaterial: ").append(toIndentedString(deliveryMaterial)).append("\n");
    sb.append("    deliveryName: ").append(toIndentedString(deliveryName)).append("\n");
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
    openapiFields.add("delivery_begin_time");
    openapiFields.add("delivery_end_time");
    openapiFields.add("delivery_material");
    openapiFields.add("delivery_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliveryBaseInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeliveryBaseInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryBaseInfo is not found in the empty JSON string", DeliveryBaseInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeliveryBaseInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeliveryBaseInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("delivery_begin_time") != null && !jsonObj.get("delivery_begin_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_begin_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_begin_time").toString()));
      }
      if (jsonObj.get("delivery_end_time") != null && !jsonObj.get("delivery_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_end_time").toString()));
      }
      // validate the optional field `delivery_material`
      if (jsonObj.getAsJsonObject("delivery_material") != null) {
        DeliveryMaterial.validateJsonObject(jsonObj.getAsJsonObject("delivery_material"));
      }
      if (jsonObj.get("delivery_name") != null && !jsonObj.get("delivery_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryBaseInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryBaseInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryBaseInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryBaseInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryBaseInfo>() {
           @Override
           public void write(JsonWriter out, DeliveryBaseInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryBaseInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliveryBaseInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryBaseInfo
  * @throws IOException if the JSON string is invalid with respect to DeliveryBaseInfo
  */
  public static DeliveryBaseInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryBaseInfo.class);
  }

 /**
  * Convert an instance of DeliveryBaseInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
