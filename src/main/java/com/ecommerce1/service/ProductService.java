package com.ecommerce1.service;

import java.util.List;

import com.ecommerce1.dto.Product;

public interface ProductService {
	
  Product saveProduct(Product product);
	
	List<Product> getAllProducts();
	
	Product getProductById(Long id);
	
	Product updateProduct(Long id, Product product);
	
	List<Product> getByCategory(Long categoryId);
	
	List<Product> searchByName(String name);
	
	void deleteProduct(Long id);

}
