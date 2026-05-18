package com.ecommerce1.service;

import java.util.List;

import com.ecommerce1.dto.Orders;

public interface OrderService {
	
	Orders placeOrder(Orders order);
	
	List<Orders> getAllOrders();
	
	List<Orders> getOrdersByUser(Long userId);
	
	Orders updateStatus(Long id, String status);

}
