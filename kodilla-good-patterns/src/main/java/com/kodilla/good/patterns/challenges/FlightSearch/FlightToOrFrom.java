package com.kodilla.good.patterns.challenges.FlightSearch;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightToOrFrom {

    String fromCity;
    String toCity;

    public FlightToOrFrom( String fromCity, String toCity) {
        this.fromCity = fromCity;
        this.toCity = toCity;
    }

    public void flightToCity() {

        AvailableFlight availableFlight = new AvailableFlight();

        Set<Flight> flightTo = availableFlight.getFlight().stream()
                .filter(flights -> flights.getArrivalAirport().contains(toCity))
                .collect(Collectors.toSet());

        System.out.println("Flights to " + toCity + ":" + '\n' + flightTo + '\n');

    }

    public void flightFromCity() {

        AvailableFlight availableFlight = new AvailableFlight();

        Set<Flight> flightFrom = availableFlight.getFlight().stream()
                .filter(flights -> flights.getDepartureAirport().contains(fromCity))
                .collect(Collectors.toSet());

        System.out.println("Flights from " + fromCity + ":" + '\n' + flightFrom + '\n');
    }
}
