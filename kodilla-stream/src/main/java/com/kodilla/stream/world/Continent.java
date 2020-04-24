package com.kodilla.stream.world;

import java.util.*;

public final class Continent  {
    private List<Country> listOfCountries = new ArrayList<>();
    private final String name;

    public Continent(String name,Country... arg) {
        this.name=name;
        this.listOfCountries.addAll(Arrays.asList(arg));
    }

    public void addCountry(Country country){
        listOfCountries.add(country);
    }
    public List<Country> getListOfCountries() {
        return listOfCountries;
    }
}
