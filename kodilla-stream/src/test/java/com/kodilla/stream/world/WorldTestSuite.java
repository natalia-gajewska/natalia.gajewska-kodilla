package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        //Given
        Country poland = new Country("Poland", new BigDecimal(10));
        Country sweden = new Country("Sweden", new BigDecimal(20));
        Country germany = new Country("Germany", new BigDecimal(7));
        Country turkey = new Country("Turkey", new BigDecimal(8));

        Continent asia = new Continent("Asia", Arrays.asList(sweden, germany));
        Continent europe = new Continent("Europe", Arrays.asList(poland, turkey));
        World world = new World(Arrays.asList(asia, europe));

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("45"), peopleQuantity);
    }
}