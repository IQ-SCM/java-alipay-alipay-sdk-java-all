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
import com.alipay.v3.model.AccessParams;
import com.alipay.v3.model.DeviceParams;
import com.alipay.v3.model.IdentityParams;
import com.alipay.v3.model.PeriodRuleParams;
import com.alipay.v3.model.ProdParams;
import com.alipay.v3.model.SpecifiedAsset;
import com.alipay.v3.model.SpecifiedChannelParam;
import com.alipay.v3.model.SubMerchantParams;
import com.alipay.v3.model.ZmAuthParams;
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
 * AlipayUserAgreementPageSignModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayUserAgreementPageSignModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCESS_PARAMS = "access_params";
  @SerializedName(SERIALIZED_NAME_ACCESS_PARAMS)
  private AccessParams accessParams;

  public static final String SERIALIZED_NAME_AGREEMENT_EFFECT_TYPE = "agreement_effect_type";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_EFFECT_TYPE)
  private String agreementEffectType;

  public static final String SERIALIZED_NAME_ALLOW_HUAZHI_DEGRADE = "allow_huazhi_degrade";
  @SerializedName(SERIALIZED_NAME_ALLOW_HUAZHI_DEGRADE)
  private String allowHuazhiDegrade;

  public static final String SERIALIZED_NAME_DEVICE_PARAMS = "device_params";
  @SerializedName(SERIALIZED_NAME_DEVICE_PARAMS)
  private DeviceParams deviceParams;

  public static final String SERIALIZED_NAME_EFFECT_TIME = "effect_time";
  @SerializedName(SERIALIZED_NAME_EFFECT_TIME)
  private Integer effectTime;

  public static final String SERIALIZED_NAME_EXTERNAL_AGREEMENT_NO = "external_agreement_no";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_AGREEMENT_NO)
  private String externalAgreementNo;

  public static final String SERIALIZED_NAME_EXTERNAL_LOGON_ID = "external_logon_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_LOGON_ID)
  private String externalLogonId;

  public static final String SERIALIZED_NAME_IDENTITY_PARAMS = "identity_params";
  @SerializedName(SERIALIZED_NAME_IDENTITY_PARAMS)
  private IdentityParams identityParams;

  public static final String SERIALIZED_NAME_MERCHANT_PROCESS_URL = "merchant_process_url";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PROCESS_URL)
  private String merchantProcessUrl;

  public static final String SERIALIZED_NAME_NOTIFY_URL = "notify_url";
  @SerializedName(SERIALIZED_NAME_NOTIFY_URL)
  private String notifyUrl;

  public static final String SERIALIZED_NAME_PASS_PARAMS = "pass_params";
  @SerializedName(SERIALIZED_NAME_PASS_PARAMS)
  private String passParams;

  public static final String SERIALIZED_NAME_PERIOD_RULE_PARAMS = "period_rule_params";
  @SerializedName(SERIALIZED_NAME_PERIOD_RULE_PARAMS)
  private PeriodRuleParams periodRuleParams;

  public static final String SERIALIZED_NAME_PERSONAL_PRODUCT_CODE = "personal_product_code";
  @SerializedName(SERIALIZED_NAME_PERSONAL_PRODUCT_CODE)
  private String personalProductCode;

  public static final String SERIALIZED_NAME_PROD_PARAMS = "prod_params";
  @SerializedName(SERIALIZED_NAME_PROD_PARAMS)
  private ProdParams prodParams;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_PROMO_PARAMS = "promo_params";
  @SerializedName(SERIALIZED_NAME_PROMO_PARAMS)
  private String promoParams;

  public static final String SERIALIZED_NAME_RETURN_URL = "return_url";
  @SerializedName(SERIALIZED_NAME_RETURN_URL)
  private String returnUrl;

  public static final String SERIALIZED_NAME_SIGN_SCENE = "sign_scene";
  @SerializedName(SERIALIZED_NAME_SIGN_SCENE)
  private String signScene;

  public static final String SERIALIZED_NAME_SIGN_VALIDITY_PERIOD = "sign_validity_period";
  @SerializedName(SERIALIZED_NAME_SIGN_VALIDITY_PERIOD)
  private String signValidityPeriod;

  public static final String SERIALIZED_NAME_SPECIFIED_ASSET = "specified_asset";
  @SerializedName(SERIALIZED_NAME_SPECIFIED_ASSET)
  private SpecifiedAsset specifiedAsset;

  public static final String SERIALIZED_NAME_SPECIFIED_SORT_CHANNEL_PARAMS = "specified_sort_channel_params";
  @SerializedName(SERIALIZED_NAME_SPECIFIED_SORT_CHANNEL_PARAMS)
  private SpecifiedChannelParam specifiedSortChannelParams;

  public static final String SERIALIZED_NAME_SUB_MERCHANT = "sub_merchant";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT)
  private SubMerchantParams subMerchant;

  public static final String SERIALIZED_NAME_THIRD_PARTY_TYPE = "third_party_type";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_TYPE)
  private String thirdPartyType;

  public static final String SERIALIZED_NAME_USER_AGE_RANGE = "user_age_range";
  @SerializedName(SERIALIZED_NAME_USER_AGE_RANGE)
  private String userAgeRange;

  public static final String SERIALIZED_NAME_ZM_AUTH_PARAMS = "zm_auth_params";
  @SerializedName(SERIALIZED_NAME_ZM_AUTH_PARAMS)
  private ZmAuthParams zmAuthParams;

  public AlipayUserAgreementPageSignModel() { 
  }

  public AlipayUserAgreementPageSignModel accessParams(AccessParams accessParams) {
    
    this.accessParams = accessParams;
    return this;
  }

   /**
   * Get accessParams
   * @return accessParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccessParams getAccessParams() {
    return accessParams;
  }


  public void setAccessParams(AccessParams accessParams) {
    this.accessParams = accessParams;
  }


  public AlipayUserAgreementPageSignModel agreementEffectType(String agreementEffectType) {
    
    this.agreementEffectType = agreementEffectType;
    return this;
  }

   /**
   * 协议生效类型, 用于指定协议是立即生效还是等待商户通知再生效. 可空, 不填默认为立即生效.   DIRECT: 立即生效.  NOTICE: 商户通知生效, 需要再次调用alipay.user.agreement.sign.effect （支付宝个人协议签约生效接口）接口推进协议生效.   默认为DIRECT
   * @return agreementEffectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DIRECT", value = "协议生效类型, 用于指定协议是立即生效还是等待商户通知再生效. 可空, 不填默认为立即生效.   DIRECT: 立即生效.  NOTICE: 商户通知生效, 需要再次调用alipay.user.agreement.sign.effect （支付宝个人协议签约生效接口）接口推进协议生效.   默认为DIRECT")

  public String getAgreementEffectType() {
    return agreementEffectType;
  }


  public void setAgreementEffectType(String agreementEffectType) {
    this.agreementEffectType = agreementEffectType;
  }


  public AlipayUserAgreementPageSignModel allowHuazhiDegrade(String allowHuazhiDegrade) {
    
    this.allowHuazhiDegrade = allowHuazhiDegrade;
    return this;
  }

   /**
   * 是否允许花芝GO降级成原代扣（即销售方案指定的代扣产品），在花芝GO场景下才会使用该值。取值：true-允许降级，false-不允许降级。默认为true。
   * @return allowHuazhiDegrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "是否允许花芝GO降级成原代扣（即销售方案指定的代扣产品），在花芝GO场景下才会使用该值。取值：true-允许降级，false-不允许降级。默认为true。")

  public String getAllowHuazhiDegrade() {
    return allowHuazhiDegrade;
  }


  public void setAllowHuazhiDegrade(String allowHuazhiDegrade) {
    this.allowHuazhiDegrade = allowHuazhiDegrade;
  }


  public AlipayUserAgreementPageSignModel deviceParams(DeviceParams deviceParams) {
    
    this.deviceParams = deviceParams;
    return this;
  }

   /**
   * Get deviceParams
   * @return deviceParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeviceParams getDeviceParams() {
    return deviceParams;
  }


  public void setDeviceParams(DeviceParams deviceParams) {
    this.deviceParams = deviceParams;
  }


  public AlipayUserAgreementPageSignModel effectTime(Integer effectTime) {
    
    this.effectTime = effectTime;
    return this;
  }

   /**
   * 签约有效时间限制，单位是秒，有效范围是0-86400，商户传入此字段会用商户传入的值否则使用支付宝侧默认值，在有效时间外进行签约，会进行安全拦截；（备注：此字段适用于需要开通安全防控的商户，且依赖商户传入生成签约时的时间戳字段timestamp）
   * @return effectTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300", value = "签约有效时间限制，单位是秒，有效范围是0-86400，商户传入此字段会用商户传入的值否则使用支付宝侧默认值，在有效时间外进行签约，会进行安全拦截；（备注：此字段适用于需要开通安全防控的商户，且依赖商户传入生成签约时的时间戳字段timestamp）")

  public Integer getEffectTime() {
    return effectTime;
  }


  public void setEffectTime(Integer effectTime) {
    this.effectTime = effectTime;
  }


  public AlipayUserAgreementPageSignModel externalAgreementNo(String externalAgreementNo) {
    
    this.externalAgreementNo = externalAgreementNo;
    return this;
  }

   /**
   * 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值。
   * @return externalAgreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test", value = "商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值。")

  public String getExternalAgreementNo() {
    return externalAgreementNo;
  }


  public void setExternalAgreementNo(String externalAgreementNo) {
    this.externalAgreementNo = externalAgreementNo;
  }


  public AlipayUserAgreementPageSignModel externalLogonId(String externalLogonId) {
    
    this.externalLogonId = externalLogonId;
    return this;
  }

   /**
   * 用户在商户网站的登录账号，用于在签约页面展示，如果为空，则不展示
   * @return externalLogonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13852852877", value = "用户在商户网站的登录账号，用于在签约页面展示，如果为空，则不展示")

  public String getExternalLogonId() {
    return externalLogonId;
  }


  public void setExternalLogonId(String externalLogonId) {
    this.externalLogonId = externalLogonId;
  }


  public AlipayUserAgreementPageSignModel identityParams(IdentityParams identityParams) {
    
    this.identityParams = identityParams;
    return this;
  }

   /**
   * Get identityParams
   * @return identityParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityParams getIdentityParams() {
    return identityParams;
  }


  public void setIdentityParams(IdentityParams identityParams) {
    this.identityParams = identityParams;
  }


  public AlipayUserAgreementPageSignModel merchantProcessUrl(String merchantProcessUrl) {
    
    this.merchantProcessUrl = merchantProcessUrl;
    return this;
  }

   /**
   * 参数名：跳转商户处理url  应用场景：商户需要在签约流程中跳转到商户自己的页面做处理的场景，如获得用户授权获取实名信息等  如何获取：商户自己提供的页面地址  特殊说明：商户如果传递此参数，则会在签约流程中跳转所传递的地址，不传则不会跳转
   * @return merchantProcessUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.merchantpage.com/index?processId=2345678", value = "参数名：跳转商户处理url  应用场景：商户需要在签约流程中跳转到商户自己的页面做处理的场景，如获得用户授权获取实名信息等  如何获取：商户自己提供的页面地址  特殊说明：商户如果传递此参数，则会在签约流程中跳转所传递的地址，不传则不会跳转")

  public String getMerchantProcessUrl() {
    return merchantProcessUrl;
  }


  public void setMerchantProcessUrl(String merchantProcessUrl) {
    this.merchantProcessUrl = merchantProcessUrl;
  }


  public AlipayUserAgreementPageSignModel notifyUrl(String notifyUrl) {
    
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


  public AlipayUserAgreementPageSignModel passParams(String passParams) {
    
    this.passParams = passParams;
    return this;
  }

   /**
   * 业务透传参数
   * @return passParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key\":\"value\"}，具体值需要接入时确认", value = "业务透传参数")

  public String getPassParams() {
    return passParams;
  }


  public void setPassParams(String passParams) {
    this.passParams = passParams;
  }


  public AlipayUserAgreementPageSignModel periodRuleParams(PeriodRuleParams periodRuleParams) {
    
    this.periodRuleParams = periodRuleParams;
    return this;
  }

   /**
   * Get periodRuleParams
   * @return periodRuleParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PeriodRuleParams getPeriodRuleParams() {
    return periodRuleParams;
  }


  public void setPeriodRuleParams(PeriodRuleParams periodRuleParams) {
    this.periodRuleParams = periodRuleParams;
  }


  public AlipayUserAgreementPageSignModel personalProductCode(String personalProductCode) {
    
    this.personalProductCode = personalProductCode;
    return this;
  }

   /**
   * 个人签约产品码，商户和支付宝签约时确定，商户可咨询技术支持。
   * @return personalProductCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GENERAL_WITHHOLDING_P", value = "个人签约产品码，商户和支付宝签约时确定，商户可咨询技术支持。")

  public String getPersonalProductCode() {
    return personalProductCode;
  }


  public void setPersonalProductCode(String personalProductCode) {
    this.personalProductCode = personalProductCode;
  }


  public AlipayUserAgreementPageSignModel prodParams(ProdParams prodParams) {
    
    this.prodParams = prodParams;
    return this;
  }

   /**
   * Get prodParams
   * @return prodParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProdParams getProdParams() {
    return prodParams;
  }


  public void setProdParams(ProdParams prodParams) {
    this.prodParams = prodParams;
  }


  public AlipayUserAgreementPageSignModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 销售产品码，商户签约的支付宝合同所对应的产品码。
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GENERAL_WITHHOLDING", value = "销售产品码，商户签约的支付宝合同所对应的产品码。")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public AlipayUserAgreementPageSignModel promoParams(String promoParams) {
    
    this.promoParams = promoParams;
    return this;
  }

   /**
   * 签约营销参数，此值为json格式；具体的key需与营销约定
   * @return promoParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key\":\"value\"}", value = "签约营销参数，此值为json格式；具体的key需与营销约定")

  public String getPromoParams() {
    return promoParams;
  }


  public void setPromoParams(String promoParams) {
    this.promoParams = promoParams;
  }


  public AlipayUserAgreementPageSignModel returnUrl(String returnUrl) {
    
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * 跳转地址
   * @return returnUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "跳转地址")

  public String getReturnUrl() {
    return returnUrl;
  }


  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }


  public AlipayUserAgreementPageSignModel signScene(String signScene) {
    
    this.signScene = signScene;
    return this;
  }

   /**
   * 协议签约场景，商户可根据 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/20190319114403226822/signscene\&quot;&gt;代扣产品常见场景值&lt;/a&gt; 选择符合自身的行业场景。 说明：当传入商户签约号 external_agreement_no 时，本参数必填，不能为默认值 DEFAULT|DEFAULT。
   * @return signScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INDUSTRY|CARRENTAL", value = "协议签约场景，商户可根据 <a href=\"https://opendocs.alipay.com/open/20190319114403226822/signscene\">代扣产品常见场景值</a> 选择符合自身的行业场景。 说明：当传入商户签约号 external_agreement_no 时，本参数必填，不能为默认值 DEFAULT|DEFAULT。")

  public String getSignScene() {
    return signScene;
  }


  public void setSignScene(String signScene) {
    this.signScene = signScene;
  }


  public AlipayUserAgreementPageSignModel signValidityPeriod(String signValidityPeriod) {
    
    this.signValidityPeriod = signValidityPeriod;
    return this;
  }

   /**
   * 当前用户签约请求的协议有效周期。  整形数字加上时间单位的协议有效期，从发起签约请求的时间开始算起。  目前支持的时间单位：  1. d：天  2. m：月  如果未传入，默认为长期有效。
   * @return signValidityPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2m", value = "当前用户签约请求的协议有效周期。  整形数字加上时间单位的协议有效期，从发起签约请求的时间开始算起。  目前支持的时间单位：  1. d：天  2. m：月  如果未传入，默认为长期有效。")

  public String getSignValidityPeriod() {
    return signValidityPeriod;
  }


  public void setSignValidityPeriod(String signValidityPeriod) {
    this.signValidityPeriod = signValidityPeriod;
  }


  public AlipayUserAgreementPageSignModel specifiedAsset(SpecifiedAsset specifiedAsset) {
    
    this.specifiedAsset = specifiedAsset;
    return this;
  }

   /**
   * Get specifiedAsset
   * @return specifiedAsset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpecifiedAsset getSpecifiedAsset() {
    return specifiedAsset;
  }


  public void setSpecifiedAsset(SpecifiedAsset specifiedAsset) {
    this.specifiedAsset = specifiedAsset;
  }


  public AlipayUserAgreementPageSignModel specifiedSortChannelParams(SpecifiedChannelParam specifiedSortChannelParams) {
    
    this.specifiedSortChannelParams = specifiedSortChannelParams;
    return this;
  }

   /**
   * Get specifiedSortChannelParams
   * @return specifiedSortChannelParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpecifiedChannelParam getSpecifiedSortChannelParams() {
    return specifiedSortChannelParams;
  }


  public void setSpecifiedSortChannelParams(SpecifiedChannelParam specifiedSortChannelParams) {
    this.specifiedSortChannelParams = specifiedSortChannelParams;
  }


  public AlipayUserAgreementPageSignModel subMerchant(SubMerchantParams subMerchant) {
    
    this.subMerchant = subMerchant;
    return this;
  }

   /**
   * Get subMerchant
   * @return subMerchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubMerchantParams getSubMerchant() {
    return subMerchant;
  }


  public void setSubMerchant(SubMerchantParams subMerchant) {
    this.subMerchant = subMerchant;
  }


  public AlipayUserAgreementPageSignModel thirdPartyType(String thirdPartyType) {
    
    this.thirdPartyType = thirdPartyType;
    return this;
  }

   /**
   * 签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。  取值范围：  1. PARTNER（平台商户）  2. MERCHANT（集团商户），集团下子商户可共享用户签约内容  默认为PARTNER。
   * @return thirdPartyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PARTNER", value = "签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。  取值范围：  1. PARTNER（平台商户）  2. MERCHANT（集团商户），集团下子商户可共享用户签约内容  默认为PARTNER。")

  public String getThirdPartyType() {
    return thirdPartyType;
  }


  public void setThirdPartyType(String thirdPartyType) {
    this.thirdPartyType = thirdPartyType;
  }


  public AlipayUserAgreementPageSignModel userAgeRange(String userAgeRange) {
    
    this.userAgeRange = userAgeRange;
    return this;
  }

   /**
   * 商户希望限制的签约用户的年龄范围，min表示可签该协议的用户年龄下限，max表示年龄上限。如{\&quot;min\&quot;: \&quot;18\&quot;,\&quot;max\&quot;: \&quot;30\&quot;}表示18&#x3D;&lt;年龄&lt;&#x3D;30的用户可以签约该协议。
   * @return userAgeRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"min\":\"18\",\"max\":\"30\"}", value = "商户希望限制的签约用户的年龄范围，min表示可签该协议的用户年龄下限，max表示年龄上限。如{\"min\": \"18\",\"max\": \"30\"}表示18=<年龄<=30的用户可以签约该协议。")

  public String getUserAgeRange() {
    return userAgeRange;
  }


  public void setUserAgeRange(String userAgeRange) {
    this.userAgeRange = userAgeRange;
  }


  public AlipayUserAgreementPageSignModel zmAuthParams(ZmAuthParams zmAuthParams) {
    
    this.zmAuthParams = zmAuthParams;
    return this;
  }

   /**
   * Get zmAuthParams
   * @return zmAuthParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZmAuthParams getZmAuthParams() {
    return zmAuthParams;
  }


  public void setZmAuthParams(ZmAuthParams zmAuthParams) {
    this.zmAuthParams = zmAuthParams;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayUserAgreementPageSignModel alipayUserAgreementPageSignModel = (AlipayUserAgreementPageSignModel) o;
    return Objects.equals(this.accessParams, alipayUserAgreementPageSignModel.accessParams) &&
        Objects.equals(this.agreementEffectType, alipayUserAgreementPageSignModel.agreementEffectType) &&
        Objects.equals(this.allowHuazhiDegrade, alipayUserAgreementPageSignModel.allowHuazhiDegrade) &&
        Objects.equals(this.deviceParams, alipayUserAgreementPageSignModel.deviceParams) &&
        Objects.equals(this.effectTime, alipayUserAgreementPageSignModel.effectTime) &&
        Objects.equals(this.externalAgreementNo, alipayUserAgreementPageSignModel.externalAgreementNo) &&
        Objects.equals(this.externalLogonId, alipayUserAgreementPageSignModel.externalLogonId) &&
        Objects.equals(this.identityParams, alipayUserAgreementPageSignModel.identityParams) &&
        Objects.equals(this.merchantProcessUrl, alipayUserAgreementPageSignModel.merchantProcessUrl) &&
        Objects.equals(this.notifyUrl, alipayUserAgreementPageSignModel.notifyUrl) &&
        Objects.equals(this.passParams, alipayUserAgreementPageSignModel.passParams) &&
        Objects.equals(this.periodRuleParams, alipayUserAgreementPageSignModel.periodRuleParams) &&
        Objects.equals(this.personalProductCode, alipayUserAgreementPageSignModel.personalProductCode) &&
        Objects.equals(this.prodParams, alipayUserAgreementPageSignModel.prodParams) &&
        Objects.equals(this.productCode, alipayUserAgreementPageSignModel.productCode) &&
        Objects.equals(this.promoParams, alipayUserAgreementPageSignModel.promoParams) &&
        Objects.equals(this.returnUrl, alipayUserAgreementPageSignModel.returnUrl) &&
        Objects.equals(this.signScene, alipayUserAgreementPageSignModel.signScene) &&
        Objects.equals(this.signValidityPeriod, alipayUserAgreementPageSignModel.signValidityPeriod) &&
        Objects.equals(this.specifiedAsset, alipayUserAgreementPageSignModel.specifiedAsset) &&
        Objects.equals(this.specifiedSortChannelParams, alipayUserAgreementPageSignModel.specifiedSortChannelParams) &&
        Objects.equals(this.subMerchant, alipayUserAgreementPageSignModel.subMerchant) &&
        Objects.equals(this.thirdPartyType, alipayUserAgreementPageSignModel.thirdPartyType) &&
        Objects.equals(this.userAgeRange, alipayUserAgreementPageSignModel.userAgeRange) &&
        Objects.equals(this.zmAuthParams, alipayUserAgreementPageSignModel.zmAuthParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessParams, agreementEffectType, allowHuazhiDegrade, deviceParams, effectTime, externalAgreementNo, externalLogonId, identityParams, merchantProcessUrl, notifyUrl, passParams, periodRuleParams, personalProductCode, prodParams, productCode, promoParams, returnUrl, signScene, signValidityPeriod, specifiedAsset, specifiedSortChannelParams, subMerchant, thirdPartyType, userAgeRange, zmAuthParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayUserAgreementPageSignModel {\n");
    sb.append("    accessParams: ").append(toIndentedString(accessParams)).append("\n");
    sb.append("    agreementEffectType: ").append(toIndentedString(agreementEffectType)).append("\n");
    sb.append("    allowHuazhiDegrade: ").append(toIndentedString(allowHuazhiDegrade)).append("\n");
    sb.append("    deviceParams: ").append(toIndentedString(deviceParams)).append("\n");
    sb.append("    effectTime: ").append(toIndentedString(effectTime)).append("\n");
    sb.append("    externalAgreementNo: ").append(toIndentedString(externalAgreementNo)).append("\n");
    sb.append("    externalLogonId: ").append(toIndentedString(externalLogonId)).append("\n");
    sb.append("    identityParams: ").append(toIndentedString(identityParams)).append("\n");
    sb.append("    merchantProcessUrl: ").append(toIndentedString(merchantProcessUrl)).append("\n");
    sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
    sb.append("    passParams: ").append(toIndentedString(passParams)).append("\n");
    sb.append("    periodRuleParams: ").append(toIndentedString(periodRuleParams)).append("\n");
    sb.append("    personalProductCode: ").append(toIndentedString(personalProductCode)).append("\n");
    sb.append("    prodParams: ").append(toIndentedString(prodParams)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    promoParams: ").append(toIndentedString(promoParams)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    signScene: ").append(toIndentedString(signScene)).append("\n");
    sb.append("    signValidityPeriod: ").append(toIndentedString(signValidityPeriod)).append("\n");
    sb.append("    specifiedAsset: ").append(toIndentedString(specifiedAsset)).append("\n");
    sb.append("    specifiedSortChannelParams: ").append(toIndentedString(specifiedSortChannelParams)).append("\n");
    sb.append("    subMerchant: ").append(toIndentedString(subMerchant)).append("\n");
    sb.append("    thirdPartyType: ").append(toIndentedString(thirdPartyType)).append("\n");
    sb.append("    userAgeRange: ").append(toIndentedString(userAgeRange)).append("\n");
    sb.append("    zmAuthParams: ").append(toIndentedString(zmAuthParams)).append("\n");
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
    openapiFields.add("access_params");
    openapiFields.add("agreement_effect_type");
    openapiFields.add("allow_huazhi_degrade");
    openapiFields.add("device_params");
    openapiFields.add("effect_time");
    openapiFields.add("external_agreement_no");
    openapiFields.add("external_logon_id");
    openapiFields.add("identity_params");
    openapiFields.add("merchant_process_url");
    openapiFields.add("notify_url");
    openapiFields.add("pass_params");
    openapiFields.add("period_rule_params");
    openapiFields.add("personal_product_code");
    openapiFields.add("prod_params");
    openapiFields.add("product_code");
    openapiFields.add("promo_params");
    openapiFields.add("return_url");
    openapiFields.add("sign_scene");
    openapiFields.add("sign_validity_period");
    openapiFields.add("specified_asset");
    openapiFields.add("specified_sort_channel_params");
    openapiFields.add("sub_merchant");
    openapiFields.add("third_party_type");
    openapiFields.add("user_age_range");
    openapiFields.add("zm_auth_params");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayUserAgreementPageSignModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayUserAgreementPageSignModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayUserAgreementPageSignModel is not found in the empty JSON string", AlipayUserAgreementPageSignModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayUserAgreementPageSignModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayUserAgreementPageSignModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `access_params`
      if (jsonObj.getAsJsonObject("access_params") != null) {
        AccessParams.validateJsonObject(jsonObj.getAsJsonObject("access_params"));
      }
      if (jsonObj.get("agreement_effect_type") != null && !jsonObj.get("agreement_effect_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_effect_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_effect_type").toString()));
      }
      if (jsonObj.get("allow_huazhi_degrade") != null && !jsonObj.get("allow_huazhi_degrade").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allow_huazhi_degrade` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allow_huazhi_degrade").toString()));
      }
      // validate the optional field `device_params`
      if (jsonObj.getAsJsonObject("device_params") != null) {
        DeviceParams.validateJsonObject(jsonObj.getAsJsonObject("device_params"));
      }
      if (jsonObj.get("external_agreement_no") != null && !jsonObj.get("external_agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_agreement_no").toString()));
      }
      if (jsonObj.get("external_logon_id") != null && !jsonObj.get("external_logon_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_logon_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_logon_id").toString()));
      }
      // validate the optional field `identity_params`
      if (jsonObj.getAsJsonObject("identity_params") != null) {
        IdentityParams.validateJsonObject(jsonObj.getAsJsonObject("identity_params"));
      }
      if (jsonObj.get("merchant_process_url") != null && !jsonObj.get("merchant_process_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_process_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_process_url").toString()));
      }
      if (jsonObj.get("notify_url") != null && !jsonObj.get("notify_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_url").toString()));
      }
      if (jsonObj.get("pass_params") != null && !jsonObj.get("pass_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pass_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pass_params").toString()));
      }
      // validate the optional field `period_rule_params`
      if (jsonObj.getAsJsonObject("period_rule_params") != null) {
        PeriodRuleParams.validateJsonObject(jsonObj.getAsJsonObject("period_rule_params"));
      }
      if (jsonObj.get("personal_product_code") != null && !jsonObj.get("personal_product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personal_product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personal_product_code").toString()));
      }
      // validate the optional field `prod_params`
      if (jsonObj.getAsJsonObject("prod_params") != null) {
        ProdParams.validateJsonObject(jsonObj.getAsJsonObject("prod_params"));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
      if (jsonObj.get("promo_params") != null && !jsonObj.get("promo_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promo_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promo_params").toString()));
      }
      if (jsonObj.get("return_url") != null && !jsonObj.get("return_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `return_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("return_url").toString()));
      }
      if (jsonObj.get("sign_scene") != null && !jsonObj.get("sign_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_scene").toString()));
      }
      if (jsonObj.get("sign_validity_period") != null && !jsonObj.get("sign_validity_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_validity_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_validity_period").toString()));
      }
      // validate the optional field `specified_asset`
      if (jsonObj.getAsJsonObject("specified_asset") != null) {
        SpecifiedAsset.validateJsonObject(jsonObj.getAsJsonObject("specified_asset"));
      }
      // validate the optional field `specified_sort_channel_params`
      if (jsonObj.getAsJsonObject("specified_sort_channel_params") != null) {
        SpecifiedChannelParam.validateJsonObject(jsonObj.getAsJsonObject("specified_sort_channel_params"));
      }
      // validate the optional field `sub_merchant`
      if (jsonObj.getAsJsonObject("sub_merchant") != null) {
        SubMerchantParams.validateJsonObject(jsonObj.getAsJsonObject("sub_merchant"));
      }
      if (jsonObj.get("third_party_type") != null && !jsonObj.get("third_party_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `third_party_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("third_party_type").toString()));
      }
      if (jsonObj.get("user_age_range") != null && !jsonObj.get("user_age_range").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_age_range` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_age_range").toString()));
      }
      // validate the optional field `zm_auth_params`
      if (jsonObj.getAsJsonObject("zm_auth_params") != null) {
        ZmAuthParams.validateJsonObject(jsonObj.getAsJsonObject("zm_auth_params"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayUserAgreementPageSignModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayUserAgreementPageSignModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayUserAgreementPageSignModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayUserAgreementPageSignModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayUserAgreementPageSignModel>() {
           @Override
           public void write(JsonWriter out, AlipayUserAgreementPageSignModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayUserAgreementPageSignModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayUserAgreementPageSignModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayUserAgreementPageSignModel
  * @throws IOException if the JSON string is invalid with respect to AlipayUserAgreementPageSignModel
  */
  public static AlipayUserAgreementPageSignModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayUserAgreementPageSignModel.class);
  }

 /**
  * Convert an instance of AlipayUserAgreementPageSignModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

