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
 * AlipayPassTemplateAddModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayPassTemplateAddModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TPL_CONTENT = "tpl_content";
  @SerializedName(SERIALIZED_NAME_TPL_CONTENT)
  private String tplContent;

  public static final String SERIALIZED_NAME_UNIQUE_ID = "unique_id";
  @SerializedName(SERIALIZED_NAME_UNIQUE_ID)
  private String uniqueId;

  public AlipayPassTemplateAddModel() { 
  }

  public AlipayPassTemplateAddModel tplContent(String tplContent) {
    
    this.tplContent = tplContent;
    return this;
  }

   /**
   * 模板内容信息，遵循JSON规范，详情参见tpl_content &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/016d5g\&quot;&gt;参数详细说明&lt;/a&gt;。
   * @return tplContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"logo\": \"\",\"strip\": null,\"icon\": null,\"content\": {}}", value = "模板内容信息，遵循JSON规范，详情参见tpl_content <a href=\"https://opendocs.alipay.com/open/016d5g\">参数详细说明</a>。")

  public String getTplContent() {
    return tplContent;
  }


  public void setTplContent(String tplContent) {
    this.tplContent = tplContent;
  }


  public AlipayPassTemplateAddModel uniqueId(String uniqueId) {
    
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * 商户用于控制模版的唯一性。（可以使用时间戳保证唯一性）
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20140709150010", value = "商户用于控制模版的唯一性。（可以使用时间戳保证唯一性）")

  public String getUniqueId() {
    return uniqueId;
  }


  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayPassTemplateAddModel alipayPassTemplateAddModel = (AlipayPassTemplateAddModel) o;
    return Objects.equals(this.tplContent, alipayPassTemplateAddModel.tplContent) &&
        Objects.equals(this.uniqueId, alipayPassTemplateAddModel.uniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tplContent, uniqueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayPassTemplateAddModel {\n");
    sb.append("    tplContent: ").append(toIndentedString(tplContent)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
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
    openapiFields.add("tpl_content");
    openapiFields.add("unique_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayPassTemplateAddModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayPassTemplateAddModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayPassTemplateAddModel is not found in the empty JSON string", AlipayPassTemplateAddModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayPassTemplateAddModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayPassTemplateAddModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("tpl_content") != null && !jsonObj.get("tpl_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tpl_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tpl_content").toString()));
      }
      if (jsonObj.get("unique_id") != null && !jsonObj.get("unique_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayPassTemplateAddModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayPassTemplateAddModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayPassTemplateAddModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayPassTemplateAddModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayPassTemplateAddModel>() {
           @Override
           public void write(JsonWriter out, AlipayPassTemplateAddModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayPassTemplateAddModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayPassTemplateAddModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayPassTemplateAddModel
  * @throws IOException if the JSON string is invalid with respect to AlipayPassTemplateAddModel
  */
  public static AlipayPassTemplateAddModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayPassTemplateAddModel.class);
  }

 /**
  * Convert an instance of AlipayPassTemplateAddModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
