/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.management.network.v2020_03_01.PeerExpressRouteCircuitConnection;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_03_01.CircuitConnectionStatus;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_03_01.ProvisioningState;

class PeerExpressRouteCircuitConnectionImpl extends IndexableRefreshableWrapperImpl<PeerExpressRouteCircuitConnection, PeerExpressRouteCircuitConnectionInner> implements PeerExpressRouteCircuitConnection {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String circuitName;
    private String peeringName;
    private String connectionName;

    PeerExpressRouteCircuitConnectionImpl(PeerExpressRouteCircuitConnectionInner inner,  NetworkManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.circuitName = IdParsingUtils.getValueFromIdByName(inner.id(), "expressRouteCircuits");
        this.peeringName = IdParsingUtils.getValueFromIdByName(inner.id(), "peerings");
        this.connectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "peerConnections");
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<PeerExpressRouteCircuitConnectionInner> getInnerAsync() {
        PeerExpressRouteCircuitConnectionsInner client = this.manager().inner().peerExpressRouteCircuitConnections();
        return client.getAsync(this.resourceGroupName, this.circuitName, this.peeringName, this.connectionName);
    }



    @Override
    public String addressPrefix() {
        return this.inner().addressPrefix();
    }

    @Override
    public String authResourceGuid() {
        return this.inner().authResourceGuid();
    }

    @Override
    public CircuitConnectionStatus circuitConnectionStatus() {
        return this.inner().circuitConnectionStatus();
    }

    @Override
    public String connectionName() {
        return this.inner().connectionName();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public SubResource expressRouteCircuitPeering() {
        return this.inner().expressRouteCircuitPeering();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public SubResource peerExpressRouteCircuitPeering() {
        return this.inner().peerExpressRouteCircuitPeering();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
