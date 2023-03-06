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
 * ZhimaMerchantSubsidiariesApplyResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaMerchantSubsidiariesApplyResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BIZ_ERROR_CODE = "biz_error_code";
  @SerializedName(SERIALIZED_NAME_BIZ_ERROR_CODE)
  private String bizErrorCode;

  public static final String SERIALIZED_NAME_BIZ_ERROR_MESSAGE = "biz_error_message";
  @SerializedName(SERIALIZED_NAME_BIZ_ERROR_MESSAGE)
  private String bizErrorMessage;

  public static final String SERIALIZED_NAME_ORDER_NO = "order_no";
  @SerializedName(SERIALIZED_NAME_ORDER_NO)
  private String orderNo;

  public ZhimaMerchantSubsidiariesApplyResponseModel() { 
  }

  public ZhimaMerchantSubsidiariesApplyResponseModel bizErrorCode(String bizErrorCode) {
    
    this.bizErrorCode = bizErrorCode;
    return this;
  }

   /**
   * 业务错误码
   * @return bizErrorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1001", value = "业务错误码")

  public String getBizErrorCode() {
    return bizErrorCode;
  }


  public void setBizErrorCode(String bizErrorCode) {
    this.bizErrorCode = bizErrorCode;
  }


  public ZhimaMerchantSubsidiariesApplyResponseModel bizErrorMessage(String bizErrorMessage) {
    
    this.bizErrorMessage = bizErrorMessage;
    return this;
  }

   /**
   * 业务错误信息
   * @return bizErrorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "处理失败", value = "业务错误信息")

  public String getBizErrorMessage() {
    return bizErrorMessage;
  }


  public void setBizErrorMessage(String bizErrorMessage) {
    this.bizErrorMessage = bizErrorMessage;
  }


  public ZhimaMerchantSubsidiariesApplyResponseModel orderNo(String orderNo) {
    
    this.orderNo = orderNo;
    return this;
  }

   /**
   * 工单标识
   * @return orderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100010", value = "工单标识")

  public String getOrderNo() {
    return orderNo;
  }


  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaMerchantSubsidiariesApplyResponseModel zhimaMerchantSubsidiariesApplyResponseModel = (ZhimaMerchantSubsidiariesApplyResponseModel) o;
    return Objects.equals(this.bizErrorCode, zhimaMerchantSubsidiariesApplyResponseModel.bizErrorCode) &&
        Objects.equals(this.bizErrorMessage, zhimaMerchantSubsidiariesApplyResponseModel.bizErrorMessage) &&
        Objects.equals(this.orderNo, zhimaMerchantSubsidiariesApplyResponseModel.orderNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizErrorCode, bizErrorMessage, orderNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaMerchantSubsidiariesApplyResponseModel {\n");
    sb.append("    bizErrorCode: ").append(toIndentedString(bizErrorCode)).append("\n");
    sb.append("    bizErrorMessage: ").append(toIndentedString(bizErrorMessage)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
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
    openapiFields.add("biz_error_code");
    openapiFields.add("biz_error_message");
    openapiFields.add("order_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaMerchantSubsidiariesApplyResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaMerchantSubsidiariesApplyResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaMerchantSubsidiariesApplyResponseModel is not found in the empty JSON string", ZhimaMerchantSubsidiariesApplyResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaMerchantSubsidiariesApplyResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaMerchantSubsidiariesApplyResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_error_code") != null && !jsonObj.get("biz_error_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_error_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_error_code").toString()));
      }
      if (jsonObj.get("biz_error_message") != null && !jsonObj.get("biz_error_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_error_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_error_message").toString()));
      }
      if (jsonObj.get("order_no") != null && !jsonObj.get("order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaMerchantSubsidiariesApplyResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaMerchantSubsidiariesApplyResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaMerchantSubsidiariesApplyResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaMerchantSubsidiariesApplyResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaMerchantSubsidiariesApplyResponseModel>() {
           @Override
           public void write(JsonWriter out, ZhimaMerchantSubsidiariesApplyResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaMerchantSubsidiariesApplyResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaMerchantSubsidiariesApplyResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaMerchantSubsidiariesApplyResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaMerchantSubsidiariesApplyResponseModel
  */
  public static ZhimaMerchantSubsidiariesApplyResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaMerchantSubsidiariesApplyResponseModel.class);
  }

 /**
  * Convert an instance of ZhimaMerchantSubsidiariesApplyResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
