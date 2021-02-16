package com.kodilla.patterns2.decorator.pizza;


import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.math.BigDecimal;


@SpringBootTest
public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderCost() {
        //Given
        Pizza pizza = new PizzaOrder();
        //When
        BigDecimal cost = pizza.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicPizzaIngredients() {
        //Given
        Pizza pizza = new PizzaOrder();
        //When
        String ingredients = pizza.getIngredients();
        //Then
        Assertions.assertEquals("Ingredients: pizza dough, tomato sauce, cheese", ingredients);
    }

    @Test
    public void testMoreIngredientsPizzaOrderCost() {
        //Given
        Pizza pizza = new PizzaOrder();
        pizza = new Cheese(pizza);
        pizza = new Mushrooms(pizza);
        pizza = new Tomatoe(pizza);
        //When
        BigDecimal cost = pizza.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(20), cost);
    }

    @Test
    public void testMoreIngredientsPizzaOrder() {
        //Given
        Pizza pizza = new PizzaOrder();
        pizza = new Cheese(pizza);
        pizza = new Mushrooms(pizza);
        pizza = new Tomatoe(pizza);
        //When
        String ingredients = pizza.getIngredients();
        //Then
        Assertions.assertEquals("Ingredients: pizza dough, tomato sauce, " +
                "cheese cheese mushrooms tomatoe", ingredients);
    }
}