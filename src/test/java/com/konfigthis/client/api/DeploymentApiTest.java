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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.DeploymentV1;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeploymentApi
 */
@Disabled
public class DeploymentApiTest {

    private static DeploymentApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DeploymentApi(apiClient);
    }

    /**
     * Gets a model&#39;s deployment by id
     *
     * Gets a model&#39;s deployment by id and returns the deployment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void detailsGetTest() throws ApiException {
        String modelId = null;
        String deploymentId = null;
        DeploymentV1 response = api.detailsGet(modelId, deploymentId)
                .execute();
        // TODO: test validations
    }

    /**
     * Gets a model&#39;s development deployment
     *
     * Gets a model&#39;s development deployment and returns the deployment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDevelopmentDetailsTest() throws ApiException {
        String modelId = null;
        DeploymentV1 response = api.getDevelopmentDetails(modelId)
                .execute();
        // TODO: test validations
    }

    /**
     * Gets a model&#39;s production deployment
     *
     * Gets a model&#39;s production deployment and returns the deployment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProductionDetailsTest() throws ApiException {
        String modelId = null;
        DeploymentV1 response = api.getProductionDetails(modelId)
                .execute();
        // TODO: test validations
    }

}
