

# AutoscalingSettingsV1

Autoscaling settings for a deployment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**minReplica** | **Integer** | Minimum number of replicas |  |
|**maxReplica** | **Integer** | Maximum number of replicas |  |
|**autoscalingWindow** | **Integer** | Timeframe of traffic considered for autoscaling decisions |  |
|**scaleDownDelay** | **Integer** | Waiting period before scaling down any active replica |  |
|**concurrencyTarget** | **Integer** | Number of requests per replica before scaling up |  |



