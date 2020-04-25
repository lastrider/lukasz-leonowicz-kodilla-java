package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge challenge = new SecondChallenge();
        try {
            challenge.probablyIWillThrowException(1, 1.5);
        } catch (Exception e) {
            System.out.println("Action after an exception has been caught.");
        } finally {
            System.out.println("Finally action");
        }
    }
}
