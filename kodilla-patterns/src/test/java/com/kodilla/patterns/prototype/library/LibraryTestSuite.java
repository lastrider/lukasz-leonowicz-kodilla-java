package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBook() {
        //Given
        Library library = new Library("My library");
        IntStream.iterate(1, n -> n + 1)
                .limit(20)
                .forEach(n->library.getBooks().add(new Book("Book"+n,"Author"+n, LocalDate.now().minusYears(n) )));

        Library copiedLibrary=null;
        try {
            copiedLibrary = library.shallowClone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepCopiedLibrary=null;
        try {
            deepCopiedLibrary = library.deepClone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //When
        Book additionalBook = new Book("Additional book", "someone", LocalDate.now());
        library.getBooks().add(additionalBook);

        //Then
        Assert.assertEquals(21, library.getBooks().size());
        Assert.assertEquals(21, copiedLibrary != null ? copiedLibrary.getBooks().size() : 0);
        Assert.assertEquals(20, deepCopiedLibrary != null ? deepCopiedLibrary.getBooks().size():0);
    }
}
