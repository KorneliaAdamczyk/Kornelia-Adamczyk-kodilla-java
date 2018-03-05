package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

class FindFlights {

    String departureAirport;
    Boolean isExist;

    public Map <String, Boolean> findFlight(Flight flight)throws RouteNotFoundException {

        HashMap<String, Boolean> flightExist = new HashMap<>();

        flightExist.put("Malaga", true);
        flightExist.put("Paryż", true);
        flightExist.put("Nowy Jork", false);
        flightExist.put("Tokio", false);

        if (flightExist.get(isExist)==true) {
            System.out.println("Flight to " + flightExist.get(departureAirport) + " is possible.");
        } else {
            System.out.println("Flight to " + flightExist.get(departureAirport) + " isn't possible.");
        }
        try {
            flightExist.get(departureAirport).equals(null);

        } catch (NullPointerException e) {
            throw new RouteNotFoundException("Object User was null");
        } finally {
            System.out.println("Finally");
        }
        return flightExist;
    }
            public static void main(String[] args) throws RouteNotFoundException {

            Flight flight = new Flight ("Malaga", "Paryż");

            FindFlights findFlights = new FindFlights();

            findFlights.findFlight(flight);
            }


    }


