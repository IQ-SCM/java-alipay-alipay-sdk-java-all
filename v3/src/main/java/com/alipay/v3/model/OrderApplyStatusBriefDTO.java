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
 * OrderApplyStatusBriefDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderApplyStatusBriefDTO {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APPLY_STATUS = "apply_status";
  @SerializedName(SERIALIZED_NAME_APPLY_STATUS)
  private String applyStatus;

  public static final String SERIALIZED_NAME_ORDER_NO = "order_no";
  @SerializedName(SERIALIZED_NAME_ORDER_NO)
  private String orderNo;

  public OrderApplyStatusBriefDTO() { 
  }

  public OrderApplyStatusBriefDTO applyStatus(String applyStatus) {
    
    this.applyStatus = applyStatus;
    return this;
  }

   /**
   * SUCCESS：开票成功 FAIL：开票失败 PROCESS：开票中 NOTEXIST：申请不存在
   * @return applyStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "SUCCESS：开票成功 FAIL：开票失败 PROCESS：开票中 NOTEXIST：申请不存在")

  public String getApplyStatus() {
    return applyStatus;
  }


  public void setApplyStatus(String applyStatus) {
    this.applyStatus = applyStatus;
  }


  public OrderApplyStatusBriefDTO orderNo(String orderNo) {
    
    this.orderNo = orderNo;
    return this;
  }

   /**
   * 开票申请时传入订单号（支持主单号、子单号），不限是否为支付宝体内交易单号
   * @return orderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20200520110046966071", value = "开票申请时传入订单号（支持主单号、子单号），不限是否为支付宝体内交易单号")

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
    OrderApplyStatusBriefDTO orderApplyStatusBriefDTO = (OrderApplyStatusBriefDTO) o;
    return Objects.equals(this.applyStatus, orderApplyStatusBriefDTO.applyStatus) &&
        Objects.equals(this.orderNo, orderApplyStatusBriefDTO.orderNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyStatus, orderNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderApplyStatusBriefDTO {\n");
    sb.append("    applyStatus: ").append(toIndentedString(applyStatus)).append("\n");
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
    openapiFields.add("apply_status");
    openapiFields.add("order_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderApplyStatusBriefDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderApplyStatusBriefDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderApplyStatusBriefDTO is not found in the empty JSON string", OrderApplyStatusBriefDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderApplyStatusBriefDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderApplyStatusBriefDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("apply_status") != null && !jsonObj.get("apply_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_status").toString()));
      }
      if (jsonObj.get("order_no") != null && !jsonObj.get("order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderApplyStatusBriefDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderApplyStatusBriefDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderApplyStatusBriefDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderApplyStatusBriefDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderApplyStatusBriefDTO>() {
           @Override
           public void write(JsonWriter out, OrderApplyStatusBriefDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderApplyStatusBriefDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderApplyStatusBriefDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderApplyStatusBriefDTO
  * @throws IOException if the JSON string is invalid with respect to OrderApplyStatusBriefDTO
  */
  public static OrderApplyStatusBriefDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderApplyStatusBriefDTO.class);
  }

 /**
  * Convert an instance of OrderApplyStatusBriefDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
