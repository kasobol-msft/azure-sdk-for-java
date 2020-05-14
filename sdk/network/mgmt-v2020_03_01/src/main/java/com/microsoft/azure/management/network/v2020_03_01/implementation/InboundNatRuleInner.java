/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_03_01.TransportProtocol;
import com.microsoft.azure.management.network.v2020_03_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Inbound NAT rule of the load balancer.
 */
@JsonFlatten
public class InboundNatRuleInner extends SubResource {
    /**
     * A reference to frontend IP addresses.
     */
    @JsonProperty(value = "properties.frontendIPConfiguration")
    private SubResource frontendIPConfiguration;

    /**
     * A reference to a private IP address defined on a network interface of a
     * VM. Traffic sent to the frontend port of each of the frontend IP
     * configurations is forwarded to the backend IP.
     */
    @JsonProperty(value = "properties.backendIPConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkInterfaceIPConfigurationInner backendIPConfiguration;

    /**
     * The reference to the transport protocol used by the load balancing rule.
     * Possible values include: 'Udp', 'Tcp', 'All'.
     */
    @JsonProperty(value = "properties.protocol")
    private TransportProtocol protocol;

    /**
     * The port for the external endpoint. Port numbers for each rule must be
     * unique within the Load Balancer. Acceptable values range from 1 to
     * 65534.
     */
    @JsonProperty(value = "properties.frontendPort")
    private Integer frontendPort;

    /**
     * The port used for the internal endpoint. Acceptable values range from 1
     * to 65535.
     */
    @JsonProperty(value = "properties.backendPort")
    private Integer backendPort;

    /**
     * The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only
     * used when the protocol is set to TCP.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /**
     * Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is
     * required when using the SQL AlwaysOn Availability Groups in SQL server.
     * This setting can't be changed after you create the endpoint.
     */
    @JsonProperty(value = "properties.enableFloatingIP")
    private Boolean enableFloatingIP;

    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is
     * set to TCP.
     */
    @JsonProperty(value = "properties.enableTcpReset")
    private Boolean enableTcpReset;

    /**
     * The provisioning state of the inbound NAT rule resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The name of the resource that is unique within the set of inbound NAT
     * rules used by the load balancer. This name can be used to access the
     * resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get a reference to frontend IP addresses.
     *
     * @return the frontendIPConfiguration value
     */
    public SubResource frontendIPConfiguration() {
        return this.frontendIPConfiguration;
    }

    /**
     * Set a reference to frontend IP addresses.
     *
     * @param frontendIPConfiguration the frontendIPConfiguration value to set
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withFrontendIPConfiguration(SubResource frontendIPConfiguration) {
        this.frontendIPConfiguration = frontendIPConfiguration;
        return this;
    }

    /**
     * Get a reference to a private IP address defined on a network interface of a VM. Traffic sent to the frontend port of each of the frontend IP configurations is forwarded to the backend IP.
     *
     * @return the backendIPConfiguration value
     */
    public NetworkInterfaceIPConfigurationInner backendIPConfiguration() {
        return this.backendIPConfiguration;
    }

    /**
     * Get the reference to the transport protocol used by the load balancing rule. Possible values include: 'Udp', 'Tcp', 'All'.
     *
     * @return the protocol value
     */
    public TransportProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the reference to the transport protocol used by the load balancing rule. Possible values include: 'Udp', 'Tcp', 'All'.
     *
     * @param protocol the protocol value to set
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withProtocol(TransportProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values range from 1 to 65534.
     *
     * @return the frontendPort value
     */
    public Integer frontendPort() {
        return this.frontendPort;
    }

    /**
     * Set the port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values range from 1 to 65534.
     *
     * @param frontendPort the frontendPort value to set
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }

    /**
     * Get the port used for the internal endpoint. Acceptable values range from 1 to 65535.
     *
     * @return the backendPort value
     */
    public Integer backendPort() {
        return this.backendPort;
    }

    /**
     * Set the port used for the internal endpoint. Acceptable values range from 1 to 65535.
     *
     * @param backendPort the backendPort value to set
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    /**
     * Get the timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @return the idleTimeoutInMinutes value
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get configures a virtual machine's endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @return the enableFloatingIP value
     */
    public Boolean enableFloatingIP() {
        return this.enableFloatingIP;
    }

    /**
     * Set configures a virtual machine's endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @param enableFloatingIP the enableFloatingIP value to set
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withEnableFloatingIP(Boolean enableFloatingIP) {
        this.enableFloatingIP = enableFloatingIP;
        return this;
    }

    /**
     * Get receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     *
     * @return the enableTcpReset value
     */
    public Boolean enableTcpReset() {
        return this.enableTcpReset;
    }

    /**
     * Set receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     *
     * @param enableTcpReset the enableTcpReset value to set
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withEnableTcpReset(Boolean enableTcpReset) {
        this.enableTcpReset = enableTcpReset;
        return this;
    }

    /**
     * Get the provisioning state of the inbound NAT rule resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name of the resource that is unique within the set of inbound NAT rules used by the load balancer. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within the set of inbound NAT rules used by the load balancer. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withName(String name) {
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

    /**
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
