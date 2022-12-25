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
import com.alipay.v3.model.TemplateRightsContentDTO;
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
 * TemplateOpenCardConfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateOpenCardConfDTO {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CARD_RIGHTS = "card_rights";
  @SerializedName(SERIALIZED_NAME_CARD_RIGHTS)
  private List<TemplateRightsContentDTO> cardRights = null;

  public static final String SERIALIZED_NAME_CONF = "conf";
  @SerializedName(SERIALIZED_NAME_CONF)
  private String conf;

  public static final String SERIALIZED_NAME_OPEN_CARD_SOURCE_TYPE = "open_card_source_type";
  @SerializedName(SERIALIZED_NAME_OPEN_CARD_SOURCE_TYPE)
  private String openCardSourceType;

  public static final String SERIALIZED_NAME_OPEN_CARD_URL = "open_card_url";
  @SerializedName(SERIALIZED_NAME_OPEN_CARD_URL)
  private String openCardUrl;

  public static final String SERIALIZED_NAME_SOURCE_APP_ID = "source_app_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_APP_ID)
  private String sourceAppId;

  public TemplateOpenCardConfDTO() { 
  }

  public TemplateOpenCardConfDTO cardRights(List<TemplateRightsContentDTO> cardRights) {
    
    this.cardRights = cardRights;
    return this;
  }

  public TemplateOpenCardConfDTO addCardRightsItem(TemplateRightsContentDTO cardRightsItem) {
    if (this.cardRights == null) {
      this.cardRights = new ArrayList<>();
    }
    this.cardRights.add(cardRightsItem);
    return this;
  }

   /**
   * 领卡权益信息
   * @return cardRights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "领卡权益信息")

  public List<TemplateRightsContentDTO> getCardRights() {
    return cardRights;
  }


  public void setCardRights(List<TemplateRightsContentDTO> cardRights) {
    this.cardRights = cardRights;
  }


  public TemplateOpenCardConfDTO conf(String conf) {
    
    this.conf = conf;
    return this;
  }

   /**
   * 配置，预留字段，暂时不用
   * @return conf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "配置，预留字段，暂时不用")

  public String getConf() {
    return conf;
  }


  public void setConf(String conf) {
    this.conf = conf;
  }


  public TemplateOpenCardConfDTO openCardSourceType(String openCardSourceType) {
    
    this.openCardSourceType = openCardSourceType;
    return this;
  }

   /**
   * ISV：外部系统  MER：直连商户
   * @return openCardSourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISV：外部系统  MER：直连商户")

  public String getOpenCardSourceType() {
    return openCardSourceType;
  }


  public void setOpenCardSourceType(String openCardSourceType) {
    this.openCardSourceType = openCardSourceType;
  }


  public TemplateOpenCardConfDTO openCardUrl(String openCardUrl) {
    
    this.openCardUrl = openCardUrl;
    return this;
  }

   /**
   * 开卡连接，必须http、https开头
   * @return openCardUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开卡连接，必须http、https开头")

  public String getOpenCardUrl() {
    return openCardUrl;
  }


  public void setOpenCardUrl(String openCardUrl) {
    this.openCardUrl = openCardUrl;
  }


  public TemplateOpenCardConfDTO sourceAppId(String sourceAppId) {
    
    this.sourceAppId = sourceAppId;
    return this;
  }

   /**
   * 渠道APPID，提供领卡页面的服务提供方
   * @return sourceAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "渠道APPID，提供领卡页面的服务提供方")

  public String getSourceAppId() {
    return sourceAppId;
  }


  public void setSourceAppId(String sourceAppId) {
    this.sourceAppId = sourceAppId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateOpenCardConfDTO templateOpenCardConfDTO = (TemplateOpenCardConfDTO) o;
    return Objects.equals(this.cardRights, templateOpenCardConfDTO.cardRights) &&
        Objects.equals(this.conf, templateOpenCardConfDTO.conf) &&
        Objects.equals(this.openCardSourceType, templateOpenCardConfDTO.openCardSourceType) &&
        Objects.equals(this.openCardUrl, templateOpenCardConfDTO.openCardUrl) &&
        Objects.equals(this.sourceAppId, templateOpenCardConfDTO.sourceAppId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardRights, conf, openCardSourceType, openCardUrl, sourceAppId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateOpenCardConfDTO {\n");
    sb.append("    cardRights: ").append(toIndentedString(cardRights)).append("\n");
    sb.append("    conf: ").append(toIndentedString(conf)).append("\n");
    sb.append("    openCardSourceType: ").append(toIndentedString(openCardSourceType)).append("\n");
    sb.append("    openCardUrl: ").append(toIndentedString(openCardUrl)).append("\n");
    sb.append("    sourceAppId: ").append(toIndentedString(sourceAppId)).append("\n");
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
    openapiFields.add("card_rights");
    openapiFields.add("conf");
    openapiFields.add("open_card_source_type");
    openapiFields.add("open_card_url");
    openapiFields.add("source_app_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateOpenCardConfDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TemplateOpenCardConfDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateOpenCardConfDTO is not found in the empty JSON string", TemplateOpenCardConfDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TemplateOpenCardConfDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateOpenCardConfDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraycardRights = jsonObj.getAsJsonArray("card_rights");
      if (jsonArraycardRights != null) {
        // ensure the json data is an array
        if (!jsonObj.get("card_rights").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `card_rights` to be an array in the JSON string but got `%s`", jsonObj.get("card_rights").toString()));
        }

        // validate the optional field `card_rights` (array)
        for (int i = 0; i < jsonArraycardRights.size(); i++) {
          TemplateRightsContentDTO.validateJsonObject(jsonArraycardRights.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("conf") != null && !jsonObj.get("conf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conf").toString()));
      }
      if (jsonObj.get("open_card_source_type") != null && !jsonObj.get("open_card_source_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_card_source_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_card_source_type").toString()));
      }
      if (jsonObj.get("open_card_url") != null && !jsonObj.get("open_card_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_card_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_card_url").toString()));
      }
      if (jsonObj.get("source_app_id") != null && !jsonObj.get("source_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_app_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateOpenCardConfDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateOpenCardConfDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateOpenCardConfDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateOpenCardConfDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateOpenCardConfDTO>() {
           @Override
           public void write(JsonWriter out, TemplateOpenCardConfDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateOpenCardConfDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TemplateOpenCardConfDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateOpenCardConfDTO
  * @throws IOException if the JSON string is invalid with respect to TemplateOpenCardConfDTO
  */
  public static TemplateOpenCardConfDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateOpenCardConfDTO.class);
  }

 /**
  * Convert an instance of TemplateOpenCardConfDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

