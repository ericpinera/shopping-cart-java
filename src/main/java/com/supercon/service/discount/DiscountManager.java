package com.supercon.service.discount;

import com.supercon.model.Product;

import java.util.List;

public class DiscountManager implements IDiscountManagerStrategy {

    @Override
    public double applyDiscount(Product product) {
        return 0;
    }
}
