// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LoadBalancerSku model.
 */
@Fluent
public final class LoadBalancerSku {
    /*
     * Name of a load balancer SKU.
     */
    @JsonProperty(value = "name")
    private LoadBalancerSkuName name;

    /**
     * Get the name property: Name of a load balancer SKU.
     * 
     * @return the name value.
     */
    public LoadBalancerSkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Name of a load balancer SKU.
     * 
     * @param name the name value to set.
     * @return the LoadBalancerSku object itself.
     */
    public LoadBalancerSku withName(LoadBalancerSkuName name) {
        this.name = name;
        return this;
    }
}
