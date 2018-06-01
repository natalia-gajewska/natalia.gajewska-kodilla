package com.kodilla.good.patterns.challenges.Fly;


import java.time.LocalDate;
import java.util.List;

public class AllFlights {
    LocalDate localDate;
    List<Flight> flightsOnDay;



    public AllFlights(LocalDate localDate, List<Flight> flightsOnDay) {
        this.localDate = localDate;
        this.flightsOnDay = flightsOnDay;

    }



    public LocalDate getLocalDate() {
        return localDate;
    }

    public List<Flight> getFlightsOnDay() {
        return flightsOnDay;
    }
}