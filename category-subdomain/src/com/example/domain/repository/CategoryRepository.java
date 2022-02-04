package com.example.domain.repository;

import java.util.Optional;

import com.example.domain.Category;
import com.example.domain.CategoryID;

public interface CategoryRepository {

	boolean existByCategoryID(CategoryID categoryID);

	Category add(Category category);

	Optional<Category> delete(CategoryID categoryID);

	Optional<Category> findCategoryByCategoryID(CategoryID categoryID);
}
