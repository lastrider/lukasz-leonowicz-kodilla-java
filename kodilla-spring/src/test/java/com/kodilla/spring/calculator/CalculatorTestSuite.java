package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(1,2);
        double sub = calculator.sub(3,1);
        double div = calculator.div(4, 2);
        double mul = calculator.mul(2, 3);
        //Then

        Assert.assertTrue(add == 3 || sub == 2 || div == 2 || mul == 6);
    }
}