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
import com.alipay.v3.model.IsvExpandOpporDTO;
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
 * AlipayOpenSpOpporPageQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSpOpporPageQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CURRENT_PAGE = "current_page";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private Integer currentPage;

  public static final String SERIALIZED_NAME_OPPOR_LIST = "oppor_list";
  @SerializedName(SERIALIZED_NAME_OPPOR_LIST)
  private List<IsvExpandOpporDTO> opporList = null;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "total_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private Integer totalSize;

  public AlipayOpenSpOpporPageQueryResponseModel() { 
  }

  public AlipayOpenSpOpporPageQueryResponseModel currentPage(Integer currentPage) {
    
    this.currentPage = currentPage;
    return this;
  }

   /**
   * 当前页码
   * @return currentPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前页码")

  public Integer getCurrentPage() {
    return currentPage;
  }


  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }


  public AlipayOpenSpOpporPageQueryResponseModel opporList(List<IsvExpandOpporDTO> opporList) {
    
    this.opporList = opporList;
    return this;
  }

  public AlipayOpenSpOpporPageQueryResponseModel addOpporListItem(IsvExpandOpporDTO opporListItem) {
    if (this.opporList == null) {
      this.opporList = new ArrayList<>();
    }
    this.opporList.add(opporListItem);
    return this;
  }

   /**
   * 商机作业记录列表
   * @return opporList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商机作业记录列表")

  public List<IsvExpandOpporDTO> getOpporList() {
    return opporList;
  }


  public void setOpporList(List<IsvExpandOpporDTO> opporList) {
    this.opporList = opporList;
  }


  public AlipayOpenSpOpporPageQueryResponseModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页数量
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "每页数量")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayOpenSpOpporPageQueryResponseModel totalSize(Integer totalSize) {
    
    this.totalSize = totalSize;
    return this;
  }

   /**
   * 总记录数
   * @return totalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "总记录数")

  public Integer getTotalSize() {
    return totalSize;
  }


  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSpOpporPageQueryResponseModel alipayOpenSpOpporPageQueryResponseModel = (AlipayOpenSpOpporPageQueryResponseModel) o;
    return Objects.equals(this.currentPage, alipayOpenSpOpporPageQueryResponseModel.currentPage) &&
        Objects.equals(this.opporList, alipayOpenSpOpporPageQueryResponseModel.opporList) &&
        Objects.equals(this.pageSize, alipayOpenSpOpporPageQueryResponseModel.pageSize) &&
        Objects.equals(this.totalSize, alipayOpenSpOpporPageQueryResponseModel.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, opporList, pageSize, totalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSpOpporPageQueryResponseModel {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    opporList: ").append(toIndentedString(opporList)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
    openapiFields.add("current_page");
    openapiFields.add("oppor_list");
    openapiFields.add("page_size");
    openapiFields.add("total_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSpOpporPageQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSpOpporPageQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSpOpporPageQueryResponseModel is not found in the empty JSON string", AlipayOpenSpOpporPageQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSpOpporPageQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSpOpporPageQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayopporList = jsonObj.getAsJsonArray("oppor_list");
      if (jsonArrayopporList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("oppor_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `oppor_list` to be an array in the JSON string but got `%s`", jsonObj.get("oppor_list").toString()));
        }

        // validate the optional field `oppor_list` (array)
        for (int i = 0; i < jsonArrayopporList.size(); i++) {
          IsvExpandOpporDTO.validateJsonObject(jsonArrayopporList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSpOpporPageQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSpOpporPageQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSpOpporPageQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSpOpporPageQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSpOpporPageQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSpOpporPageQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSpOpporPageQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSpOpporPageQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSpOpporPageQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSpOpporPageQueryResponseModel
  */
  public static AlipayOpenSpOpporPageQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSpOpporPageQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSpOpporPageQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
