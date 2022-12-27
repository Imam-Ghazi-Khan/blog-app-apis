package com.igk.blog.services;

import java.util.List;

import com.igk.blog.entities.Post;
import com.igk.blog.payloads.PostDto;
import com.igk.blog.payloads.PostResponse;

public interface PostService {
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
    PostDto updatePost(PostDto post,Integer postId);
    PostDto getPostById(Integer postId);
    PostResponse getAllPosts(Integer pageNumber,Integer pageSize,String sortBy, String sortDir);
    void deletePost(Integer postId);
    List<PostDto> getPostsByCategory(Integer categoryId);
    List<PostDto> getPostsByUser(Integer userId);
    List<PostDto> searchPosts(String keyword);
}
