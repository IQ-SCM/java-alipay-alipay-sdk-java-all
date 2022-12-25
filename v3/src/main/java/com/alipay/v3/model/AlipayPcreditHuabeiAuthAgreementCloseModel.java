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
 * AlipayPcreditHuabeiAuthAgreementCloseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayPcreditHuabeiAuthAgreementCloseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_ALIPAY_USER_ID = "alipay_user_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_USER_ID)
  private String alipayUserId;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_QUIT_TYPE = "quit_type";
  @SerializedName(SERIALIZED_NAME_QUIT_TYPE)
  private String quitType;

  public AlipayPcreditHuabeiAuthAgreementCloseModel() { 
  }

  public AlipayPcreditHuabeiAuthAgreementCloseModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 花芝协议号，支付宝系统中用以唯一标识用户签约记录的编号，即花芝协议号。
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20195609549841482443", value = "花芝协议号，支付宝系统中用以唯一标识用户签约记录的编号，即花芝协议号。")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayPcreditHuabeiAuthAgreementCloseModel alipayUserId(String alipayUserId) {
    
    this.alipayUserId = alipayUserId;
    return this;
  }

   /**
   * 买家在支付宝的用户id
   * @return alipayUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101117955611", value = "买家在支付宝的用户id")

  public String getAlipayUserId() {
    return alipayUserId;
  }


  public void setAlipayUserId(String alipayUserId) {
    this.alipayUserId = alipayUserId;
  }


  public AlipayPcreditHuabeiAuthAgreementCloseModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 买家在支付宝的用户id
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "买家在支付宝的用户id")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayPcreditHuabeiAuthAgreementCloseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 外部请求号
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019080910020821390001569835", value = "外部请求号")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayPcreditHuabeiAuthAgreementCloseModel partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 商户ID
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101117955611", value = "商户ID")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public AlipayPcreditHuabeiAuthAgreementCloseModel quitType(String quitType) {
    
    this.quitType = quitType;
    return this;
  }

   /**
   * 用户主动意愿退出：USER_CANCEL_QUIT; 商户结算退出：SETTLE_APPLY_QUIT; 默认值为SETTLE_APPLY_QUIT；这个字段会影响用户在芝麻信用合约的状态
   * @return quitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SETTLE_APPLY_QUIT", value = "用户主动意愿退出：USER_CANCEL_QUIT; 商户结算退出：SETTLE_APPLY_QUIT; 默认值为SETTLE_APPLY_QUIT；这个字段会影响用户在芝麻信用合约的状态")

  public String getQuitType() {
    return quitType;
  }


  public void setQuitType(String quitType) {
    this.quitType = quitType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayPcreditHuabeiAuthAgreementCloseModel alipayPcreditHuabeiAuthAgreementCloseModel = (AlipayPcreditHuabeiAuthAgreementCloseModel) o;
    return Objects.equals(this.agreementNo, alipayPcreditHuabeiAuthAgreementCloseModel.agreementNo) &&
        Objects.equals(this.alipayUserId, alipayPcreditHuabeiAuthAgreementCloseModel.alipayUserId) &&
        Objects.equals(this.openId, alipayPcreditHuabeiAuthAgreementCloseModel.openId) &&
        Objects.equals(this.outRequestNo, alipayPcreditHuabeiAuthAgreementCloseModel.outRequestNo) &&
        Objects.equals(this.partnerId, alipayPcreditHuabeiAuthAgreementCloseModel.partnerId) &&
        Objects.equals(this.quitType, alipayPcreditHuabeiAuthAgreementCloseModel.quitType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementNo, alipayUserId, openId, outRequestNo, partnerId, quitType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayPcreditHuabeiAuthAgreementCloseModel {\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    alipayUserId: ").append(toIndentedString(alipayUserId)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    quitType: ").append(toIndentedString(quitType)).append("\n");
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
    openapiFields.add("alipay_user_id");
    openapiFields.add("open_id");
    openapiFields.add("out_request_no");
    openapiFields.add("partner_id");
    openapiFields.add("quit_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayPcreditHuabeiAuthAgreementCloseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayPcreditHuabeiAuthAgreementCloseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayPcreditHuabeiAuthAgreementCloseModel is not found in the empty JSON string", AlipayPcreditHuabeiAuthAgreementCloseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayPcreditHuabeiAuthAgreementCloseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayPcreditHuabeiAuthAgreementCloseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("alipay_user_id") != null && !jsonObj.get("alipay_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_user_id").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("partner_id") != null && !jsonObj.get("partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_id").toString()));
      }
      if (jsonObj.get("quit_type") != null && !jsonObj.get("quit_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quit_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quit_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayPcreditHuabeiAuthAgreementCloseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayPcreditHuabeiAuthAgreementCloseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayPcreditHuabeiAuthAgreementCloseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayPcreditHuabeiAuthAgreementCloseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayPcreditHuabeiAuthAgreementCloseModel>() {
           @Override
           public void write(JsonWriter out, AlipayPcreditHuabeiAuthAgreementCloseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayPcreditHuabeiAuthAgreementCloseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayPcreditHuabeiAuthAgreementCloseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayPcreditHuabeiAuthAgreementCloseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayPcreditHuabeiAuthAgreementCloseModel
  */
  public static AlipayPcreditHuabeiAuthAgreementCloseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayPcreditHuabeiAuthAgreementCloseModel.class);
  }

 /**
  * Convert an instance of AlipayPcreditHuabeiAuthAgreementCloseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

