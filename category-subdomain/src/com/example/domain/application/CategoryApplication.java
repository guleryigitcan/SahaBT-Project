package com.example.domain.application;

import java.util.Optional;

import com.example.domain.Category;
import com.example.domain.CategoryID;

public interface CategoryApplication {

	Category addCategory(Category category);

	Category deleteCategory(CategoryID categoryID);

	Optional<Category> findCategoryByCategoryID(CategoryID categoryID);
}