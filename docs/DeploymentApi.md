# DeploymentApi

All URIs are relative to *https://api.baseten.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**detailsGet**](DeploymentApi.md#detailsGet) | **GET** /v1/models/{model_id}/deployments/{deployment_id} | Gets a model&#39;s deployment by id |
| [**getDevelopmentDetails**](DeploymentApi.md#getDevelopmentDetails) | **GET** /v1/models/{model_id}/deployments/development | Gets a model&#39;s development deployment |
| [**getProductionDetails**](DeploymentApi.md#getProductionDetails) | **GET** /v1/models/{model_id}/deployments/production | Gets a model&#39;s production deployment |


<a name="detailsGet"></a>
# **detailsGet**
> DeploymentV1 detailsGet(modelId, deploymentId).execute();

Gets a model&#39;s deployment by id

Gets a model&#39;s deployment by id and returns the deployment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baseten;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DeploymentApi;
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
    try {
      DeploymentV1 result = client
              .deployment
              .detailsGet(modelId, deploymentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getName());
      System.out.println(result.getModelId());
      System.out.println(result.getIsProduction());
      System.out.println(result.getIsDevelopment());
      System.out.println(result.getStatus());
      System.out.println(result.getActiveReplicaCount());
      System.out.println(result.getAutoscalingSettings());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentApi#detailsGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeploymentV1> response = client
              .deployment
              .detailsGet(modelId, deploymentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentApi#detailsGet");
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

### Return type

[**DeploymentV1**](DeploymentV1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A deployment of a model. |  -  |

<a name="getDevelopmentDetails"></a>
# **getDevelopmentDetails**
> DeploymentV1 getDevelopmentDetails(modelId).execute();

Gets a model&#39;s development deployment

Gets a model&#39;s development deployment and returns the deployment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baseten;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DeploymentApi;
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
    try {
      DeploymentV1 result = client
              .deployment
              .getDevelopmentDetails(modelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getName());
      System.out.println(result.getModelId());
      System.out.println(result.getIsProduction());
      System.out.println(result.getIsDevelopment());
      System.out.println(result.getStatus());
      System.out.println(result.getActiveReplicaCount());
      System.out.println(result.getAutoscalingSettings());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentApi#getDevelopmentDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeploymentV1> response = client
              .deployment
              .getDevelopmentDetails(modelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentApi#getDevelopmentDetails");
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

### Return type

[**DeploymentV1**](DeploymentV1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A deployment of a model. |  -  |

<a name="getProductionDetails"></a>
# **getProductionDetails**
> DeploymentV1 getProductionDetails(modelId).execute();

Gets a model&#39;s production deployment

Gets a model&#39;s production deployment and returns the deployment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baseten;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DeploymentApi;
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
    try {
      DeploymentV1 result = client
              .deployment
              .getProductionDetails(modelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getName());
      System.out.println(result.getModelId());
      System.out.println(result.getIsProduction());
      System.out.println(result.getIsDevelopment());
      System.out.println(result.getStatus());
      System.out.println(result.getActiveReplicaCount());
      System.out.println(result.getAutoscalingSettings());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentApi#getProductionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeploymentV1> response = client
              .deployment
              .getProductionDetails(modelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentApi#getProductionDetails");
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

### Return type

[**DeploymentV1**](DeploymentV1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A deployment of a model. |  -  |

