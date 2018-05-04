package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]){
        SecondChallenge secondChellenge = new SecondChallenge();

        try{
            secondChellenge.probablyIWillThrowException(2, 1.5);

        } catch (Exception e){
            System.out.println("Error: " + e);

        } finally {
            System.out.println("End of process.");
        }
    }
}