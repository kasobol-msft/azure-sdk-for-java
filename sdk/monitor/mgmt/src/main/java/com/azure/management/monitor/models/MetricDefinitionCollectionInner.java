// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The MetricDefinitionCollection model.
 */
@Fluent
public final class MetricDefinitionCollectionInner {
    /*
     * the values for the metric definitions.
     */
    @JsonProperty(value = "value", required = true)
    private List<MetricDefinitionInner> value;

    /**
     * Get the value property: the values for the metric definitions.
     * 
     * @return the value value.
     */
    public List<MetricDefinitionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: the values for the metric definitions.
     * 
     * @param value the value value to set.
     * @return the MetricDefinitionCollectionInner object itself.
     */
    public MetricDefinitionCollectionInner withValue(List<MetricDefinitionInner> value) {
        this.value = value;
        return this;
    }
}
