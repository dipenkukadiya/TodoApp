package com.example.TodoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TodoApp.entity.Comment;
import com.example.TodoApp.service.CommentService;


@RestController
@RequestMapping("/comments/")
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping
    public List<Comment> getComment() {
        return commentService.getComment();
    }

    @GetMapping("/{commentId}")
    public Comment getCommentById(@PathVariable Long commentId) {
        return commentService.getCommentById(commentId);
    }

    @PostMapping
    public void addComment(@RequestBody Comment comment) {
        commentService.addComment(comment);

    }

    @DeleteMapping("/{commentId}")
    public void removeComment(@PathVariable Long commentId) {
        commentService.removeComment(commentId);
    }

    @PutMapping("/{commentId}")
    public void updateComment(@RequestBody Comment comment, @PathVariable Long commentId) {
        commentService.updateComment(comment, commentId);
    }
}
