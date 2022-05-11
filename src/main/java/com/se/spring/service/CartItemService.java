package com.se.spring.service;

import com.se.spring.entity.Cart;
import com.se.spring.entity.CartItem;

public interface CartItemService {
    void addCartItem(CartItem cartItem);

    void removeCartItem(int CartItemId);

    void removeAllCartItems(Cart cart);
}

