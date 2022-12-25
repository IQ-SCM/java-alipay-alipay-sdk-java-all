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
import com.alipay.v3.model.InvoiceUkDTO;
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
 * AlipayEbppInvoiceApplyStatusNotifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceApplyStatusNotifyModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APPLY_ID = "apply_id";
  @SerializedName(SERIALIZED_NAME_APPLY_ID)
  private String applyId;

  public static final String SERIALIZED_NAME_APPLY_STATUS = "apply_status";
  @SerializedName(SERIALIZED_NAME_APPLY_STATUS)
  private String applyStatus;

  public static final String SERIALIZED_NAME_INVOICE_UKS = "invoice_uks";
  @SerializedName(SERIALIZED_NAME_INVOICE_UKS)
  private List<InvoiceUkDTO> invoiceUks = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public AlipayEbppInvoiceApplyStatusNotifyModel() { 
  }

  public AlipayEbppInvoiceApplyStatusNotifyModel applyId(String applyId) {
    
    this.applyId = applyId;
    return this;
  }

   /**
   * 发票申请ID，由阿里发票平台生成。字母或数字组成。 申请单的唯一标识，幂等字段。
   * @return applyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "发票申请ID，由阿里发票平台生成。字母或数字组成。 申请单的唯一标识，幂等字段。")

  public String getApplyId() {
    return applyId;
  }


  public void setApplyId(String applyId) {
    this.applyId = applyId;
  }


  public AlipayEbppInvoiceApplyStatusNotifyModel applyStatus(String applyStatus) {
    
    this.applyStatus = applyStatus;
    return this;
  }

   /**
   * 申请状态，可选值： applying: 申请中，初始状态； cancelled: 申请已取消、或商户已驳回； creating_inv: 商户已受理/开票中，待发票结果回传； inv_failed: 开票失败； inv_success: 开票成功； inv_part_success: 部分成功（拆单场景下存在。举例：发票申请拆单之后有10张票，其中有1张开票成功时，此时申请状态为inv_part_success，当10张票全部成功申请状态则为inv_success）
   * @return applyStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cancelled", value = "申请状态，可选值： applying: 申请中，初始状态； cancelled: 申请已取消、或商户已驳回； creating_inv: 商户已受理/开票中，待发票结果回传； inv_failed: 开票失败； inv_success: 开票成功； inv_part_success: 部分成功（拆单场景下存在。举例：发票申请拆单之后有10张票，其中有1张开票成功时，此时申请状态为inv_part_success，当10张票全部成功申请状态则为inv_success）")

  public String getApplyStatus() {
    return applyStatus;
  }


  public void setApplyStatus(String applyStatus) {
    this.applyStatus = applyStatus;
  }


  public AlipayEbppInvoiceApplyStatusNotifyModel invoiceUks(List<InvoiceUkDTO> invoiceUks) {
    
    this.invoiceUks = invoiceUks;
    return this;
  }

  public AlipayEbppInvoiceApplyStatusNotifyModel addInvoiceUksItem(InvoiceUkDTO invoiceUksItem) {
    if (this.invoiceUks == null) {
      this.invoiceUks = new ArrayList<>();
    }
    this.invoiceUks.add(invoiceUksItem);
    return this;
  }

   /**
   * 该申请下所有已开具成功的发票。 状态变更为 apply_status&#x3D;inv_success 时该字段必传
   * @return invoiceUks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该申请下所有已开具成功的发票。 状态变更为 apply_status=inv_success 时该字段必传")

  public List<InvoiceUkDTO> getInvoiceUks() {
    return invoiceUks;
  }


  public void setInvoiceUks(List<InvoiceUkDTO> invoiceUks) {
    this.invoiceUks = invoiceUks;
  }


  public AlipayEbppInvoiceApplyStatusNotifyModel message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 说明信息：驳回或失败原因 apply_status&#x3D;inv_failed 或 apply_status&#x3D;cancelled 时必传
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "购方信息错误", value = "说明信息：驳回或失败原因 apply_status=inv_failed 或 apply_status=cancelled 时必传")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceApplyStatusNotifyModel alipayEbppInvoiceApplyStatusNotifyModel = (AlipayEbppInvoiceApplyStatusNotifyModel) o;
    return Objects.equals(this.applyId, alipayEbppInvoiceApplyStatusNotifyModel.applyId) &&
        Objects.equals(this.applyStatus, alipayEbppInvoiceApplyStatusNotifyModel.applyStatus) &&
        Objects.equals(this.invoiceUks, alipayEbppInvoiceApplyStatusNotifyModel.invoiceUks) &&
        Objects.equals(this.message, alipayEbppInvoiceApplyStatusNotifyModel.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyId, applyStatus, invoiceUks, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceApplyStatusNotifyModel {\n");
    sb.append("    applyId: ").append(toIndentedString(applyId)).append("\n");
    sb.append("    applyStatus: ").append(toIndentedString(applyStatus)).append("\n");
    sb.append("    invoiceUks: ").append(toIndentedString(invoiceUks)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("apply_status");
    openapiFields.add("invoice_uks");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceApplyStatusNotifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceApplyStatusNotifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceApplyStatusNotifyModel is not found in the empty JSON string", AlipayEbppInvoiceApplyStatusNotifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceApplyStatusNotifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceApplyStatusNotifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("apply_id") != null && !jsonObj.get("apply_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_id").toString()));
      }
      if (jsonObj.get("apply_status") != null && !jsonObj.get("apply_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_status").toString()));
      }
      JsonArray jsonArrayinvoiceUks = jsonObj.getAsJsonArray("invoice_uks");
      if (jsonArrayinvoiceUks != null) {
        // ensure the json data is an array
        if (!jsonObj.get("invoice_uks").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `invoice_uks` to be an array in the JSON string but got `%s`", jsonObj.get("invoice_uks").toString()));
        }

        // validate the optional field `invoice_uks` (array)
        for (int i = 0; i < jsonArrayinvoiceUks.size(); i++) {
          InvoiceUkDTO.validateJsonObject(jsonArrayinvoiceUks.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceApplyStatusNotifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceApplyStatusNotifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceApplyStatusNotifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceApplyStatusNotifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceApplyStatusNotifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceApplyStatusNotifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceApplyStatusNotifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceApplyStatusNotifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceApplyStatusNotifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceApplyStatusNotifyModel
  */
  public static AlipayEbppInvoiceApplyStatusNotifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceApplyStatusNotifyModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceApplyStatusNotifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

