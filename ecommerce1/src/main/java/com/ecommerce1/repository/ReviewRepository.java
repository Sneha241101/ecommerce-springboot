package com.ecommerce1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce1.dto.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{

	List<Review> findByProductId(Long productId);
	
	@Query("select avg(r.rating) from Review r where r.product.id = ?1")
	Double getAverageRating(Long productId);
}
