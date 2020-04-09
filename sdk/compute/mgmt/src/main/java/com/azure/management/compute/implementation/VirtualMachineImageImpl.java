// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.management.compute.implementation;

import com.azure.management.compute.DataDiskImage;
import com.azure.management.compute.ImageReference;
import com.azure.management.compute.OSDiskImage;
import com.azure.management.compute.PurchasePlan;
import com.azure.management.compute.VirtualMachineImage;
import com.azure.management.compute.models.VirtualMachineImageInner;
import com.azure.management.resources.fluentcore.arm.Region;
import com.azure.management.resources.fluentcore.model.implementation.IndexableWrapperImpl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The implementation for {@link VirtualMachineImage}.
 */
class VirtualMachineImageImpl
        extends IndexableWrapperImpl<VirtualMachineImageInner>
        implements VirtualMachineImage {
    private final Region location;
    private ImageReference imageReference;

    VirtualMachineImageImpl(Region location, String publisher, String offer, String sku, String version) {
        super(null);
        this.location = location;
        this.imageReference = new ImageReference();
        this.imageReference.withPublisher(publisher);
        this.imageReference.withOffer(offer);
        this.imageReference.withSku(sku);
        this.imageReference.withVersion(version);
    }

    VirtualMachineImageImpl(Region location, String publisher, String offer, String sku, String version, VirtualMachineImageInner innerModel) {
        super(innerModel);
        this.location = location;
        this.imageReference = new ImageReference();
        this.imageReference.withPublisher(publisher);
        this.imageReference.withOffer(offer);
        this.imageReference.withSku(sku);
        this.imageReference.withVersion(version);
    }

    @Override
    public String id() {
        if (this.inner() == null) {
            return null;
        }
        return this.inner().getId();
    }

    @Override
    public Region location() {
        return location;
    }

    @Override
    public String publisherName() {
        return imageReference.publisher();
    }

    @Override
    public String offer() {
        return imageReference.offer();
    }

    @Override
    public String sku() {
        return imageReference.sku();
    }

    @Override
    public String version() {
        return imageReference.version();
    }

    @Override
    public ImageReference imageReference() {
        return imageReference;
    }

    @Override
    public PurchasePlan plan() {
        return inner().plan();
    }

    @Override
    public OSDiskImage osDiskImage() {
        return inner().osDiskImage();
    }

    @Override
    public Map<Integer, DataDiskImage> dataDiskImages() {
        if (inner().dataDiskImages() == null) {
            return Collections.unmodifiableMap(new HashMap<>());
        }
        HashMap<Integer, DataDiskImage> diskImages = new HashMap<>();
        for (DataDiskImage diskImage : inner().dataDiskImages()) {
            diskImages.put(diskImage.lun(), diskImage);
        }
        return Collections.unmodifiableMap(diskImages);
    }
}
