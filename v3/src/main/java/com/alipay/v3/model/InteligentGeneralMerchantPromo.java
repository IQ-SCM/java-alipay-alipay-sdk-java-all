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
import com.alipay.v3.model.CrowdConstraintInfo;
import com.alipay.v3.model.InteligentBudgetInfo;
import com.alipay.v3.model.InteligentConstraintInfo;
import com.alipay.v3.model.InteligentPromoTool;
import com.alipay.v3.model.InteligentPublishChannel;
import com.alipay.v3.model.IntelligentPromoEffect;
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
 * InteligentGeneralMerchantPromo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteligentGeneralMerchantPromo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CAMP_ID = "camp_id";
  @SerializedName(SERIALIZED_NAME_CAMP_ID)
  private String campId;

  public static final String SERIALIZED_NAME_CROWD_CONSTRAINT = "crowd_constraint";
  @SerializedName(SERIALIZED_NAME_CROWD_CONSTRAINT)
  private CrowdConstraintInfo crowdConstraint;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_FORECAST_EFFECT = "forecast_effect";
  @SerializedName(SERIALIZED_NAME_FORECAST_EFFECT)
  private IntelligentPromoEffect forecastEffect;

  public static final String SERIALIZED_NAME_INTELIGENT_BUDGET = "inteligent_budget";
  @SerializedName(SERIALIZED_NAME_INTELIGENT_BUDGET)
  private InteligentBudgetInfo inteligentBudget;

  public static final String SERIALIZED_NAME_INTELIGENT_CONSTRAINT = "inteligent_constraint";
  @SerializedName(SERIALIZED_NAME_INTELIGENT_CONSTRAINT)
  private InteligentConstraintInfo inteligentConstraint;

  public static final String SERIALIZED_NAME_INTELIGENT_PROMO_TOOLS = "inteligent_promo_tools";
  @SerializedName(SERIALIZED_NAME_INTELIGENT_PROMO_TOOLS)
  private List<InteligentPromoTool> inteligentPromoTools = null;

  public static final String SERIALIZED_NAME_INTELIGENT_PUBLISH_CHANNELS = "inteligent_publish_channels";
  @SerializedName(SERIALIZED_NAME_INTELIGENT_PUBLISH_CHANNELS)
  private List<InteligentPublishChannel> inteligentPublishChannels = null;

  public static final String SERIALIZED_NAME_MERCHANT_PROMO_TYPE = "merchant_promo_type";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PROMO_TYPE)
  private String merchantPromoType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public InteligentGeneralMerchantPromo() { 
  }

  public InteligentGeneralMerchantPromo campId(String campId) {
    
    this.campId = campId;
    return this;
  }

   /**
   * 营销活动的id，如merchant_promo_type：CONSUME_SEND即消费送的活动id
   * @return campId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170901000000000006913911002170", value = "营销活动的id，如merchant_promo_type：CONSUME_SEND即消费送的活动id")

  public String getCampId() {
    return campId;
  }


  public void setCampId(String campId) {
    this.campId = campId;
  }


  public InteligentGeneralMerchantPromo crowdConstraint(CrowdConstraintInfo crowdConstraint) {
    
    this.crowdConstraint = crowdConstraint;
    return this;
  }

   /**
   * Get crowdConstraint
   * @return crowdConstraint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CrowdConstraintInfo getCrowdConstraint() {
    return crowdConstraint;
  }


  public void setCrowdConstraint(CrowdConstraintInfo crowdConstraint) {
    this.crowdConstraint = crowdConstraint;
  }


  public InteligentGeneralMerchantPromo desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 活动描述信息，该信息有可能会在店铺详情页漏出，请自己填写
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "本店酒水不参与该活动", value = "活动描述信息，该信息有可能会在店铺详情页漏出，请自己填写")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public InteligentGeneralMerchantPromo extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 活动扩展信息
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\\\"key\\\":\\\"value\\\"}", value = "活动扩展信息")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public InteligentGeneralMerchantPromo forecastEffect(IntelligentPromoEffect forecastEffect) {
    
    this.forecastEffect = forecastEffect;
    return this;
  }

   /**
   * Get forecastEffect
   * @return forecastEffect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IntelligentPromoEffect getForecastEffect() {
    return forecastEffect;
  }


  public void setForecastEffect(IntelligentPromoEffect forecastEffect) {
    this.forecastEffect = forecastEffect;
  }


  public InteligentGeneralMerchantPromo inteligentBudget(InteligentBudgetInfo inteligentBudget) {
    
    this.inteligentBudget = inteligentBudget;
    return this;
  }

   /**
   * Get inteligentBudget
   * @return inteligentBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InteligentBudgetInfo getInteligentBudget() {
    return inteligentBudget;
  }


  public void setInteligentBudget(InteligentBudgetInfo inteligentBudget) {
    this.inteligentBudget = inteligentBudget;
  }


  public InteligentGeneralMerchantPromo inteligentConstraint(InteligentConstraintInfo inteligentConstraint) {
    
    this.inteligentConstraint = inteligentConstraint;
    return this;
  }

   /**
   * Get inteligentConstraint
   * @return inteligentConstraint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InteligentConstraintInfo getInteligentConstraint() {
    return inteligentConstraint;
  }


  public void setInteligentConstraint(InteligentConstraintInfo inteligentConstraint) {
    this.inteligentConstraint = inteligentConstraint;
  }


  public InteligentGeneralMerchantPromo inteligentPromoTools(List<InteligentPromoTool> inteligentPromoTools) {
    
    this.inteligentPromoTools = inteligentPromoTools;
    return this;
  }

  public InteligentGeneralMerchantPromo addInteligentPromoToolsItem(InteligentPromoTool inteligentPromoToolsItem) {
    if (this.inteligentPromoTools == null) {
      this.inteligentPromoTools = new ArrayList<>();
    }
    this.inteligentPromoTools.add(inteligentPromoToolsItem);
    return this;
  }

   /**
   * 营销工具集合。主要是活动涉及到的奖品信息
   * @return inteligentPromoTools
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "营销工具集合。主要是活动涉及到的奖品信息")

  public List<InteligentPromoTool> getInteligentPromoTools() {
    return inteligentPromoTools;
  }


  public void setInteligentPromoTools(List<InteligentPromoTool> inteligentPromoTools) {
    this.inteligentPromoTools = inteligentPromoTools;
  }


  public InteligentGeneralMerchantPromo inteligentPublishChannels(List<InteligentPublishChannel> inteligentPublishChannels) {
    
    this.inteligentPublishChannels = inteligentPublishChannels;
    return this;
  }

  public InteligentGeneralMerchantPromo addInteligentPublishChannelsItem(InteligentPublishChannel inteligentPublishChannelsItem) {
    if (this.inteligentPublishChannels == null) {
      this.inteligentPublishChannels = new ArrayList<>();
    }
    this.inteligentPublishChannels.add(inteligentPublishChannelsItem);
    return this;
  }

   /**
   * 投放渠道信息
   * @return inteligentPublishChannels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "投放渠道信息")

  public List<InteligentPublishChannel> getInteligentPublishChannels() {
    return inteligentPublishChannels;
  }


  public void setInteligentPublishChannels(List<InteligentPublishChannel> inteligentPublishChannels) {
    this.inteligentPublishChannels = inteligentPublishChannels;
  }


  public InteligentGeneralMerchantPromo merchantPromoType(String merchantPromoType) {
    
    this.merchantPromoType = merchantPromoType;
    return this;
  }

   /**
   * 营销活动类型；枚举（DIRECT_SEND：直发奖；CONSUME_SEND：消费送）
   * @return merchantPromoType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CONSUME_SEND", value = "营销活动类型；枚举（DIRECT_SEND：直发奖；CONSUME_SEND：消费送）")

  public String getMerchantPromoType() {
    return merchantPromoType;
  }


  public void setMerchantPromoType(String merchantPromoType) {
    this.merchantPromoType = merchantPromoType;
  }


  public InteligentGeneralMerchantPromo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 营销活动名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "消费满100送20元代金券", value = "营销活动名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InteligentGeneralMerchantPromo templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 子营销活动对应的模板id
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170909000000000012931911002490", value = "子营销活动对应的模板id")

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
    InteligentGeneralMerchantPromo inteligentGeneralMerchantPromo = (InteligentGeneralMerchantPromo) o;
    return Objects.equals(this.campId, inteligentGeneralMerchantPromo.campId) &&
        Objects.equals(this.crowdConstraint, inteligentGeneralMerchantPromo.crowdConstraint) &&
        Objects.equals(this.desc, inteligentGeneralMerchantPromo.desc) &&
        Objects.equals(this.extInfo, inteligentGeneralMerchantPromo.extInfo) &&
        Objects.equals(this.forecastEffect, inteligentGeneralMerchantPromo.forecastEffect) &&
        Objects.equals(this.inteligentBudget, inteligentGeneralMerchantPromo.inteligentBudget) &&
        Objects.equals(this.inteligentConstraint, inteligentGeneralMerchantPromo.inteligentConstraint) &&
        Objects.equals(this.inteligentPromoTools, inteligentGeneralMerchantPromo.inteligentPromoTools) &&
        Objects.equals(this.inteligentPublishChannels, inteligentGeneralMerchantPromo.inteligentPublishChannels) &&
        Objects.equals(this.merchantPromoType, inteligentGeneralMerchantPromo.merchantPromoType) &&
        Objects.equals(this.name, inteligentGeneralMerchantPromo.name) &&
        Objects.equals(this.templateId, inteligentGeneralMerchantPromo.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campId, crowdConstraint, desc, extInfo, forecastEffect, inteligentBudget, inteligentConstraint, inteligentPromoTools, inteligentPublishChannels, merchantPromoType, name, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteligentGeneralMerchantPromo {\n");
    sb.append("    campId: ").append(toIndentedString(campId)).append("\n");
    sb.append("    crowdConstraint: ").append(toIndentedString(crowdConstraint)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    forecastEffect: ").append(toIndentedString(forecastEffect)).append("\n");
    sb.append("    inteligentBudget: ").append(toIndentedString(inteligentBudget)).append("\n");
    sb.append("    inteligentConstraint: ").append(toIndentedString(inteligentConstraint)).append("\n");
    sb.append("    inteligentPromoTools: ").append(toIndentedString(inteligentPromoTools)).append("\n");
    sb.append("    inteligentPublishChannels: ").append(toIndentedString(inteligentPublishChannels)).append("\n");
    sb.append("    merchantPromoType: ").append(toIndentedString(merchantPromoType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("camp_id");
    openapiFields.add("crowd_constraint");
    openapiFields.add("desc");
    openapiFields.add("ext_info");
    openapiFields.add("forecast_effect");
    openapiFields.add("inteligent_budget");
    openapiFields.add("inteligent_constraint");
    openapiFields.add("inteligent_promo_tools");
    openapiFields.add("inteligent_publish_channels");
    openapiFields.add("merchant_promo_type");
    openapiFields.add("name");
    openapiFields.add("template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InteligentGeneralMerchantPromo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InteligentGeneralMerchantPromo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InteligentGeneralMerchantPromo is not found in the empty JSON string", InteligentGeneralMerchantPromo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InteligentGeneralMerchantPromo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InteligentGeneralMerchantPromo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("camp_id") != null && !jsonObj.get("camp_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `camp_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("camp_id").toString()));
      }
      // validate the optional field `crowd_constraint`
      if (jsonObj.getAsJsonObject("crowd_constraint") != null) {
        CrowdConstraintInfo.validateJsonObject(jsonObj.getAsJsonObject("crowd_constraint"));
      }
      if (jsonObj.get("desc") != null && !jsonObj.get("desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desc").toString()));
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      // validate the optional field `forecast_effect`
      if (jsonObj.getAsJsonObject("forecast_effect") != null) {
        IntelligentPromoEffect.validateJsonObject(jsonObj.getAsJsonObject("forecast_effect"));
      }
      // validate the optional field `inteligent_budget`
      if (jsonObj.getAsJsonObject("inteligent_budget") != null) {
        InteligentBudgetInfo.validateJsonObject(jsonObj.getAsJsonObject("inteligent_budget"));
      }
      // validate the optional field `inteligent_constraint`
      if (jsonObj.getAsJsonObject("inteligent_constraint") != null) {
        InteligentConstraintInfo.validateJsonObject(jsonObj.getAsJsonObject("inteligent_constraint"));
      }
      JsonArray jsonArrayinteligentPromoTools = jsonObj.getAsJsonArray("inteligent_promo_tools");
      if (jsonArrayinteligentPromoTools != null) {
        // ensure the json data is an array
        if (!jsonObj.get("inteligent_promo_tools").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `inteligent_promo_tools` to be an array in the JSON string but got `%s`", jsonObj.get("inteligent_promo_tools").toString()));
        }

        // validate the optional field `inteligent_promo_tools` (array)
        for (int i = 0; i < jsonArrayinteligentPromoTools.size(); i++) {
          InteligentPromoTool.validateJsonObject(jsonArrayinteligentPromoTools.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayinteligentPublishChannels = jsonObj.getAsJsonArray("inteligent_publish_channels");
      if (jsonArrayinteligentPublishChannels != null) {
        // ensure the json data is an array
        if (!jsonObj.get("inteligent_publish_channels").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `inteligent_publish_channels` to be an array in the JSON string but got `%s`", jsonObj.get("inteligent_publish_channels").toString()));
        }

        // validate the optional field `inteligent_publish_channels` (array)
        for (int i = 0; i < jsonArrayinteligentPublishChannels.size(); i++) {
          InteligentPublishChannel.validateJsonObject(jsonArrayinteligentPublishChannels.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("merchant_promo_type") != null && !jsonObj.get("merchant_promo_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_promo_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_promo_type").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InteligentGeneralMerchantPromo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InteligentGeneralMerchantPromo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InteligentGeneralMerchantPromo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InteligentGeneralMerchantPromo.class));

       return (TypeAdapter<T>) new TypeAdapter<InteligentGeneralMerchantPromo>() {
           @Override
           public void write(JsonWriter out, InteligentGeneralMerchantPromo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InteligentGeneralMerchantPromo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InteligentGeneralMerchantPromo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InteligentGeneralMerchantPromo
  * @throws IOException if the JSON string is invalid with respect to InteligentGeneralMerchantPromo
  */
  public static InteligentGeneralMerchantPromo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InteligentGeneralMerchantPromo.class);
  }

 /**
  * Convert an instance of InteligentGeneralMerchantPromo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

