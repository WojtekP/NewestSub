package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private BigDecimal peopleQuantity;

    public Country(BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {

        return peopleQuantity;
    }
}
