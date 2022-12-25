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
 * CumulateDataDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CumulateDataDetail {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTION_TYPE = "action_type";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPE)
  private String actionType;

  public static final String SERIALIZED_NAME_BIZ_TIME = "biz_time";
  @SerializedName(SERIALIZED_NAME_BIZ_TIME)
  private String bizTime;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private String discountAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_DESC = "discount_desc";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_DESC)
  private String discountDesc;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_REFER_OUT_BIZ_NO = "refer_out_biz_no";
  @SerializedName(SERIALIZED_NAME_REFER_OUT_BIZ_NO)
  private String referOutBizNo;

  public static final String SERIALIZED_NAME_SUB_DATA_TYPE = "sub_data_type";
  @SerializedName(SERIALIZED_NAME_SUB_DATA_TYPE)
  private String subDataType;

  public static final String SERIALIZED_NAME_TASK_AMOUNT = "task_amount";
  @SerializedName(SERIALIZED_NAME_TASK_AMOUNT)
  private String taskAmount;

  public static final String SERIALIZED_NAME_TASK_DESC = "task_desc";
  @SerializedName(SERIALIZED_NAME_TASK_DESC)
  private String taskDesc;

  public static final String SERIALIZED_NAME_TASK_TIMES = "task_times";
  @SerializedName(SERIALIZED_NAME_TASK_TIMES)
  private Integer taskTimes;

  public CumulateDataDetail() { 
  }

  public CumulateDataDetail actionType(String actionType) {
    
    this.actionType = actionType;
    return this;
  }

   /**
   * 数据回传的动作类型，正向或逆向。
   * @return actionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "POSITIVE", value = "数据回传的动作类型，正向或逆向。")

  public String getActionType() {
    return actionType;
  }


  public void setActionType(String actionType) {
    this.actionType = actionType;
  }


  public CumulateDataDetail bizTime(String bizTime) {
    
    this.bizTime = bizTime;
    return this;
  }

   /**
   * 回传数据发生的实际时间
   * @return bizTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-03-08 19:51:35", value = "回传数据发生的实际时间")

  public String getBizTime() {
    return bizTime;
  }


  public void setBizTime(String bizTime) {
    this.bizTime = bizTime;
  }


  public CumulateDataDetail dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * 回传数据类型。
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TASK", value = "回传数据类型。")

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public CumulateDataDetail discountAmount(String discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * 优惠金额
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7.08", value = "优惠金额")

  public String getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }


  public CumulateDataDetail discountDesc(String discountDesc) {
    
    this.discountDesc = discountDesc;
    return this;
  }

   /**
   * 优惠描述
   * @return discountDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "消费满减优惠001", value = "优惠描述")

  public String getDiscountDesc() {
    return discountDesc;
  }


  public void setDiscountDesc(String discountDesc) {
    this.discountDesc = discountDesc;
  }


  public CumulateDataDetail outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 数据回传时传入的外部业务号。
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020081211223006150094012926289", value = "数据回传时传入的外部业务号。")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public CumulateDataDetail referOutBizNo(String referOutBizNo) {
    
    this.referOutBizNo = referOutBizNo;
    return this;
  }

   /**
   * 数据回传时逆向单据记录的对应正向单据的外部业务号。
   * @return referOutBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020081211223006150094012926289", value = "数据回传时逆向单据记录的对应正向单据的外部业务号。")

  public String getReferOutBizNo() {
    return referOutBizNo;
  }


  public void setReferOutBizNo(String referOutBizNo) {
    this.referOutBizNo = referOutBizNo;
  }


  public CumulateDataDetail subDataType(String subDataType) {
    
    this.subDataType = subDataType;
    return this;
  }

   /**
   * 回传数据子类型。
   * @return subDataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AMOUNT", value = "回传数据子类型。")

  public String getSubDataType() {
    return subDataType;
  }


  public void setSubDataType(String subDataType) {
    this.subDataType = subDataType;
  }


  public CumulateDataDetail taskAmount(String taskAmount) {
    
    this.taskAmount = taskAmount;
    return this;
  }

   /**
   * 任务金额
   * @return taskAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "17.88", value = "任务金额")

  public String getTaskAmount() {
    return taskAmount;
  }


  public void setTaskAmount(String taskAmount) {
    this.taskAmount = taskAmount;
  }


  public CumulateDataDetail taskDesc(String taskDesc) {
    
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


  public CumulateDataDetail taskTimes(Integer taskTimes) {
    
    this.taskTimes = taskTimes;
    return this;
  }

   /**
   * 任务次数
   * @return taskTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "任务次数")

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
    CumulateDataDetail cumulateDataDetail = (CumulateDataDetail) o;
    return Objects.equals(this.actionType, cumulateDataDetail.actionType) &&
        Objects.equals(this.bizTime, cumulateDataDetail.bizTime) &&
        Objects.equals(this.dataType, cumulateDataDetail.dataType) &&
        Objects.equals(this.discountAmount, cumulateDataDetail.discountAmount) &&
        Objects.equals(this.discountDesc, cumulateDataDetail.discountDesc) &&
        Objects.equals(this.outBizNo, cumulateDataDetail.outBizNo) &&
        Objects.equals(this.referOutBizNo, cumulateDataDetail.referOutBizNo) &&
        Objects.equals(this.subDataType, cumulateDataDetail.subDataType) &&
        Objects.equals(this.taskAmount, cumulateDataDetail.taskAmount) &&
        Objects.equals(this.taskDesc, cumulateDataDetail.taskDesc) &&
        Objects.equals(this.taskTimes, cumulateDataDetail.taskTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, bizTime, dataType, discountAmount, discountDesc, outBizNo, referOutBizNo, subDataType, taskAmount, taskDesc, taskTimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CumulateDataDetail {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    bizTime: ").append(toIndentedString(bizTime)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountDesc: ").append(toIndentedString(discountDesc)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    referOutBizNo: ").append(toIndentedString(referOutBizNo)).append("\n");
    sb.append("    subDataType: ").append(toIndentedString(subDataType)).append("\n");
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
    openapiFields.add("action_type");
    openapiFields.add("biz_time");
    openapiFields.add("data_type");
    openapiFields.add("discount_amount");
    openapiFields.add("discount_desc");
    openapiFields.add("out_biz_no");
    openapiFields.add("refer_out_biz_no");
    openapiFields.add("sub_data_type");
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
  * @throws IOException if the JSON Object is invalid with respect to CumulateDataDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CumulateDataDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CumulateDataDetail is not found in the empty JSON string", CumulateDataDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CumulateDataDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CumulateDataDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("action_type") != null && !jsonObj.get("action_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_type").toString()));
      }
      if (jsonObj.get("biz_time") != null && !jsonObj.get("biz_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_time").toString()));
      }
      if (jsonObj.get("data_type") != null && !jsonObj.get("data_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_type").toString()));
      }
      if (jsonObj.get("discount_amount") != null && !jsonObj.get("discount_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_amount").toString()));
      }
      if (jsonObj.get("discount_desc") != null && !jsonObj.get("discount_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_desc").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("refer_out_biz_no") != null && !jsonObj.get("refer_out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refer_out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refer_out_biz_no").toString()));
      }
      if (jsonObj.get("sub_data_type") != null && !jsonObj.get("sub_data_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_data_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_data_type").toString()));
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
       if (!CumulateDataDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CumulateDataDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CumulateDataDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CumulateDataDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<CumulateDataDetail>() {
           @Override
           public void write(JsonWriter out, CumulateDataDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CumulateDataDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CumulateDataDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CumulateDataDetail
  * @throws IOException if the JSON string is invalid with respect to CumulateDataDetail
  */
  public static CumulateDataDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CumulateDataDetail.class);
  }

 /**
  * Convert an instance of CumulateDataDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

