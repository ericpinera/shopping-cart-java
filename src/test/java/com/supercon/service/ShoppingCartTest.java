package com.supercon.service;

import com.supercon.model.Customer;
import com.supercon.service.shoppingCart.ShoppingCart;
import com.supercon.service.shoppingCart.IShoppingCartBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.supercon.utils.DataTest.PROD_OBJET_TEST_01;
import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingCartTest {
    private IShoppingCartBuilder shoppingCartTest;

    @BeforeEach
    void setUp(){
        shoppingCartTest = new ShoppingCart()
                .setCustomer(new Customer("Paula"));
    }

    @Test
    void addProductTest(){
        shoppingCartTest.addProduct(PROD_OBJET_TEST_01);

        IShoppingCartBuilder shoppingCartExpect = new ShoppingCart()
                .setCustomer(new Customer("Paula"))
                .addProduct(PROD_OBJET_TEST_01);

        assertThat(shoppingCartTest).isEqualToComparingFieldByFieldRecursively(shoppingCartExpect);
    }

    @Test
    void removeProduct(){
        shoppingCartTest.removeProduct(PROD_OBJET_TEST_01);

        IShoppingCartBuilder shoppingCartExpect = new ShoppingCart()
                .setCustomer(new Customer("Paula"));

        assertThat(shoppingCartTest).isEqualToComparingFieldByFieldRecursively(shoppingCartExpect);
    }

}
