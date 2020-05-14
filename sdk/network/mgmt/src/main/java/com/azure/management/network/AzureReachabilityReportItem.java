// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AzureReachabilityReportItem model. */
@Fluent
public final class AzureReachabilityReportItem {
    /*
     * The Internet service provider.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * The Azure region.
     */
    @JsonProperty(value = "azureLocation")
    private String azureLocation;

    /*
     * List of latency details for each of the time series.
     */
    @JsonProperty(value = "latencies")
    private List<AzureReachabilityReportLatencyInfo> latencies;

    /**
     * Get the provider property: The Internet service provider.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: The Internet service provider.
     *
     * @param provider the provider value to set.
     * @return the AzureReachabilityReportItem object itself.
     */
    public AzureReachabilityReportItem withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the azureLocation property: The Azure region.
     *
     * @return the azureLocation value.
     */
    public String azureLocation() {
        return this.azureLocation;
    }

    /**
     * Set the azureLocation property: The Azure region.
     *
     * @param azureLocation the azureLocation value to set.
     * @return the AzureReachabilityReportItem object itself.
     */
    public AzureReachabilityReportItem withAzureLocation(String azureLocation) {
        this.azureLocation = azureLocation;
        return this;
    }

    /**
     * Get the latencies property: List of latency details for each of the time series.
     *
     * @return the latencies value.
     */
    public List<AzureReachabilityReportLatencyInfo> latencies() {
        return this.latencies;
    }

    /**
     * Set the latencies property: List of latency details for each of the time series.
     *
     * @param latencies the latencies value to set.
     * @return the AzureReachabilityReportItem object itself.
     */
    public AzureReachabilityReportItem withLatencies(List<AzureReachabilityReportLatencyInfo> latencies) {
        this.latencies = latencies;
        return this;
    }
}
