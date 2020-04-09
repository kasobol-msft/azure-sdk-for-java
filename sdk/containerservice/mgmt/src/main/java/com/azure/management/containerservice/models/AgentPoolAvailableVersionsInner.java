// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.containerservice.AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AgentPoolAvailableVersions model. */
@JsonFlatten
@Fluent
public class AgentPoolAvailableVersionsInner {
    /*
     * Id of the agent pool available versions.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Name of the agent pool available versions.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Type of the agent pool  available versions.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * List of versions available for agent pool.
     */
    @JsonProperty(value = "properties.agentPoolVersions")
    private List<AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem> agentPoolVersions;

    /**
     * Get the id property: Id of the agent pool available versions.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: Name of the agent pool available versions.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Type of the agent pool available versions.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the agentPoolVersions property: List of versions available for agent pool.
     *
     * @return the agentPoolVersions value.
     */
    public List<AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem> agentPoolVersions() {
        return this.agentPoolVersions;
    }

    /**
     * Set the agentPoolVersions property: List of versions available for agent pool.
     *
     * @param agentPoolVersions the agentPoolVersions value to set.
     * @return the AgentPoolAvailableVersionsInner object itself.
     */
    public AgentPoolAvailableVersionsInner withAgentPoolVersions(
        List<AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem> agentPoolVersions) {
        this.agentPoolVersions = agentPoolVersions;
        return this;
    }
}
