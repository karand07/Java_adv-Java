package com.module;

import java.util.ArrayList;
import java.util.List;

public class ProductUtil {

    private List<Product> products;

    public ProductUtil() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getAllProducts() {
        return products;
    }
}