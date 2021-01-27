package com.kodilla.good.patterns.challenges;

public class NotificationService implements InformationService {

    public void notify(User user) {
        System.out.println("Your order is currently being processed");
    }


}
