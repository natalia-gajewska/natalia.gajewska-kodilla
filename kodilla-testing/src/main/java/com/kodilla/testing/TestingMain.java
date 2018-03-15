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

        Calculator calculator = new Calculator();

        int addResult = calculator.add(5, 25);
        int subResult = calculator.subtract(100, 30);

        if (addResult == 30 && subResult == 70) {

            System.out.println("Calculator działa:)");
        } else {
            System.out.println("Error");
        }
    }
}