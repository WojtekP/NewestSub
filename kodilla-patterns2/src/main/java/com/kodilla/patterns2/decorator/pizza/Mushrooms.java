package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Mushrooms extends AbstractPizzaDecorator {
    public Mushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " mushrooms";
    }
}