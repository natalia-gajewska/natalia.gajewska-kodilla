package com.kodilla.exception.test;

public class WantedFlightsMain {

    public static void main(String[] args){

        Flight flight = new Flight("Krakow", "Lublin");
        WantedFlights wantedFlights = new WantedFlights();

        try {
            wantedFlights.findFlight(flight);

        } catch (RouteNotFoundException e){
            System.out.println(flight.getArrivalAirport() + " Airport is unavailable in the system now.");
        }
    }
}
