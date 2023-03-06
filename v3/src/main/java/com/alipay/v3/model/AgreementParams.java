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
 * AgreementParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AgreementParams {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_APPLY_TOKEN = "apply_token";
  @SerializedName(SERIALIZED_NAME_APPLY_TOKEN)
  private String applyToken;

  public static final String SERIALIZED_NAME_AUTH_CONFIRM_NO = "auth_confirm_no";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIRM_NO)
  private String authConfirmNo;

  public static final String SERIALIZED_NAME_DEDUCT_PERMISSION = "deduct_permission";
  @SerializedName(SERIALIZED_NAME_DEDUCT_PERMISSION)
  private String deductPermission;

  public AgreementParams() { 
  }

  public AgreementParams agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170322450983769228", value = "支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AgreementParams applyToken(String applyToken) {
    
    this.applyToken = applyToken;
    return this;
  }

   /**
   * 鉴权申请token，其格式和内容，由支付宝定义。在需要做支付鉴权校验时，该参数不能为空。
   * @return applyToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MDEDUCT0068292ca377d1d44b65fa24ec9cd89132f", value = "鉴权申请token，其格式和内容，由支付宝定义。在需要做支付鉴权校验时，该参数不能为空。")

  public String getApplyToken() {
    return applyToken;
  }


  public void setApplyToken(String applyToken) {
    this.applyToken = applyToken;
  }


  public AgreementParams authConfirmNo(String authConfirmNo) {
    
    this.authConfirmNo = authConfirmNo;
    return this;
  }

   /**
   * 鉴权确认码，在需要做支付鉴权校验时，该参数不能为空
   * @return authConfirmNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "423979", value = "鉴权确认码，在需要做支付鉴权校验时，该参数不能为空")

  public String getAuthConfirmNo() {
    return authConfirmNo;
  }


  public void setAuthConfirmNo(String authConfirmNo) {
    this.authConfirmNo = authConfirmNo;
  }


  public AgreementParams deductPermission(String deductPermission) {
    
    this.deductPermission = deductPermission;
    return this;
  }

   /**
   * 商户代扣扣款许可
   * @return deductPermission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021571176714791277815457854545", value = "商户代扣扣款许可")

  public String getDeductPermission() {
    return deductPermission;
  }


  public void setDeductPermission(String deductPermission) {
    this.deductPermission = deductPermission;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgreementParams agreementParams = (AgreementParams) o;
    return Objects.equals(this.agreementNo, agreementParams.agreementNo) &&
        Objects.equals(this.applyToken, agreementParams.applyToken) &&
        Objects.equals(this.authConfirmNo, agreementParams.authConfirmNo) &&
        Objects.equals(this.deductPermission, agreementParams.deductPermission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementNo, applyToken, authConfirmNo, deductPermission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementParams {\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    applyToken: ").append(toIndentedString(applyToken)).append("\n");
    sb.append("    authConfirmNo: ").append(toIndentedString(authConfirmNo)).append("\n");
    sb.append("    deductPermission: ").append(toIndentedString(deductPermission)).append("\n");
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
    openapiFields.add("apply_token");
    openapiFields.add("auth_confirm_no");
    openapiFields.add("deduct_permission");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AgreementParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AgreementParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgreementParams is not found in the empty JSON string", AgreementParams.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AgreementParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AgreementParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("apply_token") != null && !jsonObj.get("apply_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_token").toString()));
      }
      if (jsonObj.get("auth_confirm_no") != null && !jsonObj.get("auth_confirm_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_confirm_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_confirm_no").toString()));
      }
      if (jsonObj.get("deduct_permission") != null && !jsonObj.get("deduct_permission").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deduct_permission` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deduct_permission").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgreementParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgreementParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgreementParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgreementParams.class));

       return (TypeAdapter<T>) new TypeAdapter<AgreementParams>() {
           @Override
           public void write(JsonWriter out, AgreementParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgreementParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgreementParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgreementParams
  * @throws IOException if the JSON string is invalid with respect to AgreementParams
  */
  public static AgreementParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgreementParams.class);
  }

 /**
  * Convert an instance of AgreementParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
