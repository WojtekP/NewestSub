package food2door.services;

import food2door.SingleProducer.Company;

public class NotificationService implements InformationService {

    public void notify(Company company) {
        System.out.println("there is a new order");

    }
}
