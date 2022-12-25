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
 * AlipayFundAccountbookNotifyUnsubscribeResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundAccountbookNotifyUnsubscribeResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCOUNT_BOOK_ID = "account_book_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BOOK_ID)
  private String accountBookId;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg;

  public static final String SERIALIZED_NAME_SUBSCRIBE_STATUS = "subscribe_status";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBE_STATUS)
  private String subscribeStatus;

  public AlipayFundAccountbookNotifyUnsubscribeResponseModel() { 
  }

  public AlipayFundAccountbookNotifyUnsubscribeResponseModel accountBookId(String accountBookId) {
    
    this.accountBookId = accountBookId;
    return this;
  }

   /**
   * 记账本ID
   * @return accountBookId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000147677710", value = "记账本ID")

  public String getAccountBookId() {
    return accountBookId;
  }


  public void setAccountBookId(String accountBookId) {
    this.accountBookId = accountBookId;
  }


  public AlipayFundAccountbookNotifyUnsubscribeResponseModel code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 响应code。 成功为10000； 业务异常为40004；
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "响应code。 成功为10000； 业务异常为40004；")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public AlipayFundAccountbookNotifyUnsubscribeResponseModel msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * 响应描述。 成功为Success； 业务异常为Business Failed；
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Success", value = "响应描述。 成功为Success； 业务异常为Business Failed；")

  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }


  public AlipayFundAccountbookNotifyUnsubscribeResponseModel subscribeStatus(String subscribeStatus) {
    
    this.subscribeStatus = subscribeStatus;
    return this;
  }

   /**
   * 订阅关系状态，  VALID：有效的；  INVALID：失效的；
   * @return subscribeStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VALID", value = "订阅关系状态，  VALID：有效的；  INVALID：失效的；")

  public String getSubscribeStatus() {
    return subscribeStatus;
  }


  public void setSubscribeStatus(String subscribeStatus) {
    this.subscribeStatus = subscribeStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundAccountbookNotifyUnsubscribeResponseModel alipayFundAccountbookNotifyUnsubscribeResponseModel = (AlipayFundAccountbookNotifyUnsubscribeResponseModel) o;
    return Objects.equals(this.accountBookId, alipayFundAccountbookNotifyUnsubscribeResponseModel.accountBookId) &&
        Objects.equals(this.code, alipayFundAccountbookNotifyUnsubscribeResponseModel.code) &&
        Objects.equals(this.msg, alipayFundAccountbookNotifyUnsubscribeResponseModel.msg) &&
        Objects.equals(this.subscribeStatus, alipayFundAccountbookNotifyUnsubscribeResponseModel.subscribeStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountBookId, code, msg, subscribeStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundAccountbookNotifyUnsubscribeResponseModel {\n");
    sb.append("    accountBookId: ").append(toIndentedString(accountBookId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    subscribeStatus: ").append(toIndentedString(subscribeStatus)).append("\n");
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
    openapiFields.add("account_book_id");
    openapiFields.add("code");
    openapiFields.add("msg");
    openapiFields.add("subscribe_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundAccountbookNotifyUnsubscribeResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundAccountbookNotifyUnsubscribeResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundAccountbookNotifyUnsubscribeResponseModel is not found in the empty JSON string", AlipayFundAccountbookNotifyUnsubscribeResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundAccountbookNotifyUnsubscribeResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundAccountbookNotifyUnsubscribeResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_book_id") != null && !jsonObj.get("account_book_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_book_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_book_id").toString()));
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("msg") != null && !jsonObj.get("msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg").toString()));
      }
      if (jsonObj.get("subscribe_status") != null && !jsonObj.get("subscribe_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscribe_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscribe_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundAccountbookNotifyUnsubscribeResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundAccountbookNotifyUnsubscribeResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundAccountbookNotifyUnsubscribeResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundAccountbookNotifyUnsubscribeResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundAccountbookNotifyUnsubscribeResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundAccountbookNotifyUnsubscribeResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundAccountbookNotifyUnsubscribeResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundAccountbookNotifyUnsubscribeResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundAccountbookNotifyUnsubscribeResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundAccountbookNotifyUnsubscribeResponseModel
  */
  public static AlipayFundAccountbookNotifyUnsubscribeResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundAccountbookNotifyUnsubscribeResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundAccountbookNotifyUnsubscribeResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

