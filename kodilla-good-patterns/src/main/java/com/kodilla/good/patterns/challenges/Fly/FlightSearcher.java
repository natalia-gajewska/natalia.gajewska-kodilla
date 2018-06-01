package com.kodilla.good.patterns.challenges.Fly;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FlightSearcher {
    AllFlights allFlights;

    public FlightSearcher(AllFlights allFlights) {
        this.allFlights = allFlights;
    }

    public void flightsFrom(String departureAirport){
        List<Flight> fromSomewhere = allFlights.getFlightsOnDay().stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirport))
                .collect(toList());
        System.out.println(fromSomewhere);
    }

    public  void flightsTo(String arrivalAirport){
        List<Flight> toSomewhere = allFlights.getFlightsOnDay().stream()
                .filter(g -> g.getArrivalAirport().equals(arrivalAirport))
                .collect(toList());
        System.out.println(toSomewhere);
    }

    public void flightsThrough(String departureAirport, String arrivalAirport){
        List<Flight> flightsWithSameAirports = allFlights.getFlightsOnDay().stream()
                .filter(g -> g.getDepartureAirport().equals(departureAirport) ||
                        g.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        Set<Flight> indirectFlights = flightsWithSameAirports.stream().filter(x -> {
            for (Flight connection : flightsWithSameAirports) {
                if (connection.getDepartureAirport().equals(x.getArrivalAirport())
                        || connection.getArrivalAirport().equals(x.getDepartureAirport())) {
                    return true;
                }
            }
            return false;
        }).collect(Collectors.toSet());

        System.out.println(indirectFlights);


    }


}