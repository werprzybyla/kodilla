package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        //SimpleUser test
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Calculator test
        Calculator calculator = new Calculator();

        int addResult = calculator.add(5,3);
        int subtractResult = calculator.subtract(5, 3);

        if(addResult == 8) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if(subtractResult == 2) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
