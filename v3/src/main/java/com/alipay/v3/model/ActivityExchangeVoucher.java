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
 * ActivityExchangeVoucher
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ActivityExchangeVoucher {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_FLOOR_AMOUNT = "floor_amount";
  @SerializedName(SERIALIZED_NAME_FLOOR_AMOUNT)
  private String floorAmount;

  public static final String SERIALIZED_NAME_OVERDUE_REFUNDABLE = "overdue_refundable";
  @SerializedName(SERIALIZED_NAME_OVERDUE_REFUNDABLE)
  private Boolean overdueRefundable;

  public static final String SERIALIZED_NAME_REFUNDABLE = "refundable";
  @SerializedName(SERIALIZED_NAME_REFUNDABLE)
  private Boolean refundable;

  public static final String SERIALIZED_NAME_SALE_AMOUNT = "sale_amount";
  @SerializedName(SERIALIZED_NAME_SALE_AMOUNT)
  private String saleAmount;

  public ActivityExchangeVoucher() { 
  }

  public ActivityExchangeVoucher amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 券的价值。
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券的价值。")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ActivityExchangeVoucher floorAmount(String floorAmount) {
    
    this.floorAmount = floorAmount;
    return this;
  }

   /**
   * 优惠门槛金额，表示只有当订单金额大于等于门槛金额时券才能使用。该字段为空时表示无门槛。 门槛金额的校验由服务商(商户)核销时自行校验，支付宝侧只做展示使用。 币种为人民币，单位为元。小数点以后最多保留两位。 设置门槛：取值范围:0.1&lt;&#x3D;x&lt;&#x3D; 50000。如果设置了门槛金额，则必须大于等于0.1，不可以等于0。
   * @return floorAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "优惠门槛金额，表示只有当订单金额大于等于门槛金额时券才能使用。该字段为空时表示无门槛。 门槛金额的校验由服务商(商户)核销时自行校验，支付宝侧只做展示使用。 币种为人民币，单位为元。小数点以后最多保留两位。 设置门槛：取值范围:0.1<=x<= 50000。如果设置了门槛金额，则必须大于等于0.1，不可以等于0。")

  public String getFloorAmount() {
    return floorAmount;
  }


  public void setFloorAmount(String floorAmount) {
    this.floorAmount = floorAmount;
  }


  public ActivityExchangeVoucher overdueRefundable(Boolean overdueRefundable) {
    
    this.overdueRefundable = overdueRefundable;
    return this;
  }

   /**
   * 是否支持优惠券过期后，自动退款给用户。 不填默认否，枚举值： true：是 false：否 自动退款功能需要服务商在优惠券过期时，主动调用alipay.marketing.activity.order.refund接口进行退款。 如果配置优惠券时选择了过期自动退款，但是实际券过期后，服务商没有进行退款，那么用户投诉后，需要服务商进行解决。
   * @return overdueRefundable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否支持优惠券过期后，自动退款给用户。 不填默认否，枚举值： true：是 false：否 自动退款功能需要服务商在优惠券过期时，主动调用alipay.marketing.activity.order.refund接口进行退款。 如果配置优惠券时选择了过期自动退款，但是实际券过期后，服务商没有进行退款，那么用户投诉后，需要服务商进行解决。")

  public Boolean getOverdueRefundable() {
    return overdueRefundable;
  }


  public void setOverdueRefundable(Boolean overdueRefundable) {
    this.overdueRefundable = overdueRefundable;
  }


  public ActivityExchangeVoucher refundable(Boolean refundable) {
    
    this.refundable = refundable;
    return this;
  }

   /**
   * 购买的优惠券是否允许退款。 不填默认否，枚举值： true：是 false：否
   * @return refundable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "购买的优惠券是否允许退款。 不填默认否，枚举值： true：是 false：否")

  public Boolean getRefundable() {
    return refundable;
  }


  public void setRefundable(Boolean refundable) {
    this.refundable = refundable;
  }


  public ActivityExchangeVoucher saleAmount(String saleAmount) {
    
    this.saleAmount = saleAmount;
    return this;
  }

   /**
   * 用户购买优惠券需要支付的金额。
   * @return saleAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户购买优惠券需要支付的金额。")

  public String getSaleAmount() {
    return saleAmount;
  }


  public void setSaleAmount(String saleAmount) {
    this.saleAmount = saleAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityExchangeVoucher activityExchangeVoucher = (ActivityExchangeVoucher) o;
    return Objects.equals(this.amount, activityExchangeVoucher.amount) &&
        Objects.equals(this.floorAmount, activityExchangeVoucher.floorAmount) &&
        Objects.equals(this.overdueRefundable, activityExchangeVoucher.overdueRefundable) &&
        Objects.equals(this.refundable, activityExchangeVoucher.refundable) &&
        Objects.equals(this.saleAmount, activityExchangeVoucher.saleAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, floorAmount, overdueRefundable, refundable, saleAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityExchangeVoucher {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    floorAmount: ").append(toIndentedString(floorAmount)).append("\n");
    sb.append("    overdueRefundable: ").append(toIndentedString(overdueRefundable)).append("\n");
    sb.append("    refundable: ").append(toIndentedString(refundable)).append("\n");
    sb.append("    saleAmount: ").append(toIndentedString(saleAmount)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("floor_amount");
    openapiFields.add("overdue_refundable");
    openapiFields.add("refundable");
    openapiFields.add("sale_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActivityExchangeVoucher
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ActivityExchangeVoucher.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActivityExchangeVoucher is not found in the empty JSON string", ActivityExchangeVoucher.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ActivityExchangeVoucher.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActivityExchangeVoucher` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("floor_amount") != null && !jsonObj.get("floor_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `floor_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("floor_amount").toString()));
      }
      if (jsonObj.get("sale_amount") != null && !jsonObj.get("sale_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sale_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sale_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActivityExchangeVoucher.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActivityExchangeVoucher' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActivityExchangeVoucher> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActivityExchangeVoucher.class));

       return (TypeAdapter<T>) new TypeAdapter<ActivityExchangeVoucher>() {
           @Override
           public void write(JsonWriter out, ActivityExchangeVoucher value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActivityExchangeVoucher read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActivityExchangeVoucher given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActivityExchangeVoucher
  * @throws IOException if the JSON string is invalid with respect to ActivityExchangeVoucher
  */
  public static ActivityExchangeVoucher fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActivityExchangeVoucher.class);
  }

 /**
  * Convert an instance of ActivityExchangeVoucher to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
