// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds model.
 */
@Fluent
public final class ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds {
    /*
     * Minimum number of scale units deployed for ExpressRoute gateway.
     */
    @JsonProperty(value = "min")
    private Integer min;

    /*
     * Maximum number of scale units deployed for ExpressRoute gateway.
     */
    @JsonProperty(value = "max")
    private Integer max;

    /**
     * Get the min property: Minimum number of scale units deployed for
     * ExpressRoute gateway.
     * 
     * @return the min value.
     */
    public Integer min() {
        return this.min;
    }

    /**
     * Set the min property: Minimum number of scale units deployed for
     * ExpressRoute gateway.
     * 
     * @param min the min value to set.
     * @return the ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds
     * object itself.
     */
    public ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * Get the max property: Maximum number of scale units deployed for
     * ExpressRoute gateway.
     * 
     * @return the max value.
     */
    public Integer max() {
        return this.max;
    }

    /**
     * Set the max property: Maximum number of scale units deployed for
     * ExpressRoute gateway.
     * 
     * @param max the max value to set.
     * @return the ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds
     * object itself.
     */
    public ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds withMax(Integer max) {
        this.max = max;
        return this;
    }
}
