package com.urbanmart1.service;

import java.util.List;

import com.urbanmart1.entity.Product;

public interface ProductService {

    // Add a new product
    Product saveProduct(Product product);

    // Get all products
    List<Product> getAllProducts();

    // Get product by ID
    Product getProductById(Long id);

    // Update product
    Product updateProduct(Long id, Product product);

    // Delete product
    void deleteProduct(Long id);
}