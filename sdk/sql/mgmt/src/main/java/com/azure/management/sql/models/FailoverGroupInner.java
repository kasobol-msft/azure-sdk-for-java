// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.management.sql.FailoverGroupReadOnlyEndpoint;
import com.azure.management.sql.FailoverGroupReadWriteEndpoint;
import com.azure.management.sql.FailoverGroupReplicationRole;
import com.azure.management.sql.PartnerInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The FailoverGroup model. */
@JsonFlatten
@Fluent
public class FailoverGroupInner extends ProxyResource {
    /*
     * Resource location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Read-write endpoint of the failover group instance.
     */
    @JsonProperty(value = "properties.readWriteEndpoint")
    private FailoverGroupReadWriteEndpoint readWriteEndpoint;

    /*
     * Read-only endpoint of the failover group instance.
     */
    @JsonProperty(value = "properties.readOnlyEndpoint")
    private FailoverGroupReadOnlyEndpoint readOnlyEndpoint;

    /*
     * Local replication role of the failover group instance.
     */
    @JsonProperty(value = "properties.replicationRole", access = JsonProperty.Access.WRITE_ONLY)
    private FailoverGroupReplicationRole replicationRole;

    /*
     * Replication state of the failover group instance.
     */
    @JsonProperty(value = "properties.replicationState", access = JsonProperty.Access.WRITE_ONLY)
    private String replicationState;

    /*
     * List of partner server information for the failover group.
     */
    @JsonProperty(value = "properties.partnerServers")
    private List<PartnerInfo> partnerServers;

    /*
     * List of databases in the failover group.
     */
    @JsonProperty(value = "properties.databases")
    private List<String> databases;

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the FailoverGroupInner object itself.
     */
    public FailoverGroupInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the readWriteEndpoint property: Read-write endpoint of the failover group instance.
     *
     * @return the readWriteEndpoint value.
     */
    public FailoverGroupReadWriteEndpoint readWriteEndpoint() {
        return this.readWriteEndpoint;
    }

    /**
     * Set the readWriteEndpoint property: Read-write endpoint of the failover group instance.
     *
     * @param readWriteEndpoint the readWriteEndpoint value to set.
     * @return the FailoverGroupInner object itself.
     */
    public FailoverGroupInner withReadWriteEndpoint(FailoverGroupReadWriteEndpoint readWriteEndpoint) {
        this.readWriteEndpoint = readWriteEndpoint;
        return this;
    }

    /**
     * Get the readOnlyEndpoint property: Read-only endpoint of the failover group instance.
     *
     * @return the readOnlyEndpoint value.
     */
    public FailoverGroupReadOnlyEndpoint readOnlyEndpoint() {
        return this.readOnlyEndpoint;
    }

    /**
     * Set the readOnlyEndpoint property: Read-only endpoint of the failover group instance.
     *
     * @param readOnlyEndpoint the readOnlyEndpoint value to set.
     * @return the FailoverGroupInner object itself.
     */
    public FailoverGroupInner withReadOnlyEndpoint(FailoverGroupReadOnlyEndpoint readOnlyEndpoint) {
        this.readOnlyEndpoint = readOnlyEndpoint;
        return this;
    }

    /**
     * Get the replicationRole property: Local replication role of the failover group instance.
     *
     * @return the replicationRole value.
     */
    public FailoverGroupReplicationRole replicationRole() {
        return this.replicationRole;
    }

    /**
     * Get the replicationState property: Replication state of the failover group instance.
     *
     * @return the replicationState value.
     */
    public String replicationState() {
        return this.replicationState;
    }

    /**
     * Get the partnerServers property: List of partner server information for the failover group.
     *
     * @return the partnerServers value.
     */
    public List<PartnerInfo> partnerServers() {
        return this.partnerServers;
    }

    /**
     * Set the partnerServers property: List of partner server information for the failover group.
     *
     * @param partnerServers the partnerServers value to set.
     * @return the FailoverGroupInner object itself.
     */
    public FailoverGroupInner withPartnerServers(List<PartnerInfo> partnerServers) {
        this.partnerServers = partnerServers;
        return this;
    }

    /**
     * Get the databases property: List of databases in the failover group.
     *
     * @return the databases value.
     */
    public List<String> databases() {
        return this.databases;
    }

    /**
     * Set the databases property: List of databases in the failover group.
     *
     * @param databases the databases value to set.
     * @return the FailoverGroupInner object itself.
     */
    public FailoverGroupInner withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }
}
