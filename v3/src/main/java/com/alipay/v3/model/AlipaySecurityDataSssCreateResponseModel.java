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
 * AlipaySecurityDataSssCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipaySecurityDataSssCreateResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_C = "c";
  @SerializedName(SERIALIZED_NAME_C)
  private String c;

  public static final String SERIALIZED_NAME_C_OPEN_ID = "c_open_id";
  @SerializedName(SERIALIZED_NAME_C_OPEN_ID)
  private String cOpenId;

  public AlipaySecurityDataSssCreateResponseModel() { 
  }

  public AlipaySecurityDataSssCreateResponseModel c(String c) {
    
    this.c = c;
    return this;
  }

   /**
   * 区
   * @return c
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "区")

  public String getC() {
    return c;
  }


  public void setC(String c) {
    this.c = c;
  }


  public AlipaySecurityDataSssCreateResponseModel cOpenId(String cOpenId) {
    
    this.cOpenId = cOpenId;
    return this;
  }

   /**
   * 区
   * @return cOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "区")

  public String getcOpenId() {
    return cOpenId;
  }


  public void setcOpenId(String cOpenId) {
    this.cOpenId = cOpenId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipaySecurityDataSssCreateResponseModel alipaySecurityDataSssCreateResponseModel = (AlipaySecurityDataSssCreateResponseModel) o;
    return Objects.equals(this.c, alipaySecurityDataSssCreateResponseModel.c) &&
        Objects.equals(this.cOpenId, alipaySecurityDataSssCreateResponseModel.cOpenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c, cOpenId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipaySecurityDataSssCreateResponseModel {\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    cOpenId: ").append(toIndentedString(cOpenId)).append("\n");
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
    openapiFields.add("c");
    openapiFields.add("c_open_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipaySecurityDataSssCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipaySecurityDataSssCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipaySecurityDataSssCreateResponseModel is not found in the empty JSON string", AlipaySecurityDataSssCreateResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipaySecurityDataSssCreateResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipaySecurityDataSssCreateResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("c") != null && !jsonObj.get("c").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `c` to be a primitive type in the JSON string but got `%s`", jsonObj.get("c").toString()));
      }
      if (jsonObj.get("c_open_id") != null && !jsonObj.get("c_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `c_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("c_open_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipaySecurityDataSssCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipaySecurityDataSssCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipaySecurityDataSssCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipaySecurityDataSssCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipaySecurityDataSssCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipaySecurityDataSssCreateResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipaySecurityDataSssCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipaySecurityDataSssCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipaySecurityDataSssCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipaySecurityDataSssCreateResponseModel
  */
  public static AlipaySecurityDataSssCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipaySecurityDataSssCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipaySecurityDataSssCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
