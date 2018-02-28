package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final List<Country> countries=new ArrayList<>();


   // public World(String final continent) {
   //     this.continent = continent;
   // }

    public void addCountry (Country country){
        countries.add(country);
    }

    public boolean removeCountry (Country country){
        return countries.remove(country);
    }

    public List<Country> getListOfCountry() {
        return countries;
    }
}
