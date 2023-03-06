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
import com.alipay.v3.model.ExtensionArea;
import com.alipay.v3.model.LabelRule;
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
 * AlipayOpenPublicPersonalizedExtensionCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicPersonalizedExtensionCreateModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AREAS = "areas";
  @SerializedName(SERIALIZED_NAME_AREAS)
  private List<ExtensionArea> areas = null;

  public static final String SERIALIZED_NAME_LABEL_RULE = "label_rule";
  @SerializedName(SERIALIZED_NAME_LABEL_RULE)
  private List<LabelRule> labelRule = null;

  public AlipayOpenPublicPersonalizedExtensionCreateModel() { 
  }

  public AlipayOpenPublicPersonalizedExtensionCreateModel areas(List<ExtensionArea> areas) {
    
    this.areas = areas;
    return this;
  }

  public AlipayOpenPublicPersonalizedExtensionCreateModel addAreasItem(ExtensionArea areasItem) {
    if (this.areas == null) {
      this.areas = new ArrayList<>();
    }
    this.areas.add(areasItem);
    return this;
  }

   /**
   * 扩展区列表，最大条数为3
   * @return areas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展区列表，最大条数为3")

  public List<ExtensionArea> getAreas() {
    return areas;
  }


  public void setAreas(List<ExtensionArea> areas) {
    this.areas = areas;
  }


  public AlipayOpenPublicPersonalizedExtensionCreateModel labelRule(List<LabelRule> labelRule) {
    
    this.labelRule = labelRule;
    return this;
  }

  public AlipayOpenPublicPersonalizedExtensionCreateModel addLabelRuleItem(LabelRule labelRuleItem) {
    if (this.labelRule == null) {
      this.labelRule = new ArrayList<>();
    }
    this.labelRule.add(labelRuleItem);
    return this;
  }

   /**
   * 标签规则，目前限定只能传入1条，在扩展区上线后，满足该标签规则的用户进入生活号首页，将看到该套扩展区。生成标签及打标详情参见&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/fw/api/106877\&quot;&gt;标签管理&lt;/a&gt;。
   * @return labelRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签规则，目前限定只能传入1条，在扩展区上线后，满足该标签规则的用户进入生活号首页，将看到该套扩展区。生成标签及打标详情参见<a href=\"https://opendocs.alipay.com/fw/api/106877\">标签管理</a>。")

  public List<LabelRule> getLabelRule() {
    return labelRule;
  }


  public void setLabelRule(List<LabelRule> labelRule) {
    this.labelRule = labelRule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicPersonalizedExtensionCreateModel alipayOpenPublicPersonalizedExtensionCreateModel = (AlipayOpenPublicPersonalizedExtensionCreateModel) o;
    return Objects.equals(this.areas, alipayOpenPublicPersonalizedExtensionCreateModel.areas) &&
        Objects.equals(this.labelRule, alipayOpenPublicPersonalizedExtensionCreateModel.labelRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areas, labelRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicPersonalizedExtensionCreateModel {\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    labelRule: ").append(toIndentedString(labelRule)).append("\n");
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
    openapiFields.add("areas");
    openapiFields.add("label_rule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicPersonalizedExtensionCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicPersonalizedExtensionCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicPersonalizedExtensionCreateModel is not found in the empty JSON string", AlipayOpenPublicPersonalizedExtensionCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicPersonalizedExtensionCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicPersonalizedExtensionCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayareas = jsonObj.getAsJsonArray("areas");
      if (jsonArrayareas != null) {
        // ensure the json data is an array
        if (!jsonObj.get("areas").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `areas` to be an array in the JSON string but got `%s`", jsonObj.get("areas").toString()));
        }

        // validate the optional field `areas` (array)
        for (int i = 0; i < jsonArrayareas.size(); i++) {
          ExtensionArea.validateJsonObject(jsonArrayareas.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraylabelRule = jsonObj.getAsJsonArray("label_rule");
      if (jsonArraylabelRule != null) {
        // ensure the json data is an array
        if (!jsonObj.get("label_rule").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `label_rule` to be an array in the JSON string but got `%s`", jsonObj.get("label_rule").toString()));
        }

        // validate the optional field `label_rule` (array)
        for (int i = 0; i < jsonArraylabelRule.size(); i++) {
          LabelRule.validateJsonObject(jsonArraylabelRule.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicPersonalizedExtensionCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicPersonalizedExtensionCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicPersonalizedExtensionCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicPersonalizedExtensionCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicPersonalizedExtensionCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicPersonalizedExtensionCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicPersonalizedExtensionCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicPersonalizedExtensionCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicPersonalizedExtensionCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicPersonalizedExtensionCreateModel
  */
  public static AlipayOpenPublicPersonalizedExtensionCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicPersonalizedExtensionCreateModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicPersonalizedExtensionCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
