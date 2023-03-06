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
 * JointAccountBillDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JointAccountBillDetail {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_BILL_NO = "bill_no";
  @SerializedName(SERIALIZED_NAME_BILL_NO)
  private String billNo;

  public static final String SERIALIZED_NAME_BIZ_DATE = "biz_date";
  @SerializedName(SERIALIZED_NAME_BIZ_DATE)
  private String bizDate;

  public static final String SERIALIZED_NAME_BIZ_NO = "biz_no";
  @SerializedName(SERIALIZED_NAME_BIZ_NO)
  private String bizNo;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_IN_OUT = "in_out";
  @SerializedName(SERIALIZED_NAME_IN_OUT)
  private String inOut;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public JointAccountBillDetail() { 
  }

  public JointAccountBillDetail amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 消费金额，单位：元
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.00", value = "消费金额，单位：元")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public JointAccountBillDetail billNo(String billNo) {
    
    this.billNo = billNo;
    return this;
  }

   /**
   * 账单业务号
   * @return billNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022051204200202001000473989_2022051230000200020601732777", value = "账单业务号")

  public String getBillNo() {
    return billNo;
  }


  public void setBillNo(String billNo) {
    this.billNo = billNo;
  }


  public JointAccountBillDetail bizDate(String bizDate) {
    
    this.bizDate = bizDate;
    return this;
  }

   /**
   * 业务时间
   * @return bizDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-05-01 00:00:00", value = "业务时间")

  public String getBizDate() {
    return bizDate;
  }


  public void setBizDate(String bizDate) {
    this.bizDate = bizDate;
  }


  public JointAccountBillDetail bizNo(String bizNo) {
    
    this.bizNo = bizNo;
    return this;
  }

   /**
   * 订单号
   * @return bizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020102604200204001063507418", value = "订单号")

  public String getBizNo() {
    return bizNo;
  }


  public void setBizNo(String bizNo) {
    this.bizNo = bizNo;
  }


  public JointAccountBillDetail enterpriseId(String enterpriseId) {
    
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


  public JointAccountBillDetail inOut(String inOut) {
    
    this.inOut = inOut;
    return this;
  }

   /**
   * 1-退款，2-支付
   * @return inOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "1-退款，2-支付")

  public String getInOut() {
    return inOut;
  }


  public void setInOut(String inOut) {
    this.inOut = inOut;
  }


  public JointAccountBillDetail openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 用户支付宝uid
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "用户支付宝uid")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public JointAccountBillDetail title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 账单标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "消费账单", value = "账单标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public JointAccountBillDetail userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 用户支付宝uid
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000000000000", value = "用户支付宝uid")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JointAccountBillDetail jointAccountBillDetail = (JointAccountBillDetail) o;
    return Objects.equals(this.amount, jointAccountBillDetail.amount) &&
        Objects.equals(this.billNo, jointAccountBillDetail.billNo) &&
        Objects.equals(this.bizDate, jointAccountBillDetail.bizDate) &&
        Objects.equals(this.bizNo, jointAccountBillDetail.bizNo) &&
        Objects.equals(this.enterpriseId, jointAccountBillDetail.enterpriseId) &&
        Objects.equals(this.inOut, jointAccountBillDetail.inOut) &&
        Objects.equals(this.openId, jointAccountBillDetail.openId) &&
        Objects.equals(this.title, jointAccountBillDetail.title) &&
        Objects.equals(this.userId, jointAccountBillDetail.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, billNo, bizDate, bizNo, enterpriseId, inOut, openId, title, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JointAccountBillDetail {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    billNo: ").append(toIndentedString(billNo)).append("\n");
    sb.append("    bizDate: ").append(toIndentedString(bizDate)).append("\n");
    sb.append("    bizNo: ").append(toIndentedString(bizNo)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    inOut: ").append(toIndentedString(inOut)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("bill_no");
    openapiFields.add("biz_date");
    openapiFields.add("biz_no");
    openapiFields.add("enterprise_id");
    openapiFields.add("in_out");
    openapiFields.add("open_id");
    openapiFields.add("title");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JointAccountBillDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JointAccountBillDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JointAccountBillDetail is not found in the empty JSON string", JointAccountBillDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JointAccountBillDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JointAccountBillDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("bill_no") != null && !jsonObj.get("bill_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_no").toString()));
      }
      if (jsonObj.get("biz_date") != null && !jsonObj.get("biz_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_date").toString()));
      }
      if (jsonObj.get("biz_no") != null && !jsonObj.get("biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_no").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("in_out") != null && !jsonObj.get("in_out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `in_out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("in_out").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JointAccountBillDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JointAccountBillDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JointAccountBillDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JointAccountBillDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<JointAccountBillDetail>() {
           @Override
           public void write(JsonWriter out, JointAccountBillDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JointAccountBillDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JointAccountBillDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JointAccountBillDetail
  * @throws IOException if the JSON string is invalid with respect to JointAccountBillDetail
  */
  public static JointAccountBillDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JointAccountBillDetail.class);
  }

 /**
  * Convert an instance of JointAccountBillDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
