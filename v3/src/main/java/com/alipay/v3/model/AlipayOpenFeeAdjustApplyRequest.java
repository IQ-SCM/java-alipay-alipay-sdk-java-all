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
import com.alipay.v3.model.AlipayOpenFeeAdjustApplyModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
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
 * AlipayOpenFeeAdjustApplyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenFeeAdjustApplyRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ATTACHMENT = "attachment";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT)
  private File attachment;

  public static final String SERIALIZED_NAME_CERT_PIC = "cert_pic";
  @SerializedName(SERIALIZED_NAME_CERT_PIC)
  private File certPic;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private AlipayOpenFeeAdjustApplyModel data;

  public static final String SERIALIZED_NAME_SHOP_SCENE_PIC = "shop_scene_pic";
  @SerializedName(SERIALIZED_NAME_SHOP_SCENE_PIC)
  private File shopScenePic;

  public static final String SERIALIZED_NAME_SHOP_SIGN_PIC = "shop_sign_pic";
  @SerializedName(SERIALIZED_NAME_SHOP_SIGN_PIC)
  private File shopSignPic;

  public AlipayOpenFeeAdjustApplyRequest() { 
  }

  public AlipayOpenFeeAdjustApplyRequest attachment(File attachment) {
    
    this.attachment = attachment;
    return this;
  }

   /**
   * Get attachment
   * @return attachment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getAttachment() {
    return attachment;
  }


  public void setAttachment(File attachment) {
    this.attachment = attachment;
  }


  public AlipayOpenFeeAdjustApplyRequest certPic(File certPic) {
    
    this.certPic = certPic;
    return this;
  }

   /**
   * Get certPic
   * @return certPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getCertPic() {
    return certPic;
  }


  public void setCertPic(File certPic) {
    this.certPic = certPic;
  }


  public AlipayOpenFeeAdjustApplyRequest data(AlipayOpenFeeAdjustApplyModel data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AlipayOpenFeeAdjustApplyModel getData() {
    return data;
  }


  public void setData(AlipayOpenFeeAdjustApplyModel data) {
    this.data = data;
  }


  public AlipayOpenFeeAdjustApplyRequest shopScenePic(File shopScenePic) {
    
    this.shopScenePic = shopScenePic;
    return this;
  }

   /**
   * Get shopScenePic
   * @return shopScenePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getShopScenePic() {
    return shopScenePic;
  }


  public void setShopScenePic(File shopScenePic) {
    this.shopScenePic = shopScenePic;
  }


  public AlipayOpenFeeAdjustApplyRequest shopSignPic(File shopSignPic) {
    
    this.shopSignPic = shopSignPic;
    return this;
  }

   /**
   * Get shopSignPic
   * @return shopSignPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getShopSignPic() {
    return shopSignPic;
  }


  public void setShopSignPic(File shopSignPic) {
    this.shopSignPic = shopSignPic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenFeeAdjustApplyRequest alipayOpenFeeAdjustApplyRequest = (AlipayOpenFeeAdjustApplyRequest) o;
    return Objects.equals(this.attachment, alipayOpenFeeAdjustApplyRequest.attachment) &&
        Objects.equals(this.certPic, alipayOpenFeeAdjustApplyRequest.certPic) &&
        Objects.equals(this.data, alipayOpenFeeAdjustApplyRequest.data) &&
        Objects.equals(this.shopScenePic, alipayOpenFeeAdjustApplyRequest.shopScenePic) &&
        Objects.equals(this.shopSignPic, alipayOpenFeeAdjustApplyRequest.shopSignPic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachment, certPic, data, shopScenePic, shopSignPic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenFeeAdjustApplyRequest {\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    certPic: ").append(toIndentedString(certPic)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    shopScenePic: ").append(toIndentedString(shopScenePic)).append("\n");
    sb.append("    shopSignPic: ").append(toIndentedString(shopSignPic)).append("\n");
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
    openapiFields.add("attachment");
    openapiFields.add("cert_pic");
    openapiFields.add("data");
    openapiFields.add("shop_scene_pic");
    openapiFields.add("shop_sign_pic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenFeeAdjustApplyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenFeeAdjustApplyRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenFeeAdjustApplyRequest is not found in the empty JSON string", AlipayOpenFeeAdjustApplyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenFeeAdjustApplyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenFeeAdjustApplyRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        AlipayOpenFeeAdjustApplyModel.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenFeeAdjustApplyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenFeeAdjustApplyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenFeeAdjustApplyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenFeeAdjustApplyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenFeeAdjustApplyRequest>() {
           @Override
           public void write(JsonWriter out, AlipayOpenFeeAdjustApplyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenFeeAdjustApplyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenFeeAdjustApplyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenFeeAdjustApplyRequest
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenFeeAdjustApplyRequest
  */
  public static AlipayOpenFeeAdjustApplyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenFeeAdjustApplyRequest.class);
  }

 /**
  * Convert an instance of AlipayOpenFeeAdjustApplyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

