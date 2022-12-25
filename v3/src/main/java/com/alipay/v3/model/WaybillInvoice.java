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
 * WaybillInvoice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WaybillInvoice {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_WAYBILL_AMOUNT = "waybill_amount";
  @SerializedName(SERIALIZED_NAME_WAYBILL_AMOUNT)
  private String waybillAmount;

  public static final String SERIALIZED_NAME_WAYBILL_NO = "waybill_no";
  @SerializedName(SERIALIZED_NAME_WAYBILL_NO)
  private String waybillNo;

  public WaybillInvoice() { 
  }

  public WaybillInvoice waybillAmount(String waybillAmount) {
    
    this.waybillAmount = waybillAmount;
    return this;
  }

   /**
   * 即时配送运单金额
   * @return waybillAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "即时配送运单金额")

  public String getWaybillAmount() {
    return waybillAmount;
  }


  public void setWaybillAmount(String waybillAmount) {
    this.waybillAmount = waybillAmount;
  }


  public WaybillInvoice waybillNo(String waybillNo) {
    
    this.waybillNo = waybillNo;
    return this;
  }

   /**
   * 即时配送运单编号
   * @return waybillNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "waybill_no_00001", value = "即时配送运单编号")

  public String getWaybillNo() {
    return waybillNo;
  }


  public void setWaybillNo(String waybillNo) {
    this.waybillNo = waybillNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaybillInvoice waybillInvoice = (WaybillInvoice) o;
    return Objects.equals(this.waybillAmount, waybillInvoice.waybillAmount) &&
        Objects.equals(this.waybillNo, waybillInvoice.waybillNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waybillAmount, waybillNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaybillInvoice {\n");
    sb.append("    waybillAmount: ").append(toIndentedString(waybillAmount)).append("\n");
    sb.append("    waybillNo: ").append(toIndentedString(waybillNo)).append("\n");
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
    openapiFields.add("waybill_amount");
    openapiFields.add("waybill_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WaybillInvoice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WaybillInvoice.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WaybillInvoice is not found in the empty JSON string", WaybillInvoice.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WaybillInvoice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WaybillInvoice` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("waybill_amount") != null && !jsonObj.get("waybill_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `waybill_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("waybill_amount").toString()));
      }
      if (jsonObj.get("waybill_no") != null && !jsonObj.get("waybill_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `waybill_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("waybill_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WaybillInvoice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WaybillInvoice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WaybillInvoice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WaybillInvoice.class));

       return (TypeAdapter<T>) new TypeAdapter<WaybillInvoice>() {
           @Override
           public void write(JsonWriter out, WaybillInvoice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WaybillInvoice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WaybillInvoice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WaybillInvoice
  * @throws IOException if the JSON string is invalid with respect to WaybillInvoice
  */
  public static WaybillInvoice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WaybillInvoice.class);
  }

 /**
  * Convert an instance of WaybillInvoice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

