package com.kodilla.Module_4.Task_7_EuclidsAlgorithm;

public class Application {

    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();
        algorithm.calculate(234232,32);


    }
}

class Algorithm {

    public void calculate(int number1, int number2){

        while (number1 != number2) {
            if (number1 > number2) {
                number1 -= number2;
            } else {
                number2 -= number1;
            }
        }
        System.out.println(number1);
    }
}