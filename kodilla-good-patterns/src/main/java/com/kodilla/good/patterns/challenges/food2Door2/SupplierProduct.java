package com.kodilla.good.patterns.challenges.food2Door2;

public class SupplierProduct {

    private OrderProcess nameSupplier;
    private String nameProduct;

    public SupplierProduct(String nameProduct, OrderProcess nameSupplier) {
        this.nameSupplier = nameSupplier;
        this.nameProduct = nameProduct;
    }

    public OrderProcess getNameSupplier() {
        return nameSupplier;
    }
    public String getNameProduct() {
        return nameProduct;
    }
}
