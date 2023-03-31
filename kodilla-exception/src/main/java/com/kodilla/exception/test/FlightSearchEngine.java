package com.kodilla.exception.test;


public class FlightSearchEngine {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();

        Flight flight = new Flight("Wroclaw", null);

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Route not found. Try different airport.");
        }
    }
}
