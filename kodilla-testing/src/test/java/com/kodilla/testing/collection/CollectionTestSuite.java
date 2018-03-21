package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminator() {

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        evenNumbers.add(2);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(12);
        evenNumbers.add(15);

        List<Integer> result = oddNumbersExterminator.getEvenNumbers(evenNumbers);
        Assert.assertEquals(result.size(), 4);

    }
}