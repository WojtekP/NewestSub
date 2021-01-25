package food2door.Producers;

import food2door.SingleProducer.Company;
import food2door.SingleProducer.Dishes;

public class ExoticMeatsShop {
    public GetCompanyInfo getCompanyInfo(){
        Company exoticMeatsShop = (new Company("Exotic Meats Shop","Krakowska 12/10"));
        Dishes gigaBurger = new Dishes("GIGA BURGER","Meat",29);
        return new GetCompanyInfo(exoticMeatsShop,gigaBurger);
    }
}
