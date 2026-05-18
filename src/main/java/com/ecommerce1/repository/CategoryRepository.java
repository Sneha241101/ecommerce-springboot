package com.ecommerce1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce1.dto.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	Optional<Category> findByName(String name);
	
	void deleteById(Long id);
	
	Optional<Category> findById(Long id);
}
