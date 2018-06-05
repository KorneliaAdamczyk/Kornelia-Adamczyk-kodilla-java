package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testMargheritaGetCost(){

        //Given
        PizzaOrder pizzaOrder = new Margherita();

        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testMargheritaGetDescription(){

        //Given
        PizzaOrder pizzaOrder = new Margherita();

        //When
        String description = pizzaOrder.getDescription();

        //Then
        Assert.assertEquals("Pizza with cheese, tomato sauce", description);
    }

    @Test
    public void testVegetableMeatSeafoodAdditionsGetCost() {

        //Given
        PizzaOrder order = new Margherita();

        order = new Vegetable(order);
        order = new Meat(order);
        order = new Seafood(order);

        //When
        BigDecimal cost = order.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(30), cost);

    }
     @Test
     public void testVegetableMeatSeafoodAdditionsGetDescription(){

         //Given
         PizzaOrder order = new Margherita();

         order = new Vegetable(order);
         order = new Meat(order);
         order = new Seafood(order);

         //When
         String description = order.getDescription();

         //Then
         Assert.assertEquals("Pizza with cheese, tomato sauce, vegetable addition, meat addition, seafood addition", description);
        }
    }

