package com.kodilla.good.patterns.challenges;

import java.util.Random;

class AGDSaleRepository implements SaleRepository {

    @Override
    public boolean createSale(SaleRequest saleRequest) {

        Random random = new Random();

        int wynik = random.nextInt(10);
        if (wynik >=saleRequest.getProduct().getQuantity()){
            return true;
        } else {
            return false;
        }
    }
}
