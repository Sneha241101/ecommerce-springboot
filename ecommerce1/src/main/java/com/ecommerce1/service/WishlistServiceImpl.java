package com.ecommerce1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce1.dto.Wishlist;
import com.ecommerce1.repository.ProductRepository;
import com.ecommerce1.repository.UserRepository;
import com.ecommerce1.repository.WishlistRepository;

@Service
public class WishlistServiceImpl implements WishlistService {
	
	private final WishlistRepository repository;
	private final UserRepository userRepository;
	private final ProductRepository productRepository;
	
	
	public WishlistServiceImpl(WishlistRepository repository, UserRepository userRepository,
			ProductRepository productRepository) {
		
		this.repository = repository;
		this.userRepository = userRepository;
		this.productRepository = productRepository;
	}
	
	
	public Wishlist add(Wishlist wishlist) {
         Long userId=wishlist.getUser().getId();
         Long productId=wishlist.getProduct().getId();
         
         if(!userRepository.existsById(userId)) {
        	 throw new RuntimeException("User not found");
         }
         
         if(!productRepository.existsById(productId)) {
        	 throw new RuntimeException("Product not found");

         }
 		return repository.save(wishlist);
	}
	
	
	@Override
	public List<Wishlist> getUser(Long userId) {
		
		return repository.findByUserId(userId);
	}
	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	} 
	
	
	

}
