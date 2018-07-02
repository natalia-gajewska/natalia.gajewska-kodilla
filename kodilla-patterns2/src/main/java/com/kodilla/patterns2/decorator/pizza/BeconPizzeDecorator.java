package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BeconPizzeDecorator extends AbstractPizzaOrderDecorator {
    public BeconPizzeDecorator (PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String getTopping() {
        return super.getTopping() + ", becon";
    }
}

