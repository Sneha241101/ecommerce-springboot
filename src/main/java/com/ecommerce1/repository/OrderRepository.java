package com.ecommerce1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce1.dto.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {

	List<Orders> findByUserId(Long userId);
}
