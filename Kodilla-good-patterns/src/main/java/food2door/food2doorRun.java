package food2door;

import food2door.Orders.OrderDTO;
import food2door.Orders.OrderGetRequest;
import food2door.Orders.OrderProcessor;
import food2door.Orders.OrderRequest;
import food2door.Producers.*;
import food2door.services.*;

public class food2doorRun {
    public static void main(String[] args) {
        ExoticMeatsShop exoticMeatsShop = new ExoticMeatsShop();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();
        VeganShop veganShop = new VeganShop();

        GetCompanyInfo getCompanyInfoExotic = exoticMeatsShop.getCompanyInfo();
        GetCompanyInfo getCompanyInfoExtra = extraFoodShop.getCompanyInfo();
        GetCompanyInfo getCompanyInfoGluten = glutenFreeShop.getCompanyInfo();
        GetCompanyInfo getCompanyInfoHealthy = healthyShop.getCompanyInfo();
        GetCompanyInfo getCompanyInfoVegan = veganShop.getCompanyInfo();

        OrderGetRequest orderGetRequest = new OrderGetRequest();
        OrderRequest orderRequest = orderGetRequest.orderGetRequest();

        OrderProcessor orderProcessor = new OrderProcessor(new NotificationService(),new OrderService(),new ShopService());
        orderProcessor.process(orderRequest,getCompanyInfoExotic);


    }
}