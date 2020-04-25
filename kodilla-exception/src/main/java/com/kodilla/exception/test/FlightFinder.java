package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    Map<String, Boolean> flightMap = new HashMap<>();

    public void addConnection(String arrivalCity, Boolean flightStatus) {
        this.flightMap.put(arrivalCity, flightStatus);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        boolean result = false;
        if (flightMap.containsKey(flight.getArrivalAirport())) {
            result = flightMap.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("The place does not exist on our database.");
        }
        return result;
    }
}