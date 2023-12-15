package com.example.TodoApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TodoApp.entity.Comment;
import com.example.TodoApp.repository.CommentRepository;
import com.example.TodoApp.service.CommentService;
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> getComment() {
        return commentRepository.findAll();

    }

    @Override
    public Comment getCommentById(Long commentId) {
        return commentRepository.findById(commentId).get();

    }

    @Override
    public void addComment(Comment comment) {
        commentRepository.save(comment);

    }

    @Override
    public void updateComment(Comment comment, Long commentId) {
        commentRepository.save(comment);
    }

    @Override
    public void removeComment(Long commentId) {
        commentRepository.deleteById(commentId);
    }

}
