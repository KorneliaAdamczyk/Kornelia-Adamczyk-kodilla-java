package com.kodilla.good.patterns.challenges.FlightSearch;

public class FlightSearch {

    public static void main(String[] args) {

        FlightToOrFrom flightToOrFrom = new FlightToOrFrom();
        flightToOrFrom.flightToCity("Warszawa");
        flightToOrFrom.flightFromCity("Wrocław");


     IndirectFlight indirectFlight = new IndirectFlight();
     indirectFlight.flightThrough("Gdańsk", "Kraków");
    }
}