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
 * ServiceRecordCatRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceRecordCatRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CAT_NAME = "cat_name";
  @SerializedName(SERIALIZED_NAME_CAT_NAME)
  private String catName;

  public static final String SERIALIZED_NAME_FIRST_CAT = "first_cat";
  @SerializedName(SERIALIZED_NAME_FIRST_CAT)
  private String firstCat;

  public static final String SERIALIZED_NAME_FOURTH_CAT = "fourth_cat";
  @SerializedName(SERIALIZED_NAME_FOURTH_CAT)
  private String fourthCat;

  public static final String SERIALIZED_NAME_INSTENCE_CODE = "instence_code";
  @SerializedName(SERIALIZED_NAME_INSTENCE_CODE)
  private String instenceCode;

  public static final String SERIALIZED_NAME_SECOND_CAT = "second_cat";
  @SerializedName(SERIALIZED_NAME_SECOND_CAT)
  private String secondCat;

  public static final String SERIALIZED_NAME_THIRD_CAT = "third_cat";
  @SerializedName(SERIALIZED_NAME_THIRD_CAT)
  private String thirdCat;

  public ServiceRecordCatRequest() { 
  }

  public ServiceRecordCatRequest catName(String catName) {
    
    this.catName = catName;
    return this;
  }

   /**
   * 类目名称(需要每一级用;分隔封装)
   * @return catName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "类目名称(需要每一级用;分隔封装)")

  public String getCatName() {
    return catName;
  }


  public void setCatName(String catName) {
    this.catName = catName;
  }


  public ServiceRecordCatRequest firstCat(String firstCat) {
    
    this.firstCat = firstCat;
    return this;
  }

   /**
   * 一级类目编码
   * @return firstCat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "一级类目编码")

  public String getFirstCat() {
    return firstCat;
  }


  public void setFirstCat(String firstCat) {
    this.firstCat = firstCat;
  }


  public ServiceRecordCatRequest fourthCat(String fourthCat) {
    
    this.fourthCat = fourthCat;
    return this;
  }

   /**
   * 四级类目编码
   * @return fourthCat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "四级类目编码")

  public String getFourthCat() {
    return fourthCat;
  }


  public void setFourthCat(String fourthCat) {
    this.fourthCat = fourthCat;
  }


  public ServiceRecordCatRequest instenceCode(String instenceCode) {
    
    this.instenceCode = instenceCode;
    return this;
  }

   /**
   * 类目树编码
   * @return instenceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "类目树编码")

  public String getInstenceCode() {
    return instenceCode;
  }


  public void setInstenceCode(String instenceCode) {
    this.instenceCode = instenceCode;
  }


  public ServiceRecordCatRequest secondCat(String secondCat) {
    
    this.secondCat = secondCat;
    return this;
  }

   /**
   * 二级类目编码
   * @return secondCat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "二级类目编码")

  public String getSecondCat() {
    return secondCat;
  }


  public void setSecondCat(String secondCat) {
    this.secondCat = secondCat;
  }


  public ServiceRecordCatRequest thirdCat(String thirdCat) {
    
    this.thirdCat = thirdCat;
    return this;
  }

   /**
   * 三级类目编码
   * @return thirdCat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "三级类目编码")

  public String getThirdCat() {
    return thirdCat;
  }


  public void setThirdCat(String thirdCat) {
    this.thirdCat = thirdCat;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRecordCatRequest serviceRecordCatRequest = (ServiceRecordCatRequest) o;
    return Objects.equals(this.catName, serviceRecordCatRequest.catName) &&
        Objects.equals(this.firstCat, serviceRecordCatRequest.firstCat) &&
        Objects.equals(this.fourthCat, serviceRecordCatRequest.fourthCat) &&
        Objects.equals(this.instenceCode, serviceRecordCatRequest.instenceCode) &&
        Objects.equals(this.secondCat, serviceRecordCatRequest.secondCat) &&
        Objects.equals(this.thirdCat, serviceRecordCatRequest.thirdCat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catName, firstCat, fourthCat, instenceCode, secondCat, thirdCat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRecordCatRequest {\n");
    sb.append("    catName: ").append(toIndentedString(catName)).append("\n");
    sb.append("    firstCat: ").append(toIndentedString(firstCat)).append("\n");
    sb.append("    fourthCat: ").append(toIndentedString(fourthCat)).append("\n");
    sb.append("    instenceCode: ").append(toIndentedString(instenceCode)).append("\n");
    sb.append("    secondCat: ").append(toIndentedString(secondCat)).append("\n");
    sb.append("    thirdCat: ").append(toIndentedString(thirdCat)).append("\n");
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
    openapiFields.add("cat_name");
    openapiFields.add("first_cat");
    openapiFields.add("fourth_cat");
    openapiFields.add("instence_code");
    openapiFields.add("second_cat");
    openapiFields.add("third_cat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceRecordCatRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ServiceRecordCatRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceRecordCatRequest is not found in the empty JSON string", ServiceRecordCatRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ServiceRecordCatRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ServiceRecordCatRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cat_name") != null && !jsonObj.get("cat_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cat_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cat_name").toString()));
      }
      if (jsonObj.get("first_cat") != null && !jsonObj.get("first_cat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_cat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_cat").toString()));
      }
      if (jsonObj.get("fourth_cat") != null && !jsonObj.get("fourth_cat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fourth_cat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fourth_cat").toString()));
      }
      if (jsonObj.get("instence_code") != null && !jsonObj.get("instence_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instence_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instence_code").toString()));
      }
      if (jsonObj.get("second_cat") != null && !jsonObj.get("second_cat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `second_cat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("second_cat").toString()));
      }
      if (jsonObj.get("third_cat") != null && !jsonObj.get("third_cat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `third_cat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("third_cat").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceRecordCatRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceRecordCatRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceRecordCatRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceRecordCatRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceRecordCatRequest>() {
           @Override
           public void write(JsonWriter out, ServiceRecordCatRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServiceRecordCatRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServiceRecordCatRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceRecordCatRequest
  * @throws IOException if the JSON string is invalid with respect to ServiceRecordCatRequest
  */
  public static ServiceRecordCatRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceRecordCatRequest.class);
  }

 /**
  * Convert an instance of ServiceRecordCatRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

