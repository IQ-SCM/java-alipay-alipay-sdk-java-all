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
import com.alipay.v3.model.McardTemplateBenefit;
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
 * AlipayMarketingCardBenefitModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCardBenefitModifyModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BENEFIT_ID = "benefit_id";
  @SerializedName(SERIALIZED_NAME_BENEFIT_ID)
  private String benefitId;

  public static final String SERIALIZED_NAME_MCARD_TEMPLATE_BENEFIT = "mcard_template_benefit";
  @SerializedName(SERIALIZED_NAME_MCARD_TEMPLATE_BENEFIT)
  private McardTemplateBenefit mcardTemplateBenefit;

  public AlipayMarketingCardBenefitModifyModel() { 
  }

  public AlipayMarketingCardBenefitModifyModel benefitId(String benefitId) {
    
    this.benefitId = benefitId;
    return this;
  }

   /**
   * 权益ID，通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_5/alipay.marketing.card.benefit.create\&quot;&gt;alipay.marketing.card.benefit.create&lt;/a&gt;(会员卡模板外部权益创建)接口创建获取。
   * @return benefitId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017040600077000000002409504", value = "权益ID，通过 <a href=\"https://opendocs.alipay.com/apis/api_5/alipay.marketing.card.benefit.create\">alipay.marketing.card.benefit.create</a>(会员卡模板外部权益创建)接口创建获取。")

  public String getBenefitId() {
    return benefitId;
  }


  public void setBenefitId(String benefitId) {
    this.benefitId = benefitId;
  }


  public AlipayMarketingCardBenefitModifyModel mcardTemplateBenefit(McardTemplateBenefit mcardTemplateBenefit) {
    
    this.mcardTemplateBenefit = mcardTemplateBenefit;
    return this;
  }

   /**
   * Get mcardTemplateBenefit
   * @return mcardTemplateBenefit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public McardTemplateBenefit getMcardTemplateBenefit() {
    return mcardTemplateBenefit;
  }


  public void setMcardTemplateBenefit(McardTemplateBenefit mcardTemplateBenefit) {
    this.mcardTemplateBenefit = mcardTemplateBenefit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingCardBenefitModifyModel alipayMarketingCardBenefitModifyModel = (AlipayMarketingCardBenefitModifyModel) o;
    return Objects.equals(this.benefitId, alipayMarketingCardBenefitModifyModel.benefitId) &&
        Objects.equals(this.mcardTemplateBenefit, alipayMarketingCardBenefitModifyModel.mcardTemplateBenefit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefitId, mcardTemplateBenefit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCardBenefitModifyModel {\n");
    sb.append("    benefitId: ").append(toIndentedString(benefitId)).append("\n");
    sb.append("    mcardTemplateBenefit: ").append(toIndentedString(mcardTemplateBenefit)).append("\n");
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
    openapiFields.add("benefit_id");
    openapiFields.add("mcard_template_benefit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCardBenefitModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCardBenefitModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCardBenefitModifyModel is not found in the empty JSON string", AlipayMarketingCardBenefitModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingCardBenefitModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingCardBenefitModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("benefit_id") != null && !jsonObj.get("benefit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefit_id").toString()));
      }
      // validate the optional field `mcard_template_benefit`
      if (jsonObj.getAsJsonObject("mcard_template_benefit") != null) {
        McardTemplateBenefit.validateJsonObject(jsonObj.getAsJsonObject("mcard_template_benefit"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCardBenefitModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCardBenefitModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCardBenefitModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCardBenefitModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCardBenefitModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCardBenefitModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingCardBenefitModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingCardBenefitModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCardBenefitModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCardBenefitModifyModel
  */
  public static AlipayMarketingCardBenefitModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCardBenefitModifyModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCardBenefitModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

