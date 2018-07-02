package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperoniPizzaDecorator extends AbstractPizzaOrderDecorator {
    public PepperoniPizzaDecorator (PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4));
    }

    @Override
    public String getTopping() {
        return super.getTopping() + ", pepperoni";
    }
}
