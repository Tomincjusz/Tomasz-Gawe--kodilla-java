package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;


public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String myName = "Tomek";
        poemBeautifier.beautify(myName, (name -> name.toUpperCase()));
        poemBeautifier.beautify(myName, (name -> "my name is:" + name));
        poemBeautifier.beautify(myName, (name -> name.toLowerCase()));


        /* ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);*/

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}