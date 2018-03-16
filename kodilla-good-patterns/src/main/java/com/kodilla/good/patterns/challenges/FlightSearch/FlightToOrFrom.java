package com.kodilla.good.patterns.challenges.FlightSearch;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightToOrFrom {

    public void flightToCity(String arrivalAirport) {

        AvailableFlight availableFlight = new AvailableFlight();

        Set<Flight> flightTo = availableFlight.getFlight().stream()
                .filter(flights -> flights.getArrivalAirport().contains(arrivalAirport))
                .collect(Collectors.toSet());

        System.out.println("Flights to " + arrivalAirport + ":" + '\n' + flightTo + '\n');

    }

    public void flightFromCity(String departureAirport) {

        AvailableFlight availableFlight = new AvailableFlight();

        Set<Flight> flightFrom = availableFlight.getFlight().stream()
                .filter(flights -> flights.getDepartureAirport().contains(departureAirport))
                .collect(Collectors.toSet());

        System.out.println("Flights from " + departureAirport + ":" + '\n' + flightFrom + '\n');
    }
}
