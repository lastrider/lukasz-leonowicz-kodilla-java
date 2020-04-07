package com.kodilla.Module_3.Task_2_QueueAndArayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

class Book {
    private String title;
    private String authorFirstName;
    private String authorLastName;
    private int yearOfRelease;

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

        Deque<Book> theBooks = new ArrayDeque<>();
        theBooks.push(book1);
        theBooks.push(book2);
        theBooks.push(book3);
        theBooks.push(book4);
        theBooks.push(book5);

        System.out.println("Ilość elementów w stosie po zapełnieniu: " + theBooks.size());

        Book tempBook = null;

        for (Book book : theBooks) {
            tempBook = theBooks.pop();
        }

        System.out.println("Ilość elementów w stosie po opróżnieniu: " + theBooks.size());
        System.out.println("Książka pobrana ze stosu jako ostatnia to: " + tempBook.getTitle());

    }
}

