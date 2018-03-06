package com.kodilla.exception.test;

import java.util.HashMap;

class FindFlights {

    HashMap<String, Boolean> flightExist = new HashMap<>();

    public void findFlight(Flight flight) throws RouteNotFoundException {
        flightExist.put("Malaga", true);
        flightExist.put("Paryż", true);
        flightExist.put("Nowy Jork", false);
        flightExist.put("Tokio", false);

        if (flightExist.containsKey(flight.getArrivalAirport()) && flightExist.get(flight.getArrivalAirport()) == true) {
            System.out.println("Flight to " + flight.getArrivalAirport() + " is possible.");
        } else {
            throw new RouteNotFoundException("Wrong data");
        }
    }
}


