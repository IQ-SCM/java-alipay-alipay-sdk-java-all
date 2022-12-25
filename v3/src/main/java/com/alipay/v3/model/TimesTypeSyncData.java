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
 * TimesTypeSyncData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TimesTypeSyncData {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private String discountAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_DESC = "discount_desc";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_DESC)
  private String discountDesc;

  public static final String SERIALIZED_NAME_TASK_AMOUNT = "task_amount";
  @SerializedName(SERIALIZED_NAME_TASK_AMOUNT)
  private String taskAmount;

  public static final String SERIALIZED_NAME_TASK_DESC = "task_desc";
  @SerializedName(SERIALIZED_NAME_TASK_DESC)
  private String taskDesc;

  public static final String SERIALIZED_NAME_TASK_TIMES = "task_times";
  @SerializedName(SERIALIZED_NAME_TASK_TIMES)
  private Integer taskTimes;

  public TimesTypeSyncData() { 
  }

  public TimesTypeSyncData discountAmount(String discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * 商户回传的优惠金额，如用户享受的红包金额，单位元
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8.75", value = "商户回传的优惠金额，如用户享受的红包金额，单位元")

  public String getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }


  public TimesTypeSyncData discountDesc(String discountDesc) {
    
    this.discountDesc = discountDesc;
    return this;
  }

   /**
   * 商户数据回传的优惠信息的名称。
   * @return discountDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "消费满减优惠001", value = "商户数据回传的优惠信息的名称。")

  public String getDiscountDesc() {
    return discountDesc;
  }


  public void setDiscountDesc(String discountDesc) {
    this.discountDesc = discountDesc;
  }


  public TimesTypeSyncData taskAmount(String taskAmount) {
    
    this.taskAmount = taskAmount;
    return this;
  }

   /**
   * 用户和商户发生交易的交易单金额，单位元。
   * @return taskAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.57", value = "用户和商户发生交易的交易单金额，单位元。")

  public String getTaskAmount() {
    return taskAmount;
  }


  public void setTaskAmount(String taskAmount) {
    this.taskAmount = taskAmount;
  }


  public TimesTypeSyncData taskDesc(String taskDesc) {
    
    this.taskDesc = taskDesc;
    return this;
  }

   /**
   * 任务描述
   * @return taskDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "完成一次任务001", value = "任务描述")

  public String getTaskDesc() {
    return taskDesc;
  }


  public void setTaskDesc(String taskDesc) {
    this.taskDesc = taskDesc;
  }


  public TimesTypeSyncData taskTimes(Integer taskTimes) {
    
    this.taskTimes = taskTimes;
    return this;
  }

   /**
   * 当为次数型任务时必须传。
   * @return taskTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当为次数型任务时必须传。")

  public Integer getTaskTimes() {
    return taskTimes;
  }


  public void setTaskTimes(Integer taskTimes) {
    this.taskTimes = taskTimes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimesTypeSyncData timesTypeSyncData = (TimesTypeSyncData) o;
    return Objects.equals(this.discountAmount, timesTypeSyncData.discountAmount) &&
        Objects.equals(this.discountDesc, timesTypeSyncData.discountDesc) &&
        Objects.equals(this.taskAmount, timesTypeSyncData.taskAmount) &&
        Objects.equals(this.taskDesc, timesTypeSyncData.taskDesc) &&
        Objects.equals(this.taskTimes, timesTypeSyncData.taskTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountAmount, discountDesc, taskAmount, taskDesc, taskTimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimesTypeSyncData {\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountDesc: ").append(toIndentedString(discountDesc)).append("\n");
    sb.append("    taskAmount: ").append(toIndentedString(taskAmount)).append("\n");
    sb.append("    taskDesc: ").append(toIndentedString(taskDesc)).append("\n");
    sb.append("    taskTimes: ").append(toIndentedString(taskTimes)).append("\n");
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
    openapiFields.add("discount_amount");
    openapiFields.add("discount_desc");
    openapiFields.add("task_amount");
    openapiFields.add("task_desc");
    openapiFields.add("task_times");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimesTypeSyncData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TimesTypeSyncData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimesTypeSyncData is not found in the empty JSON string", TimesTypeSyncData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TimesTypeSyncData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimesTypeSyncData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("discount_amount") != null && !jsonObj.get("discount_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_amount").toString()));
      }
      if (jsonObj.get("discount_desc") != null && !jsonObj.get("discount_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_desc").toString()));
      }
      if (jsonObj.get("task_amount") != null && !jsonObj.get("task_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_amount").toString()));
      }
      if (jsonObj.get("task_desc") != null && !jsonObj.get("task_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_desc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimesTypeSyncData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimesTypeSyncData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimesTypeSyncData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimesTypeSyncData.class));

       return (TypeAdapter<T>) new TypeAdapter<TimesTypeSyncData>() {
           @Override
           public void write(JsonWriter out, TimesTypeSyncData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimesTypeSyncData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TimesTypeSyncData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimesTypeSyncData
  * @throws IOException if the JSON string is invalid with respect to TimesTypeSyncData
  */
  public static TimesTypeSyncData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimesTypeSyncData.class);
  }

 /**
  * Convert an instance of TimesTypeSyncData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

