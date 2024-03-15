# ModelApi

All URIs are relative to *https://api.baseten.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deployPromote**](ModelApi.md#deployPromote) | **POST** /v1/models/{model_id}/deployments/development/promote | Promotes a development deployment to production |
| [**deploymentPromote**](ModelApi.md#deploymentPromote) | **POST** /v1/models/{model_id}/deployments/{deployment_id}/promote | Promotes a deployment to production |
| [**getAllDeployments**](ModelApi.md#getAllDeployments) | **GET** /v1/models/{model_id}/deployments | Gets all deployments of a model |
| [**getAllModels**](ModelApi.md#getAllModels) | **GET** /v1/models | Gets all models |
| [**getModelById**](ModelApi.md#getModelById) | **GET** /v1/models/{model_id} | Gets a model by ID |


<a name="deployPromote"></a>
# **deployPromote**
> DeploymentV1 deployPromote(modelId, promoteRequestV1).execute();

Promotes a development deployment to production

Creates a new production deployment from the development deployment, the currently building deployment is returned.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baseten;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ModelApi;
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
    Boolean scaleDownPreviousProduction = true; // Whether to scale down the previous production deployment after promoting
    try {
      DeploymentV1 result = client
              .model
              .deployPromote(modelId)
              .scaleDownPreviousProduction(scaleDownPreviousProduction)
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
      System.err.println("Exception when calling ModelApi#deployPromote");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeploymentV1> response = client
              .model
              .deployPromote(modelId)
              .scaleDownPreviousProduction(scaleDownPreviousProduction)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelApi#deployPromote");
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
| **promoteRequestV1** | [**PromoteRequestV1**](PromoteRequestV1.md)|  | |

### Return type

[**DeploymentV1**](DeploymentV1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A deployment of a model. |  -  |

<a name="deploymentPromote"></a>
# **deploymentPromote**
> DeploymentV1 deploymentPromote(modelId, deploymentId, promoteRequestV1).execute();

Promotes a deployment to production

Promotes an existing deployment to production and returns the same deployment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baseten;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ModelApi;
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
    Boolean scaleDownPreviousProduction = true; // Whether to scale down the previous production deployment after promoting
    try {
      DeploymentV1 result = client
              .model
              .deploymentPromote(modelId, deploymentId)
              .scaleDownPreviousProduction(scaleDownPreviousProduction)
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
      System.err.println("Exception when calling ModelApi#deploymentPromote");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeploymentV1> response = client
              .model
              .deploymentPromote(modelId, deploymentId)
              .scaleDownPreviousProduction(scaleDownPreviousProduction)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelApi#deploymentPromote");
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
| **promoteRequestV1** | [**PromoteRequestV1**](PromoteRequestV1.md)|  | |

### Return type

[**DeploymentV1**](DeploymentV1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A deployment of a model. |  -  |

<a name="getAllDeployments"></a>
# **getAllDeployments**
> DeploymentsV1 getAllDeployments(modelId).execute();

Gets all deployments of a model

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baseten;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ModelApi;
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
      DeploymentsV1 result = client
              .model
              .getAllDeployments(modelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDeployments());
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelApi#getAllDeployments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeploymentsV1> response = client
              .model
              .getAllDeployments(modelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelApi#getAllDeployments");
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

[**DeploymentsV1**](DeploymentsV1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of deployments of a model. |  -  |

<a name="getAllModels"></a>
# **getAllModels**
> ModelsV1 getAllModels().execute();

Gets all models

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baseten;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ModelApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baseten.co";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    Baseten client = new Baseten(configuration);
    try {
      ModelsV1 result = client
              .model
              .getAllModels()
              .execute();
      System.out.println(result);
      System.out.println(result.getModels());
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelApi#getAllModels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsV1> response = client
              .model
              .getAllModels()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelApi#getAllModels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelsV1**](ModelsV1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of models. |  -  |

<a name="getModelById"></a>
# **getModelById**
> ModelV1 getModelById(modelId).execute();

Gets a model by ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baseten;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ModelApi;
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
      ModelV1 result = client
              .model
              .getModelById(modelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getName());
      System.out.println(result.getDeploymentsCount());
      System.out.println(result.getProductionDeploymentId());
      System.out.println(result.getDevelopmentDeploymentId());
      System.out.println(result.getInstanceTypeName());
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelApi#getModelById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelV1> response = client
              .model
              .getModelById(modelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelApi#getModelById");
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

[**ModelV1**](ModelV1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A model. |  -  |

