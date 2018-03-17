package com.kodilla.good.patterns.challenges.food2Door2;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop extends OrderProcess{

    public String getSupplierName() {
        return "GlutenFreeShop";
    }

    public Map<SupplierProduct, Integer> getGlutenShopProducts() {
        Map<SupplierProduct, Integer> glutenShopProducts = new HashMap<>();
        glutenShopProducts.put(new SupplierProduct("Pasta", new GlutenFreeShop()), 37);
        glutenShopProducts.put(new SupplierProduct("Bread", new GlutenFreeShop()), 50);
        glutenShopProducts.put(new SupplierProduct("Flour", new GlutenFreeShop()), 68);
        return glutenShopProducts;
    }

    protected void inform() {

        LocalDate deliveryDate;
        deliveryDate = LocalDate.now().plus(Period.ofDays(2));

        System.out.println("The order will prepare " + getSupplierName() + "." + '\n' + "Delivery date order is expected for "+ deliveryDate+".");
    }

}