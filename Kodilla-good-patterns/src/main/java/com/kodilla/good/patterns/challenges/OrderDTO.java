package com.kodilla.good.patterns.challenges;

public class OrderDTO {
    public User user;
    public boolean currentlyAvailable;

    public OrderDTO(User user, boolean currentlyAvailable) {
        this.user = user;
        this.currentlyAvailable = currentlyAvailable;
    }

    public User getUser() {
        return user;
    }

    public boolean isCurrentlyAvailable() {
        return isCurrentlyAvailable();
    }
}
