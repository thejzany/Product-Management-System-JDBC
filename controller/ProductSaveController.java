package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class ProductSaveController {
	public static void main(String[] args) {
		Product product = new Product();
		product.setPid(124);
		product.setBrand("KIA");
		product.setPrice(3500000.5);

		ProductService productService = new ProductService();
		Product p = productService.saveProduct(product);

		if (p != null) {
			System.out.println(p.getPid() + " Saved Successfully");
		}
	}
}
