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
import com.alipay.v3.model.ItemConsultInfo;
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
 * ItemPromoInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ItemPromoInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ITEM_CONSULT_LIST = "item_consult_list";
  @SerializedName(SERIALIZED_NAME_ITEM_CONSULT_LIST)
  private List<ItemConsultInfo> itemConsultList = null;

  public static final String SERIALIZED_NAME_ITEM_COVER_PIC = "item_cover_pic";
  @SerializedName(SERIALIZED_NAME_ITEM_COVER_PIC)
  private String itemCoverPic;

  public static final String SERIALIZED_NAME_ITEM_DESC = "item_desc";
  @SerializedName(SERIALIZED_NAME_ITEM_DESC)
  private String itemDesc;

  public static final String SERIALIZED_NAME_ITEM_DETAIL_PIC_LIST = "item_detail_pic_list";
  @SerializedName(SERIALIZED_NAME_ITEM_DETAIL_PIC_LIST)
  private List<String> itemDetailPicList = null;

  public static final String SERIALIZED_NAME_ITEM_NAME = "item_name";
  @SerializedName(SERIALIZED_NAME_ITEM_NAME)
  private String itemName;

  public ItemPromoInfo() { 
  }

  public ItemPromoInfo itemConsultList(List<ItemConsultInfo> itemConsultList) {
    
    this.itemConsultList = itemConsultList;
    return this;
  }

  public ItemPromoInfo addItemConsultListItem(ItemConsultInfo itemConsultListItem) {
    if (this.itemConsultList == null) {
      this.itemConsultList = new ArrayList<>();
    }
    this.itemConsultList.add(itemConsultListItem);
    return this;
  }

   /**
   * 商品咨询列表
   * @return itemConsultList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品咨询列表")

  public List<ItemConsultInfo> getItemConsultList() {
    return itemConsultList;
  }


  public void setItemConsultList(List<ItemConsultInfo> itemConsultList) {
    this.itemConsultList = itemConsultList;
  }


  public ItemPromoInfo itemCoverPic(String itemCoverPic) {
    
    this.itemCoverPic = itemCoverPic;
    return this;
  }

   /**
   * 单品封面图
   * @return itemCoverPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://gw.alipayobjects.com/mdn/rms_9822d7/afts/img/A*1F4eSaaPHRQAAAAAAAAAAABkARQnAQ", value = "单品封面图")

  public String getItemCoverPic() {
    return itemCoverPic;
  }


  public void setItemCoverPic(String itemCoverPic) {
    this.itemCoverPic = itemCoverPic;
  }


  public ItemPromoInfo itemDesc(String itemDesc) {
    
    this.itemDesc = itemDesc;
    return this;
  }

   /**
   * 单品描述
   * @return itemDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "宝洁洗护用品促销", value = "单品描述")

  public String getItemDesc() {
    return itemDesc;
  }


  public void setItemDesc(String itemDesc) {
    this.itemDesc = itemDesc;
  }


  public ItemPromoInfo itemDetailPicList(List<String> itemDetailPicList) {
    
    this.itemDetailPicList = itemDetailPicList;
    return this;
  }

  public ItemPromoInfo addItemDetailPicListItem(String itemDetailPicListItem) {
    if (this.itemDetailPicList == null) {
      this.itemDetailPicList = new ArrayList<>();
    }
    this.itemDetailPicList.add(itemDetailPicListItem);
    return this;
  }

   /**
   * 单品详情图列表
   * @return itemDetailPicList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"https://gw.alipayobjects.com/mdn/rms_9822d7/afts/img/A*1F4eSaaPHRQAAAAAAAAAAABkARQnAQ\"]", value = "单品详情图列表")

  public List<String> getItemDetailPicList() {
    return itemDetailPicList;
  }


  public void setItemDetailPicList(List<String> itemDetailPicList) {
    this.itemDetailPicList = itemDetailPicList;
  }


  public ItemPromoInfo itemName(String itemName) {
    
    this.itemName = itemName;
    return this;
  }

   /**
   * 单品名称
   * @return itemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "宝洁洗护用品", value = "单品名称")

  public String getItemName() {
    return itemName;
  }


  public void setItemName(String itemName) {
    this.itemName = itemName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemPromoInfo itemPromoInfo = (ItemPromoInfo) o;
    return Objects.equals(this.itemConsultList, itemPromoInfo.itemConsultList) &&
        Objects.equals(this.itemCoverPic, itemPromoInfo.itemCoverPic) &&
        Objects.equals(this.itemDesc, itemPromoInfo.itemDesc) &&
        Objects.equals(this.itemDetailPicList, itemPromoInfo.itemDetailPicList) &&
        Objects.equals(this.itemName, itemPromoInfo.itemName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemConsultList, itemCoverPic, itemDesc, itemDetailPicList, itemName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemPromoInfo {\n");
    sb.append("    itemConsultList: ").append(toIndentedString(itemConsultList)).append("\n");
    sb.append("    itemCoverPic: ").append(toIndentedString(itemCoverPic)).append("\n");
    sb.append("    itemDesc: ").append(toIndentedString(itemDesc)).append("\n");
    sb.append("    itemDetailPicList: ").append(toIndentedString(itemDetailPicList)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
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
    openapiFields.add("item_consult_list");
    openapiFields.add("item_cover_pic");
    openapiFields.add("item_desc");
    openapiFields.add("item_detail_pic_list");
    openapiFields.add("item_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ItemPromoInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ItemPromoInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemPromoInfo is not found in the empty JSON string", ItemPromoInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ItemPromoInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemPromoInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayitemConsultList = jsonObj.getAsJsonArray("item_consult_list");
      if (jsonArrayitemConsultList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("item_consult_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `item_consult_list` to be an array in the JSON string but got `%s`", jsonObj.get("item_consult_list").toString()));
        }

        // validate the optional field `item_consult_list` (array)
        for (int i = 0; i < jsonArrayitemConsultList.size(); i++) {
          ItemConsultInfo.validateJsonObject(jsonArrayitemConsultList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("item_cover_pic") != null && !jsonObj.get("item_cover_pic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_cover_pic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_cover_pic").toString()));
      }
      if (jsonObj.get("item_desc") != null && !jsonObj.get("item_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_desc").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("item_detail_pic_list") != null && !jsonObj.get("item_detail_pic_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_detail_pic_list` to be an array in the JSON string but got `%s`", jsonObj.get("item_detail_pic_list").toString()));
      }
      if (jsonObj.get("item_name") != null && !jsonObj.get("item_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemPromoInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemPromoInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemPromoInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemPromoInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemPromoInfo>() {
           @Override
           public void write(JsonWriter out, ItemPromoInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemPromoInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ItemPromoInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemPromoInfo
  * @throws IOException if the JSON string is invalid with respect to ItemPromoInfo
  */
  public static ItemPromoInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemPromoInfo.class);
  }

 /**
  * Convert an instance of ItemPromoInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

