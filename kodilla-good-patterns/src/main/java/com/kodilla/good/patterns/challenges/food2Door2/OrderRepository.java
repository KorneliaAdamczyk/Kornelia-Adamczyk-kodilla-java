package com.kodilla.good.patterns.challenges.food2Door2;

import java.util.Random;

public class OrderRepository {

    public boolean create (Order order1){

        Random random = new Random();
        int wynik = random.nextInt(2);

        if (wynik <1) {
            return true;
        } else {
            return false;
        }
    }
}
