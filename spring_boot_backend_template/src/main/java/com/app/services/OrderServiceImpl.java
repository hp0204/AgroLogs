package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Dao.OrderDao;
import com.app.custom_exception.ResourceNotFoundException;
import com.app.entities.Orders;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;
	
	@Override
	public List<Orders> getAllOrders() {
		return orderDao.findAll();
	}

	@Override
	public Orders addOrders(Orders newOrder) {
		return orderDao.save(newOrder);
	}

	@Override
	public String deleteProductDetails(Long orderId) {
		if(orderDao.existsById(orderId)) {
			orderDao.deleteById(orderId);
			return "deleted order details ";
		}
		return "Invalid orderId...";
	}

	@Override
	public Orders getOrderDetails(Long orderId) {
		return orderDao.findById(orderId).orElseThrow(()->
		new ResourceNotFoundException("Invalid order id.."));
	}

	@Override
	public Orders updateOrderDetails(Orders orders) {
		return orderDao.save(orders);
	}

}
