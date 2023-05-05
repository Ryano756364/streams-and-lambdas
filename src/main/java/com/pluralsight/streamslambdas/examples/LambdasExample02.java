/*
 * This code is part of the course "Working with Streams and Lambda Expressions in Java (Java SE 11 Developer Certification 1Z0-819)" for Pluralsight.
 *
 * Copyright (C) 2021 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.streamslambdas.examples;

import com.pluralsight.streamslambdas.ExampleData;
import com.pluralsight.streamslambdas.Product;

import java.math.BigDecimal;
import java.util.List;

public class LambdasExample02 {

    //Setup of a interface for other arbitrary requirements.
    interface ProductFilter {
        boolean accept(Product product);
    }

    // Print the products that cost less than the price limit.
    static void printProducts(List<Product> products, ProductFilter filter) {
        //We could run a loop to get this done.
        for (Product product : products) {
            if (filter.accept(product)) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        BigDecimal priceLimit = new BigDecimal("5.00");

        printProducts(products, priceLimit);
    }
}
