package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("Berlin", true);
        flights.put("London", false);
        flights.put("Rome", true);
        flights.put("Madrid", false);
        flights.put("Paris", false);
        flights.put("Athens", true);
        flights.put("Helsinki", false);
        flights.put("Oslo", false);

        String arrivalAirport = flight.getArrivalAirport();

        if (flights.containsKey(arrivalAirport)) {
           boolean isFlightPossible = flights.get(arrivalAirport);
           if (isFlightPossible) {
               System.out.println("You can fly to " + arrivalAirport);
           } else {
               System.out.println("We don't fly to " + arrivalAirport);
           }
        } else {
           throw new RouteNotFoundException();
       }
    }
}
