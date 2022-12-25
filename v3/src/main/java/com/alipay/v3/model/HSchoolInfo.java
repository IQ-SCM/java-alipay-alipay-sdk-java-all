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
 * HSchoolInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HSchoolInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CAMPUS_NO = "campus_no";
  @SerializedName(SERIALIZED_NAME_CAMPUS_NO)
  private String campusNo;

  public static final String SERIALIZED_NAME_SCHOOL_STD_CODE = "school_std_code";
  @SerializedName(SERIALIZED_NAME_SCHOOL_STD_CODE)
  private String schoolStdCode;

  public HSchoolInfo() { 
  }

  public HSchoolInfo campusNo(String campusNo) {
    
    this.campusNo = campusNo;
    return this;
  }

   /**
   * 学号
   * @return campusNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019021208", value = "学号")

  public String getCampusNo() {
    return campusNo;
  }


  public void setCampusNo(String campusNo) {
    this.campusNo = campusNo;
  }


  public HSchoolInfo schoolStdCode(String schoolStdCode) {
    
    this.schoolStdCode = schoolStdCode;
    return this;
  }

   /**
   * 学校外标
   * @return schoolStdCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4136013432", value = "学校外标")

  public String getSchoolStdCode() {
    return schoolStdCode;
  }


  public void setSchoolStdCode(String schoolStdCode) {
    this.schoolStdCode = schoolStdCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HSchoolInfo hschoolInfo = (HSchoolInfo) o;
    return Objects.equals(this.campusNo, hschoolInfo.campusNo) &&
        Objects.equals(this.schoolStdCode, hschoolInfo.schoolStdCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campusNo, schoolStdCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HSchoolInfo {\n");
    sb.append("    campusNo: ").append(toIndentedString(campusNo)).append("\n");
    sb.append("    schoolStdCode: ").append(toIndentedString(schoolStdCode)).append("\n");
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
    openapiFields.add("campus_no");
    openapiFields.add("school_std_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HSchoolInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (HSchoolInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in HSchoolInfo is not found in the empty JSON string", HSchoolInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HSchoolInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HSchoolInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("campus_no") != null && !jsonObj.get("campus_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campus_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campus_no").toString()));
      }
      if (jsonObj.get("school_std_code") != null && !jsonObj.get("school_std_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school_std_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school_std_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HSchoolInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HSchoolInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HSchoolInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HSchoolInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<HSchoolInfo>() {
           @Override
           public void write(JsonWriter out, HSchoolInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HSchoolInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HSchoolInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HSchoolInfo
  * @throws IOException if the JSON string is invalid with respect to HSchoolInfo
  */
  public static HSchoolInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HSchoolInfo.class);
  }

 /**
  * Convert an instance of HSchoolInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

