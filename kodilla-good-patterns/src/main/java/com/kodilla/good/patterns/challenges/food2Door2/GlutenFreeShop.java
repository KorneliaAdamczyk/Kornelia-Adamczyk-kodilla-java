//package com.kodilla.good.patterns.challenges.food2Door2;
//
//import java.time.Period;
//import java.time.ZonedDateTime;
//import java.util.HashMap;
//import java.util.Map;
//
//public class GlutenFreeShop extends OrderProcess{
//
//    public String getSupplierName() {
//        return "GlutenFreeShop";
//    }
//
//    public Map<SupplierProduct, Integer> getGlutenShopProducts() {
//        Map<SupplierProduct, Integer> glutenShopProducts = new HashMap<>();
//        glutenShopProducts.put(new SupplierProduct(getSupplierName(), "Pasta"), 37);
//        glutenShopProducts.put(new SupplierProduct(getSupplierName(), "Bread"), 50);
//        glutenShopProducts.put(new SupplierProduct(getSupplierName(), "Flour"), 68);
//        return glutenShopProducts;
//    }
//
//    protected void acceptOrder(Map<SupplierProduct, Integer> allProducts, Order order1){
//
//        if (SupplierSelection.choiceSupplier(allProducts, order1).contains(getSupplierName())) {
//            System.out.println("The order is being processed by supplier: "+getSupplierName());
//        }
//    }
//
//    protected void inform(ZonedDateTime zonedDateTime) {
//
//        ZonedDateTime deliveryDate;
//        deliveryDate = zonedDateTime.plus(Period.ofDays(2));
//
//        System.out.println("Delivery date order is expected for " + deliveryDate);
//    }
//
//}