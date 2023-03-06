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
import com.alipay.v3.model.DeliveryTargetRegion;
import com.alipay.v3.model.SearchBoxActivityVideoInfo;
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
 * AlipayOpenSearchBoxactivityModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSearchBoxactivityModifyModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTION_URL = "action_url";
  @SerializedName(SERIALIZED_NAME_ACTION_URL)
  private String actionUrl;

  public static final String SERIALIZED_NAME_BOX_ACTIVITY_ID = "box_activity_id";
  @SerializedName(SERIALIZED_NAME_BOX_ACTIVITY_ID)
  private String boxActivityId;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private String materialId;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private String materialType;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_TARGET_APPID = "target_appid";
  @SerializedName(SERIALIZED_NAME_TARGET_APPID)
  private String targetAppid;

  public static final String SERIALIZED_NAME_TARGET_APPNAME = "target_appname";
  @SerializedName(SERIALIZED_NAME_TARGET_APPNAME)
  private String targetAppname;

  public static final String SERIALIZED_NAME_TARGET_REGIONS = "target_regions";
  @SerializedName(SERIALIZED_NAME_TARGET_REGIONS)
  private List<DeliveryTargetRegion> targetRegions = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_VIDEO_INFO = "video_info";
  @SerializedName(SERIALIZED_NAME_VIDEO_INFO)
  private SearchBoxActivityVideoInfo videoInfo;

  public AlipayOpenSearchBoxactivityModifyModel() { 
  }

  public AlipayOpenSearchBoxactivityModifyModel actionUrl(String actionUrl) {
    
    this.actionUrl = actionUrl;
    return this;
  }

   /**
   * 活动链接，必须为关联的小程序的页面链接（链接以 alipays 开头），可参考&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/support/01rb18\&quot;&gt; 小程序scheme链接介绍 &lt;/a&gt;
   * @return actionUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://platformapi/startapp?appId=2021001198637195&pages/kaq_maid/kaq_maid", value = "活动链接，必须为关联的小程序的页面链接（链接以 alipays 开头），可参考<a href=\"https://opendocs.alipay.com/support/01rb18\"> 小程序scheme链接介绍 </a>")

  public String getActionUrl() {
    return actionUrl;
  }


  public void setActionUrl(String actionUrl) {
    this.actionUrl = actionUrl;
  }


  public AlipayOpenSearchBoxactivityModifyModel boxActivityId(String boxActivityId) {
    
    this.boxActivityId = boxActivityId;
    return this;
  }

   /**
   * 搜索直达活动id
   * @return boxActivityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20220308000000168465", value = "搜索直达活动id")

  public String getBoxActivityId() {
    return boxActivityId;
  }


  public void setBoxActivityId(String boxActivityId) {
    this.boxActivityId = boxActivityId;
  }


  public AlipayOpenSearchBoxactivityModifyModel endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 活动结束时间，开始时间和结束时间之间不能超过90天
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-09-30 23:59:59", value = "活动结束时间，开始时间和结束时间之间不能超过90天")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AlipayOpenSearchBoxactivityModifyModel materialId(String materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 当material_type&#x3D;\&quot;IMAGE\&quot;时，为图片id；当material_type&#x3D;\&quot;VIDEO\&quot;时，为视频id。图片id可以通过调用接口alipay.open.file.upload上传图片，获取图片id(bizCode：search_box_banner)。规范详情可查看 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/b/03al6f\&quot;&gt; 图片规范 &lt;/a&gt;。
   * @return materialId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20211206OB020010034807196034", value = "当material_type=\"IMAGE\"时，为图片id；当material_type=\"VIDEO\"时，为视频id。图片id可以通过调用接口alipay.open.file.upload上传图片，获取图片id(bizCode：search_box_banner)。规范详情可查看 <a href=\"https://opendocs.alipay.com/b/03al6f\"> 图片规范 </a>。")

  public String getMaterialId() {
    return materialId;
  }


  public void setMaterialId(String materialId) {
    this.materialId = materialId;
  }


  public AlipayOpenSearchBoxactivityModifyModel materialType(String materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * IMAGE-图片/VIDEO-视频
   * @return materialType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IMAGE", value = "IMAGE-图片/VIDEO-视频")

  public String getMaterialType() {
    return materialType;
  }


  public void setMaterialType(String materialType) {
    this.materialType = materialType;
  }


  public AlipayOpenSearchBoxactivityModifyModel merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\&quot;运营支付宝小程序\&quot;授权。
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxxxxxxxx", value = "商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\"运营支付宝小程序\"授权。")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public AlipayOpenSearchBoxactivityModifyModel startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 活动开始时间，开始时间和结束时间之间不能超过90天
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-10 08:00:00", value = "活动开始时间，开始时间和结束时间之间不能超过90天")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public AlipayOpenSearchBoxactivityModifyModel targetAppid(String targetAppid) {
    
    this.targetAppid = targetAppid;
    return this;
  }

   /**
   * 跳转应用ID
   * @return targetAppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021001191699651", value = "跳转应用ID")

  public String getTargetAppid() {
    return targetAppid;
  }


  public void setTargetAppid(String targetAppid) {
    this.targetAppid = targetAppid;
  }


  public AlipayOpenSearchBoxactivityModifyModel targetAppname(String targetAppname) {
    
    this.targetAppname = targetAppname;
    return this;
  }

   /**
   * 跳转小程序名称
   * @return targetAppname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "跳转小程序名称", value = "跳转小程序名称")

  public String getTargetAppname() {
    return targetAppname;
  }


  public void setTargetAppname(String targetAppname) {
    this.targetAppname = targetAppname;
  }


  public AlipayOpenSearchBoxactivityModifyModel targetRegions(List<DeliveryTargetRegion> targetRegions) {
    
    this.targetRegions = targetRegions;
    return this;
  }

  public AlipayOpenSearchBoxactivityModifyModel addTargetRegionsItem(DeliveryTargetRegion targetRegionsItem) {
    if (this.targetRegions == null) {
      this.targetRegions = new ArrayList<>();
    }
    this.targetRegions.add(targetRegionsItem);
    return this;
  }

   /**
   * 投放目标区域列表
   * @return targetRegions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "投放目标区域列表")

  public List<DeliveryTargetRegion> getTargetRegions() {
    return targetRegions;
  }


  public void setTargetRegions(List<DeliveryTargetRegion> targetRegions) {
    this.targetRegions = targetRegions;
  }


  public AlipayOpenSearchBoxactivityModifyModel title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 活动标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "活动标题", value = "活动标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public AlipayOpenSearchBoxactivityModifyModel videoInfo(SearchBoxActivityVideoInfo videoInfo) {
    
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SearchBoxActivityVideoInfo getVideoInfo() {
    return videoInfo;
  }


  public void setVideoInfo(SearchBoxActivityVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSearchBoxactivityModifyModel alipayOpenSearchBoxactivityModifyModel = (AlipayOpenSearchBoxactivityModifyModel) o;
    return Objects.equals(this.actionUrl, alipayOpenSearchBoxactivityModifyModel.actionUrl) &&
        Objects.equals(this.boxActivityId, alipayOpenSearchBoxactivityModifyModel.boxActivityId) &&
        Objects.equals(this.endTime, alipayOpenSearchBoxactivityModifyModel.endTime) &&
        Objects.equals(this.materialId, alipayOpenSearchBoxactivityModifyModel.materialId) &&
        Objects.equals(this.materialType, alipayOpenSearchBoxactivityModifyModel.materialType) &&
        Objects.equals(this.merchantId, alipayOpenSearchBoxactivityModifyModel.merchantId) &&
        Objects.equals(this.startTime, alipayOpenSearchBoxactivityModifyModel.startTime) &&
        Objects.equals(this.targetAppid, alipayOpenSearchBoxactivityModifyModel.targetAppid) &&
        Objects.equals(this.targetAppname, alipayOpenSearchBoxactivityModifyModel.targetAppname) &&
        Objects.equals(this.targetRegions, alipayOpenSearchBoxactivityModifyModel.targetRegions) &&
        Objects.equals(this.title, alipayOpenSearchBoxactivityModifyModel.title) &&
        Objects.equals(this.videoInfo, alipayOpenSearchBoxactivityModifyModel.videoInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionUrl, boxActivityId, endTime, materialId, materialType, merchantId, startTime, targetAppid, targetAppname, targetRegions, title, videoInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSearchBoxactivityModifyModel {\n");
    sb.append("    actionUrl: ").append(toIndentedString(actionUrl)).append("\n");
    sb.append("    boxActivityId: ").append(toIndentedString(boxActivityId)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    targetAppid: ").append(toIndentedString(targetAppid)).append("\n");
    sb.append("    targetAppname: ").append(toIndentedString(targetAppname)).append("\n");
    sb.append("    targetRegions: ").append(toIndentedString(targetRegions)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    videoInfo: ").append(toIndentedString(videoInfo)).append("\n");
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
    openapiFields.add("action_url");
    openapiFields.add("box_activity_id");
    openapiFields.add("end_time");
    openapiFields.add("material_id");
    openapiFields.add("material_type");
    openapiFields.add("merchant_id");
    openapiFields.add("start_time");
    openapiFields.add("target_appid");
    openapiFields.add("target_appname");
    openapiFields.add("target_regions");
    openapiFields.add("title");
    openapiFields.add("video_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSearchBoxactivityModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSearchBoxactivityModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSearchBoxactivityModifyModel is not found in the empty JSON string", AlipayOpenSearchBoxactivityModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSearchBoxactivityModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSearchBoxactivityModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("action_url") != null && !jsonObj.get("action_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_url").toString()));
      }
      if (jsonObj.get("box_activity_id") != null && !jsonObj.get("box_activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_activity_id").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("material_id") != null && !jsonObj.get("material_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `material_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("material_id").toString()));
      }
      if (jsonObj.get("material_type") != null && !jsonObj.get("material_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `material_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("material_type").toString()));
      }
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("target_appid") != null && !jsonObj.get("target_appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_appid").toString()));
      }
      if (jsonObj.get("target_appname") != null && !jsonObj.get("target_appname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_appname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_appname").toString()));
      }
      JsonArray jsonArraytargetRegions = jsonObj.getAsJsonArray("target_regions");
      if (jsonArraytargetRegions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("target_regions").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `target_regions` to be an array in the JSON string but got `%s`", jsonObj.get("target_regions").toString()));
        }

        // validate the optional field `target_regions` (array)
        for (int i = 0; i < jsonArraytargetRegions.size(); i++) {
          DeliveryTargetRegion.validateJsonObject(jsonArraytargetRegions.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the optional field `video_info`
      if (jsonObj.getAsJsonObject("video_info") != null) {
        SearchBoxActivityVideoInfo.validateJsonObject(jsonObj.getAsJsonObject("video_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSearchBoxactivityModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSearchBoxactivityModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSearchBoxactivityModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSearchBoxactivityModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSearchBoxactivityModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSearchBoxactivityModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSearchBoxactivityModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSearchBoxactivityModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSearchBoxactivityModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSearchBoxactivityModifyModel
  */
  public static AlipayOpenSearchBoxactivityModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSearchBoxactivityModifyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSearchBoxactivityModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
