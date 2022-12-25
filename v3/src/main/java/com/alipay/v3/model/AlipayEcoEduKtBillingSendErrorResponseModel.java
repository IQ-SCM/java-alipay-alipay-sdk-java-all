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
 * AlipayEcoEduKtBillingSendErrorResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoEduKtBillingSendErrorResponseModel {
  private static final long serialVersionUID = 1L;

  /**
   * 错误码
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    SYSTEM_ERROR("SYSTEM_ERROR"),
    
    ISV_INVALID_ARGUMENT_USERMOBILE("ISV.INVALID-ARGUMENT-USERMOBILE"),
    
    ISV_INVALID_ARGUMENT_CHILDNAME("ISV.INVALID-ARGUMENT-CHILDNAME"),
    
    ISV_INVALID_ARGUMENT_SCHOOLNAME("ISV.INVALID-ARGUMENT-SCHOOLNAME"),
    
    ISV_INVALID_ARGUMENT_GRADECLASS("ISV.INVALID-ARGUMENT-GRADECLASS"),
    
    ISV_INVALID_ARGUMENT_STATUS("ISV.INVALID-ARGUMENT-STATUS"),
    
    ISV_INVALID_ARGUMENT_ORDERNO("ISV.INVALID-ARGUMENT-ORDERNO"),
    
    ISV_INVALID_ARGUMENT_ORDERTITLE("ISV.INVALID-ARGUMENT-ORDERTITLE"),
    
    ISV_INVALID_ARGUMENT_PAYITEM("ISV.INVALID-ARGUMENT-PAYITEM"),
    
    ISV_INVALID_ARGUMENT_AMOUNT("ISV.INVALID-ARGUMENT-AMOUNT"),
    
    ISV_INVALID_ARGUMENT_ENDTIME("ISV.INVALID-ARGUMENT-ENDTIME"),
    
    ISV_INVALID_ARGUMENT_ENDENABLE("ISV.INVALID-ARGUMENT-ENDENABLE"),
    
    ISV_INVALID_ARGUMENT_ISVNO("ISV.INVALID-ARGUMENT-ISVNO"),
    
    ISV_INVALID_ARGUMENT_SCHOOL_NO("ISV.INVALID-ARGUMENT-SCHOOL_NO"),
    
    ISV_INVALID_ARGUMENT_USERS("ISV.INVALID-ARGUMENT-USERS"),
    
    ISV_INVALID_SCHOOL_USER_MOBILE("ISV.INVALID-SCHOOL-USER_MOBILE"),
    
    ISV_INVALID_ARGUMENT_USER_MOBILE_USAGE("ISV.INVALID-ARGUMENT-USER_MOBILE_USAGE"),
    
    ISV_INVALID_ARGUMENT_USERNAME("ISV.INVALID-ARGUMENT-USERNAME"),
    
    ISV_INVALID_ARGUMENT_USER_RELATION("ISV.INVALID-ARGUMENT-USER_RELATION"),
    
    ISV_INVALID_ARGUMENT_USER_CHANGE_MOBILE("ISV.INVALID-ARGUMENT-USER_CHANGE_MOBILE"),
    
    ISV_INVALID_SCHOOL_STUDENT_CODE("ISV.INVALID-SCHOOL-STUDENT_CODE"),
    
    ISV_INVALID_SCHOOL_STUDENT_IDENTIFY("ISV.INVALID-SCHOOL-STUDENT_IDENTIFY"),
    
    ISV_INVALID_ARGUMENT_USER("ISV.INVALID-ARGUMENT-USER"),
    
    ISV_INVALID_ARGUMENT_CHILD_NAME("ISV.INVALID-ARGUMENT-CHILD_NAME"),
    
    ISV_INVALID_ARGUMENT_STUDENT_IDENTIFY_ERROR("ISV.INVALID-ARGUMENT-STUDENT_IDENTIFY_ERROR"),
    
    ISV_INVALID_ARGUMENT_STUDENT_MULTI("ISV.INVALID-ARGUMENT-STUDENT_MULTI"),
    
    ISV_INVALID_ARGUMENT_GRADE("ISV.INVALID-ARGUMENT-GRADE"),
    
    ISV_INVALID_ARGUMENT_CLASS("ISV.INVALID-ARGUMENT-CLASS"),
    
    ISV_INVALID_ARGUMENT_ORDER_NO("ISV.INVALID-ARGUMENT-ORDER_NO"),
    
    ISV_INVALID_ARGUMENT_ORDER_TITLE("ISV.INVALID-ARGUMENT-ORDER_TITLE"),
    
    ISV_INVALID_ARGUMENT_END_TIME("ISV.INVALID-ARGUMENT-END_TIME"),
    
    ISV_INVALID_ARGUMENT_END_ENABLE("ISV.INVALID-ARGUMENT-END_ENABLE"),
    
    ISV_INVALID_ARGUMENT_SCHOOL_PID("ISV.INVALID-ARGUMENT-SCHOOL_PID"),
    
    ISV_INVALID_ARGUMENT_PAY_ITEM("ISV.INVALID-ARGUMENT-PAY_ITEM"),
    
    ISV_INVALID_ARGUMENT_PARTNER_NO("ISV.INVALID-ARGUMENT-PARTNER_NO"),
    
    ISV_INVALID_ARGUMENT_AMOUNT_NOT_EQUAL("ISV.INVALID-ARGUMENT-AMOUNT_NOT_EQUAL"),
    
    ISV_INVALID_ARGUMENT_NO_AUTH_CODE("ISV.INVALID-ARGUMENT-NO_AUTH_CODE"),
    
    ISV_INVALID_ARGUMENT("ISV.INVALID-ARGUMENT"),
    
    AOP_UNKNOW_ERROR("AOP.UNKNOW-ERROR"),
    
    ISP_UNKNOW_ERROR("ISP.UNKNOW-ERROR"),
    
    ISV_UNSIGN_QUERY_FAILED("isv.unsign-query-failed"),
    
    ISV_UNSIGN("isv.unsign"),
    
    INVALID_PARAMETER_SCHOOL_PID("INVALID_PARAMETER_SCHOOL_PID"),
    
    ORDER_INVALID_PARAMETER_USER("ORDER_INVALID_PARAMETER_USER"),
    
    INVALID_PARAMETER_ORDER_TITLE("INVALID_PARAMETER_ORDER_TITLE"),
    
    INVALID_PARAMETER_CHARGE_BILL_TITLE("INVALID_PARAMETER_CHARGE_BILL_TITLE"),
    
    INVALID_PARAMETER_USERS("INVALID_PARAMETER_USERS"),
    
    INVALID_PARAMETER_USER_NO_MOBILE("INVALID_PARAMETER_USER_NO_MOBILE"),
    
    INVALID_PARAMETER_USER_NAME("INVALID_PARAMETER_USER_NAME"),
    
    INVALID_PARAMETER_USER_RELATION("INVALID_PARAMETER_USER_RELATION"),
    
    INVALID_PARAMETER_USER_CHANGE_MOBILE("INVALID_PARAMETER_USER_CHANGE_MOBILE"),
    
    INVALID_PARAMETER_CHILD_NAME("INVALID_PARAMETER_CHILD_NAME"),
    
    INVALID_PARAMETER_STUDENT_CODE("INVALID_PARAMETER_STUDENT_CODE"),
    
    INVALID_PARAMETER_STUDENT_IDENTIFY("INVALID_PARAMETER_STUDENT_IDENTIFY"),
    
    INVALID_PARAMETER_GRADE("INVALID_PARAMETER_GRADE"),
    
    INVALID_PARAMETER_CLASS("INVALID_PARAMETER_CLASS"),
    
    INVALID_PARAMETER_ORDER_NO("INVALID_PARAMETER_ORDER_NO"),
    
    INVALID_PARAMETER_INVALID_OUT_NO("INVALID_PARAMETER_INVALID_OUT_NO"),
    
    INVALID_PARAMETER_INVALID_STATUS("INVALID_PARAMETER_INVALID_STATUS"),
    
    INVALID_PARAMETER_END("INVALID_PARAMETER_END"),
    
    INVALID_PARAMETER_END_TIME("INVALID_PARAMETER_END_TIME"),
    
    INVALID_PARAMETER_ISV_PID("INVALID_PARAMETER_ISV_PID"),
    
    INVALID_PARAMETER_CHARGE_TYPE("INVALID_PARAMETER_CHARGE_TYPE"),
    
    INVALID_PARAMETER_PAY_ITEM("INVALID_PARAMETER_PAY_ITEM"),
    
    INVALID_PARAMETER_AMOUNT("INVALID_PARAMETER_AMOUNT"),
    
    INVALID_PARAMETER_AMOUNT_NOT_EQUAL("INVALID_PARAMETER_AMOUNT_NOT_EQUAL"),
    
    INVALID_PARAMETER_ROYALTY_AMOUNT("INVALID_PARAMETER_ROYALTY_AMOUNT"),
    
    INVALID_PARAMETER_TRANS_IN_PID("INVALID_PARAMETER_TRANS_IN_PID"),
    
    INVALID_PARAMETER_ROYALTY_RATE_OVER_LIMIT("INVALID_PARAMETER_ROYALTY_RATE_OVER_LIMIT"),
    
    INVALID_PARAMETER_ROYALTY_NOT_SUPPORT_CHOSEN("INVALID_PARAMETER_ROYALTY_NOT_SUPPORT_CHOSEN"),
    
    INVALID_PARAMETER_SCHOOL_NO_NOT("INVALID_PARAMETER_SCHOOL_NO_NOT"),
    
    INVALID_PARAMETER_REFUND_NO_SCHOOL_AUTH_CODE("INVALID_PARAMETER_REFUND_NO_SCHOOL_AUTH_CODE"),
    
    INVALID_PARAMETER_ORDER_IDEMPOTENT("INVALID_PARAMETER_ORDER_IDEMPOTENT"),
    
    INVALID_PARAMETER_ROYALTY_SCHOOL_NOT_SUPPORT("INVALID_PARAMETER_ROYALTY_SCHOOL_NOT_SUPPORT"),
    
    INVALID_PARAMETER_RELATION_NOT_EXIST("INVALID_PARAMETER_RELATION_NOT_EXIST"),
    
    INVALID_PARAMETER_MCC_CODE_NULL("INVALID_PARAMETER_MCC_CODE_NULL"),
    
    BIZ_SCHOOL_SIGN_ERROR("BIZ_SCHOOL_SIGN_ERROR"),
    
    BIZ_SCHOOL_NOT_SIGN("BIZ_SCHOOL_NOT_SIGN"),
    
    ILLEGAL_PARAM("ILLEGAL_PARAM");

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

  public AlipayEcoEduKtBillingSendErrorResponseModel() { 
  }

  public AlipayEcoEduKtBillingSendErrorResponseModel code(CodeEnum code) {
    
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


  public AlipayEcoEduKtBillingSendErrorResponseModel links(String links) {
    
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


  public AlipayEcoEduKtBillingSendErrorResponseModel message(String message) {
    
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
    AlipayEcoEduKtBillingSendErrorResponseModel alipayEcoEduKtBillingSendErrorResponseModel = (AlipayEcoEduKtBillingSendErrorResponseModel) o;
    return Objects.equals(this.code, alipayEcoEduKtBillingSendErrorResponseModel.code) &&
        Objects.equals(this.links, alipayEcoEduKtBillingSendErrorResponseModel.links) &&
        Objects.equals(this.message, alipayEcoEduKtBillingSendErrorResponseModel.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, links, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoEduKtBillingSendErrorResponseModel {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoEduKtBillingSendErrorResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoEduKtBillingSendErrorResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoEduKtBillingSendErrorResponseModel is not found in the empty JSON string", AlipayEcoEduKtBillingSendErrorResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEcoEduKtBillingSendErrorResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEcoEduKtBillingSendErrorResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlipayEcoEduKtBillingSendErrorResponseModel.openapiRequiredFields) {
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
       if (!AlipayEcoEduKtBillingSendErrorResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoEduKtBillingSendErrorResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoEduKtBillingSendErrorResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoEduKtBillingSendErrorResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoEduKtBillingSendErrorResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoEduKtBillingSendErrorResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEcoEduKtBillingSendErrorResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEcoEduKtBillingSendErrorResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoEduKtBillingSendErrorResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoEduKtBillingSendErrorResponseModel
  */
  public static AlipayEcoEduKtBillingSendErrorResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoEduKtBillingSendErrorResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEcoEduKtBillingSendErrorResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

