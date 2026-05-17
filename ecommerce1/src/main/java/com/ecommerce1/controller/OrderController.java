package com.ecommerce1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce1.dto.Orders;
import com.ecommerce1.service.OrderService;

@RestController
@RequestMapping("api/orders")
public class OrderController {
	
	private final OrderService service;

	public OrderController(OrderService service) {
		this.service = service;
	}
	
	@PostMapping
	public Orders place(@RequestBody Orders order) {
		return service.placeOrder(order);
	}
	
	@GetMapping
	public List<Orders> all(){
		return service.getAllOrders();
	}
	
	@GetMapping("/user/{userId}")
	public List<Orders> byUser(@PathVariable Long userId){
		return service.getOrdersByUser(userId);
	}
	
	public Orders update(@PathVariable Long id, @RequestParam String status) {
		return service.updateStatus(id, status);
	}
	

}
