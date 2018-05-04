package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class WantedFlights {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> mapOfAvailableAirports = new HashMap<String, Boolean>();
        mapOfAvailableAirports.put("Krakow", true);
        mapOfAvailableAirports.put("Warsaw", false);
        mapOfAvailableAirports.put("Barcelona", true);
        mapOfAvailableAirports.put("Lublin", true);
        mapOfAvailableAirports.put("Gdansk", true);

        if ((!mapOfAvailableAirports.containsKey(flight.getArrivalAirport())))
            throw new RouteNotFoundException();
        else {
            if (mapOfAvailableAirports.get(flight.getArrivalAirport()))
                System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is available.");
            else
                System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is unavailable.");
        }
    }
}
