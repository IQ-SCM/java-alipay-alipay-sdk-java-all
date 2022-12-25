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
 * JobWorthPositionInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JobWorthPositionInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private String age;

  public static final String SERIALIZED_NAME_BENEFIT = "benefit";
  @SerializedName(SERIALIZED_NAME_BENEFIT)
  private String benefit;

  public static final String SERIALIZED_NAME_CERTIFICATIONS = "certifications";
  @SerializedName(SERIALIZED_NAME_CERTIFICATIONS)
  private String certifications;

  public static final String SERIALIZED_NAME_COMPANY_CERTIFICATE = "company_certificate";
  @SerializedName(SERIALIZED_NAME_COMPANY_CERTIFICATE)
  private String companyCertificate;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_EDUCATION = "education";
  @SerializedName(SERIALIZED_NAME_EDUCATION)
  private String education;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_KA_POSITION_ID = "ka_position_id";
  @SerializedName(SERIALIZED_NAME_KA_POSITION_ID)
  private String kaPositionId;

  public static final String SERIALIZED_NAME_POSITION_DESC = "position_desc";
  @SerializedName(SERIALIZED_NAME_POSITION_DESC)
  private String positionDesc;

  public static final String SERIALIZED_NAME_POSITION_ID = "position_id";
  @SerializedName(SERIALIZED_NAME_POSITION_ID)
  private String positionId;

  public static final String SERIALIZED_NAME_POSITION_JOB_ID = "position_job_id";
  @SerializedName(SERIALIZED_NAME_POSITION_JOB_ID)
  private String positionJobId;

  public static final String SERIALIZED_NAME_POSITION_JOB_NAME = "position_job_name";
  @SerializedName(SERIALIZED_NAME_POSITION_JOB_NAME)
  private String positionJobName;

  public static final String SERIALIZED_NAME_POSITION_PROFESSION_ID = "position_profession_id";
  @SerializedName(SERIALIZED_NAME_POSITION_PROFESSION_ID)
  private String positionProfessionId;

  public static final String SERIALIZED_NAME_POSITION_PROPERTY = "position_property";
  @SerializedName(SERIALIZED_NAME_POSITION_PROPERTY)
  private String positionProperty;

  public static final String SERIALIZED_NAME_POSITION_STATUS = "position_status";
  @SerializedName(SERIALIZED_NAME_POSITION_STATUS)
  private String positionStatus;

  public static final String SERIALIZED_NAME_POSITION_TITLE = "position_title";
  @SerializedName(SERIALIZED_NAME_POSITION_TITLE)
  private String positionTitle;

  public static final String SERIALIZED_NAME_SALARY_MAX = "salary_max";
  @SerializedName(SERIALIZED_NAME_SALARY_MAX)
  private String salaryMax;

  public static final String SERIALIZED_NAME_SALARY_MIN = "salary_min";
  @SerializedName(SERIALIZED_NAME_SALARY_MIN)
  private String salaryMin;

  public static final String SERIALIZED_NAME_SALARY_TYPE = "salary_type";
  @SerializedName(SERIALIZED_NAME_SALARY_TYPE)
  private String salaryType;

  public static final String SERIALIZED_NAME_SALARY_UNIT = "salary_unit";
  @SerializedName(SERIALIZED_NAME_SALARY_UNIT)
  private String salaryUnit;

  public static final String SERIALIZED_NAME_SKILL_TAG = "skill_tag";
  @SerializedName(SERIALIZED_NAME_SKILL_TAG)
  private String skillTag;

  public static final String SERIALIZED_NAME_SKIP_URL = "skip_url";
  @SerializedName(SERIALIZED_NAME_SKIP_URL)
  private String skipUrl;

  public static final String SERIALIZED_NAME_WORK_CITY = "work_city";
  @SerializedName(SERIALIZED_NAME_WORK_CITY)
  private String workCity;

  public static final String SERIALIZED_NAME_WORK_LONGITUDE = "work_longitude";
  @SerializedName(SERIALIZED_NAME_WORK_LONGITUDE)
  private String workLongitude;

  public static final String SERIALIZED_NAME_WORK_REGION = "work_region";
  @SerializedName(SERIALIZED_NAME_WORK_REGION)
  private String workRegion;

  public static final String SERIALIZED_NAME_WORK_YEAR = "work_year";
  @SerializedName(SERIALIZED_NAME_WORK_YEAR)
  private String workYear;

  public JobWorthPositionInfo() { 
  }

  public JobWorthPositionInfo age(String age) {
    
    this.age = age;
    return this;
  }

   /**
   * 职位要求-年龄要求 无要求（不传）、28岁以上(OVER28)、40岁以下(BELOW40)、25岁～35岁(25TO35)
   * @return age
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OVER28", value = "职位要求-年龄要求 无要求（不传）、28岁以上(OVER28)、40岁以下(BELOW40)、25岁～35岁(25TO35)")

  public String getAge() {
    return age;
  }


  public void setAge(String age) {
    this.age = age;
  }


  public JobWorthPositionInfo benefit(String benefit) {
    
    this.benefit = benefit;
    return this;
  }

   /**
   * 福利，现有标签，最多5个标签，使用英文,分割
   * @return benefit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "五险一金,双休", value = "福利，现有标签，最多5个标签，使用英文,分割")

  public String getBenefit() {
    return benefit;
  }


  public void setBenefit(String benefit) {
    this.benefit = benefit;
  }


  public JobWorthPositionInfo certifications(String certifications) {
    
    this.certifications = certifications;
    return this;
  }

   /**
   * 技能、证书等要求，比如学历、健康证、普通话或其他技能证书等,参考https://www.yuque.com/wx3dkp/gwckr4/bs03t3
   * @return certifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "特种工作证,健康证", value = "技能、证书等要求，比如学历、健康证、普通话或其他技能证书等,参考https://www.yuque.com/wx3dkp/gwckr4/bs03t3")

  public String getCertifications() {
    return certifications;
  }


  public void setCertifications(String certifications) {
    this.certifications = certifications;
  }


  public JobWorthPositionInfo companyCertificate(String companyCertificate) {
    
    this.companyCertificate = companyCertificate;
    return this;
  }

   /**
   * 发布企业统一社会信用代码
   * @return companyCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "91330200750364874C", value = "发布企业统一社会信用代码")

  public String getCompanyCertificate() {
    return companyCertificate;
  }


  public void setCompanyCertificate(String companyCertificate) {
    this.companyCertificate = companyCertificate;
  }


  public JobWorthPositionInfo companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * 企业工商全称
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州希德利餐饮管理有限公司", value = "企业工商全称")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public JobWorthPositionInfo count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * 招聘人数
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "招聘人数")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public JobWorthPositionInfo education(String education) {
    
    this.education = education;
    return this;
  }

   /**
   * 学历要求,HIGHSCHOOL_AND_BELOW（高中及以下），POLYTECHNIC（中专），COLLEGE（大专），BACHELOR（本科），MASTER（硕士），DOCTOR_AND_ABOVE（博士及以上）
   * @return education
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BACHELOR", value = "学历要求,HIGHSCHOOL_AND_BELOW（高中及以下），POLYTECHNIC（中专），COLLEGE（大专），BACHELOR（本科），MASTER（硕士），DOCTOR_AND_ABOVE（博士及以上）")

  public String getEducation() {
    return education;
  }


  public void setEducation(String education) {
    this.education = education;
  }


  public JobWorthPositionInfo gender(String gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * 无要求（不传）、男或者女
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "男", value = "无要求（不传）、男或者女")

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }


  public JobWorthPositionInfo kaPositionId(String kaPositionId) {
    
    this.kaPositionId = kaPositionId;
    return this;
  }

   /**
   * 合作方jobId
   * @return kaPositionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20881234567", value = "合作方jobId")

  public String getKaPositionId() {
    return kaPositionId;
  }


  public void setKaPositionId(String kaPositionId) {
    this.kaPositionId = kaPositionId;
  }


  public JobWorthPositionInfo positionDesc(String positionDesc) {
    
    this.positionDesc = positionDesc;
    return this;
  }

   /**
   * 长文本描述
   * @return positionDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "职位描述", value = "长文本描述")

  public String getPositionDesc() {
    return positionDesc;
  }


  public void setPositionDesc(String positionDesc) {
    this.positionDesc = positionDesc;
  }


  public JobWorthPositionInfo positionId(String positionId) {
    
    this.positionId = positionId;
    return this;
  }

   /**
   * 工作证岗位库的职位主键，只有更新职位信息时需要传入
   * @return positionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456789012345678901234", value = "工作证岗位库的职位主键，只有更新职位信息时需要传入")

  public String getPositionId() {
    return positionId;
  }


  public void setPositionId(String positionId) {
    this.positionId = positionId;
  }


  public JobWorthPositionInfo positionJobId(String positionJobId) {
    
    this.positionJobId = positionJobId;
    return this;
  }

   /**
   * 岗位对应的行业id，字段参考https://www.yuque.com/wx3dkp/gwckr4/bs03t3
   * @return positionJobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5378A2C2001", value = "岗位对应的行业id，字段参考https://www.yuque.com/wx3dkp/gwckr4/bs03t3")

  public String getPositionJobId() {
    return positionJobId;
  }


  public void setPositionJobId(String positionJobId) {
    this.positionJobId = positionJobId;
  }


  public JobWorthPositionInfo positionJobName(String positionJobName) {
    
    this.positionJobName = positionJobName;
    return this;
  }

   /**
   * 岗位对应的职业名称
   * @return positionJobName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "服务端开发工程师", value = "岗位对应的职业名称")

  public String getPositionJobName() {
    return positionJobName;
  }


  public void setPositionJobName(String positionJobName) {
    this.positionJobName = positionJobName;
  }


  public JobWorthPositionInfo positionProfessionId(String positionProfessionId) {
    
    this.positionProfessionId = positionProfessionId;
    return this;
  }

   /**
   * 岗位对应的职业id，字段参考https://www.yuque.com/wx3dkp/gwckr4/bs03t3
   * @return positionProfessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5278A2C2", value = "岗位对应的职业id，字段参考https://www.yuque.com/wx3dkp/gwckr4/bs03t3")

  public String getPositionProfessionId() {
    return positionProfessionId;
  }


  public void setPositionProfessionId(String positionProfessionId) {
    this.positionProfessionId = positionProfessionId;
  }


  public JobWorthPositionInfo positionProperty(String positionProperty) {
    
    this.positionProperty = positionProperty;
    return this;
  }

   /**
   * 岗位属性：全职(FULL_TIME)或者兼职(PART_TIME)
   * @return positionProperty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FULL_TIME", value = "岗位属性：全职(FULL_TIME)或者兼职(PART_TIME)")

  public String getPositionProperty() {
    return positionProperty;
  }


  public void setPositionProperty(String positionProperty) {
    this.positionProperty = positionProperty;
  }


  public JobWorthPositionInfo positionStatus(String positionStatus) {
    
    this.positionStatus = positionStatus;
    return this;
  }

   /**
   * 职位的状态，只有上架(UNCHECK)和下架(OFFLINE)两种
   * @return positionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UNCHECK", value = "职位的状态，只有上架(UNCHECK)和下架(OFFLINE)两种")

  public String getPositionStatus() {
    return positionStatus;
  }


  public void setPositionStatus(String positionStatus) {
    this.positionStatus = positionStatus;
  }


  public JobWorthPositionInfo positionTitle(String positionTitle) {
    
    this.positionTitle = positionTitle;
    return this;
  }

   /**
   * 短文本描述
   * @return positionTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "日结洗碗工", value = "短文本描述")

  public String getPositionTitle() {
    return positionTitle;
  }


  public void setPositionTitle(String positionTitle) {
    this.positionTitle = positionTitle;
  }


  public JobWorthPositionInfo salaryMax(String salaryMax) {
    
    this.salaryMax = salaryMax;
    return this;
  }

   /**
   * 薪水范围，不能低于salary_min
   * @return salaryMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3000", value = "薪水范围，不能低于salary_min")

  public String getSalaryMax() {
    return salaryMax;
  }


  public void setSalaryMax(String salaryMax) {
    this.salaryMax = salaryMax;
  }


  public JobWorthPositionInfo salaryMin(String salaryMin) {
    
    this.salaryMin = salaryMin;
    return this;
  }

   /**
   * 薪水范围，不能高于salary_max
   * @return salaryMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000", value = "薪水范围，不能高于salary_max")

  public String getSalaryMin() {
    return salaryMin;
  }


  public void setSalaryMin(String salaryMin) {
    this.salaryMin = salaryMin;
  }


  public JobWorthPositionInfo salaryType(String salaryType) {
    
    this.salaryType = salaryType;
    return this;
  }

   /**
   * 薪资类型：日结(DAY)、月结(MONTH)、周结(WEEK)、完工结(DONE)、其他(OTHER)
   * @return salaryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DAY", value = "薪资类型：日结(DAY)、月结(MONTH)、周结(WEEK)、完工结(DONE)、其他(OTHER)")

  public String getSalaryType() {
    return salaryType;
  }


  public void setSalaryType(String salaryType) {
    this.salaryType = salaryType;
  }


  public JobWorthPositionInfo salaryUnit(String salaryUnit) {
    
    this.salaryUnit = salaryUnit;
    return this;
  }

   /**
   * 薪资单位，元/日(DAY)、元/次(TIME)、元/月(MONTH)、元/小时(HOUR)、元/件 (NUM)、元/周 (WEEK)、其他 (OTHER)
   * @return salaryUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DAY", value = "薪资单位，元/日(DAY)、元/次(TIME)、元/月(MONTH)、元/小时(HOUR)、元/件 (NUM)、元/周 (WEEK)、其他 (OTHER)")

  public String getSalaryUnit() {
    return salaryUnit;
  }


  public void setSalaryUnit(String salaryUnit) {
    this.salaryUnit = salaryUnit;
  }


  public JobWorthPositionInfo skillTag(String skillTag) {
    
    this.skillTag = skillTag;
    return this;
  }

   /**
   * 岗位需要的技能标签，最多5个，使用英文逗号分割
   * @return skillTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "java,linux", value = "岗位需要的技能标签，最多5个，使用英文逗号分割")

  public String getSkillTag() {
    return skillTag;
  }


  public void setSkillTag(String skillTag) {
    this.skillTag = skillTag;
  }


  public JobWorthPositionInfo skipUrl(String skipUrl) {
    
    this.skipUrl = skipUrl;
    return this;
  }

   /**
   * 职位跳转链接，当前只支持支付宝小程序，也就是alipays://platformapi/ 开头
   * @return skipUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://platformapi/startapp?", value = "职位跳转链接，当前只支持支付宝小程序，也就是alipays://platformapi/ 开头")

  public String getSkipUrl() {
    return skipUrl;
  }


  public void setSkipUrl(String skipUrl) {
    this.skipUrl = skipUrl;
  }


  public JobWorthPositionInfo workCity(String workCity) {
    
    this.workCity = workCity;
    return this;
  }

   /**
   * 高德city code，例：北京010，线上工作9999
   * @return workCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "010", value = "高德city code，例：北京010，线上工作9999")

  public String getWorkCity() {
    return workCity;
  }


  public void setWorkCity(String workCity) {
    this.workCity = workCity;
  }


  public JobWorthPositionInfo workLongitude(String workLongitude) {
    
    this.workLongitude = workLongitude;
    return this;
  }

   /**
   * 经纬度，前面是经度，后面是纬度，使用英文逗号隔开
   * @return workLongitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "116.396574,39.992706", value = "经纬度，前面是经度，后面是纬度，使用英文逗号隔开")

  public String getWorkLongitude() {
    return workLongitude;
  }


  public void setWorkLongitude(String workLongitude) {
    this.workLongitude = workLongitude;
  }


  public JobWorthPositionInfo workRegion(String workRegion) {
    
    this.workRegion = workRegion;
    return this;
  }

   /**
   * 工作地所在的区县,使用高德的adcode，例：朝阳区110105
   * @return workRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "110105", value = "工作地所在的区县,使用高德的adcode，例：朝阳区110105")

  public String getWorkRegion() {
    return workRegion;
  }


  public void setWorkRegion(String workRegion) {
    this.workRegion = workRegion;
  }


  public JobWorthPositionInfo workYear(String workYear) {
    
    this.workYear = workYear;
    return this;
  }

   /**
   * 工作年限，1年以下（ONE）、1～3年（THREE）、3～5年（FIVE）、5～10年（TEN）、10年以上（OVER_TEN）
   * @return workYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TEN", value = "工作年限，1年以下（ONE）、1～3年（THREE）、3～5年（FIVE）、5～10年（TEN）、10年以上（OVER_TEN）")

  public String getWorkYear() {
    return workYear;
  }


  public void setWorkYear(String workYear) {
    this.workYear = workYear;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobWorthPositionInfo jobWorthPositionInfo = (JobWorthPositionInfo) o;
    return Objects.equals(this.age, jobWorthPositionInfo.age) &&
        Objects.equals(this.benefit, jobWorthPositionInfo.benefit) &&
        Objects.equals(this.certifications, jobWorthPositionInfo.certifications) &&
        Objects.equals(this.companyCertificate, jobWorthPositionInfo.companyCertificate) &&
        Objects.equals(this.companyName, jobWorthPositionInfo.companyName) &&
        Objects.equals(this.count, jobWorthPositionInfo.count) &&
        Objects.equals(this.education, jobWorthPositionInfo.education) &&
        Objects.equals(this.gender, jobWorthPositionInfo.gender) &&
        Objects.equals(this.kaPositionId, jobWorthPositionInfo.kaPositionId) &&
        Objects.equals(this.positionDesc, jobWorthPositionInfo.positionDesc) &&
        Objects.equals(this.positionId, jobWorthPositionInfo.positionId) &&
        Objects.equals(this.positionJobId, jobWorthPositionInfo.positionJobId) &&
        Objects.equals(this.positionJobName, jobWorthPositionInfo.positionJobName) &&
        Objects.equals(this.positionProfessionId, jobWorthPositionInfo.positionProfessionId) &&
        Objects.equals(this.positionProperty, jobWorthPositionInfo.positionProperty) &&
        Objects.equals(this.positionStatus, jobWorthPositionInfo.positionStatus) &&
        Objects.equals(this.positionTitle, jobWorthPositionInfo.positionTitle) &&
        Objects.equals(this.salaryMax, jobWorthPositionInfo.salaryMax) &&
        Objects.equals(this.salaryMin, jobWorthPositionInfo.salaryMin) &&
        Objects.equals(this.salaryType, jobWorthPositionInfo.salaryType) &&
        Objects.equals(this.salaryUnit, jobWorthPositionInfo.salaryUnit) &&
        Objects.equals(this.skillTag, jobWorthPositionInfo.skillTag) &&
        Objects.equals(this.skipUrl, jobWorthPositionInfo.skipUrl) &&
        Objects.equals(this.workCity, jobWorthPositionInfo.workCity) &&
        Objects.equals(this.workLongitude, jobWorthPositionInfo.workLongitude) &&
        Objects.equals(this.workRegion, jobWorthPositionInfo.workRegion) &&
        Objects.equals(this.workYear, jobWorthPositionInfo.workYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, benefit, certifications, companyCertificate, companyName, count, education, gender, kaPositionId, positionDesc, positionId, positionJobId, positionJobName, positionProfessionId, positionProperty, positionStatus, positionTitle, salaryMax, salaryMin, salaryType, salaryUnit, skillTag, skipUrl, workCity, workLongitude, workRegion, workYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobWorthPositionInfo {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    benefit: ").append(toIndentedString(benefit)).append("\n");
    sb.append("    certifications: ").append(toIndentedString(certifications)).append("\n");
    sb.append("    companyCertificate: ").append(toIndentedString(companyCertificate)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    kaPositionId: ").append(toIndentedString(kaPositionId)).append("\n");
    sb.append("    positionDesc: ").append(toIndentedString(positionDesc)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    positionJobId: ").append(toIndentedString(positionJobId)).append("\n");
    sb.append("    positionJobName: ").append(toIndentedString(positionJobName)).append("\n");
    sb.append("    positionProfessionId: ").append(toIndentedString(positionProfessionId)).append("\n");
    sb.append("    positionProperty: ").append(toIndentedString(positionProperty)).append("\n");
    sb.append("    positionStatus: ").append(toIndentedString(positionStatus)).append("\n");
    sb.append("    positionTitle: ").append(toIndentedString(positionTitle)).append("\n");
    sb.append("    salaryMax: ").append(toIndentedString(salaryMax)).append("\n");
    sb.append("    salaryMin: ").append(toIndentedString(salaryMin)).append("\n");
    sb.append("    salaryType: ").append(toIndentedString(salaryType)).append("\n");
    sb.append("    salaryUnit: ").append(toIndentedString(salaryUnit)).append("\n");
    sb.append("    skillTag: ").append(toIndentedString(skillTag)).append("\n");
    sb.append("    skipUrl: ").append(toIndentedString(skipUrl)).append("\n");
    sb.append("    workCity: ").append(toIndentedString(workCity)).append("\n");
    sb.append("    workLongitude: ").append(toIndentedString(workLongitude)).append("\n");
    sb.append("    workRegion: ").append(toIndentedString(workRegion)).append("\n");
    sb.append("    workYear: ").append(toIndentedString(workYear)).append("\n");
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
    openapiFields.add("age");
    openapiFields.add("benefit");
    openapiFields.add("certifications");
    openapiFields.add("company_certificate");
    openapiFields.add("company_name");
    openapiFields.add("count");
    openapiFields.add("education");
    openapiFields.add("gender");
    openapiFields.add("ka_position_id");
    openapiFields.add("position_desc");
    openapiFields.add("position_id");
    openapiFields.add("position_job_id");
    openapiFields.add("position_job_name");
    openapiFields.add("position_profession_id");
    openapiFields.add("position_property");
    openapiFields.add("position_status");
    openapiFields.add("position_title");
    openapiFields.add("salary_max");
    openapiFields.add("salary_min");
    openapiFields.add("salary_type");
    openapiFields.add("salary_unit");
    openapiFields.add("skill_tag");
    openapiFields.add("skip_url");
    openapiFields.add("work_city");
    openapiFields.add("work_longitude");
    openapiFields.add("work_region");
    openapiFields.add("work_year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobWorthPositionInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JobWorthPositionInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobWorthPositionInfo is not found in the empty JSON string", JobWorthPositionInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JobWorthPositionInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobWorthPositionInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("age") != null && !jsonObj.get("age").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `age` to be a primitive type in the JSON string but got `%s`", jsonObj.get("age").toString()));
      }
      if (jsonObj.get("benefit") != null && !jsonObj.get("benefit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefit").toString()));
      }
      if (jsonObj.get("certifications") != null && !jsonObj.get("certifications").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certifications` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certifications").toString()));
      }
      if (jsonObj.get("company_certificate") != null && !jsonObj.get("company_certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_certificate").toString()));
      }
      if (jsonObj.get("company_name") != null && !jsonObj.get("company_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_name").toString()));
      }
      if (jsonObj.get("education") != null && !jsonObj.get("education").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `education` to be a primitive type in the JSON string but got `%s`", jsonObj.get("education").toString()));
      }
      if (jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if (jsonObj.get("ka_position_id") != null && !jsonObj.get("ka_position_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ka_position_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ka_position_id").toString()));
      }
      if (jsonObj.get("position_desc") != null && !jsonObj.get("position_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position_desc").toString()));
      }
      if (jsonObj.get("position_id") != null && !jsonObj.get("position_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position_id").toString()));
      }
      if (jsonObj.get("position_job_id") != null && !jsonObj.get("position_job_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position_job_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position_job_id").toString()));
      }
      if (jsonObj.get("position_job_name") != null && !jsonObj.get("position_job_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position_job_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position_job_name").toString()));
      }
      if (jsonObj.get("position_profession_id") != null && !jsonObj.get("position_profession_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position_profession_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position_profession_id").toString()));
      }
      if (jsonObj.get("position_property") != null && !jsonObj.get("position_property").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position_property` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position_property").toString()));
      }
      if (jsonObj.get("position_status") != null && !jsonObj.get("position_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position_status").toString()));
      }
      if (jsonObj.get("position_title") != null && !jsonObj.get("position_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position_title").toString()));
      }
      if (jsonObj.get("salary_max") != null && !jsonObj.get("salary_max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salary_max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salary_max").toString()));
      }
      if (jsonObj.get("salary_min") != null && !jsonObj.get("salary_min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salary_min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salary_min").toString()));
      }
      if (jsonObj.get("salary_type") != null && !jsonObj.get("salary_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salary_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salary_type").toString()));
      }
      if (jsonObj.get("salary_unit") != null && !jsonObj.get("salary_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salary_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salary_unit").toString()));
      }
      if (jsonObj.get("skill_tag") != null && !jsonObj.get("skill_tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skill_tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skill_tag").toString()));
      }
      if (jsonObj.get("skip_url") != null && !jsonObj.get("skip_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skip_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skip_url").toString()));
      }
      if (jsonObj.get("work_city") != null && !jsonObj.get("work_city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work_city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work_city").toString()));
      }
      if (jsonObj.get("work_longitude") != null && !jsonObj.get("work_longitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work_longitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work_longitude").toString()));
      }
      if (jsonObj.get("work_region") != null && !jsonObj.get("work_region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work_region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work_region").toString()));
      }
      if (jsonObj.get("work_year") != null && !jsonObj.get("work_year").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work_year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work_year").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobWorthPositionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobWorthPositionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobWorthPositionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobWorthPositionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<JobWorthPositionInfo>() {
           @Override
           public void write(JsonWriter out, JobWorthPositionInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobWorthPositionInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobWorthPositionInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobWorthPositionInfo
  * @throws IOException if the JSON string is invalid with respect to JobWorthPositionInfo
  */
  public static JobWorthPositionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobWorthPositionInfo.class);
  }

 /**
  * Convert an instance of JobWorthPositionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

