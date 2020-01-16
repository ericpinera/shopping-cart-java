package com.supercon.service;

import com.supercon.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.supercon.utils.Constants.ALL_PRODUCTS;

@Service
public class ProductService {

    private List<Product> products;

    public ProductService() {
        this.products = ALL_PRODUCTS;
    }

    public ProductService(final List<Product> products) {
        this.products = products;
    }

    public List<String> getProductCodes() {
        return products.stream()
                .map(Product::getProductCode)
                .collect(Collectors.toList());
    }

    public Product getProduct(final String code) {
        for (final Product product : products) {
            if (product.getProductCode().equals(code)) {
                return product;
            }
        }
        return null;
    }
}
