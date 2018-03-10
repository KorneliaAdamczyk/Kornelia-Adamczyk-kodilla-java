package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HealthyShop implements Supplier {

    public String getNameSupplier() {
        return "Healthy Shop";
    }

    public Set<Map.Entry<String, Integer>> getProducts() {
        Map<String, Integer>products=new HashMap<>();
        products.put("Bread", 40);
        products.put("Egg", 50);
        products.put("Sousage",22);
        return products.entrySet();
    }

}
