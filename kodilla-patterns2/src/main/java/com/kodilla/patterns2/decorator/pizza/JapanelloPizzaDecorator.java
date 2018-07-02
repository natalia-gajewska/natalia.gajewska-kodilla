package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class JapanelloPizzaDecorator extends AbstractPizzaOrderDecorator {
    public JapanelloPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(2));
    }

    @Override
    public String getTopping() {
        return super.getTopping() + ", hot chilli";
    }
}
