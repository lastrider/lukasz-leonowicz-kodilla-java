package com.kodilla.Module_2.Task_5_ArrayListAndLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

class Ratings {

    ArrayList<Byte> createAndGenerateRatingList(int amount) {
        ArrayList<Byte> ratings = new ArrayList<Byte>();
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            ratings.add((byte) (1 + random.nextInt(5)));
        }
        return ratings;
    }

    void showRatings(ArrayList<Byte> ratings) {
        for (byte rating : ratings) {
            System.out.println(rating);
        }
    }

    byte getMin(ArrayList<Byte> ratings) {
        byte min = ratings.get(0);
        for (byte rating : ratings) {
            if (min > rating) {
                min = rating;
            }
        }
        return min;
    }

    byte getMax(ArrayList<Byte> ratings) {
        byte max = ratings.get(0);

        for (byte rating : ratings) {
            if (max < rating) {
                max = rating;
            }
        }
        return max;
    }

    double averageWithoutExtreme(ArrayList<Byte> ratings) {
        byte max = new Ratings().getMax(ratings);
        byte min = new Ratings().getMin(ratings);
        short sum = 0;

        for (byte rating : ratings) {
            sum += rating;
        }
        return ((double) sum - min - max) / (ratings.size() - 2);
    }
}

class Book {
    String title;
    int year;

    Book(String title, int year) {
        this.title = title;
        this.year = year;
    }
}

class Library {

    LinkedList<Book> createLibrary() {
        LinkedList<Book> library = new LinkedList<Book>();
        library.add(new Book("50 Shades of Grey", 2001));
        library.add(new Book("Sherlock Holmes", 1999));
        library.add(new Book("The Last of the Mohicans", 2012));
        library.add(new Book("The Infinity", 2020));
        library.add(new Book("Better Call Saul", 2011));
        library.add(new Book("Journey to the Center of the Earth", 2005));
        library.add(new Book("Binary Death", 1987));
        library.add(new Book("Twenty Thousand Leagues Under the Sea", 2017));
        library.add(new Book("The Titanfall", 1996));
        library.add(new Book("Coma", 1974));
        library.add(new Book("Of Ants and Men", 2014));
        library.add(new Book("To Understand a Woman", 2018));
        library.add(new Book("Neverending Story", 1991));
        library.add(new Book("The Jungle Book", 1963));

        return library;
    }

    void showLibraryYoungerThan2000(LinkedList<Book> library) {
        for (Book book : library) {
            if (book.year >= 2000) {
                System.out.println(book.title);
            }
        }
    }
}

public class Application {
    public static void main(String[] args) {
        Ratings ratings = new Ratings();
        ArrayList<Byte> list = ratings.createAndGenerateRatingList(15);
        //ratings.showRatings(list);
        System.out.println(ratings.averageWithoutExtreme(list));

        System.out.println();

        Library library = new Library();
        library.showLibraryYoungerThan2000(library.createLibrary());
    }
}
