package com.company;

public class ShopManager {
    public void addToProduct(Products products){
        System.out.println(products.productName+" adlı ürün eklendi");
    }
    public void createCustomer(Customer customer){
        System.out.println(customer.customerName+" adlı müşteri eklendi");
    }
}
