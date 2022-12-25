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
 * ZolozAuthenticationSmilepayInitializeResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZolozAuthenticationSmilepayInitializeResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RET_CODE_SUB = "ret_code_sub";
  @SerializedName(SERIALIZED_NAME_RET_CODE_SUB)
  private String retCodeSub;

  public static final String SERIALIZED_NAME_RET_MESSAGE_SUB = "ret_message_sub";
  @SerializedName(SERIALIZED_NAME_RET_MESSAGE_SUB)
  private String retMessageSub;

  public static final String SERIALIZED_NAME_ZIM_ID = "zim_id";
  @SerializedName(SERIALIZED_NAME_ZIM_ID)
  private String zimId;

  public static final String SERIALIZED_NAME_ZIM_INIT_CLIENT_DATA = "zim_init_client_data";
  @SerializedName(SERIALIZED_NAME_ZIM_INIT_CLIENT_DATA)
  private String zimInitClientData;

  public ZolozAuthenticationSmilepayInitializeResponseModel() { 
  }

  public ZolozAuthenticationSmilepayInitializeResponseModel retCodeSub(String retCodeSub) {
    
    this.retCodeSub = retCodeSub;
    return this;
  }

   /**
   * 返回详细码
   * @return retCodeSub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Z3161", value = "返回详细码")

  public String getRetCodeSub() {
    return retCodeSub;
  }


  public void setRetCodeSub(String retCodeSub) {
    this.retCodeSub = retCodeSub;
  }


  public ZolozAuthenticationSmilepayInitializeResponseModel retMessageSub(String retMessageSub) {
    
    this.retMessageSub = retMessageSub;
    return this;
  }

   /**
   * 返回详细信息
   * @return retMessageSub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "操作成功", value = "返回详细信息")

  public String getRetMessageSub() {
    return retMessageSub;
  }


  public void setRetMessageSub(String retMessageSub) {
    this.retMessageSub = retMessageSub;
  }


  public ZolozAuthenticationSmilepayInitializeResponseModel zimId(String zimId) {
    
    this.zimId = zimId;
    return this;
  }

   /**
   * ZIM上下文ID
   * @return zimId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e0bdf675bc8b6f442eb03b2109d59c92d", value = "ZIM上下文ID")

  public String getZimId() {
    return zimId;
  }


  public void setZimId(String zimId) {
    this.zimId = zimId;
  }


  public ZolozAuthenticationSmilepayInitializeResponseModel zimInitClientData(String zimInitClientData) {
    
    this.zimInitClientData = zimInitClientData;
    return this;
  }

   /**
   * 客户端协议
   * @return zimInitClientData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "客户端渲染数据，JSON或PB格式", value = "客户端协议")

  public String getZimInitClientData() {
    return zimInitClientData;
  }


  public void setZimInitClientData(String zimInitClientData) {
    this.zimInitClientData = zimInitClientData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZolozAuthenticationSmilepayInitializeResponseModel zolozAuthenticationSmilepayInitializeResponseModel = (ZolozAuthenticationSmilepayInitializeResponseModel) o;
    return Objects.equals(this.retCodeSub, zolozAuthenticationSmilepayInitializeResponseModel.retCodeSub) &&
        Objects.equals(this.retMessageSub, zolozAuthenticationSmilepayInitializeResponseModel.retMessageSub) &&
        Objects.equals(this.zimId, zolozAuthenticationSmilepayInitializeResponseModel.zimId) &&
        Objects.equals(this.zimInitClientData, zolozAuthenticationSmilepayInitializeResponseModel.zimInitClientData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retCodeSub, retMessageSub, zimId, zimInitClientData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZolozAuthenticationSmilepayInitializeResponseModel {\n");
    sb.append("    retCodeSub: ").append(toIndentedString(retCodeSub)).append("\n");
    sb.append("    retMessageSub: ").append(toIndentedString(retMessageSub)).append("\n");
    sb.append("    zimId: ").append(toIndentedString(zimId)).append("\n");
    sb.append("    zimInitClientData: ").append(toIndentedString(zimInitClientData)).append("\n");
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
    openapiFields.add("ret_code_sub");
    openapiFields.add("ret_message_sub");
    openapiFields.add("zim_id");
    openapiFields.add("zim_init_client_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZolozAuthenticationSmilepayInitializeResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZolozAuthenticationSmilepayInitializeResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZolozAuthenticationSmilepayInitializeResponseModel is not found in the empty JSON string", ZolozAuthenticationSmilepayInitializeResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZolozAuthenticationSmilepayInitializeResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZolozAuthenticationSmilepayInitializeResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ret_code_sub") != null && !jsonObj.get("ret_code_sub").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ret_code_sub` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ret_code_sub").toString()));
      }
      if (jsonObj.get("ret_message_sub") != null && !jsonObj.get("ret_message_sub").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ret_message_sub` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ret_message_sub").toString()));
      }
      if (jsonObj.get("zim_id") != null && !jsonObj.get("zim_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zim_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zim_id").toString()));
      }
      if (jsonObj.get("zim_init_client_data") != null && !jsonObj.get("zim_init_client_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zim_init_client_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zim_init_client_data").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZolozAuthenticationSmilepayInitializeResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZolozAuthenticationSmilepayInitializeResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZolozAuthenticationSmilepayInitializeResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZolozAuthenticationSmilepayInitializeResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZolozAuthenticationSmilepayInitializeResponseModel>() {
           @Override
           public void write(JsonWriter out, ZolozAuthenticationSmilepayInitializeResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZolozAuthenticationSmilepayInitializeResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZolozAuthenticationSmilepayInitializeResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZolozAuthenticationSmilepayInitializeResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZolozAuthenticationSmilepayInitializeResponseModel
  */
  public static ZolozAuthenticationSmilepayInitializeResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZolozAuthenticationSmilepayInitializeResponseModel.class);
  }

 /**
  * Convert an instance of ZolozAuthenticationSmilepayInitializeResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

