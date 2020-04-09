// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.containerregistry.QuarantinePolicy;
import com.azure.management.containerregistry.TrustPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RegistryPolicies model. */
@Fluent
public final class RegistryPoliciesInner {
    /*
     * An object that represents quarantine policy for a container registry.
     */
    @JsonProperty(value = "quarantinePolicy")
    private QuarantinePolicy quarantinePolicy;

    /*
     * An object that represents content trust policy for a container registry.
     */
    @JsonProperty(value = "trustPolicy")
    private TrustPolicy trustPolicy;

    /**
     * Get the quarantinePolicy property: An object that represents quarantine policy for a container registry.
     *
     * @return the quarantinePolicy value.
     */
    public QuarantinePolicy quarantinePolicy() {
        return this.quarantinePolicy;
    }

    /**
     * Set the quarantinePolicy property: An object that represents quarantine policy for a container registry.
     *
     * @param quarantinePolicy the quarantinePolicy value to set.
     * @return the RegistryPoliciesInner object itself.
     */
    public RegistryPoliciesInner withQuarantinePolicy(QuarantinePolicy quarantinePolicy) {
        this.quarantinePolicy = quarantinePolicy;
        return this;
    }

    /**
     * Get the trustPolicy property: An object that represents content trust policy for a container registry.
     *
     * @return the trustPolicy value.
     */
    public TrustPolicy trustPolicy() {
        return this.trustPolicy;
    }

    /**
     * Set the trustPolicy property: An object that represents content trust policy for a container registry.
     *
     * @param trustPolicy the trustPolicy value to set.
     * @return the RegistryPoliciesInner object itself.
     */
    public RegistryPoliciesInner withTrustPolicy(TrustPolicy trustPolicy) {
        this.trustPolicy = trustPolicy;
        return this;
    }
}
