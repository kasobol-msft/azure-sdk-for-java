/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_05_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2020_05_01.implementation.ConnectionSharedKeyInner;

/**
 * Type representing ConnectionSharedKey.
 */
public interface ConnectionSharedKey extends HasInner<ConnectionSharedKeyInner>, HasManager<NetworkManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the value value.
     */
    String value();

}
