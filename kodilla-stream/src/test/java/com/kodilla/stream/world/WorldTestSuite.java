package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal("37750000"));
        Country germany = new Country(new BigDecimal("83200000"));
        Country spain = new Country(new BigDecimal("47420000"));
        Country france = new Country(new BigDecimal("67750000"));

        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(spain);
        europe.addCountry(france);

        World world = new World();
        world.addContinent(europe);

        //When
        BigDecimal expectedPeopleQuantity = new BigDecimal("236120000");

        //Then
        assertEquals(expectedPeopleQuantity, world.getPeopleQuantity());
    }
}
