package com.ecommerce1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce1.dto.Product;
import com.ecommerce1.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	private final ProductRepository repository;

	public ProductServiceImpl(ProductRepository repository) {
		this.repository=repository;
		
	}

	@Override
	public Product saveProduct(Product product) {
		return repository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return repository.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found"));
	}

	@Override
	public void deleteProduct(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public Product updateProduct(Long id, Product product) {
		Product dbProduct = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found"));
		
		dbProduct.setName(product.getName());
		dbProduct.setDescription(product.getDescription());
		dbProduct.setPrice(product.getPrice());
		dbProduct.setStock(product.getStock());
		dbProduct.setImageUrl(product.getImageUrl());
		dbProduct.setCategory(product.getCategory());
		
		return repository.save(dbProduct);
	}

	@Override
	public List<Product> getByCategory(Long categoryId) {
		return repository.findByCategoryId(categoryId);
	}
	
	@Override
	public List<Product> searchByName(String name) {
		return repository.findByName(name);
	}
	
	

}
