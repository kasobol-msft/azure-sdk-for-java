// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The StorageMigrationOptions model.
 */
@JsonFlatten
@Fluent
public class StorageMigrationOptions extends ProxyOnlyResource {
    /*
     * AzureFiles connection string.
     */
    @JsonProperty(value = "properties.azurefilesConnectionString")
    private String azurefilesConnectionString;

    /*
     * AzureFiles share.
     */
    @JsonProperty(value = "properties.azurefilesShare")
    private String azurefilesShare;

    /*
     * <code>true</code>if the app should be switched over; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "properties.switchSiteAfterMigration")
    private Boolean switchSiteAfterMigration;

    /*
     * <code>true</code> if the app should be read only during copy operation;
     * otherwise, <code>false</code>.
     */
    @JsonProperty(value = "properties.blockWriteAccessToSite")
    private Boolean blockWriteAccessToSite;

    /**
     * Get the azurefilesConnectionString property: AzureFiles connection
     * string.
     * 
     * @return the azurefilesConnectionString value.
     */
    public String azurefilesConnectionString() {
        return this.azurefilesConnectionString;
    }

    /**
     * Set the azurefilesConnectionString property: AzureFiles connection
     * string.
     * 
     * @param azurefilesConnectionString the azurefilesConnectionString value
     * to set.
     * @return the StorageMigrationOptions object itself.
     */
    public StorageMigrationOptions withAzurefilesConnectionString(String azurefilesConnectionString) {
        this.azurefilesConnectionString = azurefilesConnectionString;
        return this;
    }

    /**
     * Get the azurefilesShare property: AzureFiles share.
     * 
     * @return the azurefilesShare value.
     */
    public String azurefilesShare() {
        return this.azurefilesShare;
    }

    /**
     * Set the azurefilesShare property: AzureFiles share.
     * 
     * @param azurefilesShare the azurefilesShare value to set.
     * @return the StorageMigrationOptions object itself.
     */
    public StorageMigrationOptions withAzurefilesShare(String azurefilesShare) {
        this.azurefilesShare = azurefilesShare;
        return this;
    }

    /**
     * Get the switchSiteAfterMigration property:
     * &lt;code&gt;true&lt;/code&gt;if the app should be switched over;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the switchSiteAfterMigration value.
     */
    public Boolean switchSiteAfterMigration() {
        return this.switchSiteAfterMigration;
    }

    /**
     * Set the switchSiteAfterMigration property:
     * &lt;code&gt;true&lt;/code&gt;if the app should be switched over;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param switchSiteAfterMigration the switchSiteAfterMigration value to
     * set.
     * @return the StorageMigrationOptions object itself.
     */
    public StorageMigrationOptions withSwitchSiteAfterMigration(Boolean switchSiteAfterMigration) {
        this.switchSiteAfterMigration = switchSiteAfterMigration;
        return this;
    }

    /**
     * Get the blockWriteAccessToSite property: &lt;code&gt;true&lt;/code&gt;
     * if the app should be read only during copy operation; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the blockWriteAccessToSite value.
     */
    public Boolean blockWriteAccessToSite() {
        return this.blockWriteAccessToSite;
    }

    /**
     * Set the blockWriteAccessToSite property: &lt;code&gt;true&lt;/code&gt;
     * if the app should be read only during copy operation; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param blockWriteAccessToSite the blockWriteAccessToSite value to set.
     * @return the StorageMigrationOptions object itself.
     */
    public StorageMigrationOptions withBlockWriteAccessToSite(Boolean blockWriteAccessToSite) {
        this.blockWriteAccessToSite = blockWriteAccessToSite;
        return this;
    }
}
