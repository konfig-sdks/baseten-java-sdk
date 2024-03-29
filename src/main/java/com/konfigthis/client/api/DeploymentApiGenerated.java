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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.DeploymentV1;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DeploymentApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DeploymentApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public DeploymentApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getApiKeyAuth() == null) {
            throw new IllegalArgumentException("\"Authorization\" is required but no API key was provided. Please set \"Authorization\" with ApiClient#setApiKeyAuth(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call detailsGetCall(String modelId, String deploymentId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/models/{model_id}/deployments/{deployment_id}"
            .replace("{" + "model_id" + "}", localVarApiClient.escapeString(modelId.toString()))
            .replace("{" + "deployment_id" + "}", localVarApiClient.escapeString(deploymentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call detailsGetValidateBeforeCall(String modelId, String deploymentId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new ApiException("Missing the required parameter 'modelId' when calling detailsGet(Async)");
        }

        // verify the required parameter 'deploymentId' is set
        if (deploymentId == null) {
            throw new ApiException("Missing the required parameter 'deploymentId' when calling detailsGet(Async)");
        }

        return detailsGetCall(modelId, deploymentId, _callback);

    }


    private ApiResponse<DeploymentV1> detailsGetWithHttpInfo(String modelId, String deploymentId) throws ApiException {
        okhttp3.Call localVarCall = detailsGetValidateBeforeCall(modelId, deploymentId, null);
        Type localVarReturnType = new TypeToken<DeploymentV1>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call detailsGetAsync(String modelId, String deploymentId, final ApiCallback<DeploymentV1> _callback) throws ApiException {

        okhttp3.Call localVarCall = detailsGetValidateBeforeCall(modelId, deploymentId, _callback);
        Type localVarReturnType = new TypeToken<DeploymentV1>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class DetailsGetRequestBuilder {
        private final String modelId;
        private final String deploymentId;

        private DetailsGetRequestBuilder(String modelId, String deploymentId) {
            this.modelId = modelId;
            this.deploymentId = deploymentId;
        }

        /**
         * Build call for detailsGet
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A deployment of a model. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return detailsGetCall(modelId, deploymentId, _callback);
        }


        /**
         * Execute detailsGet request
         * @return DeploymentV1
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A deployment of a model. </td><td>  -  </td></tr>
         </table>
         */
        public DeploymentV1 execute() throws ApiException {
            ApiResponse<DeploymentV1> localVarResp = detailsGetWithHttpInfo(modelId, deploymentId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute detailsGet request with HTTP info returned
         * @return ApiResponse&lt;DeploymentV1&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A deployment of a model. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<DeploymentV1> executeWithHttpInfo() throws ApiException {
            return detailsGetWithHttpInfo(modelId, deploymentId);
        }

        /**
         * Execute detailsGet request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A deployment of a model. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<DeploymentV1> _callback) throws ApiException {
            return detailsGetAsync(modelId, deploymentId, _callback);
        }
    }

    /**
     * Gets a model&#39;s deployment by id
     * Gets a model&#39;s deployment by id and returns the deployment.
     * @param modelId  (required)
     * @param deploymentId  (required)
     * @return DetailsGetRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A deployment of a model. </td><td>  -  </td></tr>
     </table>
     */
    public DetailsGetRequestBuilder detailsGet(String modelId, String deploymentId) throws IllegalArgumentException {
        if (modelId == null) throw new IllegalArgumentException("\"modelId\" is required but got null");
            

        if (deploymentId == null) throw new IllegalArgumentException("\"deploymentId\" is required but got null");
            

        return new DetailsGetRequestBuilder(modelId, deploymentId);
    }
    private okhttp3.Call getDevelopmentDetailsCall(String modelId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/models/{model_id}/deployments/development"
            .replace("{" + "model_id" + "}", localVarApiClient.escapeString(modelId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDevelopmentDetailsValidateBeforeCall(String modelId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new ApiException("Missing the required parameter 'modelId' when calling getDevelopmentDetails(Async)");
        }

        return getDevelopmentDetailsCall(modelId, _callback);

    }


    private ApiResponse<DeploymentV1> getDevelopmentDetailsWithHttpInfo(String modelId) throws ApiException {
        okhttp3.Call localVarCall = getDevelopmentDetailsValidateBeforeCall(modelId, null);
        Type localVarReturnType = new TypeToken<DeploymentV1>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDevelopmentDetailsAsync(String modelId, final ApiCallback<DeploymentV1> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDevelopmentDetailsValidateBeforeCall(modelId, _callback);
        Type localVarReturnType = new TypeToken<DeploymentV1>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDevelopmentDetailsRequestBuilder {
        private final String modelId;

        private GetDevelopmentDetailsRequestBuilder(String modelId) {
            this.modelId = modelId;
        }

        /**
         * Build call for getDevelopmentDetails
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A deployment of a model. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getDevelopmentDetailsCall(modelId, _callback);
        }


        /**
         * Execute getDevelopmentDetails request
         * @return DeploymentV1
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A deployment of a model. </td><td>  -  </td></tr>
         </table>
         */
        public DeploymentV1 execute() throws ApiException {
            ApiResponse<DeploymentV1> localVarResp = getDevelopmentDetailsWithHttpInfo(modelId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getDevelopmentDetails request with HTTP info returned
         * @return ApiResponse&lt;DeploymentV1&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A deployment of a model. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<DeploymentV1> executeWithHttpInfo() throws ApiException {
            return getDevelopmentDetailsWithHttpInfo(modelId);
        }

        /**
         * Execute getDevelopmentDetails request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A deployment of a model. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<DeploymentV1> _callback) throws ApiException {
            return getDevelopmentDetailsAsync(modelId, _callback);
        }
    }

    /**
     * Gets a model&#39;s development deployment
     * Gets a model&#39;s development deployment and returns the deployment.
     * @param modelId  (required)
     * @return GetDevelopmentDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A deployment of a model. </td><td>  -  </td></tr>
     </table>
     */
    public GetDevelopmentDetailsRequestBuilder getDevelopmentDetails(String modelId) throws IllegalArgumentException {
        if (modelId == null) throw new IllegalArgumentException("\"modelId\" is required but got null");
            

        return new GetDevelopmentDetailsRequestBuilder(modelId);
    }
    private okhttp3.Call getProductionDetailsCall(String modelId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/models/{model_id}/deployments/production"
            .replace("{" + "model_id" + "}", localVarApiClient.escapeString(modelId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getProductionDetailsValidateBeforeCall(String modelId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new ApiException("Missing the required parameter 'modelId' when calling getProductionDetails(Async)");
        }

        return getProductionDetailsCall(modelId, _callback);

    }


    private ApiResponse<DeploymentV1> getProductionDetailsWithHttpInfo(String modelId) throws ApiException {
        okhttp3.Call localVarCall = getProductionDetailsValidateBeforeCall(modelId, null);
        Type localVarReturnType = new TypeToken<DeploymentV1>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getProductionDetailsAsync(String modelId, final ApiCallback<DeploymentV1> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductionDetailsValidateBeforeCall(modelId, _callback);
        Type localVarReturnType = new TypeToken<DeploymentV1>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetProductionDetailsRequestBuilder {
        private final String modelId;

        private GetProductionDetailsRequestBuilder(String modelId) {
            this.modelId = modelId;
        }

        /**
         * Build call for getProductionDetails
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A deployment of a model. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getProductionDetailsCall(modelId, _callback);
        }


        /**
         * Execute getProductionDetails request
         * @return DeploymentV1
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A deployment of a model. </td><td>  -  </td></tr>
         </table>
         */
        public DeploymentV1 execute() throws ApiException {
            ApiResponse<DeploymentV1> localVarResp = getProductionDetailsWithHttpInfo(modelId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getProductionDetails request with HTTP info returned
         * @return ApiResponse&lt;DeploymentV1&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A deployment of a model. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<DeploymentV1> executeWithHttpInfo() throws ApiException {
            return getProductionDetailsWithHttpInfo(modelId);
        }

        /**
         * Execute getProductionDetails request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A deployment of a model. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<DeploymentV1> _callback) throws ApiException {
            return getProductionDetailsAsync(modelId, _callback);
        }
    }

    /**
     * Gets a model&#39;s production deployment
     * Gets a model&#39;s production deployment and returns the deployment.
     * @param modelId  (required)
     * @return GetProductionDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A deployment of a model. </td><td>  -  </td></tr>
     </table>
     */
    public GetProductionDetailsRequestBuilder getProductionDetails(String modelId) throws IllegalArgumentException {
        if (modelId == null) throw new IllegalArgumentException("\"modelId\" is required but got null");
            

        return new GetProductionDetailsRequestBuilder(modelId);
    }
}
