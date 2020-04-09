// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ManagementPolicyAction model.
 */
@Fluent
public final class ManagementPolicyAction {
    /*
     * The management policy action for base blob
     */
    @JsonProperty(value = "baseBlob")
    private ManagementPolicyBaseBlob baseBlob;

    /*
     * The management policy action for snapshot
     */
    @JsonProperty(value = "snapshot")
    private ManagementPolicySnapShot snapshot;

    /**
     * Get the baseBlob property: The management policy action for base blob.
     * 
     * @return the baseBlob value.
     */
    public ManagementPolicyBaseBlob baseBlob() {
        return this.baseBlob;
    }

    /**
     * Set the baseBlob property: The management policy action for base blob.
     * 
     * @param baseBlob the baseBlob value to set.
     * @return the ManagementPolicyAction object itself.
     */
    public ManagementPolicyAction withBaseBlob(ManagementPolicyBaseBlob baseBlob) {
        this.baseBlob = baseBlob;
        return this;
    }

    /**
     * Get the snapshot property: The management policy action for snapshot.
     * 
     * @return the snapshot value.
     */
    public ManagementPolicySnapShot snapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: The management policy action for snapshot.
     * 
     * @param snapshot the snapshot value to set.
     * @return the ManagementPolicyAction object itself.
     */
    public ManagementPolicyAction withSnapshot(ManagementPolicySnapShot snapshot) {
        this.snapshot = snapshot;
        return this;
    }
}
