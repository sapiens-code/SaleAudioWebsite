package com.se.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.se.spring.entity.Cart;
import com.se.spring.entity.CartItem;
import com.se.spring.entity.Customer;
import com.se.spring.entity.Product;
import com.se.spring.service.CartItemService;
import com.se.spring.service.CartService;
import com.se.spring.service.CustomerService;
import com.se.spring.service.ProductService;



@Controller
public class CartItemController {
    @Autowired
    private CartService cartService;

    @Autowired
    private CartItemService cartItemService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/cart/add/{productId}", method = RequestMethod.GET)
    public String addCartItem(@PathVariable(value = "productId") int productId) {
   	 Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
   	 String username = loggedInUser.getName();
   	 Customer customer = customerService.getCustomerByUserName(username);

   	 Cart cart = customer.getCart();
   	 List<CartItem> cartItems = cart.getCartItem();
   	 Product product = productService.getProductById(productId);
   	 
   	 for (int i = 0; i < cartItems.size(); i++) {
   		 CartItem cartItem = cartItems.get(i);
   		 if (product.getId() == (cartItem.getProduct().getId())) {
   			 cartItem.setQuantity(cartItem.getQuantity() + 1);
   			 cartItem.setPrice(cartItem.getQuantity() * cartItem.getProduct().getProductPrice());
   			 cartItemService.addCartItem(cartItem);
   			return "redirect:/getAllProducts";
   		 }
   	 }
   	 
   	 CartItem cartItem = new CartItem();
   	 cartItem.setQuantity(1);
   	 cartItem.setProduct(product);
   	 cartItem.setPrice(product.getProductPrice());
   	 cartItem.setCart(cart);
   	 cartItemService.addCartItem(cartItem);
   	 return "redirect:/getAllProducts";
    }

    @RequestMapping(value = "/cart/removeCartItem/{cartItemId}", method = RequestMethod.GET)
    public String removeCartItem(@PathVariable(value = "cartItemId") int cartItemId) {
   	 	cartItemService.removeCartItem(cartItemId);
   	 return "redirect:/cart/getCartById";
    }

    @RequestMapping("/cart/removeAllItems/{cartId}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void removeAllCartItems(@PathVariable(value = "cartId") int cartId) {
   	 Cart cart = cartService.getCartById(cartId);
   	 cartItemService.removeAllCartItems(cart);
    }
}
