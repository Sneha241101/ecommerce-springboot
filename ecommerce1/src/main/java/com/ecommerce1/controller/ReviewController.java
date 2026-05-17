package com.ecommerce1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce1.dto.Review;
import com.ecommerce1.service.ReviewService;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
	
	private final ReviewService service;

	public ReviewController(ReviewService service) {
		this.service = service;
	}
	
	@PostMapping
	public Review add(@RequestBody Review reviews) {
		return service.add(reviews);
	}
	
	@GetMapping("/{productId}")
	public List<Review> get(@PathVariable Long productId){
		return service.getProduct(productId);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		service.delete(id);
		return "Review deleted Successfully";
	}
	
	@GetMapping("/average/{productId}")
	public Double average(@PathVariable Long productId) {
		return service.average(productId);
	}

}























