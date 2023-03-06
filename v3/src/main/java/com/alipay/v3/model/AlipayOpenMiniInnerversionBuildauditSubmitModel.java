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
import com.alipay.v3.model.AuditLicenseInfo;
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
 * AlipayOpenMiniInnerversionBuildauditSubmitModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerversionBuildauditSubmitModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APP_CATEGORY_IDS = "app_category_ids";
  @SerializedName(SERIALIZED_NAME_APP_CATEGORY_IDS)
  private String appCategoryIds;

  public static final String SERIALIZED_NAME_APP_DESC = "app_desc";
  @SerializedName(SERIALIZED_NAME_APP_DESC)
  private String appDesc;

  public static final String SERIALIZED_NAME_APP_ENGLISH_NAME = "app_english_name";
  @SerializedName(SERIALIZED_NAME_APP_ENGLISH_NAME)
  private String appEnglishName;

  public static final String SERIALIZED_NAME_APP_LOGO = "app_logo";
  @SerializedName(SERIALIZED_NAME_APP_LOGO)
  private String appLogo;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_APP_ORIGIN = "app_origin";
  @SerializedName(SERIALIZED_NAME_APP_ORIGIN)
  private String appOrigin;

  public static final String SERIALIZED_NAME_APP_SLOGAN = "app_slogan";
  @SerializedName(SERIALIZED_NAME_APP_SLOGAN)
  private String appSlogan;

  public static final String SERIALIZED_NAME_APP_VERSION = "app_version";
  @SerializedName(SERIALIZED_NAME_APP_VERSION)
  private String appVersion;

  public static final String SERIALIZED_NAME_BUILD_EXT = "build_ext";
  @SerializedName(SERIALIZED_NAME_BUILD_EXT)
  private String buildExt;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundle_id";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_ISV_APP_ID = "isv_app_id";
  @SerializedName(SERIALIZED_NAME_ISV_APP_ID)
  private String isvAppId;

  public static final String SERIALIZED_NAME_LICENSE_INFO = "license_info";
  @SerializedName(SERIALIZED_NAME_LICENSE_INFO)
  private AuditLicenseInfo licenseInfo;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_MINI_CATEGORY_IDS = "mini_category_ids";
  @SerializedName(SERIALIZED_NAME_MINI_CATEGORY_IDS)
  private String miniCategoryIds;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_REGION_TYPE = "region_type";
  @SerializedName(SERIALIZED_NAME_REGION_TYPE)
  private String regionType;

  public static final String SERIALIZED_NAME_SCREEN_SHOT_LIST = "screen_shot_list";
  @SerializedName(SERIALIZED_NAME_SCREEN_SHOT_LIST)
  private String screenShotList;

  public static final String SERIALIZED_NAME_SERVICE_PHONE = "service_phone";
  @SerializedName(SERIALIZED_NAME_SERVICE_PHONE)
  private String servicePhone;

  public static final String SERIALIZED_NAME_SPECIAL_LICENSE_PIC_LIST = "special_license_pic_list";
  @SerializedName(SERIALIZED_NAME_SPECIAL_LICENSE_PIC_LIST)
  private String specialLicensePicList;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_TEMPLATE_VERSION = "template_version";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_VERSION)
  private String templateVersion;

  public static final String SERIALIZED_NAME_VERSION_DESC = "version_desc";
  @SerializedName(SERIALIZED_NAME_VERSION_DESC)
  private String versionDesc;

  public AlipayOpenMiniInnerversionBuildauditSubmitModel() { 
  }

  public AlipayOpenMiniInnerversionBuildauditSubmitModel appCategoryIds(String appCategoryIds) {
    
    this.appCategoryIds = appCategoryIds;
    return this;
  }

   /**
   * 小程序类目，可不传，不传取基础信息中的小程序类目
   * @return appCategoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "107209_107226", value = "小程序类目，可不传，不传取基础信息中的小程序类目")

  public String getAppCategoryIds() {
    return appCategoryIds;
  }


  public void setAppCategoryIds(String appCategoryIds) {
    this.appCategoryIds = appCategoryIds;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel appDesc(String appDesc) {
    
    this.appDesc = appDesc;
    return this;
  }

   /**
   * 小程序描述，可不传，不传取基础信息中的小程序描述
   * @return appDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序描述", value = "小程序描述，可不传，不传取基础信息中的小程序描述")

  public String getAppDesc() {
    return appDesc;
  }


  public void setAppDesc(String appDesc) {
    this.appDesc = appDesc;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel appEnglishName(String appEnglishName) {
    
    this.appEnglishName = appEnglishName;
    return this;
  }

   /**
   * 小程序在从未上架过版本之前，英文名称是可以修改的，该字段用于在提交审核时候修改小程序英文名称。注意：小程序一旦有过上架版本之后就不可以修改英文名称。
   * @return appEnglishName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序英文名称", value = "小程序在从未上架过版本之前，英文名称是可以修改的，该字段用于在提交审核时候修改小程序英文名称。注意：小程序一旦有过上架版本之后就不可以修改英文名称。")

  public String getAppEnglishName() {
    return appEnglishName;
  }


  public void setAppEnglishName(String appEnglishName) {
    this.appEnglishName = appEnglishName;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel appLogo(String appLogo) {
    
    this.appLogo = appLogo;
    return this;
  }

   /**
   * 小程序logo，可不传，不传取基础信息中的小程序logo，请调用专用的logo上传接口上传logo文件，并将返回的地址作为本字段传入
   * @return appLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://appstoreisvpic.alipayobjects.com/prod/e2bcf04b-da46-4b7f-a020-e9d224df7689.png", value = "小程序logo，可不传，不传取基础信息中的小程序logo，请调用专用的logo上传接口上传logo文件，并将返回的地址作为本字段传入")

  public String getAppLogo() {
    return appLogo;
  }


  public void setAppLogo(String appLogo) {
    this.appLogo = appLogo;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 小程序在从未上架过版本之前，中文名称是可以修改的，该字段用于在提交审核时候修改小程序中文名称。注意：小程序一旦有过上架版本之后就不可以修改中文名称。
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序名称", value = "小程序在从未上架过版本之前，中文名称是可以修改的，该字段用于在提交审核时候修改小程序中文名称。注意：小程序一旦有过上架版本之后就不可以修改中文名称。")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel appOrigin(String appOrigin) {
    
    this.appOrigin = appOrigin;
    return this;
  }

   /**
   * 来源类型，新接入方需要向支付宝申请专用来源，否则不予接入，申请方式请参见接入手册。
   * @return appOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AAA", value = "来源类型，新接入方需要向支付宝申请专用来源，否则不予接入，申请方式请参见接入手册。")

  public String getAppOrigin() {
    return appOrigin;
  }


  public void setAppOrigin(String appOrigin) {
    this.appOrigin = appOrigin;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel appSlogan(String appSlogan) {
    
    this.appSlogan = appSlogan;
    return this;
  }

   /**
   * 小程序应用简介，一句话描述小程序功能，如果不填默认采用当前小程序应用简介，10~32个字符
   * @return appSlogan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序简介", value = "小程序应用简介，一句话描述小程序功能，如果不填默认采用当前小程序应用简介，10~32个字符")

  public String getAppSlogan() {
    return appSlogan;
  }


  public void setAppSlogan(String appSlogan) {
    this.appSlogan = appSlogan;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel appVersion(String appVersion) {
    
    this.appVersion = appVersion;
    return this;
  }

   /**
   * 小程序版本号
   * @return appVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0.1", value = "小程序版本号")

  public String getAppVersion() {
    return appVersion;
  }


  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel buildExt(String buildExt) {
    
    this.buildExt = buildExt;
    return this;
  }

   /**
   * 构建扩展参数
   * @return buildExt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"ext\":{\"appId\":\"2019********\",\"pid\":\"2088*******\"},\"extEnable\":true}", value = "构建扩展参数")

  public String getBuildExt() {
    return buildExt;
  }


  public void setBuildExt(String buildExt) {
    this.buildExt = buildExt;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel bundleId(String bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * 端信息
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "com.alipay.alipaywallet", value = "端信息")

  public String getBundleId() {
    return bundleId;
  }


  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel isvAppId(String isvAppId) {
    
    this.isvAppId = isvAppId;
    return this;
  }

   /**
   * 三方应用ID
   * @return isvAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018********", value = "三方应用ID")

  public String getIsvAppId() {
    return isvAppId;
  }


  public void setIsvAppId(String isvAppId) {
    this.isvAppId = isvAppId;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel licenseInfo(AuditLicenseInfo licenseInfo) {
    
    this.licenseInfo = licenseInfo;
    return this;
  }

   /**
   * Get licenseInfo
   * @return licenseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuditLicenseInfo getLicenseInfo() {
    return licenseInfo;
  }


  public void setLicenseInfo(AuditLicenseInfo licenseInfo) {
    this.licenseInfo = licenseInfo;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序ID，特殊场景专用，普通业务方无需关注该参数。
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018********", value = "小程序ID，特殊场景专用，普通业务方无需关注该参数。")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel miniCategoryIds(String miniCategoryIds) {
    
    this.miniCategoryIds = miniCategoryIds;
    return this;
  }

   /**
   * 新小程序前台类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目_第二个三级类目，详细类目可以通过 https://docs.open.alipay.com/api_49/alipay.open.mini.category.query接口查询mini_category_list，如果不填默认采用当前小程序应用类目。使用默认应用类目后不需要再次上传营业执照号、营业执照名、营业执照截图、营业执照有效期。使用后不再读取app_category_ids值，老前台类目将废弃
   * @return miniCategoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XS1001_XS2001_XS3002;XS1011_XS2089;XS1002_XS2008_XS3024", value = "新小程序前台类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目_第二个三级类目，详细类目可以通过 https://docs.open.alipay.com/api_49/alipay.open.mini.category.query接口查询mini_category_list，如果不填默认采用当前小程序应用类目。使用默认应用类目后不需要再次上传营业执照号、营业执照名、营业执照截图、营业执照有效期。使用后不再读取app_category_ids值，老前台类目将废弃")

  public String getMiniCategoryIds() {
    return miniCategoryIds;
  }


  public void setMiniCategoryIds(String miniCategoryIds) {
    this.miniCategoryIds = miniCategoryIds;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 小程序开发者ID，可不传，不传取基础信息中的小程序开发者ID
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088********", value = "小程序开发者ID，可不传，不传取基础信息中的小程序开发者ID")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel regionType(String regionType) {
    
    this.regionType = regionType;
    return this;
  }

   /**
   * 服务区域类型,可不传，不传取基础信息中的小程序服务区域类型
   * @return regionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GLOBAL", value = "服务区域类型,可不传，不传取基础信息中的小程序服务区域类型")

  public String getRegionType() {
    return regionType;
  }


  public void setRegionType(String regionType) {
    this.regionType = regionType;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel screenShotList(String screenShotList) {
    
    this.screenShotList = screenShotList;
    return this;
  }

   /**
   * 版本截图，最少2张，最多5张，必传
   * @return screenShotList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://appstoreisvpic.alipayobjects.com/prod/e2bcf04b-da46-4b7f-a020-e9d224df7689.png,https://appstoreisvpic.alipayobjects.com/prod/e2bcf04b-da46-4b7f-a020-e9d224df7689.png", value = "版本截图，最少2张，最多5张，必传")

  public String getScreenShotList() {
    return screenShotList;
  }


  public void setScreenShotList(String screenShotList) {
    this.screenShotList = screenShotList;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel servicePhone(String servicePhone) {
    
    this.servicePhone = servicePhone;
    return this;
  }

   /**
   * 客服电话，可不传，不传取基础信息中的小程序客服电话
   * @return servicePhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "021-2222222", value = "客服电话，可不传，不传取基础信息中的小程序客服电话")

  public String getServicePhone() {
    return servicePhone;
  }


  public void setServicePhone(String servicePhone) {
    this.servicePhone = servicePhone;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel specialLicensePicList(String specialLicensePicList) {
    
    this.specialLicensePicList = specialLicensePicList;
    return this;
  }

   /**
   * 特殊资质图片地址列表，逗号分割,
   * @return specialLicensePicList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://appstoreisvpic.alipayobjects.com/prod/f2e32236-b537-405b-8764-613ea50c2f6b.png,https://appstoreisvpic.alipayobjects.com/prod/f2e32236-b537-405b-8764-613ea50c2f6b.png", value = "特殊资质图片地址列表，逗号分割,")

  public String getSpecialLicensePicList() {
    return specialLicensePicList;
  }


  public void setSpecialLicensePicList(String specialLicensePicList) {
    this.specialLicensePicList = specialLicensePicList;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 小程序模板ID
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018********", value = "小程序模板ID")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel templateVersion(String templateVersion) {
    
    this.templateVersion = templateVersion;
    return this;
  }

   /**
   * 模板的版本号，如果不填写，则默认用模板当前最新的在架版本
   * @return templateVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0.0", value = "模板的版本号，如果不填写，则默认用模板当前最新的在架版本")

  public String getTemplateVersion() {
    return templateVersion;
  }


  public void setTemplateVersion(String templateVersion) {
    this.templateVersion = templateVersion;
  }


  public AlipayOpenMiniInnerversionBuildauditSubmitModel versionDesc(String versionDesc) {
    
    this.versionDesc = versionDesc;
    return this;
  }

   /**
   * 小程序版本描述，30-500个字符，一个中文占两个字符，一个英文或者数字占一个字符
   * @return versionDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "本版本新增了XXX功能，修复了XXXbug，解决了XXX问题，欢迎大家体验提出意见。", value = "小程序版本描述，30-500个字符，一个中文占两个字符，一个英文或者数字占一个字符")

  public String getVersionDesc() {
    return versionDesc;
  }


  public void setVersionDesc(String versionDesc) {
    this.versionDesc = versionDesc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniInnerversionBuildauditSubmitModel alipayOpenMiniInnerversionBuildauditSubmitModel = (AlipayOpenMiniInnerversionBuildauditSubmitModel) o;
    return Objects.equals(this.appCategoryIds, alipayOpenMiniInnerversionBuildauditSubmitModel.appCategoryIds) &&
        Objects.equals(this.appDesc, alipayOpenMiniInnerversionBuildauditSubmitModel.appDesc) &&
        Objects.equals(this.appEnglishName, alipayOpenMiniInnerversionBuildauditSubmitModel.appEnglishName) &&
        Objects.equals(this.appLogo, alipayOpenMiniInnerversionBuildauditSubmitModel.appLogo) &&
        Objects.equals(this.appName, alipayOpenMiniInnerversionBuildauditSubmitModel.appName) &&
        Objects.equals(this.appOrigin, alipayOpenMiniInnerversionBuildauditSubmitModel.appOrigin) &&
        Objects.equals(this.appSlogan, alipayOpenMiniInnerversionBuildauditSubmitModel.appSlogan) &&
        Objects.equals(this.appVersion, alipayOpenMiniInnerversionBuildauditSubmitModel.appVersion) &&
        Objects.equals(this.buildExt, alipayOpenMiniInnerversionBuildauditSubmitModel.buildExt) &&
        Objects.equals(this.bundleId, alipayOpenMiniInnerversionBuildauditSubmitModel.bundleId) &&
        Objects.equals(this.isvAppId, alipayOpenMiniInnerversionBuildauditSubmitModel.isvAppId) &&
        Objects.equals(this.licenseInfo, alipayOpenMiniInnerversionBuildauditSubmitModel.licenseInfo) &&
        Objects.equals(this.miniAppId, alipayOpenMiniInnerversionBuildauditSubmitModel.miniAppId) &&
        Objects.equals(this.miniCategoryIds, alipayOpenMiniInnerversionBuildauditSubmitModel.miniCategoryIds) &&
        Objects.equals(this.pid, alipayOpenMiniInnerversionBuildauditSubmitModel.pid) &&
        Objects.equals(this.regionType, alipayOpenMiniInnerversionBuildauditSubmitModel.regionType) &&
        Objects.equals(this.screenShotList, alipayOpenMiniInnerversionBuildauditSubmitModel.screenShotList) &&
        Objects.equals(this.servicePhone, alipayOpenMiniInnerversionBuildauditSubmitModel.servicePhone) &&
        Objects.equals(this.specialLicensePicList, alipayOpenMiniInnerversionBuildauditSubmitModel.specialLicensePicList) &&
        Objects.equals(this.templateId, alipayOpenMiniInnerversionBuildauditSubmitModel.templateId) &&
        Objects.equals(this.templateVersion, alipayOpenMiniInnerversionBuildauditSubmitModel.templateVersion) &&
        Objects.equals(this.versionDesc, alipayOpenMiniInnerversionBuildauditSubmitModel.versionDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appCategoryIds, appDesc, appEnglishName, appLogo, appName, appOrigin, appSlogan, appVersion, buildExt, bundleId, isvAppId, licenseInfo, miniAppId, miniCategoryIds, pid, regionType, screenShotList, servicePhone, specialLicensePicList, templateId, templateVersion, versionDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerversionBuildauditSubmitModel {\n");
    sb.append("    appCategoryIds: ").append(toIndentedString(appCategoryIds)).append("\n");
    sb.append("    appDesc: ").append(toIndentedString(appDesc)).append("\n");
    sb.append("    appEnglishName: ").append(toIndentedString(appEnglishName)).append("\n");
    sb.append("    appLogo: ").append(toIndentedString(appLogo)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appOrigin: ").append(toIndentedString(appOrigin)).append("\n");
    sb.append("    appSlogan: ").append(toIndentedString(appSlogan)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    buildExt: ").append(toIndentedString(buildExt)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    isvAppId: ").append(toIndentedString(isvAppId)).append("\n");
    sb.append("    licenseInfo: ").append(toIndentedString(licenseInfo)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    miniCategoryIds: ").append(toIndentedString(miniCategoryIds)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    regionType: ").append(toIndentedString(regionType)).append("\n");
    sb.append("    screenShotList: ").append(toIndentedString(screenShotList)).append("\n");
    sb.append("    servicePhone: ").append(toIndentedString(servicePhone)).append("\n");
    sb.append("    specialLicensePicList: ").append(toIndentedString(specialLicensePicList)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateVersion: ").append(toIndentedString(templateVersion)).append("\n");
    sb.append("    versionDesc: ").append(toIndentedString(versionDesc)).append("\n");
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
    openapiFields.add("app_category_ids");
    openapiFields.add("app_desc");
    openapiFields.add("app_english_name");
    openapiFields.add("app_logo");
    openapiFields.add("app_name");
    openapiFields.add("app_origin");
    openapiFields.add("app_slogan");
    openapiFields.add("app_version");
    openapiFields.add("build_ext");
    openapiFields.add("bundle_id");
    openapiFields.add("isv_app_id");
    openapiFields.add("license_info");
    openapiFields.add("mini_app_id");
    openapiFields.add("mini_category_ids");
    openapiFields.add("pid");
    openapiFields.add("region_type");
    openapiFields.add("screen_shot_list");
    openapiFields.add("service_phone");
    openapiFields.add("special_license_pic_list");
    openapiFields.add("template_id");
    openapiFields.add("template_version");
    openapiFields.add("version_desc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerversionBuildauditSubmitModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerversionBuildauditSubmitModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerversionBuildauditSubmitModel is not found in the empty JSON string", AlipayOpenMiniInnerversionBuildauditSubmitModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniInnerversionBuildauditSubmitModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniInnerversionBuildauditSubmitModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_category_ids") != null && !jsonObj.get("app_category_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_category_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_category_ids").toString()));
      }
      if (jsonObj.get("app_desc") != null && !jsonObj.get("app_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_desc").toString()));
      }
      if (jsonObj.get("app_english_name") != null && !jsonObj.get("app_english_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_english_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_english_name").toString()));
      }
      if (jsonObj.get("app_logo") != null && !jsonObj.get("app_logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_logo").toString()));
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("app_origin") != null && !jsonObj.get("app_origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_origin").toString()));
      }
      if (jsonObj.get("app_slogan") != null && !jsonObj.get("app_slogan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_slogan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_slogan").toString()));
      }
      if (jsonObj.get("app_version") != null && !jsonObj.get("app_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_version").toString()));
      }
      if (jsonObj.get("build_ext") != null && !jsonObj.get("build_ext").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build_ext` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build_ext").toString()));
      }
      if (jsonObj.get("bundle_id") != null && !jsonObj.get("bundle_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundle_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundle_id").toString()));
      }
      if (jsonObj.get("isv_app_id") != null && !jsonObj.get("isv_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_app_id").toString()));
      }
      // validate the optional field `license_info`
      if (jsonObj.getAsJsonObject("license_info") != null) {
        AuditLicenseInfo.validateJsonObject(jsonObj.getAsJsonObject("license_info"));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("mini_category_ids") != null && !jsonObj.get("mini_category_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_category_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_category_ids").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      if (jsonObj.get("region_type") != null && !jsonObj.get("region_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region_type").toString()));
      }
      if (jsonObj.get("screen_shot_list") != null && !jsonObj.get("screen_shot_list").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `screen_shot_list` to be a primitive type in the JSON string but got `%s`", jsonObj.get("screen_shot_list").toString()));
      }
      if (jsonObj.get("service_phone") != null && !jsonObj.get("service_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_phone").toString()));
      }
      if (jsonObj.get("special_license_pic_list") != null && !jsonObj.get("special_license_pic_list").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `special_license_pic_list` to be a primitive type in the JSON string but got `%s`", jsonObj.get("special_license_pic_list").toString()));
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      if (jsonObj.get("template_version") != null && !jsonObj.get("template_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_version").toString()));
      }
      if (jsonObj.get("version_desc") != null && !jsonObj.get("version_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version_desc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerversionBuildauditSubmitModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerversionBuildauditSubmitModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerversionBuildauditSubmitModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerversionBuildauditSubmitModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerversionBuildauditSubmitModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerversionBuildauditSubmitModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniInnerversionBuildauditSubmitModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniInnerversionBuildauditSubmitModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerversionBuildauditSubmitModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerversionBuildauditSubmitModel
  */
  public static AlipayOpenMiniInnerversionBuildauditSubmitModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerversionBuildauditSubmitModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerversionBuildauditSubmitModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
