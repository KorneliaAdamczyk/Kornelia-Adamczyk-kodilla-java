package com.kodilla.good.patterns.challenges.food2Door2;

import java.time.ZonedDateTime;

abstract class OrderProcess {

    abstract protected void acceptOrder();

    private OrderRepository createOrder(Order order1) {
        OrderRepository orderRepository=new OrderRepository();
        orderRepository.create(order1);
    }

    abstract protected void inform(ZonedDateTime zonedDateTime);

    public void process() {
        this.acceptOrder();
        this.createOrder(Order order1);
        this.inform(ZonedDateTime zonedDateTime);
    }
}