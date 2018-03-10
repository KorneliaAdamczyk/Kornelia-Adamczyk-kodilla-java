package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExtraFoodShop implements Supplier  {


    public String getNameSupplier() {
        return "Extra Food Shop";
    }

    public Set<Map.Entry<String, Integer>>getProducts() {
        Map<String, Integer>products=new HashMap<>();
        products.put("Carrots", 200);
        products.put("Onions", 150);
        products.put("Apple", 370);
        return products.entrySet();
    }

}
