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
import com.konfigthis.client.model.AutoscalingSettingsV1;
import com.konfigthis.client.model.DeploymentStatusV1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * A deployment of a model.
 */
@ApiModel(description = "A deployment of a model.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DeploymentV1 {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MODEL_ID = "model_id";
  @SerializedName(SERIALIZED_NAME_MODEL_ID)
  private String modelId;

  public static final String SERIALIZED_NAME_IS_PRODUCTION = "is_production";
  @SerializedName(SERIALIZED_NAME_IS_PRODUCTION)
  private Boolean isProduction;

  public static final String SERIALIZED_NAME_IS_DEVELOPMENT = "is_development";
  @SerializedName(SERIALIZED_NAME_IS_DEVELOPMENT)
  private Boolean isDevelopment;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DeploymentStatusV1 status;

  public static final String SERIALIZED_NAME_ACTIVE_REPLICA_COUNT = "active_replica_count";
  @SerializedName(SERIALIZED_NAME_ACTIVE_REPLICA_COUNT)
  private Integer activeReplicaCount;

  public static final String SERIALIZED_NAME_AUTOSCALING_SETTINGS = "autoscaling_settings";
  @SerializedName(SERIALIZED_NAME_AUTOSCALING_SETTINGS)
  private AutoscalingSettingsV1 autoscalingSettings;

  public DeploymentV1() {
  }

  public DeploymentV1 id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the deployment
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier of the deployment")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public DeploymentV1 createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time the deployment was created in ISO 8601 format
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Time the deployment was created in ISO 8601 format")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public DeploymentV1 name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name of the deployment
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the deployment")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public DeploymentV1 modelId(String modelId) {
    
    
    
    
    this.modelId = modelId;
    return this;
  }

   /**
   * Unique identifier of the model
   * @return modelId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier of the model")

  public String getModelId() {
    return modelId;
  }


  public void setModelId(String modelId) {
    
    
    
    this.modelId = modelId;
  }


  public DeploymentV1 isProduction(Boolean isProduction) {
    
    
    
    
    this.isProduction = isProduction;
    return this;
  }

   /**
   * Whether the deployment is the production deployment of the model
   * @return isProduction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the deployment is the production deployment of the model")

  public Boolean getIsProduction() {
    return isProduction;
  }


  public void setIsProduction(Boolean isProduction) {
    
    
    
    this.isProduction = isProduction;
  }


  public DeploymentV1 isDevelopment(Boolean isDevelopment) {
    
    
    
    
    this.isDevelopment = isDevelopment;
    return this;
  }

   /**
   * Whether the deployment is the development deployment of the model
   * @return isDevelopment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the deployment is the development deployment of the model")

  public Boolean getIsDevelopment() {
    return isDevelopment;
  }


  public void setIsDevelopment(Boolean isDevelopment) {
    
    
    
    this.isDevelopment = isDevelopment;
  }


  public DeploymentV1 status(DeploymentStatusV1 status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Status of the deployment
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Status of the deployment")

  public DeploymentStatusV1 getStatus() {
    return status;
  }


  public void setStatus(DeploymentStatusV1 status) {
    
    
    
    this.status = status;
  }


  public DeploymentV1 activeReplicaCount(Integer activeReplicaCount) {
    
    
    
    
    this.activeReplicaCount = activeReplicaCount;
    return this;
  }

   /**
   * Number of active replicas
   * @return activeReplicaCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of active replicas")

  public Integer getActiveReplicaCount() {
    return activeReplicaCount;
  }


  public void setActiveReplicaCount(Integer activeReplicaCount) {
    
    
    
    this.activeReplicaCount = activeReplicaCount;
  }


  public DeploymentV1 autoscalingSettings(AutoscalingSettingsV1 autoscalingSettings) {
    
    
    
    
    this.autoscalingSettings = autoscalingSettings;
    return this;
  }

   /**
   * Autoscaling settings for the deployment
   * @return autoscalingSettings
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Autoscaling settings for the deployment")

  public AutoscalingSettingsV1 getAutoscalingSettings() {
    return autoscalingSettings;
  }


  public void setAutoscalingSettings(AutoscalingSettingsV1 autoscalingSettings) {
    
    
    
    this.autoscalingSettings = autoscalingSettings;
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
   * @return the DeploymentV1 instance itself
   */
  public DeploymentV1 putAdditionalProperty(String key, Object value) {
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
    DeploymentV1 deploymentV1 = (DeploymentV1) o;
    return Objects.equals(this.id, deploymentV1.id) &&
        Objects.equals(this.createdAt, deploymentV1.createdAt) &&
        Objects.equals(this.name, deploymentV1.name) &&
        Objects.equals(this.modelId, deploymentV1.modelId) &&
        Objects.equals(this.isProduction, deploymentV1.isProduction) &&
        Objects.equals(this.isDevelopment, deploymentV1.isDevelopment) &&
        Objects.equals(this.status, deploymentV1.status) &&
        Objects.equals(this.activeReplicaCount, deploymentV1.activeReplicaCount) &&
        Objects.equals(this.autoscalingSettings, deploymentV1.autoscalingSettings)&&
        Objects.equals(this.additionalProperties, deploymentV1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, name, modelId, isProduction, isDevelopment, status, activeReplicaCount, autoscalingSettings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentV1 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    isProduction: ").append(toIndentedString(isProduction)).append("\n");
    sb.append("    isDevelopment: ").append(toIndentedString(isDevelopment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    activeReplicaCount: ").append(toIndentedString(activeReplicaCount)).append("\n");
    sb.append("    autoscalingSettings: ").append(toIndentedString(autoscalingSettings)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("name");
    openapiFields.add("model_id");
    openapiFields.add("is_production");
    openapiFields.add("is_development");
    openapiFields.add("status");
    openapiFields.add("active_replica_count");
    openapiFields.add("autoscaling_settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("model_id");
    openapiRequiredFields.add("is_production");
    openapiRequiredFields.add("is_development");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("active_replica_count");
    openapiRequiredFields.add("autoscaling_settings");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeploymentV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeploymentV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeploymentV1 is not found in the empty JSON string", DeploymentV1.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeploymentV1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("model_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model_id").toString()));
      }
      // validate the required field `autoscaling_settings`
      AutoscalingSettingsV1.validateJsonObject(jsonObj.getAsJsonObject("autoscaling_settings"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeploymentV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeploymentV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeploymentV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeploymentV1.class));

       return (TypeAdapter<T>) new TypeAdapter<DeploymentV1>() {
           @Override
           public void write(JsonWriter out, DeploymentV1 value) throws IOException {
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
           public DeploymentV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DeploymentV1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DeploymentV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeploymentV1
  * @throws IOException if the JSON string is invalid with respect to DeploymentV1
  */
  public static DeploymentV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeploymentV1.class);
  }

 /**
  * Convert an instance of DeploymentV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

