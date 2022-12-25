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
 * AlipayOpenServicemarketCommodityShopOnlineModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenServicemarketCommodityShopOnlineModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COMMODITY_ID = "commodity_id";
  @SerializedName(SERIALIZED_NAME_COMMODITY_ID)
  private String commodityId;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public AlipayOpenServicemarketCommodityShopOnlineModel() { 
  }

  public AlipayOpenServicemarketCommodityShopOnlineModel commodityId(String commodityId) {
    
    this.commodityId = commodityId;
    return this;
  }

   /**
   * 服务插件ID
   * @return commodityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201511020002630060", value = "服务插件ID")

  public String getCommodityId() {
    return commodityId;
  }


  public void setCommodityId(String commodityId) {
    this.commodityId = commodityId;
  }


  public AlipayOpenServicemarketCommodityShopOnlineModel shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 店铺ID
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015052000077000000000182140", value = "店铺ID")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenServicemarketCommodityShopOnlineModel alipayOpenServicemarketCommodityShopOnlineModel = (AlipayOpenServicemarketCommodityShopOnlineModel) o;
    return Objects.equals(this.commodityId, alipayOpenServicemarketCommodityShopOnlineModel.commodityId) &&
        Objects.equals(this.shopId, alipayOpenServicemarketCommodityShopOnlineModel.shopId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commodityId, shopId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenServicemarketCommodityShopOnlineModel {\n");
    sb.append("    commodityId: ").append(toIndentedString(commodityId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
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
    openapiFields.add("commodity_id");
    openapiFields.add("shop_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenServicemarketCommodityShopOnlineModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenServicemarketCommodityShopOnlineModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenServicemarketCommodityShopOnlineModel is not found in the empty JSON string", AlipayOpenServicemarketCommodityShopOnlineModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenServicemarketCommodityShopOnlineModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenServicemarketCommodityShopOnlineModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("commodity_id") != null && !jsonObj.get("commodity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commodity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commodity_id").toString()));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenServicemarketCommodityShopOnlineModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenServicemarketCommodityShopOnlineModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenServicemarketCommodityShopOnlineModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenServicemarketCommodityShopOnlineModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenServicemarketCommodityShopOnlineModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenServicemarketCommodityShopOnlineModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenServicemarketCommodityShopOnlineModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenServicemarketCommodityShopOnlineModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenServicemarketCommodityShopOnlineModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenServicemarketCommodityShopOnlineModel
  */
  public static AlipayOpenServicemarketCommodityShopOnlineModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenServicemarketCommodityShopOnlineModel.class);
  }

 /**
  * Convert an instance of AlipayOpenServicemarketCommodityShopOnlineModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

