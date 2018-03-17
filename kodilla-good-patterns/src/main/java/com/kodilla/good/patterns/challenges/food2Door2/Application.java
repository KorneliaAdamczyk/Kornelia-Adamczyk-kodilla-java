package com.kodilla.good.patterns.challenges.food2Door2;

public class Application {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order1 = orderRetriever.retriever("Carrot", 10);
        SupplierSelection supplierSelection=new SupplierSelection();
        OrderProcess orderProcess=supplierSelection.choiceSupplier(order1);
        orderProcess.inform();


    }
}
