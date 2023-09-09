package com.jsp.controller;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class CustomerUpdateController {
	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setCid(1);
		customer.setCname("Jay");
		customer.setCno("1234567891");

		CustomerService customerService = new CustomerService();
		Customer c = customerService.updateCustomer(customer);

		if (c != null) {
			System.out.println(c.getCid() + " Updated Successfully");
		}

	}
}
