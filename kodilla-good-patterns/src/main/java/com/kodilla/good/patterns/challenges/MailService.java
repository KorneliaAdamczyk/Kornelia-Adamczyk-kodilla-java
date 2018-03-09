package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    public void inform (SaleRequest saleRequest) {
        System.out.println("Send e-mail to user: " + saleRequest.user);
    }
}
