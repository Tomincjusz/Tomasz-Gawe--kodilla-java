package com.kodilla.good.patterns.challenges;

public class Allegro {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(),
                new ProductOrderService(),
                new ItemOrderRepository());
        orderProcessor.process(orderRequest);
    }
}

