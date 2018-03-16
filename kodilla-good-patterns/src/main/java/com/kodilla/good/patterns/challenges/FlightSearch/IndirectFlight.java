package com.kodilla.good.patterns.challenges.FlightSearch;

import java.util.Map;
import java.util.stream.Collectors;

public class IndirectFlight {

    String fromCity;
    String toCity;

    public IndirectFlight(String fromCity, String toCity) {
        this.fromCity = fromCity;
        this.toCity = toCity;
    }

    public void flightThrough() {

        AvailableFlight availableFlight = new AvailableFlight();

        Map<String, String> flightFromTo1 = availableFlight.getFlight().stream()
                .filter(flight -> flight.getDepartureAirport().contains(fromCity))
                .filter(flight -> !(flight.getArrivalAirport().contains(toCity)))
                .collect(Collectors.toMap(Flight::getArrivalAirport, Flight::getDepartureAirport));

        Map<String, String> flightFromTo2 = availableFlight.getFlight().stream()
                .filter(flight -> flight.getArrivalAirport().contains(toCity))
                .filter(flight -> !(flight.getDepartureAirport().contains(fromCity)))
                .collect(Collectors.toMap(Flight::getDepartureAirport, Flight::getArrivalAirport));

        for (Map.Entry<String, String> entry1 : flightFromTo1.entrySet()) {
            for (Map.Entry<String, String> entry2 : flightFromTo2.entrySet()) {
                if (entry1.getKey().equals(entry2.getKey())) {
                    System.out.println("Flight from " + fromCity + " to " + toCity + " is possible through " + entry1.getKey() + ".");
                }
                }
            }
        }
    }
