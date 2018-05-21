package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {
    public void processOrder(Shop shop, Item item) {
        boolean ordered = shop.process(item);
        if(ordered) {
            System.out.println("\n" + "Your order has been registered");
        } else {
            System.out.println("Your order was rejected. Please contact our support service phone number: +12 234489999");
        }
    }

}