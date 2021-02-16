package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaOrder implements Pizza {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getIngredients() {
        return "Ingredients: pizza dough, tomato sauce, cheese";
    }
}