package com.se.spring.dao;

import com.se.spring.entity.Customer;

public interface CustomerDao {
	void addCustomer(Customer customer);

    Customer getCustomerByUserName(String userName);

}
