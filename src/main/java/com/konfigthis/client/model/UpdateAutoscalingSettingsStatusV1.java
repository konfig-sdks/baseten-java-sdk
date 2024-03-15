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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The status of a request to update autoscaling settings.
 */
@JsonAdapter(UpdateAutoscalingSettingsStatusV1.Adapter.class)public enum UpdateAutoscalingSettingsStatusV1 {
  
  ACCEPTED("ACCEPTED"),
  
  QUEUED("QUEUED"),
  
  UNCHANGED("UNCHANGED");

  private String value;

  UpdateAutoscalingSettingsStatusV1(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UpdateAutoscalingSettingsStatusV1 fromValue(String value) {
    for (UpdateAutoscalingSettingsStatusV1 b : UpdateAutoscalingSettingsStatusV1.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<UpdateAutoscalingSettingsStatusV1> {
    @Override
    public void write(final JsonWriter jsonWriter, final UpdateAutoscalingSettingsStatusV1 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UpdateAutoscalingSettingsStatusV1 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UpdateAutoscalingSettingsStatusV1.fromValue(value);
    }
  }
}
