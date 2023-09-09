package com.jsp.controller;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class CustomerSaveController {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCid(4);
		customer.setCname("Vijyeta");
		customer.setCno("1234567894");

		CustomerService customerService = new CustomerService();
		Customer c = customerService.saveCustomer(customer);

		if (c != null) {
			System.out.println(c.getCid() + " Saved Successfully");
		}
	}
}
