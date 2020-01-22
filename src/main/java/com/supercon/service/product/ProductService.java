package com.supercon.service.product;

import com.supercon.model.Product;
import com.supercon.service.product.IProductoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.supercon.utils.Constants.ALL_PRODUCTS;

@Service
public class ProductService implements IProductoService {

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
        return products.stream()
                .filter(p -> p.getProductCode().equals(code))
                .findFirst().orElse(null);
        }
    }
