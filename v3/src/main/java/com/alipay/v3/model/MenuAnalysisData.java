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
 * MenuAnalysisData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MenuAnalysisData {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AVG_CLICK_USER_CNT = "avg_click_user_cnt";
  @SerializedName(SERIALIZED_NAME_AVG_CLICK_USER_CNT)
  private String avgClickUserCnt;

  public static final String SERIALIZED_NAME_CLICK_CNT = "click_cnt";
  @SerializedName(SERIALIZED_NAME_CLICK_CNT)
  private Integer clickCnt;

  public static final String SERIALIZED_NAME_CLICK_USER_CNT = "click_user_cnt";
  @SerializedName(SERIALIZED_NAME_CLICK_USER_CNT)
  private Integer clickUserCnt;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_MENU_TYPE = "menu_type";
  @SerializedName(SERIALIZED_NAME_MENU_TYPE)
  private String menuType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUB_NAME = "sub_name";
  @SerializedName(SERIALIZED_NAME_SUB_NAME)
  private String subName;

  public MenuAnalysisData() { 
  }

  public MenuAnalysisData avgClickUserCnt(String avgClickUserCnt) {
    
    this.avgClickUserCnt = avgClickUserCnt;
    return this;
  }

   /**
   * 人均点击次数
   * @return avgClickUserCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.25", value = "人均点击次数")

  public String getAvgClickUserCnt() {
    return avgClickUserCnt;
  }


  public void setAvgClickUserCnt(String avgClickUserCnt) {
    this.avgClickUserCnt = avgClickUserCnt;
  }


  public MenuAnalysisData clickCnt(Integer clickCnt) {
    
    this.clickCnt = clickCnt;
    return this;
  }

   /**
   * 菜单点击次数
   * @return clickCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "菜单点击次数")

  public Integer getClickCnt() {
    return clickCnt;
  }


  public void setClickCnt(Integer clickCnt) {
    this.clickCnt = clickCnt;
  }


  public MenuAnalysisData clickUserCnt(Integer clickUserCnt) {
    
    this.clickUserCnt = clickUserCnt;
    return this;
  }

   /**
   * 菜单点击人数
   * @return clickUserCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "菜单点击人数")

  public Integer getClickUserCnt() {
    return clickUserCnt;
  }


  public void setClickUserCnt(Integer clickUserCnt) {
    this.clickUserCnt = clickUserCnt;
  }


  public MenuAnalysisData date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 日期
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20171101", value = "日期")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public MenuAnalysisData menuType(String menuType) {
    
    this.menuType = menuType;
    return this;
  }

   /**
   * 菜单类型 ，iconDefault ：图标菜单、default：文字菜单
   * @return menuType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "default", value = "菜单类型 ，iconDefault ：图标菜单、default：文字菜单")

  public String getMenuType() {
    return menuType;
  }


  public void setMenuType(String menuType) {
    this.menuType = menuType;
  }


  public MenuAnalysisData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 菜单名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "菜单", value = "菜单名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MenuAnalysisData subName(String subName) {
    
    this.subName = subName;
    return this;
  }

   /**
   * 子菜单名称，文字菜单才有
   * @return subName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "子菜单", value = "子菜单名称，文字菜单才有")

  public String getSubName() {
    return subName;
  }


  public void setSubName(String subName) {
    this.subName = subName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuAnalysisData menuAnalysisData = (MenuAnalysisData) o;
    return Objects.equals(this.avgClickUserCnt, menuAnalysisData.avgClickUserCnt) &&
        Objects.equals(this.clickCnt, menuAnalysisData.clickCnt) &&
        Objects.equals(this.clickUserCnt, menuAnalysisData.clickUserCnt) &&
        Objects.equals(this.date, menuAnalysisData.date) &&
        Objects.equals(this.menuType, menuAnalysisData.menuType) &&
        Objects.equals(this.name, menuAnalysisData.name) &&
        Objects.equals(this.subName, menuAnalysisData.subName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgClickUserCnt, clickCnt, clickUserCnt, date, menuType, name, subName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuAnalysisData {\n");
    sb.append("    avgClickUserCnt: ").append(toIndentedString(avgClickUserCnt)).append("\n");
    sb.append("    clickCnt: ").append(toIndentedString(clickCnt)).append("\n");
    sb.append("    clickUserCnt: ").append(toIndentedString(clickUserCnt)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    menuType: ").append(toIndentedString(menuType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subName: ").append(toIndentedString(subName)).append("\n");
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
    openapiFields.add("avg_click_user_cnt");
    openapiFields.add("click_cnt");
    openapiFields.add("click_user_cnt");
    openapiFields.add("date");
    openapiFields.add("menu_type");
    openapiFields.add("name");
    openapiFields.add("sub_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MenuAnalysisData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MenuAnalysisData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MenuAnalysisData is not found in the empty JSON string", MenuAnalysisData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MenuAnalysisData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MenuAnalysisData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("avg_click_user_cnt") != null && !jsonObj.get("avg_click_user_cnt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avg_click_user_cnt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avg_click_user_cnt").toString()));
      }
      if (jsonObj.get("date") != null && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if (jsonObj.get("menu_type") != null && !jsonObj.get("menu_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `menu_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("menu_type").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("sub_name") != null && !jsonObj.get("sub_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MenuAnalysisData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MenuAnalysisData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MenuAnalysisData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MenuAnalysisData.class));

       return (TypeAdapter<T>) new TypeAdapter<MenuAnalysisData>() {
           @Override
           public void write(JsonWriter out, MenuAnalysisData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MenuAnalysisData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MenuAnalysisData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MenuAnalysisData
  * @throws IOException if the JSON string is invalid with respect to MenuAnalysisData
  */
  public static MenuAnalysisData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MenuAnalysisData.class);
  }

 /**
  * Convert an instance of MenuAnalysisData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

