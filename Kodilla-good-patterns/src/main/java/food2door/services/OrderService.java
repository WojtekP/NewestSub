package food2door.services;

import food2door.Orders.Order;
import food2door.SingleProducer.Company;

public class OrderService implements OrderRep {
    public boolean newOrder(Company company, Order order) {
        System.out.println("Processing order: " + " \n order : " + order.getOrder() + "\n quantity: " + order.getQuantity() +
                "\n from: " + company.getCompanyName() + "\n address: " + company.getAddress());
        return true;
    }
}
