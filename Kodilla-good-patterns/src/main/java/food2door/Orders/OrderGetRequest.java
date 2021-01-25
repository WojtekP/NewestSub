package food2door.Orders;

import food2door.SingleProducer.Company;

public class OrderGetRequest {
    public static OrderRequest orderGetRequest(){
        Order order = new Order("GIGA BURGER",3);
        Company company = new Company("Exotic meats Shop", "krakowska 12/10");
        return new OrderRequest(order,company);
    }
}
