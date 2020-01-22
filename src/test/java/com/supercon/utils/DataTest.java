package com.supercon.utils;

import com.supercon.model.Product;
import com.supercon.service.product.ProductBuilder;

import java.util.Arrays;
import java.util.List;

public class DataTest {

    public static final double _1_99 = 1.99;
    public static final double _5_99 = 5.99;

    public static final Product PROD_OBJET_TEST_01 = new ProductBuilder()
            .setPrice(_1_99)
            .setProductCode("PROD_TEST_01")
            .setName("PRODUCT_TEST_01").build();
    public static final Product PROD_OBJET_TEST_02 = new ProductBuilder()
            .setPrice(_5_99)
            .setProductCode("PROD_TEST_02")
            .setName("PRODUCT_TEST_02").build();

    public static final List<String> PRODUCTS_TEST = Arrays.asList(
            PROD_OBJET_TEST_01.getProductCode(), PROD_OBJET_TEST_02.getProductCode()
    );





}
