package com.ecommerce1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce1.dto.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

	List<Cart> findByUserId(Long userId);
	
	void deleteByUserId(long userId);
}
