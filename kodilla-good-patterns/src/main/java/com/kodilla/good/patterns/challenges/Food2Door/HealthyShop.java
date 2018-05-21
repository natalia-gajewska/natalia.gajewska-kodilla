package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Shop{
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to HealthyFoodShop. \n" + "All our products are 100% organic ingredients!");
        return true;
    }

}