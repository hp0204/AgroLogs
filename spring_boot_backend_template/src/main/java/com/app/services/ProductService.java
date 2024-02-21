package com.app.services;

import java.util.List;

import com.app.entities.Products;


public interface ProductService {
	
	List<Products> getAllProducts();
	Products addProduct(Products newProduct);
	String deleteProductDetails(Long productId);
	Products getProductDetails(Long productId);
	Products updateProductDetails(Products products);

}
