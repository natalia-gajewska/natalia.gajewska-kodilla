package com.kodilla.exception.test;

import java.util.stream.Stream;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }
    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */

    public static void main(String[] args) {
        FirstChallenge firstChellenge = new FirstChallenge();

        try {
            double result = firstChellenge.divide(3, 0);
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Nie można dzielić przez liczbę zero!" + e);

        } finally {
            System.out.println("Ponownie nie można dzielić przez zero");
        }
    }
}
