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
import com.alipay.v3.model.CustomerDefineDeductRule;
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
 * DeductInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeductInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CUSTOMER_DEFINE_DEDUCT_RULE = "customer_define_deduct_rule";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_DEFINE_DEDUCT_RULE)
  private CustomerDefineDeductRule customerDefineDeductRule;

  public DeductInfo() { 
  }

  public DeductInfo customerDefineDeductRule(CustomerDefineDeductRule customerDefineDeductRule) {
    
    this.customerDefineDeductRule = customerDefineDeductRule;
    return this;
  }

   /**
   * Get customerDefineDeductRule
   * @return customerDefineDeductRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomerDefineDeductRule getCustomerDefineDeductRule() {
    return customerDefineDeductRule;
  }


  public void setCustomerDefineDeductRule(CustomerDefineDeductRule customerDefineDeductRule) {
    this.customerDefineDeductRule = customerDefineDeductRule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeductInfo deductInfo = (DeductInfo) o;
    return Objects.equals(this.customerDefineDeductRule, deductInfo.customerDefineDeductRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerDefineDeductRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeductInfo {\n");
    sb.append("    customerDefineDeductRule: ").append(toIndentedString(customerDefineDeductRule)).append("\n");
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
    openapiFields.add("customer_define_deduct_rule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeductInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeductInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeductInfo is not found in the empty JSON string", DeductInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeductInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeductInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `customer_define_deduct_rule`
      if (jsonObj.getAsJsonObject("customer_define_deduct_rule") != null) {
        CustomerDefineDeductRule.validateJsonObject(jsonObj.getAsJsonObject("customer_define_deduct_rule"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeductInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeductInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeductInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeductInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DeductInfo>() {
           @Override
           public void write(JsonWriter out, DeductInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeductInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeductInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeductInfo
  * @throws IOException if the JSON string is invalid with respect to DeductInfo
  */
  public static DeductInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeductInfo.class);
  }

 /**
  * Convert an instance of DeductInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

