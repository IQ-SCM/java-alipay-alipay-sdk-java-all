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
 * AlipayUserAgreementExecutionplanModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayUserAgreementExecutionplanModifyModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_DEDUCT_TIME = "deduct_time";
  @SerializedName(SERIALIZED_NAME_DEDUCT_TIME)
  private String deductTime;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public AlipayUserAgreementExecutionplanModifyModel() { 
  }

  public AlipayUserAgreementExecutionplanModifyModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 周期性扣款产品，授权免密支付协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20185909000458725113", value = "周期性扣款产品，授权免密支付协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayUserAgreementExecutionplanModifyModel deductTime(String deductTime) {
    
    this.deductTime = deductTime;
    return this;
  }

   /**
   * 商户下一次扣款时间
   * @return deductTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-05-12", value = "商户下一次扣款时间")

  public String getDeductTime() {
    return deductTime;
  }


  public void setDeductTime(String deductTime) {
    this.deductTime = deductTime;
  }


  public AlipayUserAgreementExecutionplanModifyModel memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 具体修改原因
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "用户已购买半年包，需延期扣款时间", value = "具体修改原因")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayUserAgreementExecutionplanModifyModel alipayUserAgreementExecutionplanModifyModel = (AlipayUserAgreementExecutionplanModifyModel) o;
    return Objects.equals(this.agreementNo, alipayUserAgreementExecutionplanModifyModel.agreementNo) &&
        Objects.equals(this.deductTime, alipayUserAgreementExecutionplanModifyModel.deductTime) &&
        Objects.equals(this.memo, alipayUserAgreementExecutionplanModifyModel.memo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementNo, deductTime, memo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayUserAgreementExecutionplanModifyModel {\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    deductTime: ").append(toIndentedString(deductTime)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
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
    openapiFields.add("agreement_no");
    openapiFields.add("deduct_time");
    openapiFields.add("memo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayUserAgreementExecutionplanModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayUserAgreementExecutionplanModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayUserAgreementExecutionplanModifyModel is not found in the empty JSON string", AlipayUserAgreementExecutionplanModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayUserAgreementExecutionplanModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayUserAgreementExecutionplanModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("deduct_time") != null && !jsonObj.get("deduct_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deduct_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deduct_time").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayUserAgreementExecutionplanModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayUserAgreementExecutionplanModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayUserAgreementExecutionplanModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayUserAgreementExecutionplanModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayUserAgreementExecutionplanModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayUserAgreementExecutionplanModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayUserAgreementExecutionplanModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayUserAgreementExecutionplanModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayUserAgreementExecutionplanModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayUserAgreementExecutionplanModifyModel
  */
  public static AlipayUserAgreementExecutionplanModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayUserAgreementExecutionplanModifyModel.class);
  }

 /**
  * Convert an instance of AlipayUserAgreementExecutionplanModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

