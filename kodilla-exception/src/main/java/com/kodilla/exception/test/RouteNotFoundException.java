package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    public RouteNotFoundException() {
        super();
        System.out.println("Please check your typo, the place does not exist on our database.");
    }
}
