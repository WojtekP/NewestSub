package food2door.Producers;

import food2door.SingleProducer.Company;
import food2door.SingleProducer.Dishes;

public class GlutenFreeShop {
    public GetCompanyInfo getCompanyInfo() {
        Company glutenFreeShop = (new Company("Gluten Free Shop", "Poznanska 9/121"));
        Dishes glutenFreeBread = new Dishes("Gluten Free Bread", "Breads", 4);
        return new GetCompanyInfo(glutenFreeShop, glutenFreeBread);
    }
}
