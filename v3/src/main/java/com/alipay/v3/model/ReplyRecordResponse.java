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
 * ReplyRecordResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReplyRecordResponse {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<String> images = null;

  public static final String SERIALIZED_NAME_REPLIER_NAME = "replier_name";
  @SerializedName(SERIALIZED_NAME_REPLIER_NAME)
  private String replierName;

  public static final String SERIALIZED_NAME_REPLIER_ROLE = "replier_role";
  @SerializedName(SERIALIZED_NAME_REPLIER_ROLE)
  private String replierRole;

  public ReplyRecordResponse() { 
  }

  public ReplyRecordResponse content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 回复内容
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "已退款退货给您，物流单号为：12344444", value = "回复内容")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public ReplyRecordResponse gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 回复时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-02-14 14:23:12", value = "回复时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public ReplyRecordResponse images(List<String> images) {
    
    this.images = images;
    return this;
  }

  public ReplyRecordResponse addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * 回复图片
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"http://mdn.alipay.com/wsdk/img?fileid=A*ME4GQq2j-5oAAAAAAAAAAAAAAQAAAQ&amp;t=83fed12ef006ebcd8df04dfe79faad6c&amp;bi=openpunsh&amp;ts=0&amp;zoom=original\"]", value = "回复图片")

  public List<String> getImages() {
    return images;
  }


  public void setImages(List<String> images) {
    this.images = images;
  }


  public ReplyRecordResponse replierName(String replierName) {
    
    this.replierName = replierName;
    return this;
  }

   /**
   * 回复人名称
   * @return replierName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "刘*", value = "回复人名称")

  public String getReplierName() {
    return replierName;
  }


  public void setReplierName(String replierName) {
    this.replierName = replierName;
  }


  public ReplyRecordResponse replierRole(String replierRole) {
    
    this.replierRole = replierRole;
    return this;
  }

   /**
   * 用户：USER  商家：MERCHANT 系统：SYSTEM 审核小二：AUDITOR 政府单位：GOVERNMENT
   * @return replierRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USER", value = "用户：USER  商家：MERCHANT 系统：SYSTEM 审核小二：AUDITOR 政府单位：GOVERNMENT")

  public String getReplierRole() {
    return replierRole;
  }


  public void setReplierRole(String replierRole) {
    this.replierRole = replierRole;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplyRecordResponse replyRecordResponse = (ReplyRecordResponse) o;
    return Objects.equals(this.content, replyRecordResponse.content) &&
        Objects.equals(this.gmtCreate, replyRecordResponse.gmtCreate) &&
        Objects.equals(this.images, replyRecordResponse.images) &&
        Objects.equals(this.replierName, replyRecordResponse.replierName) &&
        Objects.equals(this.replierRole, replyRecordResponse.replierRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, gmtCreate, images, replierName, replierRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplyRecordResponse {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    replierName: ").append(toIndentedString(replierName)).append("\n");
    sb.append("    replierRole: ").append(toIndentedString(replierRole)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("gmt_create");
    openapiFields.add("images");
    openapiFields.add("replier_name");
    openapiFields.add("replier_role");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReplyRecordResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReplyRecordResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReplyRecordResponse is not found in the empty JSON string", ReplyRecordResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReplyRecordResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReplyRecordResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("images") != null && !jsonObj.get("images").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `images` to be an array in the JSON string but got `%s`", jsonObj.get("images").toString()));
      }
      if (jsonObj.get("replier_name") != null && !jsonObj.get("replier_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replier_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replier_name").toString()));
      }
      if (jsonObj.get("replier_role") != null && !jsonObj.get("replier_role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replier_role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replier_role").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReplyRecordResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReplyRecordResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReplyRecordResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReplyRecordResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReplyRecordResponse>() {
           @Override
           public void write(JsonWriter out, ReplyRecordResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReplyRecordResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReplyRecordResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReplyRecordResponse
  * @throws IOException if the JSON string is invalid with respect to ReplyRecordResponse
  */
  public static ReplyRecordResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReplyRecordResponse.class);
  }

 /**
  * Convert an instance of ReplyRecordResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

