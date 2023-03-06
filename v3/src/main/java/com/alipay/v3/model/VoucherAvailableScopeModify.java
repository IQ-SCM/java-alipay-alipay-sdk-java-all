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
import com.alipay.v3.model.OrderVoucherAvailableCityCodeModify;
import com.alipay.v3.model.OrderVoucherAvailableShopModify;
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
 * VoucherAvailableScopeModify
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherAvailableScopeModify {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MODIFY_TYPE = "modify_type";
  @SerializedName(SERIALIZED_NAME_MODIFY_TYPE)
  private String modifyType;

  public static final String SERIALIZED_NAME_ORDER_VOUCHER_AVAILABLE_CITY_CODE = "order_voucher_available_city_code";
  @SerializedName(SERIALIZED_NAME_ORDER_VOUCHER_AVAILABLE_CITY_CODE)
  private OrderVoucherAvailableCityCodeModify orderVoucherAvailableCityCode;

  public static final String SERIALIZED_NAME_ORDER_VOUCHER_AVAILABLE_SHOP = "order_voucher_available_shop";
  @SerializedName(SERIALIZED_NAME_ORDER_VOUCHER_AVAILABLE_SHOP)
  private OrderVoucherAvailableShopModify orderVoucherAvailableShop;

  public VoucherAvailableScopeModify() { 
  }

  public VoucherAvailableScopeModify modifyType(String modifyType) {
    
    this.modifyType = modifyType;
    return this;
  }

   /**
   * 可用范围修改类型。
   * @return modifyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ADD", value = "可用范围修改类型。")

  public String getModifyType() {
    return modifyType;
  }


  public void setModifyType(String modifyType) {
    this.modifyType = modifyType;
  }


  public VoucherAvailableScopeModify orderVoucherAvailableCityCode(OrderVoucherAvailableCityCodeModify orderVoucherAvailableCityCode) {
    
    this.orderVoucherAvailableCityCode = orderVoucherAvailableCityCode;
    return this;
  }

   /**
   * Get orderVoucherAvailableCityCode
   * @return orderVoucherAvailableCityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderVoucherAvailableCityCodeModify getOrderVoucherAvailableCityCode() {
    return orderVoucherAvailableCityCode;
  }


  public void setOrderVoucherAvailableCityCode(OrderVoucherAvailableCityCodeModify orderVoucherAvailableCityCode) {
    this.orderVoucherAvailableCityCode = orderVoucherAvailableCityCode;
  }


  public VoucherAvailableScopeModify orderVoucherAvailableShop(OrderVoucherAvailableShopModify orderVoucherAvailableShop) {
    
    this.orderVoucherAvailableShop = orderVoucherAvailableShop;
    return this;
  }

   /**
   * Get orderVoucherAvailableShop
   * @return orderVoucherAvailableShop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderVoucherAvailableShopModify getOrderVoucherAvailableShop() {
    return orderVoucherAvailableShop;
  }


  public void setOrderVoucherAvailableShop(OrderVoucherAvailableShopModify orderVoucherAvailableShop) {
    this.orderVoucherAvailableShop = orderVoucherAvailableShop;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherAvailableScopeModify voucherAvailableScopeModify = (VoucherAvailableScopeModify) o;
    return Objects.equals(this.modifyType, voucherAvailableScopeModify.modifyType) &&
        Objects.equals(this.orderVoucherAvailableCityCode, voucherAvailableScopeModify.orderVoucherAvailableCityCode) &&
        Objects.equals(this.orderVoucherAvailableShop, voucherAvailableScopeModify.orderVoucherAvailableShop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifyType, orderVoucherAvailableCityCode, orderVoucherAvailableShop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherAvailableScopeModify {\n");
    sb.append("    modifyType: ").append(toIndentedString(modifyType)).append("\n");
    sb.append("    orderVoucherAvailableCityCode: ").append(toIndentedString(orderVoucherAvailableCityCode)).append("\n");
    sb.append("    orderVoucherAvailableShop: ").append(toIndentedString(orderVoucherAvailableShop)).append("\n");
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
    openapiFields.add("modify_type");
    openapiFields.add("order_voucher_available_city_code");
    openapiFields.add("order_voucher_available_shop");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherAvailableScopeModify
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherAvailableScopeModify.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherAvailableScopeModify is not found in the empty JSON string", VoucherAvailableScopeModify.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherAvailableScopeModify.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherAvailableScopeModify` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("modify_type") != null && !jsonObj.get("modify_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modify_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modify_type").toString()));
      }
      // validate the optional field `order_voucher_available_city_code`
      if (jsonObj.getAsJsonObject("order_voucher_available_city_code") != null) {
        OrderVoucherAvailableCityCodeModify.validateJsonObject(jsonObj.getAsJsonObject("order_voucher_available_city_code"));
      }
      // validate the optional field `order_voucher_available_shop`
      if (jsonObj.getAsJsonObject("order_voucher_available_shop") != null) {
        OrderVoucherAvailableShopModify.validateJsonObject(jsonObj.getAsJsonObject("order_voucher_available_shop"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherAvailableScopeModify.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherAvailableScopeModify' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherAvailableScopeModify> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherAvailableScopeModify.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherAvailableScopeModify>() {
           @Override
           public void write(JsonWriter out, VoucherAvailableScopeModify value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherAvailableScopeModify read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherAvailableScopeModify given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherAvailableScopeModify
  * @throws IOException if the JSON string is invalid with respect to VoucherAvailableScopeModify
  */
  public static VoucherAvailableScopeModify fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherAvailableScopeModify.class);
  }

 /**
  * Convert an instance of VoucherAvailableScopeModify to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
