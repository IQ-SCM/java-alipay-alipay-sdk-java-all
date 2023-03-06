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
 * ZolozAuthenticationCustomerFacemanageCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZolozAuthenticationCustomerFacemanageCreateModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AREACODE = "areacode";
  @SerializedName(SERIALIZED_NAME_AREACODE)
  private String areacode;

  public static final String SERIALIZED_NAME_BIZ_TYPE = "biz_type";
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private String bizType;

  public static final String SERIALIZED_NAME_BIZSCALE = "bizscale";
  @SerializedName(SERIALIZED_NAME_BIZSCALE)
  private String bizscale;

  public static final String SERIALIZED_NAME_BRANDCODE = "brandcode";
  @SerializedName(SERIALIZED_NAME_BRANDCODE)
  private String brandcode;

  public static final String SERIALIZED_NAME_DEVICENUM = "devicenum";
  @SerializedName(SERIALIZED_NAME_DEVICENUM)
  private String devicenum;

  public static final String SERIALIZED_NAME_EXTINFO = "extinfo";
  @SerializedName(SERIALIZED_NAME_EXTINFO)
  private String extinfo;

  public static final String SERIALIZED_NAME_FACETYPE = "facetype";
  @SerializedName(SERIALIZED_NAME_FACETYPE)
  private String facetype;

  public static final String SERIALIZED_NAME_FACEVAL = "faceval";
  @SerializedName(SERIALIZED_NAME_FACEVAL)
  private String faceval;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_STORECODE = "storecode";
  @SerializedName(SERIALIZED_NAME_STORECODE)
  private String storecode;

  public static final String SERIALIZED_NAME_VALIDTIMES = "validtimes";
  @SerializedName(SERIALIZED_NAME_VALIDTIMES)
  private String validtimes;

  public ZolozAuthenticationCustomerFacemanageCreateModel() { 
  }

  public ZolozAuthenticationCustomerFacemanageCreateModel areacode(String areacode) {
    
    this.areacode = areacode;
    return this;
  }

   /**
   * 地域编码
   * @return areacode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "010", value = "地域编码")

  public String getAreacode() {
    return areacode;
  }


  public void setAreacode(String areacode) {
    this.areacode = areacode;
  }


  public ZolozAuthenticationCustomerFacemanageCreateModel bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * 人脸产品能力，预热场景，需要传college，k12，scenic，subway，traffic。具体值视具体场景
   * @return bizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "人脸产品能力，预热场景，需要传college，k12，scenic，subway，traffic。具体值视具体场景")

  public String getBizType() {
    return bizType;
  }


  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public ZolozAuthenticationCustomerFacemanageCreateModel bizscale(String bizscale) {
    
    this.bizscale = bizscale;
    return this;
  }

   /**
   * 业务量规模
   * @return bizscale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99999999活跃人数", value = "业务量规模")

  public String getBizscale() {
    return bizscale;
  }


  public void setBizscale(String bizscale) {
    this.bizscale = bizscale;
  }


  public ZolozAuthenticationCustomerFacemanageCreateModel brandcode(String brandcode) {
    
    this.brandcode = brandcode;
    return this;
  }

   /**
   * 商户品牌
   * @return brandcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "KFC", value = "商户品牌")

  public String getBrandcode() {
    return brandcode;
  }


  public void setBrandcode(String brandcode) {
    this.brandcode = brandcode;
  }


  public ZolozAuthenticationCustomerFacemanageCreateModel devicenum(String devicenum) {
    
    this.devicenum = devicenum;
    return this;
  }

   /**
   * 商户机具唯一编码，关键参数 人脸预热，传logicGroupId
   * @return devicenum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "商户机具唯一编码，关键参数 人脸预热，传logicGroupId")

  public String getDevicenum() {
    return devicenum;
  }


  public void setDevicenum(String devicenum) {
    this.devicenum = devicenum;
  }


  public ZolozAuthenticationCustomerFacemanageCreateModel extinfo(String extinfo) {
    
    this.extinfo = extinfo;
    return this;
  }

   /**
   * 拓展参数
   * @return extinfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "拓展参数")

  public String getExtinfo() {
    return extinfo;
  }


  public void setExtinfo(String extinfo) {
    this.extinfo = extinfo;
  }


  public ZolozAuthenticationCustomerFacemanageCreateModel facetype(String facetype) {
    
    this.facetype = facetype;
    return this;
  }

   /**
   * 入库类型 IDCARD:身份证 ALIPAY_USER:支付宝用户id, ALIPAY_TEL:手机号入库 CUSTOMER:自定义 DIRECT_CLIENT_PRE：本地预写入 DIRECT_CLIENT：本地客户端库 ENCLOSED：封闭场景
   * @return facetype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DIRECT_CLIENT", value = "入库类型 IDCARD:身份证 ALIPAY_USER:支付宝用户id, ALIPAY_TEL:手机号入库 CUSTOMER:自定义 DIRECT_CLIENT_PRE：本地预写入 DIRECT_CLIENT：本地客户端库 ENCLOSED：封闭场景")

  public String getFacetype() {
    return facetype;
  }


  public void setFacetype(String facetype) {
    this.facetype = facetype;
  }


  public ZolozAuthenticationCustomerFacemanageCreateModel faceval(String faceval) {
    
    this.faceval = faceval;
    return this;
  }

   /**
   * 入库用户信息 人脸预热，alipayUid必填
   * @return faceval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "示例[{\"alipayUid\":\"2088402144983195\",\"customUserId\":\"01\", \"faceContent\":\"base64String\"}]", value = "入库用户信息 人脸预热，alipayUid必填")

  public String getFaceval() {
    return faceval;
  }


  public void setFaceval(String faceval) {
    this.faceval = faceval;
  }


  public ZolozAuthenticationCustomerFacemanageCreateModel group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * 分组5
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "group0", value = "分组5")

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public ZolozAuthenticationCustomerFacemanageCreateModel storecode(String storecode) {
    
    this.storecode = storecode;
    return this;
  }

   /**
   * 门店编码
   * @return storecode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HZ1000435", value = "门店编码")

  public String getStorecode() {
    return storecode;
  }


  public void setStorecode(String storecode) {
    this.storecode = storecode;
  }


  public ZolozAuthenticationCustomerFacemanageCreateModel validtimes(String validtimes) {
    
    this.validtimes = validtimes;
    return this;
  }

   /**
   * 有效期天数，如7天、30天、365天
   * @return validtimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "有效期天数，如7天、30天、365天")

  public String getValidtimes() {
    return validtimes;
  }


  public void setValidtimes(String validtimes) {
    this.validtimes = validtimes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZolozAuthenticationCustomerFacemanageCreateModel zolozAuthenticationCustomerFacemanageCreateModel = (ZolozAuthenticationCustomerFacemanageCreateModel) o;
    return Objects.equals(this.areacode, zolozAuthenticationCustomerFacemanageCreateModel.areacode) &&
        Objects.equals(this.bizType, zolozAuthenticationCustomerFacemanageCreateModel.bizType) &&
        Objects.equals(this.bizscale, zolozAuthenticationCustomerFacemanageCreateModel.bizscale) &&
        Objects.equals(this.brandcode, zolozAuthenticationCustomerFacemanageCreateModel.brandcode) &&
        Objects.equals(this.devicenum, zolozAuthenticationCustomerFacemanageCreateModel.devicenum) &&
        Objects.equals(this.extinfo, zolozAuthenticationCustomerFacemanageCreateModel.extinfo) &&
        Objects.equals(this.facetype, zolozAuthenticationCustomerFacemanageCreateModel.facetype) &&
        Objects.equals(this.faceval, zolozAuthenticationCustomerFacemanageCreateModel.faceval) &&
        Objects.equals(this.group, zolozAuthenticationCustomerFacemanageCreateModel.group) &&
        Objects.equals(this.storecode, zolozAuthenticationCustomerFacemanageCreateModel.storecode) &&
        Objects.equals(this.validtimes, zolozAuthenticationCustomerFacemanageCreateModel.validtimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areacode, bizType, bizscale, brandcode, devicenum, extinfo, facetype, faceval, group, storecode, validtimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZolozAuthenticationCustomerFacemanageCreateModel {\n");
    sb.append("    areacode: ").append(toIndentedString(areacode)).append("\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    bizscale: ").append(toIndentedString(bizscale)).append("\n");
    sb.append("    brandcode: ").append(toIndentedString(brandcode)).append("\n");
    sb.append("    devicenum: ").append(toIndentedString(devicenum)).append("\n");
    sb.append("    extinfo: ").append(toIndentedString(extinfo)).append("\n");
    sb.append("    facetype: ").append(toIndentedString(facetype)).append("\n");
    sb.append("    faceval: ").append(toIndentedString(faceval)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    storecode: ").append(toIndentedString(storecode)).append("\n");
    sb.append("    validtimes: ").append(toIndentedString(validtimes)).append("\n");
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
    openapiFields.add("areacode");
    openapiFields.add("biz_type");
    openapiFields.add("bizscale");
    openapiFields.add("brandcode");
    openapiFields.add("devicenum");
    openapiFields.add("extinfo");
    openapiFields.add("facetype");
    openapiFields.add("faceval");
    openapiFields.add("group");
    openapiFields.add("storecode");
    openapiFields.add("validtimes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZolozAuthenticationCustomerFacemanageCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZolozAuthenticationCustomerFacemanageCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZolozAuthenticationCustomerFacemanageCreateModel is not found in the empty JSON string", ZolozAuthenticationCustomerFacemanageCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZolozAuthenticationCustomerFacemanageCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZolozAuthenticationCustomerFacemanageCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("areacode") != null && !jsonObj.get("areacode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `areacode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("areacode").toString()));
      }
      if (jsonObj.get("biz_type") != null && !jsonObj.get("biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_type").toString()));
      }
      if (jsonObj.get("bizscale") != null && !jsonObj.get("bizscale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bizscale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bizscale").toString()));
      }
      if (jsonObj.get("brandcode") != null && !jsonObj.get("brandcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandcode").toString()));
      }
      if (jsonObj.get("devicenum") != null && !jsonObj.get("devicenum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `devicenum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("devicenum").toString()));
      }
      if (jsonObj.get("extinfo") != null && !jsonObj.get("extinfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extinfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extinfo").toString()));
      }
      if (jsonObj.get("facetype") != null && !jsonObj.get("facetype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `facetype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("facetype").toString()));
      }
      if (jsonObj.get("faceval") != null && !jsonObj.get("faceval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `faceval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("faceval").toString()));
      }
      if (jsonObj.get("group") != null && !jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      if (jsonObj.get("storecode") != null && !jsonObj.get("storecode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storecode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storecode").toString()));
      }
      if (jsonObj.get("validtimes") != null && !jsonObj.get("validtimes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validtimes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validtimes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZolozAuthenticationCustomerFacemanageCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZolozAuthenticationCustomerFacemanageCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZolozAuthenticationCustomerFacemanageCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZolozAuthenticationCustomerFacemanageCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZolozAuthenticationCustomerFacemanageCreateModel>() {
           @Override
           public void write(JsonWriter out, ZolozAuthenticationCustomerFacemanageCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZolozAuthenticationCustomerFacemanageCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZolozAuthenticationCustomerFacemanageCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZolozAuthenticationCustomerFacemanageCreateModel
  * @throws IOException if the JSON string is invalid with respect to ZolozAuthenticationCustomerFacemanageCreateModel
  */
  public static ZolozAuthenticationCustomerFacemanageCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZolozAuthenticationCustomerFacemanageCreateModel.class);
  }

 /**
  * Convert an instance of ZolozAuthenticationCustomerFacemanageCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
