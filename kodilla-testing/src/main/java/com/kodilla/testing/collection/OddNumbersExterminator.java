package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    // lista arraylist zwracająca parzyste liczby
    List<Integer> getEvenNumbers(ArrayList<Integer> list) {
        //nowy obiekt arraylist liczb parzystych
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        // pętla wywołująca wyświetlenie parzystych liczb

        for (int number : list) {
            if (number % 2 == 0) {
                //wywołanie metody parzystych liczb
                evenNumbers.add(number);
            }
        }
        //zwracanie metody
        return evenNumbers;
    }
}


