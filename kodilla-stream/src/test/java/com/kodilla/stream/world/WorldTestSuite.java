package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @DisplayName("get People Over World Quantity Test")
    @Test
    void getPeopleOverWorldQuantity(){
        //Given
        Country germany = new Country(new BigDecimal("200000000000000"));
        Country poland = new Country(new BigDecimal("100000000000000"));
        Country russia = new Country(new BigDecimal("900000000000000"));
        Country slovakia = new Country(new BigDecimal("200000000000000"));
        Country spain = new Country(new BigDecimal("300000000000000"));
        Country italy = new Country(new BigDecimal("400000000000000"));
        Country china = new Country(new BigDecimal("900000000000000"));
        Country japan = new Country(new BigDecimal("200000000000000"));
        Country usa = new Country(new BigDecimal("300000000000000"));
        Country canada = new Country(new BigDecimal("400000000000000"));
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent northAmerica = new Continent();
        World world = new World();
        europe.addCountry(germany);
        europe.addCountry(poland);
        europe.addCountry(russia);
        europe.addCountry(slovakia);
        europe.addCountry(spain);
        europe.addCountry(italy);
        asia.addCountry(china);
        asia.addCountry(japan);
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);
        //When
        BigDecimal sumOfAllPeople = world.getPeopleQuantity();
        BigDecimal expectedPeople = new BigDecimal("3900000000000000");
        //Then
        Assertions.assertEquals(expectedPeople,sumOfAllPeople);
    }
}
