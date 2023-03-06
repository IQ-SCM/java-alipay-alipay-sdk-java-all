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
import com.alipay.v3.model.JinyoutestopenidTwo;
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
 * JinyoutestopenidThree
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JinyoutestopenidThree {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_A = "a";
  @SerializedName(SERIALIZED_NAME_A)
  private String a;

  public static final String SERIALIZED_NAME_B = "b";
  @SerializedName(SERIALIZED_NAME_B)
  private String b;

  public static final String SERIALIZED_NAME_B_OPEN_ID = "b_open_id";
  @SerializedName(SERIALIZED_NAME_B_OPEN_ID)
  private String bOpenId;

  public static final String SERIALIZED_NAME_F = "f";
  @SerializedName(SERIALIZED_NAME_F)
  private JinyoutestopenidTwo f;

  public JinyoutestopenidThree() { 
  }

  public JinyoutestopenidThree a(String a) {
    
    this.a = a;
    return this;
  }

   /**
   * 12
   * @return a
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a_noopenid无", value = "12")

  public String getA() {
    return a;
  }


  public void setA(String a) {
    this.a = a;
  }


  public JinyoutestopenidThree b(String b) {
    
    this.b = b;
    return this;
  }

   /**
   * 有openid,无枚举，有注意事项
   * @return b
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21", value = "有openid,无枚举，有注意事项")

  public String getB() {
    return b;
  }


  public void setB(String b) {
    this.b = b;
  }


  public JinyoutestopenidThree bOpenId(String bOpenId) {
    
    this.bOpenId = bOpenId;
    return this;
  }

   /**
   * 有openid,无枚举，有注意事项
   * @return bOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "有openid,无枚举，有注意事项")

  public String getbOpenId() {
    return bOpenId;
  }


  public void setbOpenId(String bOpenId) {
    this.bOpenId = bOpenId;
  }


  public JinyoutestopenidThree f(JinyoutestopenidTwo f) {
    
    this.f = f;
    return this;
  }

   /**
   * Get f
   * @return f
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JinyoutestopenidTwo getF() {
    return f;
  }


  public void setF(JinyoutestopenidTwo f) {
    this.f = f;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JinyoutestopenidThree jinyoutestopenidThree = (JinyoutestopenidThree) o;
    return Objects.equals(this.a, jinyoutestopenidThree.a) &&
        Objects.equals(this.b, jinyoutestopenidThree.b) &&
        Objects.equals(this.bOpenId, jinyoutestopenidThree.bOpenId) &&
        Objects.equals(this.f, jinyoutestopenidThree.f);
  }

  @Override
  public int hashCode() {
    return Objects.hash(a, b, bOpenId, f);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JinyoutestopenidThree {\n");
    sb.append("    a: ").append(toIndentedString(a)).append("\n");
    sb.append("    b: ").append(toIndentedString(b)).append("\n");
    sb.append("    bOpenId: ").append(toIndentedString(bOpenId)).append("\n");
    sb.append("    f: ").append(toIndentedString(f)).append("\n");
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
    openapiFields.add("a");
    openapiFields.add("b");
    openapiFields.add("b_open_id");
    openapiFields.add("f");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JinyoutestopenidThree
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JinyoutestopenidThree.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JinyoutestopenidThree is not found in the empty JSON string", JinyoutestopenidThree.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JinyoutestopenidThree.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JinyoutestopenidThree` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("a") != null && !jsonObj.get("a").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `a` to be a primitive type in the JSON string but got `%s`", jsonObj.get("a").toString()));
      }
      if (jsonObj.get("b") != null && !jsonObj.get("b").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `b` to be a primitive type in the JSON string but got `%s`", jsonObj.get("b").toString()));
      }
      if (jsonObj.get("b_open_id") != null && !jsonObj.get("b_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `b_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("b_open_id").toString()));
      }
      // validate the optional field `f`
      if (jsonObj.getAsJsonObject("f") != null) {
        JinyoutestopenidTwo.validateJsonObject(jsonObj.getAsJsonObject("f"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JinyoutestopenidThree.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JinyoutestopenidThree' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JinyoutestopenidThree> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JinyoutestopenidThree.class));

       return (TypeAdapter<T>) new TypeAdapter<JinyoutestopenidThree>() {
           @Override
           public void write(JsonWriter out, JinyoutestopenidThree value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JinyoutestopenidThree read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JinyoutestopenidThree given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JinyoutestopenidThree
  * @throws IOException if the JSON string is invalid with respect to JinyoutestopenidThree
  */
  public static JinyoutestopenidThree fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JinyoutestopenidThree.class);
  }

 /**
  * Convert an instance of JinyoutestopenidThree to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
