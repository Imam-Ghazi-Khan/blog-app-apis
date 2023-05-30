package com.igk.blog.services;

import java.util.List;

import com.igk.blog.payloads.CategoryDto;

public interface CategoryService {
    CategoryDto createCategory(CategoryDto Category);
    CategoryDto updateCategory(CategoryDto Category,Integer CategoryId);
    CategoryDto getCategoryById(Integer CategoryId);
    List<CategoryDto> getAllCategorys();
    void deleteCategory(Integer CategoryId);
}
