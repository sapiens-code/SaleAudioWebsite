package com.se.spring.service;

import java.util.List;

import com.se.spring.entity.Product;


public interface ProductService {
    
    List<Product> getAllProducts();
    
    Product getProductById(int productId);

    void deleteProduct(int productId);
    
    void addProduct(Product product);
    
    void updateProduct(Product product);
}

