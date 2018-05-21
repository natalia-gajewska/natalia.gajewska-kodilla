package com.kodilla.good.patterns.challenges.Allegro;

import java.util.ArrayList;

    public class OrderAgdCategory implements OrderRepository {
        private static ArrayList<Order> orderRepository = new ArrayList<>();

        @Override
        public void addOrderToRepository(Order order) {
            orderRepository.add(order);
            System.out.println("The order has been added to AGD category\n");
        }
    }