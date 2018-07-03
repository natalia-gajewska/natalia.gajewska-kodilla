package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedian() {
        //given
        Book book1 = new Book("natalia", "gajewska", 2009, "1234567");
        Book book2 = new Book("kasia", "kowalska", 2002, "31233333");
        Book book3 = new Book("karina", "pudełko", 2012, "23ss345");
        Set<Book> books = new HashSet<>(Arrays.asList(book1, book2, book3));
        MedianAdapter medianAdapter = new MedianAdapter();
        //when
        int median = medianAdapter.publicationYearMedian(books);
        //then
        assertEquals(2009, median);
    }
}