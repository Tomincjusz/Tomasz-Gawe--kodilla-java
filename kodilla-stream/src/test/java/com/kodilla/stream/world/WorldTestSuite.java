package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {

        //Given
        Continent continent1 = new Continent("Europe");
        continent1.addCountry(new Country("Poland", new BigDecimal("37.95")));
        continent1.addCountry(new Country("German", new BigDecimal("83.24")));

        Continent continent2 = new Continent("Asia");
        continent2.addCountry(new Country("Japan", new BigDecimal("125.8")));
        continent2.addCountry(new Country("Mongolia", new BigDecimal("3.27")));

        Continent continent3 = new Continent("Africa");
        continent3.addCountry(new Country("Egypt", new BigDecimal("102.3")));
        continent3.addCountry(new Country("Sudan", new BigDecimal("43.8")));

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        BigDecimal expectedPopulation = new BigDecimal("396.36");

        //When
        BigDecimal worldPopulation = world.getPeopleQuantity();

        //Then
        assertEquals(expectedPopulation, worldPopulation);
    }
}


