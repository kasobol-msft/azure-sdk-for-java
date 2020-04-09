// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KeyVaultSecretReference model.
 */
@Fluent
public final class KeyVaultSecretReference {
    /*
     * The URL referencing a secret in a Key Vault.
     */
    @JsonProperty(value = "secretUrl", required = true)
    private String secretUrl;

    /*
     * The sourceVault property.
     */
    @JsonProperty(value = "sourceVault", required = true)
    private SubResource sourceVault;

    /**
     * Get the secretUrl property: The URL referencing a secret in a Key Vault.
     * 
     * @return the secretUrl value.
     */
    public String secretUrl() {
        return this.secretUrl;
    }

    /**
     * Set the secretUrl property: The URL referencing a secret in a Key Vault.
     * 
     * @param secretUrl the secretUrl value to set.
     * @return the KeyVaultSecretReference object itself.
     */
    public KeyVaultSecretReference withSecretUrl(String secretUrl) {
        this.secretUrl = secretUrl;
        return this;
    }

    /**
     * Get the sourceVault property: The sourceVault property.
     * 
     * @return the sourceVault value.
     */
    public SubResource sourceVault() {
        return this.sourceVault;
    }

    /**
     * Set the sourceVault property: The sourceVault property.
     * 
     * @param sourceVault the sourceVault value to set.
     * @return the KeyVaultSecretReference object itself.
     */
    public KeyVaultSecretReference withSourceVault(SubResource sourceVault) {
        this.sourceVault = sourceVault;
        return this;
    }
}
