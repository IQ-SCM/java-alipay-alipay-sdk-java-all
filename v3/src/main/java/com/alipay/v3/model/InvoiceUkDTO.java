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
 * InvoiceUkDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InvoiceUkDTO {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_INVOICE_CODE = "invoice_code";
  @SerializedName(SERIALIZED_NAME_INVOICE_CODE)
  private String invoiceCode;

  public static final String SERIALIZED_NAME_INVOICE_NO = "invoice_no";
  @SerializedName(SERIALIZED_NAME_INVOICE_NO)
  private String invoiceNo;

  public InvoiceUkDTO() { 
  }

  public InvoiceUkDTO invoiceCode(String invoiceCode) {
    
    this.invoiceCode = invoiceCode;
    return this;
  }

   /**
   * 发票代码
   * @return invoiceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票代码")

  public String getInvoiceCode() {
    return invoiceCode;
  }


  public void setInvoiceCode(String invoiceCode) {
    this.invoiceCode = invoiceCode;
  }


  public InvoiceUkDTO invoiceNo(String invoiceNo) {
    
    this.invoiceNo = invoiceNo;
    return this;
  }

   /**
   * 发票号码
   * @return invoiceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票号码")

  public String getInvoiceNo() {
    return invoiceNo;
  }


  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceUkDTO invoiceUkDTO = (InvoiceUkDTO) o;
    return Objects.equals(this.invoiceCode, invoiceUkDTO.invoiceCode) &&
        Objects.equals(this.invoiceNo, invoiceUkDTO.invoiceNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceCode, invoiceNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceUkDTO {\n");
    sb.append("    invoiceCode: ").append(toIndentedString(invoiceCode)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
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
    openapiFields.add("invoice_code");
    openapiFields.add("invoice_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceUkDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InvoiceUkDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceUkDTO is not found in the empty JSON string", InvoiceUkDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InvoiceUkDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceUkDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("invoice_code") != null && !jsonObj.get("invoice_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_code").toString()));
      }
      if (jsonObj.get("invoice_no") != null && !jsonObj.get("invoice_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceUkDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceUkDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceUkDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceUkDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceUkDTO>() {
           @Override
           public void write(JsonWriter out, InvoiceUkDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceUkDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceUkDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceUkDTO
  * @throws IOException if the JSON string is invalid with respect to InvoiceUkDTO
  */
  public static InvoiceUkDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceUkDTO.class);
  }

 /**
  * Convert an instance of InvoiceUkDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
