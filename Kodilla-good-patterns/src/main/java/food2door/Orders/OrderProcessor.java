package food2door.Orders;

import food2door.Producers.GetCompanyInfo;
import food2door.services.InformationService;
import food2door.services.OrderRep;
import food2door.services.ShopRetriever;

public class OrderProcessor {
    private InformationService informationService;
    private OrderRep orderRep;
    private ShopRetriever shopRetriever;

    public OrderProcessor(InformationService informationService, OrderRep orderRep, ShopRetriever shopRetriever) {
        this.informationService = informationService;
        this.orderRep = orderRep;
        this.shopRetriever = shopRetriever;
    }
    public OrderDTO process(OrderRequest orderRequest, GetCompanyInfo getCompanyInfo){
        boolean placedOrder = orderRep.newOrder(orderRequest.getCompany(),orderRequest.getOrder());
        shopRetriever.getCompanyInfo(getCompanyInfo.getCompany(),getCompanyInfo.getDishes());
        if(placedOrder){
            informationService.notify(orderRequest.getCompany());
            return new OrderDTO(orderRequest.getCompany(),true);

        } else {
            return new OrderDTO(orderRequest.getCompany(),false);
        }
    }
}
