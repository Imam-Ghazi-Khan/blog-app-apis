package com.igk.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igk.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
	   
}
