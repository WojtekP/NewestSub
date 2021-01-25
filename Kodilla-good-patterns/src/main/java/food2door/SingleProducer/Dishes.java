package food2door.SingleProducer;

public class Dishes {
    private String name;
    private String category;
    private int price;

    public Dishes(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dishes{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
