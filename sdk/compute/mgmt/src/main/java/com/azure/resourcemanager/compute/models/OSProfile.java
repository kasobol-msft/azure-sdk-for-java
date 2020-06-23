// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OSProfile model. */
@Fluent
public final class OSProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OSProfile.class);

    /*
     * Specifies the host OS name of the virtual machine. <br><br> This name
     * cannot be updated after the VM is created. <br><br> **Max-length
     * (Windows):** 15 characters <br><br> **Max-length (Linux):** 64
     * characters. <br><br> For naming conventions and restrictions see [Azure
     * infrastructure services implementation
     * guidelines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-infrastructure-subscription-accounts-guidelines?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json#1-naming-conventions).
     */
    @JsonProperty(value = "computerName")
    private String computerName;

    /*
     * Specifies the name of the administrator account. <br><br> **Windows-only
     * restriction:** Cannot end in "." <br><br> **Disallowed values:**
     * "administrator", "admin", "user", "user1", "test", "user2", "test1",
     * "user3", "admin1", "1", "123", "a", "actuser", "adm", "admin2",
     * "aspnet", "backup", "console", "david", "guest", "john", "owner",
     * "root", "server", "sql", "support", "support_388945a0", "sys", "test2",
     * "test3", "user4", "user5". <br><br> **Minimum-length (Linux):** 1
     * character <br><br> **Max-length (Linux):** 64 characters <br><br>
     * **Max-length (Windows):** 20 characters  <br><br><li> For root access to
     * the Linux VM, see [Using root privileges on Linux virtual machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-use-root-privileges?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)<br><li>
     * For a list of built-in system users on Linux that should not be used in
     * this field, see [Selecting User Names for Linux on
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-usernames?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
     */
    @JsonProperty(value = "adminUsername")
    private String adminUsername;

    /*
     * Specifies the password of the administrator account. <br><br>
     * **Minimum-length (Windows):** 8 characters <br><br> **Minimum-length
     * (Linux):** 6 characters <br><br> **Max-length (Windows):** 123
     * characters <br><br> **Max-length (Linux):** 72 characters <br><br>
     * **Complexity requirements:** 3 out of 4 conditions below need to be
     * fulfilled <br> Has lower characters <br>Has upper characters <br> Has a
     * digit <br> Has a special character (Regex match [\W_]) <br><br>
     * **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd", "P@ssword123",
     * "Pa$$word", "pass@word1", "Password!", "Password1", "Password22",
     * "iloveyou!" <br><br> For resetting the password, see [How to reset the
     * Remote Desktop service or its login password in a Windows
     * VM](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-reset-rdp?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * <br><br> For resetting root password, see [Manage users, SSH, and check
     * or repair disks on Azure Linux VMs using the VMAccess
     * Extension](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-vmaccess-extension?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json#reset-root-password)
     */
    @JsonProperty(value = "adminPassword")
    private String adminPassword;

    /*
     * Specifies a base-64 encoded string of custom data. The base-64 encoded
     * string is decoded to a binary array that is saved as a file on the
     * Virtual Machine. The maximum length of the binary array is 65535 bytes.
     * <br><br> For using cloud-init for your VM, see [Using cloud-init to
     * customize a Linux VM during
     * creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
     */
    @JsonProperty(value = "customData")
    private String customData;

    /*
     * Specifies Windows operating system settings on the virtual machine.
     */
    @JsonProperty(value = "windowsConfiguration")
    private WindowsConfiguration windowsConfiguration;

    /*
     * Specifies the Linux operating system settings on the virtual machine.
     * <br><br>For a list of supported Linux distributions, see [Linux on
     * Azure-Endorsed
     * Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-endorsed-distros?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
     * <br><br> For running non-endorsed distributions, see [Information for
     * Non-Endorsed
     * Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-create-upload-generic?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     */
    @JsonProperty(value = "linuxConfiguration")
    private LinuxConfiguration linuxConfiguration;

    /*
     * Specifies set of certificates that should be installed onto the virtual
     * machine.
     */
    @JsonProperty(value = "secrets")
    private List<VaultSecretGroup> secrets;

    /*
     * Specifies whether extension operations should be allowed on the virtual
     * machine. <br><br>This may only be set to False when no extensions are
     * present on the virtual machine.
     */
    @JsonProperty(value = "allowExtensionOperations")
    private Boolean allowExtensionOperations;

    /*
     * Specifies whether the guest provision signal is required from the
     * virtual machine.
     */
    @JsonProperty(value = "requireGuestProvisionSignal")
    private Boolean requireGuestProvisionSignal;

    /**
     * Get the computerName property: Specifies the host OS name of the virtual machine. &lt;br&gt;&lt;br&gt; This name
     * cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 15 characters
     * &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters. &lt;br&gt;&lt;br&gt; For naming conventions and
     * restrictions see [Azure infrastructure services implementation
     * guidelines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-infrastructure-subscription-accounts-guidelines?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json#1-naming-conventions).
     *
     * @return the computerName value.
     */
    public String computerName() {
        return this.computerName;
    }

    /**
     * Set the computerName property: Specifies the host OS name of the virtual machine. &lt;br&gt;&lt;br&gt; This name
     * cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 15 characters
     * &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters. &lt;br&gt;&lt;br&gt; For naming conventions and
     * restrictions see [Azure infrastructure services implementation
     * guidelines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-infrastructure-subscription-accounts-guidelines?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json#1-naming-conventions).
     *
     * @param computerName the computerName value to set.
     * @return the OSProfile object itself.
     */
    public OSProfile withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * Get the adminUsername property: Specifies the name of the administrator account. &lt;br&gt;&lt;br&gt;
     * **Windows-only restriction:** Cannot end in "." &lt;br&gt;&lt;br&gt; **Disallowed values:** "administrator",
     * "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm",
     * "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support",
     * "support_388945a0", "sys", "test2", "test3", "user4", "user5". &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 1
     * character &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters &lt;br&gt;&lt;br&gt; **Max-length
     * (Windows):** 20 characters &lt;br&gt;&lt;br&gt;&lt;li&gt; For root access to the Linux VM, see [Using root
     * privileges on Linux virtual machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-use-root-privileges?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)&lt;br&gt;&lt;li&gt;
     * For a list of built-in system users on Linux that should not be used in this field, see [Selecting User Names for
     * Linux on
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-usernames?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @return the adminUsername value.
     */
    public String adminUsername() {
        return this.adminUsername;
    }

    /**
     * Set the adminUsername property: Specifies the name of the administrator account. &lt;br&gt;&lt;br&gt;
     * **Windows-only restriction:** Cannot end in "." &lt;br&gt;&lt;br&gt; **Disallowed values:** "administrator",
     * "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm",
     * "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support",
     * "support_388945a0", "sys", "test2", "test3", "user4", "user5". &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 1
     * character &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters &lt;br&gt;&lt;br&gt; **Max-length
     * (Windows):** 20 characters &lt;br&gt;&lt;br&gt;&lt;li&gt; For root access to the Linux VM, see [Using root
     * privileges on Linux virtual machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-use-root-privileges?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)&lt;br&gt;&lt;li&gt;
     * For a list of built-in system users on Linux that should not be used in this field, see [Selecting User Names for
     * Linux on
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-usernames?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @param adminUsername the adminUsername value to set.
     * @return the OSProfile object itself.
     */
    public OSProfile withAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
        return this;
    }

    /**
     * Get the adminPassword property: Specifies the password of the administrator account. &lt;br&gt;&lt;br&gt;
     * **Minimum-length (Windows):** 8 characters &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 6 characters
     * &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 123 characters &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 72
     * characters &lt;br&gt;&lt;br&gt; **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled
     * &lt;br&gt; Has lower characters &lt;br&gt;Has upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special
     * character (Regex match [\W_]) &lt;br&gt;&lt;br&gt; **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd",
     * "P@ssword123", "Pa$$word", "pass@word1", "Password!", "Password1", "Password22", "iloveyou!" &lt;br&gt;&lt;br&gt;
     * For resetting the password, see [How to reset the Remote Desktop service or its login password in a Windows
     * VM](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-reset-rdp?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; For resetting root password, see [Manage users, SSH, and check or repair disks on Azure
     * Linux VMs using the VMAccess
     * Extension](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-vmaccess-extension?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json#reset-root-password).
     *
     * @return the adminPassword value.
     */
    public String adminPassword() {
        return this.adminPassword;
    }

    /**
     * Set the adminPassword property: Specifies the password of the administrator account. &lt;br&gt;&lt;br&gt;
     * **Minimum-length (Windows):** 8 characters &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 6 characters
     * &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 123 characters &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 72
     * characters &lt;br&gt;&lt;br&gt; **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled
     * &lt;br&gt; Has lower characters &lt;br&gt;Has upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special
     * character (Regex match [\W_]) &lt;br&gt;&lt;br&gt; **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd",
     * "P@ssword123", "Pa$$word", "pass@word1", "Password!", "Password1", "Password22", "iloveyou!" &lt;br&gt;&lt;br&gt;
     * For resetting the password, see [How to reset the Remote Desktop service or its login password in a Windows
     * VM](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-reset-rdp?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; For resetting root password, see [Manage users, SSH, and check or repair disks on Azure
     * Linux VMs using the VMAccess
     * Extension](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-vmaccess-extension?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json#reset-root-password).
     *
     * @param adminPassword the adminPassword value to set.
     * @return the OSProfile object itself.
     */
    public OSProfile withAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }

    /**
     * Get the customData property: Specifies a base-64 encoded string of custom data. The base-64 encoded string is
     * decoded to a binary array that is saved as a file on the Virtual Machine. The maximum length of the binary array
     * is 65535 bytes. &lt;br&gt;&lt;br&gt; For using cloud-init for your VM, see [Using cloud-init to customize a Linux
     * VM during
     * creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @return the customData value.
     */
    public String customData() {
        return this.customData;
    }

    /**
     * Set the customData property: Specifies a base-64 encoded string of custom data. The base-64 encoded string is
     * decoded to a binary array that is saved as a file on the Virtual Machine. The maximum length of the binary array
     * is 65535 bytes. &lt;br&gt;&lt;br&gt; For using cloud-init for your VM, see [Using cloud-init to customize a Linux
     * VM during
     * creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @param customData the customData value to set.
     * @return the OSProfile object itself.
     */
    public OSProfile withCustomData(String customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Get the windowsConfiguration property: Specifies Windows operating system settings on the virtual machine.
     *
     * @return the windowsConfiguration value.
     */
    public WindowsConfiguration windowsConfiguration() {
        return this.windowsConfiguration;
    }

    /**
     * Set the windowsConfiguration property: Specifies Windows operating system settings on the virtual machine.
     *
     * @param windowsConfiguration the windowsConfiguration value to set.
     * @return the OSProfile object itself.
     */
    public OSProfile withWindowsConfiguration(WindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
        return this;
    }

    /**
     * Get the linuxConfiguration property: Specifies the Linux operating system settings on the virtual machine.
     * &lt;br&gt;&lt;br&gt;For a list of supported Linux distributions, see [Linux on Azure-Endorsed
     * Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-endorsed-distros?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; For running non-endorsed distributions, see [Information for Non-Endorsed
     * Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-create-upload-generic?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @return the linuxConfiguration value.
     */
    public LinuxConfiguration linuxConfiguration() {
        return this.linuxConfiguration;
    }

    /**
     * Set the linuxConfiguration property: Specifies the Linux operating system settings on the virtual machine.
     * &lt;br&gt;&lt;br&gt;For a list of supported Linux distributions, see [Linux on Azure-Endorsed
     * Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-endorsed-distros?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; For running non-endorsed distributions, see [Information for Non-Endorsed
     * Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-create-upload-generic?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @param linuxConfiguration the linuxConfiguration value to set.
     * @return the OSProfile object itself.
     */
    public OSProfile withLinuxConfiguration(LinuxConfiguration linuxConfiguration) {
        this.linuxConfiguration = linuxConfiguration;
        return this;
    }

    /**
     * Get the secrets property: Specifies set of certificates that should be installed onto the virtual machine.
     *
     * @return the secrets value.
     */
    public List<VaultSecretGroup> secrets() {
        return this.secrets;
    }

    /**
     * Set the secrets property: Specifies set of certificates that should be installed onto the virtual machine.
     *
     * @param secrets the secrets value to set.
     * @return the OSProfile object itself.
     */
    public OSProfile withSecrets(List<VaultSecretGroup> secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * Get the allowExtensionOperations property: Specifies whether extension operations should be allowed on the
     * virtual machine. &lt;br&gt;&lt;br&gt;This may only be set to False when no extensions are present on the virtual
     * machine.
     *
     * @return the allowExtensionOperations value.
     */
    public Boolean allowExtensionOperations() {
        return this.allowExtensionOperations;
    }

    /**
     * Set the allowExtensionOperations property: Specifies whether extension operations should be allowed on the
     * virtual machine. &lt;br&gt;&lt;br&gt;This may only be set to False when no extensions are present on the virtual
     * machine.
     *
     * @param allowExtensionOperations the allowExtensionOperations value to set.
     * @return the OSProfile object itself.
     */
    public OSProfile withAllowExtensionOperations(Boolean allowExtensionOperations) {
        this.allowExtensionOperations = allowExtensionOperations;
        return this;
    }

    /**
     * Get the requireGuestProvisionSignal property: Specifies whether the guest provision signal is required from the
     * virtual machine.
     *
     * @return the requireGuestProvisionSignal value.
     */
    public Boolean requireGuestProvisionSignal() {
        return this.requireGuestProvisionSignal;
    }

    /**
     * Set the requireGuestProvisionSignal property: Specifies whether the guest provision signal is required from the
     * virtual machine.
     *
     * @param requireGuestProvisionSignal the requireGuestProvisionSignal value to set.
     * @return the OSProfile object itself.
     */
    public OSProfile withRequireGuestProvisionSignal(Boolean requireGuestProvisionSignal) {
        this.requireGuestProvisionSignal = requireGuestProvisionSignal;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (windowsConfiguration() != null) {
            windowsConfiguration().validate();
        }
        if (linuxConfiguration() != null) {
            linuxConfiguration().validate();
        }
        if (secrets() != null) {
            secrets().forEach(e -> e.validate());
        }
    }
}
