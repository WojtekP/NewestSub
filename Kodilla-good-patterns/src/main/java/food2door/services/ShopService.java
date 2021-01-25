package food2door.services;

import food2door.Producers.GetCompanyInfo;
import food2door.SingleProducer.Company;
import food2door.SingleProducer.Dishes;

public class ShopService implements ShopRetriever{

    public GetCompanyInfo getCompanyInfo(Company company, Dishes dishes) {
        return new GetCompanyInfo(company,dishes);
    }
}
