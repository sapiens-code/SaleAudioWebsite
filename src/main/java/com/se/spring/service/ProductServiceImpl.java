package com.se.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.spring.dao.ProductDao;
import com.se.spring.entity.Product;



@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    public List<Product> getAllProducts() {
   	 return productDao.getAllProducts();
    }

    public Product getProductById(int productId) {
   	 return productDao.getProductById(productId);
    }
    
    public void deleteProduct(int productId) {
   	 productDao.deleteProduct(productId);
    }
    
    public void addProduct(Product product){
   	 productDao.addProduct(product);
    }
    
    public void updateProduct(Product product){
   	 productDao.updateProduct(product);
    }
}

