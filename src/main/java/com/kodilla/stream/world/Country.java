package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class Country {

    private final int quantity ;

   public Country (int quantity){
       this.quantity=quantity;
   }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = new BigDecimal(quantity);
        return peopleQuantity;
    }
}
