package com.kodilla.good.patterns.challenges.food2Door2;

import java.util.HashMap;
import java.util.Map;


public class SupplierSelection {

    private Map<SupplierProduct, Integer> allProducts;

    public SupplierSelection() {
        ExtraFoodShop extraFoodShop=new ExtraFoodShop();
        HealthyShop healthyShop=new HealthyShop();
        GlutenFreeShop glutenFreeShop=new GlutenFreeShop();
        this.allProducts=allProducts(extraFoodShop.getExtraFoodShopProducts(),healthyShop.getHealthyShopProducts(),glutenFreeShop.getGlutenShopProducts());
    }

    public Map<SupplierProduct, Integer> allProducts(Map<SupplierProduct, Integer> extraFoodShopProducts, Map<SupplierProduct, Integer> healthyShopProducts, Map<SupplierProduct, Integer> glutenFreeProducts) {

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

public OrderProcess choiceSupplier( Order order1) {

    for (Map.Entry<SupplierProduct, Integer> entry : allProducts.entrySet()) {

        if (entry.getKey().getNameProduct().equals(order1.getNameProduct())) {
            return entry.getKey().getNameSupplier();
        }
    }
    return null;
}
}
