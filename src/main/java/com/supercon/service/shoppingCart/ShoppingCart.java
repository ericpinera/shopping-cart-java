package com.supercon.service.shoppingCart;

import com.supercon.model.Customer;
import com.supercon.model.Order;
import com.supercon.model.Product;
import com.supercon.service.OrderService;
import com.supercon.service.shoppingCart.IShoppingCartBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements IShoppingCartBuilder {

    //Product and quantity
    private List<Product> products;
    private Customer customer;
    private String cartState;

    /*
    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    private OrderService orderService;
    */


    public ShoppingCart() {
        this.customer = new Customer("");
        this.products = new ArrayList<>();
        this.cartState = "Activo";
    }

    @Override
    public IShoppingCartBuilder addProduct(Product product) {
        this.products.add(product);
        return this;
    }

    @Override
    public IShoppingCartBuilder removeProduct(Product product) {
        this.products.removeIf((p) -> p.getProductCode().equals(product.getProductCode()));
        return this;
    }

    @Override
    public IShoppingCartBuilder setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    @Override
    public Integer getLoyaltyPointsEarned() {
        int loyaltyPointsEarned = 0;
        for (Product product : products) {
            if (product.getProductCode().startsWith("DIS_10")) {
                loyaltyPointsEarned += (product.getPrice() / 10);
            } else if (product.getProductCode().startsWith("DIS_15")) {
                loyaltyPointsEarned += (product.getPrice() / 15);
            } else {
                loyaltyPointsEarned += (product.getPrice() / 5);
            }
        }
        return loyaltyPointsEarned;
    }

    @Override
    public double getTotalPrice(){
        double totalPrice = 0;

        int loyaltyPointsEarned = 0;
        for (Product product : products) {
            double discount = 0;
            if (product.getProductCode().startsWith("DIS_10")) {
                discount = (product.getPrice() * 0.1);
            } else if (product.getProductCode().startsWith("DIS_15")) {
                discount = (product.getPrice() * 0.15);
            }
            totalPrice += product.getPrice() - discount;
        }
        return totalPrice;
    }



    @Override
    public Order checkout() {
        return new Order(customer, products, getTotalPrice(), getLoyaltyPointsEarned());
    }


    /*
        Checkout: Calculates total price and total loyalty points earned by the customer.
        Products with product code starting with DIS_10 have a 10% discount applied.
        Products with product code starting with DIS_15 have a 15% discount applied.

        Loyalty points are earned more when the product is not under any offer.
            Customer earns 1 point on every $5 purchase.
            Customer earns 1 point on every $10 spent on a product with 10% discount.
            Customer earns 1 point on every $15 spent on a product with 15% discount.
    */
/*
    public void checkout() {
        double totalPrice = 0;

        int loyaltyPointsEarned = 0;
        for (Product product : products) {
            double discount = 0;
            if (product.getProductCode().startsWith("DIS_10")) {
                discount = (product.getPrice() * 0.1);
                loyaltyPointsEarned += (product.getPrice() / 10);
            } else if (product.getProductCode().startsWith("DIS_15")) {
                discount = (product.getPrice() * 0.15);
                loyaltyPointsEarned += (product.getPrice() / 15);
            } else {
                loyaltyPointsEarned += (product.getPrice() / 5);
            }

            totalPrice += product.getPrice() - discount;
        }

        orderService.showConfirmation(customer, products, totalPrice, loyaltyPointsEarned);
    }
    */


}
