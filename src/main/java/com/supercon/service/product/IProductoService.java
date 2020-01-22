package com.supercon.service.product;

import com.supercon.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    List<String> getProductCodes();
    Product getProduct(final String code);
}
