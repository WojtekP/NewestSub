package food2door.Producers;

import food2door.SingleProducer.Company;
import food2door.SingleProducer.Dishes;

public class HealthyShop {
    public GetCompanyInfo getCompanyInfo() {
        Company healthyShop = (new Company("Healthy Shop", "Wrocławska 19/121"));
        Dishes carrotsWithApples = new Dishes("Carrots with apple sauce", "vegetables", 19);
        return new GetCompanyInfo(healthyShop, carrotsWithApples);
    }
}
