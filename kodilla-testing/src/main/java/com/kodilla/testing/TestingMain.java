package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator simpleCalculator = new Calculator();
        int result1 = simpleCalculator.addAToB(5, 5);
        int result2 = simpleCalculator.subtractAFromB(10,5);
        if(result1 == 10) {
            System.out.println("test 1 is ok");
        }
        else {
            System.out.println("test 1 Error");
        }
        if(result2 == 5) {
            System.out.println("test 2 is ok");
        }
        else {
            System.out.println("test 2 Error");
        }
    }
}