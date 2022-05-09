package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.se.spring.entity.Product;
@Service
public class ProductServiceImpl implements ProductService{

	public List<Product> getProducts() {
		List<Product> lst = new ArrayList<Product>();
		lst.add(new Product(1,"loa kẹo kéo",(double)5000000,"loa hát kẹo kéo","path"));
		lst.add(new Product(1,"loa kẹo chỉ",(double)5000000,"loa hát kẹo kéo","path"));
		lst.add(new Product(1,"loa kẹo dừa",(double)5000000,"loa hát kẹo kéo","path"));
		return lst;

	}

	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public Product getProduct(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteProduct(int theId) {
		// TODO Auto-generated method stub
		
	}

}
