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
import com.alipay.v3.model.ZhubUidTelPair;
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
 * ZolozAuthenticationCustomerFtokenQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZolozAuthenticationCustomerFtokenQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AGE_CHECK_RESULT = "age_check_result";
  @SerializedName(SERIALIZED_NAME_AGE_CHECK_RESULT)
  private String ageCheckResult;

  public static final String SERIALIZED_NAME_AUTHIMG_BASE64 = "authimg_base_64";
  @SerializedName(SERIALIZED_NAME_AUTHIMG_BASE64)
  private String authimgBase64;

  public static final String SERIALIZED_NAME_CERT_NAME = "cert_name";
  @SerializedName(SERIALIZED_NAME_CERT_NAME)
  private String certName;

  public static final String SERIALIZED_NAME_CERT_NO = "cert_no";
  @SerializedName(SERIALIZED_NAME_CERT_NO)
  private String certNo;

  public static final String SERIALIZED_NAME_FACE_ID = "face_id";
  @SerializedName(SERIALIZED_NAME_FACE_ID)
  private String faceId;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_UID_TEL_PAIR_LIST = "uid_tel_pair_list";
  @SerializedName(SERIALIZED_NAME_UID_TEL_PAIR_LIST)
  private List<ZhubUidTelPair> uidTelPairList = null;

  public ZolozAuthenticationCustomerFtokenQueryResponseModel() { 
  }

  public ZolozAuthenticationCustomerFtokenQueryResponseModel ageCheckResult(String ageCheckResult) {
    
    this.ageCheckResult = ageCheckResult;
    return this;
  }

   /**
   * 年龄是否在指定范围内，未指定范围则返回空，true/false
   * @return ageCheckResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "年龄是否在指定范围内，未指定范围则返回空，true/false")

  public String getAgeCheckResult() {
    return ageCheckResult;
  }


  public void setAgeCheckResult(String ageCheckResult) {
    this.ageCheckResult = ageCheckResult;
  }


  public ZolozAuthenticationCustomerFtokenQueryResponseModel authimgBase64(String authimgBase64) {
    
    this.authimgBase64 = authimgBase64;
    return this;
  }

   /**
   * 图片base64 encodeString
   * @return authimgBase64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "图片base64 encodeString", value = "图片base64 encodeString")

  public String getAuthimgBase64() {
    return authimgBase64;
  }


  public void setAuthimgBase64(String authimgBase64) {
    this.authimgBase64 = authimgBase64;
  }


  public ZolozAuthenticationCustomerFtokenQueryResponseModel certName(String certName) {
    
    this.certName = certName;
    return this;
  }

   /**
   * 证件姓名
   * @return certName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "证件姓名")

  public String getCertName() {
    return certName;
  }


  public void setCertName(String certName) {
    this.certName = certName;
  }


  public ZolozAuthenticationCustomerFtokenQueryResponseModel certNo(String certNo) {
    
    this.certNo = certNo;
    return this;
  }

   /**
   * 身份证号码
   * @return certNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "身份证号码", value = "身份证号码")

  public String getCertNo() {
    return certNo;
  }


  public void setCertNo(String certNo) {
    this.certNo = certNo;
  }


  public ZolozAuthenticationCustomerFtokenQueryResponseModel faceId(String faceId) {
    
    this.faceId = faceId;
    return this;
  }

   /**
   * 由ISV定义的对自然人唯一编码，举例可以是身份证号码和姓名的MD5值，或者是其他编码方式，要求脱敏、随机且在ISV可以唯一说明一个自然人
   * @return faceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6458f8361582010447730145389650", value = "由ISV定义的对自然人唯一编码，举例可以是身份证号码和姓名的MD5值，或者是其他编码方式，要求脱敏、随机且在ISV可以唯一说明一个自然人")

  public String getFaceId() {
    return faceId;
  }


  public void setFaceId(String faceId) {
    this.faceId = faceId;
  }


  public ZolozAuthenticationCustomerFtokenQueryResponseModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 支付宝用户open_id
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝用户open_id")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public ZolozAuthenticationCustomerFtokenQueryResponseModel uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * 支付宝uid
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088002842508713", value = "支付宝uid")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public ZolozAuthenticationCustomerFtokenQueryResponseModel uidTelPairList(List<ZhubUidTelPair> uidTelPairList) {
    
    this.uidTelPairList = uidTelPairList;
    return this;
  }

  public ZolozAuthenticationCustomerFtokenQueryResponseModel addUidTelPairListItem(ZhubUidTelPair uidTelPairListItem) {
    if (this.uidTelPairList == null) {
      this.uidTelPairList = new ArrayList<>();
    }
    this.uidTelPairList.add(uidTelPairListItem);
    return this;
  }

   /**
   * 用户名信息返回的列表
   * @return uidTelPairList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户名信息返回的列表")

  public List<ZhubUidTelPair> getUidTelPairList() {
    return uidTelPairList;
  }


  public void setUidTelPairList(List<ZhubUidTelPair> uidTelPairList) {
    this.uidTelPairList = uidTelPairList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZolozAuthenticationCustomerFtokenQueryResponseModel zolozAuthenticationCustomerFtokenQueryResponseModel = (ZolozAuthenticationCustomerFtokenQueryResponseModel) o;
    return Objects.equals(this.ageCheckResult, zolozAuthenticationCustomerFtokenQueryResponseModel.ageCheckResult) &&
        Objects.equals(this.authimgBase64, zolozAuthenticationCustomerFtokenQueryResponseModel.authimgBase64) &&
        Objects.equals(this.certName, zolozAuthenticationCustomerFtokenQueryResponseModel.certName) &&
        Objects.equals(this.certNo, zolozAuthenticationCustomerFtokenQueryResponseModel.certNo) &&
        Objects.equals(this.faceId, zolozAuthenticationCustomerFtokenQueryResponseModel.faceId) &&
        Objects.equals(this.openId, zolozAuthenticationCustomerFtokenQueryResponseModel.openId) &&
        Objects.equals(this.uid, zolozAuthenticationCustomerFtokenQueryResponseModel.uid) &&
        Objects.equals(this.uidTelPairList, zolozAuthenticationCustomerFtokenQueryResponseModel.uidTelPairList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageCheckResult, authimgBase64, certName, certNo, faceId, openId, uid, uidTelPairList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZolozAuthenticationCustomerFtokenQueryResponseModel {\n");
    sb.append("    ageCheckResult: ").append(toIndentedString(ageCheckResult)).append("\n");
    sb.append("    authimgBase64: ").append(toIndentedString(authimgBase64)).append("\n");
    sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
    sb.append("    certNo: ").append(toIndentedString(certNo)).append("\n");
    sb.append("    faceId: ").append(toIndentedString(faceId)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    uidTelPairList: ").append(toIndentedString(uidTelPairList)).append("\n");
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
    openapiFields.add("age_check_result");
    openapiFields.add("authimg_base_64");
    openapiFields.add("cert_name");
    openapiFields.add("cert_no");
    openapiFields.add("face_id");
    openapiFields.add("open_id");
    openapiFields.add("uid");
    openapiFields.add("uid_tel_pair_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZolozAuthenticationCustomerFtokenQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZolozAuthenticationCustomerFtokenQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZolozAuthenticationCustomerFtokenQueryResponseModel is not found in the empty JSON string", ZolozAuthenticationCustomerFtokenQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZolozAuthenticationCustomerFtokenQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZolozAuthenticationCustomerFtokenQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("age_check_result") != null && !jsonObj.get("age_check_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `age_check_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("age_check_result").toString()));
      }
      if (jsonObj.get("authimg_base_64") != null && !jsonObj.get("authimg_base_64").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authimg_base_64` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authimg_base_64").toString()));
      }
      if (jsonObj.get("cert_name") != null && !jsonObj.get("cert_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_name").toString()));
      }
      if (jsonObj.get("cert_no") != null && !jsonObj.get("cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_no").toString()));
      }
      if (jsonObj.get("face_id") != null && !jsonObj.get("face_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `face_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("face_id").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
      JsonArray jsonArrayuidTelPairList = jsonObj.getAsJsonArray("uid_tel_pair_list");
      if (jsonArrayuidTelPairList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("uid_tel_pair_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `uid_tel_pair_list` to be an array in the JSON string but got `%s`", jsonObj.get("uid_tel_pair_list").toString()));
        }

        // validate the optional field `uid_tel_pair_list` (array)
        for (int i = 0; i < jsonArrayuidTelPairList.size(); i++) {
          ZhubUidTelPair.validateJsonObject(jsonArrayuidTelPairList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZolozAuthenticationCustomerFtokenQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZolozAuthenticationCustomerFtokenQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZolozAuthenticationCustomerFtokenQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZolozAuthenticationCustomerFtokenQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZolozAuthenticationCustomerFtokenQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, ZolozAuthenticationCustomerFtokenQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZolozAuthenticationCustomerFtokenQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZolozAuthenticationCustomerFtokenQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZolozAuthenticationCustomerFtokenQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZolozAuthenticationCustomerFtokenQueryResponseModel
  */
  public static ZolozAuthenticationCustomerFtokenQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZolozAuthenticationCustomerFtokenQueryResponseModel.class);
  }

 /**
  * Convert an instance of ZolozAuthenticationCustomerFtokenQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
