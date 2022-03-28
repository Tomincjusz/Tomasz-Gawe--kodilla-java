package com.kodilla.good.patterns.flights.Flights;

import com.kodilla.good.patterns.flights.airports.Airport1;

import java.util.List;

public class Flight1 {
    private final Airport1 departure;
    private final Airport1 destination;
    private final List<Airport1> stopovers;

    public Flight1(Airport1 departure, Airport1 destination, List<Airport1> stopovers) {
        this.departure = departure;
        this.destination = destination;
        this.stopovers = stopovers;
    }

    public Airport1 getDeparture() {
        return departure;
    }

    public Airport1 getDestination() {
        return destination;
    }

    public List<Airport1> getStopsList() {
        return stopovers;
    }

    public boolean isThrough(Airport1 airport) {
        return stopovers.contains(airport);
    }

    @Override
    public String toString() {
        String exit = "Lot " + departure.getAbbrev() + "-" + destination.getAbbrev() + ": wylot z " + departure.getName() + ", ladowanie w " + destination.getName();
        if (stopovers == null) {
            exit += ", brak miedzylodowan.";
        } else {
            exit += ", miedzylodowanie w: "+stopovers.get(0);
            int i = 1;
            while (i < stopovers.size()) {
                exit += ", "+stopovers.get(i);
                i++;
            }
            exit += ".";
        }
        return exit;
    }
}

