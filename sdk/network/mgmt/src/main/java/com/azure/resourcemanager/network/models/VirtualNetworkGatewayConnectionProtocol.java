// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VirtualNetworkGatewayConnectionProtocol. */
public final class VirtualNetworkGatewayConnectionProtocol
    extends ExpandableStringEnum<VirtualNetworkGatewayConnectionProtocol> {
    /** Static value IKEv2 for VirtualNetworkGatewayConnectionProtocol. */
    public static final VirtualNetworkGatewayConnectionProtocol IKEV2 = fromString("IKEv2");

    /** Static value IKEv1 for VirtualNetworkGatewayConnectionProtocol. */
    public static final VirtualNetworkGatewayConnectionProtocol IKEV1 = fromString("IKEv1");

    /**
     * Creates or finds a VirtualNetworkGatewayConnectionProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VirtualNetworkGatewayConnectionProtocol.
     */
    @JsonCreator
    public static VirtualNetworkGatewayConnectionProtocol fromString(String name) {
        return fromString(name, VirtualNetworkGatewayConnectionProtocol.class);
    }

    /** @return known VirtualNetworkGatewayConnectionProtocol values. */
    public static Collection<VirtualNetworkGatewayConnectionProtocol> values() {
        return values(VirtualNetworkGatewayConnectionProtocol.class);
    }
}
