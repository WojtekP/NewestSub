package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

       private InformationService informationService;
       private OrderRepository orderRepository;
       private BuyItem buyItem;

       public OrderProcessor(InformationService informationService,OrderRepository orderRepository, BuyItem buyItem){
           this.informationService = informationService;
           this.orderRepository = orderRepository;
           this.buyItem = buyItem;
       }
       public OrderDTO process(Cart cart){
           boolean currentlyAvailable = orderRepository.newOrder(cart.getUser(), cart.getProduct());
           if(currentlyAvailable){
               informationService.notify(cart.getUser());
               buyItem.order(cart.getProduct(), cart.getUser());
               return new OrderDTO(cart.getUser(),true);

           } else {
               return new OrderDTO(cart.getUser(), false);
           }
       }


    }



