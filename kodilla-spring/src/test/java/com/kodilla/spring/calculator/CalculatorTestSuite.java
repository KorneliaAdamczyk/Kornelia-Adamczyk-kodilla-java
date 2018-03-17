package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculation(){

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result1 = calculator.add(8,2);
        double result2 = calculator.sub(8,2);
        double result3 = calculator.mul(8,2);
        double result4 = calculator.div(8,2);

        //Then

        Assert.assertEquals(10.00,result1,0 );
        Assert.assertEquals(6.0,result2,0 );
        Assert.assertEquals(16.0,result3,0 );
        Assert.assertEquals(4.0,result4,0 );
    }
}
