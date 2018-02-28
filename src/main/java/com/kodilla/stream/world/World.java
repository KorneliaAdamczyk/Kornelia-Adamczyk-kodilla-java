package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent>continents=new ArrayList<>();

 public void addContinent(Continent continent){
     continents.add(continent);
 }
 public boolean removeContinent(Continent continent){
     return continents.remove(continent);
 }

 public List<Continent> getListOfContinent(){
     return continents;
 }

    public BigDecimal getPeopleQuantity(){
     return continents.stream()
                .flatMap(continent -> continent.getListOfCountry().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

             


 }

}
