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
 * AntMerchantExpandItemDeleteResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AntMerchantExpandItemDeleteResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public AntMerchantExpandItemDeleteResponseModel() { 
  }

  public AntMerchantExpandItemDeleteResponseModel itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 商品id
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018091300502200002600104169", value = "商品id")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntMerchantExpandItemDeleteResponseModel antMerchantExpandItemDeleteResponseModel = (AntMerchantExpandItemDeleteResponseModel) o;
    return Objects.equals(this.itemId, antMerchantExpandItemDeleteResponseModel.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntMerchantExpandItemDeleteResponseModel {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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
    openapiFields.add("item_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AntMerchantExpandItemDeleteResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AntMerchantExpandItemDeleteResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AntMerchantExpandItemDeleteResponseModel is not found in the empty JSON string", AntMerchantExpandItemDeleteResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AntMerchantExpandItemDeleteResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AntMerchantExpandItemDeleteResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("item_id") != null && !jsonObj.get("item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AntMerchantExpandItemDeleteResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AntMerchantExpandItemDeleteResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AntMerchantExpandItemDeleteResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AntMerchantExpandItemDeleteResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AntMerchantExpandItemDeleteResponseModel>() {
           @Override
           public void write(JsonWriter out, AntMerchantExpandItemDeleteResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AntMerchantExpandItemDeleteResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AntMerchantExpandItemDeleteResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AntMerchantExpandItemDeleteResponseModel
  * @throws IOException if the JSON string is invalid with respect to AntMerchantExpandItemDeleteResponseModel
  */
  public static AntMerchantExpandItemDeleteResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AntMerchantExpandItemDeleteResponseModel.class);
  }

 /**
  * Convert an instance of AntMerchantExpandItemDeleteResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

