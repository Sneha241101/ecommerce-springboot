package com.ecommerce1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce1.dto.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Long>{
	
	List<Wishlist> findByUserId(Long userId);
}
