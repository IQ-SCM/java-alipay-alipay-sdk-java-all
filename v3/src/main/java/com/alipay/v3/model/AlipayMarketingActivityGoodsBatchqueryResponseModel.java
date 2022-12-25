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
import com.alipay.v3.model.ActivityGoodsInfo;
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
 * AlipayMarketingActivityGoodsBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityGoodsBatchqueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_GOODS_INFOS = "goods_infos";
  @SerializedName(SERIALIZED_NAME_GOODS_INFOS)
  private List<ActivityGoodsInfo> goodsInfos = null;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "total_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private Integer totalSize;

  public AlipayMarketingActivityGoodsBatchqueryResponseModel() { 
  }

  public AlipayMarketingActivityGoodsBatchqueryResponseModel activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 活动id
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016042700826004508401111111", value = "活动id")

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public AlipayMarketingActivityGoodsBatchqueryResponseModel goodsInfos(List<ActivityGoodsInfo> goodsInfos) {
    
    this.goodsInfos = goodsInfos;
    return this;
  }

  public AlipayMarketingActivityGoodsBatchqueryResponseModel addGoodsInfosItem(ActivityGoodsInfo goodsInfosItem) {
    if (this.goodsInfos == null) {
      this.goodsInfos = new ArrayList<>();
    }
    this.goodsInfos.add(goodsInfosItem);
    return this;
  }

   /**
   * 商品编码列表
   * @return goodsInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品编码列表")

  public List<ActivityGoodsInfo> getGoodsInfos() {
    return goodsInfos;
  }


  public void setGoodsInfos(List<ActivityGoodsInfo> goodsInfos) {
    this.goodsInfos = goodsInfos;
  }


  public AlipayMarketingActivityGoodsBatchqueryResponseModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 分页查询页码。
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "分页查询页码。")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayMarketingActivityGoodsBatchqueryResponseModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 分页查询单页数据条数。
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "分页查询单页数据条数。")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayMarketingActivityGoodsBatchqueryResponseModel totalSize(Integer totalSize) {
    
    this.totalSize = totalSize;
    return this;
  }

   /**
   * 商品编码总数量
   * @return totalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "商品编码总数量")

  public Integer getTotalSize() {
    return totalSize;
  }


  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingActivityGoodsBatchqueryResponseModel alipayMarketingActivityGoodsBatchqueryResponseModel = (AlipayMarketingActivityGoodsBatchqueryResponseModel) o;
    return Objects.equals(this.activityId, alipayMarketingActivityGoodsBatchqueryResponseModel.activityId) &&
        Objects.equals(this.goodsInfos, alipayMarketingActivityGoodsBatchqueryResponseModel.goodsInfos) &&
        Objects.equals(this.pageNum, alipayMarketingActivityGoodsBatchqueryResponseModel.pageNum) &&
        Objects.equals(this.pageSize, alipayMarketingActivityGoodsBatchqueryResponseModel.pageSize) &&
        Objects.equals(this.totalSize, alipayMarketingActivityGoodsBatchqueryResponseModel.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, goodsInfos, pageNum, pageSize, totalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityGoodsBatchqueryResponseModel {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    goodsInfos: ").append(toIndentedString(goodsInfos)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
    openapiFields.add("activity_id");
    openapiFields.add("goods_infos");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("total_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityGoodsBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityGoodsBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityGoodsBatchqueryResponseModel is not found in the empty JSON string", AlipayMarketingActivityGoodsBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityGoodsBatchqueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityGoodsBatchqueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("activity_id") != null && !jsonObj.get("activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_id").toString()));
      }
      JsonArray jsonArraygoodsInfos = jsonObj.getAsJsonArray("goods_infos");
      if (jsonArraygoodsInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("goods_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `goods_infos` to be an array in the JSON string but got `%s`", jsonObj.get("goods_infos").toString()));
        }

        // validate the optional field `goods_infos` (array)
        for (int i = 0; i < jsonArraygoodsInfos.size(); i++) {
          ActivityGoodsInfo.validateJsonObject(jsonArraygoodsInfos.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityGoodsBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityGoodsBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityGoodsBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityGoodsBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityGoodsBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityGoodsBatchqueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityGoodsBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityGoodsBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityGoodsBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityGoodsBatchqueryResponseModel
  */
  public static AlipayMarketingActivityGoodsBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityGoodsBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityGoodsBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

