package com.igk.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igk.blog.payloads.ApiResponse;
import com.igk.blog.payloads.CommentDto;
import com.igk.blog.services.CommentService;

@RestController
@RequestMapping("/api/")
public class CommentController {
    
    @Autowired
    private CommentService commentService;

    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto comment, @PathVariable Integer postId){
        CommentDto createComment = this.commentService.createComment(comment, postId);
        return new ResponseEntity<CommentDto>(createComment,HttpStatus.CREATED);
    }

    @PostMapping("/comments/{commentId}")
    public ResponseEntity<ApiResponse> deleteComment(@PathVariable Integer commentId){
        this.commentService.deleteComment(commentId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Comment deleted sucessfully",true),HttpStatus.OK);
    }

}
