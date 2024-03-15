# AutoscalingSettingApi

All URIs are relative to *https://api.baseten.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateDeploymentSettings**](AutoscalingSettingApi.md#updateDeploymentSettings) | **PATCH** /v1/models/{model_id}/deployments/{deployment_id}/autoscaling_settings | Updates a deployment&#39;s autoscaling settings |
| [**updateDevelopmentSetting**](AutoscalingSettingApi.md#updateDevelopmentSetting) | **PATCH** /v1/models/{model_id}/deployments/development/autoscaling_settings | Updates a development deployment&#39;s autoscaling settings |
| [**updateStatus**](AutoscalingSettingApi.md#updateStatus) | **PATCH** /v1/models/{model_id}/deployments/production/autoscaling_settings | Updates a production deployment&#39;s autoscaling settings |


<a name="updateDeploymentSettings"></a>
# **updateDeploymentSettings**
> UpdateAutoscalingSettingsResponseV1 updateDeploymentSettings(modelId, deploymentId, updateAutoscalingSettingsV1).execute();

Updates a deployment&#39;s autoscaling settings

Updates a deployment&#39;s autoscaling settings and returns the update status.

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **deploymentId** | **String**|  | |
| **updateAutoscalingSettingsV1** | [**UpdateAutoscalingSettingsV1**](UpdateAutoscalingSettingsV1.md)|  | |

### Return type

[**UpdateAutoscalingSettingsResponseV1**](UpdateAutoscalingSettingsResponseV1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response to a request to update autoscaling settings. |  -  |

<a name="updateDevelopmentSetting"></a>
# **updateDevelopmentSetting**
> UpdateAutoscalingSettingsResponseV1 updateDevelopmentSetting(modelId, updateAutoscalingSettingsV1).execute();

Updates a development deployment&#39;s autoscaling settings

Updates a development deployment&#39;s autoscaling settings and returns the update status.

### Example
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
    Integer minReplica = 56; // Minimum number of replicas
    Integer maxReplica = 56; // Maximum number of replicas
    Integer autoscalingWindow = 56; // Timeframe of traffic considered for autoscaling decisions
    Integer scaleDownDelay = 56; // Waiting period before scaling down any active replica
    Integer concurrencyTarget = 56; // Number of requests per replica before scaling up
    try {
      UpdateAutoscalingSettingsResponseV1 result = client
              .autoscalingSetting
              .updateDevelopmentSetting(modelId)
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
      System.err.println("Exception when calling AutoscalingSettingApi#updateDevelopmentSetting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateAutoscalingSettingsResponseV1> response = client
              .autoscalingSetting
              .updateDevelopmentSetting(modelId)
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
      System.err.println("Exception when calling AutoscalingSettingApi#updateDevelopmentSetting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **updateAutoscalingSettingsV1** | [**UpdateAutoscalingSettingsV1**](UpdateAutoscalingSettingsV1.md)|  | |

### Return type

[**UpdateAutoscalingSettingsResponseV1**](UpdateAutoscalingSettingsResponseV1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response to a request to update autoscaling settings. |  -  |

<a name="updateStatus"></a>
# **updateStatus**
> UpdateAutoscalingSettingsResponseV1 updateStatus(modelId, updateAutoscalingSettingsV1).execute();

Updates a production deployment&#39;s autoscaling settings

Updates a production deployment&#39;s autoscaling settings and returns the update status.

### Example
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
    Integer minReplica = 56; // Minimum number of replicas
    Integer maxReplica = 56; // Maximum number of replicas
    Integer autoscalingWindow = 56; // Timeframe of traffic considered for autoscaling decisions
    Integer scaleDownDelay = 56; // Waiting period before scaling down any active replica
    Integer concurrencyTarget = 56; // Number of requests per replica before scaling up
    try {
      UpdateAutoscalingSettingsResponseV1 result = client
              .autoscalingSetting
              .updateStatus(modelId)
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
      System.err.println("Exception when calling AutoscalingSettingApi#updateStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateAutoscalingSettingsResponseV1> response = client
              .autoscalingSetting
              .updateStatus(modelId)
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
      System.err.println("Exception when calling AutoscalingSettingApi#updateStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **updateAutoscalingSettingsV1** | [**UpdateAutoscalingSettingsV1**](UpdateAutoscalingSettingsV1.md)|  | |

### Return type

[**UpdateAutoscalingSettingsResponseV1**](UpdateAutoscalingSettingsResponseV1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response to a request to update autoscaling settings. |  -  |

