// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.management.storage.BlobContainersGetImmutabilityPolicyHeaders;

/** Contains all response data for the getImmutabilityPolicy operation. */
public final class BlobContainersGetImmutabilityPolicyResponse
    extends ResponseBase<BlobContainersGetImmutabilityPolicyHeaders, ImmutabilityPolicyInner> {
    /**
     * Creates an instance of BlobContainersGetImmutabilityPolicyResponse.
     *
     * @param request the request which resulted in this BlobContainersGetImmutabilityPolicyResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlobContainersGetImmutabilityPolicyResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        ImmutabilityPolicyInner value,
        BlobContainersGetImmutabilityPolicyHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public ImmutabilityPolicyInner getValue() {
        return super.getValue();
    }
}
