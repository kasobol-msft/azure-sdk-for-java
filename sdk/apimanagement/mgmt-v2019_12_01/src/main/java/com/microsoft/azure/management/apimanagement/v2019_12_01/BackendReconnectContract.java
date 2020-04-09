/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Reconnect request parameters.
 */
@JsonFlatten
public class BackendReconnectContract extends ProxyResource {
    /**
     * Duration in ISO8601 format after which reconnect will be initiated.
     * Minimum duration of the Reconnect is PT2M.
     */
    @JsonProperty(value = "properties.after")
    private Period after;

    /**
     * Get duration in ISO8601 format after which reconnect will be initiated. Minimum duration of the Reconnect is PT2M.
     *
     * @return the after value
     */
    public Period after() {
        return this.after;
    }

    /**
     * Set duration in ISO8601 format after which reconnect will be initiated. Minimum duration of the Reconnect is PT2M.
     *
     * @param after the after value to set
     * @return the BackendReconnectContract object itself.
     */
    public BackendReconnectContract withAfter(Period after) {
        this.after = after;
        return this;
    }

}
