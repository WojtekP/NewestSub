package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    @Autowired
    private Display display;

    public double add(double a, double b){
        double sum = a + b;
        display.displayValue(sum);
        return sum;
    }
    public double sub(double a, double b){
        double sum = a - b;
        display.displayValue(sum);
        return sum;
    }
    public double mul(double a, double b){
        double sum = a * b;
        display.displayValue(sum);
        return sum;}
    public double div(double a, double b){
        double sum = a / b;
        display.displayValue(sum);
        return sum;
    }
}
