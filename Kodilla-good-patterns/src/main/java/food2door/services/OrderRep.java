package food2door.services;

import food2door.Orders.Order;
import food2door.SingleProducer.Company;

public interface OrderRep {
    public boolean newOrder(Company company, Order order);
}
