package com.kodilla.good.patterns.challenges.FlightSearch;

public class FlightSearch {

    public static void main(String[] args) {

        FlightToOrFrom flightToOrFrom = new FlightToOrFrom("Wrocław", "Warszawa");
        flightToOrFrom.flightToCity();
        flightToOrFrom.flightFromCity();


     IndirectFlight indirectFlight = new IndirectFlight("Gdańsk", "Kraków");
     indirectFlight.flightThrough();
    }
}