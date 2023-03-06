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
import com.alipay.v3.model.EmployeeDepartmentDTO;
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
 * EmployeeInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EmployeeInfoDTO {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTIVATE = "activate";
  @SerializedName(SERIALIZED_NAME_ACTIVATE)
  private String activate;

  public static final String SERIALIZED_NAME_DEPARTMENT_LIST = "department_list";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_LIST)
  private List<EmployeeDepartmentDTO> departmentList = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_EMPLOYEE_NAME = "employee_name";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NAME)
  private String employeeName;

  public static final String SERIALIZED_NAME_EMPLOYEE_NO = "employee_no";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NO)
  private String employeeNo;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_ROLE_LIST = "role_list";
  @SerializedName(SERIALIZED_NAME_ROLE_LIST)
  private List<String> roleList = null;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public EmployeeInfoDTO() { 
  }

  public EmployeeInfoDTO activate(String activate) {
    
    this.activate = activate;
    return this;
  }

   /**
   * 是否激活，可选值：ACTIVATED-已激活；UNACTIVATED-未激活；ACTIVATING-激活中
   * @return activate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACTIVATED", value = "是否激活，可选值：ACTIVATED-已激活；UNACTIVATED-未激活；ACTIVATING-激活中")

  public String getActivate() {
    return activate;
  }


  public void setActivate(String activate) {
    this.activate = activate;
  }


  public EmployeeInfoDTO departmentList(List<EmployeeDepartmentDTO> departmentList) {
    
    this.departmentList = departmentList;
    return this;
  }

  public EmployeeInfoDTO addDepartmentListItem(EmployeeDepartmentDTO departmentListItem) {
    if (this.departmentList == null) {
      this.departmentList = new ArrayList<>();
    }
    this.departmentList.add(departmentListItem);
    return this;
  }

   /**
   * 员工所属部门列表
   * @return departmentList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "员工所属部门列表")

  public List<EmployeeDepartmentDTO> getDepartmentList() {
    return departmentList;
  }


  public void setDepartmentList(List<EmployeeDepartmentDTO> departmentList) {
    this.departmentList = departmentList;
  }


  public EmployeeInfoDTO email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 邮箱
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456@qq.com", value = "邮箱")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public EmployeeInfoDTO employeeId(String employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * 员工id
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "228420000000057942506", value = "员工id")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public EmployeeInfoDTO employeeName(String employeeName) {
    
    this.employeeName = employeeName;
    return this;
  }

   /**
   * 员工姓名
   * @return employeeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "员工姓名")

  public String getEmployeeName() {
    return employeeName;
  }


  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }


  public EmployeeInfoDTO employeeNo(String employeeNo) {
    
    this.employeeNo = employeeNo;
    return this;
  }

   /**
   * 员工工号
   * @return employeeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200818255", value = "员工工号")

  public String getEmployeeNo() {
    return employeeNo;
  }


  public void setEmployeeNo(String employeeNo) {
    this.employeeNo = employeeNo;
  }


  public EmployeeInfoDTO gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 变更时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-04-20 17:13:51", value = "变更时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public EmployeeInfoDTO gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 变更时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-04-25 17:13:51", value = "变更时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public EmployeeInfoDTO mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * 手机号码
   * @return mobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13456782345", value = "手机号码")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public EmployeeInfoDTO openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 用户id
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "用户id")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public EmployeeInfoDTO roleList(List<String> roleList) {
    
    this.roleList = roleList;
    return this;
  }

  public EmployeeInfoDTO addRoleListItem(String roleListItem) {
    if (this.roleList == null) {
      this.roleList = new ArrayList<>();
    }
    this.roleList.add(roleListItem);
    return this;
  }

   /**
   * 角色列表，可选值：USER-用户；ADMIM-管理员 SUPER_ADMIN-超级管理员
   * @return roleList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"ADMIN\",\"USER\"]", value = "角色列表，可选值：USER-用户；ADMIM-管理员 SUPER_ADMIN-超级管理员")

  public List<String> getRoleList() {
    return roleList;
  }


  public void setRoleList(List<String> roleList) {
    this.roleList = roleList;
  }


  public EmployeeInfoDTO userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 用户id
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123454654356", value = "用户id")

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
    EmployeeInfoDTO employeeInfoDTO = (EmployeeInfoDTO) o;
    return Objects.equals(this.activate, employeeInfoDTO.activate) &&
        Objects.equals(this.departmentList, employeeInfoDTO.departmentList) &&
        Objects.equals(this.email, employeeInfoDTO.email) &&
        Objects.equals(this.employeeId, employeeInfoDTO.employeeId) &&
        Objects.equals(this.employeeName, employeeInfoDTO.employeeName) &&
        Objects.equals(this.employeeNo, employeeInfoDTO.employeeNo) &&
        Objects.equals(this.gmtCreate, employeeInfoDTO.gmtCreate) &&
        Objects.equals(this.gmtModified, employeeInfoDTO.gmtModified) &&
        Objects.equals(this.mobile, employeeInfoDTO.mobile) &&
        Objects.equals(this.openId, employeeInfoDTO.openId) &&
        Objects.equals(this.roleList, employeeInfoDTO.roleList) &&
        Objects.equals(this.userId, employeeInfoDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activate, departmentList, email, employeeId, employeeName, employeeNo, gmtCreate, gmtModified, mobile, openId, roleList, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeInfoDTO {\n");
    sb.append("    activate: ").append(toIndentedString(activate)).append("\n");
    sb.append("    departmentList: ").append(toIndentedString(departmentList)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
    sb.append("    employeeNo: ").append(toIndentedString(employeeNo)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    roleList: ").append(toIndentedString(roleList)).append("\n");
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
    openapiFields.add("activate");
    openapiFields.add("department_list");
    openapiFields.add("email");
    openapiFields.add("employee_id");
    openapiFields.add("employee_name");
    openapiFields.add("employee_no");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_modified");
    openapiFields.add("mobile");
    openapiFields.add("open_id");
    openapiFields.add("role_list");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeInfoDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EmployeeInfoDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeInfoDTO is not found in the empty JSON string", EmployeeInfoDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EmployeeInfoDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmployeeInfoDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("activate") != null && !jsonObj.get("activate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activate").toString()));
      }
      JsonArray jsonArraydepartmentList = jsonObj.getAsJsonArray("department_list");
      if (jsonArraydepartmentList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("department_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `department_list` to be an array in the JSON string but got `%s`", jsonObj.get("department_list").toString()));
        }

        // validate the optional field `department_list` (array)
        for (int i = 0; i < jsonArraydepartmentList.size(); i++) {
          EmployeeDepartmentDTO.validateJsonObject(jsonArraydepartmentList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("employee_id") != null && !jsonObj.get("employee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_id").toString()));
      }
      if (jsonObj.get("employee_name") != null && !jsonObj.get("employee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_name").toString()));
      }
      if (jsonObj.get("employee_no") != null && !jsonObj.get("employee_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_no").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("role_list") != null && !jsonObj.get("role_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_list` to be an array in the JSON string but got `%s`", jsonObj.get("role_list").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeInfoDTO>() {
           @Override
           public void write(JsonWriter out, EmployeeInfoDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmployeeInfoDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EmployeeInfoDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeInfoDTO
  * @throws IOException if the JSON string is invalid with respect to EmployeeInfoDTO
  */
  public static EmployeeInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeInfoDTO.class);
  }

 /**
  * Convert an instance of EmployeeInfoDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
