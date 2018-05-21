package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class Order { //zamówienie
    private User user; //uzytkownik
    private Product product; //jaki produkt
    private LocalDateTime orderTime; //czas oczekiwania

    public Order(final User user, final Product product, final LocalDateTime orderTime) {
        this.user = user;
        this.product = product;
        this.orderTime = orderTime;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}