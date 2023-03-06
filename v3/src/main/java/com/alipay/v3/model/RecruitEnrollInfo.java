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
import com.alipay.v3.model.RecruitEnrollMerchant;
import com.alipay.v3.model.RecruitMaterial;
import com.alipay.v3.model.RecruitMiniApp;
import com.alipay.v3.model.RecruitVoucher;
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
 * RecruitEnrollInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecruitEnrollInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CITIES = "cities";
  @SerializedName(SERIALIZED_NAME_CITIES)
  private List<String> cities = null;

  public static final String SERIALIZED_NAME_ENROLL_MERCHANT = "enroll_merchant";
  @SerializedName(SERIALIZED_NAME_ENROLL_MERCHANT)
  private RecruitEnrollMerchant enrollMerchant;

  public static final String SERIALIZED_NAME_MATERIALS = "materials";
  @SerializedName(SERIALIZED_NAME_MATERIALS)
  private List<RecruitMaterial> materials = null;

  public static final String SERIALIZED_NAME_MINI_APPS = "mini_apps";
  @SerializedName(SERIALIZED_NAME_MINI_APPS)
  private List<RecruitMiniApp> miniApps = null;

  public static final String SERIALIZED_NAME_VOUCHERS = "vouchers";
  @SerializedName(SERIALIZED_NAME_VOUCHERS)
  private List<RecruitVoucher> vouchers = null;

  public RecruitEnrollInfo() { 
  }

  public RecruitEnrollInfo cities(List<String> cities) {
    
    this.cities = cities;
    return this;
  }

  public RecruitEnrollInfo addCitiesItem(String citiesItem) {
    if (this.cities == null) {
      this.cities = new ArrayList<>();
    }
    this.cities.add(citiesItem);
    return this;
  }

   /**
   * 报名提交的活动城市码，详见&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/pre-open/02r07u\&quot; target&#x3D;\&quot;_blank\&quot;&gt;活动城市码&lt;/a&gt;
   * @return cities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "报名提交的活动城市码，详见<a href=\"https://opendocs.alipay.com/pre-open/02r07u\" target=\"_blank\">活动城市码</a>")

  public List<String> getCities() {
    return cities;
  }


  public void setCities(List<String> cities) {
    this.cities = cities;
  }


  public RecruitEnrollInfo enrollMerchant(RecruitEnrollMerchant enrollMerchant) {
    
    this.enrollMerchant = enrollMerchant;
    return this;
  }

   /**
   * Get enrollMerchant
   * @return enrollMerchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecruitEnrollMerchant getEnrollMerchant() {
    return enrollMerchant;
  }


  public void setEnrollMerchant(RecruitEnrollMerchant enrollMerchant) {
    this.enrollMerchant = enrollMerchant;
  }


  public RecruitEnrollInfo materials(List<RecruitMaterial> materials) {
    
    this.materials = materials;
    return this;
  }

  public RecruitEnrollInfo addMaterialsItem(RecruitMaterial materialsItem) {
    if (this.materials == null) {
      this.materials = new ArrayList<>();
    }
    this.materials.add(materialsItem);
    return this;
  }

   /**
   * 报名提交的素材
   * @return materials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "报名提交的素材")

  public List<RecruitMaterial> getMaterials() {
    return materials;
  }


  public void setMaterials(List<RecruitMaterial> materials) {
    this.materials = materials;
  }


  public RecruitEnrollInfo miniApps(List<RecruitMiniApp> miniApps) {
    
    this.miniApps = miniApps;
    return this;
  }

  public RecruitEnrollInfo addMiniAppsItem(RecruitMiniApp miniAppsItem) {
    if (this.miniApps == null) {
      this.miniApps = new ArrayList<>();
    }
    this.miniApps.add(miniAppsItem);
    return this;
  }

   /**
   * 报名提交的小程序信息，是否必选取决于方案要求
   * @return miniApps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "报名提交的小程序信息，是否必选取决于方案要求")

  public List<RecruitMiniApp> getMiniApps() {
    return miniApps;
  }


  public void setMiniApps(List<RecruitMiniApp> miniApps) {
    this.miniApps = miniApps;
  }


  public RecruitEnrollInfo vouchers(List<RecruitVoucher> vouchers) {
    
    this.vouchers = vouchers;
    return this;
  }

  public RecruitEnrollInfo addVouchersItem(RecruitVoucher vouchersItem) {
    if (this.vouchers == null) {
      this.vouchers = new ArrayList<>();
    }
    this.vouchers.add(vouchersItem);
    return this;
  }

   /**
   * 报名提交的券信息，是否必选取决于方案要求
   * @return vouchers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "报名提交的券信息，是否必选取决于方案要求")

  public List<RecruitVoucher> getVouchers() {
    return vouchers;
  }


  public void setVouchers(List<RecruitVoucher> vouchers) {
    this.vouchers = vouchers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecruitEnrollInfo recruitEnrollInfo = (RecruitEnrollInfo) o;
    return Objects.equals(this.cities, recruitEnrollInfo.cities) &&
        Objects.equals(this.enrollMerchant, recruitEnrollInfo.enrollMerchant) &&
        Objects.equals(this.materials, recruitEnrollInfo.materials) &&
        Objects.equals(this.miniApps, recruitEnrollInfo.miniApps) &&
        Objects.equals(this.vouchers, recruitEnrollInfo.vouchers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cities, enrollMerchant, materials, miniApps, vouchers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecruitEnrollInfo {\n");
    sb.append("    cities: ").append(toIndentedString(cities)).append("\n");
    sb.append("    enrollMerchant: ").append(toIndentedString(enrollMerchant)).append("\n");
    sb.append("    materials: ").append(toIndentedString(materials)).append("\n");
    sb.append("    miniApps: ").append(toIndentedString(miniApps)).append("\n");
    sb.append("    vouchers: ").append(toIndentedString(vouchers)).append("\n");
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
    openapiFields.add("cities");
    openapiFields.add("enroll_merchant");
    openapiFields.add("materials");
    openapiFields.add("mini_apps");
    openapiFields.add("vouchers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecruitEnrollInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RecruitEnrollInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecruitEnrollInfo is not found in the empty JSON string", RecruitEnrollInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RecruitEnrollInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecruitEnrollInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("cities") != null && !jsonObj.get("cities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cities` to be an array in the JSON string but got `%s`", jsonObj.get("cities").toString()));
      }
      // validate the optional field `enroll_merchant`
      if (jsonObj.getAsJsonObject("enroll_merchant") != null) {
        RecruitEnrollMerchant.validateJsonObject(jsonObj.getAsJsonObject("enroll_merchant"));
      }
      JsonArray jsonArraymaterials = jsonObj.getAsJsonArray("materials");
      if (jsonArraymaterials != null) {
        // ensure the json data is an array
        if (!jsonObj.get("materials").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `materials` to be an array in the JSON string but got `%s`", jsonObj.get("materials").toString()));
        }

        // validate the optional field `materials` (array)
        for (int i = 0; i < jsonArraymaterials.size(); i++) {
          RecruitMaterial.validateJsonObject(jsonArraymaterials.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayminiApps = jsonObj.getAsJsonArray("mini_apps");
      if (jsonArrayminiApps != null) {
        // ensure the json data is an array
        if (!jsonObj.get("mini_apps").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `mini_apps` to be an array in the JSON string but got `%s`", jsonObj.get("mini_apps").toString()));
        }

        // validate the optional field `mini_apps` (array)
        for (int i = 0; i < jsonArrayminiApps.size(); i++) {
          RecruitMiniApp.validateJsonObject(jsonArrayminiApps.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayvouchers = jsonObj.getAsJsonArray("vouchers");
      if (jsonArrayvouchers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("vouchers").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `vouchers` to be an array in the JSON string but got `%s`", jsonObj.get("vouchers").toString()));
        }

        // validate the optional field `vouchers` (array)
        for (int i = 0; i < jsonArrayvouchers.size(); i++) {
          RecruitVoucher.validateJsonObject(jsonArrayvouchers.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecruitEnrollInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecruitEnrollInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecruitEnrollInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecruitEnrollInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<RecruitEnrollInfo>() {
           @Override
           public void write(JsonWriter out, RecruitEnrollInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecruitEnrollInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecruitEnrollInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecruitEnrollInfo
  * @throws IOException if the JSON string is invalid with respect to RecruitEnrollInfo
  */
  public static RecruitEnrollInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecruitEnrollInfo.class);
  }

 /**
  * Convert an instance of RecruitEnrollInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
