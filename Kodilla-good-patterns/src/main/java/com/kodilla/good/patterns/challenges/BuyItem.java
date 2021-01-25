package com.kodilla.good.patterns.challenges;

public class BuyItem implements BuyingService {

    public boolean order(Product product, User user) {
        System.out.println(user.getName() +" "+ user.getSurname() + " just bought: " + product.getProductName() + " for: " + product.getProductPrice());
        return true;
    }
}
