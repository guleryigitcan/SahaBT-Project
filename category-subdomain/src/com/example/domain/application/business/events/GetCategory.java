package com.example.domain.application.business.events;

import com.example.domain.Category;

public class GetCategory {

	 private final Category categoryID;

	    public GetCategory(Category categoryID) {
	        this.categoryID = categoryID;
	    }

	    public Category getCategoryID() {
	        return categoryID;
	    }
}
