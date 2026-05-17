package com.ecommerce1.service;

import java.util.List;

import com.ecommerce1.dto.Category;

public interface CategoryService {
	
	Category saveCategory(Category category);
	
	List<Category> getAllCategories();
	
	Category getCategoryById(Long id);
	
	void deleteCategory(Long id);
		
	}


