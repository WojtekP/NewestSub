package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Cheese extends AbstractPizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " cheese";
    }
}
