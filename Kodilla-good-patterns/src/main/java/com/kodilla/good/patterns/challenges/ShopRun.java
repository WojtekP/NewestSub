package com.kodilla.good.patterns.challenges;

public class ShopRun {
    public static void main(String[] args) {
        ToCashier toCashier = new ToCashier();
        Cart cart = toCashier.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new NotificationService(), new OrderService(), new BuyItem());
        orderProcessor.process(cart);
    }
}
