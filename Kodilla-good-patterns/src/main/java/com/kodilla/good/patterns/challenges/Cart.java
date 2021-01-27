package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private User user;
    private Product product;

    public Cart(User user, Product product) {
        this.product = product;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

}
