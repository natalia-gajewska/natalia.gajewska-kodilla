package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class SampleOrder {

    public Order retrieve() {

        User sampleUser = new User("Natalia123", "Natalia", "Gajewska");
        Product sampleProduct = new Product("HairDryer");
        LocalDateTime sampleOrderTime = LocalDateTime.of(2018, 05, 21, 12, 0, 0);

        return new Order(sampleUser, sampleProduct, sampleOrderTime);

    }

}