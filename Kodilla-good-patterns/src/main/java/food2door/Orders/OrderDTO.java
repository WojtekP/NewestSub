package food2door.Orders;

import food2door.SingleProducer.Company;

public class OrderDTO {
    public Company company;
    public boolean ordered;

    public OrderDTO(Company company, boolean ordered) {
        this.company = company;
        this.ordered = ordered;
    }

    public Company getCompany() {
        return company;
    }
}
