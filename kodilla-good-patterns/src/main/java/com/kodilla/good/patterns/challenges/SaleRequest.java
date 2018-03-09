package com.kodilla.good.patterns.challenges;

public class SaleRequest {

    public User user;
    public Product product;

    public SaleRequest(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

}
