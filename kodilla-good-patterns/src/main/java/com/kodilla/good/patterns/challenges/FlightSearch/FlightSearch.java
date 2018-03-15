package com.kodilla.good.patterns.challenges.FlightSearch;

import java.math.BigInteger;
import java.util.Set;
import java.util.stream.Collectors;

import static java.math.BigInteger.*;

public class FlightSearch {

    public static void main(String[] args) {

        AvailableFlight availableFlight = new AvailableFlight();

        Set<Flight> flightTo = availableFlight.getFlight().stream()
                .filter(flights -> flights.getArrivalAirport().contains("Warszawa"))
                .collect(Collectors.toSet());

        System.out.println("Flights to Warszawa:" + '\n' + flightTo);

        Set<Flight> flightFrom = availableFlight.getFlight().stream()
                .filter(flights -> flights.getDepartureAirport().contains("Wrocław"))
                .collect(Collectors.toSet());

        System.out.println("Flights from Wrocław:" + '\n' + flightFrom + '\n');

        boolean indirectFlight1 = availableFlight.getFlight().stream()
                .filter(flight -> flight.getDepartureAirport().contains("Gdańsk"))
                .anyMatch(flight -> flight.getArrivalAirport().contains("Kraków"));


        boolean indirectFlight2 = availableFlight.getFlight().stream()
                .filter(flight -> flight.getDepartureAirport().contains("Kraków"))
                .anyMatch(flight -> flight.getArrivalAirport().contains("Warszawa"));


        if (indirectFlight1 == true && indirectFlight2 == true) {
            System.out.println("Flights from Wrocław through Kraków to Warszawa is available.");
        } else {
            System.out.println("Flights from Wrocław through Kraków to Warszawa isn't available.");
        }
    }
}
