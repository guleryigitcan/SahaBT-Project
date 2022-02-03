package com.example.domain.application.business;

import com.example.domain.Category;
import com.example.domain.application.CategoryApplication;
import com.example.domain.infrastructure.EventPublisher;
import com.example.domain.repository.CategoryRepository;

public class StandardCategoryApplication implements CategoryApplication {

	private CategoryRepository categoryRepository;
	private EventPublisher eventPublisher;

	public StandardCategoryApplication(CategoryRepository categoryRepository, EventPublisher eventPublisher) {
	        this.categoryRepository = categoryRepository;
	        this.eventPublisher = eventPublisher;
	    }

	@Override
	public Category getCategory(Category categoryID) {
		return categoryRepository.getCategory(categoryID);
	}
}
