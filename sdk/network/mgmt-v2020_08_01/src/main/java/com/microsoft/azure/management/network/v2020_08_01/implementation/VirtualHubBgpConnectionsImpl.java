/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_08_01.VirtualHubBgpConnections;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2020_08_01.PeerRouteList;
import com.microsoft.azure.management.network.v2020_08_01.BgpConnection;

class VirtualHubBgpConnectionsImpl extends WrapperImpl<VirtualHubBgpConnectionsInner> implements VirtualHubBgpConnections {
    private final NetworkManager manager;

    VirtualHubBgpConnectionsImpl(NetworkManager manager) {
        super(manager.inner().virtualHubBgpConnections());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public BgpConnectionImpl define(String name) {
        return wrapModel(name);
    }

    private BgpConnectionImpl wrapModel(BgpConnectionInner inner) {
        return  new BgpConnectionImpl(inner, manager());
    }

    private BgpConnectionImpl wrapModel(String name) {
        return new BgpConnectionImpl(name, this.manager());
    }

    @Override
    public Observable<PeerRouteList> listLearnedRoutesAsync(String resourceGroupName, String hubName, String connectionName) {
        VirtualHubBgpConnectionsInner client = this.inner();
        return client.listLearnedRoutesAsync(resourceGroupName, hubName, connectionName)
        .map(new Func1<PeerRouteListInner, PeerRouteList>() {
            @Override
            public PeerRouteList call(PeerRouteListInner inner) {
                return new PeerRouteListImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PeerRouteList> listAdvertisedRoutesAsync(String resourceGroupName, String hubName, String connectionName) {
        VirtualHubBgpConnectionsInner client = this.inner();
        return client.listAdvertisedRoutesAsync(resourceGroupName, hubName, connectionName)
        .map(new Func1<PeerRouteListInner, PeerRouteList>() {
            @Override
            public PeerRouteList call(PeerRouteListInner inner) {
                return new PeerRouteListImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BgpConnection> listAsync(final String resourceGroupName, final String virtualHubName) {
        VirtualHubBgpConnectionsInner client = this.inner();
        return client.listAsync(resourceGroupName, virtualHubName)
        .flatMapIterable(new Func1<Page<BgpConnectionInner>, Iterable<BgpConnectionInner>>() {
            @Override
            public Iterable<BgpConnectionInner> call(Page<BgpConnectionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BgpConnectionInner, BgpConnection>() {
            @Override
            public BgpConnection call(BgpConnectionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<BgpConnection> getAsync(String resourceGroupName, String virtualHubName, String connectionName) {
        VirtualHubBgpConnectionsInner client = this.inner();
        return client.getAsync(resourceGroupName, virtualHubName, connectionName)
        .flatMap(new Func1<BgpConnectionInner, Observable<BgpConnection>>() {
            @Override
            public Observable<BgpConnection> call(BgpConnectionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((BgpConnection)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String virtualHubName, String connectionName) {
        VirtualHubBgpConnectionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, virtualHubName, connectionName).toCompletable();
    }

}
