package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBigmac() {
        //Given
        Bigmac bigmac = null;
        try {
            bigmac = new Bigmac.BigmacBuilder()
                    .bun(true)
                    .burgers(2)
                    .sauce("standard")
                    .ingredients("lettuce")
                    .ingredients("bacon")
                    .ingredients("onions")
                    .build();
        } catch (Exception e) {

        }
        //When
        int amountIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, amountIngredients);
        Assert.assertEquals(2, bigmac.getBurgers());
        Assert.assertTrue(bigmac.isBun());
        Assert.assertEquals("standard", bigmac.getSauce());
    }

    @Test
    public void testIncompleteBurger() {
        //Given
        Bigmac bigmac = null;
        Exception exception = null;
        try {
            bigmac = new Bigmac.BigmacBuilder()
                    .bun(true)
                    .burgers(2)
                    .ingredients("lettuce")
                    .ingredients("bacon")
                    .ingredients("onions")
                    .build();
        } catch (Exception e) {
            exception = e;
        }
        //When
        String message = exception.getMessage();
        //Then
        Assert.assertEquals("Incomplete burger", message);
    }

    @Test
    public void testIncorrectIngredient() {
        //Given
        Bigmac bigmac = null;
        Exception exception = null;
        try {
            bigmac = new Bigmac.BigmacBuilder()
                    .bun(true)
                    .burgers(2)
                    .sauce("standard")
                    .ingredients("wrongIngredient")
                    .ingredients("bacon")
                    .ingredients("onions")
                    .build();
        } catch (Exception e) {
            exception = e;
        }
        //When
        String message = exception.getMessage();
        //Then
        Assert.assertEquals("Wrong ingredients", message);
    }

    @Test
    public void testIncorrectness() {
        //Given
        Bigmac bigmac = null;
        Exception exception = null;
        try {
            bigmac = new Bigmac.BigmacBuilder()
                    .bun(true)
                    .burgers(2)
                    .sauce("wrongSauce")
                    .ingredients("bacon")
                    .ingredients("onions")
                    .build();
        } catch (Exception e) {
            exception = e;
        }
        //When
        String message = exception.getMessage();
        //Then
        Assert.assertEquals("Wrong sauce", message);
    }
}