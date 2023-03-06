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
import com.alipay.v3.model.GoodsInfoDTO;
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
 * UserTradeInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserTradeInfoDTO {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GOODS_INFO_LIST = "goods_info_list";
  @SerializedName(SERIALIZED_NAME_GOODS_INFO_LIST)
  private List<GoodsInfoDTO> goodsInfoList = null;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_RISK_LEVEL = "risk_level";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private String riskLevel;

  public static final String SERIALIZED_NAME_TRADE_AMOUNT = "trade_amount";
  @SerializedName(SERIALIZED_NAME_TRADE_AMOUNT)
  private String tradeAmount;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public static final String SERIALIZED_NAME_TRADE_TIME = "trade_time";
  @SerializedName(SERIALIZED_NAME_TRADE_TIME)
  private String tradeTime;

  public static final String SERIALIZED_NAME_UNFILTERED_TOTAL_GOODS_COUNT = "unfiltered_total_goods_count";
  @SerializedName(SERIALIZED_NAME_UNFILTERED_TOTAL_GOODS_COUNT)
  private Integer unfilteredTotalGoodsCount;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public UserTradeInfoDTO() { 
  }

  public UserTradeInfoDTO goodsInfoList(List<GoodsInfoDTO> goodsInfoList) {
    
    this.goodsInfoList = goodsInfoList;
    return this;
  }

  public UserTradeInfoDTO addGoodsInfoListItem(GoodsInfoDTO goodsInfoListItem) {
    if (this.goodsInfoList == null) {
      this.goodsInfoList = new ArrayList<>();
    }
    this.goodsInfoList.add(goodsInfoListItem);
    return this;
  }

   /**
   * 商品信息列表
   * @return goodsInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品信息列表")

  public List<GoodsInfoDTO> getGoodsInfoList() {
    return goodsInfoList;
  }


  public void setGoodsInfoList(List<GoodsInfoDTO> goodsInfoList) {
    this.goodsInfoList = goodsInfoList;
  }


  public UserTradeInfoDTO partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 门店ISV的PID
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "208881123", value = "门店ISV的PID")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public UserTradeInfoDTO riskLevel(String riskLevel) {
    
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * 是否是风险交易：NO_RISK-无风险；POTENTIAL_RISK-潜在风险（中等风险）；HIGH_RISK-高风险
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NO_RISK", value = "是否是风险交易：NO_RISK-无风险；POTENTIAL_RISK-潜在风险（中等风险）；HIGH_RISK-高风险")

  public String getRiskLevel() {
    return riskLevel;
  }


  public void setRiskLevel(String riskLevel) {
    this.riskLevel = riskLevel;
  }


  public UserTradeInfoDTO tradeAmount(String tradeAmount) {
    
    this.tradeAmount = tradeAmount;
    return this;
  }

   /**
   * 交易总金额，单位元，精确两位小数点
   * @return tradeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "68.12", value = "交易总金额，单位元，精确两位小数点")

  public String getTradeAmount() {
    return tradeAmount;
  }


  public void setTradeAmount(String tradeAmount) {
    this.tradeAmount = tradeAmount;
  }


  public UserTradeInfoDTO tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 交易单号
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "202110000111", value = "交易单号")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }


  public UserTradeInfoDTO tradeTime(String tradeTime) {
    
    this.tradeTime = tradeTime;
    return this;
  }

   /**
   * 交易时间
   * @return tradeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-11 00:00:00", value = "交易时间")

  public String getTradeTime() {
    return tradeTime;
  }


  public void setTradeTime(String tradeTime) {
    this.tradeTime = tradeTime;
  }


  public UserTradeInfoDTO unfilteredTotalGoodsCount(Integer unfilteredTotalGoodsCount) {
    
    this.unfilteredTotalGoodsCount = unfilteredTotalGoodsCount;
    return this;
  }

   /**
   * 商品数据会根据活动商品列表进行过滤，该字段代表未过滤的商品列表大小
   * @return unfilteredTotalGoodsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "商品数据会根据活动商品列表进行过滤，该字段代表未过滤的商品列表大小")

  public Integer getUnfilteredTotalGoodsCount() {
    return unfilteredTotalGoodsCount;
  }


  public void setUnfilteredTotalGoodsCount(Integer unfilteredTotalGoodsCount) {
    this.unfilteredTotalGoodsCount = unfilteredTotalGoodsCount;
  }


  public UserTradeInfoDTO userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 消费者支付宝ID
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088111", value = "消费者支付宝ID")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTradeInfoDTO userTradeInfoDTO = (UserTradeInfoDTO) o;
    return Objects.equals(this.goodsInfoList, userTradeInfoDTO.goodsInfoList) &&
        Objects.equals(this.partnerId, userTradeInfoDTO.partnerId) &&
        Objects.equals(this.riskLevel, userTradeInfoDTO.riskLevel) &&
        Objects.equals(this.tradeAmount, userTradeInfoDTO.tradeAmount) &&
        Objects.equals(this.tradeNo, userTradeInfoDTO.tradeNo) &&
        Objects.equals(this.tradeTime, userTradeInfoDTO.tradeTime) &&
        Objects.equals(this.unfilteredTotalGoodsCount, userTradeInfoDTO.unfilteredTotalGoodsCount) &&
        Objects.equals(this.userId, userTradeInfoDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goodsInfoList, partnerId, riskLevel, tradeAmount, tradeNo, tradeTime, unfilteredTotalGoodsCount, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTradeInfoDTO {\n");
    sb.append("    goodsInfoList: ").append(toIndentedString(goodsInfoList)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    tradeAmount: ").append(toIndentedString(tradeAmount)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
    sb.append("    tradeTime: ").append(toIndentedString(tradeTime)).append("\n");
    sb.append("    unfilteredTotalGoodsCount: ").append(toIndentedString(unfilteredTotalGoodsCount)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("goods_info_list");
    openapiFields.add("partner_id");
    openapiFields.add("risk_level");
    openapiFields.add("trade_amount");
    openapiFields.add("trade_no");
    openapiFields.add("trade_time");
    openapiFields.add("unfiltered_total_goods_count");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserTradeInfoDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserTradeInfoDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserTradeInfoDTO is not found in the empty JSON string", UserTradeInfoDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserTradeInfoDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserTradeInfoDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraygoodsInfoList = jsonObj.getAsJsonArray("goods_info_list");
      if (jsonArraygoodsInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("goods_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `goods_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("goods_info_list").toString()));
        }

        // validate the optional field `goods_info_list` (array)
        for (int i = 0; i < jsonArraygoodsInfoList.size(); i++) {
          GoodsInfoDTO.validateJsonObject(jsonArraygoodsInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("partner_id") != null && !jsonObj.get("partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_id").toString()));
      }
      if (jsonObj.get("risk_level") != null && !jsonObj.get("risk_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `risk_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("risk_level").toString()));
      }
      if (jsonObj.get("trade_amount") != null && !jsonObj.get("trade_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_amount").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
      if (jsonObj.get("trade_time") != null && !jsonObj.get("trade_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_time").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserTradeInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserTradeInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserTradeInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserTradeInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UserTradeInfoDTO>() {
           @Override
           public void write(JsonWriter out, UserTradeInfoDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserTradeInfoDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserTradeInfoDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserTradeInfoDTO
  * @throws IOException if the JSON string is invalid with respect to UserTradeInfoDTO
  */
  public static UserTradeInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserTradeInfoDTO.class);
  }

 /**
  * Convert an instance of UserTradeInfoDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
