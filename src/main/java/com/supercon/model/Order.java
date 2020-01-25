package com.supercon.model;

import java.util.List;

public class Order {
    private final Customer customer;
    private final List<Product> products;
    private final double totalPrice;
    private final Integer loyaltyPointsEarned;

    public Order(Customer customer, List<Product> products, double totalPrice, Integer loyaltyPointsEarned) {
        this.customer = customer;
        this.products = products;
        this.totalPrice = totalPrice;
       // super(customer, products, "ORDER_PLACED");
        this.loyaltyPointsEarned = loyaltyPointsEarned;
    }


}
