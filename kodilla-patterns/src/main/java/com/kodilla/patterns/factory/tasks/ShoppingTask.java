package com.kodilla.patterns.factory.tasks;

import java.util.HashMap;
import java.util.Map;

public class ShoppingTask implements Task{

    String taskName;
    String whatToBuy;
    double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    Boolean done = false;

    @Override
    public Boolean executeTask() {
        done = true;
        return done;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Map<String, Boolean> isTaskExecuted() {
        Map<String, Boolean> isDone = new HashMap<>();
        isDone.put(getTaskName(),executeTask());
        return isDone;
    }

}
