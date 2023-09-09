package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class ProductGetController {
	
	public static void main(String[] args) {
		
		Product product =new Product();
		product.setPid(121);
		
		ProductService productService=new ProductService();
		productService.getProductById(product);

	}
}

