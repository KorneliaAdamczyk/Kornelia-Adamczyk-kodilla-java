package com.kodilla.good.patterns.challenges.food2Door2;

import java.time.Period;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop extends OrderProcess{

    public String getSupplierName() {
        return "Extra Food Shop";
    }
    public Map<SupplierProduct, Integer> getExtraFoodShopProducts() {

        Map<SupplierProduct, Integer>extraFoodShopProducts=new HashMap<>();
        extraFoodShopProducts.put(new SupplierProduct("Carrot",getSupplierName()), 200);
        extraFoodShopProducts.put(new SupplierProduct("Apple",getSupplierName()), 150);
        extraFoodShopProducts.put(new SupplierProduct("Onion",getSupplierName()), 370);
        return extraFoodShopProducts;
    }

    protected void acceptOrder(Map<SupplierProduct, Integer> allProducts, Order order1){

        if (SupplierSelection.choiceSupplier(allProducts, order1).contains(getSupplierName())) {
            System.out.println("The order is being processed by supplier: "+getSupplierName());
        }
    }

    protected void inform(ZonedDateTime zonedDateTime){

        ZonedDateTime deliveryDate;
        deliveryDate = zonedDateTime.plus(Period.ofDays(3));

        System.out.println("Delivery date order is expected for "+ deliveryDate);
    }

}
