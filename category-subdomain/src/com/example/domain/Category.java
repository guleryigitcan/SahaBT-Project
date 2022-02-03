package com.example.domain;

import java.util.Objects;

public class Category {

	private CategoryID categoryID;
    private CategoryName categoryName;
    private SubCategory subCategory;

    public Category(CategoryID categoryID, CategoryName categoryName, SubCategory subCategory) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.subCategory = subCategory;
    }

    public CategoryID getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(CategoryID categoryID) {
        this.categoryID = categoryID;
    }

    public CategoryName getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(CategoryName categoryName) {
        this.categoryName = categoryName;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return categoryID.equals(category.categoryID) && Objects.equals(categoryName, category.categoryName) && Objects.equals(subCategory, category.subCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryID, categoryName, subCategory);
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryID=" + categoryID +
                ", categoryName=" + categoryName +
                ", subCategory=" + subCategory +
                '}';
    }
}
