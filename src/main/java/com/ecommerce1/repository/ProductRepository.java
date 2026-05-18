package com.ecommerce1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce1.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	List<Product> findByName(String name);
	
	List<Product> findByCategoryId(long categoryId);

}
