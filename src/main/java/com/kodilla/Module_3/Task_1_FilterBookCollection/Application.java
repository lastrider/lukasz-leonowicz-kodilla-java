package com.kodilla.Module_3.Task_1_FilterBookCollection;

import java.util.HashSet;
import java.util.Set;

class Book {
    private final String title;
    private final String authorFirstName;
    private final int yearOfRelease;
    private String authorLastName;

    Book(String title, String authorFirstName, String authorLastName, int yearOfRelease) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.yearOfRelease = yearOfRelease;
    }

    Book(String title, String authorFirstName, int yearOfRelease) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.yearOfRelease = yearOfRelease;
    }

    String getTitle() {
        return title;
    }

    String getAuthorFirstName() {
        return authorFirstName;
    }

    String getAuthorLastName() {
        return authorLastName;
    }

    int getYearOfRelease() {
        return yearOfRelease;
    }


    @Override
    public boolean equals(Object o) {
        final Book book = (Book) o;
        return yearOfRelease == book.yearOfRelease &&
                title.equals(book.title) &&
                authorFirstName.equals(book.authorFirstName) &&
                authorLastName.equals(book.authorLastName);
    }

    @Override
    public int hashCode() {
        if (this.authorLastName == null) {
            return (this.title.hashCode() + this.authorFirstName.hashCode() + this.yearOfRelease) * 31;
        } else {
            return (this.title.hashCode() + this.authorFirstName.hashCode() + this.authorLastName.hashCode() + this.yearOfRelease) * 31;
        }

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}

public class Application {
    public static void main(String[] args) {

        Book book1 = new Book("W pustyni i w puszczy", "Henryk", "Siekiewicz", 2011);
        Book book2 = new Book("Proces", "Franz", "Kafka", 1987);
        Book book3 = new Book("Antygona", "Sofokles", 2005);
        Book book4 = new Book("Skąpiec", "Molier", 2020);
        Book book5 = new Book("Lalka", "Bolesław", "Prus", 1995);


        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for (Book book : books) {
            if (book.getYearOfRelease() <= 2010) {
                System.out.println(book.getTitle());
            }
        }

    }
}