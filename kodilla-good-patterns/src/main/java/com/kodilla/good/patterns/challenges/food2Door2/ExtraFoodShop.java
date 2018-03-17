package com.kodilla.good.patterns.challenges.food2Door2;

import java.time.LocalDate;
import java.time.Period;
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

        LocalDate deliveryDate;
        deliveryDate = LocalDate.now().plus(Period.ofDays(3));

        System.out.println("The order will prepare " + getSupplierName() + "." + '\n' + "Delivery date order is expected for "+ deliveryDate+".");
    }

}
