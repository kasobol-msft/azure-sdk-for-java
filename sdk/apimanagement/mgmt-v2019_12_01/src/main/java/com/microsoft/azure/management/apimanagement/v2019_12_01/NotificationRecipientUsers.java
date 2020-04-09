/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.NotificationRecipientUsersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing NotificationRecipientUsers.
 */
public interface NotificationRecipientUsers extends SupportsCreating<RecipientUserContract.DefinitionStages.Blank>, HasInner<NotificationRecipientUsersInner> {
    /**
     * Gets the list of the Notification Recipient User subscribed to the notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecipientUserCollection> listByNotificationAsync(String resourceGroupName, String serviceName, NotificationName notificationName);

    /**
     * Determine if the Notification Recipient User is subscribed to the notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Boolean> checkEntityExistsAsync(String resourceGroupName, String serviceName, NotificationName notificationName, String userId);

    /**
     * Removes the API Management user from the list of Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceName, NotificationName notificationName, String userId);

}
