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
 * MiniAppCategoryInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MiniAppCategoryInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FIRST_CATEGORY_ID = "first_category_id";
  @SerializedName(SERIALIZED_NAME_FIRST_CATEGORY_ID)
  private String firstCategoryId;

  public static final String SERIALIZED_NAME_FIRST_CATEGORY_NAME = "first_category_name";
  @SerializedName(SERIALIZED_NAME_FIRST_CATEGORY_NAME)
  private String firstCategoryName;

  public static final String SERIALIZED_NAME_SECOND_CATEGORY_ID = "second_category_id";
  @SerializedName(SERIALIZED_NAME_SECOND_CATEGORY_ID)
  private String secondCategoryId;

  public static final String SERIALIZED_NAME_SECOND_CATEGORY_NAME = "second_category_name";
  @SerializedName(SERIALIZED_NAME_SECOND_CATEGORY_NAME)
  private String secondCategoryName;

  public static final String SERIALIZED_NAME_THIRD_CATEGORY_ID = "third_category_id";
  @SerializedName(SERIALIZED_NAME_THIRD_CATEGORY_ID)
  private String thirdCategoryId;

  public static final String SERIALIZED_NAME_THIRD_CATEGORY_NAME = "third_category_name";
  @SerializedName(SERIALIZED_NAME_THIRD_CATEGORY_NAME)
  private String thirdCategoryName;

  public MiniAppCategoryInfo() { 
  }

  public MiniAppCategoryInfo firstCategoryId(String firstCategoryId) {
    
    this.firstCategoryId = firstCategoryId;
    return this;
  }

   /**
   * 一级类目id
   * @return firstCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "一级类目id")

  public String getFirstCategoryId() {
    return firstCategoryId;
  }


  public void setFirstCategoryId(String firstCategoryId) {
    this.firstCategoryId = firstCategoryId;
  }


  public MiniAppCategoryInfo firstCategoryName(String firstCategoryName) {
    
    this.firstCategoryName = firstCategoryName;
    return this;
  }

   /**
   * 一级类目名称
   * @return firstCategoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "一级类目名称")

  public String getFirstCategoryName() {
    return firstCategoryName;
  }


  public void setFirstCategoryName(String firstCategoryName) {
    this.firstCategoryName = firstCategoryName;
  }


  public MiniAppCategoryInfo secondCategoryId(String secondCategoryId) {
    
    this.secondCategoryId = secondCategoryId;
    return this;
  }

   /**
   * 二级类目id
   * @return secondCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "二级类目id")

  public String getSecondCategoryId() {
    return secondCategoryId;
  }


  public void setSecondCategoryId(String secondCategoryId) {
    this.secondCategoryId = secondCategoryId;
  }


  public MiniAppCategoryInfo secondCategoryName(String secondCategoryName) {
    
    this.secondCategoryName = secondCategoryName;
    return this;
  }

   /**
   * 二级类目名称
   * @return secondCategoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "二级类目名称")

  public String getSecondCategoryName() {
    return secondCategoryName;
  }


  public void setSecondCategoryName(String secondCategoryName) {
    this.secondCategoryName = secondCategoryName;
  }


  public MiniAppCategoryInfo thirdCategoryId(String thirdCategoryId) {
    
    this.thirdCategoryId = thirdCategoryId;
    return this;
  }

   /**
   * 三级类目id，可空
   * @return thirdCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "三级类目id，可空")

  public String getThirdCategoryId() {
    return thirdCategoryId;
  }


  public void setThirdCategoryId(String thirdCategoryId) {
    this.thirdCategoryId = thirdCategoryId;
  }


  public MiniAppCategoryInfo thirdCategoryName(String thirdCategoryName) {
    
    this.thirdCategoryName = thirdCategoryName;
    return this;
  }

   /**
   * 三级类目名称，可空
   * @return thirdCategoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "三级类目名称，可空")

  public String getThirdCategoryName() {
    return thirdCategoryName;
  }


  public void setThirdCategoryName(String thirdCategoryName) {
    this.thirdCategoryName = thirdCategoryName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MiniAppCategoryInfo miniAppCategoryInfo = (MiniAppCategoryInfo) o;
    return Objects.equals(this.firstCategoryId, miniAppCategoryInfo.firstCategoryId) &&
        Objects.equals(this.firstCategoryName, miniAppCategoryInfo.firstCategoryName) &&
        Objects.equals(this.secondCategoryId, miniAppCategoryInfo.secondCategoryId) &&
        Objects.equals(this.secondCategoryName, miniAppCategoryInfo.secondCategoryName) &&
        Objects.equals(this.thirdCategoryId, miniAppCategoryInfo.thirdCategoryId) &&
        Objects.equals(this.thirdCategoryName, miniAppCategoryInfo.thirdCategoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstCategoryId, firstCategoryName, secondCategoryId, secondCategoryName, thirdCategoryId, thirdCategoryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiniAppCategoryInfo {\n");
    sb.append("    firstCategoryId: ").append(toIndentedString(firstCategoryId)).append("\n");
    sb.append("    firstCategoryName: ").append(toIndentedString(firstCategoryName)).append("\n");
    sb.append("    secondCategoryId: ").append(toIndentedString(secondCategoryId)).append("\n");
    sb.append("    secondCategoryName: ").append(toIndentedString(secondCategoryName)).append("\n");
    sb.append("    thirdCategoryId: ").append(toIndentedString(thirdCategoryId)).append("\n");
    sb.append("    thirdCategoryName: ").append(toIndentedString(thirdCategoryName)).append("\n");
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
    openapiFields.add("first_category_id");
    openapiFields.add("first_category_name");
    openapiFields.add("second_category_id");
    openapiFields.add("second_category_name");
    openapiFields.add("third_category_id");
    openapiFields.add("third_category_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MiniAppCategoryInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MiniAppCategoryInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MiniAppCategoryInfo is not found in the empty JSON string", MiniAppCategoryInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MiniAppCategoryInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MiniAppCategoryInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("first_category_id") != null && !jsonObj.get("first_category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_category_id").toString()));
      }
      if (jsonObj.get("first_category_name") != null && !jsonObj.get("first_category_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_category_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_category_name").toString()));
      }
      if (jsonObj.get("second_category_id") != null && !jsonObj.get("second_category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `second_category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("second_category_id").toString()));
      }
      if (jsonObj.get("second_category_name") != null && !jsonObj.get("second_category_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `second_category_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("second_category_name").toString()));
      }
      if (jsonObj.get("third_category_id") != null && !jsonObj.get("third_category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `third_category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("third_category_id").toString()));
      }
      if (jsonObj.get("third_category_name") != null && !jsonObj.get("third_category_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `third_category_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("third_category_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MiniAppCategoryInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MiniAppCategoryInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MiniAppCategoryInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MiniAppCategoryInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MiniAppCategoryInfo>() {
           @Override
           public void write(JsonWriter out, MiniAppCategoryInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MiniAppCategoryInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MiniAppCategoryInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MiniAppCategoryInfo
  * @throws IOException if the JSON string is invalid with respect to MiniAppCategoryInfo
  */
  public static MiniAppCategoryInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MiniAppCategoryInfo.class);
  }

 /**
  * Convert an instance of MiniAppCategoryInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
