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
 * TemplateFieldRuleDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateFieldRuleDTO {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FIELD_NAME = "field_name";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_RULE_NAME = "rule_name";
  @SerializedName(SERIALIZED_NAME_RULE_NAME)
  private String ruleName;

  public static final String SERIALIZED_NAME_RULE_VALUE = "rule_value";
  @SerializedName(SERIALIZED_NAME_RULE_VALUE)
  private String ruleValue;

  public TemplateFieldRuleDTO() { 
  }

  public TemplateFieldRuleDTO fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * 字段名称，现在支持如下几个Key（暂不支持自定义）  Balance：金额  Point：整数  Level：任意字符串  OpenDate：开卡日期  ValidDate：过期日期
   * @return fieldName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "字段名称，现在支持如下几个Key（暂不支持自定义）  Balance：金额  Point：整数  Level：任意字符串  OpenDate：开卡日期  ValidDate：过期日期")

  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public TemplateFieldRuleDTO ruleName(String ruleName) {
    
    this.ruleName = ruleName;
    return this;
  }

   /**
   * 规则名  1、ASSIGN_FROM_REQUEST:  以rule_value为key值，表示该栏位的值从会员卡开卡接口中获取，会员卡开卡接口的card_info中获取对应参数值  2、DATE_IN_FUTURE: 生成一个未来的日期（格式YYYY-MM-DD)，当选择DATE_IN_FUTURE的时候，field_name 必须是OpenDate或ValidDate， 值为(10m或10d 分别表示10个月或10天)  3、CONST: 常量，会员卡开卡接口进行开卡的时候使用模板创建时候设置的值，即取rule_value的值
   * @return ruleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "规则名  1、ASSIGN_FROM_REQUEST:  以rule_value为key值，表示该栏位的值从会员卡开卡接口中获取，会员卡开卡接口的card_info中获取对应参数值  2、DATE_IN_FUTURE: 生成一个未来的日期（格式YYYY-MM-DD)，当选择DATE_IN_FUTURE的时候，field_name 必须是OpenDate或ValidDate， 值为(10m或10d 分别表示10个月或10天)  3、CONST: 常量，会员卡开卡接口进行开卡的时候使用模板创建时候设置的值，即取rule_value的值")

  public String getRuleName() {
    return ruleName;
  }


  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public TemplateFieldRuleDTO ruleValue(String ruleValue) {
    
    this.ruleValue = ruleValue;
    return this;
  }

   /**
   * 根据rule_name，采取相应取值策略  CONST：直接取rule_value作为卡属性值  DATE_IN_FUTURE：10m或10d 分别表示10个月或10天  ASSIGN_FROM_REQUEST：在开卡Reuqest请求中按rule_value取值，现在和field_name对应的为（OpenDate、ValidDate、Level、Point、Balance）
   * @return ruleValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "根据rule_name，采取相应取值策略  CONST：直接取rule_value作为卡属性值  DATE_IN_FUTURE：10m或10d 分别表示10个月或10天  ASSIGN_FROM_REQUEST：在开卡Reuqest请求中按rule_value取值，现在和field_name对应的为（OpenDate、ValidDate、Level、Point、Balance）")

  public String getRuleValue() {
    return ruleValue;
  }


  public void setRuleValue(String ruleValue) {
    this.ruleValue = ruleValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateFieldRuleDTO templateFieldRuleDTO = (TemplateFieldRuleDTO) o;
    return Objects.equals(this.fieldName, templateFieldRuleDTO.fieldName) &&
        Objects.equals(this.ruleName, templateFieldRuleDTO.ruleName) &&
        Objects.equals(this.ruleValue, templateFieldRuleDTO.ruleValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, ruleName, ruleValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateFieldRuleDTO {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    ruleValue: ").append(toIndentedString(ruleValue)).append("\n");
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
    openapiFields.add("field_name");
    openapiFields.add("rule_name");
    openapiFields.add("rule_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateFieldRuleDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TemplateFieldRuleDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateFieldRuleDTO is not found in the empty JSON string", TemplateFieldRuleDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TemplateFieldRuleDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateFieldRuleDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("field_name") != null && !jsonObj.get("field_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field_name").toString()));
      }
      if (jsonObj.get("rule_name") != null && !jsonObj.get("rule_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_name").toString()));
      }
      if (jsonObj.get("rule_value") != null && !jsonObj.get("rule_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateFieldRuleDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateFieldRuleDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateFieldRuleDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateFieldRuleDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateFieldRuleDTO>() {
           @Override
           public void write(JsonWriter out, TemplateFieldRuleDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateFieldRuleDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TemplateFieldRuleDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateFieldRuleDTO
  * @throws IOException if the JSON string is invalid with respect to TemplateFieldRuleDTO
  */
  public static TemplateFieldRuleDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateFieldRuleDTO.class);
  }

 /**
  * Convert an instance of TemplateFieldRuleDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
