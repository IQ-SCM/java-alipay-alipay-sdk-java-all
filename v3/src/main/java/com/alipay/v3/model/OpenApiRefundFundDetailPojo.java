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
 * OpenApiRefundFundDetailPojo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OpenApiRefundFundDetailPojo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FUNDS = "funds";
  @SerializedName(SERIALIZED_NAME_FUNDS)
  private List<String> funds = null;

  public static final String SERIALIZED_NAME_TRANS_IN = "trans_in";
  @SerializedName(SERIALIZED_NAME_TRANS_IN)
  private String transIn;

  public static final String SERIALIZED_NAME_TRANS_IN_TYPE = "trans_in_type";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_TYPE)
  private String transInType;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public OpenApiRefundFundDetailPojo() { 
  }

  public OpenApiRefundFundDetailPojo funds(List<String> funds) {
    
    this.funds = funds;
    return this;
  }

  public OpenApiRefundFundDetailPojo addFundsItem(String fundsItem) {
    if (this.funds == null) {
      this.funds = new ArrayList<>();
    }
    this.funds.add(fundsItem);
    return this;
  }

   /**
   * 退款资金明细  详：  若type为paySerialNo则funds为  [{\&quot;paySerialNo\&quot;:\&quot;支付流水1\&quot;,\&quot;refundFee\&quot;:\&quot;退款金额1\&quot;},{\&quot;paySerialNo\&quot;:\&quot;支付流水2\&quot;,\&quot;refundFee\&quot;:\&quot;退款金额2\&quot;}]
   * @return funds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"paySerialNo\":\"2018081603020111\",refundFee:\"12.00\"},{\"paySerialNo\":\"2018081603020112\",refundFee:\"2.00\"}]", value = "退款资金明细  详：  若type为paySerialNo则funds为  [{\"paySerialNo\":\"支付流水1\",\"refundFee\":\"退款金额1\"},{\"paySerialNo\":\"支付流水2\",\"refundFee\":\"退款金额2\"}]")

  public List<String> getFunds() {
    return funds;
  }


  public void setFunds(List<String> funds) {
    this.funds = funds;
  }


  public OpenApiRefundFundDetailPojo transIn(String transIn) {
    
    this.transIn = transIn;
    return this;
  }

   /**
   * 收入方账户  为空则原路退回
   * @return transIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101126708402", value = "收入方账户  为空则原路退回")

  public String getTransIn() {
    return transIn;
  }


  public void setTransIn(String transIn) {
    this.transIn = transIn;
  }


  public OpenApiRefundFundDetailPojo transInType(String transInType) {
    
    this.transInType = transInType;
    return this;
  }

   /**
   * 收入方账户类型
   * @return transInType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bankAccount", value = "收入方账户类型")

  public String getTransInType() {
    return transInType;
  }


  public void setTransInType(String transInType) {
    this.transInType = transInType;
  }


  public OpenApiRefundFundDetailPojo type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 描述资金明细类型  详：若type为paySerialNo  则funds参数中体现的都为对应支付流水的退款明细
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "paySerialNo", value = "描述资金明细类型  详：若type为paySerialNo  则funds参数中体现的都为对应支付流水的退款明细")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiRefundFundDetailPojo openApiRefundFundDetailPojo = (OpenApiRefundFundDetailPojo) o;
    return Objects.equals(this.funds, openApiRefundFundDetailPojo.funds) &&
        Objects.equals(this.transIn, openApiRefundFundDetailPojo.transIn) &&
        Objects.equals(this.transInType, openApiRefundFundDetailPojo.transInType) &&
        Objects.equals(this.type, openApiRefundFundDetailPojo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(funds, transIn, transInType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiRefundFundDetailPojo {\n");
    sb.append("    funds: ").append(toIndentedString(funds)).append("\n");
    sb.append("    transIn: ").append(toIndentedString(transIn)).append("\n");
    sb.append("    transInType: ").append(toIndentedString(transInType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("funds");
    openapiFields.add("trans_in");
    openapiFields.add("trans_in_type");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OpenApiRefundFundDetailPojo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OpenApiRefundFundDetailPojo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenApiRefundFundDetailPojo is not found in the empty JSON string", OpenApiRefundFundDetailPojo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OpenApiRefundFundDetailPojo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OpenApiRefundFundDetailPojo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("funds") != null && !jsonObj.get("funds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `funds` to be an array in the JSON string but got `%s`", jsonObj.get("funds").toString()));
      }
      if (jsonObj.get("trans_in") != null && !jsonObj.get("trans_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in").toString()));
      }
      if (jsonObj.get("trans_in_type") != null && !jsonObj.get("trans_in_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_type").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenApiRefundFundDetailPojo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenApiRefundFundDetailPojo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenApiRefundFundDetailPojo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenApiRefundFundDetailPojo.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenApiRefundFundDetailPojo>() {
           @Override
           public void write(JsonWriter out, OpenApiRefundFundDetailPojo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenApiRefundFundDetailPojo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpenApiRefundFundDetailPojo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenApiRefundFundDetailPojo
  * @throws IOException if the JSON string is invalid with respect to OpenApiRefundFundDetailPojo
  */
  public static OpenApiRefundFundDetailPojo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenApiRefundFundDetailPojo.class);
  }

 /**
  * Convert an instance of OpenApiRefundFundDetailPojo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

