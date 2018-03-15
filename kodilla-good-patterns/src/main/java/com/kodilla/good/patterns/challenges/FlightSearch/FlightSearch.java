package com.kodilla.good.patterns.challenges.FlightSearch;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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

        Map<String, String> flightFromTo1 = availableFlight.getFlight().stream()
                .filter(flight -> flight.getDepartureAirport().contains("Wrocław"))
                .filter(flight->!(flight.getArrivalAirport().contains("Kraków")))
                .collect(Collectors.toMap(Flight::getArrivalAirport,Flight::getDepartureAirport));

        Map<String, String> flightFromTo2 = availableFlight.getFlight().stream()
                .filter(flight -> flight.getArrivalAirport().contains("Kraków"))
                .filter(flight->!(flight.getDepartureAirport().contains("Wrocław")))
                .collect(Collectors.toMap(Flight::getDepartureAirport,Flight::getArrivalAirport));

        for (Map.Entry<String, String> entry1 : flightFromTo1.entrySet()) {
            for (Map.Entry<String, String> entry2 : flightFromTo2.entrySet()){
        if (entry1.getKey().equals(entry2.getKey())) {
            System.out.println("Flight from Wrocław to Kraków is possible through " + entry1.getKey() + "." );
        }
        }
    }
}
    }
