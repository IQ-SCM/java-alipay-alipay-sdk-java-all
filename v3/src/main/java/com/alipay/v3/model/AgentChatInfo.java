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
 * AgentChatInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AgentChatInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CCS_INSTANCE_ID = "ccs_instance_id";
  @SerializedName(SERIALIZED_NAME_CCS_INSTANCE_ID)
  private String ccsInstanceId;

  public static final String SERIALIZED_NAME_EXTENDED_GROUP_IDS = "extended_group_ids";
  @SerializedName(SERIALIZED_NAME_EXTENDED_GROUP_IDS)
  private List<String> extendedGroupIds = null;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_LEVEL_ID = "level_id";
  @SerializedName(SERIALIZED_NAME_LEVEL_ID)
  private String levelId;

  public AgentChatInfo() { 
  }

  public AgentChatInfo ccsInstanceId(String ccsInstanceId) {
    
    this.ccsInstanceId = ccsInstanceId;
    return this;
  }

   /**
   * 数据权限id(租户实例id)
   * @return ccsInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "数据权限id(租户实例id)")

  public String getCcsInstanceId() {
    return ccsInstanceId;
  }


  public void setCcsInstanceId(String ccsInstanceId) {
    this.ccsInstanceId = ccsInstanceId;
  }


  public AgentChatInfo extendedGroupIds(List<String> extendedGroupIds) {
    
    this.extendedGroupIds = extendedGroupIds;
    return this;
  }

  public AgentChatInfo addExtendedGroupIdsItem(String extendedGroupIdsItem) {
    if (this.extendedGroupIds == null) {
      this.extendedGroupIds = new ArrayList<>();
    }
    this.extendedGroupIds.add(extendedGroupIdsItem);
    return this;
  }

   /**
   * 在线扩展技能组id列表
   * @return extendedGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "在线扩展技能组id列表")

  public List<String> getExtendedGroupIds() {
    return extendedGroupIds;
  }


  public void setExtendedGroupIds(List<String> extendedGroupIds) {
    this.extendedGroupIds = extendedGroupIds;
  }


  public AgentChatInfo groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 在线技能组id
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "在线技能组id")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public AgentChatInfo levelId(String levelId) {
    
    this.levelId = levelId;
    return this;
  }

   /**
   * 在线服务等级
   * @return levelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "在线服务等级")

  public String getLevelId() {
    return levelId;
  }


  public void setLevelId(String levelId) {
    this.levelId = levelId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentChatInfo agentChatInfo = (AgentChatInfo) o;
    return Objects.equals(this.ccsInstanceId, agentChatInfo.ccsInstanceId) &&
        Objects.equals(this.extendedGroupIds, agentChatInfo.extendedGroupIds) &&
        Objects.equals(this.groupId, agentChatInfo.groupId) &&
        Objects.equals(this.levelId, agentChatInfo.levelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccsInstanceId, extendedGroupIds, groupId, levelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentChatInfo {\n");
    sb.append("    ccsInstanceId: ").append(toIndentedString(ccsInstanceId)).append("\n");
    sb.append("    extendedGroupIds: ").append(toIndentedString(extendedGroupIds)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    levelId: ").append(toIndentedString(levelId)).append("\n");
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
    openapiFields.add("extended_group_ids");
    openapiFields.add("group_id");
    openapiFields.add("level_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AgentChatInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AgentChatInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgentChatInfo is not found in the empty JSON string", AgentChatInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AgentChatInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AgentChatInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ccs_instance_id") != null && !jsonObj.get("ccs_instance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ccs_instance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ccs_instance_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("extended_group_ids") != null && !jsonObj.get("extended_group_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `extended_group_ids` to be an array in the JSON string but got `%s`", jsonObj.get("extended_group_ids").toString()));
      }
      if (jsonObj.get("group_id") != null && !jsonObj.get("group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_id").toString()));
      }
      if (jsonObj.get("level_id") != null && !jsonObj.get("level_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `level_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("level_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentChatInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentChatInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentChatInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentChatInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentChatInfo>() {
           @Override
           public void write(JsonWriter out, AgentChatInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentChatInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentChatInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentChatInfo
  * @throws IOException if the JSON string is invalid with respect to AgentChatInfo
  */
  public static AgentChatInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentChatInfo.class);
  }

 /**
  * Convert an instance of AgentChatInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
