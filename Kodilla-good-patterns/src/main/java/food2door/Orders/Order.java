package food2door.Orders;

public class Order {
    private String order;
    private int quantity;

    public Order(String order, int quantity) {
        this.order = order;
        this.quantity = quantity;
    }

    public String getOrder() {
        return order;
    }

    public int getQuantity() {
        return quantity;
    }
}
