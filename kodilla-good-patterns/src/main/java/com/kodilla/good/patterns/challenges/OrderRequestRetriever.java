package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Tom", "Jones");
        LocalDateTime orderDate = LocalDateTime.of(2022, 01, 02, 18, 11);
        int productSerialNo = 54354;
        int quantity = 1;
        double price = 19.99;

        return new OrderRequest(user, orderDate, productSerialNo, quantity, price);
    }
}
