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
        extraFoodShopProducts.put(new SupplierProduct("Carrot",new ExtraFoodShop()), 200);
        extraFoodShopProducts.put(new SupplierProduct("Apple",new ExtraFoodShop()), 150);
        extraFoodShopProducts.put(new SupplierProduct("Onion",new ExtraFoodShop()), 370);
        return extraFoodShopProducts;
    }

    protected void inform(){

        ZonedDateTime deliveryDate;
        deliveryDate = ZonedDateTime.now().plus(Period.ofDays(3));

        System.out.println("Delivery date order is expected for "+ deliveryDate);
    }

}
