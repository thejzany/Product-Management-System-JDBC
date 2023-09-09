package com.jsp.service;

import com.jsp.dao.CustomerDao;
import com.jsp.dto.Customer;

public class CustomerService {

	CustomerDao customerDao = new CustomerDao();

	public Customer updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}

	public Customer getAllCustomer(Customer customer) {
		return customerDao.getAllCustomer(customer);
	}

	public Customer getCustomerById(Customer customer) {
		return customerDao.getCustomerById(customer);
	}

	public boolean deleteCustomerById(int cid) {
		return customerDao.deleteCustomerById(cid);
	}

	public Customer saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}

}
