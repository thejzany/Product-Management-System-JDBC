package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class ProductUpdateController {
	public static void main(String[] args) {

		Product product = new Product();
		product.setPid(121);
		product.setBrand("BMW");
		product.setPrice(6500000.5);

		ProductService productService = new ProductService();
		Product p = productService.updateProduct(product);

		if (p != null) {
			System.out.println(p.getPid() + " Updated Successfully");
		}

	}
}
