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
 * AlipayUserTwostageIndirectUseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayUserTwostageIndirectUseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DYNAMIC_ID = "dynamic_id";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_ID)
  private String dynamicId;

  public static final String SERIALIZED_NAME_ORG_PID = "org_pid";
  @SerializedName(SERIALIZED_NAME_ORG_PID)
  private String orgPid;

  public static final String SERIALIZED_NAME_PAY_SMID = "pay_smid";
  @SerializedName(SERIALIZED_NAME_PAY_SMID)
  private String paySmid;

  public static final String SERIALIZED_NAME_SENCE_NO = "sence_no";
  @SerializedName(SERIALIZED_NAME_SENCE_NO)
  private String senceNo;

  public static final String SERIALIZED_NAME_SOURCE_PID = "source_pid";
  @SerializedName(SERIALIZED_NAME_SOURCE_PID)
  private String sourcePid;

  public AlipayUserTwostageIndirectUseModel() { 
  }

  public AlipayUserTwostageIndirectUseModel dynamicId(String dynamicId) {
    
    this.dynamicId = dynamicId;
    return this;
  }

   /**
   * 商户扫描用户的付款码值。18~24位，25~30开头，例如28开头的18位的数字；或人脸支付的ftoken等。
   * @return dynamicId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "28xxxxxxxxxxxxxxxx", value = "商户扫描用户的付款码值。18~24位，25~30开头，例如28开头的18位的数字；或人脸支付的ftoken等。")

  public String getDynamicId() {
    return dynamicId;
  }


  public void setDynamicId(String dynamicId) {
    this.dynamicId = dynamicId;
  }


  public AlipayUserTwostageIndirectUseModel orgPid(String orgPid) {
    
    this.orgPid = orgPid;
    return this;
  }

   /**
   * 进件信息中，SMID对应的银行机构的PID信息，一般为2088开头的16位数字。
   * @return orgPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxxxxxxx", value = "进件信息中，SMID对应的银行机构的PID信息，一般为2088开头的16位数字。")

  public String getOrgPid() {
    return orgPid;
  }


  public void setOrgPid(String orgPid) {
    this.orgPid = orgPid;
  }


  public AlipayUserTwostageIndirectUseModel paySmid(String paySmid) {
    
    this.paySmid = paySmid;
    return this;
  }

   /**
   * 进件信息中，二级商户ID（ sub_merchant_id)信息，一般为2088开头的16位数字。
   * @return paySmid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxxxxxxx", value = "进件信息中，二级商户ID（ sub_merchant_id)信息，一般为2088开头的16位数字。")

  public String getPaySmid() {
    return paySmid;
  }


  public void setPaySmid(String paySmid) {
    this.paySmid = paySmid;
  }


  public AlipayUserTwostageIndirectUseModel senceNo(String senceNo) {
    
    this.senceNo = senceNo;
    return this;
  }

   /**
   * 外部业务号，用于标识这笔解码请求，对同一个码的重复解码请求，sence_no必须与上一次保持一致，每次请求的sence_no必须不一样，如alipay.user.twostage.common.use接口配合alipay.trade.pay（统一收单交易支付接口）一并使用时，alipay.trade.pay接口的extend_params属性中必须设置DYNAMIC_TOKEN_OUT_BIZ_NO，且值必须与sence_no保持一致
   * @return senceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170718xxxxxxxx", value = "外部业务号，用于标识这笔解码请求，对同一个码的重复解码请求，sence_no必须与上一次保持一致，每次请求的sence_no必须不一样，如alipay.user.twostage.common.use接口配合alipay.trade.pay（统一收单交易支付接口）一并使用时，alipay.trade.pay接口的extend_params属性中必须设置DYNAMIC_TOKEN_OUT_BIZ_NO，且值必须与sence_no保持一致")

  public String getSenceNo() {
    return senceNo;
  }


  public void setSenceNo(String senceNo) {
    this.senceNo = senceNo;
  }


  public AlipayUserTwostageIndirectUseModel sourcePid(String sourcePid) {
    
    this.sourcePid = sourcePid;
    return this;
  }

   /**
   * 进件信息中，SMID对应渠道的PID信息，一般为2088开头的16位数字。
   * @return sourcePid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxxxxxxx", value = "进件信息中，SMID对应渠道的PID信息，一般为2088开头的16位数字。")

  public String getSourcePid() {
    return sourcePid;
  }


  public void setSourcePid(String sourcePid) {
    this.sourcePid = sourcePid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayUserTwostageIndirectUseModel alipayUserTwostageIndirectUseModel = (AlipayUserTwostageIndirectUseModel) o;
    return Objects.equals(this.dynamicId, alipayUserTwostageIndirectUseModel.dynamicId) &&
        Objects.equals(this.orgPid, alipayUserTwostageIndirectUseModel.orgPid) &&
        Objects.equals(this.paySmid, alipayUserTwostageIndirectUseModel.paySmid) &&
        Objects.equals(this.senceNo, alipayUserTwostageIndirectUseModel.senceNo) &&
        Objects.equals(this.sourcePid, alipayUserTwostageIndirectUseModel.sourcePid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicId, orgPid, paySmid, senceNo, sourcePid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayUserTwostageIndirectUseModel {\n");
    sb.append("    dynamicId: ").append(toIndentedString(dynamicId)).append("\n");
    sb.append("    orgPid: ").append(toIndentedString(orgPid)).append("\n");
    sb.append("    paySmid: ").append(toIndentedString(paySmid)).append("\n");
    sb.append("    senceNo: ").append(toIndentedString(senceNo)).append("\n");
    sb.append("    sourcePid: ").append(toIndentedString(sourcePid)).append("\n");
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
    openapiFields.add("dynamic_id");
    openapiFields.add("org_pid");
    openapiFields.add("pay_smid");
    openapiFields.add("sence_no");
    openapiFields.add("source_pid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayUserTwostageIndirectUseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayUserTwostageIndirectUseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayUserTwostageIndirectUseModel is not found in the empty JSON string", AlipayUserTwostageIndirectUseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayUserTwostageIndirectUseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayUserTwostageIndirectUseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("dynamic_id") != null && !jsonObj.get("dynamic_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dynamic_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dynamic_id").toString()));
      }
      if (jsonObj.get("org_pid") != null && !jsonObj.get("org_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_pid").toString()));
      }
      if (jsonObj.get("pay_smid") != null && !jsonObj.get("pay_smid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_smid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_smid").toString()));
      }
      if (jsonObj.get("sence_no") != null && !jsonObj.get("sence_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sence_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sence_no").toString()));
      }
      if (jsonObj.get("source_pid") != null && !jsonObj.get("source_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_pid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayUserTwostageIndirectUseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayUserTwostageIndirectUseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayUserTwostageIndirectUseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayUserTwostageIndirectUseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayUserTwostageIndirectUseModel>() {
           @Override
           public void write(JsonWriter out, AlipayUserTwostageIndirectUseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayUserTwostageIndirectUseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayUserTwostageIndirectUseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayUserTwostageIndirectUseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayUserTwostageIndirectUseModel
  */
  public static AlipayUserTwostageIndirectUseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayUserTwostageIndirectUseModel.class);
  }

 /**
  * Convert an instance of AlipayUserTwostageIndirectUseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

