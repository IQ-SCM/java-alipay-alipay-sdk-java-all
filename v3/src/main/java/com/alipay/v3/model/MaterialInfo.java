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
 * MaterialInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MaterialInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private String materialId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public MaterialInfo() { 
  }

  public MaterialInfo content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 素材内容（素材地址或素材KEY）
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "素材内容（素材地址或素材KEY）")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public MaterialInfo materialId(String materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 素材ID
   * @return materialId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "素材ID")

  public String getMaterialId() {
    return materialId;
  }


  public void setMaterialId(String materialId) {
    this.materialId = materialId;
  }


  public MaterialInfo type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 素材类型
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "素材类型")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialInfo materialInfo = (MaterialInfo) o;
    return Objects.equals(this.content, materialInfo.content) &&
        Objects.equals(this.materialId, materialInfo.materialId) &&
        Objects.equals(this.type, materialInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, materialId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaterialInfo {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("material_id");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MaterialInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MaterialInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MaterialInfo is not found in the empty JSON string", MaterialInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MaterialInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MaterialInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (jsonObj.get("material_id") != null && !jsonObj.get("material_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `material_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("material_id").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MaterialInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MaterialInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MaterialInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MaterialInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MaterialInfo>() {
           @Override
           public void write(JsonWriter out, MaterialInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MaterialInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MaterialInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MaterialInfo
  * @throws IOException if the JSON string is invalid with respect to MaterialInfo
  */
  public static MaterialInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MaterialInfo.class);
  }

 /**
  * Convert an instance of MaterialInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

