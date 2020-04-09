// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RecoverableManagedDatabases. */
public final class RecoverableManagedDatabasesInner {
    /** The proxy service used to perform REST calls. */
    private final RecoverableManagedDatabasesService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of RecoverableManagedDatabasesInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RecoverableManagedDatabasesInner(SqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    RecoverableManagedDatabasesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientRecoverableManagedDatabases to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientR")
    private interface RecoverableManagedDatabasesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/managedInstances/{managedInstanceName}/recoverableDatabases")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RecoverableManagedDatabaseListResultInner>> listByInstance(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("managedInstanceName") String managedInstanceName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/managedInstances/{managedInstanceName}/recoverableDatabases/{recoverableDatabaseName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RecoverableManagedDatabaseInner>> get(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("managedInstanceName") String managedInstanceName,
            @PathParam("recoverableDatabaseName") String recoverableDatabaseName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RecoverableManagedDatabaseListResultInner>> listByInstanceNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Gets a list of recoverable managed databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recoverable managed databases.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RecoverableManagedDatabaseInner>> listByInstanceSinglePageAsync(
        String resourceGroupName, String managedInstanceName) {
        final String apiVersion = "2017-10-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByInstance(
                            this.client.getHost(),
                            resourceGroupName,
                            managedInstanceName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .<PagedResponse<RecoverableManagedDatabaseInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a list of recoverable managed databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recoverable managed databases.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RecoverableManagedDatabaseInner> listByInstanceAsync(
        String resourceGroupName, String managedInstanceName) {
        return new PagedFlux<>(
            () -> listByInstanceSinglePageAsync(resourceGroupName, managedInstanceName),
            nextLink -> listByInstanceNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of recoverable managed databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recoverable managed databases.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RecoverableManagedDatabaseInner> listByInstance(
        String resourceGroupName, String managedInstanceName) {
        return new PagedIterable<>(listByInstanceAsync(resourceGroupName, managedInstanceName));
    }

    /**
     * Gets a recoverable managed database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param recoverableDatabaseName The recoverableDatabaseName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recoverable managed database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RecoverableManagedDatabaseInner>> getWithResponseAsync(
        String resourceGroupName, String managedInstanceName, String recoverableDatabaseName) {
        final String apiVersion = "2017-10-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            resourceGroupName,
                            managedInstanceName,
                            recoverableDatabaseName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a recoverable managed database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param recoverableDatabaseName The recoverableDatabaseName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recoverable managed database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RecoverableManagedDatabaseInner> getAsync(
        String resourceGroupName, String managedInstanceName, String recoverableDatabaseName) {
        return getWithResponseAsync(resourceGroupName, managedInstanceName, recoverableDatabaseName)
            .flatMap(
                (SimpleResponse<RecoverableManagedDatabaseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a recoverable managed database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param recoverableDatabaseName The recoverableDatabaseName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recoverable managed database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RecoverableManagedDatabaseInner get(
        String resourceGroupName, String managedInstanceName, String recoverableDatabaseName) {
        return getAsync(resourceGroupName, managedInstanceName, recoverableDatabaseName).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recoverable managed databases.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RecoverableManagedDatabaseInner>> listByInstanceNextSinglePageAsync(String nextLink) {
        return FluxUtil
            .withContext(context -> service.listByInstanceNext(nextLink, context))
            .<PagedResponse<RecoverableManagedDatabaseInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }
}
