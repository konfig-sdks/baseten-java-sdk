<div align="center">

[![Visit Baseten](./header.png)](https://baseten.co)

# [Baseten](https://baseten.co)

REST API for management of Baseten resources

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Baseten&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>baseten-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:baseten-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/baseten-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baseten;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutoscalingSettingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baseten.co";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    Baseten client = new Baseten(configuration);
    String modelId = "modelId_example";
    String deploymentId = "deploymentId_example";
    Integer minReplica = 56; // Minimum number of replicas
    Integer maxReplica = 56; // Maximum number of replicas
    Integer autoscalingWindow = 56; // Timeframe of traffic considered for autoscaling decisions
    Integer scaleDownDelay = 56; // Waiting period before scaling down any active replica
    Integer concurrencyTarget = 56; // Number of requests per replica before scaling up
    try {
      UpdateAutoscalingSettingsResponseV1 result = client
              .autoscalingSetting
              .updateDeploymentSettings(modelId, deploymentId)
              .minReplica(minReplica)
              .maxReplica(maxReplica)
              .autoscalingWindow(autoscalingWindow)
              .scaleDownDelay(scaleDownDelay)
              .concurrencyTarget(concurrencyTarget)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoscalingSettingApi#updateDeploymentSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateAutoscalingSettingsResponseV1> response = client
              .autoscalingSetting
              .updateDeploymentSettings(modelId, deploymentId)
              .minReplica(minReplica)
              .maxReplica(maxReplica)
              .autoscalingWindow(autoscalingWindow)
              .scaleDownDelay(scaleDownDelay)
              .concurrencyTarget(concurrencyTarget)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoscalingSettingApi#updateDeploymentSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.baseten.co*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AutoscalingSettingApi* | [**updateDeploymentSettings**](docs/AutoscalingSettingApi.md#updateDeploymentSettings) | **PATCH** /v1/models/{model_id}/deployments/{deployment_id}/autoscaling_settings | Updates a deployment&#39;s autoscaling settings
*AutoscalingSettingApi* | [**updateDevelopmentSetting**](docs/AutoscalingSettingApi.md#updateDevelopmentSetting) | **PATCH** /v1/models/{model_id}/deployments/development/autoscaling_settings | Updates a development deployment&#39;s autoscaling settings
*AutoscalingSettingApi* | [**updateStatus**](docs/AutoscalingSettingApi.md#updateStatus) | **PATCH** /v1/models/{model_id}/deployments/production/autoscaling_settings | Updates a production deployment&#39;s autoscaling settings
*DeploymentApi* | [**detailsGet**](docs/DeploymentApi.md#detailsGet) | **GET** /v1/models/{model_id}/deployments/{deployment_id} | Gets a model&#39;s deployment by id
*DeploymentApi* | [**getDevelopmentDetails**](docs/DeploymentApi.md#getDevelopmentDetails) | **GET** /v1/models/{model_id}/deployments/development | Gets a model&#39;s development deployment
*DeploymentApi* | [**getProductionDetails**](docs/DeploymentApi.md#getProductionDetails) | **GET** /v1/models/{model_id}/deployments/production | Gets a model&#39;s production deployment
*ModelApi* | [**deployPromote**](docs/ModelApi.md#deployPromote) | **POST** /v1/models/{model_id}/deployments/development/promote | Promotes a development deployment to production
*ModelApi* | [**deploymentPromote**](docs/ModelApi.md#deploymentPromote) | **POST** /v1/models/{model_id}/deployments/{deployment_id}/promote | Promotes a deployment to production
*ModelApi* | [**getAllDeployments**](docs/ModelApi.md#getAllDeployments) | **GET** /v1/models/{model_id}/deployments | Gets all deployments of a model
*ModelApi* | [**getAllModels**](docs/ModelApi.md#getAllModels) | **GET** /v1/models | Gets all models
*ModelApi* | [**getModelById**](docs/ModelApi.md#getModelById) | **GET** /v1/models/{model_id} | Gets a model by ID
*SecretApi* | [**getAllSecrets**](docs/SecretApi.md#getAllSecrets) | **GET** /v1/secrets | Gets all secrets
*SecretApi* | [**upsertNewSecret**](docs/SecretApi.md#upsertNewSecret) | **POST** /v1/secrets | Upserts a secret


## Documentation for Models

 - [AutoscalingSettingsV1](docs/AutoscalingSettingsV1.md)
 - [DeploymentStatusV1](docs/DeploymentStatusV1.md)
 - [DeploymentV1](docs/DeploymentV1.md)
 - [DeploymentsV1](docs/DeploymentsV1.md)
 - [ModelV1](docs/ModelV1.md)
 - [ModelsV1](docs/ModelsV1.md)
 - [PromoteRequestV1](docs/PromoteRequestV1.md)
 - [SecretV1](docs/SecretV1.md)
 - [SecretsV1](docs/SecretsV1.md)
 - [UpdateAutoscalingSettingsResponseV1](docs/UpdateAutoscalingSettingsResponseV1.md)
 - [UpdateAutoscalingSettingsStatusV1](docs/UpdateAutoscalingSettingsStatusV1.md)
 - [UpdateAutoscalingSettingsV1](docs/UpdateAutoscalingSettingsV1.md)
 - [UpsertSecretRequestV1](docs/UpsertSecretRequestV1.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
