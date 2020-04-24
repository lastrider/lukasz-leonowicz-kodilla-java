package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


public class WorldTesSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", "38420687");
        Country germany = new Country("Germany", "80457737");
        Country spain = new Country("Spain", "49331076");
        Country canada = new Country("Canada", "35881659");
        Country mexico = new Country("mexico", "125959205");
        Country china = new Country("China", "1401585247");
        Country thailand = new Country("Thailand", "68615858");

        Continent europe = new Continent("Europe", poland, germany, spain);
        Continent asia = new Continent("Asia", china, thailand);
        Continent america = new Continent("America", canada, mexico);

        World world = new World(europe, asia, america);

        //When
        BigDecimal correctResult = new BigDecimal("1800251469");
        BigDecimal result = world.getContinentList().stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity).reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        Assert.assertEquals(correctResult, result);
    }
}
