package food2door.Producers;

import food2door.SingleProducer.Company;
import food2door.SingleProducer.Dishes;

public class VeganShop {
    public GetCompanyInfo getCompanyInfo() {
        Company veganShop = (new Company("Vegan Shop", "Gdanska 119/121"));
        Dishes yoghurt = new Dishes("Yoghurt with fruits", "yoghurt", 5);
        return new GetCompanyInfo(veganShop, yoghurt);
    }
}
