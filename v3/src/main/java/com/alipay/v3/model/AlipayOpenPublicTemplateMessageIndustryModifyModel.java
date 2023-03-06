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
 * AlipayOpenPublicTemplateMessageIndustryModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicTemplateMessageIndustryModifyModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRIMARY_INDUSTRY_CODE = "primary_industry_code";
  @SerializedName(SERIALIZED_NAME_PRIMARY_INDUSTRY_CODE)
  private String primaryIndustryCode;

  public static final String SERIALIZED_NAME_PRIMARY_INDUSTRY_NAME = "primary_industry_name";
  @SerializedName(SERIALIZED_NAME_PRIMARY_INDUSTRY_NAME)
  private String primaryIndustryName;

  public static final String SERIALIZED_NAME_SECONDARY_INDUSTRY_CODE = "secondary_industry_code";
  @SerializedName(SERIALIZED_NAME_SECONDARY_INDUSTRY_CODE)
  private String secondaryIndustryCode;

  public static final String SERIALIZED_NAME_SECONDARY_INDUSTRY_NAME = "secondary_industry_name";
  @SerializedName(SERIALIZED_NAME_SECONDARY_INDUSTRY_NAME)
  private String secondaryIndustryName;

  public AlipayOpenPublicTemplateMessageIndustryModifyModel() { 
  }

  public AlipayOpenPublicTemplateMessageIndustryModifyModel primaryIndustryCode(String primaryIndustryCode) {
    
    this.primaryIndustryCode = primaryIndustryCode;
    return this;
  }

   /**
   * 服务窗消息模板所属主行业一/二级编码，参见 &lt;a href&#x3D;\&quot;https://alipay.open.taobao.com/doc2/detail?treeId&#x3D;197&amp;docType&#x3D;1&amp;articleId&#x3D;105043\&quot;&gt;查看行业信息&lt;/a&gt;。
   * @return primaryIndustryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10001/20102", value = "服务窗消息模板所属主行业一/二级编码，参见 <a href=\"https://alipay.open.taobao.com/doc2/detail?treeId=197&docType=1&articleId=105043\">查看行业信息</a>。")

  public String getPrimaryIndustryCode() {
    return primaryIndustryCode;
  }


  public void setPrimaryIndustryCode(String primaryIndustryCode) {
    this.primaryIndustryCode = primaryIndustryCode;
  }


  public AlipayOpenPublicTemplateMessageIndustryModifyModel primaryIndustryName(String primaryIndustryName) {
    
    this.primaryIndustryName = primaryIndustryName;
    return this;
  }

   /**
   * 服务窗消息模板所属主行业一/二级名称，参见 &lt;a href&#x3D;\&quot;https://alipay.open.taobao.com/doc2/detail?treeId&#x3D;197&amp;docType&#x3D;1&amp;articleId&#x3D;105043\&quot;&gt;查看行业信息&lt;/a&gt;。
   * @return primaryIndustryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IT科技/IT软件与服务", value = "服务窗消息模板所属主行业一/二级名称，参见 <a href=\"https://alipay.open.taobao.com/doc2/detail?treeId=197&docType=1&articleId=105043\">查看行业信息</a>。")

  public String getPrimaryIndustryName() {
    return primaryIndustryName;
  }


  public void setPrimaryIndustryName(String primaryIndustryName) {
    this.primaryIndustryName = primaryIndustryName;
  }


  public AlipayOpenPublicTemplateMessageIndustryModifyModel secondaryIndustryCode(String secondaryIndustryCode) {
    
    this.secondaryIndustryCode = secondaryIndustryCode;
    return this;
  }

   /**
   * 服务窗消息模板所属副行业一/二级编码，参见 &lt;a href&#x3D;\&quot;https://alipay.open.taobao.com/doc2/detail?treeId&#x3D;197&amp;docType&#x3D;1&amp;articleId&#x3D;105043\&quot;&gt;查看行业信息&lt;/a&gt;。
   * @return secondaryIndustryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10001/20102", value = "服务窗消息模板所属副行业一/二级编码，参见 <a href=\"https://alipay.open.taobao.com/doc2/detail?treeId=197&docType=1&articleId=105043\">查看行业信息</a>。")

  public String getSecondaryIndustryCode() {
    return secondaryIndustryCode;
  }


  public void setSecondaryIndustryCode(String secondaryIndustryCode) {
    this.secondaryIndustryCode = secondaryIndustryCode;
  }


  public AlipayOpenPublicTemplateMessageIndustryModifyModel secondaryIndustryName(String secondaryIndustryName) {
    
    this.secondaryIndustryName = secondaryIndustryName;
    return this;
  }

   /**
   * 服务窗消息模板所属副行业一/二级名称，参见 &lt;a href&#x3D;\&quot;https://alipay.open.taobao.com/doc2/detail?treeId&#x3D;197&amp;docType&#x3D;1&amp;articleId&#x3D;105043\&quot;&gt;查看行业信息&lt;/a&gt;。
   * @return secondaryIndustryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IT科技/IT软件与服务", value = "服务窗消息模板所属副行业一/二级名称，参见 <a href=\"https://alipay.open.taobao.com/doc2/detail?treeId=197&docType=1&articleId=105043\">查看行业信息</a>。")

  public String getSecondaryIndustryName() {
    return secondaryIndustryName;
  }


  public void setSecondaryIndustryName(String secondaryIndustryName) {
    this.secondaryIndustryName = secondaryIndustryName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicTemplateMessageIndustryModifyModel alipayOpenPublicTemplateMessageIndustryModifyModel = (AlipayOpenPublicTemplateMessageIndustryModifyModel) o;
    return Objects.equals(this.primaryIndustryCode, alipayOpenPublicTemplateMessageIndustryModifyModel.primaryIndustryCode) &&
        Objects.equals(this.primaryIndustryName, alipayOpenPublicTemplateMessageIndustryModifyModel.primaryIndustryName) &&
        Objects.equals(this.secondaryIndustryCode, alipayOpenPublicTemplateMessageIndustryModifyModel.secondaryIndustryCode) &&
        Objects.equals(this.secondaryIndustryName, alipayOpenPublicTemplateMessageIndustryModifyModel.secondaryIndustryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryIndustryCode, primaryIndustryName, secondaryIndustryCode, secondaryIndustryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicTemplateMessageIndustryModifyModel {\n");
    sb.append("    primaryIndustryCode: ").append(toIndentedString(primaryIndustryCode)).append("\n");
    sb.append("    primaryIndustryName: ").append(toIndentedString(primaryIndustryName)).append("\n");
    sb.append("    secondaryIndustryCode: ").append(toIndentedString(secondaryIndustryCode)).append("\n");
    sb.append("    secondaryIndustryName: ").append(toIndentedString(secondaryIndustryName)).append("\n");
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
    openapiFields.add("primary_industry_code");
    openapiFields.add("primary_industry_name");
    openapiFields.add("secondary_industry_code");
    openapiFields.add("secondary_industry_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicTemplateMessageIndustryModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicTemplateMessageIndustryModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicTemplateMessageIndustryModifyModel is not found in the empty JSON string", AlipayOpenPublicTemplateMessageIndustryModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicTemplateMessageIndustryModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicTemplateMessageIndustryModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("primary_industry_code") != null && !jsonObj.get("primary_industry_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primary_industry_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primary_industry_code").toString()));
      }
      if (jsonObj.get("primary_industry_name") != null && !jsonObj.get("primary_industry_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primary_industry_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primary_industry_name").toString()));
      }
      if (jsonObj.get("secondary_industry_code") != null && !jsonObj.get("secondary_industry_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondary_industry_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondary_industry_code").toString()));
      }
      if (jsonObj.get("secondary_industry_name") != null && !jsonObj.get("secondary_industry_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondary_industry_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondary_industry_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicTemplateMessageIndustryModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicTemplateMessageIndustryModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicTemplateMessageIndustryModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicTemplateMessageIndustryModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicTemplateMessageIndustryModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicTemplateMessageIndustryModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicTemplateMessageIndustryModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicTemplateMessageIndustryModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicTemplateMessageIndustryModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicTemplateMessageIndustryModifyModel
  */
  public static AlipayOpenPublicTemplateMessageIndustryModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicTemplateMessageIndustryModifyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicTemplateMessageIndustryModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
