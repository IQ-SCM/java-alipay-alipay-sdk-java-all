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
 * InvoicePDFSynModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InvoicePDFSynModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APPLY_ID = "apply_id";
  @SerializedName(SERIALIZED_NAME_APPLY_ID)
  private String applyId;

  public static final String SERIALIZED_NAME_EXTEND_FIELDS = "extend_fields";
  @SerializedName(SERIALIZED_NAME_EXTEND_FIELDS)
  private String extendFields;

  public static final String SERIALIZED_NAME_FILE_BASE = "file_base";
  @SerializedName(SERIALIZED_NAME_FILE_BASE)
  private String fileBase;

  public static final String SERIALIZED_NAME_FILE_DOWNLOAD_TYPE = "file_download_type";
  @SerializedName(SERIALIZED_NAME_FILE_DOWNLOAD_TYPE)
  private String fileDownloadType;

  public static final String SERIALIZED_NAME_FILE_DOWNLOAD_URL = "file_download_url";
  @SerializedName(SERIALIZED_NAME_FILE_DOWNLOAD_URL)
  private String fileDownloadUrl;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_OUT_INVOICE_ID = "out_invoice_id";
  @SerializedName(SERIALIZED_NAME_OUT_INVOICE_ID)
  private String outInvoiceId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public InvoicePDFSynModel() { 
  }

  public InvoicePDFSynModel applyId(String applyId) {
    
    this.applyId = applyId;
    return this;
  }

   /**
   * 支付宝开票申请id。 当userId为空时，必填； 如果在开票过程中，是通过支付宝提交的申请到开票服务方，支付宝会带上开票申请在支付宝生成的申请id，开票服务方在回传发票的时候只需要回传这个申请id，不用获取用户的userId，支付宝可以根据申请id将发票归集到对应的用户名下
   * @return applyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016112800152005000000000239", value = "支付宝开票申请id。 当userId为空时，必填； 如果在开票过程中，是通过支付宝提交的申请到开票服务方，支付宝会带上开票申请在支付宝生成的申请id，开票服务方在回传发票的时候只需要回传这个申请id，不用获取用户的userId，支付宝可以根据申请id将发票归集到对应的用户名下")

  public String getApplyId() {
    return applyId;
  }


  public void setApplyId(String applyId) {
    this.applyId = applyId;
  }


  public InvoicePDFSynModel extendFields(String extendFields) {
    
    this.extendFields = extendFields;
    return this;
  }

   /**
   * 预留的扩展字段，格式如：key1&#x3D;value1\\nkey2&#x3D;value2\\nkey3&#x3D;value3，字段之间以\\n(换行符)分隔。
   * @return extendFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "m_invoice_detail_url=http://127.0.0.1:8080/invoice/detail.action?fpdm= 1234567&fphm=123456", value = "预留的扩展字段，格式如：key1=value1\\nkey2=value2\\nkey3=value3，字段之间以\\n(换行符)分隔。")

  public String getExtendFields() {
    return extendFields;
  }


  public void setExtendFields(String extendFields) {
    this.extendFields = extendFields;
  }


  public InvoicePDFSynModel fileBase(String fileBase) {
    
    this.fileBase = fileBase;
    return this;
  }

   /**
   * base64化的字符串
   * @return fileBase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5LqR5YyW56iO5o6nDQoNCjIuMjjnur/kuIrlj6/llK7ljZYNCg0KVzHvvJrlrozmiJDnlJ/kuqflj5H", value = "base64化的字符串")

  public String getFileBase() {
    return fileBase;
  }


  public void setFileBase(String fileBase) {
    this.fileBase = fileBase;
  }


  public InvoicePDFSynModel fileDownloadType(String fileDownloadType) {
    
    this.fileDownloadType = fileDownloadType;
    return this;
  }

   /**
   * PDF类型文件填写PDF， OFD类型文件填写ofd， JPG类型文件填写JPG(JPG文件请先询问对接人当前是否支持)
   * @return fileDownloadType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PDF", value = "PDF类型文件填写PDF， OFD类型文件填写ofd， JPG类型文件填写JPG(JPG文件请先询问对接人当前是否支持)")

  public String getFileDownloadType() {
    return fileDownloadType;
  }


  public void setFileDownloadType(String fileDownloadType) {
    this.fileDownloadType = fileDownloadType;
  }


  public InvoicePDFSynModel fileDownloadUrl(String fileDownloadUrl) {
    
    this.fileDownloadUrl = fileDownloadUrl;
    return this;
  }

   /**
   * 发票文件下载地址。
   * @return fileDownloadUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://img.hadalo.com/aa/kq/ddhrtdefgxKVXXXXa6apXXXXXXXXXX.pdf", value = "发票文件下载地址。")

  public String getFileDownloadUrl() {
    return fileDownloadUrl;
  }


  public void setFileDownloadUrl(String fileDownloadUrl) {
    this.fileDownloadUrl = fileDownloadUrl;
  }


  public InvoicePDFSynModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 支付宝用户id，当apply_id为空时，open_id必填
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝用户id，当apply_id为空时，open_id必填")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public InvoicePDFSynModel outInvoiceId(String outInvoiceId) {
    
    this.outInvoiceId = outInvoiceId;
    return this;
  }

   /**
   * 外部ISV的唯一发票标识
   * @return outInvoiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088100022223333", value = "外部ISV的唯一发票标识")

  public String getOutInvoiceId() {
    return outInvoiceId;
  }


  public void setOutInvoiceId(String outInvoiceId) {
    this.outInvoiceId = outInvoiceId;
  }


  public InvoicePDFSynModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 支付宝用户userId； 当apply_id为空时，userId必填
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088399922382233", value = "支付宝用户userId； 当apply_id为空时，userId必填")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public InvoicePDFSynModel zip(String zip) {
    
    this.zip = zip;
    return this;
  }

   /**
   * 压缩方式
   * @return zip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "zip", value = "压缩方式")

  public String getZip() {
    return zip;
  }


  public void setZip(String zip) {
    this.zip = zip;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicePDFSynModel invoicePDFSynModel = (InvoicePDFSynModel) o;
    return Objects.equals(this.applyId, invoicePDFSynModel.applyId) &&
        Objects.equals(this.extendFields, invoicePDFSynModel.extendFields) &&
        Objects.equals(this.fileBase, invoicePDFSynModel.fileBase) &&
        Objects.equals(this.fileDownloadType, invoicePDFSynModel.fileDownloadType) &&
        Objects.equals(this.fileDownloadUrl, invoicePDFSynModel.fileDownloadUrl) &&
        Objects.equals(this.openId, invoicePDFSynModel.openId) &&
        Objects.equals(this.outInvoiceId, invoicePDFSynModel.outInvoiceId) &&
        Objects.equals(this.userId, invoicePDFSynModel.userId) &&
        Objects.equals(this.zip, invoicePDFSynModel.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyId, extendFields, fileBase, fileDownloadType, fileDownloadUrl, openId, outInvoiceId, userId, zip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicePDFSynModel {\n");
    sb.append("    applyId: ").append(toIndentedString(applyId)).append("\n");
    sb.append("    extendFields: ").append(toIndentedString(extendFields)).append("\n");
    sb.append("    fileBase: ").append(toIndentedString(fileBase)).append("\n");
    sb.append("    fileDownloadType: ").append(toIndentedString(fileDownloadType)).append("\n");
    sb.append("    fileDownloadUrl: ").append(toIndentedString(fileDownloadUrl)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    outInvoiceId: ").append(toIndentedString(outInvoiceId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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
    openapiFields.add("apply_id");
    openapiFields.add("extend_fields");
    openapiFields.add("file_base");
    openapiFields.add("file_download_type");
    openapiFields.add("file_download_url");
    openapiFields.add("open_id");
    openapiFields.add("out_invoice_id");
    openapiFields.add("user_id");
    openapiFields.add("zip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoicePDFSynModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InvoicePDFSynModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoicePDFSynModel is not found in the empty JSON string", InvoicePDFSynModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InvoicePDFSynModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoicePDFSynModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("apply_id") != null && !jsonObj.get("apply_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_id").toString()));
      }
      if (jsonObj.get("extend_fields") != null && !jsonObj.get("extend_fields").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_fields` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend_fields").toString()));
      }
      if (jsonObj.get("file_base") != null && !jsonObj.get("file_base").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_base` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_base").toString()));
      }
      if (jsonObj.get("file_download_type") != null && !jsonObj.get("file_download_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_download_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_download_type").toString()));
      }
      if (jsonObj.get("file_download_url") != null && !jsonObj.get("file_download_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_download_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_download_url").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("out_invoice_id") != null && !jsonObj.get("out_invoice_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_invoice_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_invoice_id").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if (jsonObj.get("zip") != null && !jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoicePDFSynModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoicePDFSynModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoicePDFSynModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoicePDFSynModel.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoicePDFSynModel>() {
           @Override
           public void write(JsonWriter out, InvoicePDFSynModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoicePDFSynModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoicePDFSynModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoicePDFSynModel
  * @throws IOException if the JSON string is invalid with respect to InvoicePDFSynModel
  */
  public static InvoicePDFSynModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoicePDFSynModel.class);
  }

 /**
  * Convert an instance of InvoicePDFSynModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
