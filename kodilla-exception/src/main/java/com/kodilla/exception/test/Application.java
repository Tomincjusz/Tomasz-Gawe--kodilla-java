package com.kodilla.exception.test;

public class Application {

    public static void main(String[] args) throws RouteNotFoundException {

        Flight flight = new Flight("Barcelon", "Gdansk");
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(flight);
        } catch (RouteNotFoundException r) {
            System.out.println(r);
        }

        Flight flight2 = new Flight("New York", "Londyn");

        try {
            flightSearch.findFlight(flight2);
        } catch (RouteNotFoundException r) {
            System.out.println(r);
        }

        Flight flight3 = new Flight("Chopin", "Katowice");

        try {
            flightSearch.findFlight(flight3);
        } catch (RouteNotFoundException r) {
            System.out.println(r);
        }
    }
}
