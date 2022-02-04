package com.example.domain.application.business;

import java.util.Optional;

import com.example.domain.Category;
import com.example.domain.CategoryID;
import com.example.domain.application.CategoryApplication;
import com.example.domain.application.business.events.CategoryAddedEvent;
import com.example.domain.application.business.events.CategoryDeletedEvent;
import com.example.domain.application.business.exception.CategoryNotFoundException;
import com.example.domain.application.business.exception.ExistingCategoryException;
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
	public Category addCategory(Category category) {
		var number = category.getCategoryID();
		if (categoryRepository.existByCategoryID(number))
			throw new ExistingCategoryException("Category already exist", number.getCategoryID());
		Category addedCategory = categoryRepository.add(category);
		var businessEvent = new CategoryAddedEvent(addedCategory);
		eventPublisher.publishEvent(businessEvent);
		return addedCategory;
	}

	@Override
	public Category deleteCategory(CategoryID categoryID) {
		Optional<Category> deletedCategory = categoryRepository.delete(categoryID);
		var category = deletedCategory.orElseThrow(
				() -> new CategoryNotFoundException("Category does not exist", categoryID.getCategoryID()));
		eventPublisher.publishEvent(new CategoryDeletedEvent(category));
		return category;
	}

	@Override
	public Optional<Category> findCategoryByCategoryID(CategoryID categoryID) {
		return categoryRepository.findCategoryByCategoryID(categoryID);
	}

}
