package com.supercon.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final Customer customer;
    private List<Product> products;
    private final double totalPrice;

    public Order(Customer customer, double totalPrice, List<Product> products){
        this.customer = customer;
        this.totalPrice = totalPrice;
        this.products = new ArrayList<>(products);
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
