package com.canddella.service;

import com.canddella.dao.CustomerDAOImpl;
import com.canddella.entity.Customer;

public class CustomerServiceImpl implements CustomerService {
	CustomerDAOImpl customerDAO = new CustomerDAOImpl();

	@Override
	public Customer searchCustomer(String customerCode) {
		
		return customerDAO.searchCustomer(customerCode);
	}
	

}
