package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    public List<Continent> listOfContinents = new ArrayList<>();

    public void addContinent(Continent continent) {
        listOfContinents.add(continent);

    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleSum = listOfContinents.stream()
                .flatMap(p -> p.listOfCountries.stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return peopleSum;


    }
}
