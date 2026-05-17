package com.ecommerce1.service;

import java.util.List;

import com.ecommerce1.dto.Wishlist;

public interface WishlistService {

	Wishlist add(Wishlist wishlist);

	List<Wishlist> getUser(Long userId);
	
	void delete(Long id);

}
