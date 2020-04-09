// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RecommendedMachineConfiguration model.
 */
@Fluent
public final class RecommendedMachineConfiguration {
    /*
     * Describes the resource range.
     */
    @JsonProperty(value = "vCPUs")
    private ResourceRange vCPUs;

    /*
     * Describes the resource range.
     */
    @JsonProperty(value = "memory")
    private ResourceRange memory;

    /**
     * Get the vCPUs property: Describes the resource range.
     * 
     * @return the vCPUs value.
     */
    public ResourceRange vCPUs() {
        return this.vCPUs;
    }

    /**
     * Set the vCPUs property: Describes the resource range.
     * 
     * @param vCPUs the vCPUs value to set.
     * @return the RecommendedMachineConfiguration object itself.
     */
    public RecommendedMachineConfiguration withVCPUs(ResourceRange vCPUs) {
        this.vCPUs = vCPUs;
        return this;
    }

    /**
     * Get the memory property: Describes the resource range.
     * 
     * @return the memory value.
     */
    public ResourceRange memory() {
        return this.memory;
    }

    /**
     * Set the memory property: Describes the resource range.
     * 
     * @param memory the memory value to set.
     * @return the RecommendedMachineConfiguration object itself.
     */
    public RecommendedMachineConfiguration withMemory(ResourceRange memory) {
        this.memory = memory;
        return this;
    }
}
