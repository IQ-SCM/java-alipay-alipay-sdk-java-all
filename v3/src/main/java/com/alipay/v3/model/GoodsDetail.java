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
 * GoodsDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GoodsDetail {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ALIPAY_GOODS_ID = "alipay_goods_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_GOODS_ID)
  private String alipayGoodsId;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CATEGORIES_TREE = "categories_tree";
  @SerializedName(SERIALIZED_NAME_CATEGORIES_TREE)
  private String categoriesTree;

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
  private Integer quantity;

  public static final String SERIALIZED_NAME_SHOW_URL = "show_url";
  @SerializedName(SERIALIZED_NAME_SHOW_URL)
  private String showUrl;

  public GoodsDetail() { 
  }

  public GoodsDetail alipayGoodsId(String alipayGoodsId) {
    
    this.alipayGoodsId = alipayGoodsId;
    return this;
  }

   /**
   * 支付宝定义的统一商品编号
   * @return alipayGoodsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝定义的统一商品编号")

  public String getAlipayGoodsId() {
    return alipayGoodsId;
  }


  public void setAlipayGoodsId(String alipayGoodsId) {
    this.alipayGoodsId = alipayGoodsId;
  }


  public GoodsDetail body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * 商品描述信息
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品描述信息")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public GoodsDetail categoriesTree(String categoriesTree) {
    
    this.categoriesTree = categoriesTree;
    return this;
  }

   /**
   * 商品类目树，从商品类目根节点到叶子节点的类目id组成，类目id值使用|分割
   * @return categoriesTree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品类目树，从商品类目根节点到叶子节点的类目id组成，类目id值使用|分割")

  public String getCategoriesTree() {
    return categoriesTree;
  }


  public void setCategoriesTree(String categoriesTree) {
    this.categoriesTree = categoriesTree;
  }


  public GoodsDetail goodsCategory(String goodsCategory) {
    
    this.goodsCategory = goodsCategory;
    return this;
  }

   /**
   * 商品类目
   * @return goodsCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品类目")

  public String getGoodsCategory() {
    return goodsCategory;
  }


  public void setGoodsCategory(String goodsCategory) {
    this.goodsCategory = goodsCategory;
  }


  public GoodsDetail goodsId(String goodsId) {
    
    this.goodsId = goodsId;
    return this;
  }

   /**
   * 商品的编号
   * @return goodsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品的编号")

  public String getGoodsId() {
    return goodsId;
  }


  public void setGoodsId(String goodsId) {
    this.goodsId = goodsId;
  }


  public GoodsDetail goodsName(String goodsName) {
    
    this.goodsName = goodsName;
    return this;
  }

   /**
   * 商品名称
   * @return goodsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品名称")

  public String getGoodsName() {
    return goodsName;
  }


  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public GoodsDetail price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * 商品单价，单位为元
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品单价，单位为元")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public GoodsDetail quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * 商品数量，支持小数，精确到小数点后两位
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品数量，支持小数，精确到小数点后两位")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public GoodsDetail showUrl(String showUrl) {
    
    this.showUrl = showUrl;
    return this;
  }

   /**
   * 商品的展示地址
   * @return showUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品的展示地址")

  public String getShowUrl() {
    return showUrl;
  }


  public void setShowUrl(String showUrl) {
    this.showUrl = showUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsDetail goodsDetail = (GoodsDetail) o;
    return Objects.equals(this.alipayGoodsId, goodsDetail.alipayGoodsId) &&
        Objects.equals(this.body, goodsDetail.body) &&
        Objects.equals(this.categoriesTree, goodsDetail.categoriesTree) &&
        Objects.equals(this.goodsCategory, goodsDetail.goodsCategory) &&
        Objects.equals(this.goodsId, goodsDetail.goodsId) &&
        Objects.equals(this.goodsName, goodsDetail.goodsName) &&
        Objects.equals(this.price, goodsDetail.price) &&
        Objects.equals(this.quantity, goodsDetail.quantity) &&
        Objects.equals(this.showUrl, goodsDetail.showUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alipayGoodsId, body, categoriesTree, goodsCategory, goodsId, goodsName, price, quantity, showUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsDetail {\n");
    sb.append("    alipayGoodsId: ").append(toIndentedString(alipayGoodsId)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    categoriesTree: ").append(toIndentedString(categoriesTree)).append("\n");
    sb.append("    goodsCategory: ").append(toIndentedString(goodsCategory)).append("\n");
    sb.append("    goodsId: ").append(toIndentedString(goodsId)).append("\n");
    sb.append("    goodsName: ").append(toIndentedString(goodsName)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    showUrl: ").append(toIndentedString(showUrl)).append("\n");
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
    openapiFields.add("alipay_goods_id");
    openapiFields.add("body");
    openapiFields.add("categories_tree");
    openapiFields.add("goods_category");
    openapiFields.add("goods_id");
    openapiFields.add("goods_name");
    openapiFields.add("price");
    openapiFields.add("quantity");
    openapiFields.add("show_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoodsDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GoodsDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoodsDetail is not found in the empty JSON string", GoodsDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GoodsDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoodsDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("alipay_goods_id") != null && !jsonObj.get("alipay_goods_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_goods_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_goods_id").toString()));
      }
      if (jsonObj.get("body") != null && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if (jsonObj.get("categories_tree") != null && !jsonObj.get("categories_tree").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories_tree` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categories_tree").toString()));
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
      if (jsonObj.get("show_url") != null && !jsonObj.get("show_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `show_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("show_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoodsDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoodsDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoodsDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoodsDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<GoodsDetail>() {
           @Override
           public void write(JsonWriter out, GoodsDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoodsDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GoodsDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoodsDetail
  * @throws IOException if the JSON string is invalid with respect to GoodsDetail
  */
  public static GoodsDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoodsDetail.class);
  }

 /**
  * Convert an instance of GoodsDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

