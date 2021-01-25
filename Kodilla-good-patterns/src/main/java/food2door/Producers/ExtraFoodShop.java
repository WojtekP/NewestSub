package food2door.Producers;

import food2door.SingleProducer.Company;
import food2door.SingleProducer.Dishes;

public class ExtraFoodShop {
    public GetCompanyInfo getCompanyInfo(){
        Company extraFoodShop = (new Company("Extra Food Shop","Warszawska 5/12"));
        Dishes extraPasta = new Dishes("Extra Pasta","Pasta",15);
        return new GetCompanyInfo(extraFoodShop,extraPasta);
    }



}
