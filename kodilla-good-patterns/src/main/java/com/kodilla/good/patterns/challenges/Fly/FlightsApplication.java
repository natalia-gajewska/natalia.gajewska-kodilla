package com.kodilla.good.patterns.challenges.Fly;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FlightsApplication {
    public static void main(String[] args) {

        Flight flight = new Flight("Radom", "Gdańsk");
        Flight flight1 = new Flight("Radom", "Rzeszów");
        Flight flight2 = new Flight("Warszawa", "Radom");
        Flight flight3 = new Flight("Warszawa", "Lublin");


        List<Flight> flightsOnMonday = new ArrayList<>();
        flightsOnMonday.add(flight);
        flightsOnMonday.add(flight1);
        flightsOnMonday.add(flight2);
        flightsOnMonday.add(flight3);

        List flightsOnDay = flightsOnMonday;


        LocalDate mondayDate = LocalDate.of(2018, 2, 5);

        List<Flight> flightsOnTuesday = new ArrayList<>();
        flightsOnTuesday.add(flight);
        flightsOnTuesday.add(flight1);

        List flightsOnNextDay = flightsOnTuesday;


        LocalDate tuesdayDate = LocalDate.of(2018, 6, 1);


        AllFlights allFlights = new AllFlights(mondayDate, flightsOnMonday);

        FlightSearcher flightSearcher = new FlightSearcher(allFlights);
        flightSearcher.flightsTo("Radom");
        flightSearcher.flightsFrom("Radom");
        flightSearcher.flightsThrough("Warszawa", "Rzeszów");

    }
}