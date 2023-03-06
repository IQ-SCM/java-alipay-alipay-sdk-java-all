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
 * SubscribeRelation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscribeRelation {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_KEEP_STATE = "keep_state";
  @SerializedName(SERIALIZED_NAME_KEEP_STATE)
  private String keepState;

  public static final String SERIALIZED_NAME_SHOW = "show";
  @SerializedName(SERIALIZED_NAME_SHOW)
  private Boolean show;

  public static final String SERIALIZED_NAME_SUBSCRIBE_STATE = "subscribe_state";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBE_STATE)
  private String subscribeState;

  public static final String SERIALIZED_NAME_SUBSCRIBE_TYPE = "subscribe_type";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBE_TYPE)
  private String subscribeType;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public SubscribeRelation() { 
  }

  public SubscribeRelation keepState(String keepState) {
    
    this.keepState = keepState;
    return this;
  }

   /**
   * 订阅保持状态，即用户勾选“总是保持以上选择，不再询问”选项时勾选的订阅状态。枚举值： 0：保持订阅。 1：保持拒绝订阅。 说明：若用户“总是保持以上选择，不再询问”选项，且选择订阅消息。下次触发消息订阅组件时，支付宝将自动发起一次静默订阅（不再拉起订阅组件，无需用户手动订阅）。
   * @return keepState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "订阅保持状态，即用户勾选“总是保持以上选择，不再询问”选项时勾选的订阅状态。枚举值： 0：保持订阅。 1：保持拒绝订阅。 说明：若用户“总是保持以上选择，不再询问”选项，且选择订阅消息。下次触发消息订阅组件时，支付宝将自动发起一次静默订阅（不再拉起订阅组件，无需用户手动订阅）。")

  public String getKeepState() {
    return keepState;
  }


  public void setKeepState(String keepState) {
    this.keepState = keepState;
  }


  public SubscribeRelation show(Boolean show) {
    
    this.show = show;
    return this;
  }

   /**
   * 模板是否展示在订阅组件中。枚举值： true：订阅组件中展示查询的模板。 false：订阅组件中不展示模板
   * @return show
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "模板是否展示在订阅组件中。枚举值： true：订阅组件中展示查询的模板。 false：订阅组件中不展示模板")

  public Boolean getShow() {
    return show;
  }


  public void setShow(Boolean show) {
    this.show = show;
  }


  public SubscribeRelation subscribeState(String subscribeState) {
    
    this.subscribeState = subscribeState;
    return this;
  }

   /**
   * 订阅状态。枚举值 0：拒绝订阅。 1：订阅
   * @return subscribeState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "订阅状态。枚举值 0：拒绝订阅。 1：订阅")

  public String getSubscribeState() {
    return subscribeState;
  }


  public void setSubscribeState(String subscribeState) {
    this.subscribeState = subscribeState;
  }


  public SubscribeRelation subscribeType(String subscribeType) {
    
    this.subscribeType = subscribeType;
    return this;
  }

   /**
   * 消息模板的订阅类型。枚举值： longterm：长期性订阅 onetime：一次性订阅
   * @return subscribeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "longterm", value = "消息模板的订阅类型。枚举值： longterm：长期性订阅 onetime：一次性订阅")

  public String getSubscribeType() {
    return subscribeType;
  }


  public void setSubscribeType(String subscribeType) {
    this.subscribeType = subscribeType;
  }


  public SubscribeRelation templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 消息模板id
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7c866fab64464afaa956223c74ce6cbc", value = "消息模板id")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscribeRelation subscribeRelation = (SubscribeRelation) o;
    return Objects.equals(this.keepState, subscribeRelation.keepState) &&
        Objects.equals(this.show, subscribeRelation.show) &&
        Objects.equals(this.subscribeState, subscribeRelation.subscribeState) &&
        Objects.equals(this.subscribeType, subscribeRelation.subscribeType) &&
        Objects.equals(this.templateId, subscribeRelation.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keepState, show, subscribeState, subscribeType, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscribeRelation {\n");
    sb.append("    keepState: ").append(toIndentedString(keepState)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
    sb.append("    subscribeState: ").append(toIndentedString(subscribeState)).append("\n");
    sb.append("    subscribeType: ").append(toIndentedString(subscribeType)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("keep_state");
    openapiFields.add("show");
    openapiFields.add("subscribe_state");
    openapiFields.add("subscribe_type");
    openapiFields.add("template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscribeRelation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubscribeRelation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscribeRelation is not found in the empty JSON string", SubscribeRelation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubscribeRelation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscribeRelation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("keep_state") != null && !jsonObj.get("keep_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keep_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keep_state").toString()));
      }
      if (jsonObj.get("subscribe_state") != null && !jsonObj.get("subscribe_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscribe_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscribe_state").toString()));
      }
      if (jsonObj.get("subscribe_type") != null && !jsonObj.get("subscribe_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscribe_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscribe_type").toString()));
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscribeRelation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscribeRelation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscribeRelation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscribeRelation.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscribeRelation>() {
           @Override
           public void write(JsonWriter out, SubscribeRelation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscribeRelation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscribeRelation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscribeRelation
  * @throws IOException if the JSON string is invalid with respect to SubscribeRelation
  */
  public static SubscribeRelation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscribeRelation.class);
  }

 /**
  * Convert an instance of SubscribeRelation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
