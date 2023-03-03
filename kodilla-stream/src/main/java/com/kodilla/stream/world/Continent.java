package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    final List<Country> listOfCountries = new ArrayList<>();

    public void addCountry(Country country) {
        listOfCountries.add(country);
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }
}
