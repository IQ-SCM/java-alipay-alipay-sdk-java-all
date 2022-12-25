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
 * SpuInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpuInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_SPU_ID = "spu_id";
  @SerializedName(SERIALIZED_NAME_SPU_ID)
  private String spuId;

  public SpuInfo() { 
  }

  public SpuInfo brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * 品牌名称
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "壳牌", value = "品牌名称")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public SpuInfo category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * 类目
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "美妆", value = "类目")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public SpuInfo count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * 商品数量
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "商品数量")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public SpuInfo icon(String icon) {
    
    this.icon = icon;
    return this;
  }

   /**
   * 图片链接
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://baidu.com/imge/dfadf.jpg", value = "图片链接")

  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    this.icon = icon;
  }


  public SpuInfo price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * 商品单价
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23", value = "商品单价")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public SpuInfo provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * 商品提供方，店铺或品牌方
   * @return provider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XX店铺", value = "商品提供方，店铺或品牌方")

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  public SpuInfo spuId(String spuId) {
    
    this.spuId = spuId;
    return this;
  }

   /**
   * 商品ID
   * @return spuId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "spu12141239912", value = "商品ID")

  public String getSpuId() {
    return spuId;
  }


  public void setSpuId(String spuId) {
    this.spuId = spuId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpuInfo spuInfo = (SpuInfo) o;
    return Objects.equals(this.brand, spuInfo.brand) &&
        Objects.equals(this.category, spuInfo.category) &&
        Objects.equals(this.count, spuInfo.count) &&
        Objects.equals(this.icon, spuInfo.icon) &&
        Objects.equals(this.price, spuInfo.price) &&
        Objects.equals(this.provider, spuInfo.provider) &&
        Objects.equals(this.spuId, spuInfo.spuId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, category, count, icon, price, provider, spuId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpuInfo {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    spuId: ").append(toIndentedString(spuId)).append("\n");
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
    openapiFields.add("brand");
    openapiFields.add("category");
    openapiFields.add("count");
    openapiFields.add("icon");
    openapiFields.add("price");
    openapiFields.add("provider");
    openapiFields.add("spu_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SpuInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SpuInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpuInfo is not found in the empty JSON string", SpuInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SpuInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SpuInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
      if (jsonObj.get("provider") != null && !jsonObj.get("provider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider").toString()));
      }
      if (jsonObj.get("spu_id") != null && !jsonObj.get("spu_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spu_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spu_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpuInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpuInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpuInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpuInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SpuInfo>() {
           @Override
           public void write(JsonWriter out, SpuInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SpuInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SpuInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpuInfo
  * @throws IOException if the JSON string is invalid with respect to SpuInfo
  */
  public static SpuInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpuInfo.class);
  }

 /**
  * Convert an instance of SpuInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

