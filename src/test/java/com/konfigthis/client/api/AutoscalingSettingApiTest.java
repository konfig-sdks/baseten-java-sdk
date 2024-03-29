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
import com.konfigthis.client.model.UpdateAutoscalingSettingsResponseV1;
import com.konfigthis.client.model.UpdateAutoscalingSettingsV1;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AutoscalingSettingApi
 */
@Disabled
public class AutoscalingSettingApiTest {

    private static AutoscalingSettingApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AutoscalingSettingApi(apiClient);
    }

    /**
     * Updates a deployment&#39;s autoscaling settings
     *
     * Updates a deployment&#39;s autoscaling settings and returns the update status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDeploymentSettingsTest() throws ApiException {
        String modelId = null;
        String deploymentId = null;
        Integer minReplica = null;
        Integer maxReplica = null;
        Integer autoscalingWindow = null;
        Integer scaleDownDelay = null;
        Integer concurrencyTarget = null;
        UpdateAutoscalingSettingsResponseV1 response = api.updateDeploymentSettings(modelId, deploymentId)
                .minReplica(minReplica)
                .maxReplica(maxReplica)
                .autoscalingWindow(autoscalingWindow)
                .scaleDownDelay(scaleDownDelay)
                .concurrencyTarget(concurrencyTarget)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates a development deployment&#39;s autoscaling settings
     *
     * Updates a development deployment&#39;s autoscaling settings and returns the update status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDevelopmentSettingTest() throws ApiException {
        String modelId = null;
        Integer minReplica = null;
        Integer maxReplica = null;
        Integer autoscalingWindow = null;
        Integer scaleDownDelay = null;
        Integer concurrencyTarget = null;
        UpdateAutoscalingSettingsResponseV1 response = api.updateDevelopmentSetting(modelId)
                .minReplica(minReplica)
                .maxReplica(maxReplica)
                .autoscalingWindow(autoscalingWindow)
                .scaleDownDelay(scaleDownDelay)
                .concurrencyTarget(concurrencyTarget)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates a production deployment&#39;s autoscaling settings
     *
     * Updates a production deployment&#39;s autoscaling settings and returns the update status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateStatusTest() throws ApiException {
        String modelId = null;
        Integer minReplica = null;
        Integer maxReplica = null;
        Integer autoscalingWindow = null;
        Integer scaleDownDelay = null;
        Integer concurrencyTarget = null;
        UpdateAutoscalingSettingsResponseV1 response = api.updateStatus(modelId)
                .minReplica(minReplica)
                .maxReplica(maxReplica)
                .autoscalingWindow(autoscalingWindow)
                .scaleDownDelay(scaleDownDelay)
                .concurrencyTarget(concurrencyTarget)
                .execute();
        // TODO: test validations
    }

}
