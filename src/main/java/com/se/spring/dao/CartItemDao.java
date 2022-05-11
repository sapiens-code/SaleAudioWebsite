package com.se.spring.dao;

import com.se.spring.entity.Cart;
import com.se.spring.entity.CartItem;

public interface CartItemDao {
    void addCartItem(CartItem cartItem);
    
    void removeCartItem(int CartItemId);
    
    void removeAllCartItems(Cart cart);
}

