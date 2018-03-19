package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Bean
    public TaskList createToDoList(){
        ArrayList<String>toDoList=new ArrayList<>();
        return new TaskList();
    }

    @Bean
    public TaskList createInProgressList() {
        ArrayList<String> inProgressList = new ArrayList<>();
        return new TaskList();
    }

    @Bean
        public TaskList createDoneList() {
            ArrayList<String> doneList = new ArrayList<>();
            return new TaskList();
        }

        @Bean
    public Board getBoard() {
        return new Board(createToDoList(),createInProgressList(),createDoneList() );
    }

}
