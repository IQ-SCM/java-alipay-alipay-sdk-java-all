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
 * AlipayMerchantTradecomplainReplySubmitModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMerchantTradecomplainReplySubmitModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COMPLAIN_EVENT_ID = "complain_event_id";
  @SerializedName(SERIALIZED_NAME_COMPLAIN_EVENT_ID)
  private String complainEventId;

  public static final String SERIALIZED_NAME_REPLY_CONTENT = "reply_content";
  @SerializedName(SERIALIZED_NAME_REPLY_CONTENT)
  private String replyContent;

  public static final String SERIALIZED_NAME_REPLY_IMAGES = "reply_images";
  @SerializedName(SERIALIZED_NAME_REPLY_IMAGES)
  private String replyImages;

  public AlipayMerchantTradecomplainReplySubmitModel() { 
  }

  public AlipayMerchantTradecomplainReplySubmitModel complainEventId(String complainEventId) {
    
    this.complainEventId = complainEventId;
    return this;
  }

   /**
   * 支付宝侧投诉单号
   * @return complainEventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022032200102000000001459758", value = "支付宝侧投诉单号")

  public String getComplainEventId() {
    return complainEventId;
  }


  public void setComplainEventId(String complainEventId) {
    this.complainEventId = complainEventId;
  }


  public AlipayMerchantTradecomplainReplySubmitModel replyContent(String replyContent) {
    
    this.replyContent = replyContent;
    return this;
  }

   /**
   * 回复留言内容
   * @return replyContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "你好，已发货，快递单号:*****", value = "回复留言内容")

  public String getReplyContent() {
    return replyContent;
  }


  public void setReplyContent(String replyContent) {
    this.replyContent = replyContent;
  }


  public AlipayMerchantTradecomplainReplySubmitModel replyImages(String replyImages) {
    
    this.replyImages = replyImages;
    return this;
  }

   /**
   * 商家处理问题反馈时的回复凭证的图片id，多个逗号隔开（图片id可以通过\&quot;商户上传处理图片\&quot;接口获取）
   * @return replyImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ySYHS5CtTCmag14Wk8jeNAAAACMAAQEW,ySYHS5CtTCmag14Wk8jeNAAAACMAAQAX", value = "商家处理问题反馈时的回复凭证的图片id，多个逗号隔开（图片id可以通过\"商户上传处理图片\"接口获取）")

  public String getReplyImages() {
    return replyImages;
  }


  public void setReplyImages(String replyImages) {
    this.replyImages = replyImages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMerchantTradecomplainReplySubmitModel alipayMerchantTradecomplainReplySubmitModel = (AlipayMerchantTradecomplainReplySubmitModel) o;
    return Objects.equals(this.complainEventId, alipayMerchantTradecomplainReplySubmitModel.complainEventId) &&
        Objects.equals(this.replyContent, alipayMerchantTradecomplainReplySubmitModel.replyContent) &&
        Objects.equals(this.replyImages, alipayMerchantTradecomplainReplySubmitModel.replyImages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complainEventId, replyContent, replyImages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMerchantTradecomplainReplySubmitModel {\n");
    sb.append("    complainEventId: ").append(toIndentedString(complainEventId)).append("\n");
    sb.append("    replyContent: ").append(toIndentedString(replyContent)).append("\n");
    sb.append("    replyImages: ").append(toIndentedString(replyImages)).append("\n");
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
    openapiFields.add("complain_event_id");
    openapiFields.add("reply_content");
    openapiFields.add("reply_images");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMerchantTradecomplainReplySubmitModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMerchantTradecomplainReplySubmitModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMerchantTradecomplainReplySubmitModel is not found in the empty JSON string", AlipayMerchantTradecomplainReplySubmitModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMerchantTradecomplainReplySubmitModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMerchantTradecomplainReplySubmitModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("complain_event_id") != null && !jsonObj.get("complain_event_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `complain_event_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("complain_event_id").toString()));
      }
      if (jsonObj.get("reply_content") != null && !jsonObj.get("reply_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reply_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reply_content").toString()));
      }
      if (jsonObj.get("reply_images") != null && !jsonObj.get("reply_images").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reply_images` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reply_images").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMerchantTradecomplainReplySubmitModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMerchantTradecomplainReplySubmitModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMerchantTradecomplainReplySubmitModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMerchantTradecomplainReplySubmitModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMerchantTradecomplainReplySubmitModel>() {
           @Override
           public void write(JsonWriter out, AlipayMerchantTradecomplainReplySubmitModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMerchantTradecomplainReplySubmitModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMerchantTradecomplainReplySubmitModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMerchantTradecomplainReplySubmitModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMerchantTradecomplainReplySubmitModel
  */
  public static AlipayMerchantTradecomplainReplySubmitModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMerchantTradecomplainReplySubmitModel.class);
  }

 /**
  * Convert an instance of AlipayMerchantTradecomplainReplySubmitModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
