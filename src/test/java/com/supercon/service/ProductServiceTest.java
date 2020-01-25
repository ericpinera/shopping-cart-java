package com.supercon.service;

import com.supercon.model.Product;
import com.supercon.service.product.IProductBuilder;
import com.supercon.service.product.ProductBuilder;
import com.supercon.service.product.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class ProductServiceTest {

    private ProductService productService;
    private IProductBuilder productBuilder;

    @BeforeEach
    public void setup() throws Exception {

        productBuilder = mock(ProductBuilder.class);
        productService = new ProductService(Arrays.asList(
                new Product(1.50, "PROD_01", "Product 01", loyaltyPointsEarned),
                new Product(3.45, "PROD_02", "Product 02", loyaltyPointsEarned)
        ));
    }

    @Test
    void getProductCodes_shouldReturnAllCodes() throws Exception {
        List<String> codes = productService.getProductCodes();
        assertEquals(2, codes.size());
        assertEquals("PROD_01", codes.get(0));
        assertEquals("PROD_02", codes.get(1));
    }

    @Test
    void getProduct_shouldReturnProductForKnownCode() throws Exception {
        Product product = productService.getProduct("PROD_01");
        assertEquals("PROD_01", product.getProductCode());
        assertEquals("Product 01", product.getName());
        assertEquals(1.50, product.getPrice(), 0.00);
    }

    @Test
    public void getProduct_shouldReturnNullForUnknownCode() throws Exception {
        Product product = productService.getProduct("PROD_03");
        assertNull(product);
    }
}
