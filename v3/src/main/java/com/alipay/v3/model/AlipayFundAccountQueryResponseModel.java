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
import com.alipay.v3.model.ExtCardInfo;
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
 * AlipayFundAccountQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundAccountQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AVAILABLE_AMOUNT = "available_amount";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_AMOUNT)
  private String availableAmount;

  public static final String SERIALIZED_NAME_EXT_CARD_INFO = "ext_card_info";
  @SerializedName(SERIALIZED_NAME_EXT_CARD_INFO)
  private ExtCardInfo extCardInfo;

  public static final String SERIALIZED_NAME_FREEZE_AMOUNT = "freeze_amount";
  @SerializedName(SERIALIZED_NAME_FREEZE_AMOUNT)
  private String freezeAmount;

  public AlipayFundAccountQueryResponseModel() { 
  }

  public AlipayFundAccountQueryResponseModel availableAmount(String availableAmount) {
    
    this.availableAmount = availableAmount;
    return this;
  }

   /**
   * 账户可用余额，单位元，精确到小数点后两位。
   * @return availableAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "26.45", value = "账户可用余额，单位元，精确到小数点后两位。")

  public String getAvailableAmount() {
    return availableAmount;
  }


  public void setAvailableAmount(String availableAmount) {
    this.availableAmount = availableAmount;
  }


  public AlipayFundAccountQueryResponseModel extCardInfo(ExtCardInfo extCardInfo) {
    
    this.extCardInfo = extCardInfo;
    return this;
  }

   /**
   * Get extCardInfo
   * @return extCardInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExtCardInfo getExtCardInfo() {
    return extCardInfo;
  }


  public void setExtCardInfo(ExtCardInfo extCardInfo) {
    this.extCardInfo = extCardInfo;
  }


  public AlipayFundAccountQueryResponseModel freezeAmount(String freezeAmount) {
    
    this.freezeAmount = freezeAmount;
    return this;
  }

   /**
   * 当前支付宝账户的实时冻结余额
   * @return freezeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11.11", value = "当前支付宝账户的实时冻结余额")

  public String getFreezeAmount() {
    return freezeAmount;
  }


  public void setFreezeAmount(String freezeAmount) {
    this.freezeAmount = freezeAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundAccountQueryResponseModel alipayFundAccountQueryResponseModel = (AlipayFundAccountQueryResponseModel) o;
    return Objects.equals(this.availableAmount, alipayFundAccountQueryResponseModel.availableAmount) &&
        Objects.equals(this.extCardInfo, alipayFundAccountQueryResponseModel.extCardInfo) &&
        Objects.equals(this.freezeAmount, alipayFundAccountQueryResponseModel.freezeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableAmount, extCardInfo, freezeAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundAccountQueryResponseModel {\n");
    sb.append("    availableAmount: ").append(toIndentedString(availableAmount)).append("\n");
    sb.append("    extCardInfo: ").append(toIndentedString(extCardInfo)).append("\n");
    sb.append("    freezeAmount: ").append(toIndentedString(freezeAmount)).append("\n");
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
    openapiFields.add("available_amount");
    openapiFields.add("ext_card_info");
    openapiFields.add("freeze_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundAccountQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundAccountQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundAccountQueryResponseModel is not found in the empty JSON string", AlipayFundAccountQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundAccountQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundAccountQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("available_amount") != null && !jsonObj.get("available_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available_amount").toString()));
      }
      // validate the optional field `ext_card_info`
      if (jsonObj.getAsJsonObject("ext_card_info") != null) {
        ExtCardInfo.validateJsonObject(jsonObj.getAsJsonObject("ext_card_info"));
      }
      if (jsonObj.get("freeze_amount") != null && !jsonObj.get("freeze_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `freeze_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("freeze_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundAccountQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundAccountQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundAccountQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundAccountQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundAccountQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundAccountQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundAccountQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundAccountQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundAccountQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundAccountQueryResponseModel
  */
  public static AlipayFundAccountQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundAccountQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundAccountQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

