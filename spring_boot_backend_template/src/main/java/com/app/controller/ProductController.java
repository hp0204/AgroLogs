package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Products;
import com.app.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Products> getAllProducts(){
		System.out.println("in list get all product details");
		return productService.getAllProducts();
	}
	
	//Add new products
	
	@PostMapping("/addNewProduct")
	public Products addNewProducts(@RequestBody Products newProducts) {
		System.out.println(newProducts);
		return productService.addProduct(newProducts);	
	}
	
	@PutMapping
	public Products updateProducts(@RequestBody Products products) {
	    return productService.updateProductDetails(products);	
	}
	
	@DeleteMapping("/{productId}")
	public String deleteProductDetails(@PathVariable Long productId) {
		return productService.deleteProductDetails(productId);
	}
	
	@GetMapping("/{productId}")
	public Products getProductDetails( @PathVariable Long productId) {
		return productService.getProductDetails(productId);
	}
}
