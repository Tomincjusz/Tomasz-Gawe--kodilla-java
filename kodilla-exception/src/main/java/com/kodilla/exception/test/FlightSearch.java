package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportsMap = new HashMap<>();
        airportsMap.put("Gdansk", true);
        airportsMap.put("Londyn", false);
        airportsMap.put("Katowice", false);

        String arrives = flight.getArrivalAirport();

        if (airportsMap.containsKey(arrives)) {
            Boolean ifAvaiable = airportsMap.get(arrives);
            if (ifAvaiable != true) {
                System.out.println("The airport " + arrives + " exist, but is not avaiable for the moment");
            } else {
                System.out.println("Have a nice flight to " + arrives);
            }
        } else {
            throw new RouteNotFoundException("The airport " + arrives + " doesn't exist");
        }
    }
}
