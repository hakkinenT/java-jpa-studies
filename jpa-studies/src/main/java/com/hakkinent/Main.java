package com.hakkinent;

import com.hakkinent.entities.Product;
import com.hakkinent.repositories.ProductRepository;

public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();

        Product product = new Product();
        product.setName("Smartphone");
        product.setPrice(2000.00);

        productRepository.save(product);
    }
}