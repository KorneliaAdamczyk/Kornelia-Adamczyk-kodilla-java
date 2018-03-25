package com.kodilla.patterns.factory.tasks;

import java.util.HashMap;
import java.util.Map;

public class ShoppingTask implements Task{

    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    private boolean done = false;

    @Override
    public void executeTask() {
        done = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return done;
    }

}
