package food2door.SingleProducer;

public class Company {
    private String companyName;
    private String address;

    public Company(String companyName, String address) {
        this.companyName = companyName;
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }
}
