package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {6, 7, 8, 9, 2, 3, 14};

        //When
        double average = getAverage(numbers);

        //Then
        Assert.assertEquals(7, average, 0);
    }
}