/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters supplied to the Create Group operation.
 */
@JsonFlatten
public class GroupCreateParameters {
    /**
     * Group name.
     */
    @JsonProperty(value = "properties.displayName", required = true)
    private String displayName;

    /**
     * Group description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Group type. Possible values include: 'custom', 'system', 'external'.
     */
    @JsonProperty(value = "properties.type")
    private GroupType type;

    /**
     * Identifier of the external groups, this property contains the id of the
     * group from the external identity provider, e.g. for Azure Active
     * Directory `aad://&lt;tenant&gt;.onmicrosoft.com/groups/&lt;group object
     * id&gt;`; otherwise the value is null.
     */
    @JsonProperty(value = "properties.externalId")
    private String externalId;

    /**
     * Get group name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set group name.
     *
     * @param displayName the displayName value to set
     * @return the GroupCreateParameters object itself.
     */
    public GroupCreateParameters withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get group description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set group description.
     *
     * @param description the description value to set
     * @return the GroupCreateParameters object itself.
     */
    public GroupCreateParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get group type. Possible values include: 'custom', 'system', 'external'.
     *
     * @return the type value
     */
    public GroupType type() {
        return this.type;
    }

    /**
     * Set group type. Possible values include: 'custom', 'system', 'external'.
     *
     * @param type the type value to set
     * @return the GroupCreateParameters object itself.
     */
    public GroupCreateParameters withType(GroupType type) {
        this.type = type;
        return this;
    }

    /**
     * Get identifier of the external groups, this property contains the id of the group from the external identity provider, e.g. for Azure Active Directory `aad://&lt;tenant&gt;.onmicrosoft.com/groups/&lt;group object id&gt;`; otherwise the value is null.
     *
     * @return the externalId value
     */
    public String externalId() {
        return this.externalId;
    }

    /**
     * Set identifier of the external groups, this property contains the id of the group from the external identity provider, e.g. for Azure Active Directory `aad://&lt;tenant&gt;.onmicrosoft.com/groups/&lt;group object id&gt;`; otherwise the value is null.
     *
     * @param externalId the externalId value to set
     * @return the GroupCreateParameters object itself.
     */
    public GroupCreateParameters withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

}
