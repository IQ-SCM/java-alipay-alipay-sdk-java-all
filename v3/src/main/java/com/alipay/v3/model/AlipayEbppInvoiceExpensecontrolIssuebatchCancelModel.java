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
 * AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_ISSUE_BATCH_ID = "issue_batch_id";
  @SerializedName(SERIALIZED_NAME_ISSUE_BATCH_ID)
  private String issueBatchId;

  public AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel() { 
  }

  public AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户id - 适用于在企业码小程序创建的共同账户，和agreement_no搭配使用
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "共同账户id - 适用于在企业码小程序创建的共同账户，和agreement_no搭配使用")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号，可通过签约消息获取。配合企业共同账户id使用，当填写企业共同账户id时，此字段必填。
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20215425001112341234", value = "授权签约协议号，可通过签约消息获取。配合企业共同账户id使用，当填写企业共同账户id时，此字段必填。")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业ID - 适用于在企业码PC端创建的企业账号
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业ID - 适用于在企业码PC端创建的企业账号")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * 制度id
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022070500152608330000012007", value = "制度id")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel issueBatchId(String issueBatchId) {
    
    this.issueBatchId = issueBatchId;
    return this;
  }

   /**
   * 发放批次id
   * @return issueBatchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022062800152622440000009966", value = "发放批次id")

  public String getIssueBatchId() {
    return issueBatchId;
  }


  public void setIssueBatchId(String issueBatchId) {
    this.issueBatchId = issueBatchId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel alipayEbppInvoiceExpensecontrolIssuebatchCancelModel = (AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceExpensecontrolIssuebatchCancelModel.accountId) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceExpensecontrolIssuebatchCancelModel.agreementNo) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceExpensecontrolIssuebatchCancelModel.enterpriseId) &&
        Objects.equals(this.institutionId, alipayEbppInvoiceExpensecontrolIssuebatchCancelModel.institutionId) &&
        Objects.equals(this.issueBatchId, alipayEbppInvoiceExpensecontrolIssuebatchCancelModel.issueBatchId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, enterpriseId, institutionId, issueBatchId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    issueBatchId: ").append(toIndentedString(issueBatchId)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("agreement_no");
    openapiFields.add("enterprise_id");
    openapiFields.add("institution_id");
    openapiFields.add("issue_batch_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel is not found in the empty JSON string", AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("institution_id") != null && !jsonObj.get("institution_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_id").toString()));
      }
      if (jsonObj.get("issue_batch_id") != null && !jsonObj.get("issue_batch_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_batch_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_batch_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel
  */
  public static AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
