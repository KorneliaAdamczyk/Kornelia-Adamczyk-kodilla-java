package com.kodilla.good.patterns.challenges.food2Door2;

public class Application {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order1=orderRetriever.retriever ("Carrot",10);
        SupplierSelection supplierSelection=new SupplierSelection();
        supplierSelection.choiceSupplier(supplierSelection.allProducts(extraFoodShop.extraFoodShopProducts(),order1)));
        ExtraFoodShop extraFoodShop=new ExtraFoodShop();
        extraFoodShop.process();
        GlutenFreeShop glutenFreeShop=new GlutenFreeShop();
        glutenFreeShop.process();
        HealthyShop healthyShop=new HealthyShop();
        healthyShop.process();

    }
}