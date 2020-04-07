package com.kodilla.Module_3.Task_5_MeasurementOfTimeInCollection;

import java.util.Objects;
import java.util.*;

class Book {

    String title = "";
    String author = "";

    public Book(int i) {
        this.title = ""+i;
    }

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return (title.hashCode() + author.hashCode()) * 31;
    }
}

class Generate {

    List<Book> linkedListOfBooks(int count) {
        List<Book> list = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            list.add(new Book(i));
        }
        return list;
    }

/*    Map<Integer, Book> mapOfBooksIntegerKey(int count) {
        Map<Integer, Book> map = new HashMap<>();
        for (int i = 0; i < count; i++) {
            Book book = new Book();
            int hash = book.hashCode();
            map.put(hash, book);
        }
        return map;
    }*/

    Map<String, Book> mapOfBooksStringKey(int count) {

        Set<String> set = new HashSet<>();

        while (set.size() <= count) {
            set.add(new Generate().string(33, 126, 20));
        }

        String[] array = set.toArray(new String[0]);
        Map<String, Book> map = new HashMap<>();

        for (int i = 0; i < count; i++) {
            map.put(array[i], new Book(i));
        }
        return map;
    }

    String string(int start, int end, int length) {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append((char) (random.nextInt((end - start)) + 32));
        }
        return String.valueOf(builder);
    }
}

public class Application {
    public static void main(String[] args) {

        List<Book> list = new Generate().linkedListOfBooks(500_000);

        long start = System.nanoTime();
        list.get(0);
        long finish = System.nanoTime();
        System.out.println("Wyszukanie pierwszego elementu z linked list trwa: " + (finish - start) / 1000 + "ms");

        start = System.nanoTime();
        list.get(list.size() - 1);
        finish = System.nanoTime();
        System.out.println("Wyszukanie ostatniego elementu z linked list trwa: " + (finish - start) / 1000 + "ms");

        Book b = list.get(0);
        start = System.nanoTime();
        list.remove(b);
        finish = System.nanoTime();
        System.out.println("Usunięcie pierwszego elementu z linked list trwa: " + (finish - start) / 1000 + "ms");

        b = list.get(list.size() - 1);
        start = System.nanoTime();
        list.remove(list.size() - 1);
        finish = System.nanoTime();
        System.out.println("Usunięcie ostatniego elementu z linked list trwa: " + (finish - start) / 1000 + "ms");

        start = System.nanoTime();
        list.add(0, new Book(1));
        finish = System.nanoTime();
        System.out.println("Dodanie elementu na początku linked list trwa: " + (finish - start) / 1000 + "ms");

        start = System.nanoTime();
        list.add(new Book(1));
        finish = System.nanoTime();
        System.out.println("Dodanie elementu na końcu linked list trwa: " + (finish - start) / 1000 + "ms");

        System.out.print("\n------------------------------------------------------------------------------\n");

        Map<String, Book> map = new Generate().mapOfBooksStringKey(500_000);

        start = System.nanoTime();
        map.put("jdhafkjadhsfkasdhfkas", new Book(1));
        finish = System.nanoTime();
        System.out.println("Dodanie elementu do mapy trwa: " + (finish - start) / 1000 + "ms");

        start = System.nanoTime();
        map.get("jdhafkjadhsfkasdhfkas");
        finish = System.nanoTime();
        System.out.println("Wyszukanie elementu w mapie trwa: " + (finish - start) / 1000 + "ms");

        start = System.nanoTime();
        map.remove("jdhafkjadhsfkasdhfkas");
        finish = System.nanoTime();
        System.out.println("usunięcie elementu z mapy trwa: " + (finish - start) / 1000 + "ms");
    }
}
