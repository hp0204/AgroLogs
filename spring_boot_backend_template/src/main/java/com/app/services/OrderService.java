package com.app.services;

import java.util.List;

import com.app.entities.Orders;


public interface OrderService {
	
	List<Orders> getAllOrders();
	Orders addOrders(Orders newOrder);
	String deleteProductDetails(Long orderId);
	Orders getOrderDetails(Long orderId);
	Orders updateOrderDetails(Orders orders);

}
