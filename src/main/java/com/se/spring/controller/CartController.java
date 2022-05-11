package com.se.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.se.spring.entity.Cart;
import com.se.spring.entity.Customer;
import com.se.spring.service.CartService;
import com.se.spring.service.CustomerService;



@Controller
public class CartController {
	@Autowired
	private CustomerService customerService;

	@Autowired
	private CartService cartService;

	@GetMapping("/cart/getCartById")
	public ModelAndView getCartId() {
		Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
		String username = loggedInUser.getName();
		Customer customer = customerService.getCustomerByUserName(username);

		return new ModelAndView("cart", "cartItems", customer.getCart().getCartItem());

	}

	@GetMapping("/cart/getCart/{cartId}")
	@ResponseBody
	public Cart getCartItems(@PathVariable(value = "cartId") int cartId) {
		return cartService.getCartById(cartId);
	}
}