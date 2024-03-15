

# UpdateAutoscalingSettingsV1

A request to update autoscaling settings for a deployment. All fields are optional, and we only update ones passed in.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**minReplica** | **Integer** | Minimum number of replicas |  [optional] |
|**maxReplica** | **Integer** | Maximum number of replicas |  [optional] |
|**autoscalingWindow** | **Integer** | Timeframe of traffic considered for autoscaling decisions |  [optional] |
|**scaleDownDelay** | **Integer** | Waiting period before scaling down any active replica |  [optional] |
|**concurrencyTarget** | **Integer** | Number of requests per replica before scaling up |  [optional] |



