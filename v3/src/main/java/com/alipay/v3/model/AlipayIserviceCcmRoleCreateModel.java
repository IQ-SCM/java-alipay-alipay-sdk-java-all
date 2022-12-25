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
 * AlipayIserviceCcmRoleCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmRoleCreateModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CCS_INSTANCE_ID = "ccs_instance_id";
  @SerializedName(SERIALIZED_NAME_CCS_INSTANCE_ID)
  private String ccsInstanceId;

  public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
  @SerializedName(SERIALIZED_NAME_CREATOR_ID)
  private String creatorId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FUNCTION_IDS = "function_ids";
  @SerializedName(SERIALIZED_NAME_FUNCTION_IDS)
  private List<String> functionIds = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public AlipayIserviceCcmRoleCreateModel() { 
  }

  public AlipayIserviceCcmRoleCreateModel ccsInstanceId(String ccsInstanceId) {
    
    this.ccsInstanceId = ccsInstanceId;
    return this;
  }

   /**
   * 部门id（即租户实例ID、数据权限ID）
   * @return ccsInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "jwa_8J2l", value = "部门id（即租户实例ID、数据权限ID）")

  public String getCcsInstanceId() {
    return ccsInstanceId;
  }


  public void setCcsInstanceId(String ccsInstanceId) {
    this.ccsInstanceId = ccsInstanceId;
  }


  public AlipayIserviceCcmRoleCreateModel creatorId(String creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * 创建人id
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201835445454546", value = "创建人id")

  public String getCreatorId() {
    return creatorId;
  }


  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }


  public AlipayIserviceCcmRoleCreateModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 角色描述信息
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "我是角色描述...", value = "角色描述信息")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AlipayIserviceCcmRoleCreateModel functionIds(List<String> functionIds) {
    
    this.functionIds = functionIds;
    return this;
  }

  public AlipayIserviceCcmRoleCreateModel addFunctionIdsItem(String functionIdsItem) {
    if (this.functionIds == null) {
      this.functionIds = new ArrayList<>();
    }
    this.functionIds.add(functionIdsItem);
    return this;
  }

   /**
   * 角色关联额功能点id
   * @return functionIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"123\",\"456\"]", value = "角色关联额功能点id")

  public List<String> getFunctionIds() {
    return functionIds;
  }


  public void setFunctionIds(List<String> functionIds) {
    this.functionIds = functionIds;
  }


  public AlipayIserviceCcmRoleCreateModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 角色名
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "保险类角色", value = "角色名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmRoleCreateModel alipayIserviceCcmRoleCreateModel = (AlipayIserviceCcmRoleCreateModel) o;
    return Objects.equals(this.ccsInstanceId, alipayIserviceCcmRoleCreateModel.ccsInstanceId) &&
        Objects.equals(this.creatorId, alipayIserviceCcmRoleCreateModel.creatorId) &&
        Objects.equals(this.description, alipayIserviceCcmRoleCreateModel.description) &&
        Objects.equals(this.functionIds, alipayIserviceCcmRoleCreateModel.functionIds) &&
        Objects.equals(this.name, alipayIserviceCcmRoleCreateModel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccsInstanceId, creatorId, description, functionIds, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmRoleCreateModel {\n");
    sb.append("    ccsInstanceId: ").append(toIndentedString(ccsInstanceId)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    functionIds: ").append(toIndentedString(functionIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("ccs_instance_id");
    openapiFields.add("creator_id");
    openapiFields.add("description");
    openapiFields.add("function_ids");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmRoleCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmRoleCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmRoleCreateModel is not found in the empty JSON string", AlipayIserviceCcmRoleCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmRoleCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmRoleCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ccs_instance_id") != null && !jsonObj.get("ccs_instance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ccs_instance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ccs_instance_id").toString()));
      }
      if (jsonObj.get("creator_id") != null && !jsonObj.get("creator_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_id").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("function_ids") != null && !jsonObj.get("function_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `function_ids` to be an array in the JSON string but got `%s`", jsonObj.get("function_ids").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmRoleCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmRoleCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmRoleCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmRoleCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmRoleCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmRoleCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmRoleCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmRoleCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmRoleCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmRoleCreateModel
  */
  public static AlipayIserviceCcmRoleCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmRoleCreateModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmRoleCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

