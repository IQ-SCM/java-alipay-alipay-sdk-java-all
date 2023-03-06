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
import com.alipay.v3.model.SubMerchant;
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
 * BatchRoyaltyDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BatchRoyaltyDetail {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_DESC = "error_desc";
  @SerializedName(SERIALIZED_NAME_ERROR_DESC)
  private String errorDesc;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TRANS_IN_ACCOUNT_ID = "trans_in_account_id";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_ACCOUNT_ID)
  private String transInAccountId;

  public static final String SERIALIZED_NAME_TRANS_IN_ACCOUNT_ID_TYPE = "trans_in_account_id_type";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_ACCOUNT_ID_TYPE)
  private String transInAccountIdType;

  public static final String SERIALIZED_NAME_TRANS_IN_ACCOUNT_OPEN_ID = "trans_in_account_open_id";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_ACCOUNT_OPEN_ID)
  private String transInAccountOpenId;

  public static final String SERIALIZED_NAME_TRANS_IN_ACCOUNT_TYPE = "trans_in_account_type";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_ACCOUNT_TYPE)
  private String transInAccountType;

  public static final String SERIALIZED_NAME_TRANS_IN_ENTITY_ID = "trans_in_entity_id";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_ENTITY_ID)
  private String transInEntityId;

  public static final String SERIALIZED_NAME_TRANS_IN_ENTITY_TYPE = "trans_in_entity_type";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_ENTITY_TYPE)
  private String transInEntityType;

  public static final String SERIALIZED_NAME_TRANS_IN_SUB_MERCHANT = "trans_in_sub_merchant";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_SUB_MERCHANT)
  private SubMerchant transInSubMerchant;

  public static final String SERIALIZED_NAME_TRANS_OUT_ENTITY_ID = "trans_out_entity_id";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT_ENTITY_ID)
  private String transOutEntityId;

  public static final String SERIALIZED_NAME_TRANS_OUT_ENTITY_TYPE = "trans_out_entity_type";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT_ENTITY_TYPE)
  private String transOutEntityType;

  public static final String SERIALIZED_NAME_TRANS_OUT_SUB_MERCHANT = "trans_out_sub_merchant";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT_SUB_MERCHANT)
  private SubMerchant transOutSubMerchant;

  public BatchRoyaltyDetail() { 
  }

  public BatchRoyaltyDetail amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 分账金额，单位元
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.00", value = "分账金额，单位元")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public BatchRoyaltyDetail desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 分账描述
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "分账给xxxxx", value = "分账描述")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public BatchRoyaltyDetail errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 错误编码 BANK_CARD_ERROR：银行卡信息有误的场景，系统自动重试中 BANK_DISHONOR：银行退票
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BANK_DISHONOR", value = "错误编码 BANK_CARD_ERROR：银行卡信息有误的场景，系统自动重试中 BANK_DISHONOR：银行退票")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public BatchRoyaltyDetail errorDesc(String errorDesc) {
    
    this.errorDesc = errorDesc;
    return this;
  }

   /**
   * 错误描述
   * @return errorDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "账号与户名不一致", value = "错误描述")

  public String getErrorDesc() {
    return errorDesc;
  }


  public void setErrorDesc(String errorDesc) {
    this.errorDesc = errorDesc;
  }


  public BatchRoyaltyDetail status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * ACCEPT_SUCCESS：受理成功； SUCCESS：结算成功； FAIL：结算失败；FAIL_RETRY：失败重试。
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACCEPT_SUCCESS", value = "ACCEPT_SUCCESS：受理成功； SUCCESS：结算成功； FAIL：结算失败；FAIL_RETRY：失败重试。")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public BatchRoyaltyDetail transInAccountId(String transInAccountId) {
    
    this.transInAccountId = transInAccountId;
    return this;
  }

   /**
   * 分账转入账户id。当分账账户id类型是cardSerialNo时，本参数为用户在支付宝绑定的卡编号；当分账账户id类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号；当分账账户id类型是loginName时，本参数为用户的支付宝登录号。
   * @return transInAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101126708402", value = "分账转入账户id。当分账账户id类型是cardSerialNo时，本参数为用户在支付宝绑定的卡编号；当分账账户id类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号；当分账账户id类型是loginName时，本参数为用户的支付宝登录号。")

  public String getTransInAccountId() {
    return transInAccountId;
  }


  public void setTransInAccountId(String transInAccountId) {
    this.transInAccountId = transInAccountId;
  }


  public BatchRoyaltyDetail transInAccountIdType(String transInAccountIdType) {
    
    this.transInAccountIdType = transInAccountIdType;
    return this;
  }

   /**
   * 分账转入账户id类型。 当settle_account_type 为bankCard时，本参数为cardSerialNo，表示分账账户id是银行卡编号; 当settle_account_type 为alipayBalance时，本参数为userId或者loginName，其中userId表示分账账户id是支付宝唯一用户号，loginName表示分账账户id是支付宝登录号。
   * @return transInAccountIdType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cardSerialNo", value = "分账转入账户id类型。 当settle_account_type 为bankCard时，本参数为cardSerialNo，表示分账账户id是银行卡编号; 当settle_account_type 为alipayBalance时，本参数为userId或者loginName，其中userId表示分账账户id是支付宝唯一用户号，loginName表示分账账户id是支付宝登录号。")

  public String getTransInAccountIdType() {
    return transInAccountIdType;
  }


  public void setTransInAccountIdType(String transInAccountIdType) {
    this.transInAccountIdType = transInAccountIdType;
  }


  public BatchRoyaltyDetail transInAccountOpenId(String transInAccountOpenId) {
    
    this.transInAccountOpenId = transInAccountOpenId;
    return this;
  }

   /**
   * 分账转入方的OpenId，OpenId是用户在应用（AppId）下的唯一用户标识。
   * @return transInAccountOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "095PJtAPYb2UkQ0mXk_X86Z_Pd7PtySKX-U3zUEwONcu3wc", value = "分账转入方的OpenId，OpenId是用户在应用（AppId）下的唯一用户标识。")

  public String getTransInAccountOpenId() {
    return transInAccountOpenId;
  }


  public void setTransInAccountOpenId(String transInAccountOpenId) {
    this.transInAccountOpenId = transInAccountOpenId;
  }


  public BatchRoyaltyDetail transInAccountType(String transInAccountType) {
    
    this.transInAccountType = transInAccountType;
    return this;
  }

   /**
   * 分账账户类型。 bankCard: 分账账户为银行卡； alipayBalance: 分账账户为支付宝余额户
   * @return transInAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipayBalance", value = "分账账户类型。 bankCard: 分账账户为银行卡； alipayBalance: 分账账户为支付宝余额户")

  public String getTransInAccountType() {
    return transInAccountType;
  }


  public void setTransInAccountType(String transInAccountType) {
    this.transInAccountType = transInAccountType;
  }


  public BatchRoyaltyDetail transInEntityId(String transInEntityId) {
    
    this.transInEntityId = transInEntityId;
    return this;
  }

   /**
   * 分账转出主体账号。    当分账转出主体类型为SecondMerchant，本参数为二级商户的SecondMerchantID    当分账转出类型为Store，本参数为StoreID
   * @return transInEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000069652893", value = "分账转出主体账号。    当分账转出主体类型为SecondMerchant，本参数为二级商户的SecondMerchantID    当分账转出类型为Store，本参数为StoreID")

  public String getTransInEntityId() {
    return transInEntityId;
  }


  public void setTransInEntityId(String transInEntityId) {
    this.transInEntityId = transInEntityId;
  }


  public BatchRoyaltyDetail transInEntityType(String transInEntityType) {
    
    this.transInEntityType = transInEntityType;
    return this;
  }

   /**
   * 分账转入主体类型。 SecondMerchant：分账转入主体为二级商户    Store: 结算门店
   * @return transInEntityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Store", value = "分账转入主体类型。 SecondMerchant：分账转入主体为二级商户    Store: 结算门店")

  public String getTransInEntityType() {
    return transInEntityType;
  }


  public void setTransInEntityType(String transInEntityType) {
    this.transInEntityType = transInEntityType;
  }


  public BatchRoyaltyDetail transInSubMerchant(SubMerchant transInSubMerchant) {
    
    this.transInSubMerchant = transInSubMerchant;
    return this;
  }

   /**
   * Get transInSubMerchant
   * @return transInSubMerchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubMerchant getTransInSubMerchant() {
    return transInSubMerchant;
  }


  public void setTransInSubMerchant(SubMerchant transInSubMerchant) {
    this.transInSubMerchant = transInSubMerchant;
  }


  public BatchRoyaltyDetail transOutEntityId(String transOutEntityId) {
    
    this.transOutEntityId = transOutEntityId;
    return this;
  }

   /**
   * 分账转出主体账号。    当分账转出主体类型为SecondMerchant，本参数为二级商户的SecondMerchantID    当分账转出类型为Store，本参数为StoreID
   * @return transOutEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000069652893", value = "分账转出主体账号。    当分账转出主体类型为SecondMerchant，本参数为二级商户的SecondMerchantID    当分账转出类型为Store，本参数为StoreID")

  public String getTransOutEntityId() {
    return transOutEntityId;
  }


  public void setTransOutEntityId(String transOutEntityId) {
    this.transOutEntityId = transOutEntityId;
  }


  public BatchRoyaltyDetail transOutEntityType(String transOutEntityType) {
    
    this.transOutEntityType = transOutEntityType;
    return this;
  }

   /**
   * 分账转出主体类型。 SecondMerchant：结算主体为二级商户，Store：结算主体为门店。
   * @return transOutEntityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SecondMerchant", value = "分账转出主体类型。 SecondMerchant：结算主体为二级商户，Store：结算主体为门店。")

  public String getTransOutEntityType() {
    return transOutEntityType;
  }


  public void setTransOutEntityType(String transOutEntityType) {
    this.transOutEntityType = transOutEntityType;
  }


  public BatchRoyaltyDetail transOutSubMerchant(SubMerchant transOutSubMerchant) {
    
    this.transOutSubMerchant = transOutSubMerchant;
    return this;
  }

   /**
   * Get transOutSubMerchant
   * @return transOutSubMerchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubMerchant getTransOutSubMerchant() {
    return transOutSubMerchant;
  }


  public void setTransOutSubMerchant(SubMerchant transOutSubMerchant) {
    this.transOutSubMerchant = transOutSubMerchant;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRoyaltyDetail batchRoyaltyDetail = (BatchRoyaltyDetail) o;
    return Objects.equals(this.amount, batchRoyaltyDetail.amount) &&
        Objects.equals(this.desc, batchRoyaltyDetail.desc) &&
        Objects.equals(this.errorCode, batchRoyaltyDetail.errorCode) &&
        Objects.equals(this.errorDesc, batchRoyaltyDetail.errorDesc) &&
        Objects.equals(this.status, batchRoyaltyDetail.status) &&
        Objects.equals(this.transInAccountId, batchRoyaltyDetail.transInAccountId) &&
        Objects.equals(this.transInAccountIdType, batchRoyaltyDetail.transInAccountIdType) &&
        Objects.equals(this.transInAccountOpenId, batchRoyaltyDetail.transInAccountOpenId) &&
        Objects.equals(this.transInAccountType, batchRoyaltyDetail.transInAccountType) &&
        Objects.equals(this.transInEntityId, batchRoyaltyDetail.transInEntityId) &&
        Objects.equals(this.transInEntityType, batchRoyaltyDetail.transInEntityType) &&
        Objects.equals(this.transInSubMerchant, batchRoyaltyDetail.transInSubMerchant) &&
        Objects.equals(this.transOutEntityId, batchRoyaltyDetail.transOutEntityId) &&
        Objects.equals(this.transOutEntityType, batchRoyaltyDetail.transOutEntityType) &&
        Objects.equals(this.transOutSubMerchant, batchRoyaltyDetail.transOutSubMerchant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, desc, errorCode, errorDesc, status, transInAccountId, transInAccountIdType, transInAccountOpenId, transInAccountType, transInEntityId, transInEntityType, transInSubMerchant, transOutEntityId, transOutEntityType, transOutSubMerchant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRoyaltyDetail {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDesc: ").append(toIndentedString(errorDesc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transInAccountId: ").append(toIndentedString(transInAccountId)).append("\n");
    sb.append("    transInAccountIdType: ").append(toIndentedString(transInAccountIdType)).append("\n");
    sb.append("    transInAccountOpenId: ").append(toIndentedString(transInAccountOpenId)).append("\n");
    sb.append("    transInAccountType: ").append(toIndentedString(transInAccountType)).append("\n");
    sb.append("    transInEntityId: ").append(toIndentedString(transInEntityId)).append("\n");
    sb.append("    transInEntityType: ").append(toIndentedString(transInEntityType)).append("\n");
    sb.append("    transInSubMerchant: ").append(toIndentedString(transInSubMerchant)).append("\n");
    sb.append("    transOutEntityId: ").append(toIndentedString(transOutEntityId)).append("\n");
    sb.append("    transOutEntityType: ").append(toIndentedString(transOutEntityType)).append("\n");
    sb.append("    transOutSubMerchant: ").append(toIndentedString(transOutSubMerchant)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("desc");
    openapiFields.add("error_code");
    openapiFields.add("error_desc");
    openapiFields.add("status");
    openapiFields.add("trans_in_account_id");
    openapiFields.add("trans_in_account_id_type");
    openapiFields.add("trans_in_account_open_id");
    openapiFields.add("trans_in_account_type");
    openapiFields.add("trans_in_entity_id");
    openapiFields.add("trans_in_entity_type");
    openapiFields.add("trans_in_sub_merchant");
    openapiFields.add("trans_out_entity_id");
    openapiFields.add("trans_out_entity_type");
    openapiFields.add("trans_out_sub_merchant");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BatchRoyaltyDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BatchRoyaltyDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchRoyaltyDetail is not found in the empty JSON string", BatchRoyaltyDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BatchRoyaltyDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchRoyaltyDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("desc") != null && !jsonObj.get("desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desc").toString()));
      }
      if (jsonObj.get("error_code") != null && !jsonObj.get("error_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_code").toString()));
      }
      if (jsonObj.get("error_desc") != null && !jsonObj.get("error_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_desc").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("trans_in_account_id") != null && !jsonObj.get("trans_in_account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_account_id").toString()));
      }
      if (jsonObj.get("trans_in_account_id_type") != null && !jsonObj.get("trans_in_account_id_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_account_id_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_account_id_type").toString()));
      }
      if (jsonObj.get("trans_in_account_open_id") != null && !jsonObj.get("trans_in_account_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_account_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_account_open_id").toString()));
      }
      if (jsonObj.get("trans_in_account_type") != null && !jsonObj.get("trans_in_account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_account_type").toString()));
      }
      if (jsonObj.get("trans_in_entity_id") != null && !jsonObj.get("trans_in_entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_entity_id").toString()));
      }
      if (jsonObj.get("trans_in_entity_type") != null && !jsonObj.get("trans_in_entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_entity_type").toString()));
      }
      // validate the optional field `trans_in_sub_merchant`
      if (jsonObj.getAsJsonObject("trans_in_sub_merchant") != null) {
        SubMerchant.validateJsonObject(jsonObj.getAsJsonObject("trans_in_sub_merchant"));
      }
      if (jsonObj.get("trans_out_entity_id") != null && !jsonObj.get("trans_out_entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_out_entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_out_entity_id").toString()));
      }
      if (jsonObj.get("trans_out_entity_type") != null && !jsonObj.get("trans_out_entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_out_entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_out_entity_type").toString()));
      }
      // validate the optional field `trans_out_sub_merchant`
      if (jsonObj.getAsJsonObject("trans_out_sub_merchant") != null) {
        SubMerchant.validateJsonObject(jsonObj.getAsJsonObject("trans_out_sub_merchant"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchRoyaltyDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchRoyaltyDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchRoyaltyDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchRoyaltyDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchRoyaltyDetail>() {
           @Override
           public void write(JsonWriter out, BatchRoyaltyDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchRoyaltyDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BatchRoyaltyDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BatchRoyaltyDetail
  * @throws IOException if the JSON string is invalid with respect to BatchRoyaltyDetail
  */
  public static BatchRoyaltyDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchRoyaltyDetail.class);
  }

 /**
  * Convert an instance of BatchRoyaltyDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
