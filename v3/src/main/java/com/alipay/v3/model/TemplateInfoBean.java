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
import com.alipay.v3.model.FillContent;
import com.alipay.v3.model.SignFieldBean;
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
 * TemplateInfoBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateInfoBean {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FILL_CONTENTS = "fill_contents";
  @SerializedName(SERIALIZED_NAME_FILL_CONTENTS)
  private List<FillContent> fillContents = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SIGNFIELDS = "signfields";
  @SerializedName(SERIALIZED_NAME_SIGNFIELDS)
  private List<SignFieldBean> signfields = null;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public TemplateInfoBean() { 
  }

  public TemplateInfoBean fillContents(List<FillContent> fillContents) {
    
    this.fillContents = fillContents;
    return this;
  }

  public TemplateInfoBean addFillContentsItem(FillContent fillContentsItem) {
    if (this.fillContents == null) {
      this.fillContents = new ArrayList<>();
    }
    this.fillContents.add(fillContentsItem);
    return this;
  }

   /**
   * 模板填充项，根据组件key值传入填写内容
   * @return fillContents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "模板填充项，根据组件key值传入填写内容")

  public List<FillContent> getFillContents() {
    return fillContents;
  }


  public void setFillContents(List<FillContent> fillContents) {
    this.fillContents = fillContents;
  }


  public TemplateInfoBean name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 签署文件名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "iPhone手机签收单", value = "签署文件名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TemplateInfoBean signfields(List<SignFieldBean> signfields) {
    
    this.signfields = signfields;
    return this;
  }

  public TemplateInfoBean addSignfieldsItem(SignFieldBean signfieldsItem) {
    if (this.signfields == null) {
      this.signfields = new ArrayList<>();
    }
    this.signfields.add(signfieldsItem);
    return this;
  }

   /**
   * 签署区，根据签署区key值传入对应的签署人信息
   * @return signfields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "签署区，根据签署区key值传入对应的签署人信息")

  public List<SignFieldBean> getSignfields() {
    return signfields;
  }


  public void setSignfields(List<SignFieldBean> signfields) {
    this.signfields = signfields;
  }


  public TemplateInfoBean templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 模板id，通过创建合同模板获取
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6b95e887c4b342a8b6501bd334b286df", value = "模板id，通过创建合同模板获取")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateInfoBean templateInfoBean = (TemplateInfoBean) o;
    return Objects.equals(this.fillContents, templateInfoBean.fillContents) &&
        Objects.equals(this.name, templateInfoBean.name) &&
        Objects.equals(this.signfields, templateInfoBean.signfields) &&
        Objects.equals(this.templateId, templateInfoBean.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fillContents, name, signfields, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateInfoBean {\n");
    sb.append("    fillContents: ").append(toIndentedString(fillContents)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    signfields: ").append(toIndentedString(signfields)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("fill_contents");
    openapiFields.add("name");
    openapiFields.add("signfields");
    openapiFields.add("template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateInfoBean
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TemplateInfoBean.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateInfoBean is not found in the empty JSON string", TemplateInfoBean.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TemplateInfoBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateInfoBean` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayfillContents = jsonObj.getAsJsonArray("fill_contents");
      if (jsonArrayfillContents != null) {
        // ensure the json data is an array
        if (!jsonObj.get("fill_contents").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `fill_contents` to be an array in the JSON string but got `%s`", jsonObj.get("fill_contents").toString()));
        }

        // validate the optional field `fill_contents` (array)
        for (int i = 0; i < jsonArrayfillContents.size(); i++) {
          FillContent.validateJsonObject(jsonArrayfillContents.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      JsonArray jsonArraysignfields = jsonObj.getAsJsonArray("signfields");
      if (jsonArraysignfields != null) {
        // ensure the json data is an array
        if (!jsonObj.get("signfields").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `signfields` to be an array in the JSON string but got `%s`", jsonObj.get("signfields").toString()));
        }

        // validate the optional field `signfields` (array)
        for (int i = 0; i < jsonArraysignfields.size(); i++) {
          SignFieldBean.validateJsonObject(jsonArraysignfields.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateInfoBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateInfoBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateInfoBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateInfoBean.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateInfoBean>() {
           @Override
           public void write(JsonWriter out, TemplateInfoBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateInfoBean read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TemplateInfoBean given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateInfoBean
  * @throws IOException if the JSON string is invalid with respect to TemplateInfoBean
  */
  public static TemplateInfoBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateInfoBean.class);
  }

 /**
  * Convert an instance of TemplateInfoBean to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
