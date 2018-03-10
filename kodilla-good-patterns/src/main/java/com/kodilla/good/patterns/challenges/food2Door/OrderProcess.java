package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;

abstract public class OrderProcess {

    private boolean checkProduct(HashMap<String, Integer>products){
        if (products.containsKey(order.getNameProduct)&&products.get(String)>order.getQuantity) {
            boolean isAvailable=true;
        }else{
            boolean isAvailable= false;
        }
    }

    private void createOrder(boolean isAvailable){
       if (isAvailable) {
           orderRepository.create(order);
       }
    }
    abstract protected void inform (boolean isAvailable);

    public void process(){
        this.checkProduct();
        this.createOrder();
        this.inform();
    }

}
