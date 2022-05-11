package com.se.spring.dao;

import java.io.IOException;

import com.se.spring.entity.Cart;

public interface CartDao {
	Cart getCartById(int cartId);

	Cart validate(int cartId) throws IOException;
}
