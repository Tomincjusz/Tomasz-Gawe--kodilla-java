package com.kodilla.good.patterns.flights.airports;

public class Airport1 {
    private final String name;
    private final String abbrev;

    public Airport1(String name, String abbrev) {
        this.name = name;
        this.abbrev = abbrev;
    }

    public String getName() {
        return name;
    }

    public String getAbbrev() {
        return abbrev;
    }

    @Override
    public String toString() {
        return name+" ("+abbrev+")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Airport1 airport = (Airport1) o;
        return name.equals(airport.name) &&
                abbrev.equals(airport.abbrev);
    }

    @Override
    public int hashCode() {
        return name.hashCode()*100 + abbrev.hashCode();
    }
}

