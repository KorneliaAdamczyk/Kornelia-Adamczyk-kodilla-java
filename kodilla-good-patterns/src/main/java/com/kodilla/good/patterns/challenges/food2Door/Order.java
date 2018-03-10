package com.kodilla.good.patterns.challenges.food2Door;

public class Order {

    private String nameProduct;
    private int quantity;

    public Order(String nameProduct, int quantity) {
        this.nameProduct = nameProduct;
        this.quantity = quantity;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }
}
