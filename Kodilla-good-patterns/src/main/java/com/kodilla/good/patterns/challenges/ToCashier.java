package com.kodilla.good.patterns.challenges;

public class ToCashier {
    public static Cart retrieve() {
        User user = new User("John", "Smith");
        Product product = new Product("sandals", 29);
        return new Cart(user, product);
    }
}
