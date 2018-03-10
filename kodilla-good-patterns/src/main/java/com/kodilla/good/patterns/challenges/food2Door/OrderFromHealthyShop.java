package com.kodilla.good.patterns.challenges.food2Door;

public class OrderFromHealthyShop extends OrderProcess {

    @Override
    protected void inform(boolean isAvailable) {
        if (isAvailable) {
            System.out.println("Send the e-mail");
        }
    }

    public void process () {
    }
}

