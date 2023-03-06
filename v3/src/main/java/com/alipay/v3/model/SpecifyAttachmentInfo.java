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
 * SpecifyAttachmentInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpecifyAttachmentInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ALLOW_MORE_UPLOADS = "allow_more_uploads";
  @SerializedName(SERIALIZED_NAME_ALLOW_MORE_UPLOADS)
  private Boolean allowMoreUploads;

  public static final String SERIALIZED_NAME_ALLOW_MORE_UPLOADS_MAX_COUNT = "allow_more_uploads_max_count";
  @SerializedName(SERIALIZED_NAME_ALLOW_MORE_UPLOADS_MAX_COUNT)
  private Integer allowMoreUploadsMaxCount;

  public static final String SERIALIZED_NAME_COLLECT_CERT_TYPES = "collect_cert_types";
  @SerializedName(SERIALIZED_NAME_COLLECT_CERT_TYPES)
  private List<String> collectCertTypes = null;

  public static final String SERIALIZED_NAME_COLLECT_COMMON_CODES = "collect_common_codes";
  @SerializedName(SERIALIZED_NAME_COLLECT_COMMON_CODES)
  private List<String> collectCommonCodes = null;

  public static final String SERIALIZED_NAME_THIRD_PARTY_USER_ID = "third_party_user_id";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_USER_ID)
  private String thirdPartyUserId;

  public SpecifyAttachmentInfo() { 
  }

  public SpecifyAttachmentInfo allowMoreUploads(Boolean allowMoreUploads) {
    
    this.allowMoreUploads = allowMoreUploads;
    return this;
  }

   /**
   * 是否允许上传更多附件，默认值为false。开启后，除了“collect_common_codes”中指定的附件，签署人可自由上传至多10张图片。
   * @return allowMoreUploads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否允许上传更多附件，默认值为false。开启后，除了“collect_common_codes”中指定的附件，签署人可自由上传至多10张图片。")

  public Boolean getAllowMoreUploads() {
    return allowMoreUploads;
  }


  public void setAllowMoreUploads(Boolean allowMoreUploads) {
    this.allowMoreUploads = allowMoreUploads;
  }


  public SpecifyAttachmentInfo allowMoreUploadsMaxCount(Integer allowMoreUploadsMaxCount) {
    
    this.allowMoreUploadsMaxCount = allowMoreUploadsMaxCount;
    return this;
  }

   /**
   * 允许上传更多附件时，可上传的最大附件数，一次流程中累计的上传附件数至多30（含“附件列表”数量）
   * @return allowMoreUploadsMaxCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "允许上传更多附件时，可上传的最大附件数，一次流程中累计的上传附件数至多30（含“附件列表”数量）")

  public Integer getAllowMoreUploadsMaxCount() {
    return allowMoreUploadsMaxCount;
  }


  public void setAllowMoreUploadsMaxCount(Integer allowMoreUploadsMaxCount) {
    this.allowMoreUploadsMaxCount = allowMoreUploadsMaxCount;
  }


  public SpecifyAttachmentInfo collectCertTypes(List<String> collectCertTypes) {
    
    this.collectCertTypes = collectCertTypes;
    return this;
  }

  public SpecifyAttachmentInfo addCollectCertTypesItem(String collectCertTypesItem) {
    if (this.collectCertTypes == null) {
      this.collectCertTypes = new ArrayList<>();
    }
    this.collectCertTypes.add(collectCertTypesItem);
    return this;
  }

   /**
   * 需要签署人上传的证件照片，可进行ORC识别，目前仅支持IDCARD
   * @return collectCertTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IDCARD", value = "需要签署人上传的证件照片，可进行ORC识别，目前仅支持IDCARD")

  public List<String> getCollectCertTypes() {
    return collectCertTypes;
  }


  public void setCollectCertTypes(List<String> collectCertTypes) {
    this.collectCertTypes = collectCertTypes;
  }


  public SpecifyAttachmentInfo collectCommonCodes(List<String> collectCommonCodes) {
    
    this.collectCommonCodes = collectCommonCodes;
    return this;
  }

  public SpecifyAttachmentInfo addCollectCommonCodesItem(String collectCommonCodesItem) {
    if (this.collectCommonCodes == null) {
      this.collectCommonCodes = new ArrayList<>();
    }
    this.collectCommonCodes.add(collectCommonCodesItem);
    return this;
  }

   /**
   * 需要签署人上传的其他附件列表，即attachment_explain.details中定义的code列表
   * @return collectCommonCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "phonePicture1", value = "需要签署人上传的其他附件列表，即attachment_explain.details中定义的code列表")

  public List<String> getCollectCommonCodes() {
    return collectCommonCodes;
  }


  public void setCollectCommonCodes(List<String> collectCommonCodes) {
    this.collectCommonCodes = collectCommonCodes;
  }


  public SpecifyAttachmentInfo thirdPartyUserId(String thirdPartyUserId) {
    
    this.thirdPartyUserId = thirdPartyUserId;
    return this;
  }

   /**
   * 个人唯一标识，对应签署区中指定的签署人
   * @return thirdPartyUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tgxxteck", value = "个人唯一标识，对应签署区中指定的签署人")

  public String getThirdPartyUserId() {
    return thirdPartyUserId;
  }


  public void setThirdPartyUserId(String thirdPartyUserId) {
    this.thirdPartyUserId = thirdPartyUserId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecifyAttachmentInfo specifyAttachmentInfo = (SpecifyAttachmentInfo) o;
    return Objects.equals(this.allowMoreUploads, specifyAttachmentInfo.allowMoreUploads) &&
        Objects.equals(this.allowMoreUploadsMaxCount, specifyAttachmentInfo.allowMoreUploadsMaxCount) &&
        Objects.equals(this.collectCertTypes, specifyAttachmentInfo.collectCertTypes) &&
        Objects.equals(this.collectCommonCodes, specifyAttachmentInfo.collectCommonCodes) &&
        Objects.equals(this.thirdPartyUserId, specifyAttachmentInfo.thirdPartyUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowMoreUploads, allowMoreUploadsMaxCount, collectCertTypes, collectCommonCodes, thirdPartyUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecifyAttachmentInfo {\n");
    sb.append("    allowMoreUploads: ").append(toIndentedString(allowMoreUploads)).append("\n");
    sb.append("    allowMoreUploadsMaxCount: ").append(toIndentedString(allowMoreUploadsMaxCount)).append("\n");
    sb.append("    collectCertTypes: ").append(toIndentedString(collectCertTypes)).append("\n");
    sb.append("    collectCommonCodes: ").append(toIndentedString(collectCommonCodes)).append("\n");
    sb.append("    thirdPartyUserId: ").append(toIndentedString(thirdPartyUserId)).append("\n");
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
    openapiFields.add("allow_more_uploads");
    openapiFields.add("allow_more_uploads_max_count");
    openapiFields.add("collect_cert_types");
    openapiFields.add("collect_common_codes");
    openapiFields.add("third_party_user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SpecifyAttachmentInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SpecifyAttachmentInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpecifyAttachmentInfo is not found in the empty JSON string", SpecifyAttachmentInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SpecifyAttachmentInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SpecifyAttachmentInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("collect_cert_types") != null && !jsonObj.get("collect_cert_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `collect_cert_types` to be an array in the JSON string but got `%s`", jsonObj.get("collect_cert_types").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("collect_common_codes") != null && !jsonObj.get("collect_common_codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `collect_common_codes` to be an array in the JSON string but got `%s`", jsonObj.get("collect_common_codes").toString()));
      }
      if (jsonObj.get("third_party_user_id") != null && !jsonObj.get("third_party_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `third_party_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("third_party_user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpecifyAttachmentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpecifyAttachmentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpecifyAttachmentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpecifyAttachmentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SpecifyAttachmentInfo>() {
           @Override
           public void write(JsonWriter out, SpecifyAttachmentInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SpecifyAttachmentInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SpecifyAttachmentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpecifyAttachmentInfo
  * @throws IOException if the JSON string is invalid with respect to SpecifyAttachmentInfo
  */
  public static SpecifyAttachmentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpecifyAttachmentInfo.class);
  }

 /**
  * Convert an instance of SpecifyAttachmentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
