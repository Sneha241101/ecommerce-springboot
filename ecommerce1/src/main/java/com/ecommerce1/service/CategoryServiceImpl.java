package com.ecommerce1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce1.dto.Category;
import com.ecommerce1.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	private final CategoryRepository repository;
	
	
	
	public CategoryServiceImpl(CategoryRepository repository) {
		this.repository=repository;
	}

	@Override
	public Category saveCategory(Category category) {
		return repository.save(category);
	}

	@Override
	public List<Category> getAllCategories() {
		return repository.findAll();
	}

	@Override
	public Category getCategoryById(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Category not found"));
	}

	@Override
	public void deleteCategory(Long id) {
           repository.deleteById(id);		
	}



}
