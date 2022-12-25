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
import com.alipay.v3.model.AddressInfo;
import com.alipay.v3.model.ContactInfo;
import com.alipay.v3.model.IndustryQualificationInfo;
import com.alipay.v3.model.SettleCardInfo;
import com.alipay.v3.model.ShopBusinessTime;
import com.alipay.v3.model.ShopExtInfo;
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
 * AntMerchantExpandShopCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AntMerchantExpandShopCreateModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BIZ_CARDS = "biz_cards";
  @SerializedName(SERIALIZED_NAME_BIZ_CARDS)
  private List<SettleCardInfo> bizCards = null;

  public static final String SERIALIZED_NAME_BRAND_ID = "brand_id";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private String brandId;

  public static final String SERIALIZED_NAME_BUSINESS_ADDRESS = "business_address";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ADDRESS)
  private AddressInfo businessAddress;

  public static final String SERIALIZED_NAME_BUSINESS_TIME = "business_time";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TIME)
  private List<ShopBusinessTime> businessTime = null;

  public static final String SERIALIZED_NAME_CERT_IMAGE = "cert_image";
  @SerializedName(SERIALIZED_NAME_CERT_IMAGE)
  private String certImage;

  public static final String SERIALIZED_NAME_CERT_NAME = "cert_name";
  @SerializedName(SERIALIZED_NAME_CERT_NAME)
  private String certName;

  public static final String SERIALIZED_NAME_CERT_NO = "cert_no";
  @SerializedName(SERIALIZED_NAME_CERT_NO)
  private String certNo;

  public static final String SERIALIZED_NAME_CERT_TYPE = "cert_type";
  @SerializedName(SERIALIZED_NAME_CERT_TYPE)
  private String certType;

  public static final String SERIALIZED_NAME_CONTACT_INFOS = "contact_infos";
  @SerializedName(SERIALIZED_NAME_CONTACT_INFOS)
  private List<ContactInfo> contactInfos = null;

  public static final String SERIALIZED_NAME_CONTACT_MOBILE = "contact_mobile";
  @SerializedName(SERIALIZED_NAME_CONTACT_MOBILE)
  private String contactMobile;

  public static final String SERIALIZED_NAME_CONTACT_PHONE = "contact_phone";
  @SerializedName(SERIALIZED_NAME_CONTACT_PHONE)
  private String contactPhone;

  public static final String SERIALIZED_NAME_EXT_INFOS = "ext_infos";
  @SerializedName(SERIALIZED_NAME_EXT_INFOS)
  private List<ShopExtInfo> extInfos = null;

  public static final String SERIALIZED_NAME_IP_ROLE_ID = "ip_role_id";
  @SerializedName(SERIALIZED_NAME_IP_ROLE_ID)
  private String ipRoleId;

  public static final String SERIALIZED_NAME_LEGAL_CERT_NO = "legal_cert_no";
  @SerializedName(SERIALIZED_NAME_LEGAL_CERT_NO)
  private String legalCertNo;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_LICENSE_AUTH_LETTER_IMAGE = "license_auth_letter_image";
  @SerializedName(SERIALIZED_NAME_LICENSE_AUTH_LETTER_IMAGE)
  private String licenseAuthLetterImage;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_OUT_DOOR_IMAGES = "out_door_images";
  @SerializedName(SERIALIZED_NAME_OUT_DOOR_IMAGES)
  private List<String> outDoorImages = null;

  public static final String SERIALIZED_NAME_QUALIFICATIONS = "qualifications";
  @SerializedName(SERIALIZED_NAME_QUALIFICATIONS)
  private List<IndustryQualificationInfo> qualifications = null;

  public static final String SERIALIZED_NAME_SCENE = "scene";
  @SerializedName(SERIALIZED_NAME_SCENE)
  private String scene;

  public static final String SERIALIZED_NAME_SETTLE_ALIPAY_LOGON_ID = "settle_alipay_logon_id";
  @SerializedName(SERIALIZED_NAME_SETTLE_ALIPAY_LOGON_ID)
  private String settleAlipayLogonId;

  public static final String SERIALIZED_NAME_SHOP_CATEGORY = "shop_category";
  @SerializedName(SERIALIZED_NAME_SHOP_CATEGORY)
  private String shopCategory;

  public static final String SERIALIZED_NAME_SHOP_NAME = "shop_name";
  @SerializedName(SERIALIZED_NAME_SHOP_NAME)
  private String shopName;

  public static final String SERIALIZED_NAME_SHOP_TYPE = "shop_type";
  @SerializedName(SERIALIZED_NAME_SHOP_TYPE)
  private String shopType;

  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public AntMerchantExpandShopCreateModel() { 
  }

  public AntMerchantExpandShopCreateModel bizCards(List<SettleCardInfo> bizCards) {
    
    this.bizCards = bizCards;
    return this;
  }

  public AntMerchantExpandShopCreateModel addBizCardsItem(SettleCardInfo bizCardsItem) {
    if (this.bizCards == null) {
      this.bizCards = new ArrayList<>();
    }
    this.bizCards.add(bizCardsItem);
    return this;
  }

   /**
   * 门店结算卡信息。本业务当前只允许传入一张结算卡。 说明：本参数仅直付通业务使用，其余业务无需关注。
   * @return bizCards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "门店结算卡信息。本业务当前只允许传入一张结算卡。 说明：本参数仅直付通业务使用，其余业务无需关注。")

  public List<SettleCardInfo> getBizCards() {
    return bizCards;
  }


  public void setBizCards(List<SettleCardInfo> bizCards) {
    this.bizCards = bizCards;
  }


  public AntMerchantExpandShopCreateModel brandId(String brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * 品牌id，非加油站等特殊门店无需关注。
   * @return brandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20181026000001", value = "品牌id，非加油站等特殊门店无需关注。")

  public String getBrandId() {
    return brandId;
  }


  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  public AntMerchantExpandShopCreateModel businessAddress(AddressInfo businessAddress) {
    
    this.businessAddress = businessAddress;
    return this;
  }

   /**
   * Get businessAddress
   * @return businessAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddressInfo getBusinessAddress() {
    return businessAddress;
  }


  public void setBusinessAddress(AddressInfo businessAddress) {
    this.businessAddress = businessAddress;
  }


  public AntMerchantExpandShopCreateModel businessTime(List<ShopBusinessTime> businessTime) {
    
    this.businessTime = businessTime;
    return this;
  }

  public AntMerchantExpandShopCreateModel addBusinessTimeItem(ShopBusinessTime businessTimeItem) {
    if (this.businessTime == null) {
      this.businessTime = new ArrayList<>();
    }
    this.businessTime.add(businessTimeItem);
    return this;
  }

   /**
   * 店铺经营时间。
   * @return businessTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "店铺经营时间。")

  public List<ShopBusinessTime> getBusinessTime() {
    return businessTime;
  }


  public void setBusinessTime(List<ShopBusinessTime> businessTime) {
    this.businessTime = businessTime;
  }


  public AntMerchantExpandShopCreateModel certImage(String certImage) {
    
    this.certImage = certImage;
    return this;
  }

   /**
   * 营业执照图片，需传入&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_1/ant.merchant.expand.indirect.image.upload\&quot;&gt;ant.merchant.expand.indirect.image.upload&lt;/a&gt; 接口上传图片后得到的 image_id。
   * @return certImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c6c0c7a1-b9d5-4e5d-b9d4-9eed39f00e65.jpg", value = "营业执照图片，需传入<a href=\"https://opendocs.alipay.com/apis/api_1/ant.merchant.expand.indirect.image.upload\">ant.merchant.expand.indirect.image.upload</a> 接口上传图片后得到的 image_id。")

  public String getCertImage() {
    return certImage;
  }


  public void setCertImage(String certImage) {
    this.certImage = certImage;
  }


  public AntMerchantExpandShopCreateModel certName(String certName) {
    
    this.certName = certName;
    return this;
  }

   /**
   * 营业执照名称，填写值为营业执照或统一社会信用代码证上的名称。 注意：若传入 cert_no，则本参数必填。
   * @return certName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxxx小卖铺", value = "营业执照名称，填写值为营业执照或统一社会信用代码证上的名称。 注意：若传入 cert_no，则本参数必填。")

  public String getCertName() {
    return certName;
  }


  public void setCertName(String certName) {
    this.certName = certName;
  }


  public AntMerchantExpandShopCreateModel certNo(String certNo) {
    
    this.certNo = certNo;
    return this;
  }

   /**
   * 证件号码，请填写店铺营业执照号。
   * @return certNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9133010608210550XR", value = "证件号码，请填写店铺营业执照号。")

  public String getCertNo() {
    return certNo;
  }


  public void setCertNo(String certNo) {
    this.certNo = certNo;
  }


  public AntMerchantExpandShopCreateModel certType(String certType) {
    
    this.certType = certType;
    return this;
  }

   /**
   * 证件类型，取值范围：201：营业执照；2011:多证合一(统一社会信用代码)。 注意：若传入 cert_no，则本参数必填。
   * @return certType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201", value = "证件类型，取值范围：201：营业执照；2011:多证合一(统一社会信用代码)。 注意：若传入 cert_no，则本参数必填。")

  public String getCertType() {
    return certType;
  }


  public void setCertType(String certType) {
    this.certType = certType;
  }


  public AntMerchantExpandShopCreateModel contactInfos(List<ContactInfo> contactInfos) {
    
    this.contactInfos = contactInfos;
    return this;
  }

  public AntMerchantExpandShopCreateModel addContactInfosItem(ContactInfo contactInfosItem) {
    if (this.contactInfos == null) {
      this.contactInfos = new ArrayList<>();
    }
    this.contactInfos.add(contactInfosItem);
    return this;
  }

   /**
   * 联系人信息。如果填写，其中名称必填，手机、固话、email 三选一必填。
   * @return contactInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "联系人信息。如果填写，其中名称必填，手机、固话、email 三选一必填。")

  public List<ContactInfo> getContactInfos() {
    return contactInfos;
  }


  public void setContactInfos(List<ContactInfo> contactInfos) {
    this.contactInfos = contactInfos;
  }


  public AntMerchantExpandShopCreateModel contactMobile(String contactMobile) {
    
    this.contactMobile = contactMobile;
    return this;
  }

   /**
   * 店铺联系手机，与店铺联系固话二选一必填
   * @return contactMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13901390139", value = "店铺联系手机，与店铺联系固话二选一必填")

  public String getContactMobile() {
    return contactMobile;
  }


  public void setContactMobile(String contactMobile) {
    this.contactMobile = contactMobile;
  }


  public AntMerchantExpandShopCreateModel contactPhone(String contactPhone) {
    
    this.contactPhone = contactPhone;
    return this;
  }

   /**
   * 店铺的联系固话，和店铺联系手机二选一必填
   * @return contactPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "010-62286228", value = "店铺的联系固话，和店铺联系手机二选一必填")

  public String getContactPhone() {
    return contactPhone;
  }


  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }


  public AntMerchantExpandShopCreateModel extInfos(List<ShopExtInfo> extInfos) {
    
    this.extInfos = extInfos;
    return this;
  }

  public AntMerchantExpandShopCreateModel addExtInfosItem(ShopExtInfo extInfosItem) {
    if (this.extInfos == null) {
      this.extInfos = new ArrayList<>();
    }
    this.extInfos.add(extInfosItem);
    return this;
  }

   /**
   * 扩展信息列表。key值需要向对应行业的bd进行申请。
   * @return extInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展信息列表。key值需要向对应行业的bd进行申请。")

  public List<ShopExtInfo> getExtInfos() {
    return extInfos;
  }


  public void setExtInfos(List<ShopExtInfo> extInfos) {
    this.extInfos = extInfos;
  }


  public AntMerchantExpandShopCreateModel ipRoleId(String ipRoleId) {
    
    this.ipRoleId = ipRoleId;
    return this;
  }

   /**
   * 商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid。特别说明：IoT设备三绑定场景统一填写商户pid
   * @return ipRoleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088301155943087", value = "商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid。特别说明：IoT设备三绑定场景统一填写商户pid")

  public String getIpRoleId() {
    return ipRoleId;
  }


  public void setIpRoleId(String ipRoleId) {
    this.ipRoleId = ipRoleId;
  }


  public AntMerchantExpandShopCreateModel legalCertNo(String legalCertNo) {
    
    this.legalCertNo = legalCertNo;
    return this;
  }

   /**
   * 法人身份证号。通过蚂蚁门店管理能力创建门店时可选。
   * @return legalCertNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100100198811110001", value = "法人身份证号。通过蚂蚁门店管理能力创建门店时可选。")

  public String getLegalCertNo() {
    return legalCertNo;
  }


  public void setLegalCertNo(String legalCertNo) {
    this.legalCertNo = legalCertNo;
  }


  public AntMerchantExpandShopCreateModel legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * 法人名称。通过蚂蚁门店管理能力创建门店时可选。
   * @return legalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支小宝", value = "法人名称。通过蚂蚁门店管理能力创建门店时可选。")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public AntMerchantExpandShopCreateModel licenseAuthLetterImage(String licenseAuthLetterImage) {
    
    this.licenseAuthLetterImage = licenseAuthLetterImage;
    return this;
  }

   /**
   * 营业执照授权函。需传入&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_1/ant.merchant.expand.indirect.image.upload\&quot;&gt;ant.merchant.expand.indirect.image.upload&lt;/a&gt; 接口上传图片后得到的 image_id。 通过蚂蚁门店管理能力创建门店时可选。
   * @return licenseAuthLetterImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c6c0c7a1-b9d5-4e5d-b9d4-9eed39f00e65.jpg", value = "营业执照授权函。需传入<a href=\"https://opendocs.alipay.com/apis/api_1/ant.merchant.expand.indirect.image.upload\">ant.merchant.expand.indirect.image.upload</a> 接口上传图片后得到的 image_id。 通过蚂蚁门店管理能力创建门店时可选。")

  public String getLicenseAuthLetterImage() {
    return licenseAuthLetterImage;
  }


  public void setLicenseAuthLetterImage(String licenseAuthLetterImage) {
    this.licenseAuthLetterImage = licenseAuthLetterImage;
  }


  public AntMerchantExpandShopCreateModel memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 备注
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "备注", value = "备注")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public AntMerchantExpandShopCreateModel outDoorImages(List<String> outDoorImages) {
    
    this.outDoorImages = outDoorImages;
    return this;
  }

  public AntMerchantExpandShopCreateModel addOutDoorImagesItem(String outDoorImagesItem) {
    if (this.outDoorImages == null) {
      this.outDoorImages = new ArrayList<>();
    }
    this.outDoorImages.add(outDoorImagesItem);
    return this;
  }

   /**
   * 门头照 id，需传入&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_1/ant.merchant.expand.indirect.image.upload\&quot;&gt;ant.merchant.expand.indirect.image.upload&lt;/a&gt; 接口上传图片后得到的 image_id。 通过蚂蚁门店管理能力创建门店时可选。
   * @return outDoorImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c6c0c7a1-b9d5-4e5d-b9d4-9eed39f00e65.jpg", value = "门头照 id，需传入<a href=\"https://opendocs.alipay.com/apis/api_1/ant.merchant.expand.indirect.image.upload\">ant.merchant.expand.indirect.image.upload</a> 接口上传图片后得到的 image_id。 通过蚂蚁门店管理能力创建门店时可选。")

  public List<String> getOutDoorImages() {
    return outDoorImages;
  }


  public void setOutDoorImages(List<String> outDoorImages) {
    this.outDoorImages = outDoorImages;
  }


  public AntMerchantExpandShopCreateModel qualifications(List<IndustryQualificationInfo> qualifications) {
    
    this.qualifications = qualifications;
    return this;
  }

  public AntMerchantExpandShopCreateModel addQualificationsItem(IndustryQualificationInfo qualificationsItem) {
    if (this.qualifications == null) {
      this.qualifications = new ArrayList<>();
    }
    this.qualifications.add(qualificationsItem);
    return this;
  }

   /**
   * 行业特殊资质。
   * @return qualifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "行业特殊资质。")

  public List<IndustryQualificationInfo> getQualifications() {
    return qualifications;
  }


  public void setQualifications(List<IndustryQualificationInfo> qualifications) {
    this.qualifications = qualifications;
  }


  public AntMerchantExpandShopCreateModel scene(String scene) {
    
    this.scene = scene;
    return this;
  }

   /**
   * 场景，非加油站/酒店等特殊门店无需关注。
   * @return scene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PARK", value = "场景，非加油站/酒店等特殊门店无需关注。")

  public String getScene() {
    return scene;
  }


  public void setScene(String scene) {
    this.scene = scene;
  }


  public AntMerchantExpandShopCreateModel settleAlipayLogonId(String settleAlipayLogonId) {
    
    this.settleAlipayLogonId = settleAlipayLogonId;
    return this;
  }

   /**
   * 结算支付宝账号的登录号。
   * @return settleAlipayLogonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "demo@163.com", value = "结算支付宝账号的登录号。")

  public String getSettleAlipayLogonId() {
    return settleAlipayLogonId;
  }


  public void setSettleAlipayLogonId(String settleAlipayLogonId) {
    this.settleAlipayLogonId = settleAlipayLogonId;
  }


  public AntMerchantExpandShopCreateModel shopCategory(String shopCategory) {
    
    this.shopCategory = shopCategory;
    return this;
  }

   /**
   * 新版门店类目标准二级类目code。类目标准及与原类目映射关系参见 &lt;a href&#x3D;\&quot;https://gw.alipayobjects.com/os/bmw-prod/4b3f82df-e53e-4b84-bc41-fe025101e726.xlsx\&quot;&gt;支付宝门店类目-最新&lt;/a&gt; 表格。
   * @return shopCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B0001", value = "新版门店类目标准二级类目code。类目标准及与原类目映射关系参见 <a href=\"https://gw.alipayobjects.com/os/bmw-prod/4b3f82df-e53e-4b84-bc41-fe025101e726.xlsx\">支付宝门店类目-最新</a> 表格。")

  public String getShopCategory() {
    return shopCategory;
  }


  public void setShopCategory(String shopCategory) {
    this.shopCategory = shopCategory;
  }


  public AntMerchantExpandShopCreateModel shopName(String shopName) {
    
    this.shopName = shopName;
    return this;
  }

   /**
   * 店铺名称。直连开店要保证全局店铺名称+地址唯一，间连开店要保证服务商pid下店铺名称+地址唯一
   * @return shopName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "肯德基中关村店", value = "店铺名称。直连开店要保证全局店铺名称+地址唯一，间连开店要保证服务商pid下店铺名称+地址唯一")

  public String getShopName() {
    return shopName;
  }


  public void setShopName(String shopName) {
    this.shopName = shopName;
  }


  public AntMerchantExpandShopCreateModel shopType(String shopType) {
    
    this.shopType = shopType;
    return this;
  }

   /**
   * 店铺经营类型，01表示直营，02表示加盟
   * @return shopType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "店铺经营类型，01表示直营，02表示加盟")

  public String getShopType() {
    return shopType;
  }


  public void setShopType(String shopType) {
    this.shopType = shopType;
  }


  public AntMerchantExpandShopCreateModel storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * 门店编号，表示该门店在该商户角色id(直连pid，间连smid)下，由商户自己定义的外部门店编号
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NO0001", value = "门店编号，表示该门店在该商户角色id(直连pid，间连smid)下，由商户自己定义的外部门店编号")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntMerchantExpandShopCreateModel antMerchantExpandShopCreateModel = (AntMerchantExpandShopCreateModel) o;
    return Objects.equals(this.bizCards, antMerchantExpandShopCreateModel.bizCards) &&
        Objects.equals(this.brandId, antMerchantExpandShopCreateModel.brandId) &&
        Objects.equals(this.businessAddress, antMerchantExpandShopCreateModel.businessAddress) &&
        Objects.equals(this.businessTime, antMerchantExpandShopCreateModel.businessTime) &&
        Objects.equals(this.certImage, antMerchantExpandShopCreateModel.certImage) &&
        Objects.equals(this.certName, antMerchantExpandShopCreateModel.certName) &&
        Objects.equals(this.certNo, antMerchantExpandShopCreateModel.certNo) &&
        Objects.equals(this.certType, antMerchantExpandShopCreateModel.certType) &&
        Objects.equals(this.contactInfos, antMerchantExpandShopCreateModel.contactInfos) &&
        Objects.equals(this.contactMobile, antMerchantExpandShopCreateModel.contactMobile) &&
        Objects.equals(this.contactPhone, antMerchantExpandShopCreateModel.contactPhone) &&
        Objects.equals(this.extInfos, antMerchantExpandShopCreateModel.extInfos) &&
        Objects.equals(this.ipRoleId, antMerchantExpandShopCreateModel.ipRoleId) &&
        Objects.equals(this.legalCertNo, antMerchantExpandShopCreateModel.legalCertNo) &&
        Objects.equals(this.legalName, antMerchantExpandShopCreateModel.legalName) &&
        Objects.equals(this.licenseAuthLetterImage, antMerchantExpandShopCreateModel.licenseAuthLetterImage) &&
        Objects.equals(this.memo, antMerchantExpandShopCreateModel.memo) &&
        Objects.equals(this.outDoorImages, antMerchantExpandShopCreateModel.outDoorImages) &&
        Objects.equals(this.qualifications, antMerchantExpandShopCreateModel.qualifications) &&
        Objects.equals(this.scene, antMerchantExpandShopCreateModel.scene) &&
        Objects.equals(this.settleAlipayLogonId, antMerchantExpandShopCreateModel.settleAlipayLogonId) &&
        Objects.equals(this.shopCategory, antMerchantExpandShopCreateModel.shopCategory) &&
        Objects.equals(this.shopName, antMerchantExpandShopCreateModel.shopName) &&
        Objects.equals(this.shopType, antMerchantExpandShopCreateModel.shopType) &&
        Objects.equals(this.storeId, antMerchantExpandShopCreateModel.storeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizCards, brandId, businessAddress, businessTime, certImage, certName, certNo, certType, contactInfos, contactMobile, contactPhone, extInfos, ipRoleId, legalCertNo, legalName, licenseAuthLetterImage, memo, outDoorImages, qualifications, scene, settleAlipayLogonId, shopCategory, shopName, shopType, storeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntMerchantExpandShopCreateModel {\n");
    sb.append("    bizCards: ").append(toIndentedString(bizCards)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    businessAddress: ").append(toIndentedString(businessAddress)).append("\n");
    sb.append("    businessTime: ").append(toIndentedString(businessTime)).append("\n");
    sb.append("    certImage: ").append(toIndentedString(certImage)).append("\n");
    sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
    sb.append("    certNo: ").append(toIndentedString(certNo)).append("\n");
    sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
    sb.append("    contactInfos: ").append(toIndentedString(contactInfos)).append("\n");
    sb.append("    contactMobile: ").append(toIndentedString(contactMobile)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    extInfos: ").append(toIndentedString(extInfos)).append("\n");
    sb.append("    ipRoleId: ").append(toIndentedString(ipRoleId)).append("\n");
    sb.append("    legalCertNo: ").append(toIndentedString(legalCertNo)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    licenseAuthLetterImage: ").append(toIndentedString(licenseAuthLetterImage)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    outDoorImages: ").append(toIndentedString(outDoorImages)).append("\n");
    sb.append("    qualifications: ").append(toIndentedString(qualifications)).append("\n");
    sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
    sb.append("    settleAlipayLogonId: ").append(toIndentedString(settleAlipayLogonId)).append("\n");
    sb.append("    shopCategory: ").append(toIndentedString(shopCategory)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
    sb.append("    shopType: ").append(toIndentedString(shopType)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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
    openapiFields.add("biz_cards");
    openapiFields.add("brand_id");
    openapiFields.add("business_address");
    openapiFields.add("business_time");
    openapiFields.add("cert_image");
    openapiFields.add("cert_name");
    openapiFields.add("cert_no");
    openapiFields.add("cert_type");
    openapiFields.add("contact_infos");
    openapiFields.add("contact_mobile");
    openapiFields.add("contact_phone");
    openapiFields.add("ext_infos");
    openapiFields.add("ip_role_id");
    openapiFields.add("legal_cert_no");
    openapiFields.add("legal_name");
    openapiFields.add("license_auth_letter_image");
    openapiFields.add("memo");
    openapiFields.add("out_door_images");
    openapiFields.add("qualifications");
    openapiFields.add("scene");
    openapiFields.add("settle_alipay_logon_id");
    openapiFields.add("shop_category");
    openapiFields.add("shop_name");
    openapiFields.add("shop_type");
    openapiFields.add("store_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AntMerchantExpandShopCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AntMerchantExpandShopCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AntMerchantExpandShopCreateModel is not found in the empty JSON string", AntMerchantExpandShopCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AntMerchantExpandShopCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AntMerchantExpandShopCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraybizCards = jsonObj.getAsJsonArray("biz_cards");
      if (jsonArraybizCards != null) {
        // ensure the json data is an array
        if (!jsonObj.get("biz_cards").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `biz_cards` to be an array in the JSON string but got `%s`", jsonObj.get("biz_cards").toString()));
        }

        // validate the optional field `biz_cards` (array)
        for (int i = 0; i < jsonArraybizCards.size(); i++) {
          SettleCardInfo.validateJsonObject(jsonArraybizCards.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("brand_id") != null && !jsonObj.get("brand_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_id").toString()));
      }
      // validate the optional field `business_address`
      if (jsonObj.getAsJsonObject("business_address") != null) {
        AddressInfo.validateJsonObject(jsonObj.getAsJsonObject("business_address"));
      }
      JsonArray jsonArraybusinessTime = jsonObj.getAsJsonArray("business_time");
      if (jsonArraybusinessTime != null) {
        // ensure the json data is an array
        if (!jsonObj.get("business_time").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `business_time` to be an array in the JSON string but got `%s`", jsonObj.get("business_time").toString()));
        }

        // validate the optional field `business_time` (array)
        for (int i = 0; i < jsonArraybusinessTime.size(); i++) {
          ShopBusinessTime.validateJsonObject(jsonArraybusinessTime.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("cert_image") != null && !jsonObj.get("cert_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_image").toString()));
      }
      if (jsonObj.get("cert_name") != null && !jsonObj.get("cert_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_name").toString()));
      }
      if (jsonObj.get("cert_no") != null && !jsonObj.get("cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_no").toString()));
      }
      if (jsonObj.get("cert_type") != null && !jsonObj.get("cert_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_type").toString()));
      }
      JsonArray jsonArraycontactInfos = jsonObj.getAsJsonArray("contact_infos");
      if (jsonArraycontactInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("contact_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `contact_infos` to be an array in the JSON string but got `%s`", jsonObj.get("contact_infos").toString()));
        }

        // validate the optional field `contact_infos` (array)
        for (int i = 0; i < jsonArraycontactInfos.size(); i++) {
          ContactInfo.validateJsonObject(jsonArraycontactInfos.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("contact_mobile") != null && !jsonObj.get("contact_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_mobile").toString()));
      }
      if (jsonObj.get("contact_phone") != null && !jsonObj.get("contact_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_phone").toString()));
      }
      JsonArray jsonArrayextInfos = jsonObj.getAsJsonArray("ext_infos");
      if (jsonArrayextInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ext_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ext_infos` to be an array in the JSON string but got `%s`", jsonObj.get("ext_infos").toString()));
        }

        // validate the optional field `ext_infos` (array)
        for (int i = 0; i < jsonArrayextInfos.size(); i++) {
          ShopExtInfo.validateJsonObject(jsonArrayextInfos.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("ip_role_id") != null && !jsonObj.get("ip_role_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_role_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip_role_id").toString()));
      }
      if (jsonObj.get("legal_cert_no") != null && !jsonObj.get("legal_cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_cert_no").toString()));
      }
      if (jsonObj.get("legal_name") != null && !jsonObj.get("legal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_name").toString()));
      }
      if (jsonObj.get("license_auth_letter_image") != null && !jsonObj.get("license_auth_letter_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_auth_letter_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_auth_letter_image").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("out_door_images") != null && !jsonObj.get("out_door_images").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_door_images` to be an array in the JSON string but got `%s`", jsonObj.get("out_door_images").toString()));
      }
      JsonArray jsonArrayqualifications = jsonObj.getAsJsonArray("qualifications");
      if (jsonArrayqualifications != null) {
        // ensure the json data is an array
        if (!jsonObj.get("qualifications").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `qualifications` to be an array in the JSON string but got `%s`", jsonObj.get("qualifications").toString()));
        }

        // validate the optional field `qualifications` (array)
        for (int i = 0; i < jsonArrayqualifications.size(); i++) {
          IndustryQualificationInfo.validateJsonObject(jsonArrayqualifications.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("scene") != null && !jsonObj.get("scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene").toString()));
      }
      if (jsonObj.get("settle_alipay_logon_id") != null && !jsonObj.get("settle_alipay_logon_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_alipay_logon_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_alipay_logon_id").toString()));
      }
      if (jsonObj.get("shop_category") != null && !jsonObj.get("shop_category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_category").toString()));
      }
      if (jsonObj.get("shop_name") != null && !jsonObj.get("shop_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_name").toString()));
      }
      if (jsonObj.get("shop_type") != null && !jsonObj.get("shop_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_type").toString()));
      }
      if (jsonObj.get("store_id") != null && !jsonObj.get("store_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AntMerchantExpandShopCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AntMerchantExpandShopCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AntMerchantExpandShopCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AntMerchantExpandShopCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AntMerchantExpandShopCreateModel>() {
           @Override
           public void write(JsonWriter out, AntMerchantExpandShopCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AntMerchantExpandShopCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AntMerchantExpandShopCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AntMerchantExpandShopCreateModel
  * @throws IOException if the JSON string is invalid with respect to AntMerchantExpandShopCreateModel
  */
  public static AntMerchantExpandShopCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AntMerchantExpandShopCreateModel.class);
  }

 /**
  * Convert an instance of AntMerchantExpandShopCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

