# SecretApi

All URIs are relative to *https://api.baseten.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllSecrets**](SecretApi.md#getAllSecrets) | **GET** /v1/secrets | Gets all secrets |
| [**upsertNewSecret**](SecretApi.md#upsertNewSecret) | **POST** /v1/secrets | Upserts a secret |


<a name="getAllSecrets"></a>
# **getAllSecrets**
> SecretsV1 getAllSecrets().execute();

Gets all secrets

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baseten;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SecretApi;
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
      SecretsV1 result = client
              .secret
              .getAllSecrets()
              .execute();
      System.out.println(result);
      System.out.println(result.getSecrets());
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretApi#getAllSecrets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SecretsV1> response = client
              .secret
              .getAllSecrets()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretApi#getAllSecrets");
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

[**SecretsV1**](SecretsV1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Baseten secrets. |  -  |

<a name="upsertNewSecret"></a>
# **upsertNewSecret**
> SecretV1 upsertNewSecret(upsertSecretRequestV1).execute();

Upserts a secret

Creates a new secret or updates an existing secret if one with the provided name already exists. The name and creation date of the created or updated secret is returned.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baseten;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SecretApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baseten.co";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    Baseten client = new Baseten(configuration);
    String name = "name_example"; // Name of the new or existing secret
    String value = "value_example"; // Value of the secret
    try {
      SecretV1 result = client
              .secret
              .upsertNewSecret(name, value)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreatedAt());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretApi#upsertNewSecret");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SecretV1> response = client
              .secret
              .upsertNewSecret(name, value)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretApi#upsertNewSecret");
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
| **upsertSecretRequestV1** | [**UpsertSecretRequestV1**](UpsertSecretRequestV1.md)|  | |

### Return type

[**SecretV1**](SecretV1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Baseten secret. Note that we do not support retrieving secret values. |  -  |

