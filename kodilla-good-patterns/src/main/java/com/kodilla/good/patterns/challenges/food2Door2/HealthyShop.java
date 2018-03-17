package com.kodilla.good.patterns.challenges.food2Door2;

import java.time.Period;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;


public class HealthyShop extends OrderProcess{

    public String getSupplierName() {
            return "Healthy Shop";
        }

    public Map<SupplierProduct, Integer> getHealthyShopProducts() {
            Map<SupplierProduct, Integer> healthyShopProducts=new HashMap<>();
        healthyShopProducts.put(new SupplierProduct("Bread",new HealthyShop()), 40);
        healthyShopProducts.put(new SupplierProduct("Egg",new HealthyShop()), 50);
        healthyShopProducts.put(new SupplierProduct("Sousage",new HealthyShop()),22);
            return healthyShopProducts;
        }


    public void inform(ZonedDateTime zonedDateTime){

        ZonedDateTime deliveryDate;
        deliveryDate = zonedDateTime.plus(Period.ofDays(4));

        System.out.println("Delivery date order is expected for "+ deliveryDate);
}

    @Override
    protected void inform() {

    }
}
