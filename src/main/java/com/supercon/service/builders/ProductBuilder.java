package com.supercon.service.builders;

import com.supercon.model.Product;

public class ProductBuilder {

    private double price;
    private String productCode;
    private String productName;

    public ProductBuilder(){
        this.price = 0.0;
        this.productCode = "";
        this.productName = "";
    }

    public ProductBuilder(double price, String productCode, String name){
        this.price = price;
        this.productCode = productCode;
        this.productName = name;
    }

    public ProductBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    public ProductBuilder setName(String name) {
        this.productName = name;
        return this;
    }

    public Product build(){
        return new Product (price, productCode, productName);
    }













}
