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
 * A model.
 */
@ApiModel(description = "A model.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ModelV1 {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DEPLOYMENTS_COUNT = "deployments_count";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENTS_COUNT)
  private Integer deploymentsCount;

  public static final String SERIALIZED_NAME_PRODUCTION_DEPLOYMENT_ID = "production_deployment_id";
  @SerializedName(SERIALIZED_NAME_PRODUCTION_DEPLOYMENT_ID)
  private String productionDeploymentId;

  public static final String SERIALIZED_NAME_DEVELOPMENT_DEPLOYMENT_ID = "development_deployment_id";
  @SerializedName(SERIALIZED_NAME_DEVELOPMENT_DEPLOYMENT_ID)
  private String developmentDeploymentId;

  public static final String SERIALIZED_NAME_INSTANCE_TYPE_NAME = "instance_type_name";
  @SerializedName(SERIALIZED_NAME_INSTANCE_TYPE_NAME)
  private String instanceTypeName;

  public ModelV1() {
  }

  public ModelV1 id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the model
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier of the model")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ModelV1 createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time the model was created in ISO 8601 format
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Time the model was created in ISO 8601 format")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public ModelV1 name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name of the model
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the model")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ModelV1 deploymentsCount(Integer deploymentsCount) {
    
    
    
    
    this.deploymentsCount = deploymentsCount;
    return this;
  }

   /**
   * Number of deployments of the model
   * @return deploymentsCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of deployments of the model")

  public Integer getDeploymentsCount() {
    return deploymentsCount;
  }


  public void setDeploymentsCount(Integer deploymentsCount) {
    
    
    
    this.deploymentsCount = deploymentsCount;
  }


  public ModelV1 productionDeploymentId(String productionDeploymentId) {
    
    
    
    
    this.productionDeploymentId = productionDeploymentId;
    return this;
  }

   /**
   * Unique identifier of the production deployment of the model
   * @return productionDeploymentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier of the production deployment of the model")

  public String getProductionDeploymentId() {
    return productionDeploymentId;
  }


  public void setProductionDeploymentId(String productionDeploymentId) {
    
    
    
    this.productionDeploymentId = productionDeploymentId;
  }


  public ModelV1 developmentDeploymentId(String developmentDeploymentId) {
    
    
    
    
    this.developmentDeploymentId = developmentDeploymentId;
    return this;
  }

   /**
   * Unique identifier of the development deployment of the model
   * @return developmentDeploymentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier of the development deployment of the model")

  public String getDevelopmentDeploymentId() {
    return developmentDeploymentId;
  }


  public void setDevelopmentDeploymentId(String developmentDeploymentId) {
    
    
    
    this.developmentDeploymentId = developmentDeploymentId;
  }


  public ModelV1 instanceTypeName(String instanceTypeName) {
    
    
    
    
    this.instanceTypeName = instanceTypeName;
    return this;
  }

   /**
   * Name of the instance type the model is deployed on
   * @return instanceTypeName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the instance type the model is deployed on")

  public String getInstanceTypeName() {
    return instanceTypeName;
  }


  public void setInstanceTypeName(String instanceTypeName) {
    
    
    
    this.instanceTypeName = instanceTypeName;
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
   * @return the ModelV1 instance itself
   */
  public ModelV1 putAdditionalProperty(String key, Object value) {
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
    ModelV1 modelV1 = (ModelV1) o;
    return Objects.equals(this.id, modelV1.id) &&
        Objects.equals(this.createdAt, modelV1.createdAt) &&
        Objects.equals(this.name, modelV1.name) &&
        Objects.equals(this.deploymentsCount, modelV1.deploymentsCount) &&
        Objects.equals(this.productionDeploymentId, modelV1.productionDeploymentId) &&
        Objects.equals(this.developmentDeploymentId, modelV1.developmentDeploymentId) &&
        Objects.equals(this.instanceTypeName, modelV1.instanceTypeName)&&
        Objects.equals(this.additionalProperties, modelV1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, name, deploymentsCount, productionDeploymentId, developmentDeploymentId, instanceTypeName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelV1 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deploymentsCount: ").append(toIndentedString(deploymentsCount)).append("\n");
    sb.append("    productionDeploymentId: ").append(toIndentedString(productionDeploymentId)).append("\n");
    sb.append("    developmentDeploymentId: ").append(toIndentedString(developmentDeploymentId)).append("\n");
    sb.append("    instanceTypeName: ").append(toIndentedString(instanceTypeName)).append("\n");
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
    openapiFields.add("deployments_count");
    openapiFields.add("production_deployment_id");
    openapiFields.add("development_deployment_id");
    openapiFields.add("instance_type_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("deployments_count");
    openapiRequiredFields.add("production_deployment_id");
    openapiRequiredFields.add("development_deployment_id");
    openapiRequiredFields.add("instance_type_name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelV1 is not found in the empty JSON string", ModelV1.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelV1.openapiRequiredFields) {
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
      if (!jsonObj.get("production_deployment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `production_deployment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("production_deployment_id").toString()));
      }
      if (!jsonObj.get("development_deployment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `development_deployment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("development_deployment_id").toString()));
      }
      if (!jsonObj.get("instance_type_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instance_type_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instance_type_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelV1.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelV1>() {
           @Override
           public void write(JsonWriter out, ModelV1 value) throws IOException {
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
           public ModelV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ModelV1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ModelV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelV1
  * @throws IOException if the JSON string is invalid with respect to ModelV1
  */
  public static ModelV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelV1.class);
  }

 /**
  * Convert an instance of ModelV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

