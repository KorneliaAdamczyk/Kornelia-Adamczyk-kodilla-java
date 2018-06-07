package com.kodilla.patterns2.observer.homework;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {

    @Test
    public void testUpdate(){

        //Given
        Mentor mentor1 = new Mentor("Jan", "Kowalski");
        Mentor mentor2 = new Mentor ("Anna", "Nowak");
        Homework kaparnikHomework = new Homework("Kaparnik", "Tomasz");
        Homework gryczHomework = new Homework("Grycz", "Maciej");
        Homework donochHomework = new Homework("Donoch", "Katarzyna");
        Homework krupaHomework = new Homework("Krupa", "Ewa");

        kaparnikHomework.registerMentor(mentor1);
        gryczHomework.registerMentor(mentor1);
        donochHomework.registerMentor(mentor2);
        krupaHomework.registerMentor(mentor2);

        //When
        kaparnikHomework.addHomework("module 1.1");
        kaparnikHomework.addHomework("module 1.2");
        gryczHomework.addHomework("module 20.1");
        donochHomework.addHomework("module 9.4");

        //Then
        Assert.assertEquals(3, mentor1.getUpdateCount());
        Assert.assertEquals(1, mentor2.getUpdateCount());
    }
}
