package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask (final String taskClass){
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("To buy fruits", "pineapple, apples, bananas", 2.5);
            case PAINTINGTASK:
                return new PaintingTask("Painting kitchen","gray", "wall in kitchen");
            case DRIVINGTASK:
                return new DrivingTask("To drive Grandpa","home","by car");
            default:
                return null;
        }
    }

}
