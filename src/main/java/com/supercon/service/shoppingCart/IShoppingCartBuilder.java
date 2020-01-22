package com.supercon.service.shoppingCart;

import com.supercon.model.Product;

public interface IShoppingCartBuilder {
    IShoppingCartBuilder addProduct(Product product);
    IShoppingCartBuilder removeProduct(Product product);
}
