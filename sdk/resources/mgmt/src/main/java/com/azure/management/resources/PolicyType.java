// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PolicyType. */
public final class PolicyType extends ExpandableStringEnum<PolicyType> {
    /** Static value NotSpecified for PolicyType. */
    public static final PolicyType NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value BuiltIn for PolicyType. */
    public static final PolicyType BUILT_IN = fromString("BuiltIn");

    /** Static value Custom for PolicyType. */
    public static final PolicyType CUSTOM = fromString("Custom");

    /** Static value Static for PolicyType. */
    public static final PolicyType STATIC = fromString("Static");

    /**
     * Creates or finds a PolicyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PolicyType.
     */
    @JsonCreator
    public static PolicyType fromString(String name) {
        return fromString(name, PolicyType.class);
    }

    /** @return known PolicyType values. */
    public static Collection<PolicyType> values() {
        return values(PolicyType.class);
    }
}
