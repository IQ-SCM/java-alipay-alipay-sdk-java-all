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
 * AlipayOpenSpOpporFeedbackModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSpOpporFeedbackModifyModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EXPAND_RESULT = "expand_result";
  @SerializedName(SERIALIZED_NAME_EXPAND_RESULT)
  private String expandResult;

  public static final String SERIALIZED_NAME_ISV_PID = "isv_pid";
  @SerializedName(SERIALIZED_NAME_ISV_PID)
  private String isvPid;

  public static final String SERIALIZED_NAME_LEADS_ID = "leads_id";
  @SerializedName(SERIALIZED_NAME_LEADS_ID)
  private String leadsId;

  public static final String SERIALIZED_NAME_MERCHANT_PID = "merchant_pid";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PID)
  private String merchantPid;

  public static final String SERIALIZED_NAME_OPPOR_ID = "oppor_id";
  @SerializedName(SERIALIZED_NAME_OPPOR_ID)
  private String opporId;

  public static final String SERIALIZED_NAME_SN = "sn";
  @SerializedName(SERIALIZED_NAME_SN)
  private String sn;

  public AlipayOpenSpOpporFeedbackModifyModel() { 
  }

  public AlipayOpenSpOpporFeedbackModifyModel expandResult(String expandResult) {
    
    this.expandResult = expandResult;
    return this;
  }

   /**
   * 拓展助手商机拓展结果
   * @return expandResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EXPANDED/EXPAND_FAILED", value = "拓展助手商机拓展结果")

  public String getExpandResult() {
    return expandResult;
  }


  public void setExpandResult(String expandResult) {
    this.expandResult = expandResult;
  }


  public AlipayOpenSpOpporFeedbackModifyModel isvPid(String isvPid) {
    
    this.isvPid = isvPid;
    return this;
  }

   /**
   * 服务商pid
   * @return isvPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088501013445414", value = "服务商pid")

  public String getIsvPid() {
    return isvPid;
  }


  public void setIsvPid(String isvPid) {
    this.isvPid = isvPid;
  }


  public AlipayOpenSpOpporFeedbackModifyModel leadsId(String leadsId) {
    
    this.leadsId = leadsId;
    return this;
  }

   /**
   * 商机id
   * @return leadsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022032304216502", value = "商机id")

  public String getLeadsId() {
    return leadsId;
  }


  public void setLeadsId(String leadsId) {
    this.leadsId = leadsId;
  }


  public AlipayOpenSpOpporFeedbackModifyModel merchantPid(String merchantPid) {
    
    this.merchantPid = merchantPid;
    return this;
  }

   /**
   * 拓展助手商机商家pid
   * @return merchantPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088341444815673", value = "拓展助手商机商家pid")

  public String getMerchantPid() {
    return merchantPid;
  }


  public void setMerchantPid(String merchantPid) {
    this.merchantPid = merchantPid;
  }


  public AlipayOpenSpOpporFeedbackModifyModel opporId(String opporId) {
    
    this.opporId = opporId;
    return this;
  }

   /**
   * 商机作业id
   * @return opporId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022041403518351", value = "商机作业id")

  public String getOpporId() {
    return opporId;
  }


  public void setOpporId(String opporId) {
    this.opporId = opporId;
  }


  public AlipayOpenSpOpporFeedbackModifyModel sn(String sn) {
    
    this.sn = sn;
    return this;
  }

   /**
   * 拓展设备sn号
   * @return sn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sn", value = "拓展设备sn号")

  public String getSn() {
    return sn;
  }


  public void setSn(String sn) {
    this.sn = sn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSpOpporFeedbackModifyModel alipayOpenSpOpporFeedbackModifyModel = (AlipayOpenSpOpporFeedbackModifyModel) o;
    return Objects.equals(this.expandResult, alipayOpenSpOpporFeedbackModifyModel.expandResult) &&
        Objects.equals(this.isvPid, alipayOpenSpOpporFeedbackModifyModel.isvPid) &&
        Objects.equals(this.leadsId, alipayOpenSpOpporFeedbackModifyModel.leadsId) &&
        Objects.equals(this.merchantPid, alipayOpenSpOpporFeedbackModifyModel.merchantPid) &&
        Objects.equals(this.opporId, alipayOpenSpOpporFeedbackModifyModel.opporId) &&
        Objects.equals(this.sn, alipayOpenSpOpporFeedbackModifyModel.sn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expandResult, isvPid, leadsId, merchantPid, opporId, sn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSpOpporFeedbackModifyModel {\n");
    sb.append("    expandResult: ").append(toIndentedString(expandResult)).append("\n");
    sb.append("    isvPid: ").append(toIndentedString(isvPid)).append("\n");
    sb.append("    leadsId: ").append(toIndentedString(leadsId)).append("\n");
    sb.append("    merchantPid: ").append(toIndentedString(merchantPid)).append("\n");
    sb.append("    opporId: ").append(toIndentedString(opporId)).append("\n");
    sb.append("    sn: ").append(toIndentedString(sn)).append("\n");
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
    openapiFields.add("expand_result");
    openapiFields.add("isv_pid");
    openapiFields.add("leads_id");
    openapiFields.add("merchant_pid");
    openapiFields.add("oppor_id");
    openapiFields.add("sn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSpOpporFeedbackModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSpOpporFeedbackModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSpOpporFeedbackModifyModel is not found in the empty JSON string", AlipayOpenSpOpporFeedbackModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSpOpporFeedbackModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSpOpporFeedbackModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("expand_result") != null && !jsonObj.get("expand_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expand_result").toString()));
      }
      if (jsonObj.get("isv_pid") != null && !jsonObj.get("isv_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_pid").toString()));
      }
      if (jsonObj.get("leads_id") != null && !jsonObj.get("leads_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leads_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leads_id").toString()));
      }
      if (jsonObj.get("merchant_pid") != null && !jsonObj.get("merchant_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_pid").toString()));
      }
      if (jsonObj.get("oppor_id") != null && !jsonObj.get("oppor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oppor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oppor_id").toString()));
      }
      if (jsonObj.get("sn") != null && !jsonObj.get("sn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSpOpporFeedbackModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSpOpporFeedbackModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSpOpporFeedbackModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSpOpporFeedbackModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSpOpporFeedbackModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSpOpporFeedbackModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSpOpporFeedbackModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSpOpporFeedbackModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSpOpporFeedbackModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSpOpporFeedbackModifyModel
  */
  public static AlipayOpenSpOpporFeedbackModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSpOpporFeedbackModifyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSpOpporFeedbackModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
