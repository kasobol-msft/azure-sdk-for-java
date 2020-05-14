// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ErrorResponse model. */
@Fluent
public final class ErrorResponse {
    /*
     * The error details object.
     */
    @JsonProperty(value = "error")
    private ErrorDetails error;

    /**
     * Get the error property: The error details object.
     *
     * @return the error value.
     */
    public ErrorDetails error() {
        return this.error;
    }

    /**
     * Set the error property: The error details object.
     *
     * @param error the error value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withError(ErrorDetails error) {
        this.error = error;
        return this;
    }
}
