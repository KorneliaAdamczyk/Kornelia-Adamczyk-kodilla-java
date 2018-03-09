package com.kodilla.good.patterns.challenges;

public class SaleDto {

    public User user;
    boolean isSale;

    public SaleDto(User user, boolean isSale) {
        this.user = user;
        this.isSale = isSale;
    }

    public User getUser() {
        return user;
    }

    public boolean isSale() {
        return isSale;
    }
}
