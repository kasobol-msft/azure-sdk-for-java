/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_12_01.ApiPolicyContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_12_01.PolicyContentFormat;

class ApiPolicyContractImpl extends CreatableUpdatableImpl<ApiPolicyContract, PolicyContractInner, ApiPolicyContractImpl> implements ApiPolicyContract, ApiPolicyContract.Definition, ApiPolicyContract.Update {
    private final ApiManagementManager manager;
    private String resourceGroupName;
    private String serviceName;
    private String apiId;
    private String cifMatch;
    private String uifMatch;

    ApiPolicyContractImpl(String name, ApiManagementManager manager) {
        super(name, new PolicyContractInner());
        this.manager = manager;
        // Set resource name
        this.apiId = name;
        //
    }

    ApiPolicyContractImpl(PolicyContractInner inner, ApiManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.apiId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "service");
        this.apiId = IdParsingUtils.getValueFromIdByName(inner.id(), "apis");
        //
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ApiPolicyContract> createResourceAsync() {
        ApiPolicysInner client = this.manager().inner().apiPolicys();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.apiId, this.inner(), this.cifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ApiPolicyContract> updateResourceAsync() {
        ApiPolicysInner client = this.manager().inner().apiPolicys();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.apiId, this.inner(), this.uifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PolicyContractInner> getInnerAsync() {
        ApiPolicysInner client = this.manager().inner().apiPolicys();
        return client.getAsync(this.resourceGroupName, this.serviceName, this.apiId);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public PolicyContentFormat format() {
        return this.inner().format();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String value() {
        return this.inner().value();
    }

    @Override
    public ApiPolicyContractImpl withExistingApi(String resourceGroupName, String serviceName, String apiId) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.apiId = apiId;
        return this;
    }

    @Override
    public ApiPolicyContractImpl withValue(String value) {
        this.inner().withValue(value);
        return this;
    }

    @Override
    public ApiPolicyContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public ApiPolicyContractImpl withFormat(PolicyContentFormat format) {
        this.inner().withFormat(format);
        return this;
    }

}
