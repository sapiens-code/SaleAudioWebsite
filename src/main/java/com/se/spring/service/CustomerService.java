package com.se.spring.service;

import com.se.spring.entity.Customer;

public interface CustomerService {
	void addCustomer(Customer customer);

	Customer getCustomerByUserName(String userName);
}
