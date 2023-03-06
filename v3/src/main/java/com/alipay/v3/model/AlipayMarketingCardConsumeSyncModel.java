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
import com.alipay.v3.model.BenefitInfoDetail;
import com.alipay.v3.model.MerchantCard;
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
 * AlipayMarketingCardConsumeSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCardConsumeSyncModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACT_PAY_AMOUNT = "act_pay_amount";
  @SerializedName(SERIALIZED_NAME_ACT_PAY_AMOUNT)
  private String actPayAmount;

  public static final String SERIALIZED_NAME_CARD_INFO = "card_info";
  @SerializedName(SERIALIZED_NAME_CARD_INFO)
  private MerchantCard cardInfo;

  public static final String SERIALIZED_NAME_GAIN_BENEFIT_LIST = "gain_benefit_list";
  @SerializedName(SERIALIZED_NAME_GAIN_BENEFIT_LIST)
  private List<BenefitInfoDetail> gainBenefitList = null;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_SHOP_CODE = "shop_code";
  @SerializedName(SERIALIZED_NAME_SHOP_CODE)
  private String shopCode;

  public static final String SERIALIZED_NAME_SWIPE_CERT_TYPE = "swipe_cert_type";
  @SerializedName(SERIALIZED_NAME_SWIPE_CERT_TYPE)
  private String swipeCertType;

  public static final String SERIALIZED_NAME_TARGET_CARD_NO = "target_card_no";
  @SerializedName(SERIALIZED_NAME_TARGET_CARD_NO)
  private String targetCardNo;

  public static final String SERIALIZED_NAME_TARGET_CARD_NO_TYPE = "target_card_no_type";
  @SerializedName(SERIALIZED_NAME_TARGET_CARD_NO_TYPE)
  private String targetCardNoType;

  public static final String SERIALIZED_NAME_TRADE_AMOUNT = "trade_amount";
  @SerializedName(SERIALIZED_NAME_TRADE_AMOUNT)
  private String tradeAmount;

  public static final String SERIALIZED_NAME_TRADE_NAME = "trade_name";
  @SerializedName(SERIALIZED_NAME_TRADE_NAME)
  private String tradeName;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public static final String SERIALIZED_NAME_TRADE_TIME = "trade_time";
  @SerializedName(SERIALIZED_NAME_TRADE_TIME)
  private String tradeTime;

  public static final String SERIALIZED_NAME_TRADE_TYPE = "trade_type";
  @SerializedName(SERIALIZED_NAME_TRADE_TYPE)
  private String tradeType;

  public static final String SERIALIZED_NAME_USE_BENEFIT_LIST = "use_benefit_list";
  @SerializedName(SERIALIZED_NAME_USE_BENEFIT_LIST)
  private List<BenefitInfoDetail> useBenefitList = null;

  public AlipayMarketingCardConsumeSyncModel() { 
  }

  public AlipayMarketingCardConsumeSyncModel actPayAmount(String actPayAmount) {
    
    this.actPayAmount = actPayAmount;
    return this;
  }

   /**
   * 用户实际付的现金金额  1.针对预付卡面额的核销金额在use_benefit_list展现，作为权益金额  2.权益金额不叠加在该金额上
   * @return actPayAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23.9", value = "用户实际付的现金金额  1.针对预付卡面额的核销金额在use_benefit_list展现，作为权益金额  2.权益金额不叠加在该金额上")

  public String getActPayAmount() {
    return actPayAmount;
  }


  public void setActPayAmount(String actPayAmount) {
    this.actPayAmount = actPayAmount;
  }


  public AlipayMarketingCardConsumeSyncModel cardInfo(MerchantCard cardInfo) {
    
    this.cardInfo = cardInfo;
    return this;
  }

   /**
   * Get cardInfo
   * @return cardInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantCard getCardInfo() {
    return cardInfo;
  }


  public void setCardInfo(MerchantCard cardInfo) {
    this.cardInfo = cardInfo;
  }


  public AlipayMarketingCardConsumeSyncModel gainBenefitList(List<BenefitInfoDetail> gainBenefitList) {
    
    this.gainBenefitList = gainBenefitList;
    return this;
  }

  public AlipayMarketingCardConsumeSyncModel addGainBenefitListItem(BenefitInfoDetail gainBenefitListItem) {
    if (this.gainBenefitList == null) {
      this.gainBenefitList = new ArrayList<>();
    }
    this.gainBenefitList.add(gainBenefitListItem);
    return this;
  }

   /**
   * 获取权益列表
   * @return gainBenefitList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "获取权益列表")

  public List<BenefitInfoDetail> getGainBenefitList() {
    return gainBenefitList;
  }


  public void setGainBenefitList(List<BenefitInfoDetail> gainBenefitList) {
    this.gainBenefitList = gainBenefitList;
  }


  public AlipayMarketingCardConsumeSyncModel memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 备注信息，现有直接填写门店信息
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "用户门店充值100", value = "备注信息，现有直接填写门店信息")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public AlipayMarketingCardConsumeSyncModel shopCode(String shopCode) {
    
    this.shopCode = shopCode;
    return this;
  }

   /**
   * 门店编号
   * @return shopCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201606270000001", value = "门店编号")

  public String getShopCode() {
    return shopCode;
  }


  public void setShopCode(String shopCode) {
    this.shopCode = shopCode;
  }


  public AlipayMarketingCardConsumeSyncModel swipeCertType(String swipeCertType) {
    
    this.swipeCertType = swipeCertType;
    return this;
  }

   /**
   * 产生该笔交易时，用户出具的凭证类型。枚举支持： *ALIPAY：支付宝电子卡； *ENTITY：实体卡； *OTHER：其他。
   * @return swipeCertType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALIPAY", value = "产生该笔交易时，用户出具的凭证类型。枚举支持： *ALIPAY：支付宝电子卡； *ENTITY：实体卡； *OTHER：其他。")

  public String getSwipeCertType() {
    return swipeCertType;
  }


  public void setSwipeCertType(String swipeCertType) {
    this.swipeCertType = swipeCertType;
  }


  public AlipayMarketingCardConsumeSyncModel targetCardNo(String targetCardNo) {
    
    this.targetCardNo = targetCardNo;
    return this;
  }

   /**
   * 支付宝业务卡号，即通过&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/009zw3\&quot;&gt;alipay.marketing.card.open&lt;/a&gt;(会员卡开卡)接口开卡后获取的 card_info.biz_card_no 值。
   * @return targetCardNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0000001", value = "支付宝业务卡号，即通过<a href=\"https://opendocs.alipay.com/apis/009zw3\">alipay.marketing.card.open</a>(会员卡开卡)接口开卡后获取的 card_info.biz_card_no 值。")

  public String getTargetCardNo() {
    return targetCardNo;
  }


  public void setTargetCardNo(String targetCardNo) {
    this.targetCardNo = targetCardNo;
  }


  public AlipayMarketingCardConsumeSyncModel targetCardNoType(String targetCardNoType) {
    
    this.targetCardNoType = targetCardNoType;
    return this;
  }

   /**
   * 卡号ID类型。支持： *BIZ_CARD：支付宝业务卡号（商户会员卡场景使用）。
   * @return targetCardNoType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BIZ_CARD", value = "卡号ID类型。支持： *BIZ_CARD：支付宝业务卡号（商户会员卡场景使用）。")

  public String getTargetCardNoType() {
    return targetCardNoType;
  }


  public void setTargetCardNoType(String targetCardNoType) {
    this.targetCardNoType = targetCardNoType;
  }


  public AlipayMarketingCardConsumeSyncModel tradeAmount(String tradeAmount) {
    
    this.tradeAmount = tradeAmount;
    return this;
  }

   /**
   * 交易金额：本次交易的实际总金额（可认为标价金额）
   * @return tradeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "67.5", value = "交易金额：本次交易的实际总金额（可认为标价金额）")

  public String getTradeAmount() {
    return tradeAmount;
  }


  public void setTradeAmount(String tradeAmount) {
    this.tradeAmount = tradeAmount;
  }


  public AlipayMarketingCardConsumeSyncModel tradeName(String tradeName) {
    
    this.tradeName = tradeName;
    return this;
  }

   /**
   * 交易名称。为空时支付宝将根据交易类型提供默认名称。
   * @return tradeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "预付卡充值100元", value = "交易名称。为空时支付宝将根据交易类型提供默认名称。")

  public String getTradeName() {
    return tradeName;
  }


  public void setTradeName(String tradeName) {
    this.tradeName = tradeName;
  }


  public AlipayMarketingCardConsumeSyncModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201606270000000001", value = "支付宝交易号")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }


  public AlipayMarketingCardConsumeSyncModel tradeTime(String tradeTime) {
    
    this.tradeTime = tradeTime;
    return this;
  }

   /**
   * 线下交易时间，为用户付款的交易时间。 说明：当交易时间晚于上次消费记录同步时间时，将变更会员卡信息。
   * @return tradeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-11-22 10:47:20", value = "线下交易时间，为用户付款的交易时间。 说明：当交易时间晚于上次消费记录同步时间时，将变更会员卡信息。")

  public String getTradeTime() {
    return tradeTime;
  }


  public void setTradeTime(String tradeTime) {
    this.tradeTime = tradeTime;
  }


  public AlipayMarketingCardConsumeSyncModel tradeType(String tradeType) {
    
    this.tradeType = tradeType;
    return this;
  }

   /**
   * 交易类型。枚举支持： *开卡：OPEN； *消费：TRADE； *充值：DEPOSIT； *退卡：RETURN。
   * @return tradeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEPOSIT", value = "交易类型。枚举支持： *开卡：OPEN； *消费：TRADE； *充值：DEPOSIT； *退卡：RETURN。")

  public String getTradeType() {
    return tradeType;
  }


  public void setTradeType(String tradeType) {
    this.tradeType = tradeType;
  }


  public AlipayMarketingCardConsumeSyncModel useBenefitList(List<BenefitInfoDetail> useBenefitList) {
    
    this.useBenefitList = useBenefitList;
    return this;
  }

  public AlipayMarketingCardConsumeSyncModel addUseBenefitListItem(BenefitInfoDetail useBenefitListItem) {
    if (this.useBenefitList == null) {
      this.useBenefitList = new ArrayList<>();
    }
    this.useBenefitList.add(useBenefitListItem);
    return this;
  }

   /**
   * 实际消耗的权益
   * @return useBenefitList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "实际消耗的权益")

  public List<BenefitInfoDetail> getUseBenefitList() {
    return useBenefitList;
  }


  public void setUseBenefitList(List<BenefitInfoDetail> useBenefitList) {
    this.useBenefitList = useBenefitList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingCardConsumeSyncModel alipayMarketingCardConsumeSyncModel = (AlipayMarketingCardConsumeSyncModel) o;
    return Objects.equals(this.actPayAmount, alipayMarketingCardConsumeSyncModel.actPayAmount) &&
        Objects.equals(this.cardInfo, alipayMarketingCardConsumeSyncModel.cardInfo) &&
        Objects.equals(this.gainBenefitList, alipayMarketingCardConsumeSyncModel.gainBenefitList) &&
        Objects.equals(this.memo, alipayMarketingCardConsumeSyncModel.memo) &&
        Objects.equals(this.shopCode, alipayMarketingCardConsumeSyncModel.shopCode) &&
        Objects.equals(this.swipeCertType, alipayMarketingCardConsumeSyncModel.swipeCertType) &&
        Objects.equals(this.targetCardNo, alipayMarketingCardConsumeSyncModel.targetCardNo) &&
        Objects.equals(this.targetCardNoType, alipayMarketingCardConsumeSyncModel.targetCardNoType) &&
        Objects.equals(this.tradeAmount, alipayMarketingCardConsumeSyncModel.tradeAmount) &&
        Objects.equals(this.tradeName, alipayMarketingCardConsumeSyncModel.tradeName) &&
        Objects.equals(this.tradeNo, alipayMarketingCardConsumeSyncModel.tradeNo) &&
        Objects.equals(this.tradeTime, alipayMarketingCardConsumeSyncModel.tradeTime) &&
        Objects.equals(this.tradeType, alipayMarketingCardConsumeSyncModel.tradeType) &&
        Objects.equals(this.useBenefitList, alipayMarketingCardConsumeSyncModel.useBenefitList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actPayAmount, cardInfo, gainBenefitList, memo, shopCode, swipeCertType, targetCardNo, targetCardNoType, tradeAmount, tradeName, tradeNo, tradeTime, tradeType, useBenefitList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCardConsumeSyncModel {\n");
    sb.append("    actPayAmount: ").append(toIndentedString(actPayAmount)).append("\n");
    sb.append("    cardInfo: ").append(toIndentedString(cardInfo)).append("\n");
    sb.append("    gainBenefitList: ").append(toIndentedString(gainBenefitList)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    shopCode: ").append(toIndentedString(shopCode)).append("\n");
    sb.append("    swipeCertType: ").append(toIndentedString(swipeCertType)).append("\n");
    sb.append("    targetCardNo: ").append(toIndentedString(targetCardNo)).append("\n");
    sb.append("    targetCardNoType: ").append(toIndentedString(targetCardNoType)).append("\n");
    sb.append("    tradeAmount: ").append(toIndentedString(tradeAmount)).append("\n");
    sb.append("    tradeName: ").append(toIndentedString(tradeName)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
    sb.append("    tradeTime: ").append(toIndentedString(tradeTime)).append("\n");
    sb.append("    tradeType: ").append(toIndentedString(tradeType)).append("\n");
    sb.append("    useBenefitList: ").append(toIndentedString(useBenefitList)).append("\n");
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
    openapiFields.add("act_pay_amount");
    openapiFields.add("card_info");
    openapiFields.add("gain_benefit_list");
    openapiFields.add("memo");
    openapiFields.add("shop_code");
    openapiFields.add("swipe_cert_type");
    openapiFields.add("target_card_no");
    openapiFields.add("target_card_no_type");
    openapiFields.add("trade_amount");
    openapiFields.add("trade_name");
    openapiFields.add("trade_no");
    openapiFields.add("trade_time");
    openapiFields.add("trade_type");
    openapiFields.add("use_benefit_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCardConsumeSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCardConsumeSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCardConsumeSyncModel is not found in the empty JSON string", AlipayMarketingCardConsumeSyncModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingCardConsumeSyncModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingCardConsumeSyncModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("act_pay_amount") != null && !jsonObj.get("act_pay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `act_pay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("act_pay_amount").toString()));
      }
      // validate the optional field `card_info`
      if (jsonObj.getAsJsonObject("card_info") != null) {
        MerchantCard.validateJsonObject(jsonObj.getAsJsonObject("card_info"));
      }
      JsonArray jsonArraygainBenefitList = jsonObj.getAsJsonArray("gain_benefit_list");
      if (jsonArraygainBenefitList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("gain_benefit_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `gain_benefit_list` to be an array in the JSON string but got `%s`", jsonObj.get("gain_benefit_list").toString()));
        }

        // validate the optional field `gain_benefit_list` (array)
        for (int i = 0; i < jsonArraygainBenefitList.size(); i++) {
          BenefitInfoDetail.validateJsonObject(jsonArraygainBenefitList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("shop_code") != null && !jsonObj.get("shop_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_code").toString()));
      }
      if (jsonObj.get("swipe_cert_type") != null && !jsonObj.get("swipe_cert_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `swipe_cert_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("swipe_cert_type").toString()));
      }
      if (jsonObj.get("target_card_no") != null && !jsonObj.get("target_card_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_card_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_card_no").toString()));
      }
      if (jsonObj.get("target_card_no_type") != null && !jsonObj.get("target_card_no_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_card_no_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_card_no_type").toString()));
      }
      if (jsonObj.get("trade_amount") != null && !jsonObj.get("trade_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_amount").toString()));
      }
      if (jsonObj.get("trade_name") != null && !jsonObj.get("trade_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_name").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
      if (jsonObj.get("trade_time") != null && !jsonObj.get("trade_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_time").toString()));
      }
      if (jsonObj.get("trade_type") != null && !jsonObj.get("trade_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_type").toString()));
      }
      JsonArray jsonArrayuseBenefitList = jsonObj.getAsJsonArray("use_benefit_list");
      if (jsonArrayuseBenefitList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("use_benefit_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `use_benefit_list` to be an array in the JSON string but got `%s`", jsonObj.get("use_benefit_list").toString()));
        }

        // validate the optional field `use_benefit_list` (array)
        for (int i = 0; i < jsonArrayuseBenefitList.size(); i++) {
          BenefitInfoDetail.validateJsonObject(jsonArrayuseBenefitList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCardConsumeSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCardConsumeSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCardConsumeSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCardConsumeSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCardConsumeSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCardConsumeSyncModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingCardConsumeSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingCardConsumeSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCardConsumeSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCardConsumeSyncModel
  */
  public static AlipayMarketingCardConsumeSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCardConsumeSyncModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCardConsumeSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
