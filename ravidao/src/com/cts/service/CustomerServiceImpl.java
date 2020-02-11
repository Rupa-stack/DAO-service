package com.cts.service;

import com.cts.dao.CustomerDAO;
import com.cts.dao.CustomerDAOMySQLImpl;
import com.cts.model.Customer;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public int insertCustomer(Customer c) {
		CustomerDAO customerDaoMySQL=new CustomerDAOMySQLImpl();
		customerDaoMySQL.insertCustomer(c);
		return 1;
	}

}
