package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class VegePizzaDecorator extends AbstractPizzaOrderDecorator {
    public VegePizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public String getTopping() {
        return super.getTopping() + ", some vegetables";
    }
}
