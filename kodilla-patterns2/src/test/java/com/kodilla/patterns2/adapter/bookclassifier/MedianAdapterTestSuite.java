package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Dostojewski", "Zbrodnia i kara", 1999, "P0001"));
        bookSet.add(new Book("Orwell", "Rok 1984", 1998, "P0002"));
        bookSet.add(new Book("Coelho", "Alchemik", 2001, "P0003"));
        bookSet.add(new Book("Fuller", "Lekcje pływania", 2002, "P0004"));
        bookSet.add(new Book("Piłsudski", "Ksiegi Jakubowe", 2000, "P0004"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        System.out.println(median);
        Assert.assertEquals(median,2000, 0);
    }
    }
