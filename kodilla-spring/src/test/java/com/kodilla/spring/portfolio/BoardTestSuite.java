package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class BoardTestSuite {

    @Test
    public void testTaskAdd (){

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        boolean toDoListExists = context.containsBean("toDoList");
        boolean inProgressListExists = context.containsBean("inProgressList");
        boolean doneListExists = context.containsBean("doneList");

        //Then
        System.out.println("Bean toDoList was found in the container: " + toDoListExists);
        System.out.println("Bean inProgressList was found in the container: " + inProgressListExists);
        System.out.println("Bean doneList was found in the container: " + doneListExists);

    }

}
