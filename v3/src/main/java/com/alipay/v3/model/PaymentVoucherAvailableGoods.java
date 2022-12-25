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
 * PaymentVoucherAvailableGoods
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentVoucherAvailableGoods {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GOODS_DESCRIPTION = "goods_description";
  @SerializedName(SERIALIZED_NAME_GOODS_DESCRIPTION)
  private String goodsDescription;

  public static final String SERIALIZED_NAME_GOODS_IDS = "goods_ids";
  @SerializedName(SERIALIZED_NAME_GOODS_IDS)
  private List<String> goodsIds = null;

  public static final String SERIALIZED_NAME_GOODS_NAME = "goods_name";
  @SerializedName(SERIALIZED_NAME_GOODS_NAME)
  private String goodsName;

  public PaymentVoucherAvailableGoods() { 
  }

  public PaymentVoucherAvailableGoods goodsDescription(String goodsDescription) {
    
    this.goodsDescription = goodsDescription;
    return this;
  }

   /**
   * 商品描述信息。 用于券面展示，向用户介绍商品
   * @return goodsDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "特价手机", value = "商品描述信息。 用于券面展示，向用户介绍商品")

  public String getGoodsDescription() {
    return goodsDescription;
  }


  public void setGoodsDescription(String goodsDescription) {
    this.goodsDescription = goodsDescription;
  }


  public PaymentVoucherAvailableGoods goodsIds(List<String> goodsIds) {
    
    this.goodsIds = goodsIds;
    return this;
  }

  public PaymentVoucherAvailableGoods addGoodsIdsItem(String goodsIdsItem) {
    if (this.goodsIds == null) {
      this.goodsIds = new ArrayList<>();
    }
    this.goodsIds.add(goodsIdsItem);
    return this;
  }

   /**
   * 可优惠商品编码，商家自定义商品编码。当用户支付时，交易中的商品编码和支付券配置的商品编码有任一匹配时，可以使用优惠券。
   * @return goodsIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"apple-01\",\"apple-02\"]", value = "可优惠商品编码，商家自定义商品编码。当用户支付时，交易中的商品编码和支付券配置的商品编码有任一匹配时，可以使用优惠券。")

  public List<String> getGoodsIds() {
    return goodsIds;
  }


  public void setGoodsIds(List<String> goodsIds) {
    this.goodsIds = goodsIds;
  }


  public PaymentVoucherAvailableGoods goodsName(String goodsName) {
    
    this.goodsName = goodsName;
    return this;
  }

   /**
   * 商品名称
   * @return goodsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ipad", value = "商品名称")

  public String getGoodsName() {
    return goodsName;
  }


  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentVoucherAvailableGoods paymentVoucherAvailableGoods = (PaymentVoucherAvailableGoods) o;
    return Objects.equals(this.goodsDescription, paymentVoucherAvailableGoods.goodsDescription) &&
        Objects.equals(this.goodsIds, paymentVoucherAvailableGoods.goodsIds) &&
        Objects.equals(this.goodsName, paymentVoucherAvailableGoods.goodsName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goodsDescription, goodsIds, goodsName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentVoucherAvailableGoods {\n");
    sb.append("    goodsDescription: ").append(toIndentedString(goodsDescription)).append("\n");
    sb.append("    goodsIds: ").append(toIndentedString(goodsIds)).append("\n");
    sb.append("    goodsName: ").append(toIndentedString(goodsName)).append("\n");
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
    openapiFields.add("goods_description");
    openapiFields.add("goods_ids");
    openapiFields.add("goods_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentVoucherAvailableGoods
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentVoucherAvailableGoods.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentVoucherAvailableGoods is not found in the empty JSON string", PaymentVoucherAvailableGoods.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentVoucherAvailableGoods.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentVoucherAvailableGoods` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("goods_description") != null && !jsonObj.get("goods_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_description").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("goods_ids") != null && !jsonObj.get("goods_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_ids` to be an array in the JSON string but got `%s`", jsonObj.get("goods_ids").toString()));
      }
      if (jsonObj.get("goods_name") != null && !jsonObj.get("goods_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentVoucherAvailableGoods.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentVoucherAvailableGoods' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentVoucherAvailableGoods> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentVoucherAvailableGoods.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentVoucherAvailableGoods>() {
           @Override
           public void write(JsonWriter out, PaymentVoucherAvailableGoods value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentVoucherAvailableGoods read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentVoucherAvailableGoods given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentVoucherAvailableGoods
  * @throws IOException if the JSON string is invalid with respect to PaymentVoucherAvailableGoods
  */
  public static PaymentVoucherAvailableGoods fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentVoucherAvailableGoods.class);
  }

 /**
  * Convert an instance of PaymentVoucherAvailableGoods to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

