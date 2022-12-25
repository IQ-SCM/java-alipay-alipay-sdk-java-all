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
import com.alipay.v3.model.VoucherMiniAppUseGuideInfo;
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
 * VoucherUseGuideInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherUseGuideInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MINI_APP_USE_GUIDE_INFO = "mini_app_use_guide_info";
  @SerializedName(SERIALIZED_NAME_MINI_APP_USE_GUIDE_INFO)
  private VoucherMiniAppUseGuideInfo miniAppUseGuideInfo;

  public static final String SERIALIZED_NAME_USE_GUIDE_MODE = "use_guide_mode";
  @SerializedName(SERIALIZED_NAME_USE_GUIDE_MODE)
  private List<String> useGuideMode = null;

  public VoucherUseGuideInfo() { 
  }

  public VoucherUseGuideInfo miniAppUseGuideInfo(VoucherMiniAppUseGuideInfo miniAppUseGuideInfo) {
    
    this.miniAppUseGuideInfo = miniAppUseGuideInfo;
    return this;
  }

   /**
   * Get miniAppUseGuideInfo
   * @return miniAppUseGuideInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherMiniAppUseGuideInfo getMiniAppUseGuideInfo() {
    return miniAppUseGuideInfo;
  }


  public void setMiniAppUseGuideInfo(VoucherMiniAppUseGuideInfo miniAppUseGuideInfo) {
    this.miniAppUseGuideInfo = miniAppUseGuideInfo;
  }


  public VoucherUseGuideInfo useGuideMode(List<String> useGuideMode) {
    
    this.useGuideMode = useGuideMode;
    return this;
  }

  public VoucherUseGuideInfo addUseGuideModeItem(String useGuideModeItem) {
    if (this.useGuideMode == null) {
      this.useGuideMode = new ArrayList<>();
    }
    this.useGuideMode.add(useGuideModeItem);
    return this;
  }

   /**
   * 使用引导模式
   * @return useGuideMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "使用引导模式")

  public List<String> getUseGuideMode() {
    return useGuideMode;
  }


  public void setUseGuideMode(List<String> useGuideMode) {
    this.useGuideMode = useGuideMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherUseGuideInfo voucherUseGuideInfo = (VoucherUseGuideInfo) o;
    return Objects.equals(this.miniAppUseGuideInfo, voucherUseGuideInfo.miniAppUseGuideInfo) &&
        Objects.equals(this.useGuideMode, voucherUseGuideInfo.useGuideMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(miniAppUseGuideInfo, useGuideMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherUseGuideInfo {\n");
    sb.append("    miniAppUseGuideInfo: ").append(toIndentedString(miniAppUseGuideInfo)).append("\n");
    sb.append("    useGuideMode: ").append(toIndentedString(useGuideMode)).append("\n");
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
    openapiFields.add("mini_app_use_guide_info");
    openapiFields.add("use_guide_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherUseGuideInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherUseGuideInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherUseGuideInfo is not found in the empty JSON string", VoucherUseGuideInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherUseGuideInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherUseGuideInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `mini_app_use_guide_info`
      if (jsonObj.getAsJsonObject("mini_app_use_guide_info") != null) {
        VoucherMiniAppUseGuideInfo.validateJsonObject(jsonObj.getAsJsonObject("mini_app_use_guide_info"));
      }
      // ensure the json data is an array
      if (jsonObj.get("use_guide_mode") != null && !jsonObj.get("use_guide_mode").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `use_guide_mode` to be an array in the JSON string but got `%s`", jsonObj.get("use_guide_mode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherUseGuideInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherUseGuideInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherUseGuideInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherUseGuideInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherUseGuideInfo>() {
           @Override
           public void write(JsonWriter out, VoucherUseGuideInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherUseGuideInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherUseGuideInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherUseGuideInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherUseGuideInfo
  */
  public static VoucherUseGuideInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherUseGuideInfo.class);
  }

 /**
  * Convert an instance of VoucherUseGuideInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

