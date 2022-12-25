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
 * AlipayOpenPublicInfoModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicInfoModifyModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_AUTH_PIC = "auth_pic";
  @SerializedName(SERIALIZED_NAME_AUTH_PIC)
  private String authPic;

  public static final String SERIALIZED_NAME_BACKGROUND_URL = "background_url";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_URL)
  private String backgroundUrl;

  public static final String SERIALIZED_NAME_INTRODUCTION = "introduction";
  @SerializedName(SERIALIZED_NAME_INTRODUCTION)
  private String introduction;

  public static final String SERIALIZED_NAME_LICENSE_URL = "license_url";
  @SerializedName(SERIALIZED_NAME_LICENSE_URL)
  private String licenseUrl;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_NOTIFY_URL = "notify_url";
  @SerializedName(SERIALIZED_NAME_NOTIFY_URL)
  private String notifyUrl;

  public static final String SERIALIZED_NAME_PUBLIC_GREETING = "public_greeting";
  @SerializedName(SERIALIZED_NAME_PUBLIC_GREETING)
  private String publicGreeting;

  public static final String SERIALIZED_NAME_SHOP_PICS = "shop_pics";
  @SerializedName(SERIALIZED_NAME_SHOP_PICS)
  private List<String> shopPics = null;

  public AlipayOpenPublicInfoModifyModel() { 
  }

  public AlipayOpenPublicInfoModifyModel appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 生活号名称，2-20个字之间。注意： * 不得含有违反法律法规和公序良俗的相关信息； * 不得侵害他人名誉权、知识产权、商业秘密等合法权利； * 不得以太过广泛的、或产品、行业词组来命名，如：女装、皮革批发； * 不得以实名认证的媒体资质账号创建服务窗，或媒体相关名称命名服务窗，如：XX电视台、XX杂志等。
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "生活号名称", value = "生活号名称，2-20个字之间。注意： * 不得含有违反法律法规和公序良俗的相关信息； * 不得侵害他人名誉权、知识产权、商业秘密等合法权利； * 不得以太过广泛的、或产品、行业词组来命名，如：女装、皮革批发； * 不得以实名认证的媒体资质账号创建服务窗，或媒体相关名称命名服务窗，如：XX电视台、XX杂志等。")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public AlipayOpenPublicInfoModifyModel authPic(String authPic) {
    
    this.authPic = authPic;
    return this;
  }

   /**
   * 授权运营书图片地址，企业商户若为被经营方授权，需上传加盖公章的扫描件。支持 .jpg、 .jpeg、 .png 格式，需小于1M。使用 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload\&quot;&gt;alipay.offline.material.image.upload&lt;/a&gt;(上传门店照片和视频接口)上传图片后，将得到的image_url回填与此处。
   * @return authPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://pic.alipayobjects.com/e/201311/1ZQ", value = "授权运营书图片地址，企业商户若为被经营方授权，需上传加盖公章的扫描件。支持 .jpg、 .jpeg、 .png 格式，需小于1M。使用 <a href=\"https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload\">alipay.offline.material.image.upload</a>(上传门店照片和视频接口)上传图片后，将得到的image_url回填与此处。")

  public String getAuthPic() {
    return authPic;
  }


  public void setAuthPic(String authPic) {
    this.authPic = authPic;
  }


  public AlipayOpenPublicInfoModifyModel backgroundUrl(String backgroundUrl) {
    
    this.backgroundUrl = backgroundUrl;
    return this;
  }

   /**
   * 背景图片地址，建议尺寸 1600 x 1000px，支持.jpg .jpeg .png格式，小于1M。使用 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload\&quot;&gt;alipay.offline.material.image.upload&lt;/a&gt;(上传门店照片和视频接口)上传图片后，将得到的image_url回填与此处。
   * @return backgroundUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://pic.alipayobjects.com/e/201311/1ZQ", value = "背景图片地址，建议尺寸 1600 x 1000px，支持.jpg .jpeg .png格式，小于1M。使用 <a href=\"https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload\">alipay.offline.material.image.upload</a>(上传门店照片和视频接口)上传图片后，将得到的image_url回填与此处。")

  public String getBackgroundUrl() {
    return backgroundUrl;
  }


  public void setBackgroundUrl(String backgroundUrl) {
    this.backgroundUrl = backgroundUrl;
  }


  public AlipayOpenPublicInfoModifyModel introduction(String introduction) {
    
    this.introduction = introduction;
    return this;
  }

   /**
   * 简介
   * @return introduction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "生活号简介", value = "简介")

  public String getIntroduction() {
    return introduction;
  }


  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public AlipayOpenPublicInfoModifyModel licenseUrl(String licenseUrl) {
    
    this.licenseUrl = licenseUrl;
    return this;
  }

   /**
   * 营业执照地址，建议尺寸 320*320 px，支持 .jpg、 .jpeg、 .png 格式，需小于1M。 使用 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload\&quot;&gt;alipay.offline.material.image.upload&lt;/a&gt;(上传门店照片和视频接口)上传图片后，将得到的image_url回填与此处。
   * @return licenseUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://pic.alipayobjects.com/e/201311/1ZQ", value = "营业执照地址，建议尺寸 320*320 px，支持 .jpg、 .jpeg、 .png 格式，需小于1M。 使用 <a href=\"https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload\">alipay.offline.material.image.upload</a>(上传门店照片和视频接口)上传图片后，将得到的image_url回填与此处。")

  public String getLicenseUrl() {
    return licenseUrl;
  }


  public void setLicenseUrl(String licenseUrl) {
    this.licenseUrl = licenseUrl;
  }


  public AlipayOpenPublicInfoModifyModel logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * 生活号头像地址，建议尺寸 320*320 px，支持 .jpg、 .jpeg、 .png 格式，需小于1M。 使用 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload\&quot;&gt;alipay.offline.material.image.upload&lt;/a&gt;(上传门店照片和视频接口)上传图片后，将得到的image_url回填与此处。
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://pic.alipayobjects.com/e/201311/1ZQ", value = "生活号头像地址，建议尺寸 320*320 px，支持 .jpg、 .jpeg、 .png 格式，需小于1M。 使用 <a href=\"https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload\">alipay.offline.material.image.upload</a>(上传门店照片和视频接口)上传图片后，将得到的image_url回填与此处。")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public AlipayOpenPublicInfoModifyModel notifyUrl(String notifyUrl) {
    
    this.notifyUrl = notifyUrl;
    return this;
  }

   /**
   * 通知地址
   * @return notifyUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "通知地址")

  public String getNotifyUrl() {
    return notifyUrl;
  }


  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }


  public AlipayOpenPublicInfoModifyModel publicGreeting(String publicGreeting) {
    
    this.publicGreeting = publicGreeting;
    return this;
  }

   /**
   * 欢迎语
   * @return publicGreeting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "欢迎光临", value = "欢迎语")

  public String getPublicGreeting() {
    return publicGreeting;
  }


  public void setPublicGreeting(String publicGreeting) {
    this.publicGreeting = publicGreeting;
  }


  public AlipayOpenPublicInfoModifyModel shopPics(List<String> shopPics) {
    
    this.shopPics = shopPics;
    return this;
  }

  public AlipayOpenPublicInfoModifyModel addShopPicsItem(String shopPicsItem) {
    if (this.shopPics == null) {
      this.shopPics = new ArrayList<>();
    }
    this.shopPics.add(shopPicsItem);
    return this;
  }

   /**
   * 门店照片地址，支持 .jpg、 .jpeg、 .png 格式，需小于1M。 使用 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload\&quot;&gt;alipay.offline.material.image.upload&lt;/a&gt;(上传门店照片和视频接口)上传图片后，将得到的image_url回填与此处。
   * @return shopPics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://pic.alipayobjects.com/e/201311/1ZQ", value = "门店照片地址，支持 .jpg、 .jpeg、 .png 格式，需小于1M。 使用 <a href=\"https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload\">alipay.offline.material.image.upload</a>(上传门店照片和视频接口)上传图片后，将得到的image_url回填与此处。")

  public List<String> getShopPics() {
    return shopPics;
  }


  public void setShopPics(List<String> shopPics) {
    this.shopPics = shopPics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicInfoModifyModel alipayOpenPublicInfoModifyModel = (AlipayOpenPublicInfoModifyModel) o;
    return Objects.equals(this.appName, alipayOpenPublicInfoModifyModel.appName) &&
        Objects.equals(this.authPic, alipayOpenPublicInfoModifyModel.authPic) &&
        Objects.equals(this.backgroundUrl, alipayOpenPublicInfoModifyModel.backgroundUrl) &&
        Objects.equals(this.introduction, alipayOpenPublicInfoModifyModel.introduction) &&
        Objects.equals(this.licenseUrl, alipayOpenPublicInfoModifyModel.licenseUrl) &&
        Objects.equals(this.logoUrl, alipayOpenPublicInfoModifyModel.logoUrl) &&
        Objects.equals(this.notifyUrl, alipayOpenPublicInfoModifyModel.notifyUrl) &&
        Objects.equals(this.publicGreeting, alipayOpenPublicInfoModifyModel.publicGreeting) &&
        Objects.equals(this.shopPics, alipayOpenPublicInfoModifyModel.shopPics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, authPic, backgroundUrl, introduction, licenseUrl, logoUrl, notifyUrl, publicGreeting, shopPics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicInfoModifyModel {\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    authPic: ").append(toIndentedString(authPic)).append("\n");
    sb.append("    backgroundUrl: ").append(toIndentedString(backgroundUrl)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    licenseUrl: ").append(toIndentedString(licenseUrl)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
    sb.append("    publicGreeting: ").append(toIndentedString(publicGreeting)).append("\n");
    sb.append("    shopPics: ").append(toIndentedString(shopPics)).append("\n");
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
    openapiFields.add("app_name");
    openapiFields.add("auth_pic");
    openapiFields.add("background_url");
    openapiFields.add("introduction");
    openapiFields.add("license_url");
    openapiFields.add("logo_url");
    openapiFields.add("notify_url");
    openapiFields.add("public_greeting");
    openapiFields.add("shop_pics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicInfoModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicInfoModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicInfoModifyModel is not found in the empty JSON string", AlipayOpenPublicInfoModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicInfoModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicInfoModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("auth_pic") != null && !jsonObj.get("auth_pic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_pic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_pic").toString()));
      }
      if (jsonObj.get("background_url") != null && !jsonObj.get("background_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `background_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("background_url").toString()));
      }
      if (jsonObj.get("introduction") != null && !jsonObj.get("introduction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `introduction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("introduction").toString()));
      }
      if (jsonObj.get("license_url") != null && !jsonObj.get("license_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_url").toString()));
      }
      if (jsonObj.get("logo_url") != null && !jsonObj.get("logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_url").toString()));
      }
      if (jsonObj.get("notify_url") != null && !jsonObj.get("notify_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_url").toString()));
      }
      if (jsonObj.get("public_greeting") != null && !jsonObj.get("public_greeting").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `public_greeting` to be a primitive type in the JSON string but got `%s`", jsonObj.get("public_greeting").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("shop_pics") != null && !jsonObj.get("shop_pics").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_pics` to be an array in the JSON string but got `%s`", jsonObj.get("shop_pics").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicInfoModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicInfoModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicInfoModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicInfoModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicInfoModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicInfoModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicInfoModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicInfoModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicInfoModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicInfoModifyModel
  */
  public static AlipayOpenPublicInfoModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicInfoModifyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicInfoModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

