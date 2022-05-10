package com.se.spring.dao;

import java.util.List;

import com.se.spring.entity.Product;



public interface ProductDao {

	Product getProductById(int productId);

	void deleteProduct(int productId);

	void addProduct(Product product);

	void updateProduct(Product product);

	List<Product> getAllProducts();
}
