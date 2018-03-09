package com.kodilla.good.patterns.challenges;

class AGDSaleRepository implements SaleRepository {

    @Override
    public boolean createSale(SaleRequest saleRequest) {
        if (saleRequest != null){
            return true;
        } else {
            return false;
        }
    }
}
