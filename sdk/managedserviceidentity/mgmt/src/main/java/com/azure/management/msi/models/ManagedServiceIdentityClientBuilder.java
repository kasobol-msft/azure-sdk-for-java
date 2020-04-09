// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.msi.models;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;

/**
 * A builder for creating a new instance of the ManagedServiceIdentityClientImpl type.
 */
@ServiceClientBuilder(serviceClients = ManagedServiceIdentityClientImpl.class)
public final class ManagedServiceIdentityClientBuilder {
    /*
     * The Id of the Subscription to which the identity belongs.
     */
    private String subscriptionId;

    /**
     * Sets The Id of the Subscription to which the identity belongs.
     * 
     * @param subscriptionId the subscriptionId value.
     * @return the ManagedServiceIdentityClientBuilder.
     */
    public ManagedServiceIdentityClientBuilder subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /*
     * server parameter
     */
    private String host;

    /**
     * Sets server parameter.
     * 
     * @param host the host value.
     * @return the ManagedServiceIdentityClientBuilder.
     */
    public ManagedServiceIdentityClientBuilder host(String host) {
        this.host = host;
        return this;
    }

    /*
     * The API version to use for this operation.
     */
    private String apiVersion;

    /**
     * Sets The API version to use for this operation.
     * 
     * @param apiVersion the apiVersion value.
     * @return the ManagedServiceIdentityClientBuilder.
     */
    public ManagedServiceIdentityClientBuilder apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /*
     * The environment to connect to
     */
    private AzureEnvironment environment;

    /**
     * Sets The environment to connect to.
     * 
     * @param environment the environment value.
     * @return the ManagedServiceIdentityClientBuilder.
     */
    public ManagedServiceIdentityClientBuilder environment(AzureEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     * 
     * @param pipeline the pipeline value.
     * @return the ManagedServiceIdentityClientBuilder.
     */
    public ManagedServiceIdentityClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of ManagedServiceIdentityClientImpl with the provided parameters.
     * 
     * @return an instance of ManagedServiceIdentityClientImpl.
     */
    public ManagedServiceIdentityClientImpl build() {
        if (host == null) {
            this.host = "https://management.azure.com";
        }
        if (apiVersion == null) {
            this.apiVersion = "2018-11-30";
        }
        if (environment == null) {
            this.environment = AzureEnvironment.AZURE;
        }
        if (pipeline == null) {
            this.pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
        }
        ManagedServiceIdentityClientImpl client = new ManagedServiceIdentityClientImpl(pipeline, environment);
        client.setSubscriptionId(this.subscriptionId);
        client.setHost(this.host);
        client.setApiVersion(this.apiVersion);
        return client;
    }
}
