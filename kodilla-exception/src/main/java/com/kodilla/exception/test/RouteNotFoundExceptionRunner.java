package com.kodilla.exception.test;

class RouteNotFoundExceptionRunner{
    public static void main(String[] args)  {

        FindFlights findFlights = new FindFlights();

        try {
            Flight flight = new Flight ("Malaga", "Oslo");
            findFlights.findFlight(flight);
        }
        catch (RouteNotFoundException e) {
            System.out.println("Write another airport");
        }
        finally {
            System.out.println("Finally");
        }
    }

}
