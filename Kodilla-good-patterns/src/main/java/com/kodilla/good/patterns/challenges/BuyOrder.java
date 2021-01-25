package com.kodilla.good.patterns.challenges;

import javax.lang.model.type.MirroredTypeException;

public class BuyOrder {
    public boolean buy(User user, Product product){
        System.out.println(user.getSurname() + user.getName() + "bought " + product.getProductName() + " for " + product.getProductPrice());
        return true;
    }
}
