package com.supercon.model;

public class Product {

    private final double price;
    private final String productCode;
    private final String name;
    private final Integer loyaltyPointsEarned;

    public Product(double price, String productCode, String name, Integer loyaltyPointsEarned) {
        this.price = price;
        this.productCode = productCode;
        this.name = name;
        this.loyaltyPointsEarned = loyaltyPointsEarned;
    }

    public double getPrice() { return price; }

    public String getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    public Integer getLoyaltyPointsEarned() {
        return loyaltyPointsEarned;
    }

}
