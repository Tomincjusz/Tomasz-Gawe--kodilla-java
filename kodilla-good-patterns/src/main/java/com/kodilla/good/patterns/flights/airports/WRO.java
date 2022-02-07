package com.kodilla.good.patterns.flights.airports;

import com.kodilla.good.patterns.flights.Flights.Flight;

import java.util.ArrayList;
import java.util.List;

public class WRO implements Airport {
    private String name;
    private List<Flight> destinationsList = new ArrayList<>();

    public WRO  () {
        this.name = "Wroclaw";
        fillDestinationList();
    }

    private void fillDestinationList() {
        Flight flight1 = new Flight(getName(),"Gdansk - Rebiechowo", "GDA");
        Flight flight2 = new Flight(getName(),"Warszawa - Okecie", "WAW");

        destinationsList.add(flight1);
        destinationsList.add(flight2);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Flight> showFlights(){
        return destinationsList;
    }
}
