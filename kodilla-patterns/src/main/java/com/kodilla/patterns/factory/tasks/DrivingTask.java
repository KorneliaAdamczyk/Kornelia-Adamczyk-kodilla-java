package com.kodilla.patterns.factory.tasks;


import java.util.HashMap;
import java.util.Map;


public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    boolean done = false;

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
