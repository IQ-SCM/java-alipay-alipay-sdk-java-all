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
 * AlipayFundTransPayErrorResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundTransPayErrorResponseModel {
  private static final long serialVersionUID = 1L;

  /**
   * 错误码
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    PRODUCT_NOT_SIGN("PRODUCT_NOT_SIGN"),
    
    NO_PERMISSION_ACCOUNT("NO_PERMISSION_ACCOUNT"),
    
    PAYMENT_TIME_EXPIRE("PAYMENT_TIME_EXPIRE"),
    
    PAYER_USERINFO_NOT_EXSIT("PAYER_USERINFO_NOT_EXSIT"),
    
    PAYER_NOT_RELNAME_CERTIFY("PAYER_NOT_RELNAME_CERTIFY"),
    
    PAYER_NOT_EXIST("PAYER_NOT_EXIST"),
    
    PAYEE_NOT_EXIST("PAYEE_NOT_EXIST"),
    
    PAYCARD_STATUS_UNABLE("PAYCARD_STATUS_UNABLE"),
    
    PAYEE_ACCOUNT_STATUS_ERROR("PAYEE_ACCOUNT_STATUS_ERROR"),
    
    NO_ACCOUNT_RECEIVE_PERMISSION("NO_ACCOUNT_RECEIVE_PERMISSION"),
    
    MEMO_REQUIRED_IN_TRANSFER_ERROR("MEMO_REQUIRED_IN_TRANSFER_ERROR"),
    
    SYSTEM_ERROR("SYSTEM_ERROR"),
    
    PERMIT_NON_BANK_LIMIT_PAYEE_L0_FORBIDDEN("PERMIT_NON_BANK_LIMIT_PAYEE_L0_FORBIDDEN"),
    
    PAYER_PAYEE_CANNOT_SAME("PAYER_PAYEE_CANNOT_SAME"),
    
    REMARK_HAS_SENSITIVE_WORD("REMARK_HAS_SENSITIVE_WORD"),
    
    PAYEE_USER_HAS_NO_ACCOUNT("PAYEE_USER_HAS_NO_ACCOUNT"),
    
    PAYEE_ACCOUNT_NOT_EXSIT("PAYEE_ACCOUNT_NOT_EXSIT"),
    
    TRUSTEESHIP_RECIEVE_QUOTA_LIMIT("TRUSTEESHIP_RECIEVE_QUOTA_LIMIT"),
    
    EXCEED_LIMIT_SM_AMOUNT("EXCEED_LIMIT_SM_AMOUNT"),
    
    EXCEED_LIMIT_DM_AMOUNT("EXCEED_LIMIT_DM_AMOUNT"),
    
    REFUND_TIME_INVALID("REFUND_TIME_INVALID"),
    
    AUTH_CODE_ERROR("AUTH_CODE_ERROR"),
    
    PAYMENT_TIME_INVALID("PAYMENT_TIME_INVALID"),
    
    INVALID_PARAMETER("INVALID_PARAMETER"),
    
    MONEY_PAY_CLOSED("MONEY_PAY_CLOSED"),
    
    USER_BALANCE_NOT_ENOUGH("USER_BALANCE_NOT_ENOUGH"),
    
    USER_BANKCARD_BALANCE_NOT_ENOUGH("USER_BANKCARD_BALANCE_NOT_ENOUGH"),
    
    SECURITY_CHECK_FAILED("SECURITY_CHECK_FAILED"),
    
    PERMIT_CHECK_FAIL("PERMIT_CHECK_FAIL"),
    
    ORDER_PAY_SUCCESS("ORDER_PAY_SUCCESS"),
    
    ILLEGAL_ARGUMENT("ILLEGAL_ARGUMENT"),
    
    NO_AVAILABLE_PAYMENT_TOOLS("NO_AVAILABLE_PAYMENT_TOOLS"),
    
    PAYMENT_INFO_INCONSISTENCY("PAYMENT_INFO_INCONSISTENCY"),
    
    ORDER_STATUS_INVALID("ORDER_STATUS_INVALID"),
    
    ORDER_PAY_SUCCESS_PAYEE_ERROR("ORDER_PAY_SUCCESS_PAYEE_ERROR"),
    
    UNKNOWN_ERROR("UNKNOWN_ERROR"),
    
    USER_BLOCKED("USER_BLOCKED"),
    
    ORDER_OTHER_PAY_SUCCESS("ORDER_OTHER_PAY_SUCCESS"),
    
    TRUSTEESHIP_ACCOUNT_NOT_EXIST("TRUSTEESHIP_ACCOUNT_NOT_EXIST"),
    
    NO_ACCOUNT_PAYMENT_PERMISSION("NO_ACCOUNT_PAYMENT_PERMISSION"),
    
    PAYMENT_FAIL("PAYMENT_FAIL"),
    
    AUTHOREE_IS_NOT_MATCH("AUTHOREE_IS_NOT_MATCH"),
    
    USER_AGREEMENT_STATUS_ABNORMAL("USER_AGREEMENT_STATUS_ABNORMAL"),
    
    USER_AGREEMENT_IS_OUT_OF_DATE("USER_AGREEMENT_IS_OUT_OF_DATE"),
    
    USER_AGREEMENT_VERIFY_FAIL("USER_AGREEMENT_VERIFY_FAIL"),
    
    MERCHANT_AGREEMENT_VERIFY_FAIL("MERCHANT_AGREEMENT_VERIFY_FAIL"),
    
    RESOURCE_LIMIT_EXCEED("RESOURCE_LIMIT_EXCEED"),
    
    INVALID_PAYEE_ACCOUNT("INVALID_PAYEE_ACCOUNT"),
    
    PAYER_NOT_EQUAL_PAYEE_FOR_BIZ_SCENE_REQUIRED("PAYER_NOT_EQUAL_PAYEE_FOR_BIZ_SCENE_REQUIRED"),
    
    ILLEGAL_REQUEST_USER_ID("ILLEGAL_REQUEST_USER_ID"),
    
    FREEZE_AMOUNT_IS_NOT_ENOUGH("FREEZE_AMOUNT_IS_NOT_ENOUGH"),
    
    AGREEMENT_SCENE_VERIFY_FAIL("AGREEMENT_SCENE_VERIFY_FAIL"),
    
    AUTH_USERID_IS_NOT_MATCH("AUTH_USERID_IS_NOT_MATCH"),
    
    RELEASE_USER_FORBBIDEN_RECIEVE("RELEASE_USER_FORBBIDEN_RECIEVE"),
    
    AMOUNT_COMPARE_INCONSISTENCY("AMOUNT_COMPARE_INCONSISTENCY"),
    
    PAYEE_USERINFO_STATUS_ERROR("PAYEE_USERINFO_STATUS_ERROR"),
    
    PAYER_BALANCE_NOT_ENOUGH("PAYER_BALANCE_NOT_ENOUGH"),
    
    BIZ_UNIQUE_EXCEPTION("BIZ_UNIQUE_EXCEPTION"),
    
    BLOCK_USER_FORBBIDEN_RECIEVE("BLOCK_USER_FORBBIDEN_RECIEVE"),
    
    NO_ACCOUNT_USER_FORBBIDEN_RECIEVE("NO_ACCOUNT_USER_FORBBIDEN_RECIEVE"),
    
    SUB_BIZ_SCENE_ERROR("SUB_BIZ_SCENE_ERROR"),
    
    PAYER_NOT_ADMIT_ERROR("PAYER_NOT_ADMIT_ERROR"),
    
    PAYEE_CARD_INFO_ERROR("PAYEE_CARD_INFO_ERROR"),
    
    PERM_AML_NOT_REALNAME_REV("PERM_AML_NOT_REALNAME_REV"),
    
    EXCEED_LIMIT_MM_AMOUNT("EXCEED_LIMIT_MM_AMOUNT"),
    
    CARD_BIN_ERROR("CARD_BIN_ERROR"),
    
    INST_PAY_UNABLE("INST_PAY_UNABLE"),
    
    PERMIT_CHECK_PERM_IDENTITY_THEFT("PERMIT_CHECK_PERM_IDENTITY_THEFT"),
    
    BALANCE_IS_NOT_ENOUGH("BALANCE_IS_NOT_ENOUGH"),
    
    INVALID_CARDNO("INVALID_CARDNO"),
    
    PAYEE_TRUSTEESHIP_ACC_OVER_LIMIT("PAYEE_TRUSTEESHIP_ACC_OVER_LIMIT"),
    
    EXCEED_LIMIT_DC_RECEIVED("EXCEED_LIMIT_DC_RECEIVED"),
    
    PAYER_PERMLIMIT_CHECK_FAILURE("PAYER_PERMLIMIT_CHECK_FAILURE"),
    
    PAYEE_ACC_OCUPIED("PAYEE_ACC_OCUPIED"),
    
    PERMIT_CHECK_PERM_LIMITED("PERMIT_CHECK_PERM_LIMITED"),
    
    EXCEED_LIMIT_DM_MAX_AMOUNT("EXCEED_LIMIT_DM_MAX_AMOUNT"),
    
    EXCEED_LIMIT_PERSONAL_SM_AMOUNT("EXCEED_LIMIT_PERSONAL_SM_AMOUNT"),
    
    EXCEED_LIMIT_UNRN_DM_AMOUNT("EXCEED_LIMIT_UNRN_DM_AMOUNT"),
    
    PAYEE_USER_TYPE_ERROR("PAYEE_USER_TYPE_ERROR"),
    
    EXCEED_LIMIT_SM_MIN_AMOUNT("EXCEED_LIMIT_SM_MIN_AMOUNT"),
    
    PERMIT_CHECK_RECEIVE_LIMIT("PERMIT_CHECK_RECEIVE_LIMIT"),
    
    PAYEE_NOT_RELNAME_CERTIFY("PAYEE_NOT_RELNAME_CERTIFY"),
    
    BANK_CARD_BALANCE_NOT_ENOUGH("BANK_CARD_BALANCE_NOT_ENOUGH"),
    
    MAX_VISIT_LIMIT("MAX_VISIT_LIMIT"),
    
    COMMON_RPC_ERROR("COMMON_RPC_ERROR"),
    
    MONTH_LIMIT_EXCEED("MONTH_LIMIT_EXCEED");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private String links;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public AlipayFundTransPayErrorResponseModel() { 
  }

  public AlipayFundTransPayErrorResponseModel code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * 错误码
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "错误码")

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public AlipayFundTransPayErrorResponseModel links(String links) {
    
    this.links = links;
    return this;
  }

   /**
   * 解决方案链接
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "解决方案链接")

  public String getLinks() {
    return links;
  }


  public void setLinks(String links) {
    this.links = links;
  }


  public AlipayFundTransPayErrorResponseModel message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 错误描述
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "错误描述")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundTransPayErrorResponseModel alipayFundTransPayErrorResponseModel = (AlipayFundTransPayErrorResponseModel) o;
    return Objects.equals(this.code, alipayFundTransPayErrorResponseModel.code) &&
        Objects.equals(this.links, alipayFundTransPayErrorResponseModel.links) &&
        Objects.equals(this.message, alipayFundTransPayErrorResponseModel.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, links, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundTransPayErrorResponseModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("links");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundTransPayErrorResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundTransPayErrorResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundTransPayErrorResponseModel is not found in the empty JSON string", AlipayFundTransPayErrorResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundTransPayErrorResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundTransPayErrorResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlipayFundTransPayErrorResponseModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be a primitive type in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundTransPayErrorResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundTransPayErrorResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundTransPayErrorResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundTransPayErrorResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundTransPayErrorResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundTransPayErrorResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundTransPayErrorResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundTransPayErrorResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundTransPayErrorResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundTransPayErrorResponseModel
  */
  public static AlipayFundTransPayErrorResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundTransPayErrorResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundTransPayErrorResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
