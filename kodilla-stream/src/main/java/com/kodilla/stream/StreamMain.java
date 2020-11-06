package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args){
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10,5,(a, b) -> a + b);
        expressionExecutor.executeExpression(10,5,(a, b) -> a - b);
        expressionExecutor.executeExpression(10,5,(a, b) -> a * b);
        expressionExecutor.executeExpression(10,5,(a, b) -> a / b);

        expressionExecutor.executeExpression(10,5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10,5,FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(10,5,FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10,5,FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(("Input Text"),(String) -> "ABC " + String + " ABC" );
        poemBeautifier.beautify(("Input Text"),(String) -> String.toUpperCase() );
        poemBeautifier.beautify(("Input Text"),(String) -> String.toLowerCase() );
        poemBeautifier.beautify(("Input Text"),(String) -> String + "!!!" );
        poemBeautifier.beautify(("Input Text"),(String) -> String.replaceAll(".(?!$)", "$0 ") );

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
