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
import com.alipay.v3.model.FlowSigner;
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
 * AlipayEcoSignFlowQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoSignFlowQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BUSINESS_SCENE = "business_scene";
  @SerializedName(SERIALIZED_NAME_BUSINESS_SCENE)
  private String businessScene;

  public static final String SERIALIZED_NAME_CONTRACT_VALIDITY = "contract_validity";
  @SerializedName(SERIALIZED_NAME_CONTRACT_VALIDITY)
  private Integer contractValidity;

  public static final String SERIALIZED_NAME_FLOW_DESC = "flow_desc";
  @SerializedName(SERIALIZED_NAME_FLOW_DESC)
  private String flowDesc;

  public static final String SERIALIZED_NAME_FLOW_END_TIME = "flow_end_time";
  @SerializedName(SERIALIZED_NAME_FLOW_END_TIME)
  private Integer flowEndTime;

  public static final String SERIALIZED_NAME_FLOW_ID = "flow_id";
  @SerializedName(SERIALIZED_NAME_FLOW_ID)
  private String flowId;

  public static final String SERIALIZED_NAME_FLOW_START_TIME = "flow_start_time";
  @SerializedName(SERIALIZED_NAME_FLOW_START_TIME)
  private Integer flowStartTime;

  public static final String SERIALIZED_NAME_FLOW_STATUS = "flow_status";
  @SerializedName(SERIALIZED_NAME_FLOW_STATUS)
  private Integer flowStatus;

  public static final String SERIALIZED_NAME_NOTICE_DEVELOPER_URL = "notice_developer_url";
  @SerializedName(SERIALIZED_NAME_NOTICE_DEVELOPER_URL)
  private String noticeDeveloperUrl;

  public static final String SERIALIZED_NAME_SIGN_VALIDITY = "sign_validity";
  @SerializedName(SERIALIZED_NAME_SIGN_VALIDITY)
  private Integer signValidity;

  public static final String SERIALIZED_NAME_SIGNERS = "signers";
  @SerializedName(SERIALIZED_NAME_SIGNERS)
  private List<FlowSigner> signers = null;

  public AlipayEcoSignFlowQueryResponseModel() { 
  }

  public AlipayEcoSignFlowQueryResponseModel businessScene(String businessScene) {
    
    this.businessScene = businessScene;
    return this;
  }

   /**
   * 文件主题
   * @return businessScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "合同名称", value = "文件主题")

  public String getBusinessScene() {
    return businessScene;
  }


  public void setBusinessScene(String businessScene) {
    this.businessScene = businessScene;
  }


  public AlipayEcoSignFlowQueryResponseModel contractValidity(Integer contractValidity) {
    
    this.contractValidity = contractValidity;
    return this;
  }

   /**
   * 文件有效截止日期
   * @return contractValidity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1592386042000", value = "文件有效截止日期")

  public Integer getContractValidity() {
    return contractValidity;
  }


  public void setContractValidity(Integer contractValidity) {
    this.contractValidity = contractValidity;
  }


  public AlipayEcoSignFlowQueryResponseModel flowDesc(String flowDesc) {
    
    this.flowDesc = flowDesc;
    return this;
  }

   /**
   * 流程描述, 如果流程已拒签或已撤回, 并且存在拒签或撤回原因, 流程描述显示为原因, 否则默认为流程状态描述
   * @return flowDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "完成", value = "流程描述, 如果流程已拒签或已撤回, 并且存在拒签或撤回原因, 流程描述显示为原因, 否则默认为流程状态描述")

  public String getFlowDesc() {
    return flowDesc;
  }


  public void setFlowDesc(String flowDesc) {
    this.flowDesc = flowDesc;
  }


  public AlipayEcoSignFlowQueryResponseModel flowEndTime(Integer flowEndTime) {
    
    this.flowEndTime = flowEndTime;
    return this;
  }

   /**
   * 流程结束时间
   * @return flowEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1560764486000", value = "流程结束时间")

  public Integer getFlowEndTime() {
    return flowEndTime;
  }


  public void setFlowEndTime(Integer flowEndTime) {
    this.flowEndTime = flowEndTime;
  }


  public AlipayEcoSignFlowQueryResponseModel flowId(String flowId) {
    
    this.flowId = flowId;
    return this;
  }

   /**
   * 流程Id
   * @return flowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "429b1d3038854cabbcdac0a63d7e4c0d", value = "流程Id")

  public String getFlowId() {
    return flowId;
  }


  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }


  public AlipayEcoSignFlowQueryResponseModel flowStartTime(Integer flowStartTime) {
    
    this.flowStartTime = flowStartTime;
    return this;
  }

   /**
   * 流程开始时间
   * @return flowStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1560764486000", value = "流程开始时间")

  public Integer getFlowStartTime() {
    return flowStartTime;
  }


  public void setFlowStartTime(Integer flowStartTime) {
    this.flowStartTime = flowStartTime;
  }


  public AlipayEcoSignFlowQueryResponseModel flowStatus(Integer flowStatus) {
    
    this.flowStatus = flowStatus;
    return this;
  }

   /**
   * 流程状态,0-草稿 1-签署中 2-完成 3-撤销 4-终止 5-过期 6-删除 7-拒签
   * @return flowStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "流程状态,0-草稿 1-签署中 2-完成 3-撤销 4-终止 5-过期 6-删除 7-拒签")

  public Integer getFlowStatus() {
    return flowStatus;
  }


  public void setFlowStatus(Integer flowStatus) {
    this.flowStatus = flowStatus;
  }


  public AlipayEcoSignFlowQueryResponseModel noticeDeveloperUrl(String noticeDeveloperUrl) {
    
    this.noticeDeveloperUrl = noticeDeveloperUrl;
    return this;
  }

   /**
   * 通知开发者地址
   * @return noticeDeveloperUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://127.0.0.1:9110/notice", value = "通知开发者地址")

  public String getNoticeDeveloperUrl() {
    return noticeDeveloperUrl;
  }


  public void setNoticeDeveloperUrl(String noticeDeveloperUrl) {
    this.noticeDeveloperUrl = noticeDeveloperUrl;
  }


  public AlipayEcoSignFlowQueryResponseModel signValidity(Integer signValidity) {
    
    this.signValidity = signValidity;
    return this;
  }

   /**
   * 签署有效截止日期
   * @return signValidity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1592386042000", value = "签署有效截止日期")

  public Integer getSignValidity() {
    return signValidity;
  }


  public void setSignValidity(Integer signValidity) {
    this.signValidity = signValidity;
  }


  public AlipayEcoSignFlowQueryResponseModel signers(List<FlowSigner> signers) {
    
    this.signers = signers;
    return this;
  }

  public AlipayEcoSignFlowQueryResponseModel addSignersItem(FlowSigner signersItem) {
    if (this.signers == null) {
      this.signers = new ArrayList<>();
    }
    this.signers.add(signersItem);
    return this;
  }

   /**
   * 签署人列表及签署状态
   * @return signers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "签署人列表及签署状态")

  public List<FlowSigner> getSigners() {
    return signers;
  }


  public void setSigners(List<FlowSigner> signers) {
    this.signers = signers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEcoSignFlowQueryResponseModel alipayEcoSignFlowQueryResponseModel = (AlipayEcoSignFlowQueryResponseModel) o;
    return Objects.equals(this.businessScene, alipayEcoSignFlowQueryResponseModel.businessScene) &&
        Objects.equals(this.contractValidity, alipayEcoSignFlowQueryResponseModel.contractValidity) &&
        Objects.equals(this.flowDesc, alipayEcoSignFlowQueryResponseModel.flowDesc) &&
        Objects.equals(this.flowEndTime, alipayEcoSignFlowQueryResponseModel.flowEndTime) &&
        Objects.equals(this.flowId, alipayEcoSignFlowQueryResponseModel.flowId) &&
        Objects.equals(this.flowStartTime, alipayEcoSignFlowQueryResponseModel.flowStartTime) &&
        Objects.equals(this.flowStatus, alipayEcoSignFlowQueryResponseModel.flowStatus) &&
        Objects.equals(this.noticeDeveloperUrl, alipayEcoSignFlowQueryResponseModel.noticeDeveloperUrl) &&
        Objects.equals(this.signValidity, alipayEcoSignFlowQueryResponseModel.signValidity) &&
        Objects.equals(this.signers, alipayEcoSignFlowQueryResponseModel.signers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessScene, contractValidity, flowDesc, flowEndTime, flowId, flowStartTime, flowStatus, noticeDeveloperUrl, signValidity, signers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoSignFlowQueryResponseModel {\n");
    sb.append("    businessScene: ").append(toIndentedString(businessScene)).append("\n");
    sb.append("    contractValidity: ").append(toIndentedString(contractValidity)).append("\n");
    sb.append("    flowDesc: ").append(toIndentedString(flowDesc)).append("\n");
    sb.append("    flowEndTime: ").append(toIndentedString(flowEndTime)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    flowStartTime: ").append(toIndentedString(flowStartTime)).append("\n");
    sb.append("    flowStatus: ").append(toIndentedString(flowStatus)).append("\n");
    sb.append("    noticeDeveloperUrl: ").append(toIndentedString(noticeDeveloperUrl)).append("\n");
    sb.append("    signValidity: ").append(toIndentedString(signValidity)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
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
    openapiFields.add("business_scene");
    openapiFields.add("contract_validity");
    openapiFields.add("flow_desc");
    openapiFields.add("flow_end_time");
    openapiFields.add("flow_id");
    openapiFields.add("flow_start_time");
    openapiFields.add("flow_status");
    openapiFields.add("notice_developer_url");
    openapiFields.add("sign_validity");
    openapiFields.add("signers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoSignFlowQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoSignFlowQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoSignFlowQueryResponseModel is not found in the empty JSON string", AlipayEcoSignFlowQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEcoSignFlowQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEcoSignFlowQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("business_scene") != null && !jsonObj.get("business_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_scene").toString()));
      }
      if (jsonObj.get("flow_desc") != null && !jsonObj.get("flow_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flow_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flow_desc").toString()));
      }
      if (jsonObj.get("flow_id") != null && !jsonObj.get("flow_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flow_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flow_id").toString()));
      }
      if (jsonObj.get("notice_developer_url") != null && !jsonObj.get("notice_developer_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notice_developer_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notice_developer_url").toString()));
      }
      JsonArray jsonArraysigners = jsonObj.getAsJsonArray("signers");
      if (jsonArraysigners != null) {
        // ensure the json data is an array
        if (!jsonObj.get("signers").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `signers` to be an array in the JSON string but got `%s`", jsonObj.get("signers").toString()));
        }

        // validate the optional field `signers` (array)
        for (int i = 0; i < jsonArraysigners.size(); i++) {
          FlowSigner.validateJsonObject(jsonArraysigners.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoSignFlowQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoSignFlowQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoSignFlowQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoSignFlowQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoSignFlowQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoSignFlowQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEcoSignFlowQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEcoSignFlowQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoSignFlowQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoSignFlowQueryResponseModel
  */
  public static AlipayEcoSignFlowQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoSignFlowQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEcoSignFlowQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
