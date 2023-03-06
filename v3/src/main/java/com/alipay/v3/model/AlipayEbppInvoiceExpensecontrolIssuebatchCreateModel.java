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
import com.alipay.v3.model.IssueTargetInfoContent;
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
 * AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_BATCH_NO = "batch_no";
  @SerializedName(SERIALIZED_NAME_BATCH_NO)
  private String batchNo;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "effective_end_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private String effectiveEndDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "effective_start_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private String effectiveStartDate;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_ISSUE_DESC = "issue_desc";
  @SerializedName(SERIALIZED_NAME_ISSUE_DESC)
  private String issueDesc;

  public static final String SERIALIZED_NAME_ISSUE_NAME = "issue_name";
  @SerializedName(SERIALIZED_NAME_ISSUE_NAME)
  private String issueName;

  public static final String SERIALIZED_NAME_ISSUE_TARGET_INFO_LIST = "issue_target_info_list";
  @SerializedName(SERIALIZED_NAME_ISSUE_TARGET_INFO_LIST)
  private List<IssueTargetInfoContent> issueTargetInfoList = null;

  public static final String SERIALIZED_NAME_QUOTA_TYPE = "quota_type";
  @SerializedName(SERIALIZED_NAME_QUOTA_TYPE)
  private String quotaType;

  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private String shareMode;

  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel() { 
  }

  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户id - 适用于在企业码小程序创建的共同账户，和agreement_no搭配使用
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "共同账户id - 适用于在企业码小程序创建的共同账户，和agreement_no搭配使用")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20215425001112341234", value = "授权签约协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel batchNo(String batchNo) {
    
    this.batchNo = batchNo;
    return this;
  }

   /**
   * 发放批次号，用于幂等校验本次发放
   * @return batchNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022062800152622440000009966", value = "发放批次号，用于幂等校验本次发放")

  public String getBatchNo() {
    return batchNo;
  }


  public void setBatchNo(String batchNo) {
    this.batchNo = batchNo;
  }


  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel effectiveEndDate(String effectiveEndDate) {
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * 额度有效结束时间
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01 12:00:00", value = "额度有效结束时间")

  public String getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(String effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
  }


  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel effectiveStartDate(String effectiveStartDate) {
    
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * 额度有效起始时间
   * @return effectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01 12:00:00", value = "额度有效起始时间")

  public String getEffectiveStartDate() {
    return effectiveStartDate;
  }


  public void setEffectiveStartDate(String effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
  }


  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业ID - 适用于在企业码PC端创建的企业账号
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业ID - 适用于在企业码PC端创建的企业账号")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * 制度id
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022052000152618690000000005", value = "制度id")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel issueDesc(String issueDesc) {
    
    this.issueDesc = issueDesc;
    return this;
  }

   /**
   * 发放说明
   * @return issueDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "发放餐补", value = "发放说明")

  public String getIssueDesc() {
    return issueDesc;
  }


  public void setIssueDesc(String issueDesc) {
    this.issueDesc = issueDesc;
  }


  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel issueName(String issueName) {
    
    this.issueName = issueName;
    return this;
  }

   /**
   * 发放名称
   * @return issueName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "发放餐补", value = "发放名称")

  public String getIssueName() {
    return issueName;
  }


  public void setIssueName(String issueName) {
    this.issueName = issueName;
  }


  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel issueTargetInfoList(List<IssueTargetInfoContent> issueTargetInfoList) {
    
    this.issueTargetInfoList = issueTargetInfoList;
    return this;
  }

  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel addIssueTargetInfoListItem(IssueTargetInfoContent issueTargetInfoListItem) {
    if (this.issueTargetInfoList == null) {
      this.issueTargetInfoList = new ArrayList<>();
    }
    this.issueTargetInfoList.add(issueTargetInfoListItem);
    return this;
  }

   /**
   * 员工发放信息列表
   * @return issueTargetInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "员工发放信息列表")

  public List<IssueTargetInfoContent> getIssueTargetInfoList() {
    return issueTargetInfoList;
  }


  public void setIssueTargetInfoList(List<IssueTargetInfoContent> issueTargetInfoList) {
    this.issueTargetInfoList = issueTargetInfoList;
  }


  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel quotaType(String quotaType) {
    
    this.quotaType = quotaType;
    return this;
  }

   /**
   * 额度类型
   * @return quotaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COUPON", value = "额度类型")

  public String getQuotaType() {
    return quotaType;
  }


  public void setQuotaType(String quotaType) {
    this.quotaType = quotaType;
  }


  public AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel shareMode(String shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * 是否可转赠，枚举：0（不可转赠）、1（可转赠）
   * @return shareMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "是否可转赠，枚举：0（不可转赠）、1（可转赠）")

  public String getShareMode() {
    return shareMode;
  }


  public void setShareMode(String shareMode) {
    this.shareMode = shareMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel alipayEbppInvoiceExpensecontrolIssuebatchCreateModel = (AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceExpensecontrolIssuebatchCreateModel.accountId) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceExpensecontrolIssuebatchCreateModel.agreementNo) &&
        Objects.equals(this.batchNo, alipayEbppInvoiceExpensecontrolIssuebatchCreateModel.batchNo) &&
        Objects.equals(this.effectiveEndDate, alipayEbppInvoiceExpensecontrolIssuebatchCreateModel.effectiveEndDate) &&
        Objects.equals(this.effectiveStartDate, alipayEbppInvoiceExpensecontrolIssuebatchCreateModel.effectiveStartDate) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceExpensecontrolIssuebatchCreateModel.enterpriseId) &&
        Objects.equals(this.institutionId, alipayEbppInvoiceExpensecontrolIssuebatchCreateModel.institutionId) &&
        Objects.equals(this.issueDesc, alipayEbppInvoiceExpensecontrolIssuebatchCreateModel.issueDesc) &&
        Objects.equals(this.issueName, alipayEbppInvoiceExpensecontrolIssuebatchCreateModel.issueName) &&
        Objects.equals(this.issueTargetInfoList, alipayEbppInvoiceExpensecontrolIssuebatchCreateModel.issueTargetInfoList) &&
        Objects.equals(this.quotaType, alipayEbppInvoiceExpensecontrolIssuebatchCreateModel.quotaType) &&
        Objects.equals(this.shareMode, alipayEbppInvoiceExpensecontrolIssuebatchCreateModel.shareMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, batchNo, effectiveEndDate, effectiveStartDate, enterpriseId, institutionId, issueDesc, issueName, issueTargetInfoList, quotaType, shareMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    batchNo: ").append(toIndentedString(batchNo)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    issueDesc: ").append(toIndentedString(issueDesc)).append("\n");
    sb.append("    issueName: ").append(toIndentedString(issueName)).append("\n");
    sb.append("    issueTargetInfoList: ").append(toIndentedString(issueTargetInfoList)).append("\n");
    sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
    sb.append("    shareMode: ").append(toIndentedString(shareMode)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("agreement_no");
    openapiFields.add("batch_no");
    openapiFields.add("effective_end_date");
    openapiFields.add("effective_start_date");
    openapiFields.add("enterprise_id");
    openapiFields.add("institution_id");
    openapiFields.add("issue_desc");
    openapiFields.add("issue_name");
    openapiFields.add("issue_target_info_list");
    openapiFields.add("quota_type");
    openapiFields.add("share_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel is not found in the empty JSON string", AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("batch_no") != null && !jsonObj.get("batch_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_no").toString()));
      }
      if (jsonObj.get("effective_end_date") != null && !jsonObj.get("effective_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_end_date").toString()));
      }
      if (jsonObj.get("effective_start_date") != null && !jsonObj.get("effective_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_start_date").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("institution_id") != null && !jsonObj.get("institution_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_id").toString()));
      }
      if (jsonObj.get("issue_desc") != null && !jsonObj.get("issue_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_desc").toString()));
      }
      if (jsonObj.get("issue_name") != null && !jsonObj.get("issue_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_name").toString()));
      }
      JsonArray jsonArrayissueTargetInfoList = jsonObj.getAsJsonArray("issue_target_info_list");
      if (jsonArrayissueTargetInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("issue_target_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `issue_target_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("issue_target_info_list").toString()));
        }

        // validate the optional field `issue_target_info_list` (array)
        for (int i = 0; i < jsonArrayissueTargetInfoList.size(); i++) {
          IssueTargetInfoContent.validateJsonObject(jsonArrayissueTargetInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("quota_type") != null && !jsonObj.get("quota_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_type").toString()));
      }
      if (jsonObj.get("share_mode") != null && !jsonObj.get("share_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `share_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("share_mode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel
  */
  public static AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
