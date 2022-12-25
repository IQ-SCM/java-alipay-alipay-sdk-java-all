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
import com.alipay.v3.model.RecruitEnrollMerchant;
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
 * AlipayMarketingRecruitPlanlistQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingRecruitPlanlistQueryModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ENROLL_MERCHANT = "enroll_merchant";
  @SerializedName(SERIALIZED_NAME_ENROLL_MERCHANT)
  private RecruitEnrollMerchant enrollMerchant;

  public static final String SERIALIZED_NAME_ENROLL_SCENE_TYPE = "enroll_scene_type";
  @SerializedName(SERIALIZED_NAME_ENROLL_SCENE_TYPE)
  private String enrollSceneType;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public AlipayMarketingRecruitPlanlistQueryModel() { 
  }

  public AlipayMarketingRecruitPlanlistQueryModel enrollMerchant(RecruitEnrollMerchant enrollMerchant) {
    
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


  public AlipayMarketingRecruitPlanlistQueryModel enrollSceneType(String enrollSceneType) {
    
    this.enrollSceneType = enrollSceneType;
    return this;
  }

   /**
   * 活动报名场景配置。  枚举值： VOUCHER：券报名场景查询； MINI_APP：小程序报名场景查询； VOUCHER,MINI_APP：同时进行券报名场景和小程序报名场景的查询；
   * @return enrollSceneType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VOUCHER", value = "活动报名场景配置。  枚举值： VOUCHER：券报名场景查询； MINI_APP：小程序报名场景查询； VOUCHER,MINI_APP：同时进行券报名场景和小程序报名场景的查询；")

  public String getEnrollSceneType() {
    return enrollSceneType;
  }


  public void setEnrollSceneType(String enrollSceneType) {
    this.enrollSceneType = enrollSceneType;
  }


  public AlipayMarketingRecruitPlanlistQueryModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 第几页，默认1（需要在1和999之间）
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "第几页，默认1（需要在1和999之间）")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayMarketingRecruitPlanlistQueryModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页记录条数，默认20，需要在1和100之间
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "每页记录条数，默认20，需要在1和100之间")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingRecruitPlanlistQueryModel alipayMarketingRecruitPlanlistQueryModel = (AlipayMarketingRecruitPlanlistQueryModel) o;
    return Objects.equals(this.enrollMerchant, alipayMarketingRecruitPlanlistQueryModel.enrollMerchant) &&
        Objects.equals(this.enrollSceneType, alipayMarketingRecruitPlanlistQueryModel.enrollSceneType) &&
        Objects.equals(this.pageNum, alipayMarketingRecruitPlanlistQueryModel.pageNum) &&
        Objects.equals(this.pageSize, alipayMarketingRecruitPlanlistQueryModel.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrollMerchant, enrollSceneType, pageNum, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingRecruitPlanlistQueryModel {\n");
    sb.append("    enrollMerchant: ").append(toIndentedString(enrollMerchant)).append("\n");
    sb.append("    enrollSceneType: ").append(toIndentedString(enrollSceneType)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
    openapiFields.add("enroll_merchant");
    openapiFields.add("enroll_scene_type");
    openapiFields.add("page_num");
    openapiFields.add("page_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingRecruitPlanlistQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingRecruitPlanlistQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingRecruitPlanlistQueryModel is not found in the empty JSON string", AlipayMarketingRecruitPlanlistQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingRecruitPlanlistQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingRecruitPlanlistQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `enroll_merchant`
      if (jsonObj.getAsJsonObject("enroll_merchant") != null) {
        RecruitEnrollMerchant.validateJsonObject(jsonObj.getAsJsonObject("enroll_merchant"));
      }
      if (jsonObj.get("enroll_scene_type") != null && !jsonObj.get("enroll_scene_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enroll_scene_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enroll_scene_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingRecruitPlanlistQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingRecruitPlanlistQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingRecruitPlanlistQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingRecruitPlanlistQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingRecruitPlanlistQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingRecruitPlanlistQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingRecruitPlanlistQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingRecruitPlanlistQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingRecruitPlanlistQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingRecruitPlanlistQueryModel
  */
  public static AlipayMarketingRecruitPlanlistQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingRecruitPlanlistQueryModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingRecruitPlanlistQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

