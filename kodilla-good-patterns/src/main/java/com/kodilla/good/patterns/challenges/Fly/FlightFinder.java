package com.kodilla.good.patterns.challenges.Fly;

import java.util.*;
import java.util.stream.Collectors;

public final class FlightFinder {

    private final Map<String, List<String>> timetable = new HashMap<>();

    public FlightFinder() {
        timetable.put("Warszawa", Arrays.asList("Gdańsk, Moskwa, Berlin"));
        timetable.put("Madryt", Arrays.asList("Warszawa, Kraków, Sopot"));
        timetable.put("Kraków", Arrays.asList("Lublin, Gdynia, Warszawa"));
        timetable.put("Barcelona", Arrays.asList("Gdańsk, Warszawa, Lublin"));
        timetable.put("Lublin", Arrays.asList("Krakow, Warszawa, Rzeszów"));

    }

    public void flightFrom(Airport departureAirport) {
        String flightsFrom = timetable.entrySet().stream()
                .filter(f -> f.getKey().equals(departureAirport.getAirport()))
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.joining(", "));
        System.out.println("From " + departureAirport.getAirport() + " you can fly to" + ": " + flightsFrom);
    }


    public void flightTo(Airport arrivalAirport) {
        String flightsTo = timetable.entrySet().stream()
                .filter(f -> f.getValue().contains(arrivalAirport.getAirport()))
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", "));
        System.out.println("To " + arrivalAirport.getAirport() + " you can fly from" + ": " + flightsTo);
    }


    public void flightThrough(Airport departureAirport, Airport arrivalAirport) {
        String flightsVia = timetable.entrySet().stream()
                .filter(f -> f.getValue().contains(departureAirport.getAirport()))
                .filter(f -> f.getValue().contains(arrivalAirport.getAirport()))
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", "));
        System.out.println("From " + departureAirport.getAirport() + " to " + arrivalAirport.getAirport() + " you can fly");
    }

}