package com.kodilla.patterns.factory.tasks;

import java.util.HashMap;
import java.util.Map;

public class PaintingTask implements Task{

    String taskName;
    String color;
    String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
