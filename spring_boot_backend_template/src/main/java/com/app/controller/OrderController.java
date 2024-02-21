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

import com.app.entities.Orders;
import com.app.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	
	@GetMapping
	public List<Orders> getAllOrders(){
		System.out.println("in list get all order details");
		return orderService.getAllOrders();
	}
	
	//Add new orders
	
	@PostMapping("/addNewOrders")
	public Orders addNewOrders(@RequestBody Orders newOrders) {
		System.out.println(newOrders);
		return orderService.addOrders(newOrders);	
	}
	
	@PutMapping
	public Orders updateOrders(@RequestBody Orders orders) {
	    return orderService.updateOrderDetails(orders);	
	}
	
	@DeleteMapping("/{orderId}")
	public String deleteOrderDetails(@PathVariable Long orderId) {
		return orderService.deleteProductDetails(orderId);
	}
	
	@GetMapping("/{orderId}")
	public Orders getOrderDetails( @PathVariable Long orderId) {
		return orderService.getOrderDetails(orderId);
	}	

}
