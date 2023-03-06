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
 * SenderIstd
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SenderIstd {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ADDRESS_DETAIL = "address_detail";
  @SerializedName(SERIALIZED_NAME_ADDRESS_DETAIL)
  private String addressDetail;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COORDINATE_TYPE = "coordinate_type";
  @SerializedName(SERIALIZED_NAME_COORDINATE_TYPE)
  private Integer coordinateType;

  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private String lat;

  public static final String SERIALIZED_NAME_LNG = "lng";
  @SerializedName(SERIALIZED_NAME_LNG)
  private String lng;

  public static final String SERIALIZED_NAME_MOBILE_NO = "mobile_no";
  @SerializedName(SERIALIZED_NAME_MOBILE_NO)
  private String mobileNo;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public SenderIstd() { 
  }

  public SenderIstd address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 地址(街道、小区、大厦等，用于定位)
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "地址(街道、小区、大厦等，用于定位)")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public SenderIstd addressDetail(String addressDetail) {
    
    this.addressDetail = addressDetail;
    return this;
  }

   /**
   * 地址详情(楼号、单元号、层号)
   * @return addressDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "地址详情(楼号、单元号、层号)")

  public String getAddressDetail() {
    return addressDetail;
  }


  public void setAddressDetail(String addressDetail) {
    this.addressDetail = addressDetail;
  }


  public SenderIstd city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * 城市名称，如杭州市
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "城市名称，如杭州市")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public SenderIstd coordinateType(Integer coordinateType) {
    
    this.coordinateType = coordinateType;
    return this;
  }

   /**
   * 坐标类型，0：火星坐标（高德，腾讯地图均采用火星坐标） 1:百度坐标， 目前只支持0
   * @return coordinateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "坐标类型，0：火星坐标（高德，腾讯地图均采用火星坐标） 1:百度坐标， 目前只支持0")

  public Integer getCoordinateType() {
    return coordinateType;
  }


  public void setCoordinateType(Integer coordinateType) {
    this.coordinateType = coordinateType;
  }


  public SenderIstd lat(String lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * 纬度
   * @return lat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "纬度")

  public String getLat() {
    return lat;
  }


  public void setLat(String lat) {
    this.lat = lat;
  }


  public SenderIstd lng(String lng) {
    
    this.lng = lng;
    return this;
  }

   /**
   * 经度
   * @return lng
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "经度")

  public String getLng() {
    return lng;
  }


  public void setLng(String lng) {
    this.lng = lng;
  }


  public SenderIstd mobileNo(String mobileNo) {
    
    this.mobileNo = mobileNo;
    return this;
  }

   /**
   * 手机号
   * @return mobileNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "手机号")

  public String getMobileNo() {
    return mobileNo;
  }


  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }


  public SenderIstd name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 姓名
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "姓名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SenderIstd senderIstd = (SenderIstd) o;
    return Objects.equals(this.address, senderIstd.address) &&
        Objects.equals(this.addressDetail, senderIstd.addressDetail) &&
        Objects.equals(this.city, senderIstd.city) &&
        Objects.equals(this.coordinateType, senderIstd.coordinateType) &&
        Objects.equals(this.lat, senderIstd.lat) &&
        Objects.equals(this.lng, senderIstd.lng) &&
        Objects.equals(this.mobileNo, senderIstd.mobileNo) &&
        Objects.equals(this.name, senderIstd.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, addressDetail, city, coordinateType, lat, lng, mobileNo, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenderIstd {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressDetail: ").append(toIndentedString(addressDetail)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    coordinateType: ").append(toIndentedString(coordinateType)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("address_detail");
    openapiFields.add("city");
    openapiFields.add("coordinate_type");
    openapiFields.add("lat");
    openapiFields.add("lng");
    openapiFields.add("mobile_no");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SenderIstd
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SenderIstd.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SenderIstd is not found in the empty JSON string", SenderIstd.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SenderIstd.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SenderIstd` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("address_detail") != null && !jsonObj.get("address_detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_detail").toString()));
      }
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (jsonObj.get("lat") != null && !jsonObj.get("lat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lat").toString()));
      }
      if (jsonObj.get("lng") != null && !jsonObj.get("lng").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lng` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lng").toString()));
      }
      if (jsonObj.get("mobile_no") != null && !jsonObj.get("mobile_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile_no").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SenderIstd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SenderIstd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SenderIstd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SenderIstd.class));

       return (TypeAdapter<T>) new TypeAdapter<SenderIstd>() {
           @Override
           public void write(JsonWriter out, SenderIstd value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SenderIstd read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SenderIstd given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SenderIstd
  * @throws IOException if the JSON string is invalid with respect to SenderIstd
  */
  public static SenderIstd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SenderIstd.class);
  }

 /**
  * Convert an instance of SenderIstd to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
