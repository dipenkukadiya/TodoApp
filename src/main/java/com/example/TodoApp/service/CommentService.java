package com.example.TodoApp.service;

import java.util.List;

import com.example.TodoApp.entity.Comment;



public interface CommentService {
    
    List<Comment> getComment();
    Comment getCommentById(Long commentId);
    void addComment(Comment comment);
    void updateComment(Comment comment,Long commentId);
    void removeComment(Long commentId);
    
}
