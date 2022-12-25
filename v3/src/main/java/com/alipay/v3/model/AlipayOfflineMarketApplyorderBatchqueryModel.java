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
import java.util.ArrayList;
import java.util.List;
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
 * AlipayOfflineMarketApplyorderBatchqueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOfflineMarketApplyorderBatchqueryModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_APPLY_IDS = "apply_ids";
  @SerializedName(SERIALIZED_NAME_APPLY_IDS)
  private List<String> applyIds = null;

  public static final String SERIALIZED_NAME_BIZ_ID = "biz_id";
  @SerializedName(SERIALIZED_NAME_BIZ_ID)
  private String bizId;

  public static final String SERIALIZED_NAME_BIZ_TYPE = "biz_type";
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private String bizType;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_OP_ID = "op_id";
  @SerializedName(SERIALIZED_NAME_OP_ID)
  private String opId;

  public static final String SERIALIZED_NAME_OP_ROLE = "op_role";
  @SerializedName(SERIALIZED_NAME_OP_ROLE)
  private String opRole;

  public static final String SERIALIZED_NAME_PAGE_NO = "page_no";
  @SerializedName(SERIALIZED_NAME_PAGE_NO)
  private Integer pageNo;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_REQUEST_IDS = "request_ids";
  @SerializedName(SERIALIZED_NAME_REQUEST_IDS)
  private List<String> requestIds = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AlipayOfflineMarketApplyorderBatchqueryModel() { 
  }

  public AlipayOfflineMarketApplyorderBatchqueryModel action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * 操作动作
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CREATE_SHOP", value = "操作动作")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public AlipayOfflineMarketApplyorderBatchqueryModel applyIds(List<String> applyIds) {
    
    this.applyIds = applyIds;
    return this;
  }

  public AlipayOfflineMarketApplyorderBatchqueryModel addApplyIdsItem(String applyIdsItem) {
    if (this.applyIds == null) {
      this.applyIds = new ArrayList<>();
    }
    this.applyIds.add(applyIdsItem);
    return this;
  }

   /**
   * 支付宝流水ID列表，最大不超过100个
   * @return applyIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015052100077000000000120773,2015052100077000000000120774", value = "支付宝流水ID列表，最大不超过100个")

  public List<String> getApplyIds() {
    return applyIds;
  }


  public void setApplyIds(List<String> applyIds) {
    this.applyIds = applyIds;
  }


  public AlipayOfflineMarketApplyorderBatchqueryModel bizId(String bizId) {
    
    this.bizId = bizId;
    return this;
  }

   /**
   * 业务主体ID。根据biz_type不同可能对应shop_id或item_id。
   * @return bizId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015052100077000000000120774", value = "业务主体ID。根据biz_type不同可能对应shop_id或item_id。")

  public String getBizId() {
    return bizId;
  }


  public void setBizId(String bizId) {
    this.bizId = bizId;
  }


  public AlipayOfflineMarketApplyorderBatchqueryModel bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * 业务类型：SHOP-店铺，ITEM-商品。
   * @return bizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SHOP", value = "业务类型：SHOP-店铺，ITEM-商品。")

  public String getBizType() {
    return bizType;
  }


  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public AlipayOfflineMarketApplyorderBatchqueryModel endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 查询的流水创建时间最后值。格式：yyyy-MM-dd HH:mm:ss
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-10-29 10:51:57", value = "查询的流水创建时间最后值。格式：yyyy-MM-dd HH:mm:ss")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AlipayOfflineMarketApplyorderBatchqueryModel opId(String opId) {
    
    this.opId = opId;
    return this;
  }

   /**
   * 操作用户的支付账号id
   * @return opId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088001969784501", value = "操作用户的支付账号id")

  public String getOpId() {
    return opId;
  }


  public void setOpId(String opId) {
    this.opId = opId;
  }


  public AlipayOfflineMarketApplyorderBatchqueryModel opRole(String opRole) {
    
    this.opRole = opRole;
    return this;
  }

   /**
   * 系统集成商统一传入ISV
   * @return opRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ISV", value = "系统集成商统一传入ISV")

  public String getOpRole() {
    return opRole;
  }


  public void setOpRole(String opRole) {
    this.opRole = opRole;
  }


  public AlipayOfflineMarketApplyorderBatchqueryModel pageNo(Integer pageNo) {
    
    this.pageNo = pageNo;
    return this;
  }

   /**
   * 页码，留空标示第一页，默认20个结果为一页
   * @return pageNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "页码，留空标示第一页，默认20个结果为一页")

  public Integer getPageNo() {
    return pageNo;
  }


  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }


  public AlipayOfflineMarketApplyorderBatchqueryModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页记录数。默认20，最大100。
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "每页记录数。默认20，最大100。")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayOfflineMarketApplyorderBatchqueryModel requestIds(List<String> requestIds) {
    
    this.requestIds = requestIds;
    return this;
  }

  public AlipayOfflineMarketApplyorderBatchqueryModel addRequestIdsItem(String requestIdsItem) {
    if (this.requestIds == null) {
      this.requestIds = new ArrayList<>();
    }
    this.requestIds.add(requestIdsItem);
    return this;
  }

   /**
   * 请求ID列表，最大不超过100个。  注意：暂时不支持此字段查询。
   * @return requestIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015123235324534,2015123235324535", value = "请求ID列表，最大不超过100个。  注意：暂时不支持此字段查询。")

  public List<String> getRequestIds() {
    return requestIds;
  }


  public void setRequestIds(List<String> requestIds) {
    this.requestIds = requestIds;
  }


  public AlipayOfflineMarketApplyorderBatchqueryModel startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 查询的流水创建时间起始值，只能查询近3个月数据。格式：yyyy-MM-dd HH:mm:ss
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-10-27 10:51:57", value = "查询的流水创建时间起始值，只能查询近3个月数据。格式：yyyy-MM-dd HH:mm:ss")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public AlipayOfflineMarketApplyorderBatchqueryModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 流水状态：INIT-初始，PROCESS-处理中，SUCCESS-成功，FAIL-失败。
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FAIL", value = "流水状态：INIT-初始，PROCESS-处理中，SUCCESS-成功，FAIL-失败。")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOfflineMarketApplyorderBatchqueryModel alipayOfflineMarketApplyorderBatchqueryModel = (AlipayOfflineMarketApplyorderBatchqueryModel) o;
    return Objects.equals(this.action, alipayOfflineMarketApplyorderBatchqueryModel.action) &&
        Objects.equals(this.applyIds, alipayOfflineMarketApplyorderBatchqueryModel.applyIds) &&
        Objects.equals(this.bizId, alipayOfflineMarketApplyorderBatchqueryModel.bizId) &&
        Objects.equals(this.bizType, alipayOfflineMarketApplyorderBatchqueryModel.bizType) &&
        Objects.equals(this.endTime, alipayOfflineMarketApplyorderBatchqueryModel.endTime) &&
        Objects.equals(this.opId, alipayOfflineMarketApplyorderBatchqueryModel.opId) &&
        Objects.equals(this.opRole, alipayOfflineMarketApplyorderBatchqueryModel.opRole) &&
        Objects.equals(this.pageNo, alipayOfflineMarketApplyorderBatchqueryModel.pageNo) &&
        Objects.equals(this.pageSize, alipayOfflineMarketApplyorderBatchqueryModel.pageSize) &&
        Objects.equals(this.requestIds, alipayOfflineMarketApplyorderBatchqueryModel.requestIds) &&
        Objects.equals(this.startTime, alipayOfflineMarketApplyorderBatchqueryModel.startTime) &&
        Objects.equals(this.status, alipayOfflineMarketApplyorderBatchqueryModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, applyIds, bizId, bizType, endTime, opId, opRole, pageNo, pageSize, requestIds, startTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOfflineMarketApplyorderBatchqueryModel {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    applyIds: ").append(toIndentedString(applyIds)).append("\n");
    sb.append("    bizId: ").append(toIndentedString(bizId)).append("\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    opId: ").append(toIndentedString(opId)).append("\n");
    sb.append("    opRole: ").append(toIndentedString(opRole)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestIds: ").append(toIndentedString(requestIds)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("apply_ids");
    openapiFields.add("biz_id");
    openapiFields.add("biz_type");
    openapiFields.add("end_time");
    openapiFields.add("op_id");
    openapiFields.add("op_role");
    openapiFields.add("page_no");
    openapiFields.add("page_size");
    openapiFields.add("request_ids");
    openapiFields.add("start_time");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOfflineMarketApplyorderBatchqueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOfflineMarketApplyorderBatchqueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOfflineMarketApplyorderBatchqueryModel is not found in the empty JSON string", AlipayOfflineMarketApplyorderBatchqueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOfflineMarketApplyorderBatchqueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOfflineMarketApplyorderBatchqueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("apply_ids") != null && !jsonObj.get("apply_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_ids` to be an array in the JSON string but got `%s`", jsonObj.get("apply_ids").toString()));
      }
      if (jsonObj.get("biz_id") != null && !jsonObj.get("biz_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_id").toString()));
      }
      if (jsonObj.get("biz_type") != null && !jsonObj.get("biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_type").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("op_id") != null && !jsonObj.get("op_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `op_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("op_id").toString()));
      }
      if (jsonObj.get("op_role") != null && !jsonObj.get("op_role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `op_role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("op_role").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("request_ids") != null && !jsonObj.get("request_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_ids` to be an array in the JSON string but got `%s`", jsonObj.get("request_ids").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOfflineMarketApplyorderBatchqueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOfflineMarketApplyorderBatchqueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOfflineMarketApplyorderBatchqueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOfflineMarketApplyorderBatchqueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOfflineMarketApplyorderBatchqueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayOfflineMarketApplyorderBatchqueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOfflineMarketApplyorderBatchqueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOfflineMarketApplyorderBatchqueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOfflineMarketApplyorderBatchqueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOfflineMarketApplyorderBatchqueryModel
  */
  public static AlipayOfflineMarketApplyorderBatchqueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOfflineMarketApplyorderBatchqueryModel.class);
  }

 /**
  * Convert an instance of AlipayOfflineMarketApplyorderBatchqueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

