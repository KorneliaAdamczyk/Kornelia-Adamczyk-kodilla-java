package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

 private final String roll;
 private final int burgers;
 private final String sauce;
 private final List<String> ingredients;

public static class BigmacBuilder {
    private String roll;
    private int burgers;
    private String sauce;
    private List<String> ingredients=new ArrayList<>();

    public BigmacBuilder roll (String roll) {
        if (roll.equals("with sesame") || roll.equals("without sesame")) {
            this.roll = roll;
        }else {
            throw new IllegalStateException("Roll should be with sesame or without sesame.");
        }
        return this;
    }

    public BigmacBuilder burgers (int burgers) {
        this.burgers = burgers;
        return this;
    }

    public BigmacBuilder sauce (String sauce){
        if (sauce.equals("standard") || sauce.equals("thousand island") || sauce.equals("barbecue")) {
            this.sauce = sauce;
        } else {
            throw new IllegalStateException("Sauce should be standard or thousand island or barbecue.");
        }
        return this;
    }

    public BigmacBuilder ingredient (String ingredient) {
        if (ingredient.equals("lettuce") ||
                ingredient.equals("onion") ||
                    ingredient.equals("becon") ||
                        ingredient.equals("cucumber") ||
                            ingredient.equals("chili peppers") ||
                                ingredient.equals("shrimp") ||
                                    ingredient.equals("mushrooms") ||
                                        ingredient.equals("cheese")) {
            ingredients.add(ingredient);
        } else {
            throw new IllegalStateException("Ingredients to choose from: lettuce, onion, becon, cucumber, chili peppers, shrimp, mushrooms, cheese.");
        }
        return this;
    }

    public Bigmac build() {
        return new Bigmac(roll, burgers, sauce, ingredients);
    }

}

 private Bigmac (final String roll, final int burgers, final String sauce, List <String> ingredients){
    this.roll = roll;
    this.burgers = burgers;
    this.sauce = sauce;
    this.ingredients = new ArrayList<>(ingredients);
}

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
