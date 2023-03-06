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
 * ActivityShopInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ActivityShopInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private String latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private String longitude;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public static final String SERIALIZED_NAME_SHOP_NAME = "shop_name";
  @SerializedName(SERIALIZED_NAME_SHOP_NAME)
  private String shopName;

  public static final String SERIALIZED_NAME_SHOP_TYPE = "shop_type";
  @SerializedName(SERIALIZED_NAME_SHOP_TYPE)
  private String shopType;

  public ActivityShopInfo() { 
  }

  public ActivityShopInfo latitude(String latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * 纬度，浮点型,小数点后最多保留6位
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60.270001", value = "纬度，浮点型,小数点后最多保留6位")

  public String getLatitude() {
    return latitude;
  }


  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  public ActivityShopInfo longitude(String longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * 经度，浮点型, 小数点后最多保留6位。
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120.760001", value = "经度，浮点型, 小数点后最多保留6位。")

  public String getLongitude() {
    return longitude;
  }


  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  public ActivityShopInfo shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 支付宝侧蚂蚁店铺 id。
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018011900502000000005124744", value = "支付宝侧蚂蚁店铺 id。")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
  }


  public ActivityShopInfo shopName(String shopName) {
    
    this.shopName = shopName;
    return this;
  }

   /**
   * 店铺名称。
   * @return shopName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "肯德基中关村店", value = "店铺名称。")

  public String getShopName() {
    return shopName;
  }


  public void setShopName(String shopName) {
    this.shopName = shopName;
  }


  public ActivityShopInfo shopType(String shopType) {
    
    this.shopType = shopType;
    return this;
  }

   /**
   * 门店类型 PAYMENT_SHOP 支付门店 REAL_SHOP 代运营商业关系门店
   * @return shopType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PAYMENT_SHOP", value = "门店类型 PAYMENT_SHOP 支付门店 REAL_SHOP 代运营商业关系门店")

  public String getShopType() {
    return shopType;
  }


  public void setShopType(String shopType) {
    this.shopType = shopType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityShopInfo activityShopInfo = (ActivityShopInfo) o;
    return Objects.equals(this.latitude, activityShopInfo.latitude) &&
        Objects.equals(this.longitude, activityShopInfo.longitude) &&
        Objects.equals(this.shopId, activityShopInfo.shopId) &&
        Objects.equals(this.shopName, activityShopInfo.shopName) &&
        Objects.equals(this.shopType, activityShopInfo.shopType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, shopId, shopName, shopType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityShopInfo {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
    sb.append("    shopType: ").append(toIndentedString(shopType)).append("\n");
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
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("shop_id");
    openapiFields.add("shop_name");
    openapiFields.add("shop_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActivityShopInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ActivityShopInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActivityShopInfo is not found in the empty JSON string", ActivityShopInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ActivityShopInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActivityShopInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("latitude") != null && !jsonObj.get("latitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latitude").toString()));
      }
      if (jsonObj.get("longitude") != null && !jsonObj.get("longitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `longitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("longitude").toString()));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
      if (jsonObj.get("shop_name") != null && !jsonObj.get("shop_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_name").toString()));
      }
      if (jsonObj.get("shop_type") != null && !jsonObj.get("shop_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActivityShopInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActivityShopInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActivityShopInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActivityShopInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ActivityShopInfo>() {
           @Override
           public void write(JsonWriter out, ActivityShopInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActivityShopInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActivityShopInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActivityShopInfo
  * @throws IOException if the JSON string is invalid with respect to ActivityShopInfo
  */
  public static ActivityShopInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActivityShopInfo.class);
  }

 /**
  * Convert an instance of ActivityShopInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
