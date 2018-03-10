package com.kodilla.good.patterns.challenges.food2Door;

public class OrderFromExtraFoodShop extends OrderProcess {

    @Override
    protected void inform(boolean isAvailable) {
        if (isAvailable) {
            System.out.println("Send a message");
        }
        }

        public void process () {
        }
    }