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
 * AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_USER_TEMPLATE_ID = "user_template_id";
  @SerializedName(SERIALIZED_NAME_USER_TEMPLATE_ID)
  private String userTemplateId;

  public AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel() { 
  }

  public AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel userTemplateId(String userTemplateId) {
    
    this.userTemplateId = userTemplateId;
    return this;
  }

   /**
   * 开发者申请的模板id号，使用该模板id号，开发者可以调用alipay.open.app.mini.templatemessage.send接口进行模板消息发送
   * @return userTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MDI4YzIxMDE2M2I5YTQzYjUxNWE4MjA4NmU1MTIyYmM=", value = "开发者申请的模板id号，使用该模板id号，开发者可以调用alipay.open.app.mini.templatemessage.send接口进行模板消息发送")

  public String getUserTemplateId() {
    return userTemplateId;
  }


  public void setUserTemplateId(String userTemplateId) {
    this.userTemplateId = userTemplateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel alipayOpenMiniTemplatemessageUsertemplateApplyResponseModel = (AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel) o;
    return Objects.equals(this.userTemplateId, alipayOpenMiniTemplatemessageUsertemplateApplyResponseModel.userTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel {\n");
    sb.append("    userTemplateId: ").append(toIndentedString(userTemplateId)).append("\n");
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
    openapiFields.add("user_template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel is not found in the empty JSON string", AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("user_template_id") != null && !jsonObj.get("user_template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_template_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel
  */
  public static AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

