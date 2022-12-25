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
 * CommonErrorType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CommonErrorType {
  private static final long serialVersionUID = 1L;

  /**
   * 错误码
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    INVALID_PARAMETER("invalid-parameter"),
    
    UPLOAD_FAIL("upload-fail"),
    
    INVALID_FILE_EXTENSION("invalid-file-extension"),
    
    INVALID_FILE_SIZE("invalid-file-size"),
    
    FILE_CHECK_FAIL("file-check-fail"),
    
    APP_CALL_LIMITED("app-call-limited"),
    
    METHOD_CALL_LIMITED("method-call-limited"),
    
    INSUFFICIENT_ISV_PERMISSIONS("insufficient-isv-permissions"),
    
    ILLEGAL_CLIENT_IP("illegal-client-ip"),
    
    INSUFFICIENT_USER_PERMISSIONS("insufficient-user-permissions"),
    
    SELF_INVOKE_FORBIDDEN("self-invoke-forbidden"),
    
    APP_AUTH_INVOKE_LIMIT("app-auth-invoke-limit"),
    
    APP_API_PUNISHED("app-api-punished"),
    
    MISSING_METHOD("missing-method"),
    
    MISSING_PLATFORM("missing-platform"),
    
    INVALID_PLATFORM("invalid-platform"),
    
    INVALID_METHOD("invalid-method"),
    
    FORBIDDEN_API("forbidden-api"),
    
    INVALID_FORMAT("invalid-format"),
    
    MISSING_SIGNATURE("missing-signature"),
    
    MISSING_APP_ACCESS_TOKEN("missing-app-access-token"),
    
    MISSING_SIGNATURE_TYPE("missing-signature-type"),
    
    MISSING_DEFAULT_SIGNATURE_TYPE("missing-default-signature-type"),
    
    MISSING_SIGNATURE_KEY("missing-signature-key"),
    
    INVALID_SIGNATURE_TYPE("invalid-signature-type"),
    
    INVALID_SIGNATURE_TYPE_SAID_INTERFACE("invalid-signature-type-said-interface"),
    
    INVALID_SIGNATURE("invalid-signature"),
    
    UNSUPPORTED_EXPIRED_APP_KEY_SIGN("unsupported-expired-app-key-sign"),
    
    APP_KEY_SECURITY_RISK_APP_CERT_EXPIRED("app-key-security-risk, app-cert-expired"),
    
    APP_CERT_NOT_EXIST("app-cert-not-exist"),
    
    ALIPAY_CERT_NOT_EXIST("alipay-cert-not-exist"),
    
    MISSING_APP_CERT_SN("missing-app-cert-sn"),
    
    MISSING_ALIPAY_CERT_SN("missing-alipay-cert-sn"),
    
    MISSING_ALIPAY_ROOT_CERT_SN("missing-alipay-root-cert-sn"),
    
    INVALID_ALIPAY_ROOT_CERT_SN("invalid-alipay-root-cert-sn"),
    
    INVALID_REQUEST_DATA("invalid-request-data"),
    
    INVALID_RESPONSE_DATA("invalid-response-data"),
    
    MISSING_ENCRYPT_TYPE("missing-encrypt-type"),
    
    MISSING_ENCRYPT_KEY("missing-encrypt-key"),
    
    INVALID_ENCRYPT_TYPE("invalid-encrypt-type"),
    
    INVALID_ENCRYPT("invalid-encrypt"),
    
    MISSING_SESSION("missing-session"),
    
    MISSING_APP_ID("missing-app-id"),
    
    INVALID_APP_ID("invalid-app-id"),
    
    MISSING_TIMESTAMP("missing-timestamp"),
    
    INVALID_TIMESTAMP("invalid-timestamp"),
    
    ILLEGAL_TIMESTAMP("illegal-timestamp"),
    
    MISSING_VERSION("missing-version"),
    
    INVALID_VERSION("invalid-version"),
    
    UNSUPPORTED_VERSION("unsupported-version"),
    
    INVALID_ENCODING("invalid-encoding"),
    
    INVALID_CHARSET("invalid-charset"),
    
    INVALID_DIGEST_TYPE("invalid-digest-type"),
    
    INVALID_DIGEST("invalid-digest"),
    
    INVALID_APP_STATE("invalid-app-state"),
    
    INVALID_SUBSCRIBE_RELATIONS("invalid-subscribe-relations"),
    
    INVALID_AUTH_TOKEN("invalid-auth-token"),
    
    AUTH_TOKEN_TIME_OUT("auth-token-time-out"),
    
    INVALID_APP_AUTH_TOKEN("invalid-app-auth-token"),
    
    INVALID_APP_AUTH_TOKEN_NO_API("invalid-app-auth-token-no-api"),
    
    APP_AUTH_TOKEN_TIME_OUT("app-auth-token-time-out"),
    
    NOT_SUPPORT_APP_AUTH("not-support-app-auth"),
    
    ACCESS_DATA_TIME_OUT("access-data-time-out"),
    
    UNSUPPORT_OPERATION("unsupport-operation"),
    
    OPENID_ERROR("openid-error"),
    
    UNKNOW_ERROR("unknow-error"),
    
    INVALID_APP_METHOD("invalid-app-method"),
    
    MISSING_APP_UID("missing-app-uid"),
    
    ILLEGAL_JSON("illegal-json"),
    
    ILLEGAL_CARD_NO("illegal-card-no"),
    
    INVALID_PARTNERID("invalid-partnerid"),
    
    NO_PRODUCT_REG_BY_PARTNER("no-product-reg-by-partner"),
    
    DECRYPTION_ERROR("decryption-error"),
    
    DECRYPTION_ERROR_MISSING_ENCRYPT_TYPE("decryption-error-missing-encrypt-type"),
    
    DECRYPTION_ERROR_NOT_VALID_ENCRYPT_TYPE("decryption-error-not-valid-encrypt-type"),
    
    DECRYPTION_ERROR_NOT_VALID_ENCRYPT_KEY("decryption-error-not-valid-encrypt-key"),
    
    DECRYPTION_ERROR_UNKNOWN("decryption-error-unknown"),
    
    MISSING_SIGNATURE_CONFIG("missing-signature-config"),
    
    SEVICE_NOT_BEEN_SUBSCRIBED_TO("sevice-not-been-subscribed-to"),
    
    UNKNOWN_SUB_CODE("unknown-sub-code"),
    
    SUSPECTED_ATTACK("suspected-attack"),
    
    INVALID_AUTH_RELATIONS("invalid-auth-relations"),
    
    INVALID_PRODUCT("invalid-product"),
    
    METHOD_FORBIDDEN_BATCH_INVOKE("method-forbidden-batch-invoke"),
    
    EXIST_BLANK_SUB_REQUEST_ID("exist-blank-sub-request-id"),
    
    EXIST_REPEATED_SUB_REQUEST_ID("exist-repeated-sub-request-id"),
    
    INVALID_APP_AUTH_RELATIONS("invalid-app-auth-relations"),
    
    APP_UNBIND_PARTNER("app-unbind-partner"),
    
    APP_INVALID_OID("app-invalid-oid"),
    
    EXCEED_API_BALANCE("exceed-api-balance"),
    
    INNER_APP_NO_ACCESS("inner-app-no-access"),
    
    INVALID_INNER_INVOKE_SCENE("invalid-inner-invoke-scene"),
    
    INVALID_APP_API_FIELD_CONFIG("invalid-app-api-field-config");

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

  public CommonErrorType() { 
  }

  public CommonErrorType code(CodeEnum code) {
    
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


  public CommonErrorType links(String links) {
    
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


  public CommonErrorType message(String message) {
    
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
    CommonErrorType commonErrorType = (CommonErrorType) o;
    return Objects.equals(this.code, commonErrorType.code) &&
        Objects.equals(this.links, commonErrorType.links) &&
        Objects.equals(this.message, commonErrorType.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, links, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonErrorType {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to CommonErrorType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CommonErrorType.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommonErrorType is not found in the empty JSON string", CommonErrorType.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CommonErrorType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommonErrorType` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CommonErrorType.openapiRequiredFields) {
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
       if (!CommonErrorType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommonErrorType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommonErrorType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommonErrorType.class));

       return (TypeAdapter<T>) new TypeAdapter<CommonErrorType>() {
           @Override
           public void write(JsonWriter out, CommonErrorType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommonErrorType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CommonErrorType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommonErrorType
  * @throws IOException if the JSON string is invalid with respect to CommonErrorType
  */
  public static CommonErrorType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommonErrorType.class);
  }

 /**
  * Convert an instance of CommonErrorType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

