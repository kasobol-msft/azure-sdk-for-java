/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.management.network.v2020_03_01.ApplicationGatewayBackendAddressPool;
import com.microsoft.azure.management.network.v2020_03_01.ApplicationGatewayBackendHealthHttpSettings;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of on demand test probe.
 */
public class ApplicationGatewayBackendHealthOnDemandInner {
    /**
     * Reference to an ApplicationGatewayBackendAddressPool resource.
     */
    @JsonProperty(value = "backendAddressPool")
    private ApplicationGatewayBackendAddressPool backendAddressPool;

    /**
     * Application gateway BackendHealthHttp settings.
     */
    @JsonProperty(value = "backendHealthHttpSettings")
    private ApplicationGatewayBackendHealthHttpSettings backendHealthHttpSettings;

    /**
     * Get reference to an ApplicationGatewayBackendAddressPool resource.
     *
     * @return the backendAddressPool value
     */
    public ApplicationGatewayBackendAddressPool backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set reference to an ApplicationGatewayBackendAddressPool resource.
     *
     * @param backendAddressPool the backendAddressPool value to set
     * @return the ApplicationGatewayBackendHealthOnDemandInner object itself.
     */
    public ApplicationGatewayBackendHealthOnDemandInner withBackendAddressPool(ApplicationGatewayBackendAddressPool backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get application gateway BackendHealthHttp settings.
     *
     * @return the backendHealthHttpSettings value
     */
    public ApplicationGatewayBackendHealthHttpSettings backendHealthHttpSettings() {
        return this.backendHealthHttpSettings;
    }

    /**
     * Set application gateway BackendHealthHttp settings.
     *
     * @param backendHealthHttpSettings the backendHealthHttpSettings value to set
     * @return the ApplicationGatewayBackendHealthOnDemandInner object itself.
     */
    public ApplicationGatewayBackendHealthOnDemandInner withBackendHealthHttpSettings(ApplicationGatewayBackendHealthHttpSettings backendHealthHttpSettings) {
        this.backendHealthHttpSettings = backendHealthHttpSettings;
        return this;
    }

}
