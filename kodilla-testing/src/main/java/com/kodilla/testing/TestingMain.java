package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("FirstUser");
        Calculator calculator = new Calculator();
        String result = simpleUser.getUserName();

        if(result.equals("FirstUser")){
            System.out.println("Test ok");

        } else {
            System.out.println("Error!");
        }
        System.out.println("Adding test...");
        if(calculator.add(5,7) == (5+7)){
            System.out.println("adding test is ok");
        } else {
            System.out.println("Adding error");
        }
        System.out.println("Substracting test...");
        if(calculator.substract(3,2) == (3-2)){
            System.out.println("Substract test is ok");
        } else {
            System.out.println("Substract error");
        }
    }
}
