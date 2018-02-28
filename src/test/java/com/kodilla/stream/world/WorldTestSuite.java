package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testTotalPeopleQuantity() {

        //Given

        Country poland = new Country(37950000);
        Country france = new Country(66900000);
        Country india = new Country(1324000000);
        Country china = new Country(1379000000);
        Country congo = new Country(5126000);
        Country kenya = new Country(48460000);
        Country argentina = new Country(43850000);
        Country brazil = new Country(207700000);

        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(france);

        Continent asia = new Continent();
        asia.addCountry(india);
        asia.addCountry(china);

        Continent africa = new Continent();
        africa.addCountry(congo);
        africa.addCountry(kenya);

        Continent southAmerica = new Continent();
        southAmerica.addCountry(argentina);
        southAmerica.addCountry(brazil);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(southAmerica);

        //When

        world.getPeopleQuantity();

        //Then

        BigDecimal expectedPeopleQuantity = new BigDecimal("3112986000");
        Assert.assertEquals(expectedPeopleQuantity, world.getPeopleQuantity());

    }
}