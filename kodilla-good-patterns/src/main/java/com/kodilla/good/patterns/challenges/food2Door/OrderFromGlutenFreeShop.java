package com.kodilla.good.patterns.challenges.food2Door;

public class OrderFromGlutenFreeShop extends OrderProcess {

    @Override
    protected void inform(boolean isAvailable) {
        if (isAvailable) {
            System.out.println("Call to");
        }
    }

    public void process () {
    }
}
