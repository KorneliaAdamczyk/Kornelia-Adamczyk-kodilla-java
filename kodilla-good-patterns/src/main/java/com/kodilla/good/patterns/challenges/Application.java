package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main (String[] args){
        SaleRequestRetriever saleRequestRetriever= new SaleRequestRetriever();
        SaleRequest saleRequest=saleRequestRetriever.retriever("kuchenka", 7);

        ProductOrderService productOrderService=new ProductOrderService(new MailService(), new AGDSaleService(), new AGDSaleRepository());
        productOrderService.process(saleRequest);

    }
}
