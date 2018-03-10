package com.kodilla.good.patterns.challenges;

import java.util.Random;

class AGDSaleService implements SaleService {

    @Override
    public boolean sale(SaleRequest saleRequest) {

       Random random = new Random();
        int wynik = random.nextInt(2);

        if (wynik <1) {
            return true;
        } else {
            return false;
        }
    }
}