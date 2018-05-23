package com.kodilla.good.patterns.challenges.Fly;

public class FlightMain {
    public static void main(String[] args){
        FlightFinder flightFinder = new FlightFinder();

        Airport departureAirport = new Airport("Kraków");
        Airport arrivalAirport = new Airport("Barcelona");


        flightFinder.flightFrom(departureAirport);
        flightFinder.flightThrough(departureAirport, arrivalAirport);
        flightFinder.flightTo(arrivalAirport);
    }

}