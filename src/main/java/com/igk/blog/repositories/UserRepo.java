package com.igk.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igk.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	  
}
