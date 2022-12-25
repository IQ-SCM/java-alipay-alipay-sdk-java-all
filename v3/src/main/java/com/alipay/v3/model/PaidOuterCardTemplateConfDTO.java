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
import com.alipay.v3.model.PaidOuterCardCycleSellConfDTO;
import com.alipay.v3.model.PaidOuterCardManageUrlConfDTO;
import com.alipay.v3.model.PaidOuterCardSellingConfDTO;
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
 * PaidOuterCardTemplateConfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaidOuterCardTemplateConfDTO {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CYCLE_SELLING_CONF = "cycle_selling_conf";
  @SerializedName(SERIALIZED_NAME_CYCLE_SELLING_CONF)
  private PaidOuterCardCycleSellConfDTO cycleSellingConf;

  public static final String SERIALIZED_NAME_MANAGE_URL_CONF = "manage_url_conf";
  @SerializedName(SERIALIZED_NAME_MANAGE_URL_CONF)
  private PaidOuterCardManageUrlConfDTO manageUrlConf;

  public static final String SERIALIZED_NAME_OPEN_SELLING_CONF = "open_selling_conf";
  @SerializedName(SERIALIZED_NAME_OPEN_SELLING_CONF)
  private PaidOuterCardSellingConfDTO openSellingConf;

  public PaidOuterCardTemplateConfDTO() { 
  }

  public PaidOuterCardTemplateConfDTO cycleSellingConf(PaidOuterCardCycleSellConfDTO cycleSellingConf) {
    
    this.cycleSellingConf = cycleSellingConf;
    return this;
  }

   /**
   * Get cycleSellingConf
   * @return cycleSellingConf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaidOuterCardCycleSellConfDTO getCycleSellingConf() {
    return cycleSellingConf;
  }


  public void setCycleSellingConf(PaidOuterCardCycleSellConfDTO cycleSellingConf) {
    this.cycleSellingConf = cycleSellingConf;
  }


  public PaidOuterCardTemplateConfDTO manageUrlConf(PaidOuterCardManageUrlConfDTO manageUrlConf) {
    
    this.manageUrlConf = manageUrlConf;
    return this;
  }

   /**
   * Get manageUrlConf
   * @return manageUrlConf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaidOuterCardManageUrlConfDTO getManageUrlConf() {
    return manageUrlConf;
  }


  public void setManageUrlConf(PaidOuterCardManageUrlConfDTO manageUrlConf) {
    this.manageUrlConf = manageUrlConf;
  }


  public PaidOuterCardTemplateConfDTO openSellingConf(PaidOuterCardSellingConfDTO openSellingConf) {
    
    this.openSellingConf = openSellingConf;
    return this;
  }

   /**
   * Get openSellingConf
   * @return openSellingConf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaidOuterCardSellingConfDTO getOpenSellingConf() {
    return openSellingConf;
  }


  public void setOpenSellingConf(PaidOuterCardSellingConfDTO openSellingConf) {
    this.openSellingConf = openSellingConf;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaidOuterCardTemplateConfDTO paidOuterCardTemplateConfDTO = (PaidOuterCardTemplateConfDTO) o;
    return Objects.equals(this.cycleSellingConf, paidOuterCardTemplateConfDTO.cycleSellingConf) &&
        Objects.equals(this.manageUrlConf, paidOuterCardTemplateConfDTO.manageUrlConf) &&
        Objects.equals(this.openSellingConf, paidOuterCardTemplateConfDTO.openSellingConf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycleSellingConf, manageUrlConf, openSellingConf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaidOuterCardTemplateConfDTO {\n");
    sb.append("    cycleSellingConf: ").append(toIndentedString(cycleSellingConf)).append("\n");
    sb.append("    manageUrlConf: ").append(toIndentedString(manageUrlConf)).append("\n");
    sb.append("    openSellingConf: ").append(toIndentedString(openSellingConf)).append("\n");
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
    openapiFields.add("cycle_selling_conf");
    openapiFields.add("manage_url_conf");
    openapiFields.add("open_selling_conf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaidOuterCardTemplateConfDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaidOuterCardTemplateConfDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaidOuterCardTemplateConfDTO is not found in the empty JSON string", PaidOuterCardTemplateConfDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaidOuterCardTemplateConfDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaidOuterCardTemplateConfDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `cycle_selling_conf`
      if (jsonObj.getAsJsonObject("cycle_selling_conf") != null) {
        PaidOuterCardCycleSellConfDTO.validateJsonObject(jsonObj.getAsJsonObject("cycle_selling_conf"));
      }
      // validate the optional field `manage_url_conf`
      if (jsonObj.getAsJsonObject("manage_url_conf") != null) {
        PaidOuterCardManageUrlConfDTO.validateJsonObject(jsonObj.getAsJsonObject("manage_url_conf"));
      }
      // validate the optional field `open_selling_conf`
      if (jsonObj.getAsJsonObject("open_selling_conf") != null) {
        PaidOuterCardSellingConfDTO.validateJsonObject(jsonObj.getAsJsonObject("open_selling_conf"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaidOuterCardTemplateConfDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaidOuterCardTemplateConfDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaidOuterCardTemplateConfDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaidOuterCardTemplateConfDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<PaidOuterCardTemplateConfDTO>() {
           @Override
           public void write(JsonWriter out, PaidOuterCardTemplateConfDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaidOuterCardTemplateConfDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaidOuterCardTemplateConfDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaidOuterCardTemplateConfDTO
  * @throws IOException if the JSON string is invalid with respect to PaidOuterCardTemplateConfDTO
  */
  public static PaidOuterCardTemplateConfDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaidOuterCardTemplateConfDTO.class);
  }

 /**
  * Convert an instance of PaidOuterCardTemplateConfDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

