package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
 Display display;
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
    Calculator calculator = context.getBean(Calculator.class);
    @Test
    void addTest(){
        //Given
        //When
        double result = calculator.add(10.2,8.9);
        //Then
        Assertions.assertEquals(19.1,result);
    }
    @Test
    void subTest(){
        //Given
        //When
        double result2 = calculator.sub(10.2,0.2);
        //Then
        Assertions.assertEquals(10,result2);
    }
    @Test
    void mulTest(){
        //Given
        //When
        double result3 = calculator.mul(2,1.1);
        //Then
        Assertions.assertEquals(2.2,result3);
    }
    @Test
    void divTest(){
        //Given
        //When
        double result4 = calculator.div(11,1.1);
        //Then
        Assertions.assertEquals(10,result4);
    }
}
