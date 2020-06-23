/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response for the CheckPrivateLinkServiceVisibility API service call.
 */
public class PrivateLinkServiceVisibilityInner {
    /**
     * Private Link Service Visibility (True/False).
     */
    @JsonProperty(value = "visible")
    private Boolean visible;

    /**
     * Get private Link Service Visibility (True/False).
     *
     * @return the visible value
     */
    public Boolean visible() {
        return this.visible;
    }

    /**
     * Set private Link Service Visibility (True/False).
     *
     * @param visible the visible value to set
     * @return the PrivateLinkServiceVisibilityInner object itself.
     */
    public PrivateLinkServiceVisibilityInner withVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

}
