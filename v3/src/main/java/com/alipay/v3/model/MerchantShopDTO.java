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
 * MerchantShopDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantShopDTO {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SHOP_NAME = "shop_name";
  @SerializedName(SERIALIZED_NAME_SHOP_NAME)
  private String shopName;

  public static final String SERIALIZED_NAME_SHOP_NO = "shop_no";
  @SerializedName(SERIALIZED_NAME_SHOP_NO)
  private String shopNo;

  public MerchantShopDTO() { 
  }

  public MerchantShopDTO shopName(String shopName) {
    
    this.shopName = shopName;
    return this;
  }

   /**
   * 门店名称，最长不超过256个字符。
   * @return shopName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "门店1", value = "门店名称，最长不超过256个字符。")

  public String getShopName() {
    return shopName;
  }


  public void setShopName(String shopName) {
    this.shopName = shopName;
  }


  public MerchantShopDTO shopNo(String shopNo) {
    
    this.shopNo = shopNo;
    return this;
  }

   /**
   * 门店编号。
   * @return shopNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "门店编号。")

  public String getShopNo() {
    return shopNo;
  }


  public void setShopNo(String shopNo) {
    this.shopNo = shopNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantShopDTO merchantShopDTO = (MerchantShopDTO) o;
    return Objects.equals(this.shopName, merchantShopDTO.shopName) &&
        Objects.equals(this.shopNo, merchantShopDTO.shopNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopName, shopNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantShopDTO {\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
    sb.append("    shopNo: ").append(toIndentedString(shopNo)).append("\n");
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
    openapiFields.add("shop_name");
    openapiFields.add("shop_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantShopDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MerchantShopDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantShopDTO is not found in the empty JSON string", MerchantShopDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MerchantShopDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerchantShopDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("shop_name") != null && !jsonObj.get("shop_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_name").toString()));
      }
      if (jsonObj.get("shop_no") != null && !jsonObj.get("shop_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantShopDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantShopDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantShopDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantShopDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantShopDTO>() {
           @Override
           public void write(JsonWriter out, MerchantShopDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantShopDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerchantShopDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantShopDTO
  * @throws IOException if the JSON string is invalid with respect to MerchantShopDTO
  */
  public static MerchantShopDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantShopDTO.class);
  }

 /**
  * Convert an instance of MerchantShopDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

