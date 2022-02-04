package com.example.domain.application.business.events;

import com.example.domain.Category;

public class CategoryAddedEvent extends CategoryEvent {

	private final Category category;

	public CategoryAddedEvent(Category category) {
		this.category = category;
	}

	public Category getCategory() {
		return category;
	}

}
