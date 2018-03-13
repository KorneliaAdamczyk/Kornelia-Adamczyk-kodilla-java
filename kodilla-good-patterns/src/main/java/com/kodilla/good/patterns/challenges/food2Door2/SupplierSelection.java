package com.kodilla.good.patterns.challenges.food2Door2;

import java.util.HashMap;
import java.util.Map;


public class SupplierSelection {

    public Map<SupplierProduct, Integer> allProducts(HashMap<SupplierProduct, Integer> extraFoodShopProducts, HashMap<SupplierProduct, Integer> healthyShopProducts, HashMap<SupplierProduct, Integer> glutenFreeProducts) {

       Map<SupplierProduct, Integer> allProducts = new HashMap<>();

       for (Map.Entry<SupplierProduct, Integer> entry : extraFoodShopProducts.entrySet()) {
           allProducts.put(entry.getKey(), entry.getValue());
       }
        for (Map.Entry<SupplierProduct, Integer> entry1 : healthyShopProducts.entrySet()) {
            allProducts.put(entry1.getKey(), entry1.getValue());
        }
        for (Map.Entry<SupplierProduct, Integer> entry2 : glutenFreeProducts.entrySet()) {
            allProducts.put(entry2.getKey(), entry2.getValue());
        }
        return allProducts;
    }

public static String choiceSupplier( Map<SupplierProduct, Integer> allProducts, Order order1) {

    for (Map.Entry<SupplierProduct, Integer> entry : allProducts.entrySet()) {

        if (entry.getKey().getNameProduct().equals(order1) && allProducts.get(order1) > order1.getQuantity()) {
            return entry.getKey().getNameSupplier();
        }
    }
    return "Supplier";

}
}
