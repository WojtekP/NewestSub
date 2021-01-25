package food2door.Producers;

import food2door.SingleProducer.Company;
import food2door.SingleProducer.Dishes;

public class GetCompanyInfo {
    private Company company;
    private Dishes dishes;

    public GetCompanyInfo(Company company, Dishes dishes) {
        this.company = company;
        this.dishes = dishes;
    }

    public Company getCompany() {
        return company;
    }

    public Dishes getDishes() {
        return dishes;
    }
}
