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
 * CloudResumeWorkExperience
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CloudResumeWorkExperience {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_JOB_ID = "job_id";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_JOB_NAME = "job_name";
  @SerializedName(SERIALIZED_NAME_JOB_NAME)
  private String jobName;

  public static final String SERIALIZED_NAME_PROFESSION_ID = "profession_id";
  @SerializedName(SERIALIZED_NAME_PROFESSION_ID)
  private String professionId;

  public static final String SERIALIZED_NAME_PROFESSION_NAME = "profession_name";
  @SerializedName(SERIALIZED_NAME_PROFESSION_NAME)
  private String professionName;

  public static final String SERIALIZED_NAME_WORK_DESC = "work_desc";
  @SerializedName(SERIALIZED_NAME_WORK_DESC)
  private String workDesc;

  public static final String SERIALIZED_NAME_WORK_END_TIME = "work_end_time";
  @SerializedName(SERIALIZED_NAME_WORK_END_TIME)
  private Integer workEndTime;

  public static final String SERIALIZED_NAME_WORK_START_TIME = "work_start_time";
  @SerializedName(SERIALIZED_NAME_WORK_START_TIME)
  private Integer workStartTime;

  public CloudResumeWorkExperience() { 
  }

  public CloudResumeWorkExperience companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * 公司名称
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx有限公司", value = "公司名称")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public CloudResumeWorkExperience jobId(String jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * 职业id
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "职业id", value = "职业id")

  public String getJobId() {
    return jobId;
  }


  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public CloudResumeWorkExperience jobName(String jobName) {
    
    this.jobName = jobName;
    return this;
  }

   /**
   * 职业
   * @return jobName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "职业", value = "职业")

  public String getJobName() {
    return jobName;
  }


  public void setJobName(String jobName) {
    this.jobName = jobName;
  }


  public CloudResumeWorkExperience professionId(String professionId) {
    
    this.professionId = professionId;
    return this;
  }

   /**
   * 行业id
   * @return professionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "行业id", value = "行业id")

  public String getProfessionId() {
    return professionId;
  }


  public void setProfessionId(String professionId) {
    this.professionId = professionId;
  }


  public CloudResumeWorkExperience professionName(String professionName) {
    
    this.professionName = professionName;
    return this;
  }

   /**
   * 行业名称
   * @return professionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "行业名称", value = "行业名称")

  public String getProfessionName() {
    return professionName;
  }


  public void setProfessionName(String professionName) {
    this.professionName = professionName;
  }


  public CloudResumeWorkExperience workDesc(String workDesc) {
    
    this.workDesc = workDesc;
    return this;
  }

   /**
   * 工作描述
   * @return workDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "工作描述", value = "工作描述")

  public String getWorkDesc() {
    return workDesc;
  }


  public void setWorkDesc(String workDesc) {
    this.workDesc = workDesc;
  }


  public CloudResumeWorkExperience workEndTime(Integer workEndTime) {
    
    this.workEndTime = workEndTime;
    return this;
  }

   /**
   * 工作结束时间
   * @return workEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "工作结束时间")

  public Integer getWorkEndTime() {
    return workEndTime;
  }


  public void setWorkEndTime(Integer workEndTime) {
    this.workEndTime = workEndTime;
  }


  public CloudResumeWorkExperience workStartTime(Integer workStartTime) {
    
    this.workStartTime = workStartTime;
    return this;
  }

   /**
   * 工作开始日期
   * @return workStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "工作开始日期")

  public Integer getWorkStartTime() {
    return workStartTime;
  }


  public void setWorkStartTime(Integer workStartTime) {
    this.workStartTime = workStartTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudResumeWorkExperience cloudResumeWorkExperience = (CloudResumeWorkExperience) o;
    return Objects.equals(this.companyName, cloudResumeWorkExperience.companyName) &&
        Objects.equals(this.jobId, cloudResumeWorkExperience.jobId) &&
        Objects.equals(this.jobName, cloudResumeWorkExperience.jobName) &&
        Objects.equals(this.professionId, cloudResumeWorkExperience.professionId) &&
        Objects.equals(this.professionName, cloudResumeWorkExperience.professionName) &&
        Objects.equals(this.workDesc, cloudResumeWorkExperience.workDesc) &&
        Objects.equals(this.workEndTime, cloudResumeWorkExperience.workEndTime) &&
        Objects.equals(this.workStartTime, cloudResumeWorkExperience.workStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, jobId, jobName, professionId, professionName, workDesc, workEndTime, workStartTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudResumeWorkExperience {\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    professionId: ").append(toIndentedString(professionId)).append("\n");
    sb.append("    professionName: ").append(toIndentedString(professionName)).append("\n");
    sb.append("    workDesc: ").append(toIndentedString(workDesc)).append("\n");
    sb.append("    workEndTime: ").append(toIndentedString(workEndTime)).append("\n");
    sb.append("    workStartTime: ").append(toIndentedString(workStartTime)).append("\n");
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
    openapiFields.add("company_name");
    openapiFields.add("job_id");
    openapiFields.add("job_name");
    openapiFields.add("profession_id");
    openapiFields.add("profession_name");
    openapiFields.add("work_desc");
    openapiFields.add("work_end_time");
    openapiFields.add("work_start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CloudResumeWorkExperience
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CloudResumeWorkExperience.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudResumeWorkExperience is not found in the empty JSON string", CloudResumeWorkExperience.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CloudResumeWorkExperience.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudResumeWorkExperience` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("company_name") != null && !jsonObj.get("company_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_name").toString()));
      }
      if (jsonObj.get("job_id") != null && !jsonObj.get("job_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_id").toString()));
      }
      if (jsonObj.get("job_name") != null && !jsonObj.get("job_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_name").toString()));
      }
      if (jsonObj.get("profession_id") != null && !jsonObj.get("profession_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profession_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profession_id").toString()));
      }
      if (jsonObj.get("profession_name") != null && !jsonObj.get("profession_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profession_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profession_name").toString()));
      }
      if (jsonObj.get("work_desc") != null && !jsonObj.get("work_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work_desc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudResumeWorkExperience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudResumeWorkExperience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudResumeWorkExperience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudResumeWorkExperience.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudResumeWorkExperience>() {
           @Override
           public void write(JsonWriter out, CloudResumeWorkExperience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudResumeWorkExperience read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CloudResumeWorkExperience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudResumeWorkExperience
  * @throws IOException if the JSON string is invalid with respect to CloudResumeWorkExperience
  */
  public static CloudResumeWorkExperience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudResumeWorkExperience.class);
  }

 /**
  * Convert an instance of CloudResumeWorkExperience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

