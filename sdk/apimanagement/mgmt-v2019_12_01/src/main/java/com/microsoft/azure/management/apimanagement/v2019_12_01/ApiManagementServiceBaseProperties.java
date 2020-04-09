/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Base Properties of an API Management service resource description.
 */
public class ApiManagementServiceBaseProperties {
    /**
     * Email address from which the notification will be sent.
     */
    @JsonProperty(value = "notificationSenderEmail")
    private String notificationSenderEmail;

    /**
     * The current provisioning state of the API Management service which can
     * be one of the following:
     * Created/Activating/Succeeded/Updating/Failed/Stopped/Terminating/TerminationFailed/Deleted.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The provisioning state of the API Management service, which is targeted
     * by the long running operation started on the service.
     */
    @JsonProperty(value = "targetProvisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String targetProvisioningState;

    /**
     * Creation UTC date of the API Management service.The date conforms to the
     * following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     */
    @JsonProperty(value = "createdAtUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAtUtc;

    /**
     * Gateway URL of the API Management service.
     */
    @JsonProperty(value = "gatewayUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String gatewayUrl;

    /**
     * Gateway URL of the API Management service in the Default Region.
     */
    @JsonProperty(value = "gatewayRegionalUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String gatewayRegionalUrl;

    /**
     * Publisher portal endpoint Url of the API Management service.
     */
    @JsonProperty(value = "portalUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String portalUrl;

    /**
     * Management API endpoint URL of the API Management service.
     */
    @JsonProperty(value = "managementApiUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String managementApiUrl;

    /**
     * SCM endpoint URL of the API Management service.
     */
    @JsonProperty(value = "scmUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String scmUrl;

    /**
     * DEveloper Portal endpoint URL of the API Management service.
     */
    @JsonProperty(value = "developerPortalUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String developerPortalUrl;

    /**
     * Custom hostname configuration of the API Management service.
     */
    @JsonProperty(value = "hostnameConfigurations")
    private List<HostnameConfiguration> hostnameConfigurations;

    /**
     * Public Static Load Balanced IP addresses of the API Management service
     * in Primary region. Available only for Basic, Standard and Premium SKU.
     */
    @JsonProperty(value = "publicIPAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> publicIPAddresses;

    /**
     * Private Static Load Balanced IP addresses of the API Management service
     * in Primary region which is deployed in an Internal Virtual Network.
     * Available only for Basic, Standard and Premium SKU.
     */
    @JsonProperty(value = "privateIPAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> privateIPAddresses;

    /**
     * Virtual network configuration of the API Management service.
     */
    @JsonProperty(value = "virtualNetworkConfiguration")
    private VirtualNetworkConfiguration virtualNetworkConfiguration;

    /**
     * Additional datacenter locations of the API Management service.
     */
    @JsonProperty(value = "additionalLocations")
    private List<AdditionalLocation> additionalLocations;

    /**
     * Custom properties of the API Management service.&lt;/br&gt;Setting
     * `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.TripleDes168`
     * will disable the cipher TLS_RSA_WITH_3DES_EDE_CBC_SHA for all TLS(1.0,
     * 1.1 and 1.2).&lt;/br&gt;Setting
     * `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Protocols.Tls11`
     * can be used to disable just TLS 1.1.&lt;/br&gt;Setting
     * `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Protocols.Tls10`
     * can be used to disable TLS 1.0 on an API Management
     * service.&lt;/br&gt;Setting
     * `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Backend.Protocols.Tls11`
     * can be used to disable just TLS 1.1 for communications with
     * backends.&lt;/br&gt;Setting
     * `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Backend.Protocols.Tls10`
     * can be used to disable TLS 1.0 for communications with
     * backends.&lt;/br&gt;Setting
     * `Microsoft.WindowsAzure.ApiManagement.Gateway.Protocols.Server.Http2`
     * can be used to enable HTTP2 protocol on an API Management
     * service.&lt;/br&gt;Not specifying any of these properties on PATCH
     * operation will reset omitted properties' values to their defaults. For
     * all the settings except Http2 the default value is `True` if the service
     * was created on or before April 1st 2018 and `False` otherwise. Http2
     * setting's default value is `False`.&lt;/br&gt;&lt;/br&gt;You can disable
     * any of next ciphers by using settings
     * `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.[cipher_name]`:
     * TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA,
     * TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA,
     * TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA,
     * TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA256,
     * TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA,
     * TLS_RSA_WITH_AES_128_CBC_SHA. For example,
     * `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.TLS_RSA_WITH_AES_128_CBC_SHA256`:`false`.
     * The default value is `true` for them.  Note: next ciphers can't be
     * disabled since they are required by Azure CloudService internal
     * components:
     * TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384,TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256,TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384,TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256,TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384,TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256,TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384,TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256,TLS_RSA_WITH_AES_256_GCM_SHA384.
     */
    @JsonProperty(value = "customProperties")
    private Map<String, String> customProperties;

    /**
     * List of Certificates that need to be installed in the API Management
     * service. Max supported certificates that can be installed is 10.
     */
    @JsonProperty(value = "certificates")
    private List<CertificateConfiguration> certificates;

    /**
     * Property only meant to be used for Consumption SKU Service. This
     * enforces a client certificate to be presented on each request to the
     * gateway. This also enables the ability to authenticate the certificate
     * in the policy on the gateway.
     */
    @JsonProperty(value = "enableClientCertificate")
    private Boolean enableClientCertificate;

    /**
     * Property only valid for an Api Management service deployed in multiple
     * locations. This can be used to disable the gateway in master region.
     */
    @JsonProperty(value = "disableGateway")
    private Boolean disableGateway;

    /**
     * The type of VPN in which API Management service needs to be configured
     * in. None (Default Value) means the API Management service is not part of
     * any Virtual Network, External means the API Management deployment is set
     * up inside a Virtual Network having an Internet Facing Endpoint, and
     * Internal means that API Management deployment is setup inside a Virtual
     * Network having an Intranet Facing Endpoint only. Possible values
     * include: 'None', 'External', 'Internal'.
     */
    @JsonProperty(value = "virtualNetworkType")
    private VirtualNetworkType virtualNetworkType;

    /**
     * Control Plane Apis version constraint for the API Management service.
     */
    @JsonProperty(value = "apiVersionConstraint")
    private ApiVersionConstraint apiVersionConstraint;

    /**
     * Get email address from which the notification will be sent.
     *
     * @return the notificationSenderEmail value
     */
    public String notificationSenderEmail() {
        return this.notificationSenderEmail;
    }

    /**
     * Set email address from which the notification will be sent.
     *
     * @param notificationSenderEmail the notificationSenderEmail value to set
     * @return the ApiManagementServiceBaseProperties object itself.
     */
    public ApiManagementServiceBaseProperties withNotificationSenderEmail(String notificationSenderEmail) {
        this.notificationSenderEmail = notificationSenderEmail;
        return this;
    }

    /**
     * Get the current provisioning state of the API Management service which can be one of the following: Created/Activating/Succeeded/Updating/Failed/Stopped/Terminating/TerminationFailed/Deleted.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the provisioning state of the API Management service, which is targeted by the long running operation started on the service.
     *
     * @return the targetProvisioningState value
     */
    public String targetProvisioningState() {
        return this.targetProvisioningState;
    }

    /**
     * Get creation UTC date of the API Management service.The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the createdAtUtc value
     */
    public DateTime createdAtUtc() {
        return this.createdAtUtc;
    }

    /**
     * Get gateway URL of the API Management service.
     *
     * @return the gatewayUrl value
     */
    public String gatewayUrl() {
        return this.gatewayUrl;
    }

    /**
     * Get gateway URL of the API Management service in the Default Region.
     *
     * @return the gatewayRegionalUrl value
     */
    public String gatewayRegionalUrl() {
        return this.gatewayRegionalUrl;
    }

    /**
     * Get publisher portal endpoint Url of the API Management service.
     *
     * @return the portalUrl value
     */
    public String portalUrl() {
        return this.portalUrl;
    }

    /**
     * Get management API endpoint URL of the API Management service.
     *
     * @return the managementApiUrl value
     */
    public String managementApiUrl() {
        return this.managementApiUrl;
    }

    /**
     * Get sCM endpoint URL of the API Management service.
     *
     * @return the scmUrl value
     */
    public String scmUrl() {
        return this.scmUrl;
    }

    /**
     * Get dEveloper Portal endpoint URL of the API Management service.
     *
     * @return the developerPortalUrl value
     */
    public String developerPortalUrl() {
        return this.developerPortalUrl;
    }

    /**
     * Get custom hostname configuration of the API Management service.
     *
     * @return the hostnameConfigurations value
     */
    public List<HostnameConfiguration> hostnameConfigurations() {
        return this.hostnameConfigurations;
    }

    /**
     * Set custom hostname configuration of the API Management service.
     *
     * @param hostnameConfigurations the hostnameConfigurations value to set
     * @return the ApiManagementServiceBaseProperties object itself.
     */
    public ApiManagementServiceBaseProperties withHostnameConfigurations(List<HostnameConfiguration> hostnameConfigurations) {
        this.hostnameConfigurations = hostnameConfigurations;
        return this;
    }

    /**
     * Get public Static Load Balanced IP addresses of the API Management service in Primary region. Available only for Basic, Standard and Premium SKU.
     *
     * @return the publicIPAddresses value
     */
    public List<String> publicIPAddresses() {
        return this.publicIPAddresses;
    }

    /**
     * Get private Static Load Balanced IP addresses of the API Management service in Primary region which is deployed in an Internal Virtual Network. Available only for Basic, Standard and Premium SKU.
     *
     * @return the privateIPAddresses value
     */
    public List<String> privateIPAddresses() {
        return this.privateIPAddresses;
    }

    /**
     * Get virtual network configuration of the API Management service.
     *
     * @return the virtualNetworkConfiguration value
     */
    public VirtualNetworkConfiguration virtualNetworkConfiguration() {
        return this.virtualNetworkConfiguration;
    }

    /**
     * Set virtual network configuration of the API Management service.
     *
     * @param virtualNetworkConfiguration the virtualNetworkConfiguration value to set
     * @return the ApiManagementServiceBaseProperties object itself.
     */
    public ApiManagementServiceBaseProperties withVirtualNetworkConfiguration(VirtualNetworkConfiguration virtualNetworkConfiguration) {
        this.virtualNetworkConfiguration = virtualNetworkConfiguration;
        return this;
    }

    /**
     * Get additional datacenter locations of the API Management service.
     *
     * @return the additionalLocations value
     */
    public List<AdditionalLocation> additionalLocations() {
        return this.additionalLocations;
    }

    /**
     * Set additional datacenter locations of the API Management service.
     *
     * @param additionalLocations the additionalLocations value to set
     * @return the ApiManagementServiceBaseProperties object itself.
     */
    public ApiManagementServiceBaseProperties withAdditionalLocations(List<AdditionalLocation> additionalLocations) {
        this.additionalLocations = additionalLocations;
        return this;
    }

    /**
     * Get custom properties of the API Management service.&lt;/br&gt;Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.TripleDes168` will disable the cipher TLS_RSA_WITH_3DES_EDE_CBC_SHA for all TLS(1.0, 1.1 and 1.2).&lt;/br&gt;Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Protocols.Tls11` can be used to disable just TLS 1.1.&lt;/br&gt;Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Protocols.Tls10` can be used to disable TLS 1.0 on an API Management service.&lt;/br&gt;Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Backend.Protocols.Tls11` can be used to disable just TLS 1.1 for communications with backends.&lt;/br&gt;Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Backend.Protocols.Tls10` can be used to disable TLS 1.0 for communications with backends.&lt;/br&gt;Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Protocols.Server.Http2` can be used to enable HTTP2 protocol on an API Management service.&lt;/br&gt;Not specifying any of these properties on PATCH operation will reset omitted properties' values to their defaults. For all the settings except Http2 the default value is `True` if the service was created on or before April 1st 2018 and `False` otherwise. Http2 setting's default value is `False`.&lt;/br&gt;&lt;/br&gt;You can disable any of next ciphers by using settings `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.[cipher_name]`: TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA256, TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_CBC_SHA. For example, `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.TLS_RSA_WITH_AES_128_CBC_SHA256`:`false`. The default value is `true` for them.  Note: next ciphers can't be disabled since they are required by Azure CloudService internal components: TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384,TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256,TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384,TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256,TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384,TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256,TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384,TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256,TLS_RSA_WITH_AES_256_GCM_SHA384.
     *
     * @return the customProperties value
     */
    public Map<String, String> customProperties() {
        return this.customProperties;
    }

    /**
     * Set custom properties of the API Management service.&lt;/br&gt;Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.TripleDes168` will disable the cipher TLS_RSA_WITH_3DES_EDE_CBC_SHA for all TLS(1.0, 1.1 and 1.2).&lt;/br&gt;Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Protocols.Tls11` can be used to disable just TLS 1.1.&lt;/br&gt;Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Protocols.Tls10` can be used to disable TLS 1.0 on an API Management service.&lt;/br&gt;Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Backend.Protocols.Tls11` can be used to disable just TLS 1.1 for communications with backends.&lt;/br&gt;Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Backend.Protocols.Tls10` can be used to disable TLS 1.0 for communications with backends.&lt;/br&gt;Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Protocols.Server.Http2` can be used to enable HTTP2 protocol on an API Management service.&lt;/br&gt;Not specifying any of these properties on PATCH operation will reset omitted properties' values to their defaults. For all the settings except Http2 the default value is `True` if the service was created on or before April 1st 2018 and `False` otherwise. Http2 setting's default value is `False`.&lt;/br&gt;&lt;/br&gt;You can disable any of next ciphers by using settings `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.[cipher_name]`: TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA256, TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_CBC_SHA. For example, `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.TLS_RSA_WITH_AES_128_CBC_SHA256`:`false`. The default value is `true` for them.  Note: next ciphers can't be disabled since they are required by Azure CloudService internal components: TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384,TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256,TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384,TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256,TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384,TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256,TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384,TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256,TLS_RSA_WITH_AES_256_GCM_SHA384.
     *
     * @param customProperties the customProperties value to set
     * @return the ApiManagementServiceBaseProperties object itself.
     */
    public ApiManagementServiceBaseProperties withCustomProperties(Map<String, String> customProperties) {
        this.customProperties = customProperties;
        return this;
    }

    /**
     * Get list of Certificates that need to be installed in the API Management service. Max supported certificates that can be installed is 10.
     *
     * @return the certificates value
     */
    public List<CertificateConfiguration> certificates() {
        return this.certificates;
    }

    /**
     * Set list of Certificates that need to be installed in the API Management service. Max supported certificates that can be installed is 10.
     *
     * @param certificates the certificates value to set
     * @return the ApiManagementServiceBaseProperties object itself.
     */
    public ApiManagementServiceBaseProperties withCertificates(List<CertificateConfiguration> certificates) {
        this.certificates = certificates;
        return this;
    }

    /**
     * Get property only meant to be used for Consumption SKU Service. This enforces a client certificate to be presented on each request to the gateway. This also enables the ability to authenticate the certificate in the policy on the gateway.
     *
     * @return the enableClientCertificate value
     */
    public Boolean enableClientCertificate() {
        return this.enableClientCertificate;
    }

    /**
     * Set property only meant to be used for Consumption SKU Service. This enforces a client certificate to be presented on each request to the gateway. This also enables the ability to authenticate the certificate in the policy on the gateway.
     *
     * @param enableClientCertificate the enableClientCertificate value to set
     * @return the ApiManagementServiceBaseProperties object itself.
     */
    public ApiManagementServiceBaseProperties withEnableClientCertificate(Boolean enableClientCertificate) {
        this.enableClientCertificate = enableClientCertificate;
        return this;
    }

    /**
     * Get property only valid for an Api Management service deployed in multiple locations. This can be used to disable the gateway in master region.
     *
     * @return the disableGateway value
     */
    public Boolean disableGateway() {
        return this.disableGateway;
    }

    /**
     * Set property only valid for an Api Management service deployed in multiple locations. This can be used to disable the gateway in master region.
     *
     * @param disableGateway the disableGateway value to set
     * @return the ApiManagementServiceBaseProperties object itself.
     */
    public ApiManagementServiceBaseProperties withDisableGateway(Boolean disableGateway) {
        this.disableGateway = disableGateway;
        return this;
    }

    /**
     * Get the type of VPN in which API Management service needs to be configured in. None (Default Value) means the API Management service is not part of any Virtual Network, External means the API Management deployment is set up inside a Virtual Network having an Internet Facing Endpoint, and Internal means that API Management deployment is setup inside a Virtual Network having an Intranet Facing Endpoint only. Possible values include: 'None', 'External', 'Internal'.
     *
     * @return the virtualNetworkType value
     */
    public VirtualNetworkType virtualNetworkType() {
        return this.virtualNetworkType;
    }

    /**
     * Set the type of VPN in which API Management service needs to be configured in. None (Default Value) means the API Management service is not part of any Virtual Network, External means the API Management deployment is set up inside a Virtual Network having an Internet Facing Endpoint, and Internal means that API Management deployment is setup inside a Virtual Network having an Intranet Facing Endpoint only. Possible values include: 'None', 'External', 'Internal'.
     *
     * @param virtualNetworkType the virtualNetworkType value to set
     * @return the ApiManagementServiceBaseProperties object itself.
     */
    public ApiManagementServiceBaseProperties withVirtualNetworkType(VirtualNetworkType virtualNetworkType) {
        this.virtualNetworkType = virtualNetworkType;
        return this;
    }

    /**
     * Get control Plane Apis version constraint for the API Management service.
     *
     * @return the apiVersionConstraint value
     */
    public ApiVersionConstraint apiVersionConstraint() {
        return this.apiVersionConstraint;
    }

    /**
     * Set control Plane Apis version constraint for the API Management service.
     *
     * @param apiVersionConstraint the apiVersionConstraint value to set
     * @return the ApiManagementServiceBaseProperties object itself.
     */
    public ApiManagementServiceBaseProperties withApiVersionConstraint(ApiVersionConstraint apiVersionConstraint) {
        this.apiVersionConstraint = apiVersionConstraint;
        return this;
    }

}
