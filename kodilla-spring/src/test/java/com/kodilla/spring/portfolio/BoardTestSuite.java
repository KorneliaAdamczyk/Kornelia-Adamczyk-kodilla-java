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
        Assert.assertTrue(toDoListExists);
        Assert.assertTrue(inProgressListExists);
        Assert.assertTrue(doneListExists);

    }

}
