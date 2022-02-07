package com.kodilla.good.patterns.flights.Flights;

import com.kodilla.good.patterns.flights.airports.Airport;
import com.kodilla.good.patterns.flights.airports.GDN;

import java.util.HashMap;
import java.util.Map;

public class FlightsSearchRetriever {
    public Map<String, String> retrieve() {
        Map<String, String> searchedCitiesList = new HashMap<>();
        String from = "from";
        String to = "to";
        String airport = new GDN().getName();

        searchedCitiesList.put(from, airport);
        searchedCitiesList.put(to, airport);

        return searchedCitiesList;
    }
}
