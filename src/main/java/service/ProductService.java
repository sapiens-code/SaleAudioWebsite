package service;

import java.util.List;

import com.se.spring.entity.Product;

public interface ProductService {
	public List<Product> getProducts();
	public void saveProduct(Product product);
	public Product getProduct(int theId);
	public void deleteProduct(int theId);
}
