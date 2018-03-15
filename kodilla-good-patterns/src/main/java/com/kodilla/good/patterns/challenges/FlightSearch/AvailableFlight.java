package com.kodilla.good.patterns.challenges.FlightSearch;

import java.util.HashSet;
import java.util.Set;

public class AvailableFlight {

    public Set<Flight> getFlight () {

        Set<Flight> flights = new HashSet<>();

        flights.add(new Flight("Wrocław","Warszawa"));
        flights.add(new Flight("Wrocław","Kraków"));
        flights.add(new Flight("Kraków","Warszawa"));
        flights.add(new Flight("Warszawa","Wrocław"));
        flights.add(new Flight("Warszawa","Kraków"));
        flights.add(new Flight("Wrocław","Gdańsk"));
        flights.add(new Flight("Gdańsk","Warszawa"));
        flights.add(new Flight("Gdańsk","Wrocław"));
        flights.add(new Flight("Wrocław","Poznań"));
        flights.add(new Flight("Poznań","Warszawa"));

        return flights;
    }
}
