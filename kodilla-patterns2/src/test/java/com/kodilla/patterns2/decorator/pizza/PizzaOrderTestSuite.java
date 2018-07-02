package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        BigDecimal calculatedCost = pizzaOrder.getPrice();

        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetTopping(){
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        String topping = pizzaOrder.getTopping();

        assertEquals("Pizza with double cheese", topping);
    }

    @Test
    public void testPizzaOrderWithEverythingGetCost() {
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        pizzaOrder = new BeconPizzeDecorator(pizzaOrder);
        pizzaOrder = new PepperoniPizzaDecorator(pizzaOrder);
        pizzaOrder = new AmericanPizzaDecorator(pizzaOrder);
        pizzaOrder = new JapanelloPizzaDecorator(pizzaOrder);
        pizzaOrder = new VegePizzaDecorator(pizzaOrder);


        BigDecimal calculatedCost = pizzaOrder.getPrice();

        assertEquals(new BigDecimal(34), calculatedCost);
    }

    @Test
    public void testPizzaOrderWithEverythingGetTopping() {
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        pizzaOrder = new BeconPizzeDecorator(pizzaOrder);
        pizzaOrder = new PepperoniPizzaDecorator(pizzaOrder);
        pizzaOrder = new AmericanPizzaDecorator(pizzaOrder);
        pizzaOrder = new JapanelloPizzaDecorator(pizzaOrder);
        pizzaOrder = new VegePizzaDecorator(pizzaOrder);


        String topping = pizzaOrder.getTopping();

        assertEquals("Pizza with double cheese, becon, pepperoni, american additions, hot chilli, some vegetables"
                , topping);
    }
}
