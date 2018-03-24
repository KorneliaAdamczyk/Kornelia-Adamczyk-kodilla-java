package com.kodilla.patterns.factory.tasks;

import java.util.Map;

public interface Task {

    Boolean executeTask();
    String getTaskName();
    Map<String, Boolean> isTaskExecuted();

}
