package com.igk.blog.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igk.blog.entities.Comment;
import com.igk.blog.entities.Post;
import com.igk.blog.exceptions.ResourceNotFoundException;
import com.igk.blog.payloads.CommentDto;
import com.igk.blog.repositories.CommentRepo;
import com.igk.blog.repositories.PostRepo;
import com.igk.blog.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private PostRepo PostRepo;

    @Autowired
    private CommentRepo commentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CommentDto createComment(CommentDto commentDto, Integer postId) {
        Post post = this.PostRepo.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post", "post id", postId));

        Comment comment = this.modelMapper.map(commentDto, Comment.class);

        comment.setPost(post);

        Comment savedComment = this.commentRepo.save(comment);

        return this.modelMapper.map(savedComment, CommentDto.class);
    }

    @Override
    public void deleteComment(Integer commentId) {
        
        Comment com = this.commentRepo.findById(commentId).orElseThrow(()->new ResourceNotFoundException("Comment", "commentId", commentId));
        this.commentRepo.delete(com);

    }
    
}
