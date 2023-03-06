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
 * SearchBoxKeyWordModule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchBoxKeyWordModule {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APPLY_NO = "apply_no";
  @SerializedName(SERIALIZED_NAME_APPLY_NO)
  private String applyNo;

  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords = null;

  public static final String SERIALIZED_NAME_LATEST_AUDIT_KEYWORDS = "latest_audit_keywords";
  @SerializedName(SERIALIZED_NAME_LATEST_AUDIT_KEYWORDS)
  private List<String> latestAuditKeywords = null;

  public static final String SERIALIZED_NAME_MODULE_ID = "module_id";
  @SerializedName(SERIALIZED_NAME_MODULE_ID)
  private String moduleId;

  public static final String SERIALIZED_NAME_MODULE_TYPE = "module_type";
  @SerializedName(SERIALIZED_NAME_MODULE_TYPE)
  private String moduleType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public SearchBoxKeyWordModule() { 
  }

  public SearchBoxKeyWordModule applyNo(String applyNo) {
    
    this.applyNo = applyNo;
    return this;
  }

   /**
   * 申请单号
   * @return applyNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022010700503000000000487728", value = "申请单号")

  public String getApplyNo() {
    return applyNo;
  }


  public void setApplyNo(String applyNo) {
    this.applyNo = applyNo;
  }


  public SearchBoxKeyWordModule failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 审核失败原因
   * @return failReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "品牌触发词必须完整包含品牌名称且不得使用泛词，建议调整。", value = "审核失败原因")

  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public SearchBoxKeyWordModule gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 修改时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-07 18:22:04", value = "修改时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public SearchBoxKeyWordModule keywords(List<String> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public SearchBoxKeyWordModule addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * 自定义触发词(生效中)
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"自定义触发词\"]", value = "自定义触发词(生效中)")

  public List<String> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public SearchBoxKeyWordModule latestAuditKeywords(List<String> latestAuditKeywords) {
    
    this.latestAuditKeywords = latestAuditKeywords;
    return this;
  }

  public SearchBoxKeyWordModule addLatestAuditKeywordsItem(String latestAuditKeywordsItem) {
    if (this.latestAuditKeywords == null) {
      this.latestAuditKeywords = new ArrayList<>();
    }
    this.latestAuditKeywords.add(latestAuditKeywordsItem);
    return this;
  }

   /**
   * 自定义触发词(最近一次审核内容)
   * @return latestAuditKeywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"自定义触发词\"]", value = "自定义触发词(最近一次审核内容)")

  public List<String> getLatestAuditKeywords() {
    return latestAuditKeywords;
  }


  public void setLatestAuditKeywords(List<String> latestAuditKeywords) {
    this.latestAuditKeywords = latestAuditKeywords;
  }


  public SearchBoxKeyWordModule moduleId(String moduleId) {
    
    this.moduleId = moduleId;
    return this;
  }

   /**
   * 模块配置ID
   * @return moduleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20220308000000168465", value = "模块配置ID")

  public String getModuleId() {
    return moduleId;
  }


  public void setModuleId(String moduleId) {
    this.moduleId = moduleId;
  }


  public SearchBoxKeyWordModule moduleType(String moduleType) {
    
    this.moduleType = moduleType;
    return this;
  }

   /**
   * 搜索直达模块类型，BOX_EXCLUSIVE_BASE-基础信息/BOX_EXCLUSIVE_KEYWORD-关键词/BOX_EXCLUSIVE_FUNCTIONS-功能服务/BOX_EXCLUSIVE_ACCOUNTS-关联账号/BOX_ATMOSPHERE_IMAGE-氛围图
   * @return moduleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BOX_EXCLUSIVE_KEYWORD", value = "搜索直达模块类型，BOX_EXCLUSIVE_BASE-基础信息/BOX_EXCLUSIVE_KEYWORD-关键词/BOX_EXCLUSIVE_FUNCTIONS-功能服务/BOX_EXCLUSIVE_ACCOUNTS-关联账号/BOX_ATMOSPHERE_IMAGE-氛围图")

  public String getModuleType() {
    return moduleType;
  }


  public void setModuleType(String moduleType) {
    this.moduleType = moduleType;
  }


  public SearchBoxKeyWordModule status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 状态，INITIAL-初始/AUDIT-审核中/CANCEL-已取消/ONLINE-已上架/REJECT-驳回/OFFLINE-已下架/EXPIRE-已失效
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ONLINE", value = "状态，INITIAL-初始/AUDIT-审核中/CANCEL-已取消/ONLINE-已上架/REJECT-驳回/OFFLINE-已下架/EXPIRE-已失效")

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
    SearchBoxKeyWordModule searchBoxKeyWordModule = (SearchBoxKeyWordModule) o;
    return Objects.equals(this.applyNo, searchBoxKeyWordModule.applyNo) &&
        Objects.equals(this.failReason, searchBoxKeyWordModule.failReason) &&
        Objects.equals(this.gmtModified, searchBoxKeyWordModule.gmtModified) &&
        Objects.equals(this.keywords, searchBoxKeyWordModule.keywords) &&
        Objects.equals(this.latestAuditKeywords, searchBoxKeyWordModule.latestAuditKeywords) &&
        Objects.equals(this.moduleId, searchBoxKeyWordModule.moduleId) &&
        Objects.equals(this.moduleType, searchBoxKeyWordModule.moduleType) &&
        Objects.equals(this.status, searchBoxKeyWordModule.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyNo, failReason, gmtModified, keywords, latestAuditKeywords, moduleId, moduleType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchBoxKeyWordModule {\n");
    sb.append("    applyNo: ").append(toIndentedString(applyNo)).append("\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    latestAuditKeywords: ").append(toIndentedString(latestAuditKeywords)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
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
    openapiFields.add("apply_no");
    openapiFields.add("fail_reason");
    openapiFields.add("gmt_modified");
    openapiFields.add("keywords");
    openapiFields.add("latest_audit_keywords");
    openapiFields.add("module_id");
    openapiFields.add("module_type");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchBoxKeyWordModule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchBoxKeyWordModule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchBoxKeyWordModule is not found in the empty JSON string", SearchBoxKeyWordModule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchBoxKeyWordModule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchBoxKeyWordModule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("apply_no") != null && !jsonObj.get("apply_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_no").toString()));
      }
      if (jsonObj.get("fail_reason") != null && !jsonObj.get("fail_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fail_reason").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("keywords") != null && !jsonObj.get("keywords").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `keywords` to be an array in the JSON string but got `%s`", jsonObj.get("keywords").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("latest_audit_keywords") != null && !jsonObj.get("latest_audit_keywords").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `latest_audit_keywords` to be an array in the JSON string but got `%s`", jsonObj.get("latest_audit_keywords").toString()));
      }
      if (jsonObj.get("module_id") != null && !jsonObj.get("module_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module_id").toString()));
      }
      if (jsonObj.get("module_type") != null && !jsonObj.get("module_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module_type").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchBoxKeyWordModule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchBoxKeyWordModule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchBoxKeyWordModule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchBoxKeyWordModule.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchBoxKeyWordModule>() {
           @Override
           public void write(JsonWriter out, SearchBoxKeyWordModule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchBoxKeyWordModule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchBoxKeyWordModule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchBoxKeyWordModule
  * @throws IOException if the JSON string is invalid with respect to SearchBoxKeyWordModule
  */
  public static SearchBoxKeyWordModule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchBoxKeyWordModule.class);
  }

 /**
  * Convert an instance of SearchBoxKeyWordModule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
