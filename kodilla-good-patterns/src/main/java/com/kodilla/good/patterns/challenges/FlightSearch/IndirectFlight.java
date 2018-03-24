package com.kodilla.good.patterns.challenges.FlightSearch;

import java.util.Map;
import java.util.stream.Collectors;

public class IndirectFlight {

    public void flightThrough(String departureAirport, String arrivalAirport) {

        AvailableFlight availableFlight = new AvailableFlight();

        Map<String, String> flightFromTo1 = availableFlight.getFlight().stream()
                .filter(flight -> flight.getDepartureAirport().contains(departureAirport))
                .filter(flight -> !(flight.getArrivalAirport().contains(arrivalAirport)))
                .collect(Collectors.toMap(Flight::getArrivalAirport, Flight::getDepartureAirport));

        Map<String, String> flightFromTo2 = availableFlight.getFlight().stream()
                .filter(flight -> flight.getArrivalAirport().contains(arrivalAirport))
                .filter(flight -> !(flight.getDepartureAirport().contains(departureAirport)))
                .collect(Collectors.toMap(Flight::getDepartureAirport, Flight::getArrivalAirport));

        boolean find = false;

        for (Map.Entry<String, String> entry1 : flightFromTo1.entrySet()) {
            for (Map.Entry<String, String> entry2 : flightFromTo2.entrySet()) {
                if (entry1.getKey().equals(entry2.getKey())) {
                    find = true;
                    System.out.println("Flight from " + departureAirport + " to " + arrivalAirport + " is possible through " + entry1.getKey() + ".");
                }
            }
        }
        if (!find){
            System.out.println("This flight is not exist");
        }
    }
}
