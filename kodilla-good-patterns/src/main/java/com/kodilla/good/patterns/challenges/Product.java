package com.kodilla.good.patterns.challenges;

public class Product {

    private String productName;
    private String productDescription;
    private int quantity;

    public Product(String productName, String productDescription, int quantity) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getQuantity() {
        return quantity;
    }
}
