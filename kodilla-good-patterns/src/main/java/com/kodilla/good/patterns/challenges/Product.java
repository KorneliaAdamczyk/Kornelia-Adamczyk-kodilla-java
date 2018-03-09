package com.kodilla.good.patterns.challenges;

public class Product {

    private String ProductName;
    private String ProductDescription;

    public Product(String productName, String productDescription) {
        ProductName = productName;
        ProductDescription = productDescription;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getProductDescription() {
        return ProductDescription;
    }
}
