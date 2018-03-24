package com.kodilla.patterns.factory.tasks;


import java.util.HashMap;
import java.util.Map;


public class DrivingTask implements Task {

    String taskName;
    String where;
    String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
        return isDone;
    }

}
