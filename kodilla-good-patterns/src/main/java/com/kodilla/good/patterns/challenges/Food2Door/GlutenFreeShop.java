package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Shop{
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to GlutenFreeShop. All our products are 100% gluten free.");
        return true;
    }

}