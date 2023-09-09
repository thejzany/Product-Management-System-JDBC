package com.jsp.controller;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class CustomerGetController {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setCid(1);

		CustomerService customerService = new CustomerService();
		customerService.getCustomerById(customer);

	}
}
