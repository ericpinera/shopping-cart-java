package com.supercon.utils;

import com.supercon.model.Product;
import com.supercon.service.product.ProductBuilder;

import java.util.Arrays;
import java.util.List;

public class Constants {

    public static final Double _24_99 = 24.99;
    public static final Double _14_99 = 14.99;
    public static final Double _74_99 = 74.99;
    public static final Double _129_99 = 129.99;
    public static final Double _249_99 = 249.99;
    public static final Double _99_99 = 99.99;



    // Simple source of products: would come from a database in the real world.
    public static final List<Product> ALL_PRODUCTS = Arrays.asList(
            new ProductBuilder().setPrice(_24_99).setProductCode("CHAIR_RED").setName("Red plastic chair").build(),
            new ProductBuilder().setPrice(_24_99).setProductCode("DIS_10-CHAIR_BLUE").setName("Blue plastic chair").build(),
            new ProductBuilder().setPrice(_24_99).setProductCode("CHAIR_WHITE").setName("White plastic chair").build(),
            new ProductBuilder().setPrice(_14_99).setProductCode("STOOL_WHITE").setName("White plastic footstool").build(),
            new ProductBuilder().setPrice(_14_99).setProductCode("DIS_15-STOOL_GREEN").setName("Green plastic footstool").build(),
            new ProductBuilder().setPrice(_74_99).setProductCode("COMP_DESK").setName("Wooden computer desk").build(),
            new ProductBuilder().setPrice(_129_99).setProductCode("COMP_CHAIR").setName("Computer swivel chair").build(),
            new ProductBuilder().setPrice(_249_99).setProductCode("BOARD_TABLE").setName("12-person boardroom table").build(),
            new ProductBuilder().setPrice(_99_99).setProductCode("BOARD_CHAIR").setName("Boardroom chair").build()
    );

    public static final String V1_PRODUCTS = "/v1/products";
    public static final String V1_PRODUCTS_CODE = "/v1/products/{code}";






}
