package com.jsp.service;

import com.jsp.dao.ProductDao;
import com.jsp.dto.Product;

public class ProductService {

	ProductDao productDao = new ProductDao();

	public Product updateProduct(Product product) {
		return productDao.updateProduct(product);
	}

	public Product getAllProduct(Product product) {
		return productDao.getAllProduct(product);
	}

	public Product getProductById(Product product) {
		return productDao.getProductById(product);
	}

	public boolean deleteProductById(int pid) {
		return productDao.deleteProductById(pid);
	}

	public Product saveProduct(Product product) {
		return productDao.saveProduct(product);
	}

}
