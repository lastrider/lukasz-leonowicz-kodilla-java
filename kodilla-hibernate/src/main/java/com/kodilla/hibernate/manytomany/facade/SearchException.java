package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {

    public static String PHRASE_NOT_FOUND = "";

    public SearchException(String message) {
        super(message);
    }
}
