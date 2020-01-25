package com.supercon.service.shoppingCart;

import com.supercon.model.Customer;
import com.supercon.model.Order;
import com.supercon.model.Product;

public interface IShoppingCartBuilder {
    IShoppingCartBuilder addProduct(Product product);
    IShoppingCartBuilder removeProduct(Product product);
    IShoppingCartBuilder setCustomer(Customer customer);
    double getTotalPrice();
    Integer getLoyaltyPointsEarned();
    Order checkout();
}
