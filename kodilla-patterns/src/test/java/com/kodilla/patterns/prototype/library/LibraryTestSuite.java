package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        Library library = new Library("First Library");

        Book book1 = new Book("Book1", "John Smith", LocalDate.of(2008, 12, 01));
        Book book2 = new Book("Book2", "John Not Smith", LocalDate.of(2020, 07, 15));
        Book book3 = new Book("Book3", "Jerry Terry", LocalDate.of(2019, 01, 29));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);



        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Cloned library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep Cloned library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(book1);

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}