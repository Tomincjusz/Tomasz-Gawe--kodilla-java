package com.kodilla.good.patterns.flights.Flights;

import com.kodilla.good.patterns.flights.airports.Airport1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsSearchingService1 {
    private final List<Flight1> flightsList = new ArrayList<>();

    public void addFlight(Airport1 from, Airport1 to, List<Airport1> stops) {
        flightsList.add(new Flight1(from, to, stops));
    }

    public void findAllFlightsFrom(Airport1 departure) {
        System.out.println("Find all flights from "+departure.getName()+" ("+departure.getAbbrev()+").");
        flightsList.stream().filter(e -> e.getDeparture().equals(departure)).forEach(System.out::println);
    };

    public void findAllFlightsTo(Airport1 destination) {
        System.out.println("Find all flights to "+destination.getName()+" ("+destination.getAbbrev()+").");
        flightsList.stream().filter(e -> e.getDestination().equals(destination)).forEach(System.out::println);
    };

    public void findAllFlightsFromWithStopover(Airport1 departure, List<Airport1> stopover) {
        System.out.println("Find all flights from " + departure.getName() + " (" + departure.getAbbrev() + "), with stop over.");
        for (int i = 0; i < stopover.size(); i++) {
            int finalI = i;
            flightsList.stream().filter(e -> (e.getDeparture().equals(departure)) && (e.getStopsList() != null)).
                    collect(Collectors.toList()).stream().
                    filter(e -> e.getStopsList().
                            contains(stopover.get(finalI))).forEach(System.out::println);
        }
    };

    public void findAllFlightsToWithStopover(Airport1 destination, List<Airport1> stopover) {
        System.out.println("Find a flight to " + destination.getName() + " (" + destination.getAbbrev() + "), z miedzylodowaniem.");
        for (int i = 0; i < stopover.size(); i++) {
            int finalI = i;
            flightsList.stream().filter(e -> (e.getDestination().equals(destination)) && (e.getStopsList() != null)).
                    collect(Collectors.toList()).stream().
                    filter(e -> e.getStopsList().
                            contains(stopover.get(finalI))).forEach(System.out::println);
        }
    };
}
