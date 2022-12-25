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
 * ZMGOExtConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZMGOExtConfig {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TEXT_CONTENT_FILL_RULE_ID = "text_content_fill_rule_id";
  @SerializedName(SERIALIZED_NAME_TEXT_CONTENT_FILL_RULE_ID)
  private String textContentFillRuleId;

  public static final String SERIALIZED_NAME_TEXT_CONTENT_FILL_VARIABLE = "text_content_fill_variable";
  @SerializedName(SERIALIZED_NAME_TEXT_CONTENT_FILL_VARIABLE)
  private String textContentFillVariable;

  public ZMGOExtConfig() { 
  }

  public ZMGOExtConfig textContentFillRuleId(String textContentFillRuleId) {
    
    this.textContentFillRuleId = textContentFillRuleId;
    return this;
  }

   /**
   * 文本内容填充规则ID
   * @return textContentFillRuleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "文本内容填充规则ID")

  public String getTextContentFillRuleId() {
    return textContentFillRuleId;
  }


  public void setTextContentFillRuleId(String textContentFillRuleId) {
    this.textContentFillRuleId = textContentFillRuleId;
  }


  public ZMGOExtConfig textContentFillVariable(String textContentFillVariable) {
    
    this.textContentFillVariable = textContentFillVariable;
    return this;
  }

   /**
   * 文本内容填充变量，变量key由运营同学提供
   * @return textContentFillVariable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "文本内容填充变量，变量key由运营同学提供")

  public String getTextContentFillVariable() {
    return textContentFillVariable;
  }


  public void setTextContentFillVariable(String textContentFillVariable) {
    this.textContentFillVariable = textContentFillVariable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZMGOExtConfig zmGOExtConfig = (ZMGOExtConfig) o;
    return Objects.equals(this.textContentFillRuleId, zmGOExtConfig.textContentFillRuleId) &&
        Objects.equals(this.textContentFillVariable, zmGOExtConfig.textContentFillVariable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textContentFillRuleId, textContentFillVariable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZMGOExtConfig {\n");
    sb.append("    textContentFillRuleId: ").append(toIndentedString(textContentFillRuleId)).append("\n");
    sb.append("    textContentFillVariable: ").append(toIndentedString(textContentFillVariable)).append("\n");
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
    openapiFields.add("text_content_fill_rule_id");
    openapiFields.add("text_content_fill_variable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZMGOExtConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZMGOExtConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZMGOExtConfig is not found in the empty JSON string", ZMGOExtConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZMGOExtConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZMGOExtConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("text_content_fill_rule_id") != null && !jsonObj.get("text_content_fill_rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text_content_fill_rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text_content_fill_rule_id").toString()));
      }
      if (jsonObj.get("text_content_fill_variable") != null && !jsonObj.get("text_content_fill_variable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text_content_fill_variable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text_content_fill_variable").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZMGOExtConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZMGOExtConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZMGOExtConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZMGOExtConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ZMGOExtConfig>() {
           @Override
           public void write(JsonWriter out, ZMGOExtConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZMGOExtConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZMGOExtConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZMGOExtConfig
  * @throws IOException if the JSON string is invalid with respect to ZMGOExtConfig
  */
  public static ZMGOExtConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZMGOExtConfig.class);
  }

 /**
  * Convert an instance of ZMGOExtConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

