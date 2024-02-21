package com.app.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Dao.ProductDao;
import com.app.custom_exception.ResourceNotFoundException;
import com.app.entities.Products;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Products> getAllProducts() {
         
		return productDao.findAll();
	}

	@Override
	public Products addProduct(Products newProduct) {
		return productDao.save(newProduct);
	}

	@Override
	public String deleteProductDetails(Long productId) {
		if(productDao.existsById(productId)) {
			productDao.deleteById(productId);
			return "deleted product details ";
		}
		return "Invalid productId...";
	}

	@Override
	public Products getProductDetails(Long productId) {
		return productDao.findById(productId).orElseThrow(()->
		new ResourceNotFoundException("Invalid product id.."));
	}

	@Override
	public Products updateProductDetails(Products products) {
		return productDao.save(products);
	}

}
