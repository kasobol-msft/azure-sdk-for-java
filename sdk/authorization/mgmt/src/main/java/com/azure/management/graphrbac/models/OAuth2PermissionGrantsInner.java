// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.management.graphrbac.GraphErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in OAuth2PermissionGrants. */
public final class OAuth2PermissionGrantsInner {
    /** The proxy service used to perform REST calls. */
    private final OAuth2PermissionGrantsService service;

    /** The service client containing this operation class. */
    private final GraphRbacManagementClientImpl client;

    /**
     * Initializes an instance of OAuth2PermissionGrantsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    OAuth2PermissionGrantsInner(GraphRbacManagementClientImpl client) {
        this.service =
            RestProxy
                .create(OAuth2PermissionGrantsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GraphRbacManagementClientOAuth2PermissionGrants to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GraphRbacManagementC")
    private interface OAuth2PermissionGrantsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/{tenantID}/oauth2PermissionGrants")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<OAuth2PermissionGrantListResultInner>> list(
            @HostParam("$host") String host,
            @QueryParam("$filter") String filter,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantID,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post("/{tenantID}/oauth2PermissionGrants")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<OAuth2PermissionGrantInner>> create(
            @HostParam("$host") String host,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantID,
            @BodyParam("application/json") OAuth2PermissionGrantInner body,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete("/{tenantID}/oauth2PermissionGrants/{objectId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String host,
            @PathParam("objectId") String objectId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantID,
            Context context);

        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get("/{tenantID}/{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<OAuth2PermissionGrantListResultInner>> listNext(
            @HostParam("$host") String host,
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantID,
            Context context);
    }

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @param filter This is the Service Principal ObjectId associated with the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server response for get oauth2 permissions grants.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<OAuth2PermissionGrantInner>> listSinglePageAsync(String filter) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getHost(),
                            filter,
                            this.client.getApiVersion(),
                            this.client.getTenantID(),
                            context))
            .<PagedResponse<OAuth2PermissionGrantInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().odataNextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @param filter This is the Service Principal ObjectId associated with the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server response for get oauth2 permissions grants.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<OAuth2PermissionGrantInner> listAsync(String filter) {
        return new PagedFlux<>(() -> listSinglePageAsync(filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server response for get oauth2 permissions grants.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<OAuth2PermissionGrantInner> listAsync() {
        final String filter = null;
        final Context context = null;
        return new PagedFlux<>(() -> listSinglePageAsync(filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @param filter This is the Service Principal ObjectId associated with the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server response for get oauth2 permissions grants.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<OAuth2PermissionGrantInner> list(String filter) {
        return new PagedIterable<>(listAsync(filter));
    }

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server response for get oauth2 permissions grants.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<OAuth2PermissionGrantInner> list() {
        final String filter = null;
        final Context context = null;
        return new PagedIterable<>(listAsync(filter));
    }

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @param body The relevant app Service Principal Object Id and the Service Principal Object Id you want to grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<OAuth2PermissionGrantInner>> createWithResponseAsync(OAuth2PermissionGrantInner body) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .create(
                            this.client.getHost(),
                            this.client.getApiVersion(),
                            this.client.getTenantID(),
                            body,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @param body The relevant app Service Principal Object Id and the Service Principal Object Id you want to grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OAuth2PermissionGrantInner> createAsync(OAuth2PermissionGrantInner body) {
        return createWithResponseAsync(body)
            .flatMap(
                (SimpleResponse<OAuth2PermissionGrantInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OAuth2PermissionGrantInner> createAsync() {
        final OAuth2PermissionGrantInner body = null;
        final Context context = null;
        return createWithResponseAsync(body)
            .flatMap(
                (SimpleResponse<OAuth2PermissionGrantInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @param body The relevant app Service Principal Object Id and the Service Principal Object Id you want to grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OAuth2PermissionGrantInner create(OAuth2PermissionGrantInner body) {
        return createAsync(body).block();
    }

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OAuth2PermissionGrantInner create() {
        final OAuth2PermissionGrantInner body = null;
        final Context context = null;
        return createAsync(body).block();
    }

    /**
     * Delete a OAuth2 permission grant for the relevant resource Ids of an app.
     *
     * @param objectId The object ID of a permission grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String objectId) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getHost(),
                            objectId,
                            this.client.getApiVersion(),
                            this.client.getTenantID(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Delete a OAuth2 permission grant for the relevant resource Ids of an app.
     *
     * @param objectId The object ID of a permission grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String objectId) {
        return deleteWithResponseAsync(objectId).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete a OAuth2 permission grant for the relevant resource Ids of an app.
     *
     * @param objectId The object ID of a permission grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String objectId) {
        deleteAsync(objectId).block();
    }

    /**
     * Gets the next page of OAuth2 permission grants.
     *
     * @param nextLink Next link for the list operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the next page of OAuth2 permission grants.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<OAuth2PermissionGrantInner>> listNextSinglePageAsync(String nextLink) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listNext(
                            this.client.getHost(),
                            nextLink,
                            this.client.getApiVersion(),
                            this.client.getTenantID(),
                            context))
            .<PagedResponse<OAuth2PermissionGrantInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().odataNextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }
}
