package com.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class OnionDecorator extends AbstractPizzaOrderDecorator {
    public OnionDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("2.5"));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + onion";
    }
}