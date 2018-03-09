package com.kodilla.good.patterns.challenges;

class AGDSaleService implements SaleService {

    @Override
    public boolean sale(SaleRequest saleRequest) {
        if (saleRequest != null) {
            return true;
        } else {
            return false;
        }
    }
}