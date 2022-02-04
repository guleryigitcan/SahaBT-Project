package com.example.domain.application.business.events;

import com.example.domain.Category;

public class CategoryDeletedEvent extends CategoryEvent {

	private final Category category;

	public CategoryDeletedEvent(Category category) {

		this.category = category;
	}

	public Category getCategory() {
		return category;
	}

}
