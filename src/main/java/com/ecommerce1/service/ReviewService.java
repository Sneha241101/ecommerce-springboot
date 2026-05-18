package com.ecommerce1.service;

import java.util.List;

import com.ecommerce1.dto.Review;

public interface ReviewService {
	
	Review add(Review reviews);
	
	List<Review> getProduct(Long productId);
	
	void delete(Long id);
	
	Double average(Long productId);

}
