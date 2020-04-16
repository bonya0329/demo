package com.project.demo.services;

import com.project.demo.entities.Category;

import java.util.List;

public interface CategoryService {

    public String addCategory(String name);
    public List<Category> allCategories();
    public Category categoryById(Long id);
    public String editCategoryName(Long id, String name);
    public String deleteCategory(Long id);
    public String restoreCategory(Long id);
}
