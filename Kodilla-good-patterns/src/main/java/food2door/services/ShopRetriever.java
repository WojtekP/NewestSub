package food2door.services;

import food2door.Producers.GetCompanyInfo;
import food2door.SingleProducer.Company;
import food2door.SingleProducer.Dishes;

public interface ShopRetriever {
    GetCompanyInfo getCompanyInfo(Company company, Dishes dishes);
}
