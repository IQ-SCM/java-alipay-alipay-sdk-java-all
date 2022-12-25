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
 * DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ALIVE_PHOTO = "alive_photo";
  @SerializedName(SERIALIZED_NAME_ALIVE_PHOTO)
  private String alivePhoto;

  public static final String SERIALIZED_NAME_ATTACK_FLAG = "attack_flag";
  @SerializedName(SERIALIZED_NAME_ATTACK_FLAG)
  private String attackFlag;

  public static final String SERIALIZED_NAME_CERTIFY_STATE = "certify_state";
  @SerializedName(SERIALIZED_NAME_CERTIFY_STATE)
  private String certifyState;

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private String quality;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private String score;

  public DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel() { 
  }

  public DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel alivePhoto(String alivePhoto) {
    
    this.alivePhoto = alivePhoto;
    return this;
  }

   /**
   * base64过后的图片图片
   * @return alivePhoto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "adsfsdfsdf", value = "base64过后的图片图片")

  public String getAlivePhoto() {
    return alivePhoto;
  }


  public void setAlivePhoto(String alivePhoto) {
    this.alivePhoto = alivePhoto;
  }


  public DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel attackFlag(String attackFlag) {
    
    this.attackFlag = attackFlag;
    return this;
  }

   /**
   * 是否为攻击，true：本次判定为攻击；false：非攻击。
   * @return attackFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否为攻击，true：本次判定为攻击；false：非攻击。")

  public String getAttackFlag() {
    return attackFlag;
  }


  public void setAttackFlag(String attackFlag) {
    this.attackFlag = attackFlag;
  }


  public DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel certifyState(String certifyState) {
    
    this.certifyState = certifyState;
    return this;
  }

   /**
   * 人脸检测单据状态。PROCESSING：初始化；SUCCESS：检测成功；FAIL：检测失败
   * @return certifyState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PROCESSING", value = "人脸检测单据状态。PROCESSING：初始化；SUCCESS：检测成功；FAIL：检测失败")

  public String getCertifyState() {
    return certifyState;
  }


  public void setCertifyState(String certifyState) {
    this.certifyState = certifyState;
  }


  public DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel quality(String quality) {
    
    this.quality = quality;
    return this;
  }

   /**
   * double值，人脸图片质量分
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "double值，人脸图片质量分")

  public String getQuality() {
    return quality;
  }


  public void setQuality(String quality) {
    this.quality = quality;
  }


  public DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel score(String score) {
    
    this.score = score;
    return this;
  }

   /**
   * double值，活体检测结果分数
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "double值，活体检测结果分数")

  public String getScore() {
    return score;
  }


  public void setScore(String score) {
    this.score = score;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel datadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel = (DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel) o;
    return Objects.equals(this.alivePhoto, datadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel.alivePhoto) &&
        Objects.equals(this.attackFlag, datadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel.attackFlag) &&
        Objects.equals(this.certifyState, datadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel.certifyState) &&
        Objects.equals(this.quality, datadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel.quality) &&
        Objects.equals(this.score, datadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alivePhoto, attackFlag, certifyState, quality, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel {\n");
    sb.append("    alivePhoto: ").append(toIndentedString(alivePhoto)).append("\n");
    sb.append("    attackFlag: ").append(toIndentedString(attackFlag)).append("\n");
    sb.append("    certifyState: ").append(toIndentedString(certifyState)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
    openapiFields.add("alive_photo");
    openapiFields.add("attack_flag");
    openapiFields.add("certify_state");
    openapiFields.add("quality");
    openapiFields.add("score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel is not found in the empty JSON string", DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("alive_photo") != null && !jsonObj.get("alive_photo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alive_photo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alive_photo").toString()));
      }
      if (jsonObj.get("attack_flag") != null && !jsonObj.get("attack_flag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attack_flag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attack_flag").toString()));
      }
      if (jsonObj.get("certify_state") != null && !jsonObj.get("certify_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certify_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certify_state").toString()));
      }
      if (jsonObj.get("quality") != null && !jsonObj.get("quality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quality").toString()));
      }
      if (jsonObj.get("score") != null && !jsonObj.get("score").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `score` to be a primitive type in the JSON string but got `%s`", jsonObj.get("score").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel
  */
  public static DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel.class);
  }

 /**
  * Convert an instance of DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

