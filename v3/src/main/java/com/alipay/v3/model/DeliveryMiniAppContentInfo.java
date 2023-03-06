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
 * DeliveryMiniAppContentInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliveryMiniAppContentInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MINI_APP_DELIVERY_TYPE = "mini_app_delivery_type";
  @SerializedName(SERIALIZED_NAME_MINI_APP_DELIVERY_TYPE)
  private String miniAppDeliveryType;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_SERVICE_CODE_LIST = "service_code_list";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE_LIST)
  private List<String> serviceCodeList = null;

  public DeliveryMiniAppContentInfo() { 
  }

  public DeliveryMiniAppContentInfo miniAppDeliveryType(String miniAppDeliveryType) {
    
    this.miniAppDeliveryType = miniAppDeliveryType;
    return this;
  }

   /**
   * 仅小程序推广可用。枚举值：服务直达
   * @return miniAppDeliveryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "仅小程序推广可用。枚举值：服务直达")

  public String getMiniAppDeliveryType() {
    return miniAppDeliveryType;
  }


  public void setMiniAppDeliveryType(String miniAppDeliveryType) {
    this.miniAppDeliveryType = miniAppDeliveryType;
  }


  public DeliveryMiniAppContentInfo miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序appid
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小程序appid")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public DeliveryMiniAppContentInfo serviceCodeList(List<String> serviceCodeList) {
    
    this.serviceCodeList = serviceCodeList;
    return this;
  }

  public DeliveryMiniAppContentInfo addServiceCodeListItem(String serviceCodeListItem) {
    if (this.serviceCodeList == null) {
      this.serviceCodeList = new ArrayList<>();
    }
    this.serviceCodeList.add(serviceCodeListItem);
    return this;
  }

   /**
   * 小程序服务编码/home_page，通过 alipay.open.app.appcontent.function.create(小程序服务创建)接口创建服务后获取。 限制: 1.只有mini_app_id有值时该值传入才会有效 2.当前只支持一个服务code 3.service_codes必须是已传入的mini_app_id下的小程序
   * @return serviceCodeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小程序服务编码/home_page，通过 alipay.open.app.appcontent.function.create(小程序服务创建)接口创建服务后获取。 限制: 1.只有mini_app_id有值时该值传入才会有效 2.当前只支持一个服务code 3.service_codes必须是已传入的mini_app_id下的小程序")

  public List<String> getServiceCodeList() {
    return serviceCodeList;
  }


  public void setServiceCodeList(List<String> serviceCodeList) {
    this.serviceCodeList = serviceCodeList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryMiniAppContentInfo deliveryMiniAppContentInfo = (DeliveryMiniAppContentInfo) o;
    return Objects.equals(this.miniAppDeliveryType, deliveryMiniAppContentInfo.miniAppDeliveryType) &&
        Objects.equals(this.miniAppId, deliveryMiniAppContentInfo.miniAppId) &&
        Objects.equals(this.serviceCodeList, deliveryMiniAppContentInfo.serviceCodeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(miniAppDeliveryType, miniAppId, serviceCodeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryMiniAppContentInfo {\n");
    sb.append("    miniAppDeliveryType: ").append(toIndentedString(miniAppDeliveryType)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    serviceCodeList: ").append(toIndentedString(serviceCodeList)).append("\n");
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
    openapiFields.add("mini_app_delivery_type");
    openapiFields.add("mini_app_id");
    openapiFields.add("service_code_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliveryMiniAppContentInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeliveryMiniAppContentInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryMiniAppContentInfo is not found in the empty JSON string", DeliveryMiniAppContentInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeliveryMiniAppContentInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeliveryMiniAppContentInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("mini_app_delivery_type") != null && !jsonObj.get("mini_app_delivery_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_delivery_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_delivery_type").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("service_code_list") != null && !jsonObj.get("service_code_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code_list` to be an array in the JSON string but got `%s`", jsonObj.get("service_code_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryMiniAppContentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryMiniAppContentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryMiniAppContentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryMiniAppContentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryMiniAppContentInfo>() {
           @Override
           public void write(JsonWriter out, DeliveryMiniAppContentInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryMiniAppContentInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliveryMiniAppContentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryMiniAppContentInfo
  * @throws IOException if the JSON string is invalid with respect to DeliveryMiniAppContentInfo
  */
  public static DeliveryMiniAppContentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryMiniAppContentInfo.class);
  }

 /**
  * Convert an instance of DeliveryMiniAppContentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
