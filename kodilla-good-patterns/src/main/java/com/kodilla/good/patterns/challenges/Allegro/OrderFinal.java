package com.kodilla.good.patterns.challenges.Allegro;

public class OrderFinal { //zamówienie końoowe
        private User user;
        private Product product;
        private boolean isBought;

        public OrderFinal(final User user, final Product product, final boolean isBought) {
            this.user = user;
            this.product = product;
            this.isBought = isBought;
        }

        public User getUser() {
            return user;
        }

        public Product getProduct() {
            return product;
        }

        public boolean isBought() {
            return isBought;
        }
    }
