/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2019_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.storagecache.v2019_08_01.implementation.StorageTargetsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing StorageTargets.
 */
public interface StorageTargets extends SupportsCreating<StorageTarget.DefinitionStages.Blank>, HasInner<StorageTargetsInner> {
    /**
     * Returns a storage target from a cache.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of cache.
     * @param storageTargetName Name of storage target.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageTarget> getAsync(String resourceGroupName, String cacheName, String storageTargetName);

    /**
     * Returns the StorageTargets for this cache in the subscription and resource group.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageTarget> listByCacheAsync(final String resourceGroupName, final String cacheName);

    /**
     * Removes a storage target from a cache.  This operation is allowed at any time, but if the cache is down or unhealthy, the actual removal of the storage target may be delayed until the cache is healthy again.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of cache.
     * @param storageTargetName Name of storage target.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String cacheName, String storageTargetName);

}
