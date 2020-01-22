package com.supercon.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.supercon.service.product.ProductService;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import static com.supercon.utils.Constants.V1_PRODUCTS;
import static com.supercon.utils.DataTest.PRODUCTS_TEST;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class ProductControllerTest {

    private MockMvc mockMvc;

    private ProductService productService;

    @BeforeEach
    protected void setup(){

        productService = mock(ProductService.class);

        mockMvc = standaloneSetup(new ProductController(productService)).build();
    }

    @Test
    void getProducts() throws Exception {
        when(productService.getProductCodes())
                .thenReturn(PRODUCTS_TEST);

        RequestBuilder requestBuilder = get(V1_PRODUCTS)
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        verify(productService, times(1))
                .getProductCodes();

        ObjectMapper mapper = new ObjectMapper();
        List<String> productsCode = mapper
                .readValue(result.getResponse().getContentAsString(),
                        mapper.getTypeFactory().constructCollectionType(List.class, String.class));

        Deque<String> productsCodeDeque = new ArrayDeque<>(PRODUCTS_TEST);

        productsCode.stream().forEach(
                x->{
                    assertThat(x).isEqualTo(productsCodeDeque.poll());
                }
        );
    }

    @Ignore
    @Test
    void getProduct(){
        assertThat("1").isEqualTo("1");
    }



}
