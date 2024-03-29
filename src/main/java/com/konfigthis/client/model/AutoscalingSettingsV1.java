/*
 * Baseten management API
 * REST API for management of Baseten resources
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Autoscaling settings for a deployment.
 */
@ApiModel(description = "Autoscaling settings for a deployment.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AutoscalingSettingsV1 {
  public static final String SERIALIZED_NAME_MIN_REPLICA = "min_replica";
  @SerializedName(SERIALIZED_NAME_MIN_REPLICA)
  private Integer minReplica;

  public static final String SERIALIZED_NAME_MAX_REPLICA = "max_replica";
  @SerializedName(SERIALIZED_NAME_MAX_REPLICA)
  private Integer maxReplica;

  public static final String SERIALIZED_NAME_AUTOSCALING_WINDOW = "autoscaling_window";
  @SerializedName(SERIALIZED_NAME_AUTOSCALING_WINDOW)
  private Integer autoscalingWindow;

  public static final String SERIALIZED_NAME_SCALE_DOWN_DELAY = "scale_down_delay";
  @SerializedName(SERIALIZED_NAME_SCALE_DOWN_DELAY)
  private Integer scaleDownDelay;

  public static final String SERIALIZED_NAME_CONCURRENCY_TARGET = "concurrency_target";
  @SerializedName(SERIALIZED_NAME_CONCURRENCY_TARGET)
  private Integer concurrencyTarget;

  public AutoscalingSettingsV1() {
  }

  public AutoscalingSettingsV1 minReplica(Integer minReplica) {
    
    
    
    
    this.minReplica = minReplica;
    return this;
  }

   /**
   * Minimum number of replicas
   * @return minReplica
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Minimum number of replicas")

  public Integer getMinReplica() {
    return minReplica;
  }


  public void setMinReplica(Integer minReplica) {
    
    
    
    this.minReplica = minReplica;
  }


  public AutoscalingSettingsV1 maxReplica(Integer maxReplica) {
    
    
    
    
    this.maxReplica = maxReplica;
    return this;
  }

   /**
   * Maximum number of replicas
   * @return maxReplica
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Maximum number of replicas")

  public Integer getMaxReplica() {
    return maxReplica;
  }


  public void setMaxReplica(Integer maxReplica) {
    
    
    
    this.maxReplica = maxReplica;
  }


  public AutoscalingSettingsV1 autoscalingWindow(Integer autoscalingWindow) {
    
    
    
    
    this.autoscalingWindow = autoscalingWindow;
    return this;
  }

   /**
   * Timeframe of traffic considered for autoscaling decisions
   * @return autoscalingWindow
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Timeframe of traffic considered for autoscaling decisions")

  public Integer getAutoscalingWindow() {
    return autoscalingWindow;
  }


  public void setAutoscalingWindow(Integer autoscalingWindow) {
    
    
    
    this.autoscalingWindow = autoscalingWindow;
  }


  public AutoscalingSettingsV1 scaleDownDelay(Integer scaleDownDelay) {
    
    
    
    
    this.scaleDownDelay = scaleDownDelay;
    return this;
  }

   /**
   * Waiting period before scaling down any active replica
   * @return scaleDownDelay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Waiting period before scaling down any active replica")

  public Integer getScaleDownDelay() {
    return scaleDownDelay;
  }


  public void setScaleDownDelay(Integer scaleDownDelay) {
    
    
    
    this.scaleDownDelay = scaleDownDelay;
  }


  public AutoscalingSettingsV1 concurrencyTarget(Integer concurrencyTarget) {
    
    
    
    
    this.concurrencyTarget = concurrencyTarget;
    return this;
  }

   /**
   * Number of requests per replica before scaling up
   * @return concurrencyTarget
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of requests per replica before scaling up")

  public Integer getConcurrencyTarget() {
    return concurrencyTarget;
  }


  public void setConcurrencyTarget(Integer concurrencyTarget) {
    
    
    
    this.concurrencyTarget = concurrencyTarget;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AutoscalingSettingsV1 instance itself
   */
  public AutoscalingSettingsV1 putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoscalingSettingsV1 autoscalingSettingsV1 = (AutoscalingSettingsV1) o;
    return Objects.equals(this.minReplica, autoscalingSettingsV1.minReplica) &&
        Objects.equals(this.maxReplica, autoscalingSettingsV1.maxReplica) &&
        Objects.equals(this.autoscalingWindow, autoscalingSettingsV1.autoscalingWindow) &&
        Objects.equals(this.scaleDownDelay, autoscalingSettingsV1.scaleDownDelay) &&
        Objects.equals(this.concurrencyTarget, autoscalingSettingsV1.concurrencyTarget)&&
        Objects.equals(this.additionalProperties, autoscalingSettingsV1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minReplica, maxReplica, autoscalingWindow, scaleDownDelay, concurrencyTarget, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoscalingSettingsV1 {\n");
    sb.append("    minReplica: ").append(toIndentedString(minReplica)).append("\n");
    sb.append("    maxReplica: ").append(toIndentedString(maxReplica)).append("\n");
    sb.append("    autoscalingWindow: ").append(toIndentedString(autoscalingWindow)).append("\n");
    sb.append("    scaleDownDelay: ").append(toIndentedString(scaleDownDelay)).append("\n");
    sb.append("    concurrencyTarget: ").append(toIndentedString(concurrencyTarget)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("min_replica");
    openapiFields.add("max_replica");
    openapiFields.add("autoscaling_window");
    openapiFields.add("scale_down_delay");
    openapiFields.add("concurrency_target");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("min_replica");
    openapiRequiredFields.add("max_replica");
    openapiRequiredFields.add("autoscaling_window");
    openapiRequiredFields.add("scale_down_delay");
    openapiRequiredFields.add("concurrency_target");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutoscalingSettingsV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AutoscalingSettingsV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutoscalingSettingsV1 is not found in the empty JSON string", AutoscalingSettingsV1.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AutoscalingSettingsV1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutoscalingSettingsV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutoscalingSettingsV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutoscalingSettingsV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutoscalingSettingsV1.class));

       return (TypeAdapter<T>) new TypeAdapter<AutoscalingSettingsV1>() {
           @Override
           public void write(JsonWriter out, AutoscalingSettingsV1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AutoscalingSettingsV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AutoscalingSettingsV1 instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutoscalingSettingsV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutoscalingSettingsV1
  * @throws IOException if the JSON string is invalid with respect to AutoscalingSettingsV1
  */
  public static AutoscalingSettingsV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutoscalingSettingsV1.class);
  }

 /**
  * Convert an instance of AutoscalingSettingsV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

