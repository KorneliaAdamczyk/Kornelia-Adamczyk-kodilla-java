//package com.kodilla.good.patterns.challenges.food2Door2;
//
//import java.time.Period;
//import java.time.ZonedDateTime;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//
//public class HealthyShop extends OrderProcess{
//
//    public String getSupplierName() {
//            return "Healthy Shop";
//        }
//
//    public Map<SupplierProduct, Integer> getHealthyShopProducts() {
//            Map<SupplierProduct, Integer> healthyShopProducts=new HashMap<>();
//        healthyShopProducts.put(new SupplierProduct(getSupplierName(),"Bread"), 40);
//        healthyShopProducts.put(new SupplierProduct(getSupplierName(),"Egg"), 50);
//        healthyShopProducts.put(new SupplierProduct(getSupplierName(),"Sousage"),22);
//            return healthyShopProducts;
//        }
//
//    protected void acceptOrder(Map<SupplierProduct, Integer> allProducts, Order order1){
//
//        if (SupplierSelection.choiceSupplier(allProducts, order1).contains(getSupplierName())) {
//            System.out.println("The order is being processed by supplier: "+getSupplierName());
//        }
//    }
//
//    public void inform(ZonedDateTime zonedDateTime){
//
//        ZonedDateTime deliveryDate;
//        deliveryDate = zonedDateTime.plus(Period.ofDays(4));
//
//        System.out.println("Delivery date order is expected for "+ deliveryDate);
//}
//
//}
