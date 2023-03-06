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
 * AlipayOpenMiniInnerappPluginrelationQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerappPluginrelationQueryModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MINI_APP_ID_LIST = "mini_app_id_list";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID_LIST)
  private List<String> miniAppIdList = null;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_PLUGIN_ID = "plugin_id";
  @SerializedName(SERIALIZED_NAME_PLUGIN_ID)
  private String pluginId;

  public static final String SERIALIZED_NAME_PLUGIN_RELATION_STATUS_LIST = "plugin_relation_status_list";
  @SerializedName(SERIALIZED_NAME_PLUGIN_RELATION_STATUS_LIST)
  private List<String> pluginRelationStatusList = null;

  public static final String SERIALIZED_NAME_RUN_MODEL_TYPE = "run_model_type";
  @SerializedName(SERIALIZED_NAME_RUN_MODEL_TYPE)
  private String runModelType;

  public static final String SERIALIZED_NAME_SHOW_BETA_INFO = "show_beta_info";
  @SerializedName(SERIALIZED_NAME_SHOW_BETA_INFO)
  private Boolean showBetaInfo;

  public AlipayOpenMiniInnerappPluginrelationQueryModel() { 
  }

  public AlipayOpenMiniInnerappPluginrelationQueryModel miniAppIdList(List<String> miniAppIdList) {
    
    this.miniAppIdList = miniAppIdList;
    return this;
  }

  public AlipayOpenMiniInnerappPluginrelationQueryModel addMiniAppIdListItem(String miniAppIdListItem) {
    if (this.miniAppIdList == null) {
      this.miniAppIdList = new ArrayList<>();
    }
    this.miniAppIdList.add(miniAppIdListItem);
    return this;
  }

   /**
   * 应用ID列表
   * @return miniAppIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "['2012211102012056','2012211102012057']", value = "应用ID列表")

  public List<String> getMiniAppIdList() {
    return miniAppIdList;
  }


  public void setMiniAppIdList(List<String> miniAppIdList) {
    this.miniAppIdList = miniAppIdList;
  }


  public AlipayOpenMiniInnerappPluginrelationQueryModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 页码
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "页码")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayOpenMiniInnerappPluginrelationQueryModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 页大小
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "页大小")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayOpenMiniInnerappPluginrelationQueryModel pluginId(String pluginId) {
    
    this.pluginId = pluginId;
    return this;
  }

   /**
   * 插件ID
   * @return pluginId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012211102012088", value = "插件ID")

  public String getPluginId() {
    return pluginId;
  }


  public void setPluginId(String pluginId) {
    this.pluginId = pluginId;
  }


  public AlipayOpenMiniInnerappPluginrelationQueryModel pluginRelationStatusList(List<String> pluginRelationStatusList) {
    
    this.pluginRelationStatusList = pluginRelationStatusList;
    return this;
  }

  public AlipayOpenMiniInnerappPluginrelationQueryModel addPluginRelationStatusListItem(String pluginRelationStatusListItem) {
    if (this.pluginRelationStatusList == null) {
      this.pluginRelationStatusList = new ArrayList<>();
    }
    this.pluginRelationStatusList.add(pluginRelationStatusListItem);
    return this;
  }

   /**
   * 插件使用关系状态，取值包括WORKING/WAIT_WORKING/STOP_WORKING/EXECUTING
   * @return pluginRelationStatusList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"WORKING\"]", value = "插件使用关系状态，取值包括WORKING/WAIT_WORKING/STOP_WORKING/EXECUTING")

  public List<String> getPluginRelationStatusList() {
    return pluginRelationStatusList;
  }


  public void setPluginRelationStatusList(List<String> pluginRelationStatusList) {
    this.pluginRelationStatusList = pluginRelationStatusList;
  }


  public AlipayOpenMiniInnerappPluginrelationQueryModel runModelType(String runModelType) {
    
    this.runModelType = runModelType;
    return this;
  }

   /**
   * 运行类型，取值包括ONLINE/TRIAL/REVIEW/DEBUG
   * @return runModelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ONLINE", value = "运行类型，取值包括ONLINE/TRIAL/REVIEW/DEBUG")

  public String getRunModelType() {
    return runModelType;
  }


  public void setRunModelType(String runModelType) {
    this.runModelType = runModelType;
  }


  public AlipayOpenMiniInnerappPluginrelationQueryModel showBetaInfo(Boolean showBetaInfo) {
    
    this.showBetaInfo = showBetaInfo;
    return this;
  }

   /**
   * 是否展示邀测信息
   * @return showBetaInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否展示邀测信息")

  public Boolean getShowBetaInfo() {
    return showBetaInfo;
  }


  public void setShowBetaInfo(Boolean showBetaInfo) {
    this.showBetaInfo = showBetaInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniInnerappPluginrelationQueryModel alipayOpenMiniInnerappPluginrelationQueryModel = (AlipayOpenMiniInnerappPluginrelationQueryModel) o;
    return Objects.equals(this.miniAppIdList, alipayOpenMiniInnerappPluginrelationQueryModel.miniAppIdList) &&
        Objects.equals(this.pageNum, alipayOpenMiniInnerappPluginrelationQueryModel.pageNum) &&
        Objects.equals(this.pageSize, alipayOpenMiniInnerappPluginrelationQueryModel.pageSize) &&
        Objects.equals(this.pluginId, alipayOpenMiniInnerappPluginrelationQueryModel.pluginId) &&
        Objects.equals(this.pluginRelationStatusList, alipayOpenMiniInnerappPluginrelationQueryModel.pluginRelationStatusList) &&
        Objects.equals(this.runModelType, alipayOpenMiniInnerappPluginrelationQueryModel.runModelType) &&
        Objects.equals(this.showBetaInfo, alipayOpenMiniInnerappPluginrelationQueryModel.showBetaInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(miniAppIdList, pageNum, pageSize, pluginId, pluginRelationStatusList, runModelType, showBetaInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerappPluginrelationQueryModel {\n");
    sb.append("    miniAppIdList: ").append(toIndentedString(miniAppIdList)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
    sb.append("    pluginRelationStatusList: ").append(toIndentedString(pluginRelationStatusList)).append("\n");
    sb.append("    runModelType: ").append(toIndentedString(runModelType)).append("\n");
    sb.append("    showBetaInfo: ").append(toIndentedString(showBetaInfo)).append("\n");
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
    openapiFields.add("mini_app_id_list");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("plugin_id");
    openapiFields.add("plugin_relation_status_list");
    openapiFields.add("run_model_type");
    openapiFields.add("show_beta_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerappPluginrelationQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerappPluginrelationQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerappPluginrelationQueryModel is not found in the empty JSON string", AlipayOpenMiniInnerappPluginrelationQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniInnerappPluginrelationQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniInnerappPluginrelationQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("mini_app_id_list") != null && !jsonObj.get("mini_app_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("mini_app_id_list").toString()));
      }
      if (jsonObj.get("plugin_id") != null && !jsonObj.get("plugin_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("plugin_relation_status_list") != null && !jsonObj.get("plugin_relation_status_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_relation_status_list` to be an array in the JSON string but got `%s`", jsonObj.get("plugin_relation_status_list").toString()));
      }
      if (jsonObj.get("run_model_type") != null && !jsonObj.get("run_model_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `run_model_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("run_model_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerappPluginrelationQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerappPluginrelationQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerappPluginrelationQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerappPluginrelationQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerappPluginrelationQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerappPluginrelationQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniInnerappPluginrelationQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniInnerappPluginrelationQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerappPluginrelationQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerappPluginrelationQueryModel
  */
  public static AlipayOpenMiniInnerappPluginrelationQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerappPluginrelationQueryModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerappPluginrelationQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
