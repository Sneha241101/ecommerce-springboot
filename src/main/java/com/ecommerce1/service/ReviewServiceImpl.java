package com.ecommerce1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce1.dto.Review;
import com.ecommerce1.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {
	
	private final ReviewRepository repository;

	public ReviewServiceImpl(ReviewRepository repository) {
		this.repository = repository;
	}

	@Override
	public Review add(Review reviews) {
		return repository.save(reviews);
	}

	@Override
	public List<Review> getProduct(Long productId) {
		return repository.findByProductId(productId);
	}

	@Override
	public void delete(Long id) {
        repository.deleteById(id);		
	}

	@Override
	public Double average(Long productId) {
		return repository.getAverageRating(productId);
	}

}
