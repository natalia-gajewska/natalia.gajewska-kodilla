package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){

        ArrayList<Integer> evenNumbers = new ArrayList<>();

     int resultEmpty = evenNumbers.add();


     if (resultEmpty == null) {
         System.out.println("Jest OK");
     } else {
         System.out.println("Test źle wykonany");

     }

     public void testOddNumbersExterminatorNormalList(){

         ArrayList<Integer> evenNumbers = new ArrayList<>();

         int resultFull = evenNumbers.add(2,6,8,12,15);

         if (resultFull % 2 == 0);
            System.out.println("Jest OK");
        } else {
            System.out.println("Test źle wykonany");
        }

    }
}
