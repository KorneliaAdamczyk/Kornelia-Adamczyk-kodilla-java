package com.kodilla.patterns.factory.tasks;

import java.util.Map;

public interface Task {

    void executeTask();
    String getTaskName();
    boolean isTaskExecuted();

}
