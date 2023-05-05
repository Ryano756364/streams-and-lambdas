/*
 * This code is part of the course "Working with Streams and Lambda Expressions in Java (Java SE 11 Developer Certification 1Z0-819)" for Pluralsight.
 *
 * Copyright (C) 2021 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.streamslambdas.examples;

import com.pluralsight.streamslambdas.ExampleData;
import com.pluralsight.streamslambdas.Product;

import java.util.Comparator;
import java.util.List;

public class LambdasExample01 {

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        //(1) now we have the lambda expression
        products.sort((o1, o2) -> o1.getPrice().compareTo(o2.getPrice()));


        for (Product product : products) {
            System.out.println(product);
        }
    }
}
