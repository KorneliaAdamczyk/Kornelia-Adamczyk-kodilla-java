package com.kodilla.patterns.factory.tasks;

import java.util.HashMap;
import java.util.Map;

public class PaintingTask implements Task{

    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    Boolean done = false;

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
