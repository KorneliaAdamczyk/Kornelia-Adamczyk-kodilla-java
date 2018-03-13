package com.kodilla.good.patterns.challenges.food2Door2;

public class OrderRetriever {

    public Order retriever (String nameProduct, int quantity){

        return new Order(nameProduct, quantity);
    }

}
