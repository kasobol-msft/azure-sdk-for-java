/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The current state of a private endpoint connection.
 */
public class ConnectionState {
    /**
     * The status of a private endpoint connection. Possible values include:
     * 'Pending', 'Approved', 'Rejected', 'Disconnected'.
     */
    @JsonProperty(value = "status", required = true)
    private PrivateLinkServiceConnectionStatus status;

    /**
     * The description for the current state of a private endpoint connection.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /**
     * Actions required for a private endpoint connection.
     */
    @JsonProperty(value = "actionsRequired")
    private String actionsRequired;

    /**
     * Get the status of a private endpoint connection. Possible values include: 'Pending', 'Approved', 'Rejected', 'Disconnected'.
     *
     * @return the status value
     */
    public PrivateLinkServiceConnectionStatus status() {
        return this.status;
    }

    /**
     * Set the status of a private endpoint connection. Possible values include: 'Pending', 'Approved', 'Rejected', 'Disconnected'.
     *
     * @param status the status value to set
     * @return the ConnectionState object itself.
     */
    public ConnectionState withStatus(PrivateLinkServiceConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description for the current state of a private endpoint connection.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description for the current state of a private endpoint connection.
     *
     * @param description the description value to set
     * @return the ConnectionState object itself.
     */
    public ConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get actions required for a private endpoint connection.
     *
     * @return the actionsRequired value
     */
    public String actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * Set actions required for a private endpoint connection.
     *
     * @param actionsRequired the actionsRequired value to set
     * @return the ConnectionState object itself.
     */
    public ConnectionState withActionsRequired(String actionsRequired) {
        this.actionsRequired = actionsRequired;
        return this;
    }

}
