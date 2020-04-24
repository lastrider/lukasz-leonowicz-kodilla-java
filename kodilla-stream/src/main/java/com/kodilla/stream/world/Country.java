package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String name;
    private final BigDecimal peopleQuantity;

    public Country(String name, String peopleQuantity) {
        this.name = name;
        this.peopleQuantity = new BigDecimal(peopleQuantity);
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
