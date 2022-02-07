package com.kodilla.good.patterns.flights.airports;


import com.kodilla.good.patterns.flights.Flights.Flight;

import java.util.ArrayList;
import java.util.List;

public class KRK implements Airport {
    private String name;
    private List<Flight> destinationsList = new ArrayList<>();

    public KRK() {
        this.name = "Krakow Balice";
        fillDestinationList();
    }

    private void fillDestinationList() {
        Flight flight1 = new Flight(getName(),"Wroclaw", "WRO");
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
