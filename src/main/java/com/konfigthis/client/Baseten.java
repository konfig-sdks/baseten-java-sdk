package com.konfigthis.client;

import com.konfigthis.client.api.AutoscalingSettingApi;
import com.konfigthis.client.api.DeploymentApi;
import com.konfigthis.client.api.ModelApi;
import com.konfigthis.client.api.SecretApi;

public class Baseten {
    private ApiClient apiClient;
    public final AutoscalingSettingApi autoscalingSetting;
    public final DeploymentApi deployment;
    public final ModelApi model;
    public final SecretApi secret;

    public Baseten() {
        this(null);
    }

    public Baseten(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.autoscalingSetting = new AutoscalingSettingApi(this.apiClient);
        this.deployment = new DeploymentApi(this.apiClient);
        this.model = new ModelApi(this.apiClient);
        this.secret = new SecretApi(this.apiClient);
    }

}
