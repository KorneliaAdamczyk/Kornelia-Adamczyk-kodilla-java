package com.kodilla.good.patterns.challenges.food2Door2;


abstract class OrderProcess {

    private Order createOrder(Order order1) {
        OrderRepository orderRepository=new OrderRepository();
        orderRepository.create(order1);
        return order1;
   }

    abstract protected void inform();

    public void process(Order order1) {
        this.createOrder(order1);
        this.inform();
    }
}