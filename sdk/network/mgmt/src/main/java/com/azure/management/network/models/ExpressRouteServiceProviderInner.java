// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.management.network.ExpressRouteServiceProviderBandwidthsOffered;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ExpressRouteServiceProvider model. */
@JsonFlatten
@Fluent
public class ExpressRouteServiceProviderInner extends Resource {
    /*
     * Get a list of peering locations.
     */
    @JsonProperty(value = "properties.peeringLocations")
    private List<String> peeringLocations;

    /*
     * Gets bandwidths offered.
     */
    @JsonProperty(value = "properties.bandwidthsOffered")
    private List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered;

    /*
     * Gets the provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the peeringLocations property: Get a list of peering locations.
     *
     * @return the peeringLocations value.
     */
    public List<String> peeringLocations() {
        return this.peeringLocations;
    }

    /**
     * Set the peeringLocations property: Get a list of peering locations.
     *
     * @param peeringLocations the peeringLocations value to set.
     * @return the ExpressRouteServiceProviderInner object itself.
     */
    public ExpressRouteServiceProviderInner withPeeringLocations(List<String> peeringLocations) {
        this.peeringLocations = peeringLocations;
        return this;
    }

    /**
     * Get the bandwidthsOffered property: Gets bandwidths offered.
     *
     * @return the bandwidthsOffered value.
     */
    public List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered() {
        return this.bandwidthsOffered;
    }

    /**
     * Set the bandwidthsOffered property: Gets bandwidths offered.
     *
     * @param bandwidthsOffered the bandwidthsOffered value to set.
     * @return the ExpressRouteServiceProviderInner object itself.
     */
    public ExpressRouteServiceProviderInner withBandwidthsOffered(
        List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered) {
        this.bandwidthsOffered = bandwidthsOffered;
        return this;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Gets the provisioning state of the resource.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ExpressRouteServiceProviderInner object itself.
     */
    public ExpressRouteServiceProviderInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the ExpressRouteServiceProviderInner object itself.
     */
    public ExpressRouteServiceProviderInner withId(String id) {
        this.id = id;
        return this;
    }
}
