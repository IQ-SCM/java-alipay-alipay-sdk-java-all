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
 * AlipayOpenPublicPersonalizedMenuCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicPersonalizedMenuCreateResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MENU_KEY = "menu_key";
  @SerializedName(SERIALIZED_NAME_MENU_KEY)
  private String menuKey;

  public AlipayOpenPublicPersonalizedMenuCreateResponseModel() { 
  }

  public AlipayOpenPublicPersonalizedMenuCreateResponseModel menuKey(String menuKey) {
    
    this.menuKey = menuKey;
    return this;
  }

   /**
   * 该套个性化菜单key
   * @return menuKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100000", value = "该套个性化菜单key")

  public String getMenuKey() {
    return menuKey;
  }


  public void setMenuKey(String menuKey) {
    this.menuKey = menuKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicPersonalizedMenuCreateResponseModel alipayOpenPublicPersonalizedMenuCreateResponseModel = (AlipayOpenPublicPersonalizedMenuCreateResponseModel) o;
    return Objects.equals(this.menuKey, alipayOpenPublicPersonalizedMenuCreateResponseModel.menuKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicPersonalizedMenuCreateResponseModel {\n");
    sb.append("    menuKey: ").append(toIndentedString(menuKey)).append("\n");
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
    openapiFields.add("menu_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicPersonalizedMenuCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicPersonalizedMenuCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicPersonalizedMenuCreateResponseModel is not found in the empty JSON string", AlipayOpenPublicPersonalizedMenuCreateResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicPersonalizedMenuCreateResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicPersonalizedMenuCreateResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("menu_key") != null && !jsonObj.get("menu_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `menu_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("menu_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicPersonalizedMenuCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicPersonalizedMenuCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicPersonalizedMenuCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicPersonalizedMenuCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicPersonalizedMenuCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicPersonalizedMenuCreateResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicPersonalizedMenuCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicPersonalizedMenuCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicPersonalizedMenuCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicPersonalizedMenuCreateResponseModel
  */
  public static AlipayOpenPublicPersonalizedMenuCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicPersonalizedMenuCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicPersonalizedMenuCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
