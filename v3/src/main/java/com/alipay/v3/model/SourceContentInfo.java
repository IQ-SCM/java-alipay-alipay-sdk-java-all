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
import com.alipay.v3.model.SourceMediaInfo;
import com.alipay.v3.model.SourceOffer;
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
 * SourceContentInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SourceContentInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONTENT_ID = "content_id";
  @SerializedName(SERIALIZED_NAME_CONTENT_ID)
  private String contentId;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_SOURCE_AUTHOR = "source_author";
  @SerializedName(SERIALIZED_NAME_SOURCE_AUTHOR)
  private String sourceAuthor;

  public static final String SERIALIZED_NAME_SOURCE_LINK = "source_link";
  @SerializedName(SERIALIZED_NAME_SOURCE_LINK)
  private String sourceLink;

  public static final String SERIALIZED_NAME_SOURCE_MEDIA_INFOS = "source_media_infos";
  @SerializedName(SERIALIZED_NAME_SOURCE_MEDIA_INFOS)
  private List<SourceMediaInfo> sourceMediaInfos = null;

  public static final String SERIALIZED_NAME_SOURCE_OFFERS = "source_offers";
  @SerializedName(SERIALIZED_NAME_SOURCE_OFFERS)
  private List<SourceOffer> sourceOffers = null;

  public static final String SERIALIZED_NAME_SOURCE_PUBLISH_DATE = "source_publish_date";
  @SerializedName(SERIALIZED_NAME_SOURCE_PUBLISH_DATE)
  private String sourcePublishDate;

  public static final String SERIALIZED_NAME_SOURCE_STATUS = "source_status";
  @SerializedName(SERIALIZED_NAME_SOURCE_STATUS)
  private String sourceStatus;

  public static final String SERIALIZED_NAME_SOURCE_SUMMARY = "source_summary";
  @SerializedName(SERIALIZED_NAME_SOURCE_SUMMARY)
  private String sourceSummary;

  public static final String SERIALIZED_NAME_SOURCE_TITLE = "source_title";
  @SerializedName(SERIALIZED_NAME_SOURCE_TITLE)
  private String sourceTitle;

  public static final String SERIALIZED_NAME_SOURCE_TYPE = "source_type";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private String sourceType;

  public static final String SERIALIZED_NAME_SPECIAL_TAGS = "special_tags";
  @SerializedName(SERIALIZED_NAME_SPECIAL_TAGS)
  private List<String> specialTags = null;

  public SourceContentInfo() { 
  }

  public SourceContentInfo contentId(String contentId) {
    
    this.contentId = contentId;
    return this;
  }

   /**
   * 内容ID
   * @return contentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20210928OB02001002950004xxxx", value = "内容ID")

  public String getContentId() {
    return contentId;
  }


  public void setContentId(String contentId) {
    this.contentId = contentId;
  }


  public SourceContentInfo link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * 支付宝内容链接
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://xxxx", value = "支付宝内容链接")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public SourceContentInfo sourceAuthor(String sourceAuthor) {
    
    this.sourceAuthor = sourceAuthor;
    return this;
  }

   /**
   * 作者
   * @return sourceAuthor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "作者", value = "作者")

  public String getSourceAuthor() {
    return sourceAuthor;
  }


  public void setSourceAuthor(String sourceAuthor) {
    this.sourceAuthor = sourceAuthor;
  }


  public SourceContentInfo sourceLink(String sourceLink) {
    
    this.sourceLink = sourceLink;
    return this;
  }

   /**
   * 来源文章的原始链接地址
   * @return sourceLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://test.xx.com", value = "来源文章的原始链接地址")

  public String getSourceLink() {
    return sourceLink;
  }


  public void setSourceLink(String sourceLink) {
    this.sourceLink = sourceLink;
  }


  public SourceContentInfo sourceMediaInfos(List<SourceMediaInfo> sourceMediaInfos) {
    
    this.sourceMediaInfos = sourceMediaInfos;
    return this;
  }

  public SourceContentInfo addSourceMediaInfosItem(SourceMediaInfo sourceMediaInfosItem) {
    if (this.sourceMediaInfos == null) {
      this.sourceMediaInfos = new ArrayList<>();
    }
    this.sourceMediaInfos.add(sourceMediaInfosItem);
    return this;
  }

   /**
   * 素材列表
   * @return sourceMediaInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "素材列表")

  public List<SourceMediaInfo> getSourceMediaInfos() {
    return sourceMediaInfos;
  }


  public void setSourceMediaInfos(List<SourceMediaInfo> sourceMediaInfos) {
    this.sourceMediaInfos = sourceMediaInfos;
  }


  public SourceContentInfo sourceOffers(List<SourceOffer> sourceOffers) {
    
    this.sourceOffers = sourceOffers;
    return this;
  }

  public SourceContentInfo addSourceOffersItem(SourceOffer sourceOffersItem) {
    if (this.sourceOffers == null) {
      this.sourceOffers = new ArrayList<>();
    }
    this.sourceOffers.add(sourceOffersItem);
    return this;
  }

   /**
   * 关联服务
   * @return sourceOffers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "关联服务")

  public List<SourceOffer> getSourceOffers() {
    return sourceOffers;
  }


  public void setSourceOffers(List<SourceOffer> sourceOffers) {
    this.sourceOffers = sourceOffers;
  }


  public SourceContentInfo sourcePublishDate(String sourcePublishDate) {
    
    this.sourcePublishDate = sourcePublishDate;
    return this;
  }

   /**
   * 文章发布时间
   * @return sourcePublishDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-09-30 10:10:10", value = "文章发布时间")

  public String getSourcePublishDate() {
    return sourcePublishDate;
  }


  public void setSourcePublishDate(String sourcePublishDate) {
    this.sourcePublishDate = sourcePublishDate;
  }


  public SourceContentInfo sourceStatus(String sourceStatus) {
    
    this.sourceStatus = sourceStatus;
    return this;
  }

   /**
   * 内容状态 0-审核中 1-成功发布 2-审核不通过 3-己删除
   * @return sourceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "内容状态 0-审核中 1-成功发布 2-审核不通过 3-己删除")

  public String getSourceStatus() {
    return sourceStatus;
  }


  public void setSourceStatus(String sourceStatus) {
    this.sourceStatus = sourceStatus;
  }


  public SourceContentInfo sourceSummary(String sourceSummary) {
    
    this.sourceSummary = sourceSummary;
    return this;
  }

   /**
   * 文章的摘要
   * @return sourceSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "文章的摘要", value = "文章的摘要")

  public String getSourceSummary() {
    return sourceSummary;
  }


  public void setSourceSummary(String sourceSummary) {
    this.sourceSummary = sourceSummary;
  }


  public SourceContentInfo sourceTitle(String sourceTitle) {
    
    this.sourceTitle = sourceTitle;
    return this;
  }

   /**
   * 内容标题
   * @return sourceTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "内容标题", value = "内容标题")

  public String getSourceTitle() {
    return sourceTitle;
  }


  public void setSourceTitle(String sourceTitle) {
    this.sourceTitle = sourceTitle;
  }


  public SourceContentInfo sourceType(String sourceType) {
    
    this.sourceType = sourceType;
    return this;
  }

   /**
   * 内容类型（0-长图文 1-短图文 2-视频）
   * @return sourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "内容类型（0-长图文 1-短图文 2-视频）")

  public String getSourceType() {
    return sourceType;
  }


  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  public SourceContentInfo specialTags(List<String> specialTags) {
    
    this.specialTags = specialTags;
    return this;
  }

  public SourceContentInfo addSpecialTagsItem(String specialTagsItem) {
    if (this.specialTags == null) {
      this.specialTags = new ArrayList<>();
    }
    this.specialTags.add(specialTagsItem);
    return this;
  }

   /**
   * 平台加工后的内容标签，例如 HIGH_QUALITY: 优质
   * @return specialTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"HIGH_QUALITY\"]", value = "平台加工后的内容标签，例如 HIGH_QUALITY: 优质")

  public List<String> getSpecialTags() {
    return specialTags;
  }


  public void setSpecialTags(List<String> specialTags) {
    this.specialTags = specialTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceContentInfo sourceContentInfo = (SourceContentInfo) o;
    return Objects.equals(this.contentId, sourceContentInfo.contentId) &&
        Objects.equals(this.link, sourceContentInfo.link) &&
        Objects.equals(this.sourceAuthor, sourceContentInfo.sourceAuthor) &&
        Objects.equals(this.sourceLink, sourceContentInfo.sourceLink) &&
        Objects.equals(this.sourceMediaInfos, sourceContentInfo.sourceMediaInfos) &&
        Objects.equals(this.sourceOffers, sourceContentInfo.sourceOffers) &&
        Objects.equals(this.sourcePublishDate, sourceContentInfo.sourcePublishDate) &&
        Objects.equals(this.sourceStatus, sourceContentInfo.sourceStatus) &&
        Objects.equals(this.sourceSummary, sourceContentInfo.sourceSummary) &&
        Objects.equals(this.sourceTitle, sourceContentInfo.sourceTitle) &&
        Objects.equals(this.sourceType, sourceContentInfo.sourceType) &&
        Objects.equals(this.specialTags, sourceContentInfo.specialTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentId, link, sourceAuthor, sourceLink, sourceMediaInfos, sourceOffers, sourcePublishDate, sourceStatus, sourceSummary, sourceTitle, sourceType, specialTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceContentInfo {\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    sourceAuthor: ").append(toIndentedString(sourceAuthor)).append("\n");
    sb.append("    sourceLink: ").append(toIndentedString(sourceLink)).append("\n");
    sb.append("    sourceMediaInfos: ").append(toIndentedString(sourceMediaInfos)).append("\n");
    sb.append("    sourceOffers: ").append(toIndentedString(sourceOffers)).append("\n");
    sb.append("    sourcePublishDate: ").append(toIndentedString(sourcePublishDate)).append("\n");
    sb.append("    sourceStatus: ").append(toIndentedString(sourceStatus)).append("\n");
    sb.append("    sourceSummary: ").append(toIndentedString(sourceSummary)).append("\n");
    sb.append("    sourceTitle: ").append(toIndentedString(sourceTitle)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    specialTags: ").append(toIndentedString(specialTags)).append("\n");
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
    openapiFields.add("content_id");
    openapiFields.add("link");
    openapiFields.add("source_author");
    openapiFields.add("source_link");
    openapiFields.add("source_media_infos");
    openapiFields.add("source_offers");
    openapiFields.add("source_publish_date");
    openapiFields.add("source_status");
    openapiFields.add("source_summary");
    openapiFields.add("source_title");
    openapiFields.add("source_type");
    openapiFields.add("special_tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SourceContentInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SourceContentInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SourceContentInfo is not found in the empty JSON string", SourceContentInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SourceContentInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SourceContentInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("content_id") != null && !jsonObj.get("content_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_id").toString()));
      }
      if (jsonObj.get("link") != null && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if (jsonObj.get("source_author") != null && !jsonObj.get("source_author").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_author` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_author").toString()));
      }
      if (jsonObj.get("source_link") != null && !jsonObj.get("source_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_link").toString()));
      }
      JsonArray jsonArraysourceMediaInfos = jsonObj.getAsJsonArray("source_media_infos");
      if (jsonArraysourceMediaInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("source_media_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `source_media_infos` to be an array in the JSON string but got `%s`", jsonObj.get("source_media_infos").toString()));
        }

        // validate the optional field `source_media_infos` (array)
        for (int i = 0; i < jsonArraysourceMediaInfos.size(); i++) {
          SourceMediaInfo.validateJsonObject(jsonArraysourceMediaInfos.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraysourceOffers = jsonObj.getAsJsonArray("source_offers");
      if (jsonArraysourceOffers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("source_offers").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `source_offers` to be an array in the JSON string but got `%s`", jsonObj.get("source_offers").toString()));
        }

        // validate the optional field `source_offers` (array)
        for (int i = 0; i < jsonArraysourceOffers.size(); i++) {
          SourceOffer.validateJsonObject(jsonArraysourceOffers.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("source_publish_date") != null && !jsonObj.get("source_publish_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_publish_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_publish_date").toString()));
      }
      if (jsonObj.get("source_status") != null && !jsonObj.get("source_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_status").toString()));
      }
      if (jsonObj.get("source_summary") != null && !jsonObj.get("source_summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_summary").toString()));
      }
      if (jsonObj.get("source_title") != null && !jsonObj.get("source_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_title").toString()));
      }
      if (jsonObj.get("source_type") != null && !jsonObj.get("source_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_type").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("special_tags") != null && !jsonObj.get("special_tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `special_tags` to be an array in the JSON string but got `%s`", jsonObj.get("special_tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SourceContentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SourceContentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SourceContentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SourceContentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SourceContentInfo>() {
           @Override
           public void write(JsonWriter out, SourceContentInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SourceContentInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SourceContentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SourceContentInfo
  * @throws IOException if the JSON string is invalid with respect to SourceContentInfo
  */
  public static SourceContentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SourceContentInfo.class);
  }

 /**
  * Convert an instance of SourceContentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

