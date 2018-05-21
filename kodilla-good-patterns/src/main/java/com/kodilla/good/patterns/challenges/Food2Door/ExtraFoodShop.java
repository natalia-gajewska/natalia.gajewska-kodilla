package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Shop{
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to Extra Food Shop. We guarantee that you receive the highest quality products!");
        return true;
    }

}