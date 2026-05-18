package com.ecommerce1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce1.dto.Orders;
import com.ecommerce1.dto.Product;
import com.ecommerce1.repository.OrderRepository;
import com.ecommerce1.repository.ProductRepository;

@Service
public class OrderServiceImpl implements OrderService {

	private final OrderRepository orderRepository;
	private final ProductRepository productRepository;

	public OrderServiceImpl(OrderRepository orderRepository, ProductRepository productRepository) {

		this.orderRepository = orderRepository;
		this.productRepository = productRepository;
	}

	public Orders placeOrder(Orders order) {
		Product product = productRepository.findById(order.getProduct().getId())
				.orElseThrow(() -> new RuntimeException("Product not found"));

		order.setTotalPrice(product.getPrice() * order.getQuantity());
		order.setStatus("Placed");

		return orderRepository.save(order);
	}

	@Override
	public List<Orders> getAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	public List<Orders> getOrdersByUser(Long userId) {
		return orderRepository.findByUserId(userId);
	}

	@Override
	public Orders updateStatus(Long id, String status) {
         Orders order=orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not Found"));
         
         order.setStatus(status);
		return orderRepository.save(order);
	}

}
