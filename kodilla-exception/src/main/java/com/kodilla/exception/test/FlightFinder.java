package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    Map<String, Boolean> flightMap = new HashMap<>();

    public void addConnection(String arrivalCity, Boolean flightStatus) {
        this.flightMap.put(arrivalCity, flightStatus);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        boolean result=false;
        try {
            result = flightMap.get(flight.getArrivalAirport());
        } catch (Exception e) {
            throw new RouteNotFoundException();
        } finally {
            return result;
        }

    }
}