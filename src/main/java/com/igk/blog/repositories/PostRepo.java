package com.igk.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igk.blog.entities.Category;
import com.igk.blog.entities.Post;
import com.igk.blog.entities.User;

public interface PostRepo extends JpaRepository<Post,Integer>{
    
    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);

}
