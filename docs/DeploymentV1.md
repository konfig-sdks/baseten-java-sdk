

# DeploymentV1

A deployment of a model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the deployment |  |
|**createdAt** | **OffsetDateTime** | Time the deployment was created in ISO 8601 format |  |
|**name** | **String** | Name of the deployment |  |
|**modelId** | **String** | Unique identifier of the model |  |
|**isProduction** | **Boolean** | Whether the deployment is the production deployment of the model |  |
|**isDevelopment** | **Boolean** | Whether the deployment is the development deployment of the model |  |
|**status** | **DeploymentStatusV1** | Status of the deployment |  |
|**activeReplicaCount** | **Integer** | Number of active replicas |  |
|**autoscalingSettings** | [**AutoscalingSettingsV1**](AutoscalingSettingsV1.md) | Autoscaling settings for the deployment |  |



