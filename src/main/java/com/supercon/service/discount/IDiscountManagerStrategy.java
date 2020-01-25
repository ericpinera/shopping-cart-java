package com.supercon.service.discount;

import com.supercon.model.Product;

import java.util.List;

public interface IDiscountManagerStrategy {

    double applyDiscount(Product product);
}
