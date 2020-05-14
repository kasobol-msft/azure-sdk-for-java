// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TagCount model. */
@Fluent
public final class TagCount {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TagCount.class);

    /*
     * Type of count.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Value of count.
     */
    @JsonProperty(value = "value")
    private Integer value;

    /**
     * Get the type property: Type of count.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of count.
     *
     * @param type the type value to set.
     * @return the TagCount object itself.
     */
    public TagCount withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value property: Value of count.
     *
     * @return the value value.
     */
    public Integer value() {
        return this.value;
    }

    /**
     * Set the value property: Value of count.
     *
     * @param value the value value to set.
     * @return the TagCount object itself.
     */
    public TagCount withValue(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
