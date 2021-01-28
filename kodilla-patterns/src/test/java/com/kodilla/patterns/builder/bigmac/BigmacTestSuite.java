package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sezam")
                .burgers(3)
                .sauce("barbecue")
                .ingredient("Beacon")
                .ingredient("Cheese")
                .ingredient("Tomatoe")
                .ingredient("Salad")
                .ingredient("Onion")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(5, howManyIngredients);
    }
}