package com.se.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.se.spring.entity.Product;

import service.ProductService;
import service.ProductServiceImpl;

@Controller
@RequestMapping("/product")
public class ProductController {

	private ProductService productService = new ProductServiceImpl();

	@GetMapping("/list")
	public String showHome(Model theModel) {
		List<Product> products = productService.getProducts();
		theModel.addAttribute("products", products);
		return "products";
	}

	@RequestMapping("/getAllProducts")
	public String getAllProducts(Model theModel) {
		List<Product> products = productService.getProducts();
		theModel.addAttribute("products", products);
		return "products";
	}

}
