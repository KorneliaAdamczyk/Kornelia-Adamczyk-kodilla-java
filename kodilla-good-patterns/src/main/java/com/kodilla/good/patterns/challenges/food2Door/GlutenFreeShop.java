package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GlutenFreeShop implements Supplier {

    public String getNameSupplier() {
        return "Gluten Free Shop";
    }

    public Set<Map.Entry<String, Integer>> getProducts() {
        Map<String, Integer>products=new HashMap<>();
        products.put("Pasta", 37);
        products.put("Bread", 50);
        products.put("Flour",68);
        return products.entrySet();
    }




    }

