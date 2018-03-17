package com.kodilla.good.patterns.challenges.food2Door2;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;


public class HealthyShop extends OrderProcess {

    public String getSupplierName() {
        return "Healthy Shop";
    }

    public Map<SupplierProduct, Integer> getHealthyShopProducts() {
        Map<SupplierProduct, Integer> healthyShopProducts = new HashMap<>();
        healthyShopProducts.put(new SupplierProduct("Bread", new HealthyShop()), 40);
        healthyShopProducts.put(new SupplierProduct("Egg", new HealthyShop()), 50);
        healthyShopProducts.put(new SupplierProduct("Sousage", new HealthyShop()), 22);
        return healthyShopProducts;
    }

    protected void inform() {

        LocalDate deliveryDate;
        deliveryDate = LocalDate.now().plus(Period.ofDays(4));

        System.out.println("The order will prepare " + getSupplierName() + "." + '\n' + "Delivery date order is expected for "+ deliveryDate+".");

    }
}
