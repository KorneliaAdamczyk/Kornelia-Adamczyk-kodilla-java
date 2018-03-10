package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    public void inform (SaleRequest saleRequest) {

        System.out.println("Zamówienie na: "+saleRequest.getProduct().getProductName()+ " zostało zrealizowane");
    }
}
