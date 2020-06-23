/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * NAT rule collection resource.
 */
@JsonFlatten
public class AzureFirewallNatRuleCollection extends SubResource {
    /**
     * Priority of the NAT rule collection resource.
     */
    @JsonProperty(value = "properties.priority")
    private Integer priority;

    /**
     * The action type of a NAT rule collection.
     */
    @JsonProperty(value = "properties.action")
    private AzureFirewallNatRCAction action;

    /**
     * Collection of rules used by a NAT rule collection.
     */
    @JsonProperty(value = "properties.rules")
    private List<AzureFirewallNatRule> rules;

    /**
     * The provisioning state of the NAT rule collection resource. Possible
     * values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The name of the resource that is unique within the Azure firewall. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get priority of the NAT rule collection resource.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set priority of the NAT rule collection resource.
     *
     * @param priority the priority value to set
     * @return the AzureFirewallNatRuleCollection object itself.
     */
    public AzureFirewallNatRuleCollection withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the action type of a NAT rule collection.
     *
     * @return the action value
     */
    public AzureFirewallNatRCAction action() {
        return this.action;
    }

    /**
     * Set the action type of a NAT rule collection.
     *
     * @param action the action value to set
     * @return the AzureFirewallNatRuleCollection object itself.
     */
    public AzureFirewallNatRuleCollection withAction(AzureFirewallNatRCAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get collection of rules used by a NAT rule collection.
     *
     * @return the rules value
     */
    public List<AzureFirewallNatRule> rules() {
        return this.rules;
    }

    /**
     * Set collection of rules used by a NAT rule collection.
     *
     * @param rules the rules value to set
     * @return the AzureFirewallNatRuleCollection object itself.
     */
    public AzureFirewallNatRuleCollection withRules(List<AzureFirewallNatRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the provisioning state of the NAT rule collection resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name of the resource that is unique within the Azure firewall. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within the Azure firewall. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the AzureFirewallNatRuleCollection object itself.
     */
    public AzureFirewallNatRuleCollection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
