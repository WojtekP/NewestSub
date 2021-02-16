package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("author", "title", 1970, "sign"));
        books.add(new Book("author1", "title1", 1995, "sign1"));
        books.add(new Book("author2", "title2", 2020, "sign2"));
        books.add(new Book("author3", "title3", 2000, "sign3"));
        books.add(new Book("author4", "title4", 1980, "sign4"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int med = medianAdapter.publicationYearMedian(books);
        System.out.println(med);
        //Then
        Assertions.assertEquals(1995, med);
    }
}
