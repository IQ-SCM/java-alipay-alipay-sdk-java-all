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
 * PaymentVoucherBelongMerchantInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentVoucherBelongMerchantInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_MERCHANT_ID_TYPE = "merchant_id_type";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID_TYPE)
  private String merchantIdType;

  public PaymentVoucherBelongMerchantInfo() { 
  }

  public PaymentVoucherBelongMerchantInfo merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * 商户支付宝id，默认品牌名和品牌logo将从该商户信息中获取
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户支付宝id，默认品牌名和品牌logo将从该商户信息中获取")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public PaymentVoucherBelongMerchantInfo merchantIdType(String merchantIdType) {
    
    this.merchantIdType = merchantIdType;
    return this;
  }

   /**
   * 商户id类型。  若传入的类型为直连商户则必须签约当面付且当前接口调用者与商户存在代运营关系 当类型为SMID时表示为某个间连商户配券，但是券的归属者属于当前接口调用人。 枚举值 SMID 间连商户 PID 直连商户
   * @return merchantIdType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户id类型。  若传入的类型为直连商户则必须签约当面付且当前接口调用者与商户存在代运营关系 当类型为SMID时表示为某个间连商户配券，但是券的归属者属于当前接口调用人。 枚举值 SMID 间连商户 PID 直连商户")

  public String getMerchantIdType() {
    return merchantIdType;
  }


  public void setMerchantIdType(String merchantIdType) {
    this.merchantIdType = merchantIdType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentVoucherBelongMerchantInfo paymentVoucherBelongMerchantInfo = (PaymentVoucherBelongMerchantInfo) o;
    return Objects.equals(this.merchantId, paymentVoucherBelongMerchantInfo.merchantId) &&
        Objects.equals(this.merchantIdType, paymentVoucherBelongMerchantInfo.merchantIdType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, merchantIdType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentVoucherBelongMerchantInfo {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    merchantIdType: ").append(toIndentedString(merchantIdType)).append("\n");
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
    openapiFields.add("merchant_id");
    openapiFields.add("merchant_id_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentVoucherBelongMerchantInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentVoucherBelongMerchantInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentVoucherBelongMerchantInfo is not found in the empty JSON string", PaymentVoucherBelongMerchantInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentVoucherBelongMerchantInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentVoucherBelongMerchantInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
      if (jsonObj.get("merchant_id_type") != null && !jsonObj.get("merchant_id_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentVoucherBelongMerchantInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentVoucherBelongMerchantInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentVoucherBelongMerchantInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentVoucherBelongMerchantInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentVoucherBelongMerchantInfo>() {
           @Override
           public void write(JsonWriter out, PaymentVoucherBelongMerchantInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentVoucherBelongMerchantInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentVoucherBelongMerchantInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentVoucherBelongMerchantInfo
  * @throws IOException if the JSON string is invalid with respect to PaymentVoucherBelongMerchantInfo
  */
  public static PaymentVoucherBelongMerchantInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentVoucherBelongMerchantInfo.class);
  }

 /**
  * Convert an instance of PaymentVoucherBelongMerchantInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
