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
 * EcVoucherInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EcVoucherInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_VOUCHER_CONTENT = "voucher_content";
  @SerializedName(SERIALIZED_NAME_VOUCHER_CONTENT)
  private String voucherContent;

  public static final String SERIALIZED_NAME_VOUCHER_DATE = "voucher_date";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DATE)
  private String voucherDate;

  public static final String SERIALIZED_NAME_VOUCHER_ID = "voucher_id";
  @SerializedName(SERIALIZED_NAME_VOUCHER_ID)
  private String voucherId;

  public static final String SERIALIZED_NAME_VOUCHER_SOURCE = "voucher_source";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SOURCE)
  private String voucherSource;

  public static final String SERIALIZED_NAME_VOUCHER_TYPE = "voucher_type";
  @SerializedName(SERIALIZED_NAME_VOUCHER_TYPE)
  private String voucherType;

  public EcVoucherInfo() { 
  }

  public EcVoucherInfo accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000000000000", value = "共同账户ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public EcVoucherInfo employeeId(String employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * 员工ID，汇总发票该字段无效
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000000000000", value = "员工ID，汇总发票该字段无效")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public EcVoucherInfo enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业ID
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000000000000", value = "企业ID")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public EcVoucherInfo openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 员工支付宝UID
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "员工支付宝UID")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public EcVoucherInfo userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 员工支付宝UID
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000000000000", value = "员工支付宝UID")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public EcVoucherInfo voucherContent(String voucherContent) {
    
    this.voucherContent = voucherContent;
    return this;
  }

   /**
   * 凭证内容
   * @return voucherContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\\\"key\\\":\\\"value\\\"}", value = "凭证内容")

  public String getVoucherContent() {
    return voucherContent;
  }


  public void setVoucherContent(String voucherContent) {
    this.voucherContent = voucherContent;
  }


  public EcVoucherInfo voucherDate(String voucherDate) {
    
    this.voucherDate = voucherDate;
    return this;
  }

   /**
   * 凭证创建时间，格式：yyyy-MM-dd HH:mm:ss
   * @return voucherDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "无", value = "凭证创建时间，格式：yyyy-MM-dd HH:mm:ss")

  public String getVoucherDate() {
    return voucherDate;
  }


  public void setVoucherDate(String voucherDate) {
    this.voucherDate = voucherDate;
  }


  public EcVoucherInfo voucherId(String voucherId) {
    
    this.voucherId = voucherId;
    return this;
  }

   /**
   * 凭证ID，幂等用
   * @return voucherId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088010100000000000000000000", value = "凭证ID，幂等用")

  public String getVoucherId() {
    return voucherId;
  }


  public void setVoucherId(String voucherId) {
    this.voucherId = voucherId;
  }


  public EcVoucherInfo voucherSource(String voucherSource) {
    
    this.voucherSource = voucherSource;
    return this;
  }

   /**
   * 凭证来源
   * @return voucherSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OCR", value = "凭证来源")

  public String getVoucherSource() {
    return voucherSource;
  }


  public void setVoucherSource(String voucherSource) {
    this.voucherSource = voucherSource;
  }


  public EcVoucherInfo voucherType(String voucherType) {
    
    this.voucherType = voucherType;
    return this;
  }

   /**
   * 凭证类型
   * @return voucherType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Invoice", value = "凭证类型")

  public String getVoucherType() {
    return voucherType;
  }


  public void setVoucherType(String voucherType) {
    this.voucherType = voucherType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EcVoucherInfo ecVoucherInfo = (EcVoucherInfo) o;
    return Objects.equals(this.accountId, ecVoucherInfo.accountId) &&
        Objects.equals(this.employeeId, ecVoucherInfo.employeeId) &&
        Objects.equals(this.enterpriseId, ecVoucherInfo.enterpriseId) &&
        Objects.equals(this.openId, ecVoucherInfo.openId) &&
        Objects.equals(this.userId, ecVoucherInfo.userId) &&
        Objects.equals(this.voucherContent, ecVoucherInfo.voucherContent) &&
        Objects.equals(this.voucherDate, ecVoucherInfo.voucherDate) &&
        Objects.equals(this.voucherId, ecVoucherInfo.voucherId) &&
        Objects.equals(this.voucherSource, ecVoucherInfo.voucherSource) &&
        Objects.equals(this.voucherType, ecVoucherInfo.voucherType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, employeeId, enterpriseId, openId, userId, voucherContent, voucherDate, voucherId, voucherSource, voucherType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcVoucherInfo {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    voucherContent: ").append(toIndentedString(voucherContent)).append("\n");
    sb.append("    voucherDate: ").append(toIndentedString(voucherDate)).append("\n");
    sb.append("    voucherId: ").append(toIndentedString(voucherId)).append("\n");
    sb.append("    voucherSource: ").append(toIndentedString(voucherSource)).append("\n");
    sb.append("    voucherType: ").append(toIndentedString(voucherType)).append("\n");
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
    openapiFields.add("employee_id");
    openapiFields.add("enterprise_id");
    openapiFields.add("open_id");
    openapiFields.add("user_id");
    openapiFields.add("voucher_content");
    openapiFields.add("voucher_date");
    openapiFields.add("voucher_id");
    openapiFields.add("voucher_source");
    openapiFields.add("voucher_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EcVoucherInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EcVoucherInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EcVoucherInfo is not found in the empty JSON string", EcVoucherInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EcVoucherInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EcVoucherInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("employee_id") != null && !jsonObj.get("employee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_id").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if (jsonObj.get("voucher_content") != null && !jsonObj.get("voucher_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_content").toString()));
      }
      if (jsonObj.get("voucher_date") != null && !jsonObj.get("voucher_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_date").toString()));
      }
      if (jsonObj.get("voucher_id") != null && !jsonObj.get("voucher_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_id").toString()));
      }
      if (jsonObj.get("voucher_source") != null && !jsonObj.get("voucher_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_source").toString()));
      }
      if (jsonObj.get("voucher_type") != null && !jsonObj.get("voucher_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EcVoucherInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EcVoucherInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EcVoucherInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EcVoucherInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<EcVoucherInfo>() {
           @Override
           public void write(JsonWriter out, EcVoucherInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EcVoucherInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EcVoucherInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EcVoucherInfo
  * @throws IOException if the JSON string is invalid with respect to EcVoucherInfo
  */
  public static EcVoucherInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EcVoucherInfo.class);
  }

 /**
  * Convert an instance of EcVoucherInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
