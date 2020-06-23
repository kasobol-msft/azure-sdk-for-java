/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2020_05_01.implementation.LoadBalancerProbesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing LoadBalancerProbes.
 */
public interface LoadBalancerProbes extends HasInner<LoadBalancerProbesInner> {
    /**
     * Gets load balancer probe.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param probeName The name of the probe.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Probe> getAsync(String resourceGroupName, String loadBalancerName, String probeName);

    /**
     * Gets all the load balancer probes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Probe> listAsync(final String resourceGroupName, final String loadBalancerName);

}
