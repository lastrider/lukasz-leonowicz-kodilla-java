package com.kodilla.exception.test;

public class ThirdChallenge {
    public static void main(String[] args) {
        Flight flight = new Flight("Amsterdam", "Barcelona");
        FlightFinder finder = new FlightFinder();
        finder.addConnection("Berlin", true);

        try {
            if (finder.findFlight(flight)==true) System.out.println("Flight is possible.");
            else System.out.println("The destination is not available.");

        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }
    }


}
