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
import com.alipay.v3.model.AuthIdentityInfo;
import com.alipay.v3.model.IndirectBenefitPersonInfo;
import com.alipay.v3.model.IndirectContactPersonInfo;
import com.alipay.v3.model.IndirectExtraCredentials;
import com.alipay.v3.model.IndirectLegalPersonInfo;
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
 * AlipayMerchantIndirectAuthorderCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMerchantIndirectAuthorderCreateModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AUTH_IDENTITY_INFO = "auth_identity_info";
  @SerializedName(SERIALIZED_NAME_AUTH_IDENTITY_INFO)
  private AuthIdentityInfo authIdentityInfo;

  public static final String SERIALIZED_NAME_BENEFIT_PERSON_INFO = "benefit_person_info";
  @SerializedName(SERIALIZED_NAME_BENEFIT_PERSON_INFO)
  private IndirectBenefitPersonInfo benefitPersonInfo;

  public static final String SERIALIZED_NAME_CONTACT_PERSON_INFO = "contact_person_info";
  @SerializedName(SERIALIZED_NAME_CONTACT_PERSON_INFO)
  private IndirectContactPersonInfo contactPersonInfo;

  public static final String SERIALIZED_NAME_EXTRA_CREDENTIALS = "extra_credentials";
  @SerializedName(SERIALIZED_NAME_EXTRA_CREDENTIALS)
  private IndirectExtraCredentials extraCredentials;

  public static final String SERIALIZED_NAME_LEGAL_PERSON_INFO = "legal_person_info";
  @SerializedName(SERIALIZED_NAME_LEGAL_PERSON_INFO)
  private IndirectLegalPersonInfo legalPersonInfo;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public AlipayMerchantIndirectAuthorderCreateModel() { 
  }

  public AlipayMerchantIndirectAuthorderCreateModel authIdentityInfo(AuthIdentityInfo authIdentityInfo) {
    
    this.authIdentityInfo = authIdentityInfo;
    return this;
  }

   /**
   * Get authIdentityInfo
   * @return authIdentityInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthIdentityInfo getAuthIdentityInfo() {
    return authIdentityInfo;
  }


  public void setAuthIdentityInfo(AuthIdentityInfo authIdentityInfo) {
    this.authIdentityInfo = authIdentityInfo;
  }


  public AlipayMerchantIndirectAuthorderCreateModel benefitPersonInfo(IndirectBenefitPersonInfo benefitPersonInfo) {
    
    this.benefitPersonInfo = benefitPersonInfo;
    return this;
  }

   /**
   * Get benefitPersonInfo
   * @return benefitPersonInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IndirectBenefitPersonInfo getBenefitPersonInfo() {
    return benefitPersonInfo;
  }


  public void setBenefitPersonInfo(IndirectBenefitPersonInfo benefitPersonInfo) {
    this.benefitPersonInfo = benefitPersonInfo;
  }


  public AlipayMerchantIndirectAuthorderCreateModel contactPersonInfo(IndirectContactPersonInfo contactPersonInfo) {
    
    this.contactPersonInfo = contactPersonInfo;
    return this;
  }

   /**
   * Get contactPersonInfo
   * @return contactPersonInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IndirectContactPersonInfo getContactPersonInfo() {
    return contactPersonInfo;
  }


  public void setContactPersonInfo(IndirectContactPersonInfo contactPersonInfo) {
    this.contactPersonInfo = contactPersonInfo;
  }


  public AlipayMerchantIndirectAuthorderCreateModel extraCredentials(IndirectExtraCredentials extraCredentials) {
    
    this.extraCredentials = extraCredentials;
    return this;
  }

   /**
   * Get extraCredentials
   * @return extraCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IndirectExtraCredentials getExtraCredentials() {
    return extraCredentials;
  }


  public void setExtraCredentials(IndirectExtraCredentials extraCredentials) {
    this.extraCredentials = extraCredentials;
  }


  public AlipayMerchantIndirectAuthorderCreateModel legalPersonInfo(IndirectLegalPersonInfo legalPersonInfo) {
    
    this.legalPersonInfo = legalPersonInfo;
    return this;
  }

   /**
   * Get legalPersonInfo
   * @return legalPersonInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IndirectLegalPersonInfo getLegalPersonInfo() {
    return legalPersonInfo;
  }


  public void setLegalPersonInfo(IndirectLegalPersonInfo legalPersonInfo) {
    this.legalPersonInfo = legalPersonInfo;
  }


  public AlipayMerchantIndirectAuthorderCreateModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务号
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000001", value = "外部业务号")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayMerchantIndirectAuthorderCreateModel source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 1. 收单机构调用API提交申请单时，可选择是否指定单个服务商范围。非收单机构无需填写此字段。 2. 此字段填写单个服务商pid信息：填写（即：单服务商提交认证方式），查询申请单返回的认证二维码qr_code和填写服务商对应，仅能认证填写服务商下的商户；不填写（即：全服务商提交认证方式），查询申请单返回的认证二维码qr_code和收单机构对应，可认证收单机构下全部商户。
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000000000001", value = "1. 收单机构调用API提交申请单时，可选择是否指定单个服务商范围。非收单机构无需填写此字段。 2. 此字段填写单个服务商pid信息：填写（即：单服务商提交认证方式），查询申请单返回的认证二维码qr_code和填写服务商对应，仅能认证填写服务商下的商户；不填写（即：全服务商提交认证方式），查询申请单返回的认证二维码qr_code和收单机构对应，可认证收单机构下全部商户。")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMerchantIndirectAuthorderCreateModel alipayMerchantIndirectAuthorderCreateModel = (AlipayMerchantIndirectAuthorderCreateModel) o;
    return Objects.equals(this.authIdentityInfo, alipayMerchantIndirectAuthorderCreateModel.authIdentityInfo) &&
        Objects.equals(this.benefitPersonInfo, alipayMerchantIndirectAuthorderCreateModel.benefitPersonInfo) &&
        Objects.equals(this.contactPersonInfo, alipayMerchantIndirectAuthorderCreateModel.contactPersonInfo) &&
        Objects.equals(this.extraCredentials, alipayMerchantIndirectAuthorderCreateModel.extraCredentials) &&
        Objects.equals(this.legalPersonInfo, alipayMerchantIndirectAuthorderCreateModel.legalPersonInfo) &&
        Objects.equals(this.outBizNo, alipayMerchantIndirectAuthorderCreateModel.outBizNo) &&
        Objects.equals(this.source, alipayMerchantIndirectAuthorderCreateModel.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authIdentityInfo, benefitPersonInfo, contactPersonInfo, extraCredentials, legalPersonInfo, outBizNo, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMerchantIndirectAuthorderCreateModel {\n");
    sb.append("    authIdentityInfo: ").append(toIndentedString(authIdentityInfo)).append("\n");
    sb.append("    benefitPersonInfo: ").append(toIndentedString(benefitPersonInfo)).append("\n");
    sb.append("    contactPersonInfo: ").append(toIndentedString(contactPersonInfo)).append("\n");
    sb.append("    extraCredentials: ").append(toIndentedString(extraCredentials)).append("\n");
    sb.append("    legalPersonInfo: ").append(toIndentedString(legalPersonInfo)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("auth_identity_info");
    openapiFields.add("benefit_person_info");
    openapiFields.add("contact_person_info");
    openapiFields.add("extra_credentials");
    openapiFields.add("legal_person_info");
    openapiFields.add("out_biz_no");
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMerchantIndirectAuthorderCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMerchantIndirectAuthorderCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMerchantIndirectAuthorderCreateModel is not found in the empty JSON string", AlipayMerchantIndirectAuthorderCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMerchantIndirectAuthorderCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMerchantIndirectAuthorderCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `auth_identity_info`
      if (jsonObj.getAsJsonObject("auth_identity_info") != null) {
        AuthIdentityInfo.validateJsonObject(jsonObj.getAsJsonObject("auth_identity_info"));
      }
      // validate the optional field `benefit_person_info`
      if (jsonObj.getAsJsonObject("benefit_person_info") != null) {
        IndirectBenefitPersonInfo.validateJsonObject(jsonObj.getAsJsonObject("benefit_person_info"));
      }
      // validate the optional field `contact_person_info`
      if (jsonObj.getAsJsonObject("contact_person_info") != null) {
        IndirectContactPersonInfo.validateJsonObject(jsonObj.getAsJsonObject("contact_person_info"));
      }
      // validate the optional field `extra_credentials`
      if (jsonObj.getAsJsonObject("extra_credentials") != null) {
        IndirectExtraCredentials.validateJsonObject(jsonObj.getAsJsonObject("extra_credentials"));
      }
      // validate the optional field `legal_person_info`
      if (jsonObj.getAsJsonObject("legal_person_info") != null) {
        IndirectLegalPersonInfo.validateJsonObject(jsonObj.getAsJsonObject("legal_person_info"));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMerchantIndirectAuthorderCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMerchantIndirectAuthorderCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMerchantIndirectAuthorderCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMerchantIndirectAuthorderCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMerchantIndirectAuthorderCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayMerchantIndirectAuthorderCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMerchantIndirectAuthorderCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMerchantIndirectAuthorderCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMerchantIndirectAuthorderCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMerchantIndirectAuthorderCreateModel
  */
  public static AlipayMerchantIndirectAuthorderCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMerchantIndirectAuthorderCreateModel.class);
  }

 /**
  * Convert an instance of AlipayMerchantIndirectAuthorderCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

