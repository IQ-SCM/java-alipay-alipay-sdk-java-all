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
 * VoucherSendRuleDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherSendRuleDetail {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NATURAL_PERSON_LIMIT = "natural_person_limit";
  @SerializedName(SERIALIZED_NAME_NATURAL_PERSON_LIMIT)
  private Boolean naturalPersonLimit;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_LIMIT = "phone_number_limit";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_LIMIT)
  private Boolean phoneNumberLimit;

  public static final String SERIALIZED_NAME_VOUCHER_QUANTITY = "voucher_quantity";
  @SerializedName(SERIALIZED_NAME_VOUCHER_QUANTITY)
  private Integer voucherQuantity;

  public static final String SERIALIZED_NAME_VOUCHER_QUANTITY_LIMIT_PER_USER = "voucher_quantity_limit_per_user";
  @SerializedName(SERIALIZED_NAME_VOUCHER_QUANTITY_LIMIT_PER_USER)
  private Integer voucherQuantityLimitPerUser;

  public VoucherSendRuleDetail() { 
  }

  public VoucherSendRuleDetail naturalPersonLimit(Boolean naturalPersonLimit) {
    
    this.naturalPersonLimit = naturalPersonLimit;
    return this;
  }

   /**
   * 是否开启自然人领取限制。自然人表示按照身份证纬度进行领取限制。
   * @return naturalPersonLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否开启自然人领取限制。自然人表示按照身份证纬度进行领取限制。")

  public Boolean getNaturalPersonLimit() {
    return naturalPersonLimit;
  }


  public void setNaturalPersonLimit(Boolean naturalPersonLimit) {
    this.naturalPersonLimit = naturalPersonLimit;
  }


  public VoucherSendRuleDetail phoneNumberLimit(Boolean phoneNumberLimit) {
    
    this.phoneNumberLimit = phoneNumberLimit;
    return this;
  }

   /**
   * 是否开启电话号码领取限制。
   * @return phoneNumberLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否开启电话号码领取限制。")

  public Boolean getPhoneNumberLimit() {
    return phoneNumberLimit;
  }


  public void setPhoneNumberLimit(Boolean phoneNumberLimit) {
    this.phoneNumberLimit = phoneNumberLimit;
  }


  public VoucherSendRuleDetail voucherQuantity(Integer voucherQuantity) {
    
    this.voucherQuantity = voucherQuantity;
    return this;
  }

   /**
   * 发行券的数量。
   * @return voucherQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发行券的数量。")

  public Integer getVoucherQuantity() {
    return voucherQuantity;
  }


  public void setVoucherQuantity(Integer voucherQuantity) {
    this.voucherQuantity = voucherQuantity;
  }


  public VoucherSendRuleDetail voucherQuantityLimitPerUser(Integer voucherQuantityLimitPerUser) {
    
    this.voucherQuantityLimitPerUser = voucherQuantityLimitPerUser;
    return this;
  }

   /**
   * 每人领取限制。默认按照支付宝uid进行领取限制; 不填写或填入0，默认没有领取限制。
   * @return voucherQuantityLimitPerUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "每人领取限制。默认按照支付宝uid进行领取限制; 不填写或填入0，默认没有领取限制。")

  public Integer getVoucherQuantityLimitPerUser() {
    return voucherQuantityLimitPerUser;
  }


  public void setVoucherQuantityLimitPerUser(Integer voucherQuantityLimitPerUser) {
    this.voucherQuantityLimitPerUser = voucherQuantityLimitPerUser;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherSendRuleDetail voucherSendRuleDetail = (VoucherSendRuleDetail) o;
    return Objects.equals(this.naturalPersonLimit, voucherSendRuleDetail.naturalPersonLimit) &&
        Objects.equals(this.phoneNumberLimit, voucherSendRuleDetail.phoneNumberLimit) &&
        Objects.equals(this.voucherQuantity, voucherSendRuleDetail.voucherQuantity) &&
        Objects.equals(this.voucherQuantityLimitPerUser, voucherSendRuleDetail.voucherQuantityLimitPerUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(naturalPersonLimit, phoneNumberLimit, voucherQuantity, voucherQuantityLimitPerUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherSendRuleDetail {\n");
    sb.append("    naturalPersonLimit: ").append(toIndentedString(naturalPersonLimit)).append("\n");
    sb.append("    phoneNumberLimit: ").append(toIndentedString(phoneNumberLimit)).append("\n");
    sb.append("    voucherQuantity: ").append(toIndentedString(voucherQuantity)).append("\n");
    sb.append("    voucherQuantityLimitPerUser: ").append(toIndentedString(voucherQuantityLimitPerUser)).append("\n");
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
    openapiFields.add("natural_person_limit");
    openapiFields.add("phone_number_limit");
    openapiFields.add("voucher_quantity");
    openapiFields.add("voucher_quantity_limit_per_user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherSendRuleDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherSendRuleDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherSendRuleDetail is not found in the empty JSON string", VoucherSendRuleDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherSendRuleDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherSendRuleDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherSendRuleDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherSendRuleDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherSendRuleDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherSendRuleDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherSendRuleDetail>() {
           @Override
           public void write(JsonWriter out, VoucherSendRuleDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherSendRuleDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherSendRuleDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherSendRuleDetail
  * @throws IOException if the JSON string is invalid with respect to VoucherSendRuleDetail
  */
  public static VoucherSendRuleDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherSendRuleDetail.class);
  }

 /**
  * Convert an instance of VoucherSendRuleDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
