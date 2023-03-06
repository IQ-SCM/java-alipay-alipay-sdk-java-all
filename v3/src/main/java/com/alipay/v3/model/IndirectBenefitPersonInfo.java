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
 * IndirectBenefitPersonInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IndirectBenefitPersonInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CARD_BACK_IMG = "card_back_img";
  @SerializedName(SERIALIZED_NAME_CARD_BACK_IMG)
  private String cardBackImg;

  public static final String SERIALIZED_NAME_CARD_FRONT_IMG = "card_front_img";
  @SerializedName(SERIALIZED_NAME_CARD_FRONT_IMG)
  private String cardFrontImg;

  public static final String SERIALIZED_NAME_CARD_NO = "card_no";
  @SerializedName(SERIALIZED_NAME_CARD_NO)
  private String cardNo;

  public static final String SERIALIZED_NAME_CARD_TYPE = "card_type";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private String cardType;

  public static final String SERIALIZED_NAME_EFFECT_TIME = "effect_time";
  @SerializedName(SERIALIZED_NAME_EFFECT_TIME)
  private String effectTime;

  public static final String SERIALIZED_NAME_EXPIRE_TIME = "expire_time";
  @SerializedName(SERIALIZED_NAME_EXPIRE_TIME)
  private String expireTime;

  public static final String SERIALIZED_NAME_PERSON_NAME = "person_name";
  @SerializedName(SERIALIZED_NAME_PERSON_NAME)
  private String personName;

  public IndirectBenefitPersonInfo() { 
  }

  public IndirectBenefitPersonInfo cardBackImg(String cardBackImg) {
    
    this.cardBackImg = cardBackImg;
    return this;
  }

   /**
   * 受益人证件反面照（使用图片上传接口的image_id）。当证件类型为身份证时，此字段必传；当证件类型为非身份证时，此字段非必传。
   * @return cardBackImg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a5d373f6-3e79-405f-9993-fb7ea051c372.jpg", value = "受益人证件反面照（使用图片上传接口的image_id）。当证件类型为身份证时，此字段必传；当证件类型为非身份证时，此字段非必传。")

  public String getCardBackImg() {
    return cardBackImg;
  }


  public void setCardBackImg(String cardBackImg) {
    this.cardBackImg = cardBackImg;
  }


  public IndirectBenefitPersonInfo cardFrontImg(String cardFrontImg) {
    
    this.cardFrontImg = cardFrontImg;
    return this;
  }

   /**
   * 受益人证件正面照（使用图片上传接口的image_id）
   * @return cardFrontImg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a5d373f6-3e79-405f-9993-fb7ea051c372.jpg", value = "受益人证件正面照（使用图片上传接口的image_id）")

  public String getCardFrontImg() {
    return cardFrontImg;
  }


  public void setCardFrontImg(String cardFrontImg) {
    this.cardFrontImg = cardFrontImg;
  }


  public IndirectBenefitPersonInfo cardNo(String cardNo) {
    
    this.cardNo = cardNo;
    return this;
  }

   /**
   * 证件号码
   * @return cardNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "233330199001010001", value = "证件号码")

  public String getCardNo() {
    return cardNo;
  }


  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }


  public IndirectBenefitPersonInfo cardType(String cardType) {
    
    this.cardType = cardType;
    return this;
  }

   /**
   * 证件类型，枚举值：中国大陆居民-身份证(RESIDENT)、其他国家或地区居民-护照(PASSPORT)、中国港澳居民-来往内地通行证(PASSPORT_HK_MO)、中国台湾居民-来往大陆通行证(PASSPORT_TWN)、港澳居民居住证（RESIDENCE_PERMIT_HM）、台湾居民居住证（RESIDENCE_PERMIT_TW）、外国人永久居住证（PERMANENT_RESIDENCE_FOREIGNER）。个体户/企业/事业单位/社会组织：可选择任一证件类型，政府机关、小微商户仅支持身份证类型。
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RESIDENT", value = "证件类型，枚举值：中国大陆居民-身份证(RESIDENT)、其他国家或地区居民-护照(PASSPORT)、中国港澳居民-来往内地通行证(PASSPORT_HK_MO)、中国台湾居民-来往大陆通行证(PASSPORT_TWN)、港澳居民居住证（RESIDENCE_PERMIT_HM）、台湾居民居住证（RESIDENCE_PERMIT_TW）、外国人永久居住证（PERMANENT_RESIDENCE_FOREIGNER）。个体户/企业/事业单位/社会组织：可选择任一证件类型，政府机关、小微商户仅支持身份证类型。")

  public String getCardType() {
    return cardType;
  }


  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  public IndirectBenefitPersonInfo effectTime(String effectTime) {
    
    this.effectTime = effectTime;
    return this;
  }

   /**
   * 证件生效时间
   * @return effectTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1999-01-01", value = "证件生效时间")

  public String getEffectTime() {
    return effectTime;
  }


  public void setEffectTime(String effectTime) {
    this.effectTime = effectTime;
  }


  public IndirectBenefitPersonInfo expireTime(String expireTime) {
    
    this.expireTime = expireTime;
    return this;
  }

   /**
   * 证件过期时间
   * @return expireTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000-11-01，长期有效时传“forever”", value = "证件过期时间")

  public String getExpireTime() {
    return expireTime;
  }


  public void setExpireTime(String expireTime) {
    this.expireTime = expireTime;
  }


  public IndirectBenefitPersonInfo personName(String personName) {
    
    this.personName = personName;
    return this;
  }

   /**
   * 受益人姓名
   * @return personName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "受益人姓名")

  public String getPersonName() {
    return personName;
  }


  public void setPersonName(String personName) {
    this.personName = personName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndirectBenefitPersonInfo indirectBenefitPersonInfo = (IndirectBenefitPersonInfo) o;
    return Objects.equals(this.cardBackImg, indirectBenefitPersonInfo.cardBackImg) &&
        Objects.equals(this.cardFrontImg, indirectBenefitPersonInfo.cardFrontImg) &&
        Objects.equals(this.cardNo, indirectBenefitPersonInfo.cardNo) &&
        Objects.equals(this.cardType, indirectBenefitPersonInfo.cardType) &&
        Objects.equals(this.effectTime, indirectBenefitPersonInfo.effectTime) &&
        Objects.equals(this.expireTime, indirectBenefitPersonInfo.expireTime) &&
        Objects.equals(this.personName, indirectBenefitPersonInfo.personName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardBackImg, cardFrontImg, cardNo, cardType, effectTime, expireTime, personName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndirectBenefitPersonInfo {\n");
    sb.append("    cardBackImg: ").append(toIndentedString(cardBackImg)).append("\n");
    sb.append("    cardFrontImg: ").append(toIndentedString(cardFrontImg)).append("\n");
    sb.append("    cardNo: ").append(toIndentedString(cardNo)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    effectTime: ").append(toIndentedString(effectTime)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
    sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
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
    openapiFields.add("card_back_img");
    openapiFields.add("card_front_img");
    openapiFields.add("card_no");
    openapiFields.add("card_type");
    openapiFields.add("effect_time");
    openapiFields.add("expire_time");
    openapiFields.add("person_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IndirectBenefitPersonInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IndirectBenefitPersonInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IndirectBenefitPersonInfo is not found in the empty JSON string", IndirectBenefitPersonInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IndirectBenefitPersonInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IndirectBenefitPersonInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("card_back_img") != null && !jsonObj.get("card_back_img").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_back_img` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_back_img").toString()));
      }
      if (jsonObj.get("card_front_img") != null && !jsonObj.get("card_front_img").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_front_img` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_front_img").toString()));
      }
      if (jsonObj.get("card_no") != null && !jsonObj.get("card_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_no").toString()));
      }
      if (jsonObj.get("card_type") != null && !jsonObj.get("card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_type").toString()));
      }
      if (jsonObj.get("effect_time") != null && !jsonObj.get("effect_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effect_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effect_time").toString()));
      }
      if (jsonObj.get("expire_time") != null && !jsonObj.get("expire_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expire_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expire_time").toString()));
      }
      if (jsonObj.get("person_name") != null && !jsonObj.get("person_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `person_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("person_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IndirectBenefitPersonInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IndirectBenefitPersonInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IndirectBenefitPersonInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IndirectBenefitPersonInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<IndirectBenefitPersonInfo>() {
           @Override
           public void write(JsonWriter out, IndirectBenefitPersonInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IndirectBenefitPersonInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IndirectBenefitPersonInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IndirectBenefitPersonInfo
  * @throws IOException if the JSON string is invalid with respect to IndirectBenefitPersonInfo
  */
  public static IndirectBenefitPersonInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IndirectBenefitPersonInfo.class);
  }

 /**
  * Convert an instance of IndirectBenefitPersonInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
