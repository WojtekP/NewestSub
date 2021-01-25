package food2door.Orders;

import food2door.SingleProducer.Company;

public class OrderRequest {
    public Order order;
    public Company company;

    public OrderRequest(Order order, Company company) {
        this.order = order;
        this.company = company;
    }

    public Order getOrder() {
        return order;
    }

    public Company getCompany() {
        return company;
    }
}
