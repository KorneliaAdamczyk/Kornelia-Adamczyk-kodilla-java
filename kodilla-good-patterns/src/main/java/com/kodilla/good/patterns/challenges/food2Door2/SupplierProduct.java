package com.kodilla.good.patterns.challenges.food2Door2;

public class SupplierProduct {

    private String nameSupplier;
    private String nameProduct;

    public SupplierProduct(String nameProduct, String nameSupplier) {
        this.nameSupplier = nameSupplier;
        this.nameProduct = nameProduct;
    }

    public String getNameSupplier() {
        return nameSupplier;
    }
    public String getNameProduct() {
        return nameProduct;
    }
}
