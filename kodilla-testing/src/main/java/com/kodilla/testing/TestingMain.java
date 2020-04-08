package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {


        //////////////////////////////////////////////////////////////////

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("User test ok");
        } else {
            System.out.println("User Error!");
        }

        //////////////////////////////////////////////////////////////////

        Calculator calculator = new Calculator();

        int a = 10;
        int b = 3;
        int additionResult = calculator.add(a, b);
        int subtractionResult = calculator.subtract(a, b);

        if (additionResult == 13) {
            System.out.println("Calculator addition test ok");
        } else {
            System.out.println("Calculator addition error!");
        }
        if (subtractionResult == 7) {
            System.out.println("Calculator subtraction test ok");
        } else {
            System.out.println("Calculator subtraction Error!");
        }

        //////////////////////////////////////////////////////////////////
    }
}
