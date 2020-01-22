package com.supercon.service.product;

import com.supercon.model.Product;

public class ProductBuilder  implements IProductBuilder {

    private double price;
    private String productCode;
    private String productName;

    public ProductBuilder(){
        this.price = 0.0;
        this.productCode = "";
        this.productName = "";
    }

    @Override
    public ProductBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public ProductBuilder setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    @Override
    public ProductBuilder setName(String name) {
        this.productName = name;
        return this;
    }

    @Override
    public Product build(){
        return new Product (price, productCode, productName);
    }













}
