package com.kodilla.good.patterns.challenges;

public class OrderService implements OrderRepository {
    public boolean newOrder(User user, Product product) {
        System.out.println("Currently processing " + user.getName() + " " + user.getSurname() + " order : "
                + product.getProductName() + " for :" + product.getProductPrice());
        return true;

    }
}
