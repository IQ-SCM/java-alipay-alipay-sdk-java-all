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
 * GoodsInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GoodsInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GOODS_CATEGORY = "goods_category";
  @SerializedName(SERIALIZED_NAME_GOODS_CATEGORY)
  private String goodsCategory;

  public static final String SERIALIZED_NAME_GOODS_ID = "goods_id";
  @SerializedName(SERIALIZED_NAME_GOODS_ID)
  private String goodsId;

  public static final String SERIALIZED_NAME_GOODS_NAME = "goods_name";
  @SerializedName(SERIALIZED_NAME_GOODS_NAME)
  private String goodsName;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private String quantity;

  public GoodsInfo() { 
  }

  public GoodsInfo goodsCategory(String goodsCategory) {
    
    this.goodsCategory = goodsCategory;
    return this;
  }

   /**
   * 商品类目
   * @return goodsCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201701000", value = "商品类目")

  public String getGoodsCategory() {
    return goodsCategory;
  }


  public void setGoodsCategory(String goodsCategory) {
    this.goodsCategory = goodsCategory;
  }


  public GoodsInfo goodsId(String goodsId) {
    
    this.goodsId = goodsId;
    return this;
  }

   /**
   * 商户自定义商品外部编号
   * @return goodsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "apple-01", value = "商户自定义商品外部编号")

  public String getGoodsId() {
    return goodsId;
  }


  public void setGoodsId(String goodsId) {
    this.goodsId = goodsId;
  }


  public GoodsInfo goodsName(String goodsName) {
    
    this.goodsName = goodsName;
    return this;
  }

   /**
   * 商户自定义商品名称
   * @return goodsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "苹果手机", value = "商户自定义商品名称")

  public String getGoodsName() {
    return goodsName;
  }


  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public GoodsInfo price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * 商品单价，单位元,精确到小数点后两位，取值范围[0.01,100000000]
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.00", value = "商品单价，单位元,精确到小数点后两位，取值范围[0.01,100000000]")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public GoodsInfo quantity(String quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * 商品数量,支持小数，但是小数位不能超过两位
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "商品数量,支持小数，但是小数位不能超过两位")

  public String getQuantity() {
    return quantity;
  }


  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsInfo goodsInfo = (GoodsInfo) o;
    return Objects.equals(this.goodsCategory, goodsInfo.goodsCategory) &&
        Objects.equals(this.goodsId, goodsInfo.goodsId) &&
        Objects.equals(this.goodsName, goodsInfo.goodsName) &&
        Objects.equals(this.price, goodsInfo.price) &&
        Objects.equals(this.quantity, goodsInfo.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goodsCategory, goodsId, goodsName, price, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsInfo {\n");
    sb.append("    goodsCategory: ").append(toIndentedString(goodsCategory)).append("\n");
    sb.append("    goodsId: ").append(toIndentedString(goodsId)).append("\n");
    sb.append("    goodsName: ").append(toIndentedString(goodsName)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
    openapiFields.add("goods_category");
    openapiFields.add("goods_id");
    openapiFields.add("goods_name");
    openapiFields.add("price");
    openapiFields.add("quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoodsInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GoodsInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoodsInfo is not found in the empty JSON string", GoodsInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GoodsInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoodsInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("goods_category") != null && !jsonObj.get("goods_category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_category").toString()));
      }
      if (jsonObj.get("goods_id") != null && !jsonObj.get("goods_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_id").toString()));
      }
      if (jsonObj.get("goods_name") != null && !jsonObj.get("goods_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_name").toString()));
      }
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
      if (jsonObj.get("quantity") != null && !jsonObj.get("quantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantity").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoodsInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoodsInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoodsInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoodsInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoodsInfo>() {
           @Override
           public void write(JsonWriter out, GoodsInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoodsInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GoodsInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoodsInfo
  * @throws IOException if the JSON string is invalid with respect to GoodsInfo
  */
  public static GoodsInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoodsInfo.class);
  }

 /**
  * Convert an instance of GoodsInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
