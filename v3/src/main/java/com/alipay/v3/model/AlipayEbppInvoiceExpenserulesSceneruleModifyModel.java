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
import com.alipay.v3.model.ExpenseCtrRuleInfo;
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
 * AlipayEbppInvoiceExpenserulesSceneruleModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceExpenserulesSceneruleModifyModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "effective_end_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private String effectiveEndDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "effective_start_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private String effectiveStartDate;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_EXPENSE_CTRL_RULE_INFO_LIST = "expense_ctrl_rule_info_list";
  @SerializedName(SERIALIZED_NAME_EXPENSE_CTRL_RULE_INFO_LIST)
  private List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList = null;

  public static final String SERIALIZED_NAME_PAYMENT_POLICY = "payment_policy";
  @SerializedName(SERIALIZED_NAME_PAYMENT_POLICY)
  private String paymentPolicy;

  public static final String SERIALIZED_NAME_STANDARD_DESC = "standard_desc";
  @SerializedName(SERIALIZED_NAME_STANDARD_DESC)
  private String standardDesc;

  public static final String SERIALIZED_NAME_STANDARD_ID = "standard_id";
  @SerializedName(SERIALIZED_NAME_STANDARD_ID)
  private String standardId;

  public static final String SERIALIZED_NAME_STANDARD_NAME = "standard_name";
  @SerializedName(SERIALIZED_NAME_STANDARD_NAME)
  private String standardName;

  public AlipayEbppInvoiceExpenserulesSceneruleModifyModel() { 
  }

  public AlipayEbppInvoiceExpenserulesSceneruleModifyModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceExpenserulesSceneruleModifyModel action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * 修改操作 枚举值： ADD_RULE（新增费控条件），DELETE_RULE（删除费控条件），MODIFY_RULE（修改费控条件），MODIFY_STANDARD（修改费控规则基本信息）
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ADD_RULE", value = "修改操作 枚举值： ADD_RULE（新增费控条件），DELETE_RULE（删除费控条件），MODIFY_RULE（修改费控条件），MODIFY_STANDARD（修改费控规则基本信息）")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public AlipayEbppInvoiceExpenserulesSceneruleModifyModel agreementNo(String agreementNo) {
    
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


  public AlipayEbppInvoiceExpenserulesSceneruleModifyModel effectiveEndDate(String effectiveEndDate) {
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * 有效期截止 特殊说明：修改费控规则基本信息时必传
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-27 00:00:00", value = "有效期截止 特殊说明：修改费控规则基本信息时必传")

  public String getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(String effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
  }


  public AlipayEbppInvoiceExpenserulesSceneruleModifyModel effectiveStartDate(String effectiveStartDate) {
    
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * 有效期起始 特殊说明：修改费控规则基本信息时必传
   * @return effectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-26 00:00:00", value = "有效期起始 特殊说明：修改费控规则基本信息时必传")

  public String getEffectiveStartDate() {
    return effectiveStartDate;
  }


  public void setEffectiveStartDate(String effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
  }


  public AlipayEbppInvoiceExpenserulesSceneruleModifyModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业码企业id
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业码企业id")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceExpenserulesSceneruleModifyModel expenseCtrlRuleInfoList(List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList) {
    
    this.expenseCtrlRuleInfoList = expenseCtrlRuleInfoList;
    return this;
  }

  public AlipayEbppInvoiceExpenserulesSceneruleModifyModel addExpenseCtrlRuleInfoListItem(ExpenseCtrRuleInfo expenseCtrlRuleInfoListItem) {
    if (this.expenseCtrlRuleInfoList == null) {
      this.expenseCtrlRuleInfoList = new ArrayList<>();
    }
    this.expenseCtrlRuleInfoList.add(expenseCtrlRuleInfoListItem);
    return this;
  }

   /**
   * 费控规则条件列表 特殊说明：新增费控条件/修改费控条件/删除费控条件操作时必填
   * @return expenseCtrlRuleInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "费控规则条件列表 特殊说明：新增费控条件/修改费控条件/删除费控条件操作时必填")

  public List<ExpenseCtrRuleInfo> getExpenseCtrlRuleInfoList() {
    return expenseCtrlRuleInfoList;
  }


  public void setExpenseCtrlRuleInfoList(List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList) {
    this.expenseCtrlRuleInfoList = expenseCtrlRuleInfoList;
  }


  public AlipayEbppInvoiceExpenserulesSceneruleModifyModel paymentPolicy(String paymentPolicy) {
    
    this.paymentPolicy = paymentPolicy;
    return this;
  }

   /**
   * 当笔消费金额大于规则可用余额时，用于控制支付策略，该字段缺省时采取因公账户和个人账户组合支付策略， 枚举值：PERSONAL（全部个人账户支付）, COMBINATION（因公账户和个人账户组合支付）
   * @return paymentPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PERSONAL", value = "当笔消费金额大于规则可用余额时，用于控制支付策略，该字段缺省时采取因公账户和个人账户组合支付策略， 枚举值：PERSONAL（全部个人账户支付）, COMBINATION（因公账户和个人账户组合支付）")

  public String getPaymentPolicy() {
    return paymentPolicy;
  }


  public void setPaymentPolicy(String paymentPolicy) {
    this.paymentPolicy = paymentPolicy;
  }


  public AlipayEbppInvoiceExpenserulesSceneruleModifyModel standardDesc(String standardDesc) {
    
    this.standardDesc = standardDesc;
    return this;
  }

   /**
   * 费控规则说明 特殊说明： 1）敏感词校验 2）修改费控规则基本信息时必传
   * @return standardDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "费控规则说明", value = "费控规则说明 特殊说明： 1）敏感词校验 2）修改费控规则基本信息时必传")

  public String getStandardDesc() {
    return standardDesc;
  }


  public void setStandardDesc(String standardDesc) {
    this.standardDesc = standardDesc;
  }


  public AlipayEbppInvoiceExpenserulesSceneruleModifyModel standardId(String standardId) {
    
    this.standardId = standardId;
    return this;
  }

   /**
   * 费控规则ID
   * @return standardId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021062800152601350000001466", value = "费控规则ID")

  public String getStandardId() {
    return standardId;
  }


  public void setStandardId(String standardId) {
    this.standardId = standardId;
  }


  public AlipayEbppInvoiceExpenserulesSceneruleModifyModel standardName(String standardName) {
    
    this.standardName = standardName;
    return this;
  }

   /**
   * 费控规则名称 特殊说明： 1）敏感词校验 2）修改费控规则基本信息时必传 3）不能重复，若需要重复联系支持人员定向放开
   * @return standardName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "费控规则名称", value = "费控规则名称 特殊说明： 1）敏感词校验 2）修改费控规则基本信息时必传 3）不能重复，若需要重复联系支持人员定向放开")

  public String getStandardName() {
    return standardName;
  }


  public void setStandardName(String standardName) {
    this.standardName = standardName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceExpenserulesSceneruleModifyModel alipayEbppInvoiceExpenserulesSceneruleModifyModel = (AlipayEbppInvoiceExpenserulesSceneruleModifyModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceExpenserulesSceneruleModifyModel.accountId) &&
        Objects.equals(this.action, alipayEbppInvoiceExpenserulesSceneruleModifyModel.action) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceExpenserulesSceneruleModifyModel.agreementNo) &&
        Objects.equals(this.effectiveEndDate, alipayEbppInvoiceExpenserulesSceneruleModifyModel.effectiveEndDate) &&
        Objects.equals(this.effectiveStartDate, alipayEbppInvoiceExpenserulesSceneruleModifyModel.effectiveStartDate) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceExpenserulesSceneruleModifyModel.enterpriseId) &&
        Objects.equals(this.expenseCtrlRuleInfoList, alipayEbppInvoiceExpenserulesSceneruleModifyModel.expenseCtrlRuleInfoList) &&
        Objects.equals(this.paymentPolicy, alipayEbppInvoiceExpenserulesSceneruleModifyModel.paymentPolicy) &&
        Objects.equals(this.standardDesc, alipayEbppInvoiceExpenserulesSceneruleModifyModel.standardDesc) &&
        Objects.equals(this.standardId, alipayEbppInvoiceExpenserulesSceneruleModifyModel.standardId) &&
        Objects.equals(this.standardName, alipayEbppInvoiceExpenserulesSceneruleModifyModel.standardName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, action, agreementNo, effectiveEndDate, effectiveStartDate, enterpriseId, expenseCtrlRuleInfoList, paymentPolicy, standardDesc, standardId, standardName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceExpenserulesSceneruleModifyModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    expenseCtrlRuleInfoList: ").append(toIndentedString(expenseCtrlRuleInfoList)).append("\n");
    sb.append("    paymentPolicy: ").append(toIndentedString(paymentPolicy)).append("\n");
    sb.append("    standardDesc: ").append(toIndentedString(standardDesc)).append("\n");
    sb.append("    standardId: ").append(toIndentedString(standardId)).append("\n");
    sb.append("    standardName: ").append(toIndentedString(standardName)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("agreement_no");
    openapiFields.add("effective_end_date");
    openapiFields.add("effective_start_date");
    openapiFields.add("enterprise_id");
    openapiFields.add("expense_ctrl_rule_info_list");
    openapiFields.add("payment_policy");
    openapiFields.add("standard_desc");
    openapiFields.add("standard_id");
    openapiFields.add("standard_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceExpenserulesSceneruleModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceExpenserulesSceneruleModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceExpenserulesSceneruleModifyModel is not found in the empty JSON string", AlipayEbppInvoiceExpenserulesSceneruleModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceExpenserulesSceneruleModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceExpenserulesSceneruleModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
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
      JsonArray jsonArrayexpenseCtrlRuleInfoList = jsonObj.getAsJsonArray("expense_ctrl_rule_info_list");
      if (jsonArrayexpenseCtrlRuleInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("expense_ctrl_rule_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `expense_ctrl_rule_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("expense_ctrl_rule_info_list").toString()));
        }

        // validate the optional field `expense_ctrl_rule_info_list` (array)
        for (int i = 0; i < jsonArrayexpenseCtrlRuleInfoList.size(); i++) {
          ExpenseCtrRuleInfo.validateJsonObject(jsonArrayexpenseCtrlRuleInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("payment_policy") != null && !jsonObj.get("payment_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_policy").toString()));
      }
      if (jsonObj.get("standard_desc") != null && !jsonObj.get("standard_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_desc").toString()));
      }
      if (jsonObj.get("standard_id") != null && !jsonObj.get("standard_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_id").toString()));
      }
      if (jsonObj.get("standard_name") != null && !jsonObj.get("standard_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceExpenserulesSceneruleModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceExpenserulesSceneruleModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceExpenserulesSceneruleModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceExpenserulesSceneruleModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceExpenserulesSceneruleModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceExpenserulesSceneruleModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceExpenserulesSceneruleModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceExpenserulesSceneruleModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceExpenserulesSceneruleModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceExpenserulesSceneruleModifyModel
  */
  public static AlipayEbppInvoiceExpenserulesSceneruleModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceExpenserulesSceneruleModifyModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceExpenserulesSceneruleModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
