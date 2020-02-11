package com.cts.client;

import com.cts.dao.CustomerDAO;
import com.cts.dao.CustomerDAOMySQLImpl;
import com.cts.model.Customer;
import com.cts.service.CustomerService;
import com.cts.service.CustomerServiceImpl;

public class CustomerClient {

	public static void main(String[] args) {
		CustomerService customerService=new CustomerServiceImpl();
		Customer customer=new Customer();
		customer.setCid(11);
		customer.setCname("rupa");
		int k=customerService.insertCustomer(customer);
		if(k==1)
		{
			System.out.println("success");
		}
		else
			System.out.println("not successful");

	}

}
